package ltd.kaizo.realestatemanager.utils

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.ContextWrapper
import android.graphics.Color
import androidx.core.app.NotificationCompat
import ltd.kaizo.realestatemanager.R


/**
 * The type Notification helper.
 */
class NotificationHelper
/**
 * Instantiates a new Notification helper.
 *
 * @param base the base
 */
    (base: Context) : ContextWrapper(base) {
    /**
     * The Manager.
     */
    private var manager: NotificationManager? = null

    init {
        this.createNotificationChannel()
    }

    /**
     * Create notification channel for Device with API >= 26
     */
    private fun createNotificationChannel() {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            val notificationChannel =
                NotificationChannel(ESTATE_CHANNEL_ID, ESTATE_CHANNEL_NAME, NotificationManager.IMPORTANCE_DEFAULT)
            notificationChannel.enableLights(true)
            notificationChannel.enableVibration(true)
            notificationChannel.lightColor = Color.GREEN
            getManager()!!.createNotificationChannel(notificationChannel)
        }
    }


    /**
     * Getter for the notification manager.
     *
     * @return the manager
     */
    fun getManager(): NotificationManager? {
        if (manager == null) {
            manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        }
        return manager
    }

    /**
     * Define the Notification builder with text, style
     *
     * @return the notification compat . builder
     */
    fun notificationBuilder(): NotificationCompat.Builder {
        return NotificationCompat.Builder(this, ESTATE_CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_house_24dp)
            .setContentTitle(getString(R.string.notification))
            .setContentText(getString(R.string.notificationText))
            .setStyle(NotificationCompat.BigTextStyle())
            .setAutoCancel(true)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

    }

}
