package ltd.kaizo.realestatemanager.repositories

import androidx.lifecycle.LiveData
import ltd.kaizo.realestatemanager.database.EstateDao
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.model.Photo
import timber.log.Timber

class EstateRepository(val estateDao: EstateDao) {


    //GET
    fun getAllEstate(): LiveData<List<Estate>> {
        return estateDao.getAllEstate()
    }

    fun getEstateById(id:Long): LiveData<Estate> {
        return estateDao.getEstateById(id)
    }

    fun getPhotoListById(id: Long): LiveData<List<Photo>> {
        return estateDao.getPhotoListById(id)
    }
    //INSERT
    fun insertEstate(estate: Estate): Long {
        return estateDao.insertEstate(estate)
    }

    fun insertPhoto(photo: Photo) {
        return estateDao.insertPhoto(photo)
    }

    fun setMainPicture(estateId: Long, uri: String) {
        return estateDao.setMainPicture(estateId, uri)
    }
}