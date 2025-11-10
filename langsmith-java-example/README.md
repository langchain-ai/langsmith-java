# LangSmith Java SDK Examples

This directory contains runnable examples demonstrating how to use the LangSmith Java SDK.

## Prerequisites

- Java 11 or higher
- LangSmith API credentials

## Setup

Set the required environment variables:

```bash
export LANGSMITH_API_KEY="your-api-key"  # https://smith.langchain.com/settings/apikeys
export LANGSMITH_BASE_URL="https://api.smith.langchain.com"  # or your instance URL if self-hosted
```

Some examples may require additional environment variables. Check the example's documentation for details.

## Running Examples

To run an example, use the Gradle application plugin with the `-Pexample` parameter:

```bash
./gradlew :langsmith-java-example:run -Pexample=<ExampleName>
```

For example, to run `CreateExamplesExample.kt`:

```bash
./gradlew :langsmith-java-example:run -Pexample=CreateExamples
```

## Finding Examples

All examples are located in `src/main/kotlin/com/langchain/smith/example/`. Each file ending in `Example.kt` is a runnable example with documentation explaining its purpose and usage.

Browse the source files to discover available examples and see detailed usage instructions in each file's KDoc comments.
