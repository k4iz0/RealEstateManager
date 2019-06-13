package ltd.kaizo.realestatemanager.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\'J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\'J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\'J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\'J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0005H\'J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0007H\'J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH\'J \u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\'\u00a8\u0006\u001f"}, d2 = {"Lltd/kaizo/realestatemanager/database/EstateDao;", "", "getAllEstate", "Landroidx/lifecycle/LiveData;", "", "Lltd/kaizo/realestatemanager/model/Estate;", "getAllPhoto", "Lltd/kaizo/realestatemanager/model/EstatePhoto;", "getEstateById", "id", "", "getEstateByIdWithCursor", "Landroid/database/Cursor;", "getPhotoListById", "getPhotoListByIdWithCursor", "getSearchResult", "query", "Landroidx/sqlite/db/SimpleSQLiteQuery;", "insertEstate", "estate", "insertPhoto", "estatePhoto", "setMainPicture", "", "estateId", "uri", "", "updateLatLng", "latitude", "", "longitude", "app_debug"})
public abstract interface EstateDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insertEstate(@org.jetbrains.annotations.NotNull()
    ltd.kaizo.realestatemanager.model.Estate estate);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract long insertPhoto(@org.jetbrains.annotations.NotNull()
    ltd.kaizo.realestatemanager.model.EstatePhoto estatePhoto);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM estate")
    public abstract androidx.lifecycle.LiveData<java.util.List<ltd.kaizo.realestatemanager.model.Estate>> getAllEstate();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM estate WHERE id=:id")
    public abstract androidx.lifecycle.LiveData<ltd.kaizo.realestatemanager.model.Estate> getEstateById(long id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM estate WHERE id=:id")
    public abstract android.database.Cursor getEstateByIdWithCursor(long id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM EstatePhoto WHERE estateId=:id")
    public abstract androidx.lifecycle.LiveData<java.util.List<ltd.kaizo.realestatemanager.model.EstatePhoto>> getPhotoListById(long id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM EstatePhoto WHERE estateId=:id")
    public abstract android.database.Cursor getPhotoListByIdWithCursor(long id);
    
    @androidx.room.Query(value = "UPDATE estate SET mainPicture=:uri WHERE id=:estateId")
    public abstract void setMainPicture(long estateId, @org.jetbrains.annotations.NotNull()
    java.lang.String uri);
    
    @androidx.room.Query(value = "UPDATE estate SET latitude=:latitude, longitude=:longitude WHERE id=:estateId")
    public abstract void updateLatLng(long estateId, double latitude, double longitude);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.RawQuery()
    public abstract java.util.List<ltd.kaizo.realestatemanager.model.Estate> getSearchResult(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SimpleSQLiteQuery query);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM EstatePhoto")
    public abstract androidx.lifecycle.LiveData<java.util.List<ltd.kaizo.realestatemanager.model.EstatePhoto>> getAllPhoto();
}