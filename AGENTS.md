# Agent Guidelines

Code conventions and patterns for this project, learned from review feedback.

## Code structure

### Break up complex functions with helpers

When a function has deeply nested logic or multiple concerns, extract helpers. Use `flatMap` + small named functions instead of imperative loops with nested `when`/`if`:

```kotlin
// Good
fun format(variables: Map<String, Any>): PromptMessages {
    val formatted = messages.flatMap { msg ->
        if (msg.isPlaceholder()) expandPlaceholder(msg, variables)
        else listOf(PromptMessage.withTemplate(msg, msg.format(variables)))
    }
    return PromptMessages(formatted, inputVariables, outputSchema)
}

private fun expandPlaceholder(msg: PromptMessage, variables: Map<String, Any>): List<PromptMessage> {
    val items = variables[msg.template] as? List<*> ?: return emptyList()
    return items.mapNotNull(::toPromptMessage)
}

// Bad — deeply nested imperative loop
fun format(variables: Map<String, Any>): PromptMessages {
    val formatted = mutableListOf<PromptMessage>()
    for (msg in messages) {
        if (msg.isPlaceholder()) {
            val value = variables[msg.template]
            if (value is List<*>) {
                for (item in value) {
                    when (item) {
                        is PromptMessage -> formatted.add(item)
                        is Map<*, *> -> { /* 15 more lines */ }
                    }
                }
            }
        } else { ... }
    }
}
```

## Kotlin idioms

### Use `buildMap` / `buildList` instead of mutable + convert

```kotlin
// Good
val messages = items.map { msg ->
    buildMap<String, String> {
        put("role", msg.role)
        put("content", msg.content)
        msg.toolCallId?.let { put("tool_call_id", it) }
    }
}

// Bad — unnecessary mutable/immutable conversion
val messages = items.map { msg ->
    val base = mutableMapOf<String, String>(
        "role" to msg.role,
        "content" to msg.content,
    )
    if (msg.toolCallId != null) {
        base["tool_call_id"] = msg.toolCallId
    }
    base.toMap()
}
```

### Use `buildList` for conditional `toString()` parts

```kotlin
// Good
override fun toString(): String {
    val parts = buildList {
        add("messages=[${messages.joinToString(", ")}]")
        if (inputVariables.isNotEmpty()) add("inputVariables=$inputVariables")
        commitHash?.let { add("commitHash=$it") }
        outputSchema?.let { add("outputSchema=${it["title"] ?: "..."}") }
    }
    return "Prompt{${parts.joinToString(", ")}}"
}

// Bad — chained ternary string concatenation
override fun toString(): String =
    "Prompt{messages=[...]" +
        (if (commitHash != null) ", commitHash=$commitHash" else "") +
        (if (hasOutputSchema()) ", outputSchema=..." else "") +
        "}"
```

### Use `partition` instead of double `filter`

```kotlin
// Good — single pass
val (systemMessages, nonSystemMessages) =
    messages.partition { it.role == Role.SYSTEM }

// Bad — iterates the list twice
val systemMessages = messages.filter { it.role == Role.SYSTEM }
val nonSystemMessages = messages.filter { it.role != Role.SYSTEM }
```

### Use parameterized tests for table-driven cases

When multiple tests share the exact same structure (input → assert same fields), use `@ParameterizedTest` with `@MethodSource`:

```kotlin
data class Case(val input: String, val expected: String)

@ParameterizedTest(name = "{index}: \"{0}\"")
@MethodSource("cases")
fun myTest(case: Case) {
    assertThat(transform(case.input)).isEqualTo(case.expected)
}

companion object {
    @JvmStatic
    fun cases(): Stream<Case> = Stream.of(
        Case("input1", "expected1"),
        Case("input2", "expected2"),
    )
}
```

Only do this when every test has the same assertion shape. If tests have different setup or assertions, keep them as individual `@Test` methods.

### Extract test assertion helpers to reduce repetition

When the same assertion pattern appears across many tests, extract a helper:

```kotlin
// Good — readable, DRY
private fun assertMessage(msg: Map<String, String>, role: String, content: String) {
    assertThat(msg["role"]).isEqualTo(role)
    assertThat(msg["content"]).isEqualTo(content)
}

assertMessage(result.messages[0], "system", "You are helpful.")
assertMessage(result.messages[1], "user", "Hello")

// Bad — verbose, repetitive
assertThat(result.messages[0]).isEqualTo(mapOf("role" to "system", "content" to "You are helpful."))
assertThat(result.messages[1]).isEqualTo(mapOf("role" to "user", "content" to "Hello"))
```

## Formatting and linting

```bash
./gradlew :langsmith-java-core:formatKotlin
./gradlew lintKotlin
```

The project uses ktfmt with `--kotlinlang-style`.

## Testing

### Don't add comments that restate the test name

Test function names should be descriptive enough on their own. Don't add comments that repeat what the name already says:

```kotlin
// Good — name is self-documenting
@Test
fun parseLegacyPromptTemplateWithTemplateFormat() {
    val manifest = ...
}

// Bad — comment restates the function name
@Test
fun parseLegacyPromptTemplateWithTemplateFormat() {
    // Legacy PromptTemplate format with template_format field
    val manifest = ...
}
```

### Running tests

Try to run targeted tests matching the code you changed:

```bash
# Run tests for the package you changed
./gradlew :langsmith-java-core:test --tests "com.langchain.smith.prompts.*" --rerun

# Run a single test class
./gradlew :langsmith-java-core:test --tests "com.langchain.smith.prompts.ManifestParserTest" --rerun

# Run a single test method
./gradlew :langsmith-java-core:test --tests "com.langchain.smith.prompts.ManifestParserTest.parsePromptTemplate" --rerun

# See println output
./gradlew :langsmith-java-core:test --tests "..." --rerun --info
```

Only run the full suite (`./gradlew :langsmith-java-core:test --rerun`) before finalizing a PR or after large cross-cutting changes.

### Integration tests

Integration tests require environment variables:

```bash
export LANGSMITH_API_KEY="lsv2_pt_..."
export OPENAI_API_KEY="sk-..."
export ANTHROPIC_API_KEY="sk-ant-..."
```

Tests skip gracefully via `assumeTrue` if keys are missing.

## Code style

- `toString()` should be single-line, following the `ClassName{field=value, field=value}` convention used by the rest of the SDK.
- Avoid `@Suppress("UNCHECKED_CAST")` — restructure code to use safe patterns (`as? String`, `is Map<*, *>` with `entries.associate`, etc). When unavoidable (e.g. generic type erasure after an `is` check), add a comment explaining why the cast is safe.
- Use named arguments for constructor/function calls with 2+ parameters, especially when types could be confused:
  ```kotlin
  // Good
  PromptMessage(
      role = PromptMessage.Role.HUMAN,
      template = template,
      templateFormat = templateFormat,
  )

  // Bad — positional args are ambiguous
  PromptMessage(PromptMessage.Role.HUMAN, template, templateFormat = templateFormat)
  ```
- When an `Optional` has a fallback default, use `orElse(default)` directly instead of `orElse(null) ?: default`:
  ```kotlin
  // Good — default goes straight into orElse
  kwargs["template_format"]?.asString()?.orElse("f-string") ?: "f-string"

  // Bad — creates unnecessary null intermediary
  kwargs["template_format"]?.asString()?.orElse(null) ?: "f-string"
  ```
  The `?: "f-string"` is still needed to handle the case where the key is missing from the map (`null` from `kwargs["template_format"]`), but `orElse` should carry the default for when the key exists but isn't a string.
- Anthropic SDK is a `compileOnly` dependency — users must add it themselves. Methods that use Anthropic types should catch `NoClassDefFoundError` and throw `IllegalStateException` with a clear message.
