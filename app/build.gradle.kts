plugins {
    alias(libs.plugins.android.application)
}

android {
<<<<<<< HEAD
    namespace = "com.pedro.etimpamipedrogomesappdelivery"
=======
    namespace = "com.pedrogomes.estruturaandroid"
>>>>>>> a1cedeeabe497e2fee359639bac44ba053a3dd3f
    compileSdk {
        version = release(36)
    }

    defaultConfig {
<<<<<<< HEAD
        applicationId = "com.pedro.etimpamipedrogomesappdelivery"
=======
        applicationId = "com.pedrogomes.estruturaandroid"
>>>>>>> a1cedeeabe497e2fee359639bac44ba053a3dd3f
        minSdk = 24
        targetSdk = 36
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
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}