plugins {
    id("langchain.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":langsmith"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :langsmith-example:run` to run `Main`
    // Use `./gradlew :langsmith-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.langchain.smith.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
