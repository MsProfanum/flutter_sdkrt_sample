buildscript {
    extra.apply {
        set("kotlinVersion", "2.1.0")
        set("kspVersion","2.1.0-1.0.29")
        set("privacySandboxActivityVersion", "1.0.0-alpha01")
        set("privacySandboxSdkRuntimeVersion","1.0.0-alpha09")
        set("privacySandboxUiVersion", "1.0.0-alpha09")
        set("composeVersion", "1.7.8")
    }

    dependencies {
        classpath("com.android.tools.build:gradle:8.8.2")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

val newBuildDir: Directory = rootProject.layout.buildDirectory.dir("../../build").get()
rootProject.layout.buildDirectory.value(newBuildDir)

subprojects {
    val newSubprojectBuildDir: Directory = newBuildDir.dir(project.name)
    project.layout.buildDirectory.value(newSubprojectBuildDir)
}

subprojects {
    project.evaluationDependsOn(":app")
}

plugins {
    id("com.android.application").version("8.7.0-alpha04").apply(false)
    id("com.android.library").version("8.7.0-alpha04").apply(false)
    id("androidx.privacysandbox.library").version("1.0.0-alpha02").apply(false)
    id("org.jetbrains.kotlin.jvm").version("2.1.0").apply(false)
    id("com.google.devtools.ksp").version("2.1.0-1.0.29").apply(false)
    id("org.jetbrains.kotlin.plugin.compose").version("2.1.0").apply(false)
}

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}
