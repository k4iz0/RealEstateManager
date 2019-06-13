package ltd.kaizo.realestatemanager.utils;

import java.lang.System;

/**
 * * The type Notification helper.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lltd/kaizo/realestatemanager/utils/NotificationHelper;", "Landroid/content/ContextWrapper;", "base", "Landroid/content/Context;", "(Landroid/content/Context;)V", "manager", "Landroid/app/NotificationManager;", "createNotificationChannel", "", "getManager", "notificationBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "app_debug"})
public final class NotificationHelper extends android.content.ContextWrapper {
    
    /**
     * * The Manager.
     */
    private android.app.NotificationManager manager;
    
    /**
     * * Create notification channel for Device with API >= 26
     */
    private final void createNotificationChannel() {
    }
    
    /**
     * * Getter for the notification manager.
     *     *
     *     * @return the manager
     */
    @org.jetbrains.annotations.Nullable()
    public final android.app.NotificationManager getManager() {
        return null;
    }
    
    /**
     * * Define the Notification builder with text, style
     *     *
     *     * @return the notification compat . builder
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.core.app.NotificationCompat.Builder notificationBuilder() {
        return null;
    }
    
    public NotificationHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context base) {
        super(null);
    }
}