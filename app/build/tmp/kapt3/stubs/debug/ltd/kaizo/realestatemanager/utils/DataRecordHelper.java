package ltd.kaizo.realestatemanager.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\b\u001a\u00020\tJ\u0014\u0010\f\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006J\u0014\u0010\u000f\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u0006J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0016J\u0016\u0010\u0015\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u0015\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u001aJ\u0018\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tJ\u0016\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0016J\u0016\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0019J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0002\u0010\u001dJ\u0016\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lltd/kaizo/realestatemanager/utils/DataRecordHelper;", "", "()V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getEstateListFromGson", "", "Lltd/kaizo/realestatemanager/model/Estate;", "gsonStr", "", "getEstatePhotoListFromGson", "Lltd/kaizo/realestatemanager/model/EstatePhoto;", "getGsonFromEstateList", "list", "getGsonFromEstatePhotoList", "getGsonFromList", "getListFromGson", "init", "", "context", "Landroid/content/Context;", "read", "", "key", "defValue", "", "", "write", "value", "(Ljava/lang/String;Ljava/lang/Integer;)V", "app_debug"})
public final class DataRecordHelper {
    
    /**
     * * The constant sharedPreferences.
     */
    private static android.content.SharedPreferences sharedPreferences;
    public static final ltd.kaizo.realestatemanager.utils.DataRecordHelper INSTANCE = null;
    
    /**
     * * Init.
     *     *
     *     * @param context the context
     */
    public final void init(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * * Read string.
     *     *
     *     * @param key      the key
     *     * @param defValue the def value
     *     * @return the string
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String read(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String defValue) {
        return null;
    }
    
    /**
     * * Write String value
     *     *
     *     * @param key   the key
     *     * @param value the value
     */
    public final void write(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    /**
     * * Read boolean.
     *     *
     *     * @param key      the key
     *     * @param defValue the def value
     *     * @return the boolean
     */
    public final boolean read(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean defValue) {
        return false;
    }
    
    /**
     * * Write boolean value
     *     *
     *     * @param key   the key
     *     * @param value the value
     */
    public final void write(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean value) {
    }
    
    /**
     * * Read integer.
     *     *
     *     * @param key      the key
     *     * @param defValue the def value
     *     * @return the integer
     */
    public final int read(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int defValue) {
        return 0;
    }
    
    /**
     * * Write int value
     *     *
     *     * @param key   the key
     *     * @param value the value
     */
    public final void write(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Integer value) {
    }
    
    /**
     * * Read double.
     *     *
     *     * @param key      the key
     *     * @param defValue the def value
     *     * @return the double
     */
    public final double read(@org.jetbrains.annotations.NotNull()
    java.lang.String key, double defValue) {
        return 0.0;
    }
    
    /**
     * * Write double value in sharedPreferences
     *     * by converting it to LongBits
     *     *
     *     * @param key   the key
     *     * @param value the value
     */
    public final void write(@org.jetbrains.annotations.NotNull()
    java.lang.String key, double value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getListFromGson(@org.jetbrains.annotations.NotNull()
    java.lang.String gsonStr) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGsonFromList(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> list) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ltd.kaizo.realestatemanager.model.Estate> getEstateListFromGson(@org.jetbrains.annotations.NotNull()
    java.lang.String gsonStr) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGsonFromEstateList(@org.jetbrains.annotations.NotNull()
    java.util.List<ltd.kaizo.realestatemanager.model.Estate> list) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ltd.kaizo.realestatemanager.model.EstatePhoto> getEstatePhotoListFromGson(@org.jetbrains.annotations.NotNull()
    java.lang.String gsonStr) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGsonFromEstatePhotoList(@org.jetbrains.annotations.NotNull()
    java.util.List<ltd.kaizo.realestatemanager.model.EstatePhoto> list) {
        return null;
    }
    
    private DataRecordHelper() {
        super();
    }
}