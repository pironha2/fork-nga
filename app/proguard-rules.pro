-dontobfuscate

# Required for serialization to work properly
-if @kotlinx.serialization.Serializable class **
-keepclassmembers class <1> {
    static <1>$* Companion;
}
-keepnames @kotlinx.serialization.internal.NamedCompanion class *
-if @kotlinx.serialization.internal.NamedCompanion class *
-keepclassmembernames class * {
    static <1> *;
}
-if @kotlinx.serialization.Serializable class ** {
    static **$* *;
}
-keepclassmembers class <2>$<3> {
    kotlinx.serialization.KSerializer serializer(...);
}
-if @kotlinx.serialization.Serializable class ** {
    public static ** INSTANCE;
}
-keepclassmembers class <1> {
    public static <1> INSTANCE;
    kotlinx.serialization.KSerializer serializer(...);
}

# This required for the process runtime.
-keep class app.revanced.manager.patcher.runtime.process.* {
  *;
}
# Required for the patcher to function correctly
-keep class app.revanced.patcher.** {
  *;
}
-keep class brut.** {
  *;
}
-keep class org.xmlpull.** {
  *;
}
-keep class kotlin.** {
  *;
}
-keep class org.jf.** {
  *;
}
-keep class com.android.** {
  *;
}
-keep class app.revanced.manager.plugin.** {
  *;
}

-dontwarn com.google.j2objc.annotations.*
-dontwarn java.awt.**
-dontwarn javax.**
-dontwarn org.slf4j.**