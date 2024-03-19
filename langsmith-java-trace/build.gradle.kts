plugins {
    id("langsmith.kotlin")
    id("langsmith.publish")
    id("org.jetbrains.kotlin.jvm")
}

val agent: Configuration by configurations.creating

dependencies {
    api(project(":langsmith-java-core"))
    api(project(":langsmith-java-client-okhttp"))
    api("com.fasterxml.jackson.core:jackson-core:2.14.1")
    api("com.fasterxml.jackson.core:jackson-databind:2.14.1")

    implementation("com.google.guava:guava:33.0.0-jre")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.14.1")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.14.1")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.14.1")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:1.7.0")
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.jetbrains.kotlin:kotlin-reflect")

    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.25.3")
    testImplementation("org.slf4j:slf4j-simple:2.0.12")
}

tasks.jar {
    from(sourceSets.main.get().output)

    configurations.runtimeClasspath.get().forEach { file ->
        from(if (file.isDirectory) file else zipTree(file))
    }
    duplicatesStrategy = DuplicatesStrategy.INCLUDE

    dependsOn(":langsmith-java-client-okhttp:jar", ":langsmith-java-core:jar")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.withType<Jar> {
    duplicatesStrategy = DuplicatesStrategy.INCLUDE
}