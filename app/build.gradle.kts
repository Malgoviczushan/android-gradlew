//apply plugin: "com.android.application"
//apply plugin: "kotlin-android"
//apply plugin: "kotlin-android-extensions"

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion (29)
    buildToolsVersion ("30.0.0")

    defaultConfig {
        applicationId = "top.ss007.gradlewithkotlindsl"
        minSdkVersion (21)
        targetSdkVersion (29)
        versionCode= 1
        versionName= "1.0"

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
    implementation ("androidx.appcompat:appcompat:1.1.0")
    implementation ("androidx.constraintlayout:constraintlayout:1.1.3")
    testImplementation ("junit:junit:4.12")
    androidTestImplementation ("androidx.test.ext:junit:1.1.1")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.2.0")

}