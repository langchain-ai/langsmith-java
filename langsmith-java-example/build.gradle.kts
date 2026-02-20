plugins {
    application
    kotlin("jvm")
    id("org.jetbrains.kotlin.plugin.spring") version "2.0.21"
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
    doFirst {
        if (mainClass.get() == "Main") {
            throw GradleException(
                "Example module requires -Pexample=ExampleName. " +
                "e.g. ./gradlew :langsmith-java-example:run -Pexample=ListRuns"
            )
        }
    }
}
