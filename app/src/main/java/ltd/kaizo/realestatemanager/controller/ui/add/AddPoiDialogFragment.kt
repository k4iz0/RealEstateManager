package ltd.kaizo.realestatemanager.controller.ui.add

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
import ltd.kaizo.realestatemanager.databinding.FragmentAddPoiDialogBinding
import ltd.kaizo.realestatemanager.utils.RC_POI_ADD_ITEM
import ltd.kaizo.realestatemanager.utils.TAG_ADD_POI_DIALOG
import ltd.kaizo.realestatemanager.utils.Utils.getPoiListFromString
import ltd.kaizo.realestatemanager.utils.Utils.getPoiSourceList
import ltd.kaizo.realestatemanager.utils.Utils.getStringFromPoiList
import timber.log.Timber

class AddPoiDialogFragment : DialogFragment() {
    private lateinit var binding: FragmentAddPoiDialogBinding
    private lateinit var parent: EstateActivity
    private lateinit var estateViewModel: EstateViewModel
    private lateinit var poiListAdapter: PoiListAdapter
    private var poiList = mutableListOf<String>()
    private var poiListTmp = mutableListOf<String>()

    private lateinit var poiSourceList: Array<String>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_poi_dialog, container, false)
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
        if (estateViewModel.poiListTmp.value == null) {
            estateViewModel.poiListTmp.value = mutableListOf()
        } else {
            this.poiList.addAll(estateViewModel.poiListTmp.value!!)
            this.poiListTmp.addAll(estateViewModel.poiListTmp.value!!)
        }
    }

    private fun updatePoiToList(poi: String) {
        if (!poiListTmp.contains(poi)) poiListTmp.add(poi) else poiListTmp.remove(poi)
        Timber.i("$poiListTmp")
        updateList(poiListTmp)
    }

    private fun configureViewModel() {
        parent = activity as EstateActivity
        estateViewModel = parent.estateViewModel
        binding.addPoiDialogFragment = this
        this.poiSourceList = getPoiSourceList(parent.applicationContext)
    }

    fun saveData() {
        estateViewModel.poiList.value = getStringFromPoiList(this.poiListTmp)
        estateViewModel.poiListTmp.value = this.poiListTmp
        closeDialog()
    }

    /****************************
     *******   OBSERVERS  ********
     *****************************/


    private fun configureObserver() {
        // POI list
        estateViewModel.poiList.observe(this, Observer { list ->
            if (list.length > 1) {
                this.poiList = getPoiListFromString(list)
                poiListAdapter.notifyDataSetChanged()
            }
        })

    }

    private fun updateList(list: List<String>) {
        this.poiList.clear()
        this.poiList.addAll(list)
        poiListAdapter.notifyDataSetChanged()
    }

    private fun closeDialog() {
        fragmentManager?.findFragmentByTag(TAG_ADD_POI_DIALOG)?.let {
            (it as DialogFragment).dismiss()
        }
    }
}
