import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.get

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

    this.coordinates(project.group.toString(), project.name, project.version.toString())

    pom {
        name.set("LangSmith")
        description.set("An SDK library for LangSmith")
        url.set("https://docs.LangSmith.com")

        licenses {
            license {
                name.set("Apache-2.0")
            }
        }

        developers {
            developer {
                name.set("Lang Smith")
                email.set("dev-feedback@LangSmith.com")
            }
        }

        scm {
            connection.set("scm:git:git://github.com/langchain-ai/langsmith-java.git")
            developerConnection.set("scm:git:git://github.com/langchain-ai/langsmith-java.git")
            url.set("https://github.com/langchain-ai/langsmith-java")
        }
    }
}