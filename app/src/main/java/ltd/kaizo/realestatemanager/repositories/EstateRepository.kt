package ltd.kaizo.realestatemanager.repositories

import androidx.lifecycle.LiveData
import ltd.kaizo.realestatemanager.database.EstateDao
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.model.Photo

class EstateRepository(val estateDao: EstateDao) {


    //GET
    fun getAllEstate(): LiveData<List<Estate>> {
        return estateDao.getAllEstate()
    }

    fun getEstateById(id:Int): LiveData<Estate> {
        return estateDao.getEstateById(id)
    }

    fun getPhotoListById(id: Int): LiveData<List<Photo>> {
        return estateDao.getPhotoListById(id)
    }
    //INSERT
    fun insertEstate(estate: Estate) {
        return estateDao.insertEstate(estate)
    }

    fun insertPhoto(photo: Photo) {
        return estateDao.insertPhoto(photo)
    }
}