package ltd.kaizo.realestatemanager.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007J\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00102\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007J!\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010\u00a2\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001bJ\u0018\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u0014J\u0016\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lltd/kaizo/realestatemanager/utils/Utils;", "", "()V", "VALID_EMAIL_ADDRESS_REGEX", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "configureMessage", "", "message", "context", "Landroid/content/Context;", "getLocation", "address", "postalCode", "city", "getPoiSourceList", "", "(Landroid/content/Context;)[Ljava/lang/String;", "getStaticMapUrlFromAddress", "getTypePositionForSpinner", "", "typeDescription", "typeArray", "(Ljava/lang/String;[Ljava/lang/String;)I", "isEmailValid", "", "emailEditText", "Landroid/widget/EditText;", "isInternetAvailable", "isUsernameValid", "usernameEditText", "showAddPoiAlertDialog", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "source", "showSnackBar", "view", "Landroid/view/View;", "validateEmail", "emailStr", "app_debug"})
public final class Utils {
    
    /**
     * **************************
     *     ******* email check  ********
     */
    private static final java.util.regex.Pattern VALID_EMAIL_ADDRESS_REGEX = null;
    public static final ltd.kaizo.realestatemanager.utils.Utils INSTANCE = null;
    
    /**
     * * Vérification de la connexion réseau
     *     * NOTE : NE PAS SUPPRIMER, A MONTRER DURANT LA SOUTENANCE
     *     * @param context
     *     * @return
     */
    public final boolean isInternetAvailable(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * * get the correct string for displaying a message
     *     * @param message the id of the message
     *     * @param context
     *     * @return the resource's string according to the id
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String configureMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final void showSnackBar(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    /**
     * * return the position to set spinner according to the type
     *     *
     *     * @param typeDescription type name
     *     * @param typeArray array of type name
     *     * @return index of array
     */
    public final int getTypePositionForSpinner(@org.jetbrains.annotations.NotNull()
    java.lang.String typeDescription, @org.jetbrains.annotations.NotNull()
    java.lang.String[] typeArray) {
        return 0;
    }
    
    /**
     * * Validate email boolean.
     *     *
     *     * @param emailStr the email str
     *     * @return the boolean
     */
    public final boolean validateEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String emailStr) {
        return false;
    }
    
    /**
     * * Is email valid boolean.
     *     *
     *     * @return the boolean
     */
    public final boolean isEmailValid(@org.jetbrains.annotations.NotNull()
    android.widget.EditText emailEditText) {
        return false;
    }
    
    /**
     * * return true if the username is bigger than 2 characters
     *     * and different from previous username
     *     *
     *     * @return Boolean boolean
     */
    public final boolean isUsernameValid(@org.jetbrains.annotations.NotNull()
    android.widget.EditText usernameEditText) {
        return false;
    }
    
    /**
     * ***************************
     *     *******   google map   ******
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStaticMapUrlFromAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String postalCode, @org.jetbrains.annotations.NotNull()
    java.lang.String city) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocation(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String postalCode, @org.jetbrains.annotations.NotNull()
    java.lang.String city) {
        return null;
    }
    
    /**
     * **************************
     *     *********    POI     ********
     */
    public final void showAddPoiAlertDialog(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.FragmentManager fragmentManager, int source) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getPoiSourceList(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private Utils() {
        super();
    }
}