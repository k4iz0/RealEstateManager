package ltd.kaizo.realestatemanager.model

import android.content.ContentValues
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey


@Entity(
    foreignKeys = [ForeignKey(
        entity = Estate::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("estateId"),
        onDelete = CASCADE
    )]
)
data class EstatePhoto(
    @PrimaryKey(autoGenerate = true)
    var photoId: Long,
    @ColumnInfo(index = true)
    var estateId: Long,
    var uri: String,
    var name: String = "",
    var mainPicture: Boolean = false
)

fun fromContentValuesToEstatePhoto(values: ContentValues?): EstatePhoto {
    val photo = EstatePhoto(0, 0, "")
    if (values!!.containsKey("photoId")) photo.photoId = values.getAsLong("photoId")
    if (values.containsKey("estateId")) photo.estateId = values.getAsLong("estateId")
    if (values.containsKey("uri")) photo.uri = values.getAsString("uri")
    if (values.containsKey("name")) photo.name = values.getAsString("name")
    if (values.containsKey("mainPicture")) photo.mainPicture = values.getAsBoolean("mainPicture")

    return photo
}


