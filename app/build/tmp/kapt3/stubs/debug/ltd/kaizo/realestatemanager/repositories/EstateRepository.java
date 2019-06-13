package ltd.kaizo.realestatemanager.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\bJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\fJ\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u001d"}, d2 = {"Lltd/kaizo/realestatemanager/repositories/EstateRepository;", "", "estateDao", "Lltd/kaizo/realestatemanager/database/EstateDao;", "(Lltd/kaizo/realestatemanager/database/EstateDao;)V", "getEstateDao", "()Lltd/kaizo/realestatemanager/database/EstateDao;", "getAllEstate", "Landroidx/lifecycle/LiveData;", "", "Lltd/kaizo/realestatemanager/model/Estate;", "getAllPhoto", "Lltd/kaizo/realestatemanager/model/EstatePhoto;", "getEstateById", "id", "", "getPhotoListById", "getSearchResult", "query", "Landroidx/sqlite/db/SimpleSQLiteQuery;", "insertEstate", "estate", "insertPhoto", "estatePhoto", "setMainPicture", "", "estateId", "uri", "", "app_debug"})
public final class EstateRepository {
    @org.jetbrains.annotations.NotNull()
    private final ltd.kaizo.realestatemanager.database.EstateDao estateDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<ltd.kaizo.realestatemanager.model.Estate>> getAllEstate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ltd.kaizo.realestatemanager.model.Estate> getEstateById(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<ltd.kaizo.realestatemanager.model.EstatePhoto>> getPhotoListById(long id) {
        return null;
    }
    
    public final long insertEstate(@org.jetbrains.annotations.NotNull()
    ltd.kaizo.realestatemanager.model.Estate estate) {
        return 0L;
    }
    
    public final long insertPhoto(@org.jetbrains.annotations.NotNull()
    ltd.kaizo.realestatemanager.model.EstatePhoto estatePhoto) {
        return 0L;
    }
    
    public final void setMainPicture(long estateId, @org.jetbrains.annotations.NotNull()
    java.lang.String uri) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ltd.kaizo.realestatemanager.model.Estate> getSearchResult(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SimpleSQLiteQuery query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<ltd.kaizo.realestatemanager.model.EstatePhoto>> getAllPhoto() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.kaizo.realestatemanager.database.EstateDao getEstateDao() {
        return null;
    }
    
    public EstateRepository(@org.jetbrains.annotations.NotNull()
    ltd.kaizo.realestatemanager.database.EstateDao estateDao) {
        super();
    }
}