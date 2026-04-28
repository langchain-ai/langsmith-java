package com.langchain.smith.testutils

import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
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

    private fun extractRunFromCreateArgs(args: Array<Any?>): Run? {
        // create(params: RunCreateParams) or create(run: Run)
        val first = args.firstOrNull() ?: return null
        return when (first) {
            is com.langchain.smith.models.runs.RunCreateParams -> first.run()
            is Run -> first
            else -> null
        }
    }

    private fun extractRunFromUpdateArgs(args: Array<Any?>): Run? {
        // update(params: RunUpdateParams) or update(runId: String, params: RunUpdateParams)
        val first = args.firstOrNull() ?: return null
        return when (first) {
            is com.langchain.smith.models.runs.RunUpdateParams ->
                first.runId().map { first.run().toBuilder().id(it).build() }.orElse(first.run())
            is String -> {
                val params = args.getOrNull(1) as? com.langchain.smith.models.runs.RunUpdateParams
                params?.run()?.toBuilder()?.id(first)?.build()
            }
            else -> null
        }
    }

    private fun createProxy(): LangsmithClient {
        val runService =
            Proxy.newProxyInstance(
                RunService::class.java.classLoader,
                arrayOf(RunService::class.java),
            ) { _, method, args ->
                when (method.name) {
                    "ingestBatch" -> {
                        if (args != null && args.isNotEmpty()) {
                            val params = args[0]
                            if (params is RunIngestBatchParams) {
                                synchronized(this) {
                                    params.post().ifPresent { postedRuns.addAll(it) }
                                    params.patch().ifPresent { patchedRuns.addAll(it) }
                                }
                            }
                        }
                        if (realClient != null) {
                            method.invoke(realClient.runs(), *args.orEmpty())
                        } else {
                            RunIngestBatchResponse.builder().build()
                        }
                    }
                    "create" -> {
                        // Extract run from params and capture it directly
                        if (args != null && args.isNotEmpty()) {
                            val run = extractRunFromCreateArgs(args)
                            if (run != null) {
                                synchronized(this) { postedRuns.add(run) }
                            }
                        }
                        if (realClient != null) {
                            method.invoke(realClient.runs(), *args.orEmpty())
                        } else {
                            null
                        }
                    }
                    "update" -> {
                        // Extract run from params and capture it directly
                        if (args != null && args.isNotEmpty()) {
                            val run = extractRunFromUpdateArgs(args)
                            if (run != null) {
                                synchronized(this) { patchedRuns.add(run) }
                            }
                        }
                        if (realClient != null) {
                            method.invoke(realClient.runs(), *args.orEmpty())
                        } else {
                            null
                        }
                    }
                    "flush" -> null
                    "withRawResponse",
                    "withOptions" -> throw NotImplementedError()
                    else -> {
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
                }
            } as RunService

        return Proxy.newProxyInstance(
            LangsmithClient::class.java.classLoader,
            arrayOf(LangsmithClient::class.java),
        ) { _, method, _ ->
            when (method.name) {
                "runs" -> runService
                "flush" -> {
                    // no-op
                    null
                }
                "close" -> {
                    realClient?.close()
                    Unit
                }
                else ->
                    throw NotImplementedError(
                        "CapturingLangsmithClient only supports runs(), flush(), and close()"
                    )
            }
        } as LangsmithClient
    }
}
