package ltd.kaizo.realestatemanager.controller.ui.add


import android.app.Activity
import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_add_picture_dialog.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.databinding.FragmentAddPictureDialogBinding
import ltd.kaizo.realestatemanager.model.Photo
import ltd.kaizo.realestatemanager.utils.RC_CHOOSE_PHOTO
import ltd.kaizo.realestatemanager.utils.RC_TAKE_PHOTO
import ltd.kaizo.realestatemanager.utils.TAG_DIALOG
import ltd.kaizo.realestatemanager.utils.Utils.showSnackBar

class AddPictureDialogFragment : DialogFragment() {
    private lateinit var binding: FragmentAddPictureDialogBinding
    private var image_uri: Uri? = null
    private lateinit var uriImageSelected: Uri
    private lateinit var parent: EstateActivity
    private lateinit var estateViewModel: EstateViewModel
    private var pictureTmp: Photo? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_picture_dialog, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        this.configureDesign()
    }
    private fun configureDesign() {
        this.configureViewModel()
        dialog?.setTitle(getString(R.string.add_picture))

    }

    private fun configureViewModel() {
        parent = activity as EstateActivity
        estateViewModel = parent.estateViewModel
        binding.lifecycleOwner = this
        binding.addPictureDialogFragment = this

    }

    fun selectPictureFromDevice() {
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(intent, RC_CHOOSE_PHOTO)
    }

    fun selectPictureFromCamera() {
        val values = ContentValues()
        values.put(MediaStore.Images.Media.TITLE, "New Picture")
        values.put(MediaStore.Images.Media.DESCRIPTION, "From the Camera")
        image_uri = parent.contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values)
        val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, image_uri)
        startActivityForResult(cameraIntent, RC_TAKE_PHOTO)

    }

    fun savePicture() {
        when {
            estateViewModel.pictureName.value == "" -> showSnackBar(fragment_add_picture_dialog_coordinator_layout,"you need to enter a picture name")
            pictureTmp?.uri == "" -> showSnackBar(fragment_add_picture_dialog_coordinator_layout,"you need select a picture")
            pictureTmp == null -> closeDialog()
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
                        this.pictureTmp = Photo(0, 0, uriImageSelected.toString())
                    }
                } else {
                    estateViewModel.message.value = getString(R.string.no_picture_found)
                }
            }
            RC_TAKE_PHOTO -> if (resultCode == Activity.RESULT_OK) {
                if (image_uri != null) {
                    uriImageSelected = image_uri as Uri
                    this.pictureTmp = Photo(0, 0, uriImageSelected.toString())
                }
            } else {
                estateViewModel.message.value = getString(R.string.error_unknown_error)
            }
        }

    }

    fun closeDialog() {
        fragmentManager?.findFragmentByTag(TAG_DIALOG)?.let {
            (it as DialogFragment).dismiss()
        }
    }
}
