package ltd.kaizo.realestatemanager.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import ltd.kaizo.realestatemanager.model.Estate

@Dao
interface EstateDao {

    @Insert
    fun insertEstate(estate: Estate)

    @Query("SELECT * FROM estate")
    fun getAllEstate(): LiveData<List<Estate>>

    @Query("SELECT * FROM estate WHERE id=:id")
    fun getEstateById(id:Int):LiveData<Estate>

}