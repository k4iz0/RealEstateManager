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
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.fragment_add.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.controller.ui.base.BaseFragment
import ltd.kaizo.realestatemanager.databinding.FragmentAddBinding
import ltd.kaizo.realestatemanager.model.Photo
import ltd.kaizo.realestatemanager.utils.RC_CHOOSE_PHOTO
import ltd.kaizo.realestatemanager.utils.Utils.showSnackBar


class AddFragment : BaseFragment() {

    private lateinit var estateViewModel: EstateViewModel
    private lateinit var parent: EstateActivity
    private lateinit var binding: FragmentAddBinding
    private lateinit var uriImageSelected: Uri


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
                    }
                    val picture = Photo(0, uriImageSelected.toString())
                    picture.name = "kitchen"
                    estateViewModel.insertPhoto(picture)
                } else {
                    estateViewModel.message.value = getString(R.string.no_picture_found)
                }
            }
        }

    }
}
