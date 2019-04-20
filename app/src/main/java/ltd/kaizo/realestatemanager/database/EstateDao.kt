package ltd.kaizo.realestatemanager.database

import android.database.Cursor
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.model.EstatePhoto

@Dao
interface EstateDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertEstate(estate: Estate): Long

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertPhoto(estatePhoto: EstatePhoto):Long

    @Query("SELECT * FROM estate")
    fun getAllEstate(): LiveData<List<Estate>>

    @Query("SELECT * FROM estate WHERE id=:id")
    fun getEstateById(id: Long): LiveData<Estate>

    @Query("SELECT * FROM EstatePhoto WHERE estateId=:id")
    fun getPhotoListById(id: Long): LiveData<List<EstatePhoto>>

    @Query("SELECT * FROM EstatePhoto WHERE estateId=:id")
    fun getPhotoListByIdWithCursor(id: Long): Cursor

    @Query("UPDATE estate SET mainPicture=:uri WHERE id=:estateId")
    fun setMainPicture(estateId: Long, uri: String)

    @Query("UPDATE estate SET latitude=:latitude, longitude=:longitude WHERE id=:estateId")
    fun updateLatLng(estateId: Long, latitude:Double, longitude:Double)
    
    @RawQuery(observedEntities =[Estate::class])
    fun getSearchResult(query: SimpleSQLiteQuery):LiveData<List<Estate>>
}
