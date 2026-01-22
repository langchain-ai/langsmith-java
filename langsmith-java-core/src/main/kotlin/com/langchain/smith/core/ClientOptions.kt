// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.core

import com.fasterxml.jackson.databind.json.JsonMapper
import com.langchain.smith.core.http.AsyncStreamResponse
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.HttpClient
import com.langchain.smith.core.http.PhantomReachableClosingHttpClient
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.http.RetryingHttpClient
import java.time.Clock
import java.time.Duration
import java.util.Optional
import java.util.concurrent.Executor
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.ThreadFactory
import java.util.concurrent.atomic.AtomicLong
import kotlin.jvm.optionals.getOrNull

/** A class representing the SDK client configuration. */
class ClientOptions
private constructor(
    private val originalHttpClient: HttpClient,
    /**
     * The HTTP client to use in the SDK.
     *
     * Use the one published in `langsmith-java-client-okhttp` or implement your own.
     *
     * This class takes ownership of the client and closes it when closed.
     */
    @get:JvmName("httpClient") val httpClient: HttpClient,
    /**
     * Whether to throw an exception if any of the Jackson versions detected at runtime are
     * incompatible with the SDK's minimum supported Jackson version (2.13.4).
     *
     * Defaults to true. Use extreme caution when disabling this option. There is no guarantee that
     * the SDK will work correctly when using an incompatible Jackson version.
     */
    @get:JvmName("checkJacksonVersionCompatibility") val checkJacksonVersionCompatibility: Boolean,
    /**
     * The Jackson JSON mapper to use for serializing and deserializing JSON.
     *
     * Defaults to [com.langchain.smith.core.jsonMapper]. The default is usually sufficient and
     * rarely needs to be overridden.
     */
    @get:JvmName("jsonMapper") val jsonMapper: JsonMapper,
    /**
     * The executor to use for running [AsyncStreamResponse.Handler] callbacks.
     *
     * Defaults to a dedicated cached thread pool.
     *
     * This class takes ownership of the executor and shuts it down, if possible, when closed.
     */
    @get:JvmName("streamHandlerExecutor") val streamHandlerExecutor: Executor,
    /**
     * The interface to use for delaying execution, like during retries.
     *
     * This is primarily useful for using fake delays in tests.
     *
     * Defaults to real execution delays.
     *
     * This class takes ownership of the sleeper and closes it when closed.
     */
    @get:JvmName("sleeper") val sleeper: Sleeper,
    /**
     * The clock to use for operations that require timing, like retries.
     *
     * This is primarily useful for using a fake clock in tests.
     *
     * Defaults to [Clock.systemUTC].
     */
    @get:JvmName("clock") val clock: Clock,
    private val baseUrl: String?,
    /** Headers to send with the request. */
    @get:JvmName("headers") val headers: Headers,
    /** Query params to send with the request. */
    @get:JvmName("queryParams") val queryParams: QueryParams,
    /**
     * Whether to call `validate` on every response before returning it.
     *
     * Defaults to false, which means the shape of the response will not be validated upfront.
     * Instead, validation will only occur for the parts of the response that are accessed.
     */
    @get:JvmName("responseValidation") val responseValidation: Boolean,
    /**
     * Sets the maximum time allowed for various parts of an HTTP call's lifecycle, excluding
     * retries.
     *
     * Defaults to [Timeout.default].
     */
    @get:JvmName("timeout") val timeout: Timeout,
    /**
     * The maximum number of times to retry failed requests, with a short exponential backoff
     * between requests.
     *
     * Only the following error types are retried:
     * - Connection errors (for example, due to a network connectivity problem)
     * - 408 Request Timeout
     * - 409 Conflict
     * - 429 Rate Limit
     * - 5xx Internal
     *
     * The API may also explicitly instruct the SDK to retry or not retry a request.
     *
     * Defaults to 2.
     */
    @get:JvmName("maxRetries") val maxRetries: Int,
    private val apiKey: String?,
    private val tenantId: String?,
    private val bearerToken: String?,
    private val organizationId: String?,
) {

    init {
        if (checkJacksonVersionCompatibility) {
            checkJacksonVersionCompatibility()
        }
    }

    /**
     * The base URL to use for every request.
     *
     * Defaults to the production environment: `https://api.smith.langchain.com/`.
     */
    fun baseUrl(): String = baseUrl ?: PRODUCTION_URL

    fun apiKey(): Optional<String> = Optional.ofNullable(apiKey)

    fun tenantId(): Optional<String> = Optional.ofNullable(tenantId)

    /**
     * Bearer tokens are used to authenticate from the UI. Must also specify x-tenant-id or
     * x-organization-id (for org scoped apis).
     */
    fun bearerToken(): Optional<String> = Optional.ofNullable(bearerToken)

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    fun toBuilder() = Builder().from(this)

    companion object {

        const val PRODUCTION_URL = "https://api.smith.langchain.com/"

        /**
         * Returns a mutable builder for constructing an instance of [ClientOptions].
         *
         * The following fields are required:
         * ```java
         * .httpClient()
         * ```
         */
        @JvmStatic fun builder() = Builder()

        /**
         * Returns options configured using system properties and environment variables.
         *
         * @see Builder.fromEnv
         */
        @JvmStatic fun fromEnv(): ClientOptions = builder().fromEnv().build()
    }

    /** A builder for [ClientOptions]. */
    class Builder internal constructor() {

        private var httpClient: HttpClient? = null
        private var checkJacksonVersionCompatibility: Boolean = true
        private var jsonMapper: JsonMapper = jsonMapper()
        private var streamHandlerExecutor: Executor? = null
        private var sleeper: Sleeper? = null
        private var clock: Clock = Clock.systemUTC()
        private var baseUrl: String? = null
        private var headers: Headers.Builder = Headers.builder()
        private var queryParams: QueryParams.Builder = QueryParams.builder()
        private var responseValidation: Boolean = false
        private var timeout: Timeout = Timeout.default()
        private var maxRetries: Int = 2
        private var apiKey: String? = null
        private var tenantId: String? = null
        private var bearerToken: String? = null
        private var organizationId: String? = null

        @JvmSynthetic
        internal fun from(clientOptions: ClientOptions) = apply {
            httpClient = clientOptions.originalHttpClient
            checkJacksonVersionCompatibility = clientOptions.checkJacksonVersionCompatibility
            jsonMapper = clientOptions.jsonMapper
            streamHandlerExecutor = clientOptions.streamHandlerExecutor
            sleeper = clientOptions.sleeper
            clock = clientOptions.clock
            baseUrl = clientOptions.baseUrl
            headers = clientOptions.headers.toBuilder()
            queryParams = clientOptions.queryParams.toBuilder()
            responseValidation = clientOptions.responseValidation
            timeout = clientOptions.timeout
            maxRetries = clientOptions.maxRetries
            apiKey = clientOptions.apiKey
            tenantId = clientOptions.tenantId
            bearerToken = clientOptions.bearerToken
            organizationId = clientOptions.organizationId
        }

        /**
         * The HTTP client to use in the SDK.
         *
         * Use the one published in `langsmith-java-client-okhttp` or implement your own.
         *
         * This class takes ownership of the client and closes it when closed.
         */
        fun httpClient(httpClient: HttpClient) = apply {
            this.httpClient = PhantomReachableClosingHttpClient(httpClient)
        }

        /**
         * Whether to throw an exception if any of the Jackson versions detected at runtime are
         * incompatible with the SDK's minimum supported Jackson version (2.13.4).
         *
         * Defaults to true. Use extreme caution when disabling this option. There is no guarantee
         * that the SDK will work correctly when using an incompatible Jackson version.
         */
        fun checkJacksonVersionCompatibility(checkJacksonVersionCompatibility: Boolean) = apply {
            this.checkJacksonVersionCompatibility = checkJacksonVersionCompatibility
        }

        /**
         * The Jackson JSON mapper to use for serializing and deserializing JSON.
         *
         * Defaults to [com.langchain.smith.core.jsonMapper]. The default is usually sufficient and
         * rarely needs to be overridden.
         */
        fun jsonMapper(jsonMapper: JsonMapper) = apply { this.jsonMapper = jsonMapper }

        /**
         * The executor to use for running [AsyncStreamResponse.Handler] callbacks.
         *
         * Defaults to a dedicated cached thread pool.
         *
         * This class takes ownership of the executor and shuts it down, if possible, when closed.
         */
        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor =
                if (streamHandlerExecutor is ExecutorService)
                    PhantomReachableExecutorService(streamHandlerExecutor)
                else streamHandlerExecutor
        }

        /**
         * The interface to use for delaying execution, like during retries.
         *
         * This is primarily useful for using fake delays in tests.
         *
         * Defaults to real execution delays.
         *
         * This class takes ownership of the sleeper and closes it when closed.
         */
        fun sleeper(sleeper: Sleeper) = apply { this.sleeper = PhantomReachableSleeper(sleeper) }

        /**
         * The clock to use for operations that require timing, like retries.
         *
         * This is primarily useful for using a fake clock in tests.
         *
         * Defaults to [Clock.systemUTC].
         */
        fun clock(clock: Clock) = apply { this.clock = clock }

        /**
         * The base URL to use for every request.
         *
         * Defaults to the production environment: `https://api.smith.langchain.com/`.
         */
        fun baseUrl(baseUrl: String?) = apply { this.baseUrl = baseUrl }

        /** Alias for calling [Builder.baseUrl] with `baseUrl.orElse(null)`. */
        fun baseUrl(baseUrl: Optional<String>) = baseUrl(baseUrl.getOrNull())

        /**
         * Whether to call `validate` on every response before returning it.
         *
         * Defaults to false, which means the shape of the response will not be validated upfront.
         * Instead, validation will only occur for the parts of the response that are accessed.
         */
        fun responseValidation(responseValidation: Boolean) = apply {
            this.responseValidation = responseValidation
        }

        /**
         * Sets the maximum time allowed for various parts of an HTTP call's lifecycle, excluding
         * retries.
         *
         * Defaults to [Timeout.default].
         */
        fun timeout(timeout: Timeout) = apply { this.timeout = timeout }

        /**
         * Sets the maximum time allowed for a complete HTTP call, not including retries.
         *
         * See [Timeout.request] for more details.
         *
         * For fine-grained control, pass a [Timeout] object.
         */
        fun timeout(timeout: Duration) = timeout(Timeout.builder().request(timeout).build())

        /**
         * The maximum number of times to retry failed requests, with a short exponential backoff
         * between requests.
         *
         * Only the following error types are retried:
         * - Connection errors (for example, due to a network connectivity problem)
         * - 408 Request Timeout
         * - 409 Conflict
         * - 429 Rate Limit
         * - 5xx Internal
         *
         * The API may also explicitly instruct the SDK to retry or not retry a request.
         *
         * Defaults to 2.
         */
        fun maxRetries(maxRetries: Int) = apply { this.maxRetries = maxRetries }

        fun apiKey(apiKey: String?) = apply { this.apiKey = apiKey }

        /** Alias for calling [Builder.apiKey] with `apiKey.orElse(null)`. */
        fun apiKey(apiKey: Optional<String>) = apiKey(apiKey.getOrNull())

        fun tenantId(tenantId: String?) = apply { this.tenantId = tenantId }

        /** Alias for calling [Builder.tenantId] with `tenantId.orElse(null)`. */
        fun tenantId(tenantId: Optional<String>) = tenantId(tenantId.getOrNull())

        /**
         * Bearer tokens are used to authenticate from the UI. Must also specify x-tenant-id or
         * x-organization-id (for org scoped apis).
         */
        fun bearerToken(bearerToken: String?) = apply { this.bearerToken = bearerToken }

        /** Alias for calling [Builder.bearerToken] with `bearerToken.orElse(null)`. */
        fun bearerToken(bearerToken: Optional<String>) = bearerToken(bearerToken.getOrNull())

        fun organizationId(organizationId: String?) = apply { this.organizationId = organizationId }

        /** Alias for calling [Builder.organizationId] with `organizationId.orElse(null)`. */
        fun organizationId(organizationId: Optional<String>) =
            organizationId(organizationId.getOrNull())

        fun headers(headers: Headers) = apply {
            this.headers.clear()
            putAllHeaders(headers)
        }

        fun headers(headers: Map<String, Iterable<String>>) = apply {
            this.headers.clear()
            putAllHeaders(headers)
        }

        fun putHeader(name: String, value: String) = apply { headers.put(name, value) }

        fun putHeaders(name: String, values: Iterable<String>) = apply { headers.put(name, values) }

        fun putAllHeaders(headers: Headers) = apply { this.headers.putAll(headers) }

        fun putAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            this.headers.putAll(headers)
        }

        fun replaceHeaders(name: String, value: String) = apply { headers.replace(name, value) }

        fun replaceHeaders(name: String, values: Iterable<String>) = apply {
            headers.replace(name, values)
        }

        fun replaceAllHeaders(headers: Headers) = apply { this.headers.replaceAll(headers) }

        fun replaceAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            this.headers.replaceAll(headers)
        }

        fun removeHeaders(name: String) = apply { headers.remove(name) }

        fun removeAllHeaders(names: Set<String>) = apply { headers.removeAll(names) }

        fun queryParams(queryParams: QueryParams) = apply {
            this.queryParams.clear()
            putAllQueryParams(queryParams)
        }

        fun queryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.clear()
            putAllQueryParams(queryParams)
        }

        fun putQueryParam(key: String, value: String) = apply { queryParams.put(key, value) }

        fun putQueryParams(key: String, values: Iterable<String>) = apply {
            queryParams.put(key, values)
        }

        fun putAllQueryParams(queryParams: QueryParams) = apply {
            this.queryParams.putAll(queryParams)
        }

        fun putAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.putAll(queryParams)
        }

        fun replaceQueryParams(key: String, value: String) = apply {
            queryParams.replace(key, value)
        }

        fun replaceQueryParams(key: String, values: Iterable<String>) = apply {
            queryParams.replace(key, values)
        }

        fun replaceAllQueryParams(queryParams: QueryParams) = apply {
            this.queryParams.replaceAll(queryParams)
        }

        fun replaceAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.replaceAll(queryParams)
        }

        fun removeQueryParams(key: String) = apply { queryParams.remove(key) }

        fun removeAllQueryParams(keys: Set<String>) = apply { queryParams.removeAll(keys) }

        fun timeout(): Timeout = timeout

        /**
         * Updates configuration using system properties and environment variables.
         *
         * See this table for the available options:
         *
         * |Setter          |System property                    |Environment variable       |Required|Default value                       |
         * |----------------|-----------------------------------|---------------------------|--------|------------------------------------|
         * |`apiKey`        |`langchain.langsmithApiKey`        |`LANGSMITH_API_KEY`        |false   |-                                   |
         * |`tenantId`      |`langchain.langsmithTenantId`      |`LANGSMITH_TENANT_ID`      |false   |-                                   |
         * |`bearerToken`   |`langchain.langsmithBearerToken`   |`LANGSMITH_BEARER_TOKEN`   |false   |-                                   |
         * |`organizationId`|`langchain.langsmithOrganizationId`|`LANGSMITH_ORGANIZATION_ID`|false   |-                                   |
         * |`baseUrl`       |`langchain.baseUrl`                |`LANGSMITH_ENDPOINT`       |true    |`"https://api.smith.langchain.com/"`|
         *
         * System properties take precedence over environment variables.
         */
        fun fromEnv() = apply {
            (System.getProperty("langchain.baseUrl") ?: System.getenv("LANGSMITH_ENDPOINT"))?.let {
                baseUrl(it)
            }
            (System.getProperty("langchain.langsmithApiKey") ?: System.getenv("LANGSMITH_API_KEY"))
                ?.let { apiKey(it) }
            (System.getProperty("langchain.langsmithTenantId")
                    ?: System.getenv("LANGSMITH_TENANT_ID"))
                ?.let { tenantId(it) }
            (System.getProperty("langchain.langsmithBearerToken")
                    ?: System.getenv("LANGSMITH_BEARER_TOKEN"))
                ?.let { bearerToken(it) }
            (System.getProperty("langchain.langsmithOrganizationId")
                    ?: System.getenv("LANGSMITH_ORGANIZATION_ID"))
                ?.let { organizationId(it) }
        }

        /**
         * Returns an immutable instance of [ClientOptions].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .httpClient()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ClientOptions {
            val httpClient = checkRequired("httpClient", httpClient)
            val streamHandlerExecutor =
                streamHandlerExecutor
                    ?: PhantomReachableExecutorService(
                        Executors.newCachedThreadPool(
                            object : ThreadFactory {

                                private val threadFactory: ThreadFactory =
                                    Executors.defaultThreadFactory()
                                private val count = AtomicLong(0)

                                override fun newThread(runnable: Runnable): Thread =
                                    threadFactory.newThread(runnable).also {
                                        it.name =
                                            "langchain-stream-handler-thread-${count.getAndIncrement()}"
                                    }
                            }
                        )
                    )
            val sleeper = sleeper ?: PhantomReachableSleeper(DefaultSleeper())

            val headers = Headers.builder()
            val queryParams = QueryParams.builder()
            headers.put("X-Stainless-Lang", "java")
            headers.put("X-Stainless-Arch", getOsArch())
            headers.put("X-Stainless-OS", getOsName())
            headers.put("X-Stainless-OS-Version", getOsVersion())
            headers.put("X-Stainless-Package-Version", getPackageVersion())
            headers.put("X-Stainless-Runtime", "JRE")
            headers.put("X-Stainless-Runtime-Version", getJavaVersion())
            headers.put("X-Stainless-Kotlin-Version", KotlinVersion.CURRENT.toString())
            apiKey?.let {
                if (!it.isEmpty()) {
                    headers.put("X-API-Key", it)
                }
            }
            organizationId?.let {
                if (!it.isEmpty()) {
                    headers.put("X-Organization-Id", it)
                }
            }
            bearerToken?.let {
                if (!it.isEmpty()) {
                    headers.put("Authorization", "Bearer $it")
                }
            }
            tenantId?.let {
                if (!it.isEmpty()) {
                    headers.put("X-Tenant-Id", it)
                }
            }
            headers.replaceAll(this.headers.build())
            queryParams.replaceAll(this.queryParams.build())

            return ClientOptions(
                httpClient,
                RetryingHttpClient.builder()
                    .httpClient(httpClient)
                    .sleeper(sleeper)
                    .clock(clock)
                    .maxRetries(maxRetries)
                    .build(),
                checkJacksonVersionCompatibility,
                jsonMapper,
                streamHandlerExecutor,
                sleeper,
                clock,
                baseUrl,
                headers.build(),
                queryParams.build(),
                responseValidation,
                timeout,
                maxRetries,
                apiKey,
                tenantId,
                bearerToken,
                organizationId,
            )
        }
    }

    /**
     * Closes these client options, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client options are
     * long-lived and usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default client automatically
     * releases threads and connections if they remain idle, but if you are writing an application
     * that needs to aggressively release unused resources, then you may call this method.
     */
    fun close() {
        httpClient.close()
        (streamHandlerExecutor as? ExecutorService)?.shutdown()
        sleeper.close()
    }
}
