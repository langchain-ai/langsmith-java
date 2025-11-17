# LangSmith Java Examples

This module contains runnable examples organized by feature:
- **`otel/`** - OpenTelemetry tracing examples
- **`prompt/`** - Prompt management examples

## Prerequisites

All examples require:
```bash
./gradlew :langsmith-java-example:run -Pexample=ExampleName -Dlangchain.langsmithApiKey=your_api_key
```

Alternatively, you can use environment variables:
```bash
export LANGSMITH_API_KEY=your_api_key
```

The `langchain.baseUrl` system property (or `LANGSMITH_ENDPOINT` environment variable) is optional and defaults to `https://api.smith.langchain.com/` if not set.

## OpenTelemetry Tracing Examples

Located in `src/main/java/com/langchain/smith/example/otel/`

### Jaeger (Local)

Send traces to local Jaeger instance.

```bash
# Start Jaeger
docker run -d --name jaeger -p 4318:4318 -p 16686:16686 jaegertracing/all-in-one:latest

# Run example
./gradlew :langsmith-java-example:run -Pexample=OtelJaeger

# View traces
open http://localhost:16686
```

### OpenAI + LangSmith (Real API Calls)

Make actual OpenAI API calls with automatic tracing to LangSmith.

```bash
./gradlew :langsmith-java-example:run -Pexample=OtelOpenAI \
  -Dlangchain.langsmithApiKey=your_api_key \
  -DOPENAI_API_KEY=your_openai_key \
  -DLANGSMITH_PROJECT=my-project  # optional, defaults to "default"
```

View traces at https://smith.langchain.com

### LangSmith (Standalone)

Send mock traces to LangSmith without external API calls.

```bash
./gradlew :langsmith-java-example:run -Pexample=OtelLangSmith \
  -Dlangchain.langsmithApiKey=your_api_key \
  -DLANGSMITH_PROJECT=my-project  # optional, defaults to "default"
```

View traces at https://smith.langchain.com

### Spring Boot API to LangSmith

REST API with OpenTelemetry traces sent to LangSmith.

```bash
# Start server
./gradlew :langsmith-java-example:run -Pexample=SpringBootLangSmith \
  -Dlangchain.langsmithApiKey=your_api_key \
  -DLANGSMITH_PROJECT=my-project  # optional

# In another terminal, test endpoints:
curl -X POST http://localhost:8080/api/chat \
  -H "Content-Type: application/json" \
  -d '{"message": "Hello!"}'

curl "http://localhost:8080/api/analyze?text=This%20is%20great"
```

## Prompt Management Examples

Located in `src/main/java/com/langchain/smith/example/prompt/`

### Prompt Management (Getting Started)

**RECOMMENDED** - Clean, simple example following the same pattern as the Dataset example.

```bash
./gradlew :langsmith-java-example:run -Pexample=PromptManagement \
  -Dlangchain.langsmithApiKey=your_api_key
```

**Features demonstrated:**
1. Create prompt repositories using `client.repos().create()`
2. Add prompt content with variables using `client.commits().update()`
3. List and filter prompts using `client.repos().list()`
4. Retrieve prompt content using `client.commits().retrieve()`
5. View prompts in the LangSmith UI

This example follows the [LangSmith Prompt Management docs](https://docs.langchain.com/langsmith/manage-prompts-programmatically) and uses the SDK directly.

```

**Additional features:**
- Use prompts with OpenAI to generate responses
- Update prompt metadata and descriptions
- Pull specific commit versions
- System + user message prompts
