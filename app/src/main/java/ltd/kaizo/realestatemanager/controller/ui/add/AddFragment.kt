package ltd.kaizo.realestatemanager.controller.ui.add

import androidx.core.text.isDigitsOnly
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_estate.*
import kotlinx.android.synthetic.main.fragment_add.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.controller.ui.base.BaseFragment
import ltd.kaizo.realestatemanager.model.Estate
import timber.log.Timber

class AddFragment : BaseFragment() {

    private lateinit var estateViewModel: EstateViewModel
    private lateinit var parent :EstateActivity
    private var description: String = ""
    private var location: String = ""
    private var surface: Int = 0
    private var nbRoom: Int = 0
    private var nbBedroom: Int = 0
    private var nbBathroom: Int = 0


    companion object {
        fun newInstance() = AddFragment()
    }


    override val fragmentLayout: Int
        get() = R.layout.fragment_add

    /*
    * onCreateView
    */
    override fun configureDesign() {}

    /*
     * onActivityCreated
     */
    override fun updateDesign() {
        this.configureViewModel()
        this.configureAddButton()
    }

    private fun configureViewModel() {
        parent = activity as EstateActivity
        estateViewModel = parent.estateViewModel
    }

    private fun configureAddButton() {
        fragment_add_create_button.setOnClickListener {
            createEstate()
        }
    }

    private fun createEstate() {
        Timber.i("check = ${checkFieldView()}")

        if (this.checkFieldView()) {
            val estateToCreate = Estate(
                0,
                "apt",
                320000,
                surface,
                nbRoom,
                nbBathroom,
                nbBedroom,
                description,
                location,
                true,
                "18/02/2019",
                "",
                "Yann"
            )
            estateViewModel.createEstate(estateToCreate)
            Snackbar.make(fragment_add_coordinator_layout, "estate successfully created", Snackbar.LENGTH_SHORT).show()
            Thread.sleep(2000)
            parent.finish()
        }

    }

    private fun checkFieldView(): Boolean {

        if (!fragment_add_description_edittext.text.isNullOrBlank()
            && !fragment_add_location_edittext.text.isNullOrBlank()
            && !fragment_add_surface_edittext.text.isNullOrEmpty() && fragment_add_surface_edittext.text.isDigitsOnly()
            && !fragment_add_nb_room_edittext.text.isNullOrEmpty() && fragment_add_nb_room_edittext.text.isDigitsOnly()
            && !fragment_add_nb_bedroom_edittext.text.isNullOrEmpty() && fragment_add_nb_bedroom_edittext.text.isDigitsOnly()
            && !fragment_add_nb_bathroom_edittext.text.isNullOrEmpty() && fragment_add_nb_bathroom_edittext.text.isDigitsOnly()
        ) {
            description = fragment_add_description_edittext.text.toString()
            location = fragment_add_location_edittext.text.toString()
            surface = fragment_add_surface_edittext.text.toString().toInt()
            nbRoom = fragment_add_surface_edittext.text.toString().toInt()
            nbBedroom = fragment_add_nb_bedroom_edittext.text.toString().toInt()
            nbBathroom = fragment_add_nb_bathroom_edittext.text.toString().toInt()
            return true
        } else {
            return false
        }
    }


}
