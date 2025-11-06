plugins {
    id("langchain.kotlin")
    id("langchain.publish")
}

dependencies {
    api(project(":langsmith-java-client-okhttp"))
}
