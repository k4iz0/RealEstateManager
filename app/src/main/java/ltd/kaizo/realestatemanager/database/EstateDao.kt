package ltd.kaizo.realestatemanager.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.model.Photo

@Dao
interface EstateDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertEstate(estate: Estate):Long

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertPhoto(photo: Photo)

    @Query("SELECT * FROM estate")
    fun getAllEstate(): LiveData<List<Estate>>

    @Query("SELECT * FROM estate WHERE id=:id")
    fun getEstateById(id: Long): LiveData<Estate>

    @Query("SELECT * FROM photo WHERE estateId=:id")
    fun getPhotoListById(id: Long) : LiveData<List<Photo>>

    @Query("UPDATE estate SET mainPicture=:uri WHERE id=:estateId")
    fun setMainPicture(estateId:Long, uri:String)
}