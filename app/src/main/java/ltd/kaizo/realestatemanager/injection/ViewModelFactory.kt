package ltd.kaizo.realestatemanager.injection

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ltd.kaizo.realestatemanager.controller.ui.detail.DetailViewModel
import ltd.kaizo.realestatemanager.controller.ui.list.ListViewModel
import ltd.kaizo.realestatemanager.repositories.EstateRepository
import java.util.concurrent.Executor

class ViewModelFactory(private val estateDataSource : EstateRepository, private val executor: Executor): ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        if (modelClass.isAssignableFrom(ListViewModel::class.java)) {
            return ListViewModel(estateDataSource, executor) as T
        }else if (modelClass.isAssignableFrom(DetailViewModel::class.java)) {
            return DetailViewModel(estateDataSource,executor) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")

    }
}