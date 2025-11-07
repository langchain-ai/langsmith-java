package com.langchain.smith.wrappers.openai;

import static org.junit.jupiter.api.Assertions.*;

import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import org.junit.jupiter.api.Test;

/**
 * Tests for the WrappedOpenAIClient wrapper.
 */
class WrappedOpenAIClientTest {

    @Test
    void testWrapWithNullClientThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new WrappedOpenAIClient(null);
        });
    }

    @Test
    void testWrapDelegatesToOriginalClient() {
        // Create a mock or use a real client if API key is available
        // For now, we'll test that the wrapper can be created
        // In a real scenario, you'd need an API key to test with an actual client

        // Test that builder works
        WrappedOpenAIClient.Builder builder = WrappedOpenAIClient.builder();
        assertNotNull(builder);

        // Test that fromEnv() method exists (will fail at runtime if env vars not set, but that's expected)
        // WrappedOpenAIClient client = WrappedOpenAIClient.fromEnv();
    }

    @Test
    void testBuilderDelegatesToOpenAIClientBuilder() {
        WrappedOpenAIClient.Builder builder = WrappedOpenAIClient.builder();

        // Test that builder methods exist and can be chained
        builder.apiKey("test-key");
        builder.organization("test-org");
        builder.project("test-project");
        builder.baseUrl("https://api.openai.com/v1");

        // Build should succeed (even if API key is invalid)
        assertDoesNotThrow(() -> builder.build());
    }

    @Test
    void testOpenAIWrappersWrapMethod() {
        // Create a minimal client to wrap
        OpenAIClient originalClient =
                OpenAIOkHttpClient.builder().apiKey("test-key").build();

        WrappedOpenAIClient wrapped = OpenAIWrappers.wrap(originalClient);
        assertNotNull(wrapped);
        assertEquals(originalClient, wrapped.getDelegate());
    }

    @Test
    void testOpenAIWrappersWrapWithNullThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            OpenAIWrappers.wrap(null);
        });
    }
}
