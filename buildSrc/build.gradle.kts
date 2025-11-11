plugins {
    `kotlin-dsl`
    kotlin("jvm") version "2.0.21"
    id("com.vanniktech.maven.publish") version "0.28.0"
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
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:2.0.21")
    implementation("com.vanniktech:gradle-maven-publish-plugin:0.28.0")
}
