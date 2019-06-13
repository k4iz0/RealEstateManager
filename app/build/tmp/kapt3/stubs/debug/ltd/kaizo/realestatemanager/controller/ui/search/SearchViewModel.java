package ltd.kaizo.realestatemanager.controller.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010P\u001a\u00020\tJ\u0006\u0010Q\u001a\u00020RR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000bR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u000bR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u000bR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u000bR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u000bR\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u000bR\u001a\u0010)\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001d\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020100\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u000bR\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\u000bR\u001d\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\u000bR\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\u000bR\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010\u000bR&\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u000b\"\u0004\bB\u0010CR \u0010D\u001a\b\u0012\u0004\u0012\u00020@01X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0010\"\u0004\bF\u0010\u0012R\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010\u000bR\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u000bR\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020*0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010\u000bR\u001d\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0N0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010\u000b\u00a8\u0006S"}, d2 = {"Lltd/kaizo/realestatemanager/controller/ui/search/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "estateDataSource", "Lltd/kaizo/realestatemanager/repositories/EstateRepository;", "executor", "Ljava/util/concurrent/Executor;", "(Lltd/kaizo/realestatemanager/repositories/EstateRepository;Ljava/util/concurrent/Executor;)V", "area", "Landroidx/lifecycle/MutableLiveData;", "", "getArea", "()Landroidx/lifecycle/MutableLiveData;", "argsList", "", "", "getArgsList", "()Ljava/util/List;", "setArgsList", "(Ljava/util/List;)V", "dateInMaxi", "getDateInMaxi", "dateInMini", "getDateInMini", "dateOutMaxi", "getDateOutMaxi", "dateOutMini", "getDateOutMini", "message", "getMessage", "nbBathroomMaxi", "getNbBathroomMaxi", "nbBathroomMini", "getNbBathroomMini", "nbBedroomMaxi", "getNbBedroomMaxi", "nbBedroomMini", "getNbBedroomMini", "nbRoomMaxi", "getNbRoomMaxi", "nbRoomMini", "getNbRoomMini", "pictureLimit", "", "getPictureLimit", "()I", "setPictureLimit", "(I)V", "pictureList", "Landroidx/lifecycle/LiveData;", "", "Lltd/kaizo/realestatemanager/model/EstatePhoto;", "getPictureList", "()Landroidx/lifecycle/LiveData;", "pictureMini", "getPictureMini", "poiList", "getPoiList", "poiListTmp", "getPoiListTmp", "priceMaxi", "getPriceMaxi", "priceMini", "getPriceMini", "resultList", "Lltd/kaizo/realestatemanager/model/Estate;", "getResultList", "setResultList", "(Landroidx/lifecycle/MutableLiveData;)V", "searchResult", "getSearchResult", "setSearchResult", "surfaceMaxi", "getSurfaceMaxi", "surfaceMini", "getSurfaceMini", "type", "getType", "typeArray", "", "getTypeArray", "configureQuery", "launchSearchRequest", "", "app_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<ltd.kaizo.realestatemanager.model.EstatePhoto>> pictureList = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.Object> argsList;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> message = null;
    @org.jetbrains.annotations.NotNull()
    public java.util.List<ltd.kaizo.realestatemanager.model.Estate> searchResult;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<ltd.kaizo.realestatemanager.model.Estate>> resultList;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> area = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> surfaceMini = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> surfaceMaxi = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> nbRoomMini = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> nbRoomMaxi = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> nbBedroomMini = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> nbBedroomMaxi = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> nbBathroomMini = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> nbBathroomMaxi = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> priceMini = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> priceMaxi = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> pictureMini = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> poiList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> type = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> dateInMini = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> dateInMaxi = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> dateOutMini = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> dateOutMaxi = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> poiListTmp = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String[]> typeArray = null;
    private int pictureLimit;
    private final ltd.kaizo.realestatemanager.repositories.EstateRepository estateDataSource = null;
    private final java.util.concurrent.Executor executor = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<ltd.kaizo.realestatemanager.model.EstatePhoto>> getPictureList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getArgsList() {
        return null;
    }
    
    public final void setArgsList(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ltd.kaizo.realestatemanager.model.Estate> getSearchResult() {
        return null;
    }
    
    public final void setSearchResult(@org.jetbrains.annotations.NotNull()
    java.util.List<ltd.kaizo.realestatemanager.model.Estate> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<ltd.kaizo.realestatemanager.model.Estate>> getResultList() {
        return null;
    }
    
    public final void setResultList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<ltd.kaizo.realestatemanager.model.Estate>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getArea() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSurfaceMini() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSurfaceMaxi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getNbRoomMini() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getNbRoomMaxi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getNbBedroomMini() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getNbBedroomMaxi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getNbBathroomMini() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getNbBathroomMaxi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPriceMini() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPriceMaxi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPictureMini() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPoiList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDateInMini() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDateInMaxi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDateOutMini() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDateOutMaxi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> getPoiListTmp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String[]> getTypeArray() {
        return null;
    }
    
    public final int getPictureLimit() {
        return 0;
    }
    
    public final void setPictureLimit(int p0) {
    }
    
    /**
     * * search button's onClick method
     */
    public final void launchSearchRequest() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String configureQuery() {
        return null;
    }
    
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    ltd.kaizo.realestatemanager.repositories.EstateRepository estateDataSource, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.Executor executor) {
        super();
    }
}