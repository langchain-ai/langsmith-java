# Lang Smith Java API Library

[![Maven Central](https://img.shields.io/maven-central/v/com.langsmith.api/langsmith-java)](https://central.sonatype.com/artifact/com.langsmith.api/langsmith-java/0.0.1-alpha.0)

The Lang Smith Java SDK provides convenient access to the Lang Smith REST API from applications written in Java. It includes helper classes with helpful types and documentation for every request and response property.

The Lang Smith Java SDK is similar to the Lang Smith Kotlin SDK but with minor differences that make it more ergonomic for use in Java, such as `Optional` instead of nullable values, `Stream` instead of `Sequence`, and `CompletableFuture` instead of suspend functions.

## Documentation

The REST API documentation can be found [on docs.langsmith.com](https://docs.LangSmith.com).

---

## Getting started

### Install dependencies

#### Gradle

```kotlin
implementation("com.langsmith.api:langsmith-java:0.0.1-alpha.0")
```

#### Maven

```xml
<dependency>
    <groupId>com.langsmith.api</groupId>
    <artifactId>langsmith-java</artifactId>
    <version>0.0.1-alpha.0</version>
</dependency>
```

### Configure the client

Use `LangSmithOkHttpClient.builder()` to configure the client. At a minimum you need to set `.apiKey()`, `.tenantId()` and `.bearerToken()`: // templates/JavaDocs.ts:866:17

```java // templates/JavaDocs.ts:847:16
import com.langsmith.api.client.LangSmithClient; // templates/JavaDocs.ts:849:25
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient;

LangSmithClient client = LangSmithOkHttpClient.builder() // templates/JavaDocs.ts:856:24
    .apiKey("My API Key") // templates/JavaDocs.ts:813:30 // templates/JavaDocs.ts:813:30
    .tenantId("My Tenant ID")
    .bearerToken("My Bearer Token")
    .build();
```

Alternately, set the environment with `LANG_SMITH_API_KEY`, `LANG_SMITH_TENANT_ID` or `LANG_SMITH_BEARER_TOKEN`, and use `LangSmithOkHttpClient.fromEnv()` to read from the environment.

```java // templates/JavaDocs.ts:877:14
LangSmithClient client = LangSmithOkHttpClient.fromEnv(); // templates/JavaDocs.ts:879:24

// Note: you can also call fromEnv() from the client builder, for example if you need to set additional properties // templates/JavaDocs.ts:887:17
LangSmithClient client = LangSmithOkHttpClient.builder() // templates/JavaDocs.ts:892:28
    .fromEnv()
    // ... set properties on the builder
    .build();
```

| Property    | Environment variable      | Required | Default value | // templates/JavaDocs.ts:904:13 |
| ----------- | ------------------------- | -------- | ------------- | ------------------------------- |
| apiKey      | `LANG_SMITH_API_KEY`      | true     | —             |
| tenantId    | `LANG_SMITH_TENANT_ID`    | true     | —             |
| bearerToken | `LANG_SMITH_BEARER_TOKEN` | true     | —             |

Read the documentation for more configuration options.

---

### Example: creating a resource

To create a new api key, first use the `ApiKeyRetrieveParams` builder to specify attributes, // templates/JavaDocs.ts:77:16
then pass that to the `retrieve` method of the `apiKeys` service.

```java // templates/JavaDocs.ts:85:16
import com.langsmith.api.models.ApiKeyRetrieveParams; // templates/JavaDocs.ts:87:24
import com.langsmith.api.models.List<ApiKeyGetResponse>;

ApiKeyRetrieveParams params = ApiKeyRetrieveParams.builder().build(); // templates/JavaSDK/Examples.ts:49:15 // templates/JavaSDK/Examples.ts:49:15
List<ApiKeyGetResponse> apiKeyRetrieveResponse = client.apiKeys().retrieve(params);
```

---

## Requests

### Parameters and bodies

To make a request to the Lang Smith API, you generally build an instance of the appropriate `Params` class.

In [Example: creating a resource](#example-creating-a-resource) above, we used the `ApiKeyRetrieveParams.builder()` to pass to // templates/JavaDocs.ts:338:16
the `retrieve` method of the `apiKeys` service.

Sometimes, the API may support other properties that are not yet supported in the Java SDK types. In that case,
you can attach them using the `putAdditionalProperty` method.

```java // templates/JavaDocs.ts:350:16
ApiKeyRetrieveParams params = ApiKeyRetrieveParams.builder() // templates/JavaDocs.ts:356:24 // templates/JavaDocs.ts:352:23
    // ... normal properties
    .putAdditionalProperty("secret_param", "4242")
    .build();
```

## Responses

### Response validation

When receiving a response, the Lang Smith Java SDK will deserialize it into instances of the typed model classes. In rare cases, the API may return a response property that doesn't match the expected Java type. If you directly access the mistaken property, the SDK will throw an unchecked `LangSmithInvalidDataException` at runtime. If you would prefer to check in advance that that response is completely well-typed, call `.validate()` on the returned model.

```java // templates/JavaDocs.ts:369:19
List<ApiKeyGetResponse> apiKeyRetrieveResponse = client.apiKeys().retrieve().validate();
```

### Response properties as JSON

In rare cases, you may want to access the underlying JSON value for a response property rather than using the typed version provided by
this SDK. Each model property has a corresponding JSON version, with an underscore before the method name, which returns a `JsonField` value.

```java // templates/JavaDocs.ts:482:19
JsonField field = responseObj._field(); // templates/JavaDocs.ts:485:19

if (field.isMissing()) {
  // Value was not specified in the JSON response
} else if (field.isNull()) {
  // Value was provided as a literal null
} else {
  // See if value was provided as a string
  Optional<String> jsonString = field.asString();

  // If the value given by the API did not match the shape that the SDK expects
  // you can deserialise into a custom type
  MyClass myObj = responseObj._field().asUnknown().orElseThrow().convert(MyClass.class);
}
```

### Additional model properties

Sometimes, the server response may include additional properties that are not yet available in this library's types. You can access them using the model's `_additionalProperties` method:

```java // templates/JavaDocs.ts:453:19
JsonValue secret = apiKeyRetrieveResponse._additionalProperties().get("secret_field");
```

---

---

## Error handling

This library throws exceptions in a single hierarchy for easy handling:

- **`LangSmithException`** - Base exception for all exceptions

  - **`LangSmithServiceException`** - HTTP errors with a well-formed response body we were able to parse. The exception message and the `.debuggingRequestId()` will be set by the server.

    | 400    | BadRequestException           |
    | ------ | ----------------------------- |
    | 401    | AuthenticationException       |
    | 403    | PermissionDeniedException     |
    | 404    | NotFoundException             |
    | 422    | UnprocessableEntityException  |
    | 429    | RateLimitException            |
    | 5xx    | InternalServerException       |
    | others | UnexpectedStatusCodeException |

  - **`LangSmithIoException`** - I/O networking errors
  - **`LangSmithInvalidDataException`** - any other exceptions on the client side, e.g.:
    - We failed to serialize the request body
    - We failed to parse the response body (has access to response code and body)

## Network options

### Retries // templates/JavaDocs.ts:620:16

Requests that experience certain errors are automatically retried 2 times by default, with a short exponential backoff. Connection errors (for example, due to a network connectivity problem), 408 Request Timeout, 409 Conflict, 429 Rate Limit, and >=500 Internal errors will all be retried by default.
You can provide a `maxRetries` on the client builder to configure this:

```java // templates/JavaDocs.ts:547:33
LangSmithClient client = LangSmithOkHttpClient.builder() // templates/JavaDocs.ts:552:20
    .fromEnv()
    .maxRetries(4)
    .build();
```

### Timeouts

Requests time out after 1 minute by default. You can configure this on the client builder:

```java // templates/JavaDocs.ts:561:35
LangSmithClient client = LangSmithOkHttpClient.builder() // templates/JavaDocs.ts:566:20
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build();
```

### Proxies

Requests can be routed through a proxy. You can configure this on the client builder:

```java // templates/JavaDocs.ts:575:33
LangSmithClient client = LangSmithOkHttpClient.builder() // templates/JavaDocs.ts:580:20
    .fromEnv()
    .proxy(new Proxy(
        Type.HTTP,
        new InetSocketAddress("proxy.com", 8080)
    ))
    .build();
```

## Semantic Versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals)_.
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/stainless-sdks/langsmith-java/issues) with questions, bugs, or suggestions.
