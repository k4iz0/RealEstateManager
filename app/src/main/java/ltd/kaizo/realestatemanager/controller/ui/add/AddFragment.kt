package ltd.kaizo.realestatemanager.controller.ui.add

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_add.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.adapter.PictureListAdapter
import ltd.kaizo.realestatemanager.controller.ui.base.BaseFragment
import ltd.kaizo.realestatemanager.databinding.FragmentAddBinding
import ltd.kaizo.realestatemanager.model.Photo
import ltd.kaizo.realestatemanager.utils.TAG_DIALOG
import ltd.kaizo.realestatemanager.utils.Utils.hideKeyboard
import ltd.kaizo.realestatemanager.utils.Utils.showSnackBar
import ltd.kaizo.realestatemanager.utils.Utils.todayDate
import timber.log.Timber


class AddFragment : BaseFragment() {
      private lateinit var estateViewModel: EstateViewModel
    private lateinit var parentActivity: EstateActivity
    private lateinit var binding: FragmentAddBinding
    private lateinit var adapter: PictureListAdapter
    private val pictureListTmp: MutableList<Photo> = mutableListOf()

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
        val items = (0..15).toList()
        val adapter = ArrayAdapter(parentActivity, R.layout.support_simple_spinner_dropdown_item, items)
        fragment_add_nb_room_spinner.adapter = adapter
        fragment_add_nb_bedroom_spinner.adapter = adapter
        fragment_add_nb_bathroom_spinner.adapter = adapter
        fragment_add_constraint_layout.setOnClickListener{hideKeyboard(parentActivity)}

        val typeAdapter =
            ArrayAdapter(parentActivity, R.layout.support_simple_spinner_dropdown_item, estateViewModel.typeArray)
        fragment_add_type_spinner.adapter = typeAdapter

    }

    private fun configureFab() {
        fragment_add_fab.setOnClickListener {
            showAddPictureAlertDialog()
        }
    }
    /****************************
     *******   OBSERVERS  ********
     *****************************/

    private fun configureObserver() {
        //message for snackbar
        estateViewModel.message.observe(
            this,
            Observer { message ->
                if (message != "" && message != null) {
                    showSnackBar(fragment_add_coordinator_layout, message)
                    estateViewModel.message.value = ""
                }

            })
        //Boolean to finish activity after room request
        estateViewModel.isFinish.observe(this, Observer { isFinish ->
            if (isFinish) {
                parentActivity.finish()
                estateViewModel.isFinish.value = false
            }
        })
        //update the picture list for the add/edit fragment
        estateViewModel.pictureTmp.observe(this, Observer { picture ->
            pictureListTmp.add(picture)
            updateList(pictureListTmp)
        })
        //set the date for the add/edit fragment
        estateViewModel.dateIn.observe(this, Observer { dateIn ->
                Timber.i("datein = ${estateViewModel.dateIn.value}")
            if (estateViewModel.dateIn.value.isNullOrEmpty()) {
                estateViewModel.dateIn.value = todayDate
            }
        })

    }

    private fun configureViewModel() {
        parentActivity = activity as EstateActivity
        estateViewModel = parentActivity.estateViewModel
        binding.lifecycleOwner = this
        binding.estateViewModel = estateViewModel

    }

    private fun showAddPictureAlertDialog() {
        val dialog = AddPictureDialogFragment()
        fragmentManager?.let { dialog.show(it, TAG_DIALOG) }
    }
}
