package ltd.kaizo.realestatemanager.controller.ui.list


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
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
import ltd.kaizo.realestatemanager.utils.DataRecordHelper.read
import ltd.kaizo.realestatemanager.utils.Utils.getPoiListFromString
import ltd.kaizo.realestatemanager.utils.Utils.getPoiSourceList

class DetailFragment : BaseFragment() {
    private lateinit var pictureListAdapter: PictureListAdapter
    private lateinit var poiListAdapter: PoiListAdapter
    private lateinit var listViewModel: ListViewModel
    private var pictureList: MutableList<EstatePhoto> = mutableListOf()
    private var poiList: MutableList<String> = mutableListOf()
    private lateinit var parentActivity: ListActivity
    private lateinit var binding: FragmentDetailBinding
    private var sourceTag = 0
    private var estateId: Long = -1

    companion object {
        fun newInstance() = DetailFragment()
    }

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
    }

    private fun configureViewModel() {
        when (sourceTag) {
            0 -> {
                parentActivity = activity as ListActivity
                listViewModel = parentActivity.listViewModel
            }
            ESTATE_SOURCE_MAP -> {
                val viewModelFactory = Injection.provideViewModelFactory(activity as MapActivity)
                listViewModel = ViewModelProviders.of(this, viewModelFactory).get(ListViewModel::class.java)
            }
        }
        binding.lifecycleOwner = this
        binding.listViewModel = listViewModel
    }

    private fun configurePictureListRecycleView() {
        pictureListAdapter =
            PictureListAdapter(pictureList, RC_PICTURE_ITEM_DETAIL) { photo, _ -> onPictureItemClicked(photo) }
        fragment_detail_picture_list_recycle_view.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        fragment_detail_picture_list_recycle_view.adapter = pictureListAdapter
    }

    private fun configurePoiListRecycleView() {
        poiListAdapter =
            PoiListAdapter(poiList, getPoiSourceList(parentActivity.applicationContext),RC_PICTURE_ITEM_DETAIL) {}
        fragment_detail_poi_list_recycle_view.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        fragment_detail_poi_list_recycle_view.adapter = poiListAdapter
    }

    private fun onPictureItemClicked(estatePhoto: EstatePhoto) {
        //launch default image viewer on device to show the picture
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(estatePhoto.uri)))
    }


    private fun configureObserver() {
        //get estate detail
        if (this.estateId.toInt() == -1) this.estateId = listViewModel.estateId.value!!

        listViewModel.getEstateById(this.estateId).observe(this, Observer { estate ->
            this.configureCurrency()
            listViewModel.updateUiWithData(estate)
            Picasso.get().load(Utils.getStaticMapUrlFromAddress(estate.address, estate.postalCode, estate.city))
                .into(fragment_detail_map_container)
            poiList = getPoiListFromString(estate.poi)
            poiListAdapter.notifyDataSetChanged()
        })
        //get estate's picture's list
        listViewModel.getPictureListFromId(this.estateId).observe(this, Observer { list ->
            updateList(list)
        })
    }

    private fun configureCurrency() {
        if (read(CURRENT_CURRENCY, CURRENCY_EURO) == CURRENCY_EURO) {
            fragment_detail_currency_euro.visibility = View.VISIBLE
            fragment_detail_currency_dollar.visibility = View.GONE
        } else {
            fragment_detail_currency_euro.visibility = View.GONE
            fragment_detail_currency_dollar.visibility = View.VISIBLE
        }
    }

    private fun updateList(list: List<EstatePhoto>) {
        pictureList.clear()
        pictureList.addAll(list)
        pictureListAdapter.notifyDataSetChanged()
    }

}
