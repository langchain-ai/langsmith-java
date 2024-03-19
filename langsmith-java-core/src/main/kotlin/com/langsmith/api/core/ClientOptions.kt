// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.core

import com.fasterxml.jackson.databind.json.JsonMapper
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.langsmith.api.core.http.HttpClient
import com.langsmith.api.core.http.RetryingHttpClient
import java.time.Clock

class ClientOptions
private constructor(
    @get:JvmName("httpClient") val httpClient: HttpClient,
    @get:JvmName("jsonMapper") val jsonMapper: JsonMapper,
    @get:JvmName("clock") val clock: Clock,
    @get:JvmName("baseUrl") val baseUrl: String,
    @get:JvmName("apiKey") val apiKey: String,
    @get:JvmName("headers") val headers: ListMultimap<String, String>,
    @get:JvmName("responseValidation") val responseValidation: Boolean,
) {

    companion object {
        const val PRODUCTION_URL = "https://api.smith.langchain.com"

        @JvmStatic fun builder() = Builder()

        @JvmStatic fun fromEnv(): ClientOptions = builder().fromEnv().build()
    }

    class Builder {

        private var httpClient: HttpClient? = null
        private var jsonMapper: JsonMapper? = null
        private var clock: Clock = Clock.systemUTC()
        private var baseUrl: String = PRODUCTION_URL
        private var headers: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var responseValidation: Boolean = false
        private var maxRetries: Int = 2
        private var apiKey: String? = null

        fun httpClient(httpClient: HttpClient) = apply { this.httpClient = httpClient }

        fun jsonMapper(jsonMapper: JsonMapper) = apply { this.jsonMapper = jsonMapper }

        fun baseUrl(baseUrl: String) = apply { this.baseUrl = baseUrl }

        fun clock(clock: Clock) = apply { this.clock = clock }

        fun headers(headers: Map<String, Iterable<String>>) = apply {
            this.headers.clear()
            putAllHeaders(headers)
        }

        fun putHeader(name: String, value: String) = apply {
            this.headers.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.headers.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            headers.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.headers.put(name, mutableListOf()) }

        fun responseValidation(responseValidation: Boolean) = apply {
            this.responseValidation = responseValidation
        }

        fun maxRetries(maxRetries: Int) = apply { this.maxRetries = maxRetries }

        fun apiKey(apiKey: String) = apply { this.apiKey = apiKey }

        fun fromEnv() = apply { System.getenv("LANGCHAIN_API_KEY")?.let { apiKey(it) } }

        fun build(): ClientOptions {
            checkNotNull(httpClient) { "`httpClient` is required but was not set" }
            checkNotNull(apiKey) { "`apiKey` is required but was not set" }

            val headers = ArrayListMultimap.create<String, String>()
            headers.put("X-Stainless-Lang", "java")
            headers.put("X-Stainless-Arch", getOsArch())
            headers.put("X-Stainless-OS", getOsName())
            headers.put("X-Stainless-OS-Version", getOsVersion())
            headers.put("X-Stainless-Package-Version", getPackageVersion())
            headers.put("X-Stainless-Runtime-Version", getJavaVersion())
            headers.put("X-API-Key", apiKey)
            this.headers.forEach(headers::replaceValues)

            return ClientOptions(
                RetryingHttpClient.builder()
                    .httpClient(httpClient!!)
                    .clock(clock)
                    .maxRetries(maxRetries)
                    .build(),
                jsonMapper ?: jsonMapper(),
                clock,
                baseUrl,
                apiKey!!,
                headers.toUnmodifiable(),
                responseValidation,
            )
        }
    }
}
