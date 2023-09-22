plugins {
  id("com.android.application")
  id("org.jetbrains.kotlin.android")
  id("com.google.android.libraries.mapsplatform.secrets-gradle-plugin")
  kotlin("kapt")
  id("com.google.dagger.hilt.android")

}

android {
  namespace = "com.example.roverclone"
  compileSdk = 34

  defaultConfig {
    applicationId = "com.example.roverclone"
    minSdk = 26
    targetSdk = 34
    versionCode = 1
    versionName = "1.0"

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    vectorDrawables {
      useSupportLibrary = true
    }
  }

  buildTypes {
    release {
      isDebuggable = false
      isMinifyEnabled = true
      isShrinkResources = true
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }
  kotlinOptions {
    jvmTarget = "1.8"
  }
  viewBinding.enable = true
  dataBinding.enable = true
  buildFeatures {
    viewBinding = true
  }
}

dependencies {

  implementation("androidx.core:core-ktx:1.12.0")
  implementation("androidx.appcompat:appcompat:1.6.1")
  implementation("com.google.android.material:material:1.9.0")
  implementation("androidx.constraintlayout:constraintlayout:2.1.4")
  implementation("androidx.legacy:legacy-support-v4:1.0.0")
  testImplementation("junit:junit:4.13.2")
  androidTestImplementation("androidx.test.ext:junit:1.1.5")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

  //Otp View
  implementation("io.github.chaosleung:pinview:1.4.4")

  //Retrofit
  implementation("com.squareup.retrofit2:retrofit:2.9.0")
  implementation("com.google.code.gson:gson:2.9.0")
  implementation("com.squareup.retrofit2:converter-gson:2.9.0")
  implementation("com.squarup.okhttp3:okhttp:4.9.3")
  implementation("com.squareup.okhttp3:logging-interceptor:4.8.1")

  //Google maps
  implementation("com.google.android.gms:play-services-maps:18.1.0")

  //dagger-hilt
  implementation("com.google.dagger:hilt-android:2.44")
  kapt("com.google.dagger:hilt-android-compiler:2.44")

  //coroutines
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")

  // lifecycle
  val lifecycle_version = "2.6.2"
  implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
  implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")

  // Navigation Kotlin
  val nav_version = "2.7.3"
  implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
  implementation("androidx.navigation:navigation-ui-ktx:$nav_version")
}

// Allow references to generated code
kapt {
  correctErrorTypes = true
}