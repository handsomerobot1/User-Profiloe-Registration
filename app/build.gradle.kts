plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.example.userprofileregistration"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.userprofileregistration"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    dependencies {
        // Room Database
        implementation ("androidx.room:room-runtime:2.6.1")
        implementation ("androidx.room:room-ktx:2.6.1")
        ksp ("androidx.room:room-compiler:2.6.1")

        // ViewModel and LiveData
        implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
        implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
    }
}