package com.langchain.smith.wrappers.openai;

import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;

/**
 * Utility class for wrapping OpenAI clients with LangSmith tracing
 * capabilities.
 *
 * <p>
 * This class provides a simple way to wrap OpenAI clients similar to the Python
 * langsmith-sdk wrapper functionality.
 */
public final class OpenAIWrappers {

  private OpenAIWrappers() {
    // Utility class - prevent instantiation
  }

  /**
   * Wraps an OpenAI client to add LangSmith tracing capabilities.
   *
   * <p>
   * This is a no-op wrapper that maintains the same developer experience as the
   * original client. All configuration options and methods work exactly as they
   * would with the original client.
   *
   * @param client the OpenAI client to wrap
   * @return a wrapped client that delegates to the original client
   * @throws IllegalArgumentException if client is null
   */
  public static WrappedOpenAIClient wrap(OpenAIClient client) {
    if (client == null) {
      throw new IllegalArgumentException("Client cannot be null");
    }
    return new WrappedOpenAIClient(client);
  }

  /**
   * Creates a wrapped OpenAI client from environment variables.
   *
   * <p>
   * This is equivalent to:
   *
   * <pre>{@code
   * wrap(OpenAIOkHttpClient.fromEnv())
   * }</pre>
   *
   * @return a wrapped OpenAI client configured from environment variables
   */
  public static WrappedOpenAIClient wrapFromEnv() {
    return wrap(OpenAIOkHttpClient.fromEnv());
  }
}
