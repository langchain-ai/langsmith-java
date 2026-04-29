// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

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
import com.langchain.smith.core.prepare
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
import com.langchain.smith.services.blocking.annotationqueues.InfoServiceImpl
import com.langchain.smith.services.blocking.runs.RuleService
import com.langchain.smith.services.blocking.runs.RuleServiceImpl
import com.langchain.smith.services.isZstdCompressionEnabled
import com.langchain.smith.services.shouldDefaultRunCompressionEnabled
import java.util.concurrent.CompletableFuture
import java.util.concurrent.atomic.AtomicBoolean
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull
import org.slf4j.LoggerFactory

class RunServiceImpl internal constructor(private val clientOptions: ClientOptions) : RunService {

    private val withRawResponse: WithRawResponseImpl by lazy { WithRawResponseImpl(clientOptions) }

    private val rules: RuleService by lazy { RuleServiceImpl(clientOptions) }
    private val multipartDisabled = AtomicBoolean(false)

    private val batchQueue: AutoBatchQueue by lazy {
        val limits = fetchAutoBatchIngestLimits()
        AutoBatchQueue(
            sendBatch = { params, requestOptions -> sendAutoBatch(params, requestOptions, limits) },
            batchSizeLimit = limits.batchSizeLimit,
            batchSizeLimitBytes = limits.batchSizeLimitBytes,
        )
    }

    override fun withRawResponse(): RunService.WithRawResponse = withRawResponse

    private fun sendAutoBatch(
        params: RunIngestBatchParams,
        requestOptions: RequestOptions,
        limits: AutoBatchIngestLimits,
    ): CompletableFuture<Void?> =
        try {
            if (limits.useMultipartEndpoint && !multipartDisabled.get()) {
                val sentMultipart =
                    try {
                        // If the multipart endpoint is unavailable on this server, fall back to
                        // legacy JSON batch ingest and keep using it for future auto-batches.
                        withRawResponse.ingestMultipartBatch(params, requestOptions)
                    } catch (e: NotFoundException) {
                        multipartDisabled.set(true)
                        withRawResponse().ingestBatch(params, requestOptions).parse()
                        true
                    }
                if (!sentMultipart) {
                    withRawResponse().ingestBatch(params, requestOptions).parse()
                }
            } else {
                withRawResponse().ingestBatch(params, requestOptions).parse()
            }
            CompletableFuture.completedFuture(null)
        } catch (e: Exception) {
            CompletableFuture<Void?>().also { it.completeExceptionally(e) }
        }

    private fun fetchAutoBatchIngestLimits() =
        try {
            InfoServiceImpl(clientOptions)
                .list()
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

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService =
        RunServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun rules(): RuleService = rules

    override fun create(params: RunCreateParams, requestOptions: RequestOptions) {
        if (clientOptions.autoBatchTracing) {
            batchQueue.post(params.run(), params._headers(), params._queryParams(), requestOptions)
        } else {
            withRawResponse().create(params, requestOptions).parse()
        }
    }

    override fun retrieve(params: RunRetrieveParams, requestOptions: RequestOptions): RunSchema =
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: RunUpdateParams, requestOptions: RequestOptions) {
        if (shouldUpdateSynchronously(params)) {
            updateSynchronously(params, requestOptions)
            return
        }

        val runId = checkRequired("runId", params.runId().getOrNull())

        batchQueue.patch(
            params.run().toBuilder().id(runId).build(),
            params._headers(),
            params._queryParams(),
            requestOptions,
        )
    }

    override fun flush() {
        batchQueue.flush()
    }

    private fun shouldUpdateSynchronously(params: RunUpdateParams): Boolean =
        !clientOptions.autoBatchTracing || !params.runId().isPresent

    private fun updateSynchronously(params: RunUpdateParams, requestOptions: RequestOptions) {
        withRawResponse().update(params, requestOptions).parse()
    }

    internal fun shutdown() {
        batchQueue.shutdown()
    }

