plugins {
    id("langchain.java")
    application
    kotlin("jvm")
    id("org.springframework.boot") version "2.7.18" apply false
}

repositories {
    mavenCentral()
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

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_9)
    }
}

application {
    // Use `./gradlew :langsmith-java-example:run` to run `Main`
    // Use `./gradlew :langsmith-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = if (project.hasProperty("example")) {
        val exampleName = project.property("example") as String
        val baseName = if (exampleName.endsWith("Example")) exampleName else "${exampleName}Example"
        
        // Search in multiple subdirectories: root, otel, prompt
        val searchPaths = listOf(
            "" to "com.langchain.smith.example",
            "otel/" to "com.langchain.smith.example.otel",
            "prompt/" to "com.langchain.smith.example.prompt"
        )
        
        var foundPackage = ""
        var isKotlin = false
        
        for ((subdir, packageName) in searchPaths) {
            val javaFile = file("src/main/java/com/langchain/smith/example/${subdir}${baseName}.java")
            val kotlinFile = file("src/main/kotlin/com/langchain/smith/example/${subdir}${baseName}.kt")
            
            if (javaFile.exists()) {
                foundPackage = packageName
                isKotlin = false
                break
            } else if (kotlinFile.exists()) {
                foundPackage = packageName
                isKotlin = true
                break
            }
        }
        
        if (foundPackage.isNotEmpty()) {
            "${foundPackage}.${baseName}${if (isKotlin) "Kt" else ""}"
        } else {
            // Default: assume Kotlin in root for backwards compatibility
            "com.langchain.smith.example.${baseName}Kt"
        }
    } else {
        "Main"
    }
}

// Export stdin to examples for readln()
tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}
