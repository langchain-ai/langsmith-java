package com.langchain.smith.tracing;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Verifies that the traceable API is ergonomic from Java.
 */
class TraceableJavaTest {

    private TracingContext tracing = new TracingContext(
            Mockito.mock(com.langchain.smith.client.LangsmithClient.class),
            "default",
            java.util.concurrent.Executors.newCachedThreadPool(),
            /* tracingEnabled= */ true);

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
        Supplier<String> traced = tracing.traceable(() -> "constant", new TraceConfig("zero-arg"));
        assertThat(traced.get()).isEqualTo("constant");
    }

    // ---- 1-arg ----

    @Test
    void oneArgMethodReference() {
        Function<String, String> traced = tracing.traceable(this::greet);
        assertThat(traced.apply("world")).isEqualTo("hello world");
    }

    @Test
    void oneArgWithConfig() {
        Function<String, String> traced = tracing.traceable(this::greet, new TraceConfig("custom-name"));
        assertThat(traced.apply("world")).isEqualTo("hello world");
    }

    @Test
    void oneArgInlineLambda() {
        Function<String, String> traced = tracing.traceable(input -> "hello " + input, new TraceConfig("my-lambda"));
        assertThat(traced.apply("world")).isEqualTo("hello world");
    }

    // ---- 2-arg ----

    @Test
    void twoArgMethodReference() {
        BiFunction<String, String, String> traced = tracing.traceable(this::combine, new TraceConfig("two-arg"));
        assertThat(traced.apply("hello", "world")).isEqualTo("hello world");
    }

    @Test
    void twoArgLambda() {
        BiFunction<String, String, String> traced =
                tracing.traceable((a, b) -> a + " " + b, new TraceConfig("two-arg-lambda"));
        assertThat(traced.apply("hello", "world")).isEqualTo("hello world");
    }

    // ---- 3-arg ----

    @Test
    void threeArgMethodReference() {
        TriFunction<String, String, String, String> traced =
                tracing.traceable(this::combine3, new TraceConfig("three-arg"));
        assertThat(traced.apply("a", "b", "c")).isEqualTo("a b c");
    }

    @Test
    void threeArgLambda() {
        TriFunction<String, String, String, String> traced =
                tracing.traceable((a, b, c) -> a + " " + b + " " + c, new TraceConfig("three-arg-lambda"));
        assertThat(traced.apply("a", "b", "c")).isEqualTo("a b c");
    }

    // ---- getCurrentRun ----

    @Test
    void getCurrentRun_insideTracedFunction() {
        Function<String, RunTree> traced = tracing.traceable(
                (Function<String, RunTree>) input -> tracing.getCurrentRun(), new TraceConfig("get-run-test"));
        RunTree run = traced.apply("hello");
        assertThat(run).isNotNull();
        assertThat(run.getId()).isNotBlank();
        assertThat(run.getTraceId()).isNotBlank();
        assertThat(run.getName()).isEqualTo("get-run-test");
        assertThat(run.getParentRunId()).isNull();
    }

    @Test
    void getCurrentRun_canMutateMetadata() {
        Function<String, String> traced = tracing.traceable(
                (Function<String, String>) input -> {
                    RunTree run = tracing.getCurrentRun();
                    run.getMetadata().put("java_key", "java_value");
                    return "done";
                },
                new TraceConfig("metadata-test"));
        assertThat(traced.apply("hello")).isEqualTo("done");
    }

    @Test
    void getCurrentRun_outsideTracedFunction() {
        assertThat(tracing.getCurrentRun()).isNull();
    }

    // ---- tracingEnabled ----

    @Test
    void tracingDisabled_stillExecutesFunction() {
        TracingContext disabled = new TracingContext(
                Mockito.mock(com.langchain.smith.client.LangsmithClient.class),
                "default",
                java.util.concurrent.Executors.newCachedThreadPool(),
                /* tracingEnabled= */ false);
        Function<String, String> traced =
                disabled.traceable(input -> "hello " + input, new TraceConfig("disabled-test"));
        assertThat(traced.apply("world")).isEqualTo("hello world");
    }

    @Test
    void tracingDisabled_getCurrentRunReturnsNull() {
        TracingContext disabled = new TracingContext(
                Mockito.mock(com.langchain.smith.client.LangsmithClient.class),
                "default",
                java.util.concurrent.Executors.newCachedThreadPool(),
                /* tracingEnabled= */ false);
        Function<String, RunTree> traced = disabled.traceable(
                (Function<String, RunTree>) input -> disabled.getCurrentRun(), new TraceConfig("disabled-run-test"));
        // tracing disabled => no run tree set => getCurrentRun returns null
        assertThat(traced.apply("hello")).isNull();
    }

    // ---- close / AutoCloseable ----

    @Test
    void closeIsAutoCloseable() throws Exception {
        try (TracingContext ctx = new TracingContext(
                Mockito.mock(com.langchain.smith.client.LangsmithClient.class),
                "default",
                java.util.concurrent.Executors.newCachedThreadPool(),
                true)) {
            Supplier<String> traced = ctx.traceable(() -> "ok", new TraceConfig("close-test"));
            assertThat(traced.get()).isEqualTo("ok");
        }
    }
}
