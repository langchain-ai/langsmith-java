plugins {
    id("langsmith.java")
}

dependencies {
    api(project(":langsmith-java-core"))
    api(project(":langsmith-java-client-okhttp"))
}

val uberJar by tasks.registering(Jar::class) {
    archiveClassifier.set("")
    from(sourceSets.main.get().output)
    dependsOn(configurations.runtimeClasspath)
    from({
        configurations.runtimeClasspath.get().filter { it.name.endsWith("jar") }.map { zipTree(it) }
    })
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

tasks.jar {
    enabled = false
}

artifacts {
    add("default", uberJar)
}

tasks.build {
    dependsOn(uberJar)
}