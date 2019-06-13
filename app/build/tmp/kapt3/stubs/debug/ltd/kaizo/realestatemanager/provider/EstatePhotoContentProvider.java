package ltd.kaizo.realestatemanager.provider;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J/\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013H\u0016\u00a2\u0006\u0002\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016JK\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0010\u001a\u00020\u000b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0002\u0010\u001fJ9\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013H\u0016\u00a2\u0006\u0002\u0010\"R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\n \b*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006#"}, d2 = {"Lltd/kaizo/realestatemanager/provider/EstatePhotoContentProvider;", "Landroid/content/ContentProvider;", "()V", "AUTHORITY", "", "getAUTHORITY", "()Ljava/lang/String;", "PHOTO_TABLE_NAME", "kotlin.jvm.PlatformType", "getPHOTO_TABLE_NAME", "URI_PHOTO", "Landroid/net/Uri;", "getURI_PHOTO", "()Landroid/net/Uri;", "delete", "", "uri", "selection", "selectionArgs", "", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getType", "insert", "contentValues", "Landroid/content/ContentValues;", "onCreate", "", "query", "Landroid/database/Cursor;", "projection", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "update", "values", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "app_debug"})
public final class EstatePhotoContentProvider extends android.content.ContentProvider {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String AUTHORITY = "ltd.kaizo.realestatemanager.provider";
    private final java.lang.String PHOTO_TABLE_NAME = null;
    private final android.net.Uri URI_PHOTO = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAUTHORITY() {
        return null;
    }
    
    public final java.lang.String getPHOTO_TABLE_NAME() {
        return null;
    }
    
    public final android.net.Uri getURI_PHOTO() {
        return null;
    }
    
    @java.lang.Override()
    public boolean onCreate() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.database.Cursor query(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    java.lang.String[] projection, @org.jetbrains.annotations.Nullable()
    java.lang.String selection, @org.jetbrains.annotations.Nullable()
    java.lang.String[] selectionArgs, @org.jetbrains.annotations.Nullable()
    java.lang.String sortOrder) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getType(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.net.Uri insert(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    android.content.ContentValues contentValues) {
        return null;
    }
    
    @java.lang.Override()
    public int update(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    android.content.ContentValues values, @org.jetbrains.annotations.Nullable()
    java.lang.String selection, @org.jetbrains.annotations.Nullable()
    java.lang.String[] selectionArgs) {
        return 0;
    }
    
    @java.lang.Override()
    public int delete(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    java.lang.String selection, @org.jetbrains.annotations.Nullable()
    java.lang.String[] selectionArgs) {
        return 0;
    }
    
    public EstatePhotoContentProvider() {
        super();
    }
}