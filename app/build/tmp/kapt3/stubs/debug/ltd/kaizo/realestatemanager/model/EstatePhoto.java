package ltd.kaizo.realestatemanager.model;

import java.lang.System;

@androidx.room.Entity(foreignKeys = {@androidx.room.ForeignKey(entity = ltd.kaizo.realestatemanager.model.Estate.class, childColumns = {"estateId"}, onDelete = 5, parentColumns = {"id"})})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\tH\u00c6\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020$H\u00d6\u0001J\t\u0010%\u001a\u00020\u0006H\u00d6\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016\u00a8\u0006&"}, d2 = {"Lltd/kaizo/realestatemanager/model/EstatePhoto;", "", "photoId", "", "estateId", "uri", "", "name", "mainPicture", "", "(JJLjava/lang/String;Ljava/lang/String;Z)V", "getEstateId", "()J", "setEstateId", "(J)V", "getMainPicture", "()Z", "setMainPicture", "(Z)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getPhotoId", "setPhotoId", "getUri", "setUri", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class EstatePhoto {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long photoId;
    @androidx.room.ColumnInfo(index = true)
    private long estateId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String uri;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    private boolean mainPicture;
    
    public final long getPhotoId() {
        return 0L;
    }
    
    public final void setPhotoId(long p0) {
    }
    
    public final long getEstateId() {
        return 0L;
    }
    
    public final void setEstateId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUri() {
        return null;
    }
    
    public final void setUri(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getMainPicture() {
        return false;
    }
    
    public final void setMainPicture(boolean p0) {
    }
    
    public EstatePhoto(long photoId, long estateId, @org.jetbrains.annotations.NotNull()
    java.lang.String uri, @org.jetbrains.annotations.NotNull()
    java.lang.String name, boolean mainPicture) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long component2() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.kaizo.realestatemanager.model.EstatePhoto copy(long photoId, long estateId, @org.jetbrains.annotations.NotNull()
    java.lang.String uri, @org.jetbrains.annotations.NotNull()
    java.lang.String name, boolean mainPicture) {
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