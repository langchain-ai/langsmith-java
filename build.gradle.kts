buildscript {
    configurations.classpath {
        resolutionStrategy {
            // CVE-2026-54512, CVE-2026-54513, and CVE-2026-54515: Dokka 2.2.0 depends on a vulnerable
            // jackson-databind version. Remove once Dokka resolves jackson-databind >= 2.18.9.
            force("com.fasterxml.jackson.core:jackson-databind:2.18.9")
        }
    }
}

plugins {
    id("org.jetbrains.dokka") version "2.2.0"
    id("org.jetbrains.dokka-javadoc") version "2.2.0"
}

repositories {
    mavenCentral()
}

allprojects {
    group = "com.langchain.smith"
    version = "0.1.0-beta.7" // x-release-please-version

    configurations.matching { it.name.startsWith("dokka") }.configureEach {
        // Keep Dokka worker classpaths on the same patched version as the buildscript classpath.
        resolutionStrategy.force("com.fasterxml.jackson.core:jackson-databind:2.18.9")
    }

    configurations.matching { it.name == "kotlinBouncyCastleConfiguration" }.configureEach {
        // CVE-2026-3505: remove once Kotlin's publishing validation selects Bouncy Castle >= 1.84.
        resolutionStrategy.force(
            "org.bouncycastle:bcpg-jdk18on:1.84",
            "org.bouncycastle:bcpkix-jdk18on:1.84",
            "org.bouncycastle:bcprov-jdk18on:1.84",
        )
    }
}

subprojects {
    // These are populated with dependencies by `buildSrc` scripts.
    tasks.register("format") {
        group = "Verification"
        description = "Formats all source files."
    }
    tasks.register("lint") {
        group = "Verification"
        description = "Verifies all source files are formatted."
    }
}

subprojects {
    apply(plugin = "org.jetbrains.dokka")
    apply(plugin = "org.jetbrains.dokka-javadoc")
}

// Avoid race conditions between `dokkaJavadocCollector` and `dokkaJavadocJar` tasks
tasks.named("dokkaJavadocCollector").configure {
    subprojects.flatMap { it.tasks }
        .filter { it.project.name != "langsmith-java" && it.name == "dokkaJavadocJar" }
        .forEach { mustRunAfter(it) }
}
