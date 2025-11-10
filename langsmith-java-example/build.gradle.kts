plugins {
    id("langchain.kotlin")
    application
}

dependencies {
    implementation(project(":langsmith-java"))
}

application {
    // Use `./gradlew :langsmith-java-example:run` to run `Main`
    // Use `./gradlew :langsmith-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.langchain.smith.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "Main"
    }"
}
