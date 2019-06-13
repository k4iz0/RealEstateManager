package ltd.kaizo.realestatemanager.model;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\bL\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0002\u0010\u001bJ\t\u0010M\u001a\u00020\u0003H\u00c6\u0003J\t\u0010N\u001a\u00020\u0005H\u00c6\u0003J\t\u0010O\u001a\u00020\u0005H\u00c6\u0003J\t\u0010P\u001a\u00020\u0005H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0005H\u00c6\u0003J\t\u0010R\u001a\u00020\u0013H\u00c6\u0003J\t\u0010S\u001a\u00020\u0015H\u00c6\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\t\u0010U\u001a\u00020\u0005H\u00c6\u0003J\t\u0010V\u001a\u00020\u0019H\u00c6\u0003J\t\u0010W\u001a\u00020\u0019H\u00c6\u0003J\t\u0010X\u001a\u00020\u0005H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0005H\u00c6\u0003J\t\u0010Z\u001a\u00020\bH\u00c6\u0003J\t\u0010[\u001a\u00020\bH\u00c6\u0003J\t\u0010\\\u001a\u00020\bH\u00c6\u0003J\t\u0010]\u001a\u00020\bH\u00c6\u0003J\t\u0010^\u001a\u00020\bH\u00c6\u0003J\t\u0010_\u001a\u00020\u0005H\u00c6\u0003J\u00c9\u0001\u0010`\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u00c6\u0001J\u0013\u0010a\u001a\u00020\u00132\b\u0010b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010c\u001a\u00020\bH\u00d6\u0001J\t\u0010d\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010#\"\u0004\b\'\u0010%R\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\u001a\u0010\u0017\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u00100\"\u0004\b1\u00102R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010\u001a\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00104\"\u0004\b8\u00106R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001d\"\u0004\b:\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010\f\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010<\"\u0004\b@\u0010>R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>R\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001d\"\u0004\bD\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u001d\"\u0004\bF\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010<\"\u0004\bH\u0010>R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010<\"\u0004\bJ\u0010>R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u001d\"\u0004\bL\u0010\u001f\u00a8\u0006e"}, d2 = {"Lltd/kaizo/realestatemanager/model/Estate;", "", "id", "", "mainPicture", "", "type", "price", "", "surface", "nbRoom", "nbBathroom", "nbBedroom", "description", "address", "postalCode", "city", "poi", "isSold", "", "dateIn", "Ljava/util/Date;", "dateOut", "estateManager", "latitude", "", "longitude", "(JLjava/lang/String;Ljava/lang/String;IIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;DD)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getCity", "setCity", "getDateIn", "()Ljava/util/Date;", "setDateIn", "(Ljava/util/Date;)V", "getDateOut", "setDateOut", "getDescription", "setDescription", "getEstateManager", "setEstateManager", "getId", "()J", "setId", "(J)V", "()Z", "setSold", "(Z)V", "getLatitude", "()D", "setLatitude", "(D)V", "getLongitude", "setLongitude", "getMainPicture", "setMainPicture", "getNbBathroom", "()I", "setNbBathroom", "(I)V", "getNbBedroom", "setNbBedroom", "getNbRoom", "setNbRoom", "getPoi", "setPoi", "getPostalCode", "setPostalCode", "getPrice", "setPrice", "getSurface", "setSurface", "getType", "setType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class Estate {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mainPicture;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String type;
    private int price;
    private int surface;
    private int nbRoom;
    private int nbBathroom;
    private int nbBedroom;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String description;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String address;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String postalCode;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String city;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String poi;
    private boolean isSold;
    @org.jetbrains.annotations.NotNull()
    private java.util.Date dateIn;
    @org.jetbrains.annotations.Nullable()
    private java.util.Date dateOut;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String estateManager;
    private double latitude;
    private double longitude;
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMainPicture() {
        return null;
    }
    
    public final void setMainPicture(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getPrice() {
        return 0;
    }
    
    public final void setPrice(int p0) {
    }
    
    public final int getSurface() {
        return 0;
    }
    
    public final void setSurface(int p0) {
    }
    
    public final int getNbRoom() {
        return 0;
    }
    
    public final void setNbRoom(int p0) {
    }
    
    public final int getNbBathroom() {
        return 0;
    }
    
    public final void setNbBathroom(int p0) {
    }
    
    public final int getNbBedroom() {
        return 0;
    }
    
    public final void setNbBedroom(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPostalCode() {
        return null;
    }
    
    public final void setPostalCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCity() {
        return null;
    }
    
    public final void setCity(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPoi() {
        return null;
    }
    
    public final void setPoi(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isSold() {
        return false;
    }
    
    public final void setSold(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDateIn() {
        return null;
    }
    
    public final void setDateIn(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getDateOut() {
        return null;
    }
    
    public final void setDateOut(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEstateManager() {
        return null;
    }
    
    public final void setEstateManager(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getLatitude() {
        return 0.0;
    }
    
    public final void setLatitude(double p0) {
    }
    
    public final double getLongitude() {
        return 0.0;
    }
    
    public final void setLongitude(double p0) {
    }
    
    public Estate(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String mainPicture, @org.jetbrains.annotations.NotNull()
    java.lang.String type, int price, int surface, int nbRoom, int nbBathroom, int nbBedroom, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String postalCode, @org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    java.lang.String poi, boolean isSold, @org.jetbrains.annotations.NotNull()
    java.util.Date dateIn, @org.jetbrains.annotations.Nullable()
    java.util.Date dateOut, @org.jetbrains.annotations.NotNull()
    java.lang.String estateManager, double latitude, double longitude) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    public final boolean component14() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    public final double component18() {
        return 0.0;
    }
    
    public final double component19() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.kaizo.realestatemanager.model.Estate copy(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String mainPicture, @org.jetbrains.annotations.NotNull()
    java.lang.String type, int price, int surface, int nbRoom, int nbBathroom, int nbBedroom, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String postalCode, @org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    java.lang.String poi, boolean isSold, @org.jetbrains.annotations.NotNull()
    java.util.Date dateIn, @org.jetbrains.annotations.Nullable()
    java.util.Date dateOut, @org.jetbrains.annotations.NotNull()
    java.lang.String estateManager, double latitude, double longitude) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}