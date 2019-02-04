package ltd.kaizo.realestatemanager.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.utils.DATABASE_NAME

@Database(entities = [Estate::class], version = 1, exportSchema = false)
abstract class EstateDatabase : RoomDatabase() {
    abstract fun estateDao(): EstateDao

        companion object {
            private var instance: EstateDatabase? = null
            fun getInstance(context: Context): EstateDatabase? {
                if (instance == null) {
                    synchronized(EstateDatabase::class) {
                        instance = Room.databaseBuilder(
                            context.applicationContext,
                            EstateDatabase::class.java, DATABASE_NAME
                        )
                            .build()
                    }
                }
                return instance
            }
        }
}