import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinJvm
import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

extra["signingInMemoryKey"] = System.getenv("GPG_SIGNING_KEY")
extra["signingInMemoryKeyId"] = System.getenv("GPG_SIGNING_KEY_ID")
extra["signingInMemoryKeyPassword"] = System.getenv("GPG_SIGNING_PASSWORD")

configure<MavenPublishBaseExtension> {
    signAllPublications()
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    coordinates(project.group.toString(), project.name, project.version.toString())
    configure(
        KotlinJvm(
            javadocJar = JavadocJar.Dokka("dokkaJavadoc"),
            sourcesJar = true,
        )
    )

    pom {
        name.set("LangSmith")
        description.set("The LangSmith API is used to programmatically create and manage LangSmith\nresources.\n\n## Host\n\nhttps://dev.api.smith.langchain.com\n\n## Authentication\n\nTo authenticate with the LangSmith API, set the `X-Api-Key` header to a valid\n[LangSmith API key](https://docs.langchain.com/langsmith/create-account-api-key#create-an-api-key).")
        url.set("https://docs.smith.langchain.com/")

        licenses {
            license {
                name.set("MIT")
            }
        }

        developers {
            developer {
                name.set("LangChain")
                email.set("oss@langchain.dev")
            }
        }

        scm {
            connection.set("scm:git:git://github.com/langchain-ai/langsmith-java.git")
            developerConnection.set("scm:git:git://github.com/langchain-ai/langsmith-java.git")
            url.set("https://github.com/langchain-ai/langsmith-java")
        }
    }
}

tasks.withType<Zip>().configureEach {
    isZip64 = true
}
