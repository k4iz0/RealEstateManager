package ltd.kaizo.realestatemanager.controller.ui.list

import android.content.res.Configuration
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import kotlinx.android.synthetic.main.list_fragment.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.adapter.ListAdapter
import ltd.kaizo.realestatemanager.controller.ui.base.BaseFragment
import ltd.kaizo.realestatemanager.model.Estate
import timber.log.Timber

class ListFragment : BaseFragment() {
    companion object {
        fun newInstance() = ListFragment()
    }

    private lateinit var listViewModel: ListViewModel
    private lateinit var adapter: ListAdapter
    private lateinit var estateList: MutableList<Estate>
    private lateinit var parentActivity: ListActivity
    private var search = false

    override val fragmentLayout: Int
        get() = R.layout.list_fragment

    override fun configureDesign() {}

    override fun updateDesign() {
        this.configureViewModel()
        this.configureRecycleView()
        this.configureObserver()
        this.configureSwipeRefreshLayout()
    }

    private fun configureObserver() {
        //ESTATE LIST
        listViewModel.estateList.observe(viewLifecycleOwner, Observer { list ->
            if (!search) updateList(list)
        })
    }


    private fun configureViewModel() {
        parentActivity = activity as ListActivity
        listViewModel = parentActivity.listViewModel
    }

    private fun configureRecycleView() {
        if (listViewModel.searchResultList.size > 0) {
            estateList = listViewModel.searchResultList
            search = true
        } else {
            estateList = mutableListOf()
        }

        adapter = ListAdapter(estateList) { estateItem -> onEstateItemClicked(estateItem) }
        list_fragment_recycle_view.layoutManager = LinearLayoutManager(context)
        list_fragment_recycle_view.adapter = adapter
    }

    private fun onEstateItemClicked(estate: Estate) {
        listViewModel.estateId.value = estate.id
        val detailFragment = DetailFragment.newInstance()
        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Timber.i("land mode")
            activity!!.supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container_detail, detailFragment)
                .commit()
        } else {
            Timber.i("portrait mode")
            activity!!.supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, detailFragment)
                .addToBackStack(null)
                .commit()
        }

    }
    private fun configureSwipeRefreshLayout() {
        swipe_refresh_layout.setColorSchemeColors(resources.getColor(R.color.colorPrimary))
        swipe_refresh_layout.setOnRefreshListener{
            search = false
            updateList(listViewModel.estateList.value!!)
        }
    }

    private fun updateList(list: List<Estate>) {
        swipe_refresh_layout.isRefreshing = false
        estateList.clear()
        estateList.addAll(list)
        adapter.notifyDataSetChanged()
    }

}
