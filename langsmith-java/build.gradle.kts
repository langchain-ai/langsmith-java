plugins {
    id("langchain.kotlin")
    id("langchain.publish")
}

dependencies {
    api(project(":langsmith-java-client-okhttp"))
}

// The umbrella `langsmith-java` artifact contains no source of its own, but we still publish a
// Javadoc JAR containing the docs for the modules it re-exports.
tasks.named<org.gradle.jvm.tasks.Jar>("dokkaJavadocJar").configure {
    val reexportedProjects = setOf("langsmith-java-client-okhttp", "langsmith-java-core")
    val subprojectJavadocTasks =
        rootProject.subprojects
            .filter { it.name in reexportedProjects }
            .map { it.tasks.named("dokkaGeneratePublicationJavadoc") }
    dependsOn(subprojectJavadocTasks)
    subprojectJavadocTasks.forEach { from(it) }
    duplicatesStrategy = DuplicatesStrategy.INCLUDE
}
