package ltd.kaizo.realestatemanager.controller.ui.add

import android.Manifest
import android.app.Activity.RESULT_OK
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.google.android.material.snackbar.Snackbar
import com.livinglifetechway.quickpermissions_kotlin.runWithPermissions
import kotlinx.android.synthetic.main.fragment_add.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.controller.ui.base.BaseFragment
import ltd.kaizo.realestatemanager.databinding.FragmentAddBinding
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.utils.WRITE_EXT_PERM
import ltd.kaizo.realestatemanager.utils.RC_CHOOSE_PHOTO
import ltd.kaizo.realestatemanager.utils.RC_IMAGE_PERMS
import ltd.kaizo.realestatemanager.utils.Utils.showSnackBar
import pub.devrel.easypermissions.AfterPermissionGranted
import pub.devrel.easypermissions.EasyPermissions
import timber.log.Timber


class AddFragment : BaseFragment() {

    private lateinit var estateViewModel: EstateViewModel
    private lateinit var parent: EstateActivity
    private lateinit var binding: FragmentAddBinding
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
        this.configureObserver()
        this.configureFab()
    }

    private fun configureFab() {
        fragment_add_fab.setOnClickListener {
            selectPictureFromDevice()
        }
    }

    private fun configureObserver() {
        estateViewModel.message.observe(
            this,
            Observer { message ->
                if (message != "" && message != null) {
                    showSnackBar(fragment_add_coordinator_layout, message)
                    estateViewModel.message.value =""
                }

            })
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
            estateViewModel.message.value = "estate successfully created"
            Thread.sleep(2000)
            parent.finish()
        } else {
            estateViewModel.message.value = "an error has occurred"
        }

    }

    private fun selectPictureFromDevice(){
            val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivityForResult(intent, RC_CHOOSE_PHOTO)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            RC_CHOOSE_PHOTO -> {
                if (resultCode == RESULT_OK) {
                    uriImageSelected = data?.data
                } else {
                    estateViewModel.message.value = getString(R.string.no_picture_found)
                }
            }
        }

    }
}
