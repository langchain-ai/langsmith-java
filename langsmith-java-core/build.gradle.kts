plugins {
    id("langchain.kotlin")
    id("langchain.publish")
}

val generateVersionProperties by tasks.registering {
    val outputDir = layout.buildDirectory.dir("generated/resources/version")
    val projectVersion = provider { project.version.toString() }
    outputs.dir(outputDir)
    inputs.property("version", projectVersion)
    doLast {
        val dir = outputDir.get().asFile.resolve("com/langchain/smith")
        dir.mkdirs()
        dir.resolve("version.properties").writeText("version=${projectVersion.get()}\n")
    }
}

sourceSets.main {
    resources.srcDir(generateVersionProperties)
}

val jacksonVersion = "2.22.0"
val jacksonAnnotationsVersion = "2.22"

configurations.matching { it.name in setOf("testCompileClasspath", "testRuntimeClasspath") }.configureEach {
    // Test-only WireMock 4 requires Java 17+ dependencies. Published artifacts still target Java 8.
    attributes.attribute(org.gradle.api.attributes.java.TargetJvmVersion.TARGET_JVM_VERSION_ATTRIBUTE, 17)
}

configurations.all {
    resolutionStrategy {
        // Keep all Jackson modules aligned so dependency resolution cannot select a vulnerable
        // transitive version from SDK or test dependencies.
        force("com.fasterxml.jackson.core:jackson-core:$jacksonVersion")
        force("com.fasterxml.jackson.core:jackson-databind:$jacksonVersion")
        force("com.fasterxml.jackson.core:jackson-annotations:$jacksonAnnotationsVersion")
        force("com.fasterxml.jackson.datatype:jackson-datatype-jdk8:$jacksonVersion")
        force("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:$jacksonVersion")
        force("com.fasterxml.jackson.module:jackson-module-kotlin:$jacksonVersion")
    }
}

dependencies {
    api("com.fasterxml.jackson.core:jackson-core:$jacksonVersion")
    api("com.fasterxml.jackson.core:jackson-databind:$jacksonVersion")
    api("com.google.errorprone:error_prone_annotations:2.33.0")

    implementation("com.fasterxml.jackson.core:jackson-annotations:$jacksonAnnotationsVersion")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jdk8:$jacksonVersion")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:$jacksonVersion")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:$jacksonVersion")
    implementation("com.github.luben:zstd-jni:1.5.7-7")
    implementation("org.apache.httpcomponents.core5:httpcore5:5.2.4")
    implementation("org.apache.httpcomponents.client5:httpclient5:5.3.1")

    // OpenTelemetry dependencies
    api("io.opentelemetry:opentelemetry-api:1.62.0")
    api("io.opentelemetry:opentelemetry-sdk:1.62.0")
    api("io.opentelemetry:opentelemetry-exporter-otlp:1.62.0")
    api("io.opentelemetry.semconv:opentelemetry-semconv:1.41.1")

    // OpenAI SDK (for wrapOpenAI tracing wrapper)
    api("com.openai:openai-java:4.30.0")

    // Mustache template engine (for prompt template formatting)
    implementation("com.samskivert:jmustache:1.16")

    // SLF4J for logging (API only - consumers choose implementation)
    api("org.slf4j:slf4j-api:2.0.17")

    // Anthropic SDK — optional peer dependency for prompt conversion.
    // Users who call AnthropicPayload.toAnthropicParams() must add this to their own dependencies.
    compileOnly("com.anthropic:anthropic-java:2.18.0")
    testImplementation("com.anthropic:anthropic-java:2.18.0")

    // Security: constrain vulnerable transitive test dependencies.
    // These constraints apply to the test scope only and do not affect published artifacts.
    constraints {
        testImplementation("org.eclipse.jetty:jetty-server") { version { require("12.1.10") } }
        testImplementation("org.eclipse.jetty:jetty-http") { version { require("12.1.10") } }
        testImplementation("org.eclipse.jetty:jetty-servlets") { version { require("12.1.10") } }
        testImplementation("org.eclipse.jetty:jetty-xml") { version { require("12.1.10") } }
        testImplementation("org.eclipse.jetty.http2:http2-common") { version { require("12.1.10") } }
        testImplementation("org.eclipse.jetty.http2:http2-hpack") { version { require("12.1.10") } }
        testImplementation("org.eclipse.jetty.http2:http2-server") { version { require("12.1.10") } }
        testImplementation("org.bouncycastle:bcpg-jdk18on") { version { require("1.84") } }
        testImplementation("org.bouncycastle:bcpkix-jdk18on") { version { require("1.84") } }
        testImplementation("org.bouncycastle:bcprov-jdk18on") { version { require("1.84") } }
        testImplementation("org.apache.logging.log4j:log4j-core") { version { require("2.25.4") } }
        testImplementation("org.apache.opennlp:opennlp-tools") { version { require("2.5.9") } }
        testImplementation("com.github.jknack:handlebars") { version { require("4.5.2") } }
        testImplementation("org.codehaus.plexus:plexus-utils") { version { require("4.0.3") } }
        testImplementation("org.apache.commons:commons-lang3") { version { require("3.20.0") } }
        testImplementation("org.apache.commons:commons-compress") { version { require("1.28.0") } }
        testImplementation("commons-fileupload:commons-fileupload") { version { require("1.6.0") } }
        testImplementation("commons-io:commons-io") { version { require("2.22.0") } }
        testImplementation("com.google.guava:guava") { version { require("33.6.0-jre") } }
        testImplementation("com.jayway.jsonpath:json-path") { version { require("2.10.0") } }
        testImplementation("org.xmlunit:xmlunit-core") { version { require("2.12.0") } }
        testImplementation("net.minidev:json-smart") { version { require("2.6.0") } }
    }

    testImplementation(kotlin("test"))
    // Simple logging for tests only
    testImplementation("org.slf4j:slf4j-simple:2.0.17")
    testImplementation(project(":langsmith-java-client-okhttp"))
    testImplementation("org.wiremock:wiremock:4.0.0-beta.37")
    testImplementation("org.wiremock:wiremock-junit5:4.0.0-beta.37")
    testImplementation("org.assertj:assertj-core:3.27.7")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.3")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.3")
    testImplementation("org.junit-pioneer:junit-pioneer:1.9.1")
    testImplementation("org.mockito:mockito-core:5.14.2")
    testImplementation("org.mockito:mockito-junit-jupiter:5.14.2")
    testImplementation("org.mockito.kotlin:mockito-kotlin:4.1.0")

    // LangChain4j for testing parallel tool execution context propagation
    testImplementation("dev.langchain4j:langchain4j:1.12.2")
    testImplementation("dev.langchain4j:langchain4j-core:1.12.2")
}
