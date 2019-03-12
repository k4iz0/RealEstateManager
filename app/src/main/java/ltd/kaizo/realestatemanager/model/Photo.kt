package ltd.kaizo.realestatemanager.model

import android.net.Uri
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
data class Photo(
    @PrimaryKey(autoGenerate = true)
    val estateId:Int ,
    val uri: String,
    var name: String =""
)