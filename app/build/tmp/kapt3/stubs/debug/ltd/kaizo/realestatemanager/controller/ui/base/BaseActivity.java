package ltd.kaizo.realestatemanager.controller.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0005J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0006H\u0004J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014\u00a8\u0006\u0012"}, d2 = {"Lltd/kaizo/realestatemanager/controller/ui/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "configureDesign", "", "dispatchTouchEvent", "", "event", "Landroid/view/MotionEvent;", "getCurrentUser", "Lcom/google/firebase/auth/FirebaseUser;", "getFragmentLayout", "", "isCurrentUserLogged", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public abstract int getFragmentLayout();
    
    public abstract void configureDesign();
    
    /**
     * * Gets current user.
     *     *
     *     * @return the current user
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    protected final com.google.firebase.auth.FirebaseUser getCurrentUser() {
        return null;
    }
    
    /**
     * * Is current user logged boolean.
     *     *
     *     * @return the boolean
     */
    protected final boolean isCurrentUserLogged() {
        return false;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    /**
     * * method to remove the focus of an ediText
     *     *
     *     * @param event
     *     * @return
     */
    @java.lang.Override()
    public boolean dispatchTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    public BaseActivity() {
        super();
    }
}