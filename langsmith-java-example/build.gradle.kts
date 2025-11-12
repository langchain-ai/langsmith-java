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
            // Kotlin files need "Kt" suffix for their main function
            "${baseName}Kt"
        } else {
            "Main"
        }
    }"
}

// Export stdin to examples for readln()
tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}
