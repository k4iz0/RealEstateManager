package ltd.kaizo.realestatemanager.controller.ui.add;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010A\u001a\u00020\u001bJ\b\u0010B\u001a\u00020\u001bH\u0002J\b\u0010C\u001a\u00020DH\u0002J\u0006\u0010E\u001a\u00020DJ\u0014\u0010F\u001a\b\u0012\u0004\u0012\u00020H0G2\u0006\u0010I\u001a\u00020\u0015J\u001a\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0K0G2\u0006\u0010I\u001a\u00020\u0015J\u0010\u0010L\u001a\u00020D2\u0006\u0010M\u001a\u00020HH\u0002J\u0010\u0010N\u001a\u00020D2\u0006\u0010O\u001a\u00020+H\u0002J\u001e\u0010P\u001a\u00020D2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0K2\u0006\u0010I\u001a\u00020\u0015H\u0002J\u0010\u0010Q\u001a\u00020D2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010R\u001a\u00020D2\u0006\u0010S\u001a\u00020HR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000bR\u000e\u0010\u001d\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000bR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u000bR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u000bR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u000bR\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020#0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u000bR\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010-R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020+0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u000bR\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u000bR\u001d\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0*0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\u000bR\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\u000bR\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010\u000bR\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010\u000bR\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020#0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010\u000bR\u001d\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0?0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010\u000b\u00a8\u0006T"}, d2 = {"Lltd/kaizo/realestatemanager/controller/ui/add/EstateViewModel;", "Landroidx/lifecycle/ViewModel;", "estateDataSource", "Lltd/kaizo/realestatemanager/repositories/EstateRepository;", "executor", "Ljava/util/concurrent/Executor;", "(Lltd/kaizo/realestatemanager/repositories/EstateRepository;Ljava/util/concurrent/Executor;)V", "address", "Landroidx/lifecycle/MutableLiveData;", "", "getAddress", "()Landroidx/lifecycle/MutableLiveData;", "city", "getCity", "dateIn", "getDateIn", "dateOut", "getDateOut", "description", "getDescription", "estateId", "", "getEstateId", "()J", "setEstateId", "(J)V", "isFinish", "", "isSold", "mainPicture", "managerName", "getManagerName", "message", "getMessage", "nbBathroom", "", "getNbBathroom", "nbBedroom", "getNbBedroom", "nbRoom", "getNbRoom", "pictureList", "", "Lltd/kaizo/realestatemanager/model/EstatePhoto;", "getPictureList", "()Ljava/util/List;", "pictureListTmp", "getPictureListTmp", "pictureTmp", "getPictureTmp", "poiList", "getPoiList", "poiListTmp", "getPoiListTmp", "postalCode", "getPostalCode", "price", "getPrice", "surface", "getSurface", "type", "getType", "typeArray", "", "getTypeArray", "checkFieldView", "checkMainPicture", "configureDefaultValue", "", "createEstate", "getEstateById", "Landroidx/lifecycle/LiveData;", "Lltd/kaizo/realestatemanager/model/Estate;", "id", "getPictureListFromId", "", "insertEstate", "estateToCreate", "insertPhoto", "estatePhoto", "insertPhotoFromList", "setMainPicture", "updateUiWithData", "estate", "app_debug"})
public final class EstateViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> message = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> description = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> address = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> postalCode = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> city = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> surface = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> nbRoom = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> nbBedroom = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> nbBathroom = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> price = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> type = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> poiList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> managerName = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSold = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> dateIn = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> dateOut = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isFinish = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<ltd.kaizo.realestatemanager.model.EstatePhoto> pictureList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<ltd.kaizo.realestatemanager.model.EstatePhoto> pictureListTmp = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<ltd.kaizo.realestatemanager.model.EstatePhoto> pictureTmp = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> poiListTmp = null;
    private long estateId;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String[]> typeArray = null;
    private java.lang.String mainPicture;
    private final ltd.kaizo.realestatemanager.repositories.EstateRepository estateDataSource = null;
    private final java.util.concurrent.Executor executor = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPostalCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getCity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSurface() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getNbRoom() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getNbBedroom() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getNbBathroom() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPoiList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getManagerName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSold() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDateIn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDateOut() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isFinish() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ltd.kaizo.realestatemanager.model.EstatePhoto> getPictureList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ltd.kaizo.realestatemanager.model.EstatePhoto> getPictureListTmp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<ltd.kaizo.realestatemanager.model.EstatePhoto> getPictureTmp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> getPoiListTmp() {
        return null;
    }
    
    public final long getEstateId() {
        return 0L;
    }
    
    public final void setEstateId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String[]> getTypeArray() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ltd.kaizo.realestatemanager.model.Estate> getEstateById(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<ltd.kaizo.realestatemanager.model.EstatePhoto>> getPictureListFromId(long id) {
        return null;
    }
    
    private final void insertPhoto(ltd.kaizo.realestatemanager.model.EstatePhoto estatePhoto) {
    }
    
    /**
     * * check if all fields are not empty or null
     */
    public final boolean checkFieldView() {
        return false;
    }
    
    /**
     * * insert all photo in database with the appropriate id
     *     * @param pictureList
     *     * @param id of the estate
     */
    private final void insertPhotoFromList(java.util.List<ltd.kaizo.realestatemanager.model.EstatePhoto> pictureList, long id) {
    }
    
    /**
     * * check all fields, set default value and create an estate
     */
    public final void createEstate() {
    }
    
    /**
     * * configure the default value to prevent null value in database
     *     * and convert price to euro
     */
    private final void configureDefaultValue() {
    }
    
    /**
     * * check if mainPicture is set
     *     *
     *     * @return
     */
    private final boolean checkMainPicture() {
        return false;
    }
    
    /**
     * * insert an estate in database
     *     *
     *     * @param estateToCreate
     */
    private final void insertEstate(ltd.kaizo.realestatemanager.model.Estate estateToCreate) {
    }
    
    private final void setMainPicture(long estateId) {
    }
    
    /**
     * * update the ui with the data of an estate
     *     *
     *     * @param estate
     */
    public final void updateUiWithData(@org.jetbrains.annotations.NotNull()
    ltd.kaizo.realestatemanager.model.Estate estate) {
    }
    
    public EstateViewModel(@org.jetbrains.annotations.NotNull()
    ltd.kaizo.realestatemanager.repositories.EstateRepository estateDataSource, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.Executor executor) {
        super();
    }
}