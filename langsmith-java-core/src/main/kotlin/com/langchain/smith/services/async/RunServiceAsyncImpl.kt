// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.client.AutoBatchIngestLimits
import com.langchain.smith.client.AutoBatchQueue
import com.langchain.smith.client.toAutoBatchIngestLimits
import com.langchain.smith.client.toRunMultipartFormData
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.handlers.errorBodyHandler
import com.langchain.smith.core.handlers.errorHandler
import com.langchain.smith.core.handlers.jsonHandler
import com.langchain.smith.core.http.HttpMethod
import com.langchain.smith.core.http.HttpRequest
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponse.Handler
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.core.http.json
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.http.zstd
import com.langchain.smith.core.prepareAsync
import com.langchain.smith.errors.NotFoundException
import com.langchain.smith.models.annotationqueues.info.InfoListParams
import com.langchain.smith.models.annotationqueues.info.InfoListResponse
import com.langchain.smith.models.runs.RunCreateParams
import com.langchain.smith.models.runs.RunCreateResponse
import com.langchain.smith.models.runs.RunIngestBatchParams
import com.langchain.smith.models.runs.RunIngestBatchResponse
import com.langchain.smith.models.runs.RunQueryParams
import com.langchain.smith.models.runs.RunQueryResponse
import com.langchain.smith.models.runs.RunRetrieveParams
import com.langchain.smith.models.runs.RunSchema
import com.langchain.smith.models.runs.RunStatsParams
import com.langchain.smith.models.runs.RunStatsResponse
import com.langchain.smith.models.runs.RunUpdate2Params
import com.langchain.smith.models.runs.RunUpdate2Response
import com.langchain.smith.models.runs.RunUpdateParams
import com.langchain.smith.models.runs.RunUpdateResponse
import com.langchain.smith.services.async.annotationqueues.InfoServiceAsyncImpl
import com.langchain.smith.services.async.runs.RuleServiceAsync
import com.langchain.smith.services.async.runs.RuleServiceAsyncImpl
import com.langchain.smith.services.isZstdCompressionEnabled
import com.langchain.smith.services.shouldDefaultRunCompressionEnabled
import java.util.concurrent.CompletableFuture
import java.util.concurrent.CompletionException
import java.util.concurrent.atomic.AtomicBoolean
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull
import org.slf4j.LoggerFactory

class RunServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RunServiceAsync {

    private val withRawResponse: WithRawResponseImpl by lazy { WithRawResponseImpl(clientOptions) }

    private val rules: RuleServiceAsync by lazy { RuleServiceAsyncImpl(clientOptions) }
    private val multipartDisabled = AtomicBoolean(false)

    private val batchQueue: AutoBatchQueue by lazy {
        val limits = fetchAutoBatchIngestLimits()
        AutoBatchQueue(
            sendBatch = { params, requestOptions -> sendAutoBatch(params, requestOptions, limits) },
            batchSizeLimit = limits.batchSizeLimit,
            batchSizeLimitBytes = limits.batchSizeLimitBytes,
        )
    }

    override fun withRawResponse(): RunServiceAsync.WithRawResponse = withRawResponse

    private fun sendAutoBatch(
        params: RunIngestBatchParams,
        requestOptions: RequestOptions,
        limits: AutoBatchIngestLimits,
    ): CompletableFuture<Void?> {
        if (!limits.useMultipartEndpoint || multipartDisabled.get()) {
            return sendJsonBatch(params, requestOptions)
        }

        val multipartFuture =
            try {
                withRawResponse.ingestMultipartBatch(params, requestOptions)
            } catch (e: Exception) {
                return failedFuture(e)
            }

        return multipartFuture
            .handle { sentMultipart, throwable ->
                if (throwable == null) {
                    if (sentMultipart) {
                        CompletableFuture.completedFuture<Void?>(null)
                    } else {
                        sendJsonBatch(params, requestOptions)
                    }
                } else {
                    val cause = (throwable as? CompletionException)?.cause ?: throwable
                    if (cause is NotFoundException) {
                        multipartDisabled.set(true)
                        sendJsonBatch(params, requestOptions)
                    } else {
                        failedFuture(cause)
                    }
                }
            }
            .thenCompose { it }
    }

    private fun sendJsonBatch(
        params: RunIngestBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        withRawResponse().ingestBatch(params, requestOptions).thenApply {
            it.parse()
            null
        }

    private fun fetchAutoBatchIngestLimits() =
        try {
            InfoServiceAsyncImpl(clientOptions)
                .list()
                .get()
                .batchIngestConfig()
                .getOrNull()
                .toAutoBatchIngestLimits()
        } catch (e: Exception) {
            logger.warn(
                "Failed to fetch LangSmith batch ingest config; using default batch limits",
                e,
            )
            AutoBatchIngestLimits()
        }

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync =
        RunServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun rules(): RuleServiceAsync = rules

    override fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> {
        if (clientOptions.autoBatchTracing) {
            batchQueue.post(params.run(), params._headers(), params._queryParams(), requestOptions)
            return CompletableFuture.completedFuture(null)
        }

        return withRawResponse().create(params, requestOptions).thenApply {
            it.parse()
            null
        }
    }

    override fun retrieve(
        params: RunRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunSchema> =
        // get /api/v1/runs/{run_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: RunUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> {
        if (shouldUpdateSynchronously(params)) {
            return updateSynchronously(params, requestOptions)
        }

        val runId = checkRequired("runId", params.runId().getOrNull())

        batchQueue.patch(
            params.run().toBuilder().id(runId).build(),
            params._headers(),
            params._queryParams(),
            requestOptions,
        )
        return CompletableFuture.completedFuture(null)
    }

    override fun ingestBatch(
        params: RunIngestBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunIngestBatchResponse> =
        // post /runs/batch
        withRawResponse().ingestBatch(params, requestOptions).thenApply { it.parse() }

    override fun query(
        params: RunQueryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunQueryResponse> =
        // post /api/v1/runs/query
        withRawResponse().query(params, requestOptions).thenApply { it.parse() }

    override fun stats(
        params: RunStatsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunStatsResponse> =
        // post /api/v1/runs/stats
        withRawResponse().stats(params, requestOptions).thenApply { it.parse() }

    override fun update2(
        params: RunUpdate2Params,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunUpdate2Response> =
        // patch /api/v1/runs/{run_id}
        withRawResponse().update2(params, requestOptions).thenApply { it.parse() }

    override fun flush(): CompletableFuture<Void?> =
        CompletableFuture.runAsync { batchQueue.flush() }.thenApply { null }

    private fun shouldUpdateSynchronously(params: RunUpdateParams): Boolean =
        !clientOptions.autoBatchTracing || !params.runId().isPresent

    private fun updateSynchronously(
        params: RunUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        withRawResponse().update(params, requestOptions).thenApply {
            it.parse()
            null
        }

    internal fun shutdown() {
        batchQueue.shutdown()
    }

    private companion object {
        private val logger = LoggerFactory.getLogger(RunServiceAsyncImpl::class.java)

        private fun <T> failedFuture(throwable: Throwable): CompletableFuture<T> =
            CompletableFuture<T>().also { it.completeExceptionally(throwable) }
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RunServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val infoHandler: Handler<InfoListResponse> =
            jsonHandler<InfoListResponse>(clientOptions.jsonMapper)

        private val zstdCompressionEnabled: CompletableFuture<Boolean> by lazy {
            fetchZstdCompressionEnabled()
        }

        private fun fetchZstdCompressionEnabled(): CompletableFuture<Boolean> {
            try {
                if (!shouldDefaultRunCompressionEnabled()) {
                    return CompletableFuture.completedFuture(false)
                }
                val params = InfoListParams.none()
                val request =
                    HttpRequest.builder()
                        .method(HttpMethod.GET)
                        .baseUrl(clientOptions.baseUrl())
                        .addPathSegment("info")
                        .putHeader("Accept", "application/json")
                        .build()
                        .prepareAsync(clientOptions, params)
                val requestOptions =
                    RequestOptions.none().applyDefaults(RequestOptions.from(clientOptions))
                return request
                    .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                    .thenApply { response ->
                        response.use {
                            isZstdCompressionEnabled(
                                errorHandler.handle(it).let { checked ->
                                    infoHandler.handle(checked)
                                }
                            )
                        }
                    }
                    .exceptionally { shouldDefaultRunCompressionEnabled() }
            } catch (_: Exception) {
                return CompletableFuture.completedFuture(shouldDefaultRunCompressionEnabled())
            }
        }

        private val rules: RuleServiceAsync.WithRawResponse by lazy {
            RuleServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RunServiceAsync.WithRawResponse =
            RunServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun rules(): RuleServiceAsync.WithRawResponse = rules

        private val createHandler: Handler<RunCreateResponse> =
            jsonHandler<RunCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: RunCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("runs")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<RunSchema> =
            jsonHandler<RunSchema>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RunRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunSchema>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("runId", params.runId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<RunUpdateResponse> =
            jsonHandler<RunUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: RunUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("runId", params.runId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("runs", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val ingestBatchHandler: Handler<RunIngestBatchResponse> =
            jsonHandler<RunIngestBatchResponse>(clientOptions.jsonMapper)

        override fun ingestBatch(
            params: RunIngestBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunIngestBatchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("runs", "batch")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { ingestBatchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        internal fun ingestMultipartBatch(
            params: RunIngestBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<Boolean> {
            val body = params.toRunMultipartFormData(clientOptions.jsonMapper)
            if (body == null) {
                // Some queued runs do not have the fields required by multipart ingest; fall
                // back to legacy JSON batch ingest for this batch only.
                return CompletableFuture.completedFuture(false)
            }
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return zstdCompressionEnabled
                .thenCompose { zstdCompressionEnabled ->
                    val requestBuilder =
                        HttpRequest.builder()
                            .method(HttpMethod.POST)
                            .baseUrl(clientOptions.baseUrl())
                            .addPathSegments("runs", "multipart")
                    if (zstdCompressionEnabled) {
                        requestBuilder.putHeader("Content-Encoding", "zstd").body(zstd(body))
                    } else {
                        requestBuilder.body(body)
                    }
                    requestBuilder.build().prepareAsync(clientOptions, params)
                }
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).use {}
                    true
                }
        }

        private val queryHandler: Handler<RunQueryResponse> =
            jsonHandler<RunQueryResponse>(clientOptions.jsonMapper)

        override fun query(
            params: RunQueryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunQueryResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", "query")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { queryHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val statsHandler: Handler<RunStatsResponse> =
            jsonHandler<RunStatsResponse>(clientOptions.jsonMapper)

        override fun stats(
            params: RunStatsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunStatsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", "stats")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { statsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val update2Handler: Handler<RunUpdate2Response> =
            jsonHandler<RunUpdate2Response>(clientOptions.jsonMapper)

        override fun update2(
            params: RunUpdate2Params,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunUpdate2Response>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("runId", params.runId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { update2Handler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
