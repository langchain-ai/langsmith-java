// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.public_.datasets

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
import com.langchain.smith.core.prepareAsync
import com.langchain.smith.models.datasets.runs.SessionFeedbackDelta
import com.langchain.smith.models.public_.datasets.runs.RunDeltaParams
import com.langchain.smith.models.public_.datasets.runs.RunGenerateQueryParams
import com.langchain.smith.models.public_.datasets.runs.RunPublicDatasetSchema
import com.langchain.smith.models.public_.datasets.runs.RunQueryParams
import com.langchain.smith.models.public_.datasets.runs.RunQueryResponse
import com.langchain.smith.models.public_.datasets.runs.RunRetrieveParams
import com.langchain.smith.models.public_.datasets.runs.RunStats
import com.langchain.smith.models.public_.datasets.runs.RunStatsParams
import com.langchain.smith.models.runs.ResponseBodyForRunsGenerateQuery
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RunServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RunServiceAsync {

    private val withRawResponse: RunServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RunServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync =
        RunServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: RunRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunPublicDatasetSchema> =
        // get /api/v1/public/{share_token}/datasets/runs/{run_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun delta(
        params: RunDeltaParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionFeedbackDelta> =
        // post /api/v1/public/{share_token}/datasets/runs/delta
        withRawResponse().delta(params, requestOptions).thenApply { it.parse() }

    override fun generateQuery(
        params: RunGenerateQueryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResponseBodyForRunsGenerateQuery> =
        // post /api/v1/public/{share_token}/datasets/runs/generate-query
        withRawResponse().generateQuery(params, requestOptions).thenApply { it.parse() }

    override fun query(
        params: RunQueryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunQueryResponse> =
        // post /api/v1/public/{share_token}/datasets/runs/query
        withRawResponse().query(params, requestOptions).thenApply { it.parse() }

    override fun stats(
        params: RunStatsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunStats> =
        // post /api/v1/public/{share_token}/datasets/runs/stats
        withRawResponse().stats(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RunServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RunServiceAsync.WithRawResponse =
            RunServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<RunPublicDatasetSchema> =
            jsonHandler<RunPublicDatasetSchema>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RunRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunPublicDatasetSchema>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("runId", params.runId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "public",
                        params._pathParam(0),
                        "datasets",
                        "runs",
                        params._pathParam(1),
                    )
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

        private val deltaHandler: Handler<SessionFeedbackDelta> =
            jsonHandler<SessionFeedbackDelta>(clientOptions.jsonMapper)

        override fun delta(
            params: RunDeltaParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionFeedbackDelta>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("shareToken", params.shareToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "public",
                        params._pathParam(0),
                        "datasets",
                        "runs",
                        "delta",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deltaHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val generateQueryHandler: Handler<ResponseBodyForRunsGenerateQuery> =
            jsonHandler<ResponseBodyForRunsGenerateQuery>(clientOptions.jsonMapper)

        override fun generateQuery(
            params: RunGenerateQueryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ResponseBodyForRunsGenerateQuery>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("shareToken", params.shareToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "public",
                        params._pathParam(0),
                        "datasets",
                        "runs",
                        "generate-query",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { generateQueryHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val queryHandler: Handler<RunQueryResponse> =
            jsonHandler<RunQueryResponse>(clientOptions.jsonMapper)

        override fun query(
            params: RunQueryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunQueryResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("shareToken", params.shareToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "public",
                        params._pathParam(0),
                        "datasets",
                        "runs",
                        "query",
                    )
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

        private val statsHandler: Handler<RunStats> =
            jsonHandler<RunStats>(clientOptions.jsonMapper)

        override fun stats(
            params: RunStatsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunStats>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("shareToken", params.shareToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "public",
                        params._pathParam(0),
                        "datasets",
                        "runs",
                        "stats",
                    )
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
    }
}
