package ltd.kaizo.realestatemanager.controller.ui.add

import android.app.Activity.RESULT_OK
import android.content.ContentValues
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_add.*
import kotlinx.android.synthetic.main.picture_name_dialog.*
import kotlinx.android.synthetic.main.picture_pick_choice_dialog.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.adapter.PictureListAdapter
import ltd.kaizo.realestatemanager.controller.ui.base.BaseFragment
import ltd.kaizo.realestatemanager.databinding.FragmentAddBinding
import ltd.kaizo.realestatemanager.model.Photo
import ltd.kaizo.realestatemanager.utils.RC_CHOOSE_PHOTO
import ltd.kaizo.realestatemanager.utils.RC_TAKE_PHOTO
import ltd.kaizo.realestatemanager.utils.Utils.showSnackBar
import timber.log.Timber


class AddFragment : BaseFragment() {

    private lateinit var estateViewModel: EstateViewModel
    private lateinit var parent: EstateActivity
    private lateinit var binding: FragmentAddBinding
    private lateinit var uriImageSelected: Uri
    private lateinit var adapter: PictureListAdapter
    private var pictureListTmp: MutableList<Photo> = mutableListOf()
    private lateinit var pictureTmp: Photo
    private var image_uri: Uri? = null

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
        this.configureObserver()
        this.configureFab()
        this.configureSpinner()
        this.configureRecycleView()
    }

    private fun configureRecycleView() {
        adapter = PictureListAdapter(estateViewModel.pictureList) { photo -> onPictureItemClicked(photo) }
        fragment_add_picture_list_recycle_view.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        fragment_add_picture_list_recycle_view.adapter = adapter
    }

    private fun updateList(list: List<Photo>) {
        estateViewModel.pictureList.clear()
        estateViewModel.pictureList.addAll(list)
        adapter.notifyDataSetChanged()
    }

    private fun onPictureItemClicked(photo: Photo) {
        //launch default image viewer on device to show the picture
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(photo.uri)))
    }

    private fun configureSpinner() {
        val items = (0..20).toList()
        val adapter = ArrayAdapter(parent, R.layout.support_simple_spinner_dropdown_item, items)
        fragment_add_nb_room_spinner.adapter = adapter
        fragment_add_nb_bedroom_spinner.adapter = adapter
        fragment_add_nb_bathroom_spinner.adapter = adapter
        val typeAdapter =
            ArrayAdapter(parent, R.layout.support_simple_spinner_dropdown_item, estateViewModel.typeArray)
        fragment_add_type_spinner.adapter = typeAdapter

    }

    private fun configureFab() {
        fragment_add_fab.setOnClickListener {
            showAddPictureAlertDialog()
        }
    }

    private fun configureObserver() {
        estateViewModel.message.observe(
            this,
            Observer { message ->
                if (message != "" && message != null) {
                    showSnackBar(fragment_add_coordinator_layout, message)
                    estateViewModel.message.value = ""
                }

            })
        estateViewModel.isFinish.observe(this, Observer { isFinish ->
            if (isFinish) {
                parent.finish()
                estateViewModel.isFinish.value = false
            }
        })

    }

    private fun configureViewModel() {
        parent = activity as EstateActivity
        estateViewModel = parent.estateViewModel
        binding.lifecycleOwner = this
        binding.estateViewModel = estateViewModel

    }

    private fun showAddPictureAlertDialog() {
        val alertDialog = AlertDialog.Builder(parent)
        with(alertDialog) {
            setView(R.layout.picture_pick_choice_dialog)
            setNegativeButton(android.R.string.cancel) { dialog, which ->
                dialog.dismiss()
            }
            setNeutralButton("Camera") { dialog, which ->
                selectPictureFromCamera()
            }
            setPositiveButton("Gallery") { dialog, which ->
                selectPictureFromDevice()
            }
            show()
        }
        picture_pick_dialog_camera_btn.setOnClickListener {  selectPictureFromCamera() }
        picture_pick_dialog_gallery_btn.setOnClickListener {  selectPictureFromDevice() }
    }


    private fun selectPictureFromDevice() {
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(intent, RC_CHOOSE_PHOTO)
    }

    private fun selectPictureFromCamera() {
        val values = ContentValues()
        values.put(MediaStore.Images.Media.TITLE, "New Picture")
        values.put(MediaStore.Images.Media.DESCRIPTION, "From the Camera")
        image_uri = parent.contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values)
        val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, image_uri)
        startActivityForResult(cameraIntent, RC_TAKE_PHOTO)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            RC_CHOOSE_PHOTO -> {
                if (resultCode == RESULT_OK) {
                    if (data != null) {
                        uriImageSelected = data.data as Uri
                        this.pictureTmp = Photo(0, uriImageSelected.toString())
                        showAlertDialog()
                    }
                } else {
                    estateViewModel.message.value = getString(R.string.no_picture_found)
                }
            }
            RC_TAKE_PHOTO -> if (resultCode == RESULT_OK) {
                if (image_uri != null) {
                    uriImageSelected = image_uri as Uri
                    this.pictureTmp = Photo(0, uriImageSelected.toString())
                    showAlertDialog()
                }
            } else {
                estateViewModel.message.value = getString(R.string.error_unknown_error)
            }
        }

    }

    private fun showAlertDialog() {
        val alert = AlertDialog.Builder(parent)
        with(alert) {
            setView(R.layout.picture_name_dialog)
            setTitle(getString(R.string.picture_name))
            setPositiveButton(android.R.string.ok) { dialog, whichButton ->
                if (picture_name_dialog_edittext.text.toString() != "") {
                    pictureTmp.name = picture_name_dialog_edittext.text.toString()
                    Timber.i("name = ${pictureTmp.name}")
                    pictureListTmp.add(pictureTmp)
                    updateList(pictureListTmp)
                }
            }
            show()
        }
    }
}
