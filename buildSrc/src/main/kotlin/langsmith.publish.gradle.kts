plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("LangSmith")
                description.set("The LangSmith API is used to programmatically create and manage LangSmith\nresources.\n\n## Host\n\nhttps://dev.api.smith.langchain.com\n\n## Authentication\n\nTo authenticate with the LangSmith API, set the `X-Api-Key` header to a valid\n[LangSmith API key](https://docs.langchain.com/langsmith/create-account-api-key#create-an-api-key).")
                url.set("https://www.github.com/stainless-sdks/langsmith-api-java")

                licenses {
                    license {
                        name.set("Apache-2.0")
                    }
                }

                developers {
                    developer {
                        name.set("Langsmith")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/stainless-sdks/langsmith-api-java.git")
                    developerConnection.set("scm:git:git://github.com/stainless-sdks/langsmith-api-java.git")
                    url.set("https://github.com/stainless-sdks/langsmith-api-java")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
