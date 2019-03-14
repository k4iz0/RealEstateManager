package ltd.kaizo.realestatemanager.model

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
    @PrimaryKey
    var estateId: Long,
    val uri: String,
    var name: String = ""
)