plugins {
    id("langchain.java")
    application
    id("org.springframework.boot") version "2.7.18" apply false
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":langsmith-java"))
    
    // Spring Boot dependencies (optional - only needed for Spring Boot example)
    implementation(platform("org.springframework.boot:spring-boot-dependencies:2.7.18"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter")
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :langsmith-java-example:run` to run `Main`
    // Use `./gradlew :langsmith-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.langchain.smith.example.${
        if (project.hasProperty("example")) {
            val exampleName = project.property("example") as String
            if (exampleName.endsWith("Example")) exampleName else "${exampleName}Example"
        } else {
            "Main"
        }
    }"
}

// Export stdin to examples for readln()
tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}
