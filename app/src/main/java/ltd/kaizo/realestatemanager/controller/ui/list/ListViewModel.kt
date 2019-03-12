package ltd.kaizo.realestatemanager.controller.ui.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.repositories.EstateRepository
import java.util.concurrent.Executor

class ListViewModel(val estateDataSource:EstateRepository, val executor: Executor) : ViewModel() {
val estateList = estateDataSource.getAllEstate()

    fun getEstateById(id: Int): LiveData<Estate> {
        return estateDataSource.getEstateById(id)
    }

}
