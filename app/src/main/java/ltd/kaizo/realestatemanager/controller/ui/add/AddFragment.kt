package ltd.kaizo.realestatemanager.controller.ui.add

import android.app.Activity.RESULT_OK
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.text.isDigitsOnly
import androidx.databinding.DataBindingUtil
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_add.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.controller.ui.base.BaseFragment
import ltd.kaizo.realestatemanager.databinding.FragmentAddBinding
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.utils.PERMS
import ltd.kaizo.realestatemanager.utils.RC_CHOOSE_PHOTO
import ltd.kaizo.realestatemanager.utils.RC_IMAGE_PERMS
import pub.devrel.easypermissions.EasyPermissions
import timber.log.Timber


class AddFragment : BaseFragment() {

    private lateinit var estateViewModel: EstateViewModel
    private lateinit var parent: EstateActivity
    private lateinit var binding :FragmentAddBinding
    private var uriImageSelected: Uri? = null


    companion object {
        fun newInstance() = AddFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add, container, false)
       return binding.root
    }
    override val fragmentLayout: Int
        get() = ltd.kaizo.realestatemanager.R.layout.fragment_add

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
        binding.lifecycleOwner = this
        binding.estateViewModel = estateViewModel

    }

    private fun configureAddButton() {
        fragment_add_create_button.setOnClickListener {
            createEstate()
        }
    }

    private fun createEstate() {

        if (estateViewModel.checkFieldView()) {
            val estateToCreate = Estate(
                0,
                "apt",
                320000,
                estateViewModel.surface.value!!,
                estateViewModel.nbRoom.value!!,
                estateViewModel.nbBathroom.value!!,
                estateViewModel.nbBedroom.value!!,
                estateViewModel.description.value!!,
                estateViewModel.location.value!!,
                true,
                "18/02/2019",
                "",
                "Yann"
            )
            estateViewModel.createEstate(estateToCreate)
            Snackbar.make(fragment_add_coordinator_layout, "estate successfully created", Snackbar.LENGTH_SHORT).show()
            Thread.sleep(2000)
            parent.finish()
        } else {
            Snackbar.make(fragment_add_coordinator_layout, "an error has occurred", Snackbar.LENGTH_SHORT).show()
        }

    }



    /****************************
     ********* PERMISSION ********
     *****************************/

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        this.handleResponse(requestCode, resultCode, data!!)
    }

    private fun selectPictureFromDevice() {
        if (!EasyPermissions.hasPermissions(parent.applicationContext, PERMS)) {
            EasyPermissions.requestPermissions(this, "permission files access", RC_IMAGE_PERMS, PERMS)
            return
        }
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivity(intent)

    }

    private fun handleResponse(requestCode: Int, resultCode: Int, data: Intent) {
        if (requestCode == RC_CHOOSE_PHOTO) {
            if (resultCode == RESULT_OK) { //SUCCESS
                this.uriImageSelected = data.data
                //SHOWING PREVIEW OF IMAGE

            } else {
                Toast.makeText(parent.applicationContext, "no image choose", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
