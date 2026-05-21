plugins {
    `kotlin-dsl`
    kotlin("jvm") version "2.3.21"
    id("com.vanniktech.maven.publish") version "0.36.0"
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
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:2.3.21")
    implementation("com.vanniktech:gradle-maven-publish-plugin:0.36.0")
}

// Security: constrain vulnerable transitive build-classpath dependencies.
configurations.all {
    resolutionStrategy {
        // CVE-2026-5598, CVE-2026-3505, CVE-2026-0636, CVE-2026-5588
        // Bouncy Castle 1.80/1.80.2 → 1.84 (timing channel, resource consumption, LDAP injection, broken crypto)
        // Used by Gradle signing plugin for artifact signing.
        force("org.bouncycastle:bcprov-jdk18on:1.84")
        force("org.bouncycastle:bcpg-jdk18on:1.84")
        force("org.bouncycastle:bcpkix-jdk18on:1.84")
        // CVE-2025-67030 — plexus-utils directory traversal; 4.0.2 → 4.0.3
        force("org.codehaus.plexus:plexus-utils:4.0.3")
    }
}
