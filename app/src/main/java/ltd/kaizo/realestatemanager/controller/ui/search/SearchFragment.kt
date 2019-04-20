package ltd.kaizo.realestatemanager.controller.ui.search


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.fragment_search.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.controller.ui.base.BaseFragment
import ltd.kaizo.realestatemanager.databinding.FragmentSearchBinding
import ltd.kaizo.realestatemanager.utils.ESTATE_SOURCE_SEARCH
import ltd.kaizo.realestatemanager.utils.Utils.showAddPoiAlertDialog
import timber.log.Timber

class SearchFragment : BaseFragment() {
    private lateinit var searchViewModel: SearchViewModel
    private lateinit var binding: FragmentSearchBinding
    private lateinit var parentActivity: SearchActivity
    override val fragmentLayout: Int
        get() = R.layout.fragment_search

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_search, container, false)
        return binding.root
    }

    override fun configureDesign() {}

    override fun updateDesign() {
        this.configureViewModel()
        this.configureObserver()
        this.configureEvents()
        this.configureSpinner()
    }

    private fun configureSpinner() {
        val typeAdapter =
            ArrayAdapter(
                parentActivity,
                R.layout.support_simple_spinner_dropdown_item,
                searchViewModel.typeArray.value!!
            )
        fragment_search_type_spinner.adapter = typeAdapter

    }

    private fun configureEvents() {
        this.configureAddPoiBtn()
    }

    private fun configureAddPoiBtn() {
        fragment_search_poi_btn.setOnClickListener { showAddPoiAlertDialog(fragmentManager, ESTATE_SOURCE_SEARCH) }
    }

    private fun configureObserver() {
        searchViewModel.searchResult.observe(this, Observer { searchResultList ->
        Timber.i("resultList = $searchResultList")
        })
    }

    private fun configureViewModel() {
        parentActivity = activity as SearchActivity
        searchViewModel = parentActivity.searchViewModel
        binding.lifecycleOwner = this
        binding.searchViewModel = searchViewModel
        searchViewModel.typeArray.value = resources.getStringArray(R.array.typeArray)
    }

}
