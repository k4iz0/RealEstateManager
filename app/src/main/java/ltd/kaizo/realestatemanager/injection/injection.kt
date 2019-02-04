package ltd.kaizo.realestatemanager.injection

import android.content.Context
import ltd.kaizo.realestatemanager.database.EstateDatabase
import ltd.kaizo.realestatemanager.repositories.EstateRepository
import java.util.concurrent.Executor
import java.util.concurrent.Executors

object injection {
    private fun provideEstateDataSource(context: Context) :EstateRepository{
        val database = EstateDatabase.getInstance(context)
        return EstateRepository(database!!.estateDao())
    }

    private fun provideExecutor(): Executor = Executors.newSingleThreadExecutor()

    fun provideViewModelFactory(context: Context):ViewModelFactory {
        val dataSourceKm = provideEstateDataSource(context)
        val executor = provideExecutor()
        return ViewModelFactory(dataSourceKm,executor)
    }

}