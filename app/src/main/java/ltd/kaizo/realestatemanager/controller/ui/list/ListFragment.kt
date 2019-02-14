package ltd.kaizo.realestatemanager.controller.ui.list

import android.content.res.Configuration
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.list_activity.*
import kotlinx.android.synthetic.main.list_fragment.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.adapter.ListAdapter
import ltd.kaizo.realestatemanager.controller.ui.base.BaseFragment
import ltd.kaizo.realestatemanager.controller.ui.detail.DetailFragment
import ltd.kaizo.realestatemanager.injection.Injection
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.utils.ESTATE_ID
import timber.log.Timber

class ListFragment : BaseFragment() {
    companion object {
        fun newInstance() = ListFragment()
    }

    private lateinit var listViewModel: ListViewModel
    private lateinit var adapter: ListAdapter
    private lateinit var estateList: MutableList<Estate>

    override val fragmentLayout: Int
        get() = R.layout.list_fragment

    override fun configureDesign() {}

    override fun updateDesign() {
        val viewModelFactory = Injection.provideViewModelFactory(context!!)
        listViewModel = ViewModelProviders.of(this, viewModelFactory).get(ListViewModel::class.java)
        this.configureRecycleView()
        listViewModel.estateList.observe(viewLifecycleOwner, Observer { list ->
            updateList(list)
        })
    }


    private fun configureRecycleView() {
        estateList = mutableListOf()
        adapter = ListAdapter(estateList) { estateItem -> onEstateItemClicked(estateItem) }
        list_fragment_recycle_view.layoutManager = LinearLayoutManager(context)
        list_fragment_recycle_view.adapter = adapter
    }

    private fun onEstateItemClicked(estate: Estate) {
        Timber.i("you click on a ${estate.type}")
        val arg = Bundle()
        arg.putInt(ESTATE_ID, estate.id)
        val detailFragment = DetailFragment.newInstance()
        detailFragment.arguments = arg
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


    private fun updateList(list: List<Estate>) {
        estateList.clear()
        estateList.addAll(list)
        adapter.notifyDataSetChanged()
    }

}
