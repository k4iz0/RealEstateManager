package ltd.kaizo.realestatemanager.controller.ui.list


import androidx.recyclerview.widget.LinearLayoutManager
import icepick.State
import kotlinx.android.synthetic.main.fragment_picture_detail.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.adapter.PictureDetailAdapter
import ltd.kaizo.realestatemanager.controller.ui.base.BaseFragment
import ltd.kaizo.realestatemanager.model.EstatePhoto
import ltd.kaizo.realestatemanager.utils.DataRecordHelper.getEstatePhotoListFromGson
import ltd.kaizo.realestatemanager.utils.ESTATE_PHOTO_LIST

class PictureDetailFragment : BaseFragment() {
    @State
    private var pictureList = listOf<EstatePhoto>()
    private lateinit var adapter: PictureDetailAdapter
    override val fragmentLayout = R.layout.fragment_picture_detail


    override fun configureDesign() {
        if (arguments != null) {
            this.pictureList = getEstatePhotoListFromGson(this.arguments!!.getString(ESTATE_PHOTO_LIST)!!)
        }
    }

    override fun updateDesign() {
        this.configureRecycleView()
    }

    private fun configureRecycleView() {

        adapter = PictureDetailAdapter(pictureList)
        fragment_picture_detail_recycle_view.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        fragment_picture_detail_recycle_view.adapter = adapter
    }
}
