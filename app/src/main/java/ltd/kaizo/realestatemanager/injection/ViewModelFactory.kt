package ltd.kaizo.realestatemanager.injection

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ltd.kaizo.realestatemanager.repositories.EstateRepository
import java.util.concurrent.Executor

class ViewModelFactory(val estateDataSource : EstateRepository, val executor: Executor): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}