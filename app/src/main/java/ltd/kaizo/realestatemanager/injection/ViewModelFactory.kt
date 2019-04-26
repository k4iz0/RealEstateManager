package ltd.kaizo.realestatemanager.injection

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ltd.kaizo.realestatemanager.controller.ui.add.EstateViewModel
import ltd.kaizo.realestatemanager.controller.ui.list.ListViewModel
import ltd.kaizo.realestatemanager.controller.ui.loan.LoanSimViewModel
import ltd.kaizo.realestatemanager.controller.ui.map.MapViewModel
import ltd.kaizo.realestatemanager.controller.ui.search.SearchViewModel
import ltd.kaizo.realestatemanager.repositories.EstateRepository
import java.util.concurrent.Executor

class ViewModelFactory(private val estateDataSource: EstateRepository, private val executor: Executor) :
    ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        if (modelClass.isAssignableFrom(ListViewModel::class.java)) {
            return ListViewModel(estateDataSource) as T
        }
        if (modelClass.isAssignableFrom(EstateViewModel::class.java)) {
            return EstateViewModel(estateDataSource, executor) as T
        }
        if (modelClass.isAssignableFrom(MapViewModel::class.java)) {
            return MapViewModel(estateDataSource, executor) as T
        }
        if (modelClass.isAssignableFrom(SearchViewModel::class.java)) {
            return SearchViewModel(estateDataSource, executor) as T
        }
        if (modelClass.isAssignableFrom(LoanSimViewModel::class.java)) {
            return LoanSimViewModel() as T
        }

        throw IllegalArgumentException("Unknown ViewModel class")

    }
}