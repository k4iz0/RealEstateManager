package ltd.kaizo.realestatemanager.database

import android.content.ContentValues
import android.content.Context
import android.telecom.Call
import androidx.room.Database
import androidx.room.OnConflictStrategy
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.utils.DATABASE_NAME

@Database(entities = [Estate::class], version = 1, exportSchema = false)
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
                            .addCallback(fillDB())
                            .build()
                    }
                }
                return instance
            }
            private fun fillDB() :Callback{
               return object : RoomDatabase.Callback() {
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                        val contentValues = ContentValues()
                            contentValues.put("id",1)
                            contentValues.put("type","Loft")
                            contentValues.put("price",3299000)
                            contentValues.put("surface",300)
                            contentValues.put("nbRoom",5)
                            contentValues.put("nbBedroom",5)
                            contentValues.put("nbBathroom",2)
                            contentValues.put("description","Lorem ipsum dolor sit amet," +
                                    " consectetur adipiscing elit. Donec et elementum erat." +
                                    " Curabitur condimentum, lacus ac tempus porta, felis neque facilisis quam," +
                                    " vel tempor est ex eget ipsum." +
                                    " Proin blandit scelerisque ullamcorper. Praesent sed venenatis lectus." +
                                    " Maecenas cursus sollicitudin justo," +
                                    " sed accumsan est fermentum accumsan. Nam volutpat odio libero," +
                                    " sit amet rhoncus neque laoreet sed. Nulla tempus turpis eget risus facilisis condimentum." +
                                    " Sed ut augue quis urna mattis viverra. Maecenas neque mauris, interdum mollis tincidunt eu," +
                                    " congue nec elit. Duis tempus mi a convallis faucibus. Curabitur finibus congue sapien," +
                                    " sed congue sem euismod sit amet. Nulla accumsan odio felis, ac malesuada lectus aliquam id." +
                                    " Quisque est arcu, lacinia sed placerat at, tempus a mauris.")
                            contentValues.put("address","rue Malibu 4568442 MALIBU")
                            contentValues.put("isAvailable","rue Malibu 4568442 MALIBU")
                            contentValues.put("dateIn","01/02/2019")
                            contentValues.put("dateOut","")
                            contentValues.put("estateManager","Yann")
                        db.insert("Estate", OnConflictStrategy.IGNORE, contentValues)
                    }
                }
            }



    }

}