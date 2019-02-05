package ltd.kaizo.realestatemanager.controller.ui.list

import androidx.lifecycle.ViewModel
import ltd.kaizo.realestatemanager.repositories.EstateRepository
import java.util.concurrent.Executor

class ListViewModel(estateDataSource:EstateRepository, executor: Executor) : ViewModel() {
val estateList = estateDataSource.getAllEstate()
}
