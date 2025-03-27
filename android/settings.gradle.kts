pluginManagement {
    val flutterSdkPath = run {
        val properties = java.util.Properties()
        file("local.properties").inputStream().use { properties.load(it) }
        val flutterSdkPath = properties.getProperty("flutter.sdk")
        require(flutterSdkPath != null) { "flutter.sdk not set in local.properties" }
        flutterSdkPath
    }

    includeBuild("$flutterSdkPath/packages/flutter_tools/gradle")

    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

include(":app")
include(":ra-sdk")
project(":ra-sdk").projectDir = file("../ra-sdk")
include(":re-sdk")
project(":re-sdk").projectDir = file("../re-sdk")
include(":re-sdk-bundle")
project(":re-sdk-bundle").projectDir = file("../re-sdk-bundle")