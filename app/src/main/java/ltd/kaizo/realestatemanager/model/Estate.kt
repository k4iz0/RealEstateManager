package ltd.kaizo.realestatemanager.model

import android.content.ContentValues
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Estate(
    @PrimaryKey(autoGenerate = true)
    var id: Long,
    var mainPicture: String,
    var type: String,
    var price: Int,
    var surface: Int,
    var nbRoom: Int,
    var nbBathroom: Int,
    var nbBedroom: Int,
    var description: String,
    var address: String,
    var postalCode: String,
    var city: String,
    var poi: String,
    var isSold: Boolean,
    var dateIn: String,
    var dateOut: String?,
    var estateManager: String,
    var latitude: Double,
    var longitude: Double
)

fun fromContentValuesToEstate(values: ContentValues?): Estate {
    val estate = Estate(
        0,
        "",
        "",
        0,
        0,
        0,
        0,
        0,
        "",
        "",
        "",
        "",
        "",
        false,
        "",
        "",
        "",
        0.0,
        0.0
    )
    if (values!!.containsKey("id")) estate.id = values.getAsLong("id")
    if (values.containsKey("mainPicture")) estate.mainPicture = values.getAsString("mainPicture")
    if (values.containsKey("type")) estate.type = values.getAsString("type")
    if (values.containsKey("price")) estate.price = values.getAsInteger("price")
    if (values.containsKey("surface")) estate.surface = values.getAsInteger("surface")
    if (values.containsKey("nbRoom")) estate.nbRoom = values.getAsInteger("nbRoom")
    if (values.containsKey("nbBathroom")) estate.nbBathroom = values.getAsInteger("nbBathroom")
    if (values.containsKey("nbBedroom")) estate.nbBedroom = values.getAsInteger("nbBedroom")
    if (values.containsKey("description")) estate.description = values.getAsString("description")
    if (values.containsKey("address")) estate.address = values.getAsString("address")
    if (values.containsKey("postalCode")) estate.postalCode = values.getAsString("postalCode")
    if (values.containsKey("city")) estate.city = values.getAsString("city")
    if (values.containsKey("poi")) estate.poi = values.getAsString("poi")
    if (values.containsKey("isSold")) estate.isSold = values.getAsBoolean("isSold")
    if (values.containsKey("dateIn")) estate.dateIn = values.getAsString("dateIn")
    if (values.containsKey("dateOut")) estate.dateOut = values.getAsString("dateOut")
    if (values.containsKey("estateManager")) estate.estateManager = values.getAsString("estateManager")
    if (values.containsKey("latitude")) estate.latitude = values.getAsDouble("latitude")
    if (values.containsKey("longitude")) estate.longitude = values.getAsDouble("longitude")

    return estate
}