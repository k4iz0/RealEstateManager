package ltd.kaizo.realestatemanager.controller.ui.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.model.Photo
import ltd.kaizo.realestatemanager.repositories.EstateRepository
import java.util.concurrent.Executor

class ListViewModel(val estateDataSource:EstateRepository, val executor: Executor) : ViewModel() {
    val estateList = estateDataSource.getAllEstate()
    val estateid = MutableLiveData<Long>()
    fun getEstateById(id: Long): LiveData<Estate> {
        return estateDataSource.getEstateById(id)
    }

    fun getPictureListFromId(id :Long):LiveData<List<Photo>> {
        return  estateDataSource.getPhotoListById(id)
    }

}
