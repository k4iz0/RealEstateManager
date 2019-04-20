package ltd.kaizo.realestatemanager.controller.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
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
    val poiList = MutableLiveData<String>()
    val type = MutableLiveData<Int>()
    val dateInMini = MutableLiveData<String>()
    val dateInMaxi = MutableLiveData<String>()
    val dateOutMini = MutableLiveData<String>()
    val dateOutMaxi = MutableLiveData<String>()
    val poiListTmp = MutableLiveData<MutableList<String>>()
    val typeArray = MutableLiveData<Array<String>>()

    init {
        launchSearchRequest()
    }

    fun launchSearchRequest() {
        val sqliteQuery = SimpleSQLiteQuery(configureQuery(), arrayOf(argsList))
        if (argsList.size == 0) {
            executor.execute { searchResult = estateDataSource.getAllEstate() }
        } else {
            executor.execute { searchResult = estateDataSource.getSearchResult(sqliteQuery) }
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
            query += " surface >= ?"
            argsList.add(surfaceMini.value!!.toInt())
        }
        if (!surfaceMaxi.value.isNullOrBlank()) {
            query += checkCondition
            query += "surface <= ?"
            argsList.add(surfaceMini.value!!.toInt())
        }
        return query

    }

}
