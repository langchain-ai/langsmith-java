buildscript {
    configurations.classpath {
        resolutionStrategy {
            // Keep build-plugin classpaths on patched transitive dependency versions. Remove these
            // constraints once the plugins resolve versions at or above these floors.
            force(
                // CVE-2026-54512, CVE-2026-54513, and CVE-2026-54515.
                "com.fasterxml.jackson.core:jackson-databind:2.18.9",
                // CVE-2026-64607.
                "org.apache.httpcomponents.client5:httpclient5:5.6.3",
                // CVE-2026-54399 and CVE-2026-54428.
                "org.apache.httpcomponents.core5:httpcore5:5.4.3",
                "org.apache.httpcomponents.core5:httpcore5-h2:5.4.3",
                // CVE-2026-49844.
                "org.apache.logging.log4j:log4j-api:2.25.5",
                "org.apache.logging.log4j:log4j-core:2.25.5",
            )
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
    version = "0.1.0-beta.18" // x-release-please-version

    configurations.matching { it.name.startsWith("dokka") }.configureEach {
        // Keep Dokka worker classpaths on patched transitive dependency versions.
        resolutionStrategy.force(
            "com.fasterxml.jackson.core:jackson-databind:2.18.9",
            "org.jsoup:jsoup:1.23.1",
        )
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
