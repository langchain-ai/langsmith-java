package com.langchain.smith.tracing;

import static org.assertj.core.api.Assertions.assertThat;

import com.langchain.smith.client.LangsmithClient;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/** Verifies that the traceable API is ergonomic from Java using the builder. */
class TraceableJavaTest {

    private final LangsmithClient client = Mockito.mock(LangsmithClient.class);

    private TraceConfig config(String name) {
        return TraceConfig.builder()
                .name(name)
                .client(client)
                .tracingEnabled(true)
                .build();
    }

    private String greet(String input) {
        return "hello " + input;
    }

    private String combine(String a, String b) {
        return a + " " + b;
    }

    private String combine3(String a, String b, String c) {
        return a + " " + b + " " + c;
    }

    // ---- 0-arg ----

    @Test
    void zeroArgSupplier() {
        Supplier<String> traced = Tracing.traceable(() -> "constant", config("zero-arg"));
        assertThat(traced.get()).isEqualTo("constant");
    }

    // ---- 1-arg ----

    @Test
    void oneArgWithConfig() {
        Function<String, String> traced = Tracing.traceable(this::greet, config("custom-name"));
        assertThat(traced.apply("world")).isEqualTo("hello world");
    }

    @Test
    void oneArgInlineLambda() {
        Function<String, String> traced = Tracing.traceable(input -> "hello " + input, config("my-lambda"));
        assertThat(traced.apply("world")).isEqualTo("hello world");
    }

    // ---- 2-arg ----

    @Test
    void twoArgMethodReference() {
        BiFunction<String, String, String> traced = Tracing.traceable(this::combine, config("two-arg"));
        assertThat(traced.apply("hello", "world")).isEqualTo("hello world");
    }

    @Test
    void twoArgLambda() {
        BiFunction<String, String, String> traced = Tracing.traceable((a, b) -> a + " " + b, config("two-arg-lambda"));
        assertThat(traced.apply("hello", "world")).isEqualTo("hello world");
    }

    // ---- 3-arg ----

    @Test
    void threeArgMethodReference() {
        TriFunction<String, String, String, String> traced = Tracing.traceable(this::combine3, config("three-arg"));
        assertThat(traced.apply("a", "b", "c")).isEqualTo("a b c");
    }

    @Test
    void threeArgLambda() {
        TriFunction<String, String, String, String> traced =
                Tracing.traceable((a, b, c) -> a + " " + b + " " + c, config("three-arg-lambda"));
        assertThat(traced.apply("a", "b", "c")).isEqualTo("a b c");
    }

    // ---- getCurrentRun ----

    @Test
    void getCurrentRun_insideTracedFunction() {
        Function<String, RunTree> traced = Tracing.traceable(
                (Function<String, RunTree>) input -> Tracing.getCurrentRunTree(), config("get-run-test"));
        RunTree run = traced.apply("hello");
        assertThat(run).isNotNull();
        assertThat(run.getId()).isNotBlank();
        assertThat(run.getTraceId()).isNotBlank();
        assertThat(run.getName()).isEqualTo("get-run-test");
        assertThat(run.getParentRunId()).isNull();
    }

    @Test
    void getCurrentRun_canMutateMetadata() {
        Function<String, String> traced = Tracing.traceable(
                (Function<String, String>) input -> {
                    RunTree run = Tracing.getCurrentRunTree();
                    run.getMetadata().put("java_key", "java_value");
                    return "done";
                },
                config("metadata-test"));
        assertThat(traced.apply("hello")).isEqualTo("done");
    }

    @Test
    void getCurrentRun_outsideTracedFunction() {
        assertThat(Tracing.getCurrentRunTree()).isNull();
    }

    // ---- tracingEnabled ----

    @Test
    void tracingDisabled_stillExecutesFunction() {
        TraceConfig disabled = TraceConfig.builder()
                .name("disabled-test")
                .client(client)
                .tracingEnabled(false)
                .build();
        Function<String, String> traced = Tracing.traceable(input -> "hello " + input, disabled);
        assertThat(traced.apply("world")).isEqualTo("hello world");
    }

    @Test
    void tracingDisabled_getCurrentRunReturnsNull() {
        TraceConfig disabled = TraceConfig.builder()
                .name("disabled-run-test")
                .client(client)
                .tracingEnabled(false)
                .build();
        Function<String, RunTree> traced =
                Tracing.traceable((Function<String, RunTree>) input -> Tracing.getCurrentRunTree(), disabled);
        assertThat(traced.apply("hello")).isNull();
    }
}
