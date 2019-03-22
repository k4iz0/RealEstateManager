package ltd.kaizo.realestatemanager.controller.ui.detail


import android.content.Intent
import android.net.Uri
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_detail.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.adapter.PictureListAdapter
import ltd.kaizo.realestatemanager.controller.ui.base.BaseFragment
import ltd.kaizo.realestatemanager.controller.ui.list.ListActivity
import ltd.kaizo.realestatemanager.controller.ui.list.ListViewModel
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.model.Photo
import ltd.kaizo.realestatemanager.utils.ESTATE_ID
import ltd.kaizo.realestatemanager.utils.RC_PICTURE_ITEM_DETAIL
import ltd.kaizo.realestatemanager.utils.Utils.getStaticMapUrlFromAddress
import timber.log.Timber

class DetailFragment : BaseFragment() {
    private lateinit var adapter: PictureListAdapter
    private var estateId: Long = 1
    private lateinit var listViewModel: ListViewModel
    private var pictureList: MutableList<Photo> = mutableListOf()

    companion object {
        fun newInstance() = DetailFragment()
    }

    override val fragmentLayout: Int
        get() = R.layout.fragment_detail


    override fun configureDesign() {
        if (arguments != null) {
            this.estateId = this.arguments!!.getLong(ESTATE_ID)
        }

    }

    private fun configureRecycleView() {
        adapter = PictureListAdapter(pictureList, RC_PICTURE_ITEM_DETAIL) { photo, _ -> onPictureItemClicked(photo) }
        fragment_detail_picture_list_recycle_view.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        fragment_detail_picture_list_recycle_view.adapter = adapter
    }

    private fun onPictureItemClicked(photo: Photo) {
        //launch default image viewer on device to show the picture
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(photo.uri)))
    }

    override fun updateDesign() {
        val parent = activity as ListActivity
        listViewModel = parent.listViewModel
        this.configureRecycleView()
        this.configureObserver()
    }

    private fun configureObserver() {
        //get estate detail
        listViewModel.getEstateById(this.estateId).observe(this, Observer { estate -> updateUi(estate) })
        listViewModel.getPictureListFromId(this.estateId).observe(this, Observer { list ->
            Timber.i("size of the list = ${list.size}")
            updateList(list)
        })


    }

    private fun updateList(list: List<Photo>) {
        pictureList.clear()
        pictureList.addAll(list)
        adapter.notifyDataSetChanged()
    }

    private fun updateUi(estate: Estate) {
        val address = "${estate.address} \n ${estate.postalCode} ${estate.city.toUpperCase()}"
        fragment_detail_description_textview.text = estate.description
        fragment_detail_surface_textview.text = estate.surface.toString()
        fragment_detail_nb_room_textview.text = estate.nbRoom.toString()
        fragment_detail_nb_bedroom_textview.text = estate.nbBedroom.toString()
        fragment_detail_nb_bathroom_textview.text = estate.nbBathroom.toString()
        fragment_detail_location_textview.text = address
        fragment_detail_price.text = estate.price.toString()
        updateList(pictureList)
        Picasso.get().load(getStaticMapUrlFromAddress(estate.address, estate.postalCode, estate.city)).into(fragment_detail_map_container)
    }
}
