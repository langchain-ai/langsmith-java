plugins {
    `kotlin-dsl`
    kotlin("jvm") version "2.4.0"
    id("com.vanniktech.maven.publish") version "0.37.0"
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:2.4.0")
    implementation("com.vanniktech:gradle-maven-publish-plugin:0.37.0")
}