    private companion object {
        private val logger = LoggerFactory.getLogger(RunServiceImpl::class.java)
    }

    override fun ingestBatch(
        params: RunIngestBatchParams,
        requestOptions: RequestOptions,
    ): RunIngestBatchResponse =
        // post /runs/batch
        withRawResponse().ingestBatch(params, requestOptions).parse()

    override fun query(params: RunQueryParams, requestOptions: RequestOptions): RunQueryResponse =
        // post /api/v1/runs/query
        withRawResponse().query(params, requestOptions).parse()

    override fun stats(params: RunStatsParams, requestOptions: RequestOptions): RunStatsResponse =
        // post /api/v1/runs/stats
        withRawResponse().stats(params, requestOptions).parse()

    override fun update2(
        params: RunUpdate2Params,
        requestOptions: RequestOptions,
    ): RunUpdate2Response =
        // patch /api/v1/runs/{run_id}
        withRawResponse().update2(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RunService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val infoHandler: Handler<InfoListResponse> =
            jsonHandler<InfoListResponse>(clientOptions.jsonMapper)

        private val zstdCompressionEnabled: Boolean by lazy { fetchZstdCompressionEnabled() }

        private fun fetchZstdCompressionEnabled(): Boolean {
            try {
                if (!shouldDefaultRunCompressionEnabled()) {
                    return false
                }
                val params = InfoListParams.none()
                val request =
                    HttpRequest.builder()
                        .method(HttpMethod.GET)
                        .baseUrl(clientOptions.baseUrl())
                        .addPathSegment("info")
                        .putHeader("Accept", "application/json")
                        .build()
                        .prepare(clientOptions, params)
                val requestOptions =
                    RequestOptions.none().applyDefaults(RequestOptions.from(clientOptions))
                return clientOptions.httpClient.execute(request, requestOptions).use { response ->
                    isZstdCompressionEnabled(
                        errorHandler.handle(response).let { infoHandler.handle(it) }
                    )
                }
            } catch (_: Exception) {
                return shouldDefaultRunCompressionEnabled()
            }
        }

        private val rules: RuleService.WithRawResponse by lazy {
            RuleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RunService.WithRawResponse =
            RunServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun rules(): RuleService.WithRawResponse = rules

        private val createHandler: Handler<RunCreateResponse> =
            jsonHandler<RunCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: RunCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("runs")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<RunSchema> =
            jsonHandler<RunSchema>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RunRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunSchema> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("runId", params.runId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<RunUpdateResponse> =
            jsonHandler<RunUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: RunUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunUpdateResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val ingestBatchHandler: Handler<RunIngestBatchResponse> =
            jsonHandler<RunIngestBatchResponse>(clientOptions.jsonMapper)

        override fun ingestBatch(
            params: RunIngestBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunIngestBatchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("runs", "batch")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { ingestBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        internal fun ingestMultipartBatch(
            params: RunIngestBatchParams,
            requestOptions: RequestOptions,
        ): Boolean {
            val body = params.toRunMultipartFormData(clientOptions.jsonMapper)
            if (body == null) {
                // Some queued runs do not have the fields required by multipart ingest; fall
                // back to legacy JSON batch ingest for this batch only.
                return false
            }
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
            val request = requestBuilder.build().prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            errorHandler.handle(response).use {}
            return true
        }

        private val queryHandler: Handler<RunQueryResponse> =
            jsonHandler<RunQueryResponse>(clientOptions.jsonMapper)

        override fun query(
            params: RunQueryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunQueryResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", "query")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { queryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val statsHandler: Handler<RunStatsResponse> =
            jsonHandler<RunStatsResponse>(clientOptions.jsonMapper)

        override fun stats(
            params: RunStatsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunStatsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", "stats")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { statsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val update2Handler: Handler<RunUpdate2Response> =
            jsonHandler<RunUpdate2Response>(clientOptions.jsonMapper)

        override fun update2(
            params: RunUpdate2Params,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunUpdate2Response> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
