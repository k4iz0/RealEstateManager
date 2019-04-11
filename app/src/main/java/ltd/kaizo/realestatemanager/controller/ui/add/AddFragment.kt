package ltd.kaizo.realestatemanager.controller.ui.add

import android.app.DatePickerDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_add.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.adapter.PictureListAdapter
import ltd.kaizo.realestatemanager.controller.ui.base.BaseFragment
import ltd.kaizo.realestatemanager.databinding.FragmentAddBinding
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.model.EstatePhoto
import ltd.kaizo.realestatemanager.utils.*
import ltd.kaizo.realestatemanager.utils.Utils.add0ToDate
import ltd.kaizo.realestatemanager.utils.Utils.checkDateDifference
import ltd.kaizo.realestatemanager.utils.Utils.getStringFromPoiList
import ltd.kaizo.realestatemanager.utils.Utils.hideKeyboard
import ltd.kaizo.realestatemanager.utils.Utils.showSnackBar
import timber.log.Timber
import java.util.*


class AddFragment : BaseFragment() {
    private lateinit var estateViewModel: EstateViewModel
    private lateinit var parentActivity: EstateActivity
    private lateinit var binding: FragmentAddBinding
    private lateinit var adapter: PictureListAdapter
    private lateinit var datePickerDialog: DatePickerDialog
    private var sourceTag = 0
    private var estateId: Long = 0

    companion object {
        fun newInstance() = AddFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add, container, false)
        if (arguments != null) {
            this.sourceTag = this.arguments!!.getInt(ESTATE_SOURCE)
            this.estateId = this.arguments!!.getLong(ESTATE_ID)
        }
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
        this.configureButtonAndEvent()
        this.configureRecycleView()
    }

    private fun configureButtonAndEvent() {
        this.configureSpinner()
        this.configureFab()
        this.configureAddPoiBtn()
        this.configureDateInOnClickListener()

    }

    private fun configureMainPictureButton(estatePhoto: EstatePhoto) {

        when (estatePhoto.mainPicture) {
            true -> estatePhoto.mainPicture = false

            false -> {
                clearMainPictureInList()
                estatePhoto.mainPicture = true
            }
        }
        updateList(estateViewModel.pictureListTmp)
    }

    private fun clearMainPictureInList() {
        for (picture in estateViewModel.pictureListTmp) {
            picture.mainPicture = false
        }
    }

    private fun configureRemovePictureButton(estatePhoto: EstatePhoto) {
        estateViewModel.pictureListTmp.remove(estatePhoto)
        updateList(estateViewModel.pictureListTmp)
    }

    private fun configureRecycleView() {
        adapter = PictureListAdapter(estateViewModel.pictureList, RC_PICTURE_ITEM_EDIT) { photo, sourceCode ->
            when (sourceCode) {
                RC_PICTURE_LISTENER_VIEW -> onPictureItemClicked(photo)
                RC_PICTURE_LISTENER_FAVORITE -> this.configureMainPictureButton(photo)
                RC_PICTURE_LISTENER_REMOVE -> this.configureRemovePictureButton(photo)
            }
        }
        fragment_add_picture_list_recycle_view.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        fragment_add_picture_list_recycle_view.adapter = adapter
    }

    private fun updateList(list: List<EstatePhoto>) {
        estateViewModel.pictureList.clear()
        estateViewModel.pictureList.addAll(list)
        adapter.notifyDataSetChanged()
    }

    private fun onPictureItemClicked(estatePhoto: EstatePhoto) {
        //launch default image viewer on device to show the picture
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(estatePhoto.uri)))
    }

    private fun configureDateInOnClickListener() {
        fragment_add_date_edittext.setOnClickListener { configureDatePicker(RC_DATE_IN) }
    }

    private fun configureFab() {
        fragment_add_fab.setOnClickListener {
            showAddPictureAlertDialog()
        }
    }

    private fun configureAddPoiBtn() {
       fragment_add_add_poi_btn.setOnClickListener { this.showAddPoiAlertDialog() }
    }
    private fun configureSpinner() {
        val items = (0..15).toList()
        val adapter = ArrayAdapter(parentActivity, R.layout.support_simple_spinner_dropdown_item, items)
        fragment_add_nb_room_spinner.adapter = adapter
        fragment_add_nb_bedroom_spinner.adapter = adapter
        fragment_add_nb_bathroom_spinner.adapter = adapter
        fragment_add_constraint_layout.setOnClickListener { hideKeyboard(parentActivity) }

        val typeAdapter =
            ArrayAdapter(parentActivity, R.layout.support_simple_spinner_dropdown_item, estateViewModel.typeArray.value!!)
        fragment_add_type_spinner.adapter = typeAdapter

    }

    private fun configureViewModel() {
        parentActivity = activity as EstateActivity
        estateViewModel = parentActivity.estateViewModel
        binding.lifecycleOwner = this
        binding.estateViewModel = estateViewModel
        if (this.sourceTag == ESTATE_SOURCE_EDIT) {
            configureEstate()
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
            if (!estateViewModel.pictureListTmp.contains(picture)) {
                estateViewModel.pictureListTmp.add(picture)
            }
            updateList(estateViewModel.pictureListTmp)
        })
        //soldState switch
        estateViewModel.isSold.observe(this, Observer { booleanValue ->
            if (booleanValue) {
                configureDatePicker(RC_DATE_OUT)
            } else {
                estateViewModel.dateOut.value = ""
            }
        })
        //poi list
        estateViewModel.poiListTmp.observe(this, Observer { poiTmpList ->
            estateViewModel.poiList.value = getStringFromPoiList(poiTmpList)
        })
    }

    /****************************
     *********   EDIT   ********
     *****************************/

    private fun configureEstate() {
        val tmpEstate = estateViewModel.getEstateById(this.estateId)
        tmpEstate.observe(this, Observer { estate ->
            if (estate != null) {
                Timber.i("$estate")
                updateUi(estate)
                estateViewModel.estateId = estateId
            }
        })
    }

    private fun updateUi(estate: Estate) {
        //data
        estateViewModel.updateUiWithData(estate)
        //spinner
        fragment_add_nb_room_spinner.setSelection(estate.nbRoom + 1)
        fragment_add_nb_bathroom_spinner.setSelection(estate.nbBathroom + 1)
        fragment_add_nb_bedroom_spinner.setSelection(estate.nbBedroom + 1)
        //sold switch
        fragment_add_sold_switch.isChecked = estate.isSold
        if (estate.isSold) datePickerDialog.dismiss()
        //button
        fragment_add_create_button.text = getString(R.string.update)
        //picture list
        estateViewModel.getPictureListFromId(estateId).observe(this, Observer { pictureList ->
            estateViewModel.pictureListTmp.addAll(pictureList)
            updateList(estateViewModel.pictureListTmp)
        })
    }

     /****************************
     *********   DIALOG   ********
     *****************************/


    private fun configureDatePicker(source: Int) {
        val myCalendar = Calendar.getInstance()

        val date = DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
            val MyYear = add0ToDate(year)
            val MyMonth = add0ToDate(month+1)
            val MyDay = add0ToDate(dayOfMonth)
            myCalendar.set(Calendar.YEAR, year)
            myCalendar.set(Calendar.MONTH, month)
            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
            when (source) {
                RC_DATE_IN -> estateViewModel.dateIn.value = "$MyDay/$MyMonth/$MyYear"
                RC_DATE_OUT ->{
                    Timber.i("date 1 = ${estateViewModel.dateIn.value} et date 2 = $MyDay/$MyMonth/$MyYear")
                    if (checkDateDifference(estateViewModel.dateIn.value!!, "$MyDay/$MyMonth/$MyYear")) {
                        estateViewModel.dateOut.value = "$MyDay/$MyMonth/$MyYear"
                    } else {
                        estateViewModel.message.value = "error check your sale date"
                    }
            }
            }

        }
        datePickerDialog =
            DatePickerDialog(
                parentActivity, date, myCalendar
                    .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                myCalendar.get(Calendar.DAY_OF_MONTH)
            )
        datePickerDialog.setOnDismissListener {
            if (fragment_add_dateOut_textview.text == "") fragment_add_sold_switch.isChecked = false
        }
        datePickerDialog.show()
    }

    private fun showAddPictureAlertDialog() {
        val dialog = AddPictureDialogFragment()
        fragmentManager?.let { dialog.show(it, TAG_ADD_PICTURE_DIALOG) }
    }
    private fun showAddPoiAlertDialog() {
        val dialog = AddPoiDialogFragment()
        fragmentManager?.let { dialog.show(it, TAG_ADD_POI_DIALOG) }
    }
}
