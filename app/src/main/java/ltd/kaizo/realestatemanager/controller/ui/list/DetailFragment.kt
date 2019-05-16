package ltd.kaizo.realestatemanager.controller.ui.list


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.livinglifetechway.quickpermissions_kotlin.runWithPermissions
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_detail.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.adapter.PictureListAdapter
import ltd.kaizo.realestatemanager.adapter.PoiListAdapter
import ltd.kaizo.realestatemanager.controller.ui.base.BaseFragment
import ltd.kaizo.realestatemanager.controller.ui.map.MapActivity
import ltd.kaizo.realestatemanager.databinding.FragmentDetailBinding
import ltd.kaizo.realestatemanager.injection.Injection
import ltd.kaizo.realestatemanager.model.EstatePhoto
import ltd.kaizo.realestatemanager.utils.*
import ltd.kaizo.realestatemanager.utils.DataRecordHelper.getGsonFromEstatePhotoList
import ltd.kaizo.realestatemanager.utils.DataRecordHelper.getListFromGson
import ltd.kaizo.realestatemanager.utils.Utils.getPoiSourceList

class DetailFragment : BaseFragment() {
    private lateinit var pictureListAdapter: PictureListAdapter
    private lateinit var poiListAdapter: PoiListAdapter
    private lateinit var listViewModel: ListViewModel
    private var pictureList: MutableList<EstatePhoto> = mutableListOf()
    private var poiList: MutableList<String> = mutableListOf()
    private lateinit var parentActivity: Activity
    private lateinit var binding: FragmentDetailBinding
    private var sourceTag = 0
    private var estateId: Long = -1

    override val fragmentLayout: Int
        get() = R.layout.fragment_detail

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail, container, false)
        if (arguments != null) {
            this.estateId = this.arguments!!.getLong(ESTATE_ID)
            this.sourceTag = this.arguments!!.getInt(ESTATE_SOURCE)
        }
        return binding.root
    }

    override fun configureDesign() {}

    override fun updateDesign() {
        this.configureViewModel()
        this.configurePictureListRecycleView()
        this.configurePoiListRecycleView()
        this.configureObserver()
        this.configureOnMapClicked()
        fragment_detail_description_textview.movementMethod = ScrollingMovementMethod()
    }

    /**
     * launch the mapActivity if the static map is clicked
     */
    private fun configureOnMapClicked() {
        fragment_detail_map_container.setOnClickListener {
            runWithPermissions(FINE_LOCATION, COARSE_LOCATION) {
                startActivity(Intent(parentActivity, MapActivity::class.java))
            }
        }
    }

    /**
     * configure the viewModel according to the activity's source
     */
    private fun configureViewModel() {
        when (sourceTag) {
            0 -> {
                parentActivity = activity as ListActivity
                listViewModel = (parentActivity as ListActivity).listViewModel
            }
            ESTATE_SOURCE_MAP -> {
                parentActivity = activity as MapActivity
                val viewModelFactory = Injection.provideViewModelFactory(activity as MapActivity)
                listViewModel = ViewModelProviders.of(this, viewModelFactory).get(ListViewModel::class.java)
            }
        }
        binding.lifecycleOwner = this
        binding.listViewModel = listViewModel
    }
    /**
     * configure the recycle view for the estate's pictures
     */
    private fun configurePictureListRecycleView() {
        pictureListAdapter =
            PictureListAdapter(
                pictureList,
                RC_PICTURE_ITEM_DETAIL
            ) { photoList, _, _ -> onPictureItemClicked(photoList) }
        fragment_detail_picture_list_recycle_view.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        fragment_detail_picture_list_recycle_view.adapter = pictureListAdapter
    }

    /**
     * configure the recycle view for the point of interest
     */
    private fun configurePoiListRecycleView() {
        poiListAdapter =
            PoiListAdapter(poiList, getPoiSourceList(parentActivity.applicationContext), RC_PICTURE_ITEM_DETAIL) {}
        fragment_detail_poi_list_recycle_view.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        fragment_detail_poi_list_recycle_view.adapter = poiListAdapter
    }

    /**
     * send the picture list to the detail picture fragment
     * to be seen in full screen
     * @param estatePhotoList
     */
    private fun onPictureItemClicked(estatePhotoList: List<EstatePhoto>) {
        configureAndLaunchPictureDetailFragment(estatePhotoList)
    }

    private fun configureAndLaunchPictureDetailFragment(estatePhotoList: List<EstatePhoto>) {
        val args = Bundle()
        args.putString(ESTATE_PHOTO_LIST, getGsonFromEstatePhotoList(estatePhotoList))
        val pictureDetail = PictureDetailFragment()
        pictureDetail.arguments = args
        activity!!.supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, pictureDetail)
            .addToBackStack(null)
            .commit()
    }

    private fun configureObserver() {
        //get estate detail
        if (this.estateId.toInt() == -1) this.estateId = listViewModel.estateId.value!!

        listViewModel.getEstateById(this.estateId).observe(this, Observer { estate ->
            listViewModel.updateUiWithData(estate)
            Picasso.get().load(Utils.getStaticMapUrlFromAddress(estate.address, estate.postalCode, estate.city))
                .into(fragment_detail_map_container)
            if (estate.poi != "") {
                updatePoiList(getListFromGson(estate.poi).toMutableList())
            }

        })
        //get estate's picture's list
        listViewModel.getPictureListFromId(this.estateId).observe(this, Observer { list ->
            updatePictureList(list)
        })

    }

    private fun updatePictureList(list: List<EstatePhoto>) {
        pictureList.clear()
        pictureList.addAll(list)
        pictureListAdapter.notifyDataSetChanged()
    }

    private fun updatePoiList(list: List<String>) {
        poiList.clear()
        poiList.addAll(list)
        poiListAdapter.notifyDataSetChanged()
    }

}
