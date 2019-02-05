package ltd.kaizo.realestatemanager.injection

import android.content.Context
import ltd.kaizo.realestatemanager.database.AppDatabase
import ltd.kaizo.realestatemanager.repositories.EstateRepository
import java.util.concurrent.Executor
import java.util.concurrent.Executors

object Injection {
    private fun provideEstateDataSource(context: Context) :EstateRepository{
        val database = AppDatabase.getInstance(context)
        return EstateRepository(database!!.estateDao())
    }

    private fun provideExecutor(): Executor = Executors.newSingleThreadExecutor()

    fun provideViewModelFactory(context: Context):ViewModelFactory {
        val dataSourceKm = provideEstateDataSource(context)
        val executor = provideExecutor()
        return ViewModelFactory(dataSourceKm,executor)
    }

}