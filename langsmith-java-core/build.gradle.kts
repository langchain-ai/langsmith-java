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

configurations.all {
    resolutionStrategy {
        // Compile and test against a lower Jackson version to ensure we're compatible with it. Note that
        // we generally support 2.13.4, but test against 2.14.0 because 2.13.4 has some annoying (but
        // niche) bugs (users should upgrade if they encounter them). We publish with a higher version
        // (see below) to ensure users depend on a secure version by default.
        force("com.fasterxml.jackson.core:jackson-core:2.14.0")
        force("com.fasterxml.jackson.core:jackson-databind:2.14.0")
        force("com.fasterxml.jackson.core:jackson-annotations:2.14.0")
        force("com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.14.0")
        force("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.14.0")
        force("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.0")
    }
}

dependencies {
    api("com.fasterxml.jackson.core:jackson-core:2.18.6")
    api("com.fasterxml.jackson.core:jackson-databind:2.18.6")
    api("com.google.errorprone:error_prone_annotations:2.33.0")

    implementation("com.fasterxml.jackson.core:jackson-annotations:2.18.6")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.18.6")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.18.6")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.18.6")
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

    // Security: constrain vulnerable transitive test dependencies (from wiremock-jre8).
    // These constraints apply to the test scope only and do not affect published artifacts.
    constraints {
        // CVE-2024-13009, CVE-2025-5115, CVE-2024-22201, CVE-2023-36478
        testImplementation("org.eclipse.jetty:jetty-server") { version { require("9.4.58.v20250814") } }
        testImplementation("org.eclipse.jetty.http2:http2-common") { version { require("9.4.58.v20250814") } }
        testImplementation("org.eclipse.jetty.http2:http2-hpack") { version { require("9.4.58.v20250814") } }
        // CVE-2023-6481, CVE-2023-6378, CVE-2025-11226, CVE-2024-12798, CVE-2024-12801, CVE-2026-1225
        testImplementation("ch.qos.logback:logback-core") { version { require("1.5.32") } }
        testImplementation("ch.qos.logback:logback-classic") { version { require("1.5.32") } }
        // CVE-2025-48976, CVE-2023-24998
        testImplementation("commons-fileupload:commons-fileupload") { version { require("1.6.0") } }
        // CVE-2024-47554
        testImplementation("commons-io:commons-io") { version { require("2.14.0") } }
        // CVE-2023-1370
        testImplementation("net.minidev:json-smart") { version { require("2.4.9") } }
        // CVE-2026-40682, CVE-2026-42027, CVE-2026-42440 (XXE + arbitrary class instantiation + OOM DoS)
        // opennlp-tools 2.5.4 is a transitive dep of langchain4j:1.12.2; fix is 2.5.9.
        testImplementation("org.apache.opennlp:opennlp-tools") { version { require("2.5.9") } }
        // CVE-2026-5598, CVE-2026-3505, CVE-2026-0636, CVE-2026-5588
        // Bouncy Castle 1.80/1.80.2 → 1.84 (covert timing channel, resource consumption, LDAP injection, broken crypto)
        testImplementation("org.bouncycastle:bcprov-jdk18on") { version { require("1.84") } }
        testImplementation("org.bouncycastle:bcpg-jdk18on") { version { require("1.84") } }
        testImplementation("org.bouncycastle:bcpkix-jdk18on") { version { require("1.84") } }
    }

    testImplementation(kotlin("test"))
    // Simple logging for tests only
    testImplementation("org.slf4j:slf4j-simple:2.0.17")
    testImplementation(project(":langsmith-java-client-okhttp"))
    testImplementation("com.github.tomakehurst:wiremock-jre8:2.35.2")
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
