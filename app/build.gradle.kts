plugins {
   // alias(libs.plugins.android.application)
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.ratatouille"
    compileSdk = 34
    buildToolsVersion = "29.0.3"

    defaultConfig {
        applicationId = "com.example.ratatouille"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
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
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation("androidx.appcompat:appcompat:1.7.0") // Latest version
    implementation("androidx.constraintlayout:constraintlayout:2.1.4") // Latest version
    implementation("androidx.recyclerview:recyclerview:1.3.1") // Latest version
    implementation("androidx.cardview:cardview:1.0.0")
    implementation("com.google.firebase:firebase-database:20.2.1") // Latest version
    implementation("com.google.firebase:firebase-storage:20.2.0") // Latest version
    implementation("com.google.android.material:material:1.10.0") // Latest version
    implementation("com.github.bumptech.glide:glide:4.15.1") // Latest version
    implementation("com.google.firebase:firebase-auth:21.3.0") // Latest version
    implementation("androidx.navigation:navigation-fragment:2.7.3") // Latest version
    implementation("androidx.navigation:navigation-ui:2.7.3") // Latest version
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0") // Deprecated, consider using lifecycle-viewmodel or lifecycle-runtime
    implementation("com.google.firebase:firebase-firestore:24.9.1") // Latest version

    annotationProcessor("com.github.bumptech.glide:compiler:4.15.1")
    testImplementation("junit:junit:4.13.2") // Latest version
    androidTestImplementation("androidx.test.ext:junit:1.1.5") // Latest version
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1") // Latest version
    implementation(platform("com.google.firebase:firebase-bom:33.5.1"))
    implementation("com.google.firebase:firebase-analytics")

}