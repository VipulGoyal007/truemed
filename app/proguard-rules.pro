# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile
-keep public class * extends androidx.fragment.app.Fragment

# Make crash call-stacks debuggable.
-keepnames class ** { *; }
-keepattributes SourceFile,LineNumberTable

# Make data class redable in release build.
-keep class com.intellihealth.truemeds.data.model.** { *; }
-keep class com.intellihealth.truemeds.presentation.model.** { *; }
-keep class com.intellihealth.truemeds.presentation.analytics.model.** { *; }
-keep class android.location.** { *; }

#CleverTap Xiaomi Notification
-keep class com.intellihealth.truemeds.presentation.broadcastreceiver.CleverTapXiaomiMessageReceiver {*;}

#SDK has been obfuscated and compressed to avoid class not found error due to re-obfuscation.
-keep class com.xiaomi.**

#If the compiling Android version you are using is 23, you can prevent getting a false warning which makes it impossible to compile.
-dontwarn com.xiaomi.push.**

-dontwarn com.google.protobuf.*
-dontwarn org.bouncycastle.jsse.**
-dontwarn org.conscrypt.**
-dontwarn org.openjsse.javax.net.ssl.**
-dontwarn org.openjsse.net.ssl.*
-dontwarn com.google.auto.value.extension.memoized.*


#-keep class com.xiaomi.mipush.sdk.MiPushMessage {*;}
#-keep class com.xiaomi.mipush.sdk.MiPushCommandMessage {*;}
#-keep class com.xiaomi.mipush.sdk.PushMessageReceiver {*;}
#-keep class com.xiaomi.mipush.sdk.MessageHandleService {*;}
#-keep class com.xiaomi.mipush.sdk.PushMessageHandler {*;}
#-keep class com.xiaomi.push.service.XMJobService {*;}
#-keep class com.xiaomi.push.service.XMPushService {*;}
#-keep class com.xiaomi.push.service.receivers.NetworkStatusReceiver {*;}
#-keep class com.xiaomi.push.service.receivers.PingReceiver {*;}
#-keep class com.xiaomi.mipush.sdk.NotificationClickedActivity {*;}

-keep class com.appsflyer.** { *; }

-keep public class com.google.firebase.messaging.FirebaseMessagingService {
    public *;
}


-assumenosideeffects class android.util.Log {
    public static *** d(...);
    public static *** w(...);
    public static *** v(...);
    public static *** i(...);
    public static *** e(...);
}