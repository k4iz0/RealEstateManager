package ltd.kaizo.realestatemanager.controller.ui.search


import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.fragment_search.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.controller.ui.base.BaseFragment
import ltd.kaizo.realestatemanager.controller.ui.list.ListActivity
import ltd.kaizo.realestatemanager.databinding.FragmentSearchBinding
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.model.EstatePhoto
import ltd.kaizo.realestatemanager.utils.*
import ltd.kaizo.realestatemanager.utils.DataRecordHelper.getGsonFromEstateList
import ltd.kaizo.realestatemanager.utils.DateUtils.add0ToDate
import ltd.kaizo.realestatemanager.utils.Utils.showAddPoiAlertDialog
import java.util.*

class SearchFragment : BaseFragment() {
    private lateinit var searchViewModel: SearchViewModel
    private lateinit var binding: FragmentSearchBinding
    private lateinit var parentActivity: SearchActivity
    private lateinit var datePickerDialog: DatePickerDialog
    private lateinit var pictureFilteredList: List<EstatePhoto>

    override val fragmentLayout = R.layout.fragment_search

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_search, container, false)
        return binding.root
    }

    override fun configureDesign() {}

    override fun updateDesign() {
        this.configureViewModel()
        this.configureObserver()
        this.configureEvents()
        this.configureSpinner()
    }

    private fun configureViewModel() {
        parentActivity = activity as SearchActivity
        searchViewModel = parentActivity.searchViewModel
        binding.lifecycleOwner = this
        binding.searchViewModel = searchViewModel
        val array = arrayOf(getString(R.string.all))
        array + resources.getStringArray(R.array.typeArray)
        searchViewModel.typeArray.value = array + resources.getStringArray(R.array.typeArray)
    }

    private fun configureObserver() {
        //pictureFilteredList
        searchViewModel.pictureList.observe(this, Observer { pictureList ->
            this.pictureFilteredList = pictureList
        })

        //search result list
        searchViewModel.resultList.observe(this, Observer { resultList ->
            val finalList = mutableListOf<Estate>()
            if (resultList.size > 0 && resultList != null) {
                if (searchViewModel.pictureLimit != 0) {
                    finalList.addAll(getFilteredPictureList(resultList.toMutableList(), searchViewModel.pictureLimit))
                } else {
                    finalList.addAll(resultList)
                }
                launchListActivity(finalList)
            } else {
                searchViewModel.message.value = getString(R.string.no_result_found)
            }
        })

    }

    private fun getFilteredPictureList(tmpList: MutableList<Estate>, limit: Int): MutableList<Estate> {
        val finalList = mutableListOf<Estate>()
        val pictureListFiltered =
            pictureFilteredList
                .groupingBy { it.estateId } //group by Id
                .eachCount() // count picture
                .filter { it.value >= limit } //filter by limit
                .toList()
        for (estate in tmpList) {
            for (id in pictureListFiltered) {
                if (id.first == estate.id) {
                    finalList.add(estate)
                }
            }
        }
        return finalList
    }

    private fun launchListActivity(resultList: List<Estate>) {
        val listActivity = Intent(parentActivity, ListActivity::class.java)
        listActivity.putExtra(ESTATE_LIST, getGsonFromEstateList(resultList))
        startActivity(listActivity)
    }


    private fun configureEvents() {
        this.configureAddPoiBtn()
        this.configureDateButton()
    }

    private fun configureSpinner() {
        val typeAdapter =
            ArrayAdapter(
                parentActivity,
                R.layout.support_simple_spinner_dropdown_item,
                searchViewModel.typeArray.value!!
            )
        fragment_add_type_spinner.adapter = typeAdapter

    }

    private fun configureDateButton() {
        fragment_search_date_in__mini_textview.setOnClickListener { configureDatePicker(RC_DATE_IN_MINI) }
        fragment_search_date_in__maxi_textview.setOnClickListener { configureDatePicker(RC_DATE_IN_MAXI) }
        fragment_search_date_out_mini_textview.setOnClickListener { configureDatePicker(RC_DATE_OUT_MINI) }
        fragment_search_date_out_maxi_textview.setOnClickListener { configureDatePicker(RC_DATE_OUT_MAXI) }
    }

    private fun configureAddPoiBtn() {
        fragment_search_poi_btn.setOnClickListener { showAddPoiAlertDialog(fragmentManager, ESTATE_SOURCE_SEARCH) }
    }

    private fun configureDatePicker(source: Int) {
        val myCalendar = Calendar.getInstance()
        val date = DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
            val MyYear = add0ToDate(year)
            val MyMonth = add0ToDate(month + 1)
            val MyDay = add0ToDate(dayOfMonth)
            myCalendar.set(Calendar.YEAR, year)
            myCalendar.set(Calendar.MONTH, month)
            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
            when (source) {
                RC_DATE_IN_MINI -> searchViewModel.dateInMini.value = "$MyDay/$MyMonth/$MyYear"
                RC_DATE_IN_MAXI -> searchViewModel.dateInMaxi.value = "$MyDay/$MyMonth/$MyYear"
                RC_DATE_OUT_MINI -> searchViewModel.dateOutMini.value = "$MyDay/$MyMonth/$MyYear"
                RC_DATE_OUT_MAXI -> searchViewModel.dateOutMaxi.value = "$MyDay/$MyMonth/$MyYear"
            }
        }
        datePickerDialog =
            DatePickerDialog(
                parentActivity, date, myCalendar
                    .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                myCalendar.get(Calendar.DAY_OF_MONTH)
            )
        datePickerDialog.show()
    }
}
