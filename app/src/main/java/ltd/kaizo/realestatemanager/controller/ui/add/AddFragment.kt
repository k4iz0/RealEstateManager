package ltd.kaizo.realestatemanager.controller.ui.add

import android.app.Activity.RESULT_OK
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_add.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.adapter.PictureListAdapter
import ltd.kaizo.realestatemanager.controller.ui.base.BaseFragment
import ltd.kaizo.realestatemanager.databinding.FragmentAddBinding
import ltd.kaizo.realestatemanager.model.Photo
import ltd.kaizo.realestatemanager.utils.RC_CHOOSE_PHOTO
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
        val adapter = ArrayAdapter(context, R.layout.support_simple_spinner_dropdown_item, items)
        fragment_add_nb_room_spinner.adapter = adapter
        fragment_add_nb_bedroom_spinner.adapter = adapter
        fragment_add_nb_bathroom_spinner.adapter = adapter
        val typeAdapter =
            ArrayAdapter(context, R.layout.support_simple_spinner_dropdown_item, estateViewModel.typeArray)
        fragment_add_type_spinner.adapter = typeAdapter

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


    private fun selectPictureFromDevice() {
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(intent, RC_CHOOSE_PHOTO)
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
        }

    }


    private fun showAlertDialog() {
        val edittext = EditText(context)
        val alert = AlertDialog.Builder(parent)
        alert.setTitle("Picture name")

        alert.setView(edittext)

        alert.setPositiveButton(android.R.string.ok) { dialog, whichButton ->
            if (edittext.text.toString() != "") {
                this.pictureTmp.name = edittext.text.toString()
                Timber.i("name = ${pictureTmp.name}")
                this.pictureListTmp.add(this.pictureTmp)
                this.updateList(this.pictureListTmp)
            }
        }
        alert.show()
    }
}
