plugins {
    id("langsmith-api.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":langsmith-api-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :langsmith-api-java-example:run` to run `Main`
    // Use `./gradlew :langsmith-api-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.langsmith_api.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
