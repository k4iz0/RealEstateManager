package ltd.kaizo.realestatemanager.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Estate(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val type : String,
    val price : Int,
    val surface: Int,
    val nbRoom:Int,
    val nbBathroom:Int,
    val nbBedroom:Int,
    val description: String,
//    val photo:MutableList<String>,
    val address :String,
//    val poi: MutableList<String>,
    val status:String,
    val dateIn:String,
    val dateOut:String,
    val estateManager:String )