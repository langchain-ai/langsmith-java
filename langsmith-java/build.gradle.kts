plugins {
    id("langsmith.kotlin")
    id("langsmith.publish")
}

dependencies {
    api(project(":langsmith-java-client-okhttp"))
}
