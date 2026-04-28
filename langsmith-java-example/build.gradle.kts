plugins {
    application
    kotlin("jvm")
    id("org.jetbrains.kotlin.plugin.spring") version "2.1.20"
    id("org.springframework.boot") version "2.7.18" apply false
}

repositories {
    mavenCentral()
}

// Align with Kotlin JVM target (Kotlin plugin applies Java plugin; keep targets consistent)
java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

dependencies {
    implementation(project(":langsmith-java"))
    implementation(kotlin("stdlib"))

    // Jackson for JSON handling in examples
    implementation("com.fasterxml.jackson.core:jackson-databind:2.13.4")

    // Spring Boot dependencies (optional - only needed for Spring Boot example)
    implementation(platform("org.springframework.boot:spring-boot-dependencies:2.7.18"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter")

    // Simple logging for examples. This lets smoke tests show SDK debug/trace logs.
    runtimeOnly("org.slf4j:slf4j-simple:2.0.17")

    // Security: constrain vulnerable transitive dependencies from Spring Boot 2.7.18.
    // Spring Boot 2.7.x is EOL; these constraints override the managed versions in-place.
    // None of these affect published artifacts (this is a non-published example module).
    constraints {
        // CVE-2025-24813 (CRITICAL), CVE-2026-24734, CVE-2025-55752, CVE-2025-53506,
        // CVE-2025-52520, CVE-2025-48989, CVE-2025-48988, CVE-2024-56337, CVE-2024-50379, CVE-2024-34750
        // Remove this constraint when upgrading to Spring Boot 3.x (which manages Tomcat 10+).
        implementation("org.apache.tomcat.embed:tomcat-embed-core") { version { require("9.0.115") } }
        implementation("org.apache.tomcat.embed:tomcat-embed-websocket") { version { require("9.0.115") } }
        // CVE-2024-22243, CVE-2024-22259, CVE-2024-22262
        // Note: CVE-2016-1000027 (CRITICAL) requires spring-web 6.0.0 — needs Spring Boot 3.x upgrade.
        implementation("org.springframework:spring-web") { version { require("5.3.34") } }
        implementation("org.springframework:spring-webmvc") { version { require("5.3.34") } }
        // CVE-2023-6481, CVE-2023-6378
        implementation("ch.qos.logback:logback-core") { version { require("1.2.13") } }
        implementation("ch.qos.logback:logback-classic") { version { require("1.2.13") } }
        // CVE-2022-25857 (note: CVE-2022-1471 requires snakeyaml 2.0 which is incompatible with Spring Boot 2.7.x)
        implementation("org.yaml:snakeyaml") { version { require("1.31") } }
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_21)
    }
}

application {
    // Require -Pexample=Name to run an example (e.g. -Pexample=ListRuns, -Pexample=OtelLangSmith)
    mainClass = if (project.hasProperty("example")) {
        var exampleName = project.property("example") as String
        val aliases = mapOf(
            "OtelLangSmithSimple" to "OtelLangSmith",
            "PromptManagmentExample" to "PromptManagement",
            "PromptManagment" to "PromptManagement",
        )
        exampleName = aliases[exampleName] ?: exampleName
        val baseName = if (exampleName.endsWith("Example")) exampleName else "${exampleName}Example"
        val searchPaths = listOf(
            "" to "com.langchain.smith.example",
            "otel/" to "com.langchain.smith.example.otel"
        )
        var foundPackage = ""
        for ((subdir, packageName) in searchPaths) {
            val kotlinFile = file("src/main/kotlin/com/langchain/smith/example/${subdir}${baseName}.kt")
            if (kotlinFile.exists()) {
                foundPackage = packageName
                break
            }
        }
        if (foundPackage.isNotEmpty()) {
            "${foundPackage}.${baseName}Kt"
        } else {
            throw GradleException(
                "Example '$exampleName' not found. No ${baseName}.kt in " +
                "src/main/kotlin/.../example/ or .../example/otel/. " +
                "Use -Pexample=ListRuns, -Pexample=OtelLangSmith, -Pexample=OtelLangSmithSimple, -Pexample=OtelOpenAI, etc."
            )
        }
    } else {
        "Main"  // placeholder; run task doFirst will require -Pexample=
    }
}

// Export stdin to examples for readln(); require -Pexample= when running (configuration-cache safe: no project access in doFirst)
tasks.named<JavaExec>("run") {
    standardInput = System.`in`
    systemProperty("org.slf4j.simpleLogger.defaultLogLevel", "info")
    systemProperty("org.slf4j.simpleLogger.log.com.langchain.smith.client.AutoBatchQueue", "trace")
    systemProperty("org.slf4j.simpleLogger.showDateTime", "false")
    systemProperty("org.slf4j.simpleLogger.showShortLogName", "true")
    doFirst {
        if (mainClass.get() == "Main") {
            throw GradleException(
                "Example module requires -Pexample=ExampleName. " +
                "e.g. ./gradlew :langsmith-java-example:run -Pexample=ListRuns"
            )
        }
    }
}
