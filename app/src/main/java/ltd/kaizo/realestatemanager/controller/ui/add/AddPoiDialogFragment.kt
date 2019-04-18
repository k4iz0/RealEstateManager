package ltd.kaizo.realestatemanager.controller.ui.add

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.fragment_add_poi_dialog.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.adapter.PoiListAdapter
import ltd.kaizo.realestatemanager.controller.ui.search.SearchActivity
import ltd.kaizo.realestatemanager.controller.ui.search.SearchViewModel
import ltd.kaizo.realestatemanager.databinding.FragmentAddPoiDialogBinding
import ltd.kaizo.realestatemanager.utils.DataRecordHelper.getGsonFromList
import ltd.kaizo.realestatemanager.utils.DataRecordHelper.getListFromGson
import ltd.kaizo.realestatemanager.utils.ESTATE_SOURCE
import ltd.kaizo.realestatemanager.utils.ESTATE_SOURCE_SEARCH
import ltd.kaizo.realestatemanager.utils.RC_POI_ADD_ITEM
import ltd.kaizo.realestatemanager.utils.TAG_ADD_POI_DIALOG
import ltd.kaizo.realestatemanager.utils.Utils.getPoiSourceList
import timber.log.Timber

class AddPoiDialogFragment : DialogFragment() {
    private lateinit var binding: FragmentAddPoiDialogBinding
    private lateinit var parent: Activity
    private lateinit var estateViewModel: EstateViewModel
    private lateinit var searchViewModel: SearchViewModel
    private lateinit var poiListAdapter: PoiListAdapter
    private var sourceTag = 0
    private var poiList = mutableListOf<String>()
    private var poiListTmp = mutableListOf<String>()

    private lateinit var poiSourceList: Array<String>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_poi_dialog, container, false)
        if (arguments != null) {
            this.sourceTag = this.arguments!!.getInt(ESTATE_SOURCE)
        }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        this.configureDesign()
    }

    private fun configureDesign() {
        this.configureViewModel()
        this.configureRecycleView()
        this.configureObserver()
    }

    private fun configureRecycleView() {
        configurePoiListTmp()
        poiListAdapter = PoiListAdapter(poiList, this.poiSourceList, RC_POI_ADD_ITEM) { poi ->
            updatePoiToList(poi)
        }
        add_poi_dialog_fragment_recycleview.layoutManager = GridLayoutManager(context, 3)
        add_poi_dialog_fragment_recycleview.adapter = poiListAdapter
    }

    private fun configurePoiListTmp() {
        if (sourceTag == ESTATE_SOURCE_SEARCH) {
            if (searchViewModel.poiListTmp.value == null) {
                searchViewModel.poiListTmp.value = mutableListOf()
            } else {
                this.poiList.addAll(searchViewModel.poiListTmp.value!!)
                this.poiListTmp.addAll(searchViewModel.poiListTmp.value!!)
            }
        } else {

            if (estateViewModel.poiListTmp.value == null) {
                estateViewModel.poiListTmp.value = mutableListOf()
            } else {
                this.poiList.addAll(estateViewModel.poiListTmp.value!!)
                this.poiListTmp.addAll(estateViewModel.poiListTmp.value!!)
            }
        }
    }

    private fun updatePoiToList(poi: String) {
        if (!poiListTmp.contains(poi)) poiListTmp.add(poi) else poiListTmp.remove(poi)
        Timber.i("$poiListTmp")
        updateList(poiListTmp)
    }

    private fun configureViewModel() {
        if (sourceTag == ESTATE_SOURCE_SEARCH) {
            parent = activity as SearchActivity
            searchViewModel = (parent as SearchActivity).searchViewModel
        } else {
            parent = activity as EstateActivity
            estateViewModel = (parent as EstateActivity).estateViewModel
        }
        binding.addPoiDialogFragment = this
        this.poiSourceList = getPoiSourceList(parent.applicationContext)
    }

    fun saveData() {

        if (sourceTag == ESTATE_SOURCE_SEARCH) {
            searchViewModel.poiList.value = getGsonFromList(this.poiListTmp)
            searchViewModel.poiListTmp.value = this.poiListTmp
        } else {
            estateViewModel.poiList.value = getGsonFromList(this.poiListTmp)
            estateViewModel.poiListTmp.value = this.poiListTmp
        }

        closeDialog()
    }

    /****************************
     *******   OBSERVERS  ********
     *****************************/


    private fun configureObserver() {
        // POI list

        if (::estateViewModel.isInitialized) {

            estateViewModel.poiList.observe(this, Observer { list ->
                if (list.length > 1) {
                    this.poiList = getListFromGson(list).toMutableList()
                    poiListAdapter.notifyDataSetChanged()
                }
            })
        }
        if (::searchViewModel.isInitialized) {
            searchViewModel.poiList.observe(this, Observer { list ->
                if (list.length > 1) {
                    this.poiList = getListFromGson(list).toMutableList()
                    poiListAdapter.notifyDataSetChanged()
                }
            })
        }
    }

    private fun updateList(list: List<String>) {
        this.poiList.clear()
        this.poiList.addAll(list)
        this.poiListAdapter.notifyDataSetChanged()
    }

    private fun closeDialog() {
        fragmentManager?.findFragmentByTag(TAG_ADD_POI_DIALOG)?.let {
            (it as DialogFragment).dismiss()
        }
    }
}
