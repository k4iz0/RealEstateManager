package ltd.kaizo.realestatemanager.controller.ui.detail


import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.fragment_detail.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.controller.ui.base.BaseFragment
import ltd.kaizo.realestatemanager.injection.Injection
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.utils.ESTATE_ID

class DetailFragment : BaseFragment() {
    private var estateId: Int = 0

    private lateinit var detailViewModel: DetailViewModel

    companion object {
        fun newInstance() = DetailFragment()
    }

    override val fragmentLayout: Int
        get() = R.layout.fragment_detail

    override fun configureDesign() {
        if (arguments != null) {
            this.estateId = this.arguments!!.getInt(ESTATE_ID)
        }
    }

    override fun updateDesign() {
        val viewModelFactory = Injection.provideViewModelFactory(context!!)
        detailViewModel = ViewModelProviders.of(this, viewModelFactory).get(DetailViewModel::class.java)
        detailViewModel.getEstateById(this.estateId).observe(this, Observer { estate -> updateUi(estate) })
    }

    private fun updateUi(estate: Estate) {
        fragment_detail_description_textview.text = estate.description
        fragment_detail_surface_textview.text = estate.surface.toString()
        fragment_detail_nb_room_textview.text = estate.nbRoom.toString()
        fragment_detail_nb_bedroom_textview.text = estate.nbBedroom.toString()
        fragment_detail_nb_bathroom_textview.text = estate.nbBathroom.toString()
        fragment_detail_location_textview.text = estate.address
    }

}
