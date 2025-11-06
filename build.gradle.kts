allprojects {
    group = "com.langchain.smith"
    version = "0.1.0-alpha.4" // x-release-please-version
}

subprojects {
    // These are populated with dependencies by `buildSrc` scripts.
    tasks.register("format") {
        group = "Verification"
        description = "Formats all source files."
    }
    tasks.register("lint") {
        group = "Verification"
        description = "Verifies all source files are formatted."
    }
}
