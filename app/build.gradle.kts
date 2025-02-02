plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "ardents.alexpolo"
    compileSdk = 34

    defaultConfig {
        applicationId = "ardents.alexpolo"
        minSdk = 24
        targetSdk = 33
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        viewBinding =true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation("com.airbnb.android:lottie:6.4.0")
    implementation ("com.github.denzcoskun:ImageSlideshow:0.1.2")
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    implementation ("com.airbnb.android:lottie:3.4.0")
    implementation ("io.github.chaosleung:pinview:1.4.4")
    implementation ("com.google.android.material:material:1.4.0")
    //LifeCycle
    implementation ("androidx.lifecycle:lifecycle-extensions:2.1.0")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.2.0")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")

    //Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.6.0")
    implementation ("com.google.code.gson:gson:2.8.5")
    implementation ("com.squareup.retrofit2:converter-gson:2.5.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:3.12.0")
    //Coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.5")
}