package ltd.kaizo.realestatemanager.repositories

import androidx.lifecycle.LiveData
import ltd.kaizo.realestatemanager.database.EstateDao
import ltd.kaizo.realestatemanager.model.Estate

class EstateRepository(val estateDao: EstateDao) {


    //GET
    fun getAllEstate(): LiveData<List<Estate>> {
        return estateDao.getAllEstate()
    }

}