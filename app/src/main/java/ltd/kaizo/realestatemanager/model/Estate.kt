package ltd.kaizo.realestatemanager.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Estate(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val mainPicture:String,
    val type: String,
    val price: Int,
    val surface: Int,
    val nbRoom: Int,
    val nbBathroom: Int,
    val nbBedroom: Int,
    val description: String,
    val address: String,
    val postalCode:String,
    val city:String,
    val poi: String,
    val isSold: Boolean,
    val dateIn: String,
    val dateOut: String?,
    val estateManager: String,
    val latitude:Double,
    val longitude:Double
)