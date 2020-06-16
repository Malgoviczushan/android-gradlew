//apply plugin: "com.android.application"
//apply plugin: "kotlin-android"
//apply plugin: "kotlin-android-extensions"

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion (Config.Android.compileSdkVersion)
    buildToolsVersion (Config.Android.buildToolsVersion)

    defaultConfig {
        applicationId = Config.Android.applicationId
        minSdkVersion (Config.Android.minSdkVersion)
        targetSdkVersion (Config.Android.targetSdkVersion)
        versionCode= Config.Android.versionCode
        versionName= Config.Android.versionName

        testInstrumentationRunner="androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles (getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation (fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation ("org.jetbrains.kotlin:kotlin-stdlib:1.3.72")
    implementation ("androidx.core:core-ktx:1.3.0")
    implementation ("androidx.appcompat:appcompat:${Config.AndroidLib.appcompatVersion}")
    implementation ("androidx.constraintlayout:constraintlayout:${Config.AndroidLib.constraintLayoutVersion}")
    testImplementation ("junit:junit:4.12")
    androidTestImplementation ("androidx.test.ext:junit:1.1.1")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.2.0")

}