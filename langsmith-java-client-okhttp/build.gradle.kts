plugins {
    id("langchain.kotlin")
    id("langchain.publish")
}

configurations.matching { it.name in setOf("testCompileClasspath", "testRuntimeClasspath") }.configureEach {
    // Test-only WireMock 4 requires Java 17+ dependencies. Published artifacts still target Java 8.
    attributes.attribute(org.gradle.api.attributes.java.TargetJvmVersion.TARGET_JVM_VERSION_ATTRIBUTE, 17)
}

dependencies {
    api(project(":langsmith-java-core"))

    implementation("com.squareup.okhttp3:okhttp:4.12.0")

    constraints {
        testImplementation("org.eclipse.jetty:jetty-server") { version { require("12.1.10") } }
        testImplementation("org.eclipse.jetty:jetty-http") { version { require("12.1.10") } }
        testImplementation("org.eclipse.jetty:jetty-servlets") { version { require("12.1.10") } }
        testImplementation("org.eclipse.jetty:jetty-xml") { version { require("12.1.10") } }
        testImplementation("org.eclipse.jetty.http2:http2-common") { version { require("12.1.10") } }
        testImplementation("org.eclipse.jetty.http2:http2-hpack") { version { require("12.1.10") } }
        testImplementation("org.eclipse.jetty.http2:http2-server") { version { require("12.1.10") } }
        testImplementation("com.github.jknack:handlebars") { version { require("4.5.2") } }
        testImplementation("commons-fileupload:commons-fileupload") { version { require("1.6.0") } }
        testImplementation("commons-io:commons-io") { version { require("2.22.0") } }
        testImplementation("com.google.guava:guava") { version { require("33.6.0-jre") } }
        testImplementation("com.jayway.jsonpath:json-path") { version { require("2.10.0") } }
        testImplementation("org.xmlunit:xmlunit-core") { version { require("2.12.0") } }
        testImplementation("net.minidev:json-smart") { version { require("2.6.0") } }
    }

    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.27.7")
    testImplementation("org.wiremock:wiremock:4.0.0-beta.37")
    testImplementation("org.wiremock:wiremock-junit5:4.0.0-beta.37")
}
