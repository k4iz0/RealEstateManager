package ltd.kaizo.realestatemanager.controller.ui.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u00102\u001a\u00020\u0013J\u001a\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\u00170\u00162\u0006\u00102\u001a\u00020\u0013J\u000e\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0018R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\tR\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\tR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\tR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\tR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\tR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\tR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\tR\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\tR \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\t\u00a8\u00068"}, d2 = {"Lltd/kaizo/realestatemanager/controller/ui/list/ListViewModel;", "Landroidx/lifecycle/ViewModel;", "estateDataSource", "Lltd/kaizo/realestatemanager/repositories/EstateRepository;", "(Lltd/kaizo/realestatemanager/repositories/EstateRepository;)V", "address", "Landroidx/lifecycle/MutableLiveData;", "", "getAddress", "()Landroidx/lifecycle/MutableLiveData;", "city", "getCity", "dateIn", "getDateIn", "dateOut", "getDateOut", "description", "getDescription", "estateId", "", "getEstateId", "estateList", "Landroidx/lifecycle/LiveData;", "", "Lltd/kaizo/realestatemanager/model/Estate;", "getEstateList", "()Landroidx/lifecycle/LiveData;", "isSold", "", "managerName", "getManagerName", "nbBathroom", "getNbBathroom", "nbBedroom", "getNbBedroom", "nbRoom", "getNbRoom", "postalCode", "getPostalCode", "price", "getPrice", "searchResultList", "", "getSearchResultList", "()Ljava/util/List;", "setSearchResultList", "(Ljava/util/List;)V", "surface", "getSurface", "getEstateById", "id", "getPictureListFromId", "Lltd/kaizo/realestatemanager/model/EstatePhoto;", "updateUiWithData", "", "estate", "app_debug"})
public final class ListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<ltd.kaizo.realestatemanager.model.Estate>> estateList = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<ltd.kaizo.realestatemanager.model.Estate> searchResultList;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> estateId = null;
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
    private final androidx.lifecycle.MutableLiveData<java.lang.String> nbRoom = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> nbBedroom = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> nbBathroom = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> price = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> managerName = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> dateIn = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> dateOut = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSold = null;
    private final ltd.kaizo.realestatemanager.repositories.EstateRepository estateDataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<ltd.kaizo.realestatemanager.model.Estate>> getEstateList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ltd.kaizo.realestatemanager.model.Estate> getSearchResultList() {
        return null;
    }
    
    public final void setSearchResultList(@org.jetbrains.annotations.NotNull()
    java.util.List<ltd.kaizo.realestatemanager.model.Estate> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Long> getEstateId() {
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
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getNbRoom() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getNbBedroom() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getNbBathroom() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getManagerName() {
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
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSold() {
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
    
    public final void updateUiWithData(@org.jetbrains.annotations.NotNull()
    ltd.kaizo.realestatemanager.model.Estate estate) {
    }
    
    public ListViewModel(@org.jetbrains.annotations.NotNull()
    ltd.kaizo.realestatemanager.repositories.EstateRepository estateDataSource) {
        super();
    }
}