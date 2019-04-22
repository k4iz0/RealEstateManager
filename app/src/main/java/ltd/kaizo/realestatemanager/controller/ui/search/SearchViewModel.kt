package ltd.kaizo.realestatemanager.controller.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.sqlite.db.SimpleSQLiteQuery
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.repositories.EstateRepository
import timber.log.Timber
import java.util.concurrent.Executor

class SearchViewModel(private val estateDataSource: EstateRepository, private val executor: Executor) : ViewModel() {
    private var argsList = mutableListOf<Any>()
    val message = MutableLiveData<String>()
    lateinit var searchResult: LiveData<List<Estate>>
    var resultList = MutableLiveData<List<Estate>>()
    val area = MutableLiveData<String>()
    val surfaceMini = MutableLiveData<String>()
    val surfaceMaxi = MutableLiveData<String>()
    val nbRoomMini = MutableLiveData<String>()
    val nbRoomMaxi = MutableLiveData<String>()
    val nbBedroomMini = MutableLiveData<String>()
    val nbBedroomMaxi = MutableLiveData<String>()
    val nbBathroomMini = MutableLiveData<String>()
    val nbBathroomMaxi = MutableLiveData<String>()
    val priceMini = MutableLiveData<String>()
    val priceMaxi = MutableLiveData<String>()
    val pictureMini = MutableLiveData<String>()
    val poiList = MutableLiveData<String>()
    val type = MutableLiveData<Int>()
    val dateInMini = MutableLiveData<String>()
    val dateInMaxi = MutableLiveData<String>()
    val dateOutMini = MutableLiveData<String>()
    val dateOutMaxi = MutableLiveData<String>()
    val poiListTmp = MutableLiveData<MutableList<String>>()
    val typeArray = MutableLiveData<Array<String>>()

    init {
        resultList.value = mutableListOf()
    }

    fun launchSearchRequest() {
        val sqliteQuery = SimpleSQLiteQuery(configureQuery(), arrayOf(argsList))
        Timber.i("argsList = $argsList")
        if (argsList.size == 0) {
            executor.execute { searchResult = estateDataSource.getAllEstate() }
        } else {
            executor.execute {
                searchResult = estateDataSource.getSearchResult(sqliteQuery)
                resultList.postValue(searchResult.value)
            }
        }

    }

    private fun configureQuery(): String {
        Timber.i(
            """area = ${area.value}
surfaceMini = ${surfaceMini.value}
surfaceMaxi = ${surfaceMaxi.value}
nbRoomMaxi = ${nbRoomMaxi.value}
spinner = ${type.value}
dateInMini = ${dateInMini.value}
dateInMaxi = ${dateInMaxi.value}
dateOutMini = ${dateOutMini.value}
dateOutMaxi = ${dateOutMaxi.value}
"""
        )
        var query = "SELECT * FROM estate"
        this.argsList = mutableListOf()
        var containsCondition = false
        val checkCondition = if (containsCondition) " AND " else " WHERE "; containsCondition = true
        if (type.value != 0 && type.value != null) {
            query += checkCondition
            query += "type=?"
            argsList.add(typeArray.value!![type.value!!])
        }
        if (!surfaceMini.value.isNullOrBlank()) {
            query += checkCondition
            query += "surface >= ?"
            argsList.add(surfaceMini.value!!)
        }
        if (!surfaceMaxi.value.isNullOrBlank()) {
            query += checkCondition
            query += "surface <= ?"
            argsList.add(surfaceMaxi.value!!)
        }
        if (!nbRoomMini.value.isNullOrBlank()) {
            query += checkCondition
            query += "nbRoom >= ?"
            argsList.add(nbRoomMini.value!!.toInt())
        }
        if (!nbRoomMaxi.value.isNullOrBlank()) {
            query += checkCondition
            query += "nbRoom <= ?"
            argsList.add(nbRoomMaxi.value!!.toInt())
        }
        if (!nbBedroomMini.value.isNullOrBlank()) {
            query += checkCondition
            query += "nbBedroom >= ?"
            argsList.add(nbBedroomMini.value!!.toInt())
        }
        if (!nbBedroomMaxi.value.isNullOrBlank()) {
            query += checkCondition
            query += "nbBedroom <= ?"
            argsList.add(nbBedroomMaxi.value!!.toInt())
        }
         if (!nbBathroomMini.value.isNullOrBlank()) {
            query += checkCondition
            query += "nbBathroom >= ?"
            argsList.add(nbBathroomMini.value!!.toInt())
        }
        if (!nbBathroomMaxi.value.isNullOrBlank()) {
            query += checkCondition
            query += "nbBathroom <= ?"
            argsList.add(nbBathroomMaxi.value!!.toInt())
        }
         if (!priceMini.value.isNullOrBlank()) {
            query += checkCondition
            query += "price >= ?"
            argsList.add(priceMini.value!!.toInt())
        }
        if (!priceMaxi.value.isNullOrBlank()) {
            query += checkCondition
            query += "price <= ?"
            argsList.add(priceMaxi.value!!.toInt())
        }
        if (!area.value.isNullOrBlank()) {
            query += checkCondition
            query += "address  LIKE ? OR city LIKE ?"
            argsList.add(area.value!!)
        }

        return query

    }

}
