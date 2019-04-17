package ltd.kaizo.realestatemanager.controller.ui.search


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_search.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.controller.ui.base.BaseFragment
import ltd.kaizo.realestatemanager.databinding.FragmentSearchBinding
import ltd.kaizo.realestatemanager.utils.ESTATE_SOURCE_SEARCH
import ltd.kaizo.realestatemanager.utils.Utils.showAddPoiAlertDialog

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
    }

    private fun configureEvents() {
        this.configureAddPoiBtn()
    }

    private fun configureAddPoiBtn() {
        fragment_search_poi_btn.setOnClickListener { showAddPoiAlertDialog(fragmentManager, ESTATE_SOURCE_SEARCH) }
    }

    private fun configureObserver() {}

    private fun configureViewModel() {
        parentActivity = activity as SearchActivity
        searchViewModel = parentActivity.searchViewModel
        binding.lifecycleOwner = this
        binding.searchViewModel = searchViewModel
    }

}
