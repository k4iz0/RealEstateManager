package ltd.kaizo.realestatemanager.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u001d\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\'\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010)\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"API_KEY", "", "CAMERA_PERM", "COARSE_LOCATION", "COLLECTION_NAME", "CURRENCY_DOLLAR", "CURRENCY_EURO", "CURRENT_CURRENCY", "DATABASE_NAME", "ESTATE_CHANNEL_ID", "ESTATE_CHANNEL_NAME", "ESTATE_ID", "ESTATE_LIST", "ESTATE_PHOTO_LIST", "ESTATE_SOURCE", "ESTATE_SOURCE_ADD", "", "ESTATE_SOURCE_EDIT", "ESTATE_SOURCE_MAP", "ESTATE_SOURCE_SEARCH", "FINE_LOCATION", "RC_CHOOSE_PHOTO", "RC_DATE_IN", "RC_DATE_IN_MAXI", "RC_DATE_IN_MINI", "RC_DATE_OUT", "RC_DATE_OUT_MAXI", "RC_DATE_OUT_MINI", "RC_ERROR_DIALOG_REQUEST", "RC_PICTURE_ITEM_DETAIL", "RC_PICTURE_ITEM_EDIT", "RC_PICTURE_LISTENER_FAVORITE", "RC_PICTURE_LISTENER_REMOVE", "RC_PICTURE_LISTENER_VIEW", "RC_POI_ADD_ITEM", "RC_TAKE_PHOTO", "READ_EXT_PERM", "STR_ERROR_INSERT_DATA", "STR_ESTATE_SUCCESS", "STR_VERIFY_DATA", "STR_VERIFY_MAIN_PICTURE", "STR_VERIFY_PICTURE", "TAG_ADD_PICTURE_DIALOG", "TAG_ADD_POI_DIALOG", "WRITE_EXT_PERM", "app_debug"})
public final class ConstantKt {
    
    /**
     * **************************
     * *********     APP    ********
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATABASE_NAME = "ESTATE_DB";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ESTATE_SOURCE = "ESTATE SOURCE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ESTATE_ID = "ESTATE ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ESTATE_LIST = "ESTATE LIST";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ESTATE_PHOTO_LIST = "ESTATE PHOTO LIST";
    public static final int ESTATE_SOURCE_ADD = 40;
    public static final int ESTATE_SOURCE_EDIT = 30;
    public static final int ESTATE_SOURCE_MAP = 50;
    public static final int ESTATE_SOURCE_SEARCH = 60;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG_ADD_PICTURE_DIALOG = "AddPictureDialogFragment";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG_ADD_POI_DIALOG = "AddPoiDialogFragment";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COLLECTION_NAME = "users";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CURRENCY_DOLLAR = "$";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CURRENCY_EURO = "\u20ac";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CURRENT_CURRENCY = "CURRENT_CURRENCY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ESTATE_CHANNEL_ID = "EstateChannelID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ESTATE_CHANNEL_NAME = "Estate channel";
    
    /**
     * **************************
     * *********   PERMS   ********
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WRITE_EXT_PERM = "android.permission.WRITE_EXTERNAL_STORAGE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String READ_EXT_PERM = "android.permission.READ_EXTERNAL_STORAGE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CAMERA_PERM = "android.permission.CAMERA";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FINE_LOCATION = "android.permission.ACCESS_FINE_LOCATION";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COARSE_LOCATION = "android.permission.ACCESS_COARSE_LOCATION";
    
    /**
     * **************************
     * ****   RESPONSE CODE   ******
     */
    public static final int RC_TAKE_PHOTO = 100;
    public static final int RC_CHOOSE_PHOTO = 200;
    public static final int RC_DATE_OUT = 300;
    public static final int RC_DATE_OUT_MINI = 301;
    public static final int RC_DATE_OUT_MAXI = 302;
    public static final int RC_DATE_IN = 400;
    public static final int RC_DATE_IN_MINI = 401;
    public static final int RC_DATE_IN_MAXI = 402;
    public static final int RC_PICTURE_ITEM_DETAIL = 500;
    public static final int RC_PICTURE_ITEM_EDIT = 600;
    public static final int RC_PICTURE_LISTENER_REMOVE = 700;
    public static final int RC_PICTURE_LISTENER_VIEW = 800;
    public static final int RC_PICTURE_LISTENER_FAVORITE = 900;
    public static final int RC_ERROR_DIALOG_REQUEST = 9001;
    public static final int RC_POI_ADD_ITEM = 9001;
    
    /**
     * **************************
     * *********   KEYS   ********
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KEY = "AIzaSyAG3j9kLkZrAMW2Y0b4458-wlgUuSDcEsY";
    
    /**
     * **************************
     * *********   STRING   ********
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STR_VERIFY_DATA = "STR_VERIFY_DATA";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STR_VERIFY_PICTURE = "STR_VERIFY_PICTURE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STR_VERIFY_MAIN_PICTURE = "STR_VERIFY__MAIN_PICTURE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STR_ESTATE_SUCCESS = "STR_ESTATE_SUCCESS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STR_ERROR_INSERT_DATA = "STR_ERROR_INSERT_DATA";
}