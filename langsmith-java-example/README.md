# LangSmith Java Examples

## 1. Jaeger (Local)

Send traces to local Jaeger instance.

```bash
# Start Jaeger
docker run -d --name jaeger -p 4318:4318 -p 16686:16686 jaegertracing/all-in-one:latest

# Run example
./gradlew :langsmith-java-example:run -Pexample=OtelJaeger

# View traces
open http://localhost:16686
```

## 2. OpenAI + LangSmith (Real API Calls)

Make actual OpenAI API calls with automatic tracing to LangSmith.

```bash
export OPENAI_API_KEY=your_openai_key
export LANGSMITH_API_KEY=your_langsmith_key
export LANGSMITH_PROJECT=my-project  # optional, defaults to "default"

./gradlew :langsmith-java-example:run -Pexample=OtelOpenAI
```

View traces at https://smith.langchain.com

## 3. LangSmith (Standalone)

Send mock traces to LangSmith without external API calls.

```bash
export LANGSMITH_API_KEY=your_api_key
export LANGSMITH_PROJECT=my-project  # optional, defaults to "default"

./gradlew :langsmith-java-example:run -Pexample=OtelLangSmith
```

View traces at https://smith.langchain.com

## 4. Spring Boot API to Langsmith

REST API with OpenTelemetry traces sent to LangSmith.

```bash
export LANGSMITH_API_KEY=your_api_key
export LANGSMITH_PROJECT=my-project  # optional

# Start server
./gradlew :langsmith-java-example:run -Pexample=SpringBootLangSmith

# In another terminal, test endpoints:
curl -X POST http://localhost:8080/api/chat \
  -H "Content-Type: application/json" \
  -d '{"message": "Hello!"}'

curl "http://localhost:8080/api/analyze?text=This%20is%20great"
```
