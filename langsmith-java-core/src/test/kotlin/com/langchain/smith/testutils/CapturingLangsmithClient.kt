package com.langchain.smith.testutils

import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.models.runs.Run
import com.langchain.smith.models.runs.RunIngestBatchParams
import com.langchain.smith.models.runs.RunIngestBatchResponse
import com.langchain.smith.services.blocking.RunService
import java.lang.reflect.Proxy

/**
 * A test [LangsmithClient] that captures [Run] data from `ingestBatch` calls for assertion.
 *
 * If `LANGSMITH_API_KEY` is set, runs are also forwarded to the real LangSmith server.
 */
internal class CapturingLangsmithClient {

    val postedRuns = mutableListOf<Run>()
    val patchedRuns = mutableListOf<Run>()

    private val realClient: LangsmithClient? =
        if (!System.getenv("LANGSMITH_API_KEY").isNullOrBlank()) {
            LangsmithOkHttpClient.fromEnv()
        } else {
            null
        }

    fun awaitAndGetPostedRuns(delayMs: Long = 500): List<Run> {
        Thread.sleep(delayMs)
        return postedRuns.toList()
    }

    fun awaitAndGetPatchedRuns(delayMs: Long = 500): List<Run> {
        Thread.sleep(delayMs)
        return patchedRuns.toList()
    }

    val client: LangsmithClient = createProxy()

    private fun createProxy(): LangsmithClient {
        val runService =
            Proxy.newProxyInstance(
                RunService::class.java.classLoader,
                arrayOf(RunService::class.java),
            ) { _, method, args ->
                if (method.name == "ingestBatch" && args != null && args.isNotEmpty()) {
                    val params = args[0]
                    if (params is RunIngestBatchParams) {
                        synchronized(this) {
                            params.post().ifPresent { postedRuns.addAll(it) }
                            params.patch().ifPresent { patchedRuns.addAll(it) }
                        }
                    }
                    // Forward to real LangSmith if available
                    if (realClient != null) {
                        method.invoke(realClient.runs(), *args)
                    } else {
                        RunIngestBatchResponse.builder().build()
                    }
                } else if (method.name == "flush") {
                    // no-op for test proxy
                    null
                } else if (method.name == "withRawResponse" || method.name == "withOptions") {
                    throw NotImplementedError()
                } else {
                    // Forward unknown methods to real client if available
                    if (realClient != null && args != null) {
                        method.invoke(realClient.runs(), *args)
                    } else if (realClient != null) {
                        method.invoke(realClient.runs())
                    } else {
                        throw NotImplementedError(
                            "CapturingLangsmithClient: ${method.name} not supported without LANGSMITH_API_KEY"
                        )
                    }
                }
            } as RunService

        return Proxy.newProxyInstance(
            LangsmithClient::class.java.classLoader,
            arrayOf(LangsmithClient::class.java),
        ) { _, method, _ ->
            when (method.name) {
                "runs" -> runService
<<<<<<< HEAD
=======
                "flush" -> {
                    // no-op
                    null
                }
>>>>>>> d3050890 (Adds background batching)
                "close" -> {
                    realClient?.close()
                    Unit
                }
                else ->
                    throw NotImplementedError(
<<<<<<< HEAD
                        "CapturingLangsmithClient only supports runs() and close()"
=======
                        "CapturingLangsmithClient only supports runs(), flush(), and close()"
>>>>>>> d3050890 (Adds background batching)
                    )
            }
        } as LangsmithClient
    }
}
