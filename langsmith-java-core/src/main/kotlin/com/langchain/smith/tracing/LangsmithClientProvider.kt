package com.langchain.smith.tracing

import com.langchain.smith.client.LangsmithClient

/**
 * Service-provider interface for automatic [LangsmithClient] discovery.
 *
 * When [traceable] (or [traceFunction], etc.) is called without an explicit client in
 * [TraceConfig], the runtime uses [java.util.ServiceLoader] to find an implementation of this
 * interface on the classpath and calls [createClient] to obtain a default client.
 *
 * The `langsmith-java-client-okhttp` module registers a provider automatically. Custom HTTP
 * backends can supply their own implementation by adding a
 * `META-INF/services/com.langchain.smith.tracing.LangsmithClientProvider` file that lists the
 * fully-qualified class name of their provider.
 */
fun interface LangsmithClientProvider {

    /**
     * Creates a [LangsmithClient] configured from environment variables and system properties.
     *
     * Implementations should throw if the environment is not configured (e.g. missing API key) —
     * the caller will catch and treat it as "no client available".
     */
    fun createClient(): LangsmithClient
}
