plugins {
    id("org.jetbrains.kotlin.jvm")
}

repositories {
    mavenCentral()
}

dependencies {
    // Assuming langsmith-java-core and langsmith-java-client-okhttp are needed for the examples
    implementation(project(":langsmith-java-core"))
    implementation(project(":langsmith-java-client-okhttp"))
    implementation(project(":langsmith-java-trace"))

    // Add any additional dependencies your examples need
    implementation("com.google.guava:guava:33.0-jre")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")
    implementation("com.theokanning.openai-gpt3-java:service:0.18.2")

    // Test dependencies if needed
    testImplementation(kotlin("test"))
}

tasks.withType<Jar> {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

// Dynamically create a task for each example
val examples = listOf("OpenAiExample") // Add the names of your example classes here

examples.forEach { example ->
    tasks.create("run$example", org.gradle.api.tasks.JavaExec::class.java) {
        group = "Examples"
        description = "Run $example"
        classpath = sourceSets.getByName("main").runtimeClasspath
        mainClass.set("com.langsmith.example.$example")
    }
}
