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
    // OpenAI SDK for RunExperimentExample
    implementation("com.openai:openai-java:4.6.1")

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
    mainClass = "com.langchain.smith.example.${
        if (project.hasProperty("example")) {
            val exampleName = project.property("example") as String
            val baseName = if (exampleName.endsWith("Example")) exampleName else "${exampleName}Example"
            
            // Check if it's a Java or Kotlin file
            val javaFile = file("src/main/java/com/langchain/smith/example/${baseName}.java")
            val kotlinFile = file("src/main/kotlin/com/langchain/smith/example/${baseName}.kt")
            
            if (javaFile.exists()) {
                // Java file - no Kt suffix
                baseName
            } else if (kotlinFile.exists()) {
                // Kotlin file - add Kt suffix for main function
                "${baseName}Kt"
            } else {
                // Default: assume Kotlin for backwards compatibility
                "${baseName}Kt"
            }
        } else {
            "Main"
        }
    }"
}

// Export stdin to examples for readln()
tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}
