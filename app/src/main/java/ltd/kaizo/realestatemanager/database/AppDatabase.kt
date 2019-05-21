package ltd.kaizo.realestatemanager.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.model.EstatePhoto
import ltd.kaizo.realestatemanager.utils.DATABASE_NAME
import ltd.kaizo.realestatemanager.utils.DateConverter

@Database(entities = [Estate::class, EstatePhoto::class], version = 2, exportSchema = false)
@TypeConverters(DateConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun estateDao(): EstateDao

    companion object {
        private var instance: AppDatabase? = null
                fun getInstance(context: Context): AppDatabase? {
                    if (instance == null) {
                        synchronized(AppDatabase::class) {
                            instance = Room.databaseBuilder(
                                context.applicationContext,
                                AppDatabase::class.java, DATABASE_NAME
                            )
                                .fallbackToDestructiveMigration()
                                .build()
                        }
            }
            return instance
        }
    }

}