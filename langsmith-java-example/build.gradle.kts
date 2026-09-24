plugins {
    application
    kotlin("jvm")
    id("org.jetbrains.kotlin.plugin.spring") version "2.4.10"
    id("org.springframework.boot") version "4.1.1" apply false
}

repositories {
    mavenCentral()
}

configurations.configureEach {
    // Keep the example on the latest stable Logback line.
    resolutionStrategy.force(
        "ch.qos.logback:logback-classic:1.6.3",
        "ch.qos.logback:logback-core:1.6.3",
    )
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
    implementation("com.fasterxml.jackson.core:jackson-databind:2.22.1")

    // Spring Boot dependencies (optional - only needed for Spring Boot example)
    implementation(platform("org.springframework.boot:spring-boot-dependencies:4.1.1"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter")

    constraints {
        implementation("org.apache.tomcat.embed:tomcat-embed-core:11.0.26")
        implementation("org.apache.tomcat.embed:tomcat-embed-el:11.0.26")
        implementation("org.apache.tomcat.embed:tomcat-embed-websocket:11.0.26")
    }

    // Simple logging for examples. This lets smoke tests show SDK debug/trace logs.
    runtimeOnly("org.slf4j:slf4j-simple:2.0.20")
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
