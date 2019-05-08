package ltd.kaizo.realestatemanager

import android.content.ContentResolver
import android.content.ContentUris
import android.content.ContentValues
import androidx.room.Room
import androidx.test.platform.app.InstrumentationRegistry
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import ltd.kaizo.realestatemanager.database.AppDatabase
import ltd.kaizo.realestatemanager.provider.EstateContentProvider
import ltd.kaizo.realestatemanager.utils.DataRecordHelper.getGsonFromList
import org.junit.Before
import org.junit.Test


class ContentProviderTest {


    // FOR DATA
    private var mContentResolver: ContentResolver? = null

    @Before
    fun setUp() {
        Room.inMemoryDatabaseBuilder(
            InstrumentationRegistry.getInstrumentation().context,
            AppDatabase::class.java
        )
            .allowMainThreadQueries()
            .build()
        mContentResolver = InstrumentationRegistry.getInstrumentation().context.contentResolver
    }

    @Test
    fun getEstateWhenNoEstateInserted() {
        val cursor = mContentResolver!!.query(
            ContentUris.withAppendedId(EstateContentProvider.URI_ESTATE, 0),
            null,
            null,
            null,
            null
        )
        assertNotNull(cursor)
        assertEquals(0, cursor!!.count)
        cursor.close()
    }

    @Test
    fun insertAndGetEstate() {
        // BEFORE : Adding demo estate
        val userUri = mContentResolver!!.insert(EstateContentProvider.URI_ESTATE, generateEstate())
        // TEST
        val cursor = mContentResolver!!.query(
            ContentUris.withAppendedId(EstateContentProvider.URI_ESTATE, ESTATE_ID),
            null,
            null,
            null,
            null
        )
        assertNotNull(cursor)
        assertEquals(1, cursor!!.count)
        assertEquals(true, cursor.moveToFirst())
        assertEquals(2499000, cursor.getInt(cursor.getColumnIndexOrThrow("price")))
        assertEquals("House", cursor.getInt(cursor.getColumnIndexOrThrow("type")))
        assertEquals(300, cursor.getInt(cursor.getColumnIndexOrThrow("surface")))
    }


    private fun generateEstate(): ContentValues {
        val description = StringBuilder()
        description.append(
            "description", "Lorem ipsum dolor sit amet," +
                    " consectetur adipiscing elit. Donec et elementum erat." +
                    " Curabitur condimentum, lacus ac tempus porta, felis neque facilisis quam," +
                    " vel tempor est ex eget ipsum." +
                    " sed congue sem euismod sit amet. Nulla accumsan odio felis, ac malesuada lectus aliquam id." +
                    " Quisque est arcu, lacinia sed placerat at, tempus a mauris."
        )
        val contentValues = ContentValues()
        contentValues.put("id", 1000)
        contentValues.put("mainPicture", "content/test/picture")
        contentValues.put("type", "House")
        contentValues.put("price", 2499000)
        contentValues.put("surface", 300)
        contentValues.put("nbRoom", 10)
        contentValues.put("nbBathroom", 4)
        contentValues.put("nbBedroom", 2)
        contentValues.put("description", description.toString())
        contentValues.put("address", "beach road")
        contentValues.put("postalCode", "4568442")
        contentValues.put("city", "MALIBU")
        contentValues.put("poi", getGsonFromList(listOf("school","banks","restaurant")))
        contentValues.put("isSold", false)
        contentValues.put("dateIn", "10/02/2019")
        contentValues.put("estateManager", "Yann")
        contentValues.put("latitude", "0.0")
        contentValues.put("longitude", "0.0")

        return contentValues
    }

    companion object {
        // DATA SET FOR TEST
        private val ESTATE_ID: Long = 1000
    }
}