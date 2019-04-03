package ltd.kaizo.realestatemanager.controller.ui.list


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_detail.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.adapter.PictureListAdapter
import ltd.kaizo.realestatemanager.controller.ui.base.BaseFragment
import ltd.kaizo.realestatemanager.databinding.FragmentDetailBinding
import ltd.kaizo.realestatemanager.model.EstatePhoto
import ltd.kaizo.realestatemanager.utils.RC_PICTURE_ITEM_DETAIL
import ltd.kaizo.realestatemanager.utils.Utils

class DetailFragment : BaseFragment() {
    private lateinit var adapter: PictureListAdapter
    private lateinit var listViewModel: ListViewModel
    private var pictureList: MutableList<EstatePhoto> = mutableListOf()
    private lateinit var parentActivity: ListActivity
    private lateinit var binding: FragmentDetailBinding
    companion object {
        fun newInstance() = DetailFragment()
    }

    override val fragmentLayout: Int
        get() = R.layout.fragment_detail

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail, container, false)
        return binding.root
    }
    override fun configureDesign() {}


    private fun configureViewModel() {
        parentActivity = activity as ListActivity
        listViewModel = parentActivity.listViewModel
        binding.lifecycleOwner = this
        binding.listViewModel = listViewModel
    }

    private fun configureRecycleView() {
        adapter = PictureListAdapter(pictureList, RC_PICTURE_ITEM_DETAIL) { photo, _ -> onPictureItemClicked(photo) }
        fragment_detail_picture_list_recycle_view.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        fragment_detail_picture_list_recycle_view.adapter = adapter
    }

    private fun onPictureItemClicked(estatePhoto: EstatePhoto) {
        //launch default image viewer on device to show the picture
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(estatePhoto.uri)))
    }

    override fun updateDesign() {
        this.configureViewModel()
        this.configureRecycleView()
        this.configureObserver()
    }

    private fun configureObserver() {
        //get estate detail
        listViewModel.getEstateById(listViewModel.estateId.value!!).observe(this, Observer { estate ->
            listViewModel.updateUiWithData(estate)
            Picasso.get().load(Utils.getStaticMapUrlFromAddress(estate.address, estate.postalCode, estate.city)).into(fragment_detail_map_container)

        })
        //get estate's picture's list
        listViewModel.getPictureListFromId(listViewModel.estateId.value!!).observe(this, Observer { list ->
            updateList(list)
        })


    }

    private fun updateList(list: List<EstatePhoto>) {
        pictureList.clear()
        pictureList.addAll(list)
        adapter.notifyDataSetChanged()
    }

}
