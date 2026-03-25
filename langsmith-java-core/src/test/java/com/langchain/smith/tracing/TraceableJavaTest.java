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

    private TracingContext tracing =
            new TracingContext(Mockito.mock(com.langchain.smith.client.LangsmithClient.class));

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
        Function<String, String> traced =
                tracing.traceable(this::greet, new TraceConfig("custom-name"));
        assertThat(traced.apply("world")).isEqualTo("hello world");
    }

    @Test
    void oneArgInlineLambda() {
        Function<String, String> traced =
                tracing.traceable(input -> "hello " + input, new TraceConfig("my-lambda"));
        assertThat(traced.apply("world")).isEqualTo("hello world");
    }

    // ---- 2-arg ----

    @Test
    void twoArgMethodReference() {
        BiFunction<String, String, String> traced =
                tracing.traceable(this::combine, new TraceConfig("two-arg"));
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
}
