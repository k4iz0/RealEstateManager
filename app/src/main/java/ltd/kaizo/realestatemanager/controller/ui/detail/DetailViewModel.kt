package ltd.kaizo.realestatemanager.controller.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.repositories.EstateRepository
import java.util.concurrent.Executor

class DetailViewModel(val estateDataSource: EstateRepository, val executor: Executor) : ViewModel() {

    fun getEstateById(id: Int): LiveData<Estate> {
        return estateDataSource.getEstateById(id)
    }

}