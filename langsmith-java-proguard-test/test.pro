# Specify the entrypoint where ProGuard starts to determine what's reachable.
-keep class com.langchain.smith.proguard.** { *; }

# For the testing framework.
-keep class org.junit.** { *; }

# Kotlin reflection loads this class dynamically during test discovery.
-keep class kotlin.Unit { *; }

# Many warnings don't apply for our testing purposes.
-dontnote
-dontwarn
