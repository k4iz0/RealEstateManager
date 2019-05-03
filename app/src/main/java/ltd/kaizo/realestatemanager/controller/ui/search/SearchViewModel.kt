package ltd.kaizo.realestatemanager.controller.ui.search

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.sqlite.db.SimpleSQLiteQuery
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.repositories.EstateRepository
import timber.log.Timber
import java.util.concurrent.Executor

class SearchViewModel(private val estateDataSource: EstateRepository, private val executor: Executor) : ViewModel() {

    val pictureList = estateDataSource.getAllPhoto()
    var argsList = mutableListOf<Any>()
    val message = MutableLiveData<String>()
    lateinit var searchResult: List<Estate>
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
    var pictureLimit = 0

    fun launchSearchRequest() {
        val sqliteQuery = SimpleSQLiteQuery(configureQuery(), argsList.toTypedArray())
        executor.execute {
            searchResult = estateDataSource.getSearchResult(sqliteQuery)
            resultList.postValue(searchResult)
        }

    }

     fun configureQuery(): String {

        var query = "SELECT * FROM Estate"
        this.argsList = mutableListOf()
        var containsCondition = false
        if (type.value != 0 && type.value != null) {
            query += if (containsCondition) " AND " else " WHERE "; containsCondition = true
            query += "type=?"
            argsList.add(typeArray.value!![type.value!!])
        }
        if (!surfaceMini.value.isNullOrBlank()) {
            query += if (containsCondition) " AND " else " WHERE "; containsCondition = true
            query += "surface >= ?"
            argsList.add(surfaceMini.value!!)
        }
        if (!surfaceMaxi.value.isNullOrBlank()) {
            query += if (containsCondition) " AND " else " WHERE "; containsCondition = true
            query += "surface <= ?"
            argsList.add(surfaceMaxi.value!!)
        }
        if (!nbRoomMini.value.isNullOrBlank()) {
            query += if (containsCondition) " AND " else " WHERE "; containsCondition = true
            query += "nbRoom >= ?"
            argsList.add(nbRoomMini.value!!.toInt())
        }
        if (!nbRoomMaxi.value.isNullOrBlank()) {
            query += if (containsCondition) " AND " else " WHERE "; containsCondition = true
            query += "nbRoom <= ?"
            argsList.add(nbRoomMaxi.value!!.toInt())
        }
        if (!nbBedroomMini.value.isNullOrBlank()) {
            query += if (containsCondition) " AND " else " WHERE "; containsCondition = true
            query += "nbBedroom >= ?"
            argsList.add(nbBedroomMini.value!!.toInt())
        }
        if (!nbBedroomMaxi.value.isNullOrBlank()) {
            query += if (containsCondition) " AND " else " WHERE "; containsCondition = true
            query += "nbBedroom <= ?"
            argsList.add(nbBedroomMaxi.value!!.toInt())
        }
        if (!nbBathroomMini.value.isNullOrBlank()) {
            query += if (containsCondition) " AND " else " WHERE "; containsCondition = true
            query += "nbBathroom >= ?"
            argsList.add(nbBathroomMini.value!!.toInt())
        }
         if (!nbBathroomMaxi.value.isNullOrBlank()) {
             query += if (containsCondition) " AND " else " WHERE "; containsCondition = true
             query += "nbBathroom <= ?"
             argsList.add(nbBathroomMaxi.value!!.toInt())
         }
         if (!priceMini.value.isNullOrBlank()) {
            query += if (containsCondition) " AND " else " WHERE "; containsCondition = true
            query += "price >= ?"
            argsList.add(priceMini.value!!.toInt())
        }
         if (!priceMaxi.value.isNullOrBlank()) {
            query += if (containsCondition) " AND " else " WHERE "; containsCondition = true
            query += "price <= ?"
            argsList.add(priceMaxi.value!!.toInt())
        }
        if (!area.value.isNullOrBlank()) {
            query += if (containsCondition) " AND " else " WHERE "; containsCondition = true
            query += "("
            query += "address  LIKE ?"
            argsList.add("%" + area.value!! + "%")
            query += " OR city LIKE ?"
            argsList.add("%" + area.value!! + "%")
            query += " OR postalCode LIKE ?"
            argsList.add("%" + area.value!! + "%")
            query += ")"
        }
        if (!dateInMini.value.isNullOrBlank()) {
            query += if (containsCondition) " AND " else " WHERE "; containsCondition = true
            query += "dateIn >= ?"
            argsList.add(dateInMini.value!!)
        }
        if (!dateInMaxi.value.isNullOrBlank()) {
            query += if (containsCondition) " AND " else " WHERE "; containsCondition = true
            query += "dateIn <= ?"
            argsList.add(dateInMaxi.value!!)
        }
        if (!dateOutMini.value.isNullOrBlank()) {
            query += if (containsCondition) " AND " else " WHERE "; containsCondition = true
            query += "dateOut >= ?"
            argsList.add(dateOutMini.value!!)
        }
        if (!dateOutMaxi.value.isNullOrBlank()) {
            query += if (containsCondition) " AND " else " WHERE "; containsCondition = true
            query += "dateOut <= ?"
            argsList.add(dateOutMaxi.value!!)
        }
        if (!pictureMini.value.isNullOrBlank()) {
            pictureLimit = pictureMini.value!!.toInt()
        }
        if (poiListTmp.value == null) poiListTmp.value = mutableListOf()
        if (poiListTmp.value!!.size > 0 && poiListTmp.value != null) {
            for (poi in poiListTmp.value!!) {
                query += if (containsCondition) " AND " else " WHERE "; containsCondition = true
                query += "poi like ?"
                argsList.add("%$poi%")
            }
        }
        return query

    }

}
