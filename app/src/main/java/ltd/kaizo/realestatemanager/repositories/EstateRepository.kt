package ltd.kaizo.realestatemanager.repositories

import androidx.lifecycle.LiveData
import androidx.sqlite.db.SimpleSQLiteQuery
import ltd.kaizo.realestatemanager.database.EstateDao
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.model.EstatePhoto

class EstateRepository(val estateDao: EstateDao) {


    //GET
    fun getAllEstate(): LiveData<List<Estate>> {
        return estateDao.getAllEstate()
    }

    fun getEstateById(id: Long): LiveData<Estate> {
        return estateDao.getEstateById(id)
    }

    fun getPhotoListById(id: Long): LiveData<List<EstatePhoto>> {
        return estateDao.getPhotoListById(id)
    }

    //INSERT
    fun insertEstate(estate: Estate): Long {
        return estateDao.insertEstate(estate)
    }

    fun insertPhoto(estatePhoto: EstatePhoto): Long {
        return estateDao.insertPhoto(estatePhoto)
    }

    fun setMainPicture(estateId: Long, uri: String) {
        return estateDao.setMainPicture(estateId, uri)
    }

    fun getSearchResult(query: SimpleSQLiteQuery): List<Estate> {
        return estateDao.getSearchResult(query)
    }

    fun getAllPhoto(): LiveData<List<EstatePhoto>> {
        return estateDao.getAllPhoto()
    }
}
