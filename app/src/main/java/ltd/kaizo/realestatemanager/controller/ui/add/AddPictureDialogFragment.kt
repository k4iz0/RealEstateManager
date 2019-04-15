package ltd.kaizo.realestatemanager.controller.ui.add


import android.app.Activity
import android.content.ContentValues
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.fragment_add_picture_dialog.*
import ltd.kaizo.realestatemanager.databinding.FragmentAddPictureDialogBinding
import ltd.kaizo.realestatemanager.model.EstatePhoto
import ltd.kaizo.realestatemanager.utils.RC_CHOOSE_PHOTO
import ltd.kaizo.realestatemanager.utils.RC_TAKE_PHOTO
import ltd.kaizo.realestatemanager.utils.TAG_ADD_PICTURE_DIALOG
import ltd.kaizo.realestatemanager.utils.Utils.showSnackBar


class AddPictureDialogFragment : DialogFragment() {
    private lateinit var binding: FragmentAddPictureDialogBinding
    private var imageUri: Uri? = null
    private lateinit var uriImageSelected: Uri
    private lateinit var parent: EstateActivity
    private lateinit var estateViewModel: EstateViewModel
    private var pictureTmp: EstatePhoto = EstatePhoto(0, 0, "")
    val pictureName = MutableLiveData<String>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            ltd.kaizo.realestatemanager.R.layout.fragment_add_picture_dialog,
            container,
            false
        )
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        this.configureDesign()
    }

    private fun configureDesign() {
        this.configureViewModel()
    }

    private fun configureViewModel() {
        parent = activity as EstateActivity
        estateViewModel = parent.estateViewModel
        binding.lifecycleOwner = this
        binding.addPictureDialogFragment = this
        this.configureObserver()
    }

    /****************************
     *******   OBSERVERS  ********
     *****************************/


    private fun configureObserver() {
        // Picture Name
        pictureName.observe(this, Observer { name -> pictureTmp.name = name })
    }

    fun selectPictureFromDevice() {
        val intent = Intent(Intent.ACTION_OPEN_DOCUMENT, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(intent, RC_CHOOSE_PHOTO)
    }

    fun selectPictureFromCamera() {
        val values = ContentValues()
        values.put(MediaStore.Images.Media.TITLE, "New Picture")
        values.put(MediaStore.Images.Media.DESCRIPTION, "From the Camera")
        imageUri = parent.contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values)
        val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri)
        startActivityForResult(cameraIntent, RC_TAKE_PHOTO)
    }

    fun savePicture() {
        when {
            pictureTmp.name == "" -> showSnackBar(
                add_dialog_fragment_coordinator_layout,
                getString(ltd.kaizo.realestatemanager.R.string.enter_picture_name)
            )
            pictureTmp.uri == "" -> showSnackBar(
                add_dialog_fragment_coordinator_layout,
                getString(ltd.kaizo.realestatemanager.R.string.select_picture)
            )
            else -> {
                estateViewModel.pictureTmp.value = pictureTmp
                closeDialog()
            }
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            RC_CHOOSE_PHOTO -> {
                if (resultCode == Activity.RESULT_OK) {
                    if (data != null) {
                        uriImageSelected = data.data as Uri
                        this.pictureTmp.uri = uriImageSelected.toString()

                    }
                } else {
                    estateViewModel.message.value = getString(ltd.kaizo.realestatemanager.R.string.no_picture_found)
                }
            }
            RC_TAKE_PHOTO -> if (resultCode == Activity.RESULT_OK) {
                if (imageUri != null) {
                    uriImageSelected = imageUri as Uri
                    this.pictureTmp.uri = uriImageSelected.toString()
                }
            } else {
                estateViewModel.message.value = getString(ltd.kaizo.realestatemanager.R.string.error_unknown_error)
            }
        }

    }

    fun closeDialog() {
        fragmentManager?.findFragmentByTag(TAG_ADD_PICTURE_DIALOG)?.let {
            (it as DialogFragment).dismiss()
        }
    }
}
