package com.intellihealth.truemeds.presentation.services

import android.annotation.SuppressLint
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.media.RingtoneManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.text.TextUtils
import android.widget.RemoteViews
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import com.appsflyer.AppsFlyerLib
import com.clevertap.android.sdk.CleverTapAPI
import com.clevertap.android.sdk.pushnotification.NotificationInfo
import com.clevertap.android.sdk.pushnotification.fcm.CTFcmMessageHandler
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxNotificationClicked
import com.intellihealth.truemeds.domain.usecase.analytics.CleverTapEventUseCase
import com.intellihealth.truemeds.domain.usecase.analytics.MixPanelEventUseCase
import com.intellihealth.truemeds.presentation.activity.HomePageActivity
import com.intellihealth.truemeds.presentation.activity.LoginActivity
import com.intellihealth.truemeds.presentation.activity.SplashScreen
import com.intellihealth.truemeds.presentation.analytics.CleverTapEvent
import com.intellihealth.truemeds.presentation.analytics.MixPanelEvent
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.NotificationConstants
import org.json.JSONObject

class TmFirebaseMessagingService : FirebaseMessagingService() {
    override fun onNewToken(s: String) {
        super.onNewToken(s)

        try {
            SharedPrefManager.getInstance().saveFcm(s)
            //New fcm_token received update it to cleverTap.
            val cleverTapUseCase = CleverTapEventUseCase(CleverTapEvent(applicationContext))
            //optional
            cleverTapUseCase.pushFcmRegistrationId(s, true)

            // Sending new token to AppsFlyer
            AppsFlyerLib.getInstance().updateServerUninstallToken(applicationContext, s)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)
        try {
            // for appsflyer
            if (remoteMessage.data.containsKey("af-uinstall-tracking")) { // "uinstall" is not a typo
                return
            }

            if (remoteMessage.data.isNotEmpty()) {
                val extras = Bundle()
                for ((key, value) in remoteMessage.data.entries) {
                    extras.putString(key, value)
                }
                val info: NotificationInfo = CleverTapAPI.getNotificationInfo(extras)
                if (info.fromCleverTap) {
                    val messageHandler = CTFcmMessageHandler() //push_template
                    messageHandler.createNotification(applicationContext, remoteMessage)
                } else {
                    try {
                        if (remoteMessage.data.isEmpty()) return

                        val map: Map<String, String> = remoteMessage.data
                        val obj = JSONObject(map)
                        var title = ""
                        var description = ""
                        var orderId = ""
                        var destinationPage = ""
                        if (obj.has(NotificationConstants.NOTIFICATION_KEY_TITLE)) {
                            title = obj.getString(NotificationConstants.NOTIFICATION_KEY_TITLE)
                        }
                        if (obj.has(NotificationConstants.NOTIFICATION_KEY_BODY)) {
                            description = obj.getString(NotificationConstants.NOTIFICATION_KEY_BODY)
                        }
                        if (obj.has(NotificationConstants.NOTIFICATION_KEY_ORDER_ID)) {
                            orderId = obj.getInt(NotificationConstants.NOTIFICATION_KEY_ORDER_ID)
                                .toString()
                        }
                        if (obj.has(NotificationConstants.NOTIFICATION_KEY_DESTINATION_PAGE)) {
                            destinationPage =
                                obj.getString(NotificationConstants.NOTIFICATION_KEY_DESTINATION_PAGE)
                        }
                        if (destinationPage.trim { it <= ' ' }.isNotEmpty()) {
                            if (destinationPage.equals("drCallConfirmed", ignoreCase = true)) {
                                val mixPanelEventUseCase =
                                    MixPanelEventUseCase(MixPanelEvent(applicationContext))
                                mixPanelEventUseCase.sendNotificationReceivedEvent(
                                    MxNotificationClicked("TM", 122)
                                )
                            }
                        }
                        if (destinationPage.isEmpty()) {
                            sendSimpleNotification(title, description)
                        } else {
                            val intent =
                                Intent(applicationContext, SplashScreen::class.java)
                            intent.putExtra(
                                NotificationConstants.NOTIFICATION_KEY_ORDER_ID,
                                orderId
                            )
                            intent.putExtra(
                                NotificationConstants.NOTIFICATION_KEY_DESTINATION_PAGE,
                                destinationPage
                            )
                            showCustomNotification(
                                applicationContext,
                                title,
                                description,
                                intent
                            )
                        }
                    } catch (_: Exception) {
                    }
                }
            }
        } catch (_: Exception) {
        }
    }

    private fun sendSimpleNotification(messageTitle: String, messageBody: String?) {
        try {
            val intent: Intent = if (!TextUtils.isEmpty(SharedPrefManager.getInstance().loggedInUserAccessToken)) {
                Intent(applicationContext, HomePageActivity::class.java)
            } else {
                Intent(applicationContext, LoginActivity::class.java)
            }
            intent.action = System.currentTimeMillis().toString()
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            val pendingIntent: PendingIntent? =
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                    PendingIntent.getActivity(
                        applicationContext,
                        0,
                        intent,
                        PendingIntent.FLAG_IMMUTABLE
                    )
                } else {
                    PendingIntent.getActivity(
                        applicationContext,
                        0,
                        intent,
                        PendingIntent.FLAG_CANCEL_CURRENT
                    )
                }
            /*val icon: Bitmap = BitmapFactory.decodeResource(
                applicationContext.resources,
                R.drawable.notification_icon
            )*/
            val defaultSoundUri: Uri =
                RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
            val notificationBuilder: NotificationCompat.Builder =
                NotificationCompat.Builder(this, "tm_notification")
                    .setSmallIcon(R.drawable.notification_icon)
                    .setAutoCancel(true)
                    .setContentTitle("" + messageTitle)
                    .setSound(defaultSoundUri)
                    .setStyle(NotificationCompat.BigTextStyle().bigText(messageBody?:""))
                    .setContentIntent(pendingIntent)
                    .setVibrate(longArrayOf(100, 100, 100, 100))
                    .setLights(Color.BLUE, 3000, 3000)
            /*.setLargeIcon(icon)*/
            val alarmSound: Uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
            notificationBuilder.setSound(alarmSound)
            val notificationManager: NotificationManager? =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager?
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O && notificationManager != null) {
                val name: CharSequence = "Truemeds"
                val importance: Int = NotificationManager.IMPORTANCE_HIGH
                val mChannel = NotificationChannel("tm_notification", name, importance)
                notificationManager.createNotificationChannel(mChannel)
            }
            notificationManager?.notify(0, notificationBuilder.build())
        } catch (_: Exception) {
        }
    }

    @SuppressLint("RemoteViewLayout")
    private fun showCustomNotification(
        context: Context,
        title: String,
        message: String?,
        intent: Intent
    ) {
        val epochTime = System.currentTimeMillis()
        intent.flags =
            Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP or Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        val resultPendingIntent: PendingIntent =
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                // Create a PendingIntent using FLAG_IMMUTABLE.
                PendingIntent.getActivity(
                    applicationContext,
                    (Math.random() * (999 + 1) + 0).toInt(),
                    intent,
                    PendingIntent.FLAG_IMMUTABLE
                )
            } else {
                // Existing code that creates a PendingIntent.
                PendingIntent.getActivity(
                    applicationContext,
                    (Math.random() * (999 + 1) + 0).toInt(),
                    intent,
                    PendingIntent.FLAG_UPDATE_CURRENT
                )
            }

        // Layouts for the custom notification
        val notificationLayout =
            RemoteViews(context.packageName, R.layout.custom_notification_view_collapsed)

        //set data to collapsed view
        notificationLayout.setTextViewText(R.id.collapsed_notification_title, title)
        //notificationLayout.setTextViewText(R.id.collapsed_notification_info, message);

        // Layouts for the custom notification
        val notificationLayoutExpanded =
            RemoteViews(context.packageName, R.layout.custom_notification_view_expanded)

        //set data to expanded view
        notificationLayoutExpanded.setTextViewText(R.id.expanded_notification_title, title)
        notificationLayoutExpanded.setTextViewText(R.id.expanded_notification_info, message)

        //Notification builder.
        val builder = NotificationCompat.Builder(
            context,
            context.getString(R.string.notification_default_channel_id)
        )
        builder.setWhen(epochTime)
        builder.setShowWhen(true)
        builder.setGroupSummary(true)
        builder.setGroup(context.getString(R.string.notification_default_channel_id))
        builder.setSmallIcon(R.drawable.notification_icon)
        builder.setDefaults(NotificationCompat.DEFAULT_ALL)
        builder.priority = NotificationCompat.PRIORITY_HIGH
        builder.color = ContextCompat.getColor(context, R.color.colorAccent)
        builder.setContentIntent(resultPendingIntent)
        builder.setStyle(NotificationCompat.DecoratedCustomViewStyle())
        builder.setCustomContentView(notificationLayout)
        builder.setCustomBigContentView(notificationLayoutExpanded)
        val notification = builder.build()
        notification.flags = notification.flags or Notification.FLAG_AUTO_CANCEL
        notification.defaults = notification.defaults or Notification.DEFAULT_VIBRATE
        notification.defaults = notification.defaults or Notification.DEFAULT_SOUND
        notificationManager.notify((Math.random() * (999 + 1) + 0).toInt(), notification)
    }

    private val notificationManager: NotificationManager
        get() {
            val notificationManager: NotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

            // If the Android Version is greater than Oreo,
            // then create the NotificationChannel
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                val id: String = getString(R.string.notification_default_channel_id)
                val name: String = getString(R.string.notification_default_channel_name)
                val desc: String = getString(R.string.notification_default_channel_desc)
                val channel = NotificationChannel(id, name, NotificationManager.IMPORTANCE_HIGH)
                channel.description = desc
                channel.lightColor = ContextCompat.getColor(
                    applicationContext,
                    R.color.colorPrimary
                )
                channel.lockscreenVisibility = Notification.VISIBILITY_PUBLIC

                // Register the channel
                notificationManager.createNotificationChannel(channel)
            }
            return notificationManager
        }

}