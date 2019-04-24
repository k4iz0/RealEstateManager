package ltd.kaizo.realestatemanager.provider

import android.content.ContentProvider
import android.content.ContentUris
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri
import androidx.room.RoomMasterTable
import ltd.kaizo.realestatemanager.database.AppDatabase
import ltd.kaizo.realestatemanager.model.EstatePhoto
import ltd.kaizo.realestatemanager.model.fromContentValuesToEstatePhoto

class EstatePhotoContentProvider:ContentProvider() {
    val AUTHORITY = "ltd.kaizo.realestatemanager.provider"
    val PHOTO_TABLE_NAME = EstatePhoto::class.java.simpleName
    val URI_PHOTO = Uri.parse("content://$AUTHORITY/${RoomMasterTable.TABLE_NAME}")

    override fun onCreate(): Boolean {
        return true
    }

    override fun query(
        uri: Uri,
        projection: Array<String>?,
        selection: String?,
        selectionArgs: Array<String>?,
        sortOrder: String?
    ): Cursor? {
        if (context != null) {
            val userId = ContentUris.parseId(uri)
            val cursor = AppDatabase.getInstance(context!!)?.estateDao()?.getPhotoListByIdWithCursor(userId)
            cursor?.setNotificationUri(context!!.contentResolver,uri)
        }
        throw IllegalArgumentException("Failed to query row for uri " + uri)
    }

    override fun getType(uri: Uri): String? {
    return "vnd.android.cursor.photo/ $AUTHORITY.$PHOTO_TABLE_NAME"
    }


    override fun insert(uri: Uri, contentValues: ContentValues?): Uri? {
        if (context != null){
            val  id:Long = AppDatabase.getInstance(context!!)!!.estateDao().insertPhoto(fromContentValuesToEstatePhoto(contentValues))
            if (id.toInt() != 0){
                context!!.contentResolver.notifyChange(uri, null)
                return ContentUris.withAppendedId(uri, id)
            }
        }

        throw IllegalArgumentException("Failed to insert row into " + uri);
    }

    override fun update(uri: Uri, values: ContentValues?, selection: String?, selectionArgs: Array<String>?): Int {
        return 0
    }

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<String>?): Int {
        return 0
    }
}