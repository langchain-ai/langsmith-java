// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

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
import com.langchain.smith.core.http.multipartFormData
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.prepareAsync
import com.langchain.smith.models.runs.ResponseBodyForRunsGenerateQuery
import com.langchain.smith.models.runs.RunCreateParams
import com.langchain.smith.models.runs.RunCreateResponse
import com.langchain.smith.models.runs.RunDeleteParams
import com.langchain.smith.models.runs.RunDeleteResponse
import com.langchain.smith.models.runs.RunGenerateQueryParams
import com.langchain.smith.models.runs.RunIngestBatchParams
import com.langchain.smith.models.runs.RunIngestBatchResponse
import com.langchain.smith.models.runs.RunIngestMultipartParams
import com.langchain.smith.models.runs.RunIngestMultipartResponse
import com.langchain.smith.models.runs.RunQueryParams
import com.langchain.smith.models.runs.RunQueryResponse
import com.langchain.smith.models.runs.RunRetrieveParams
import com.langchain.smith.models.runs.RunRetrieveThreadPreviewParams
import com.langchain.smith.models.runs.RunRetrieveThreadPreviewResponse
import com.langchain.smith.models.runs.RunSchema
import com.langchain.smith.models.runs.RunUpdate2Params
import com.langchain.smith.models.runs.RunUpdate2Response
import com.langchain.smith.models.runs.RunUpdateParams
import com.langchain.smith.models.runs.RunUpdateResponse
import com.langchain.smith.services.async.runs.GroupServiceAsync
import com.langchain.smith.services.async.runs.GroupServiceAsyncImpl
import com.langchain.smith.services.async.runs.RuleServiceAsync
import com.langchain.smith.services.async.runs.RuleServiceAsyncImpl
import com.langchain.smith.services.async.runs.ShareServiceAsync
import com.langchain.smith.services.async.runs.ShareServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RunServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RunServiceAsync {

    private val withRawResponse: RunServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val rules: RuleServiceAsync by lazy { RuleServiceAsyncImpl(clientOptions) }

    private val share: ShareServiceAsync by lazy { ShareServiceAsyncImpl(clientOptions) }

    private val group: GroupServiceAsync by lazy { GroupServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): RunServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync =
        RunServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun rules(): RuleServiceAsync = rules

    override fun share(): ShareServiceAsync = share

    override fun group(): GroupServiceAsync = group

    override fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunCreateResponse> =
        // post /runs
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: RunRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunSchema> =
        // get /api/v1/runs/{run_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: RunUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunUpdateResponse> =
        // patch /runs/{run_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: RunDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunDeleteResponse> =
        // post /api/v1/runs/delete
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun generateQuery(
        params: RunGenerateQueryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResponseBodyForRunsGenerateQuery> =
        // post /api/v1/runs/generate-query
        withRawResponse().generateQuery(params, requestOptions).thenApply { it.parse() }

    override fun ingestBatch(
        params: RunIngestBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunIngestBatchResponse> =
        // post /runs/batch
        withRawResponse().ingestBatch(params, requestOptions).thenApply { it.parse() }

    override fun ingestMultipart(
        params: RunIngestMultipartParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunIngestMultipartResponse> =
        // post /runs/multipart
        withRawResponse().ingestMultipart(params, requestOptions).thenApply { it.parse() }

    override fun query(
        params: RunQueryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunQueryResponse> =
        // post /api/v1/runs/query
        withRawResponse().query(params, requestOptions).thenApply { it.parse() }

    override fun retrieveThreadPreview(
        params: RunRetrieveThreadPreviewParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunRetrieveThreadPreviewResponse> =
        // get /api/v1/runs/threads/{thread_id}
        withRawResponse().retrieveThreadPreview(params, requestOptions).thenApply { it.parse() }

    override fun update2(
        params: RunUpdate2Params,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunUpdate2Response> =
        // patch /api/v1/runs/{run_id}
        withRawResponse().update2(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RunServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val rules: RuleServiceAsync.WithRawResponse by lazy {
            RuleServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val share: ShareServiceAsync.WithRawResponse by lazy {
            ShareServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val group: GroupServiceAsync.WithRawResponse by lazy {
            GroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RunServiceAsync.WithRawResponse =
            RunServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun rules(): RuleServiceAsync.WithRawResponse = rules

        override fun share(): ShareServiceAsync.WithRawResponse = share

        override fun group(): GroupServiceAsync.WithRawResponse = group

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

        private val deleteHandler: Handler<RunDeleteResponse> =
            jsonHandler<RunDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: RunDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunDeleteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", "delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
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
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", "generate-query")
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

        private val ingestMultipartHandler: Handler<RunIngestMultipartResponse> =
            jsonHandler<RunIngestMultipartResponse>(clientOptions.jsonMapper)

        override fun ingestMultipart(
            params: RunIngestMultipartParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunIngestMultipartResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("runs", "multipart")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { ingestMultipartHandler.handle(it) }
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

        private val retrieveThreadPreviewHandler: Handler<RunRetrieveThreadPreviewResponse> =
            jsonHandler<RunRetrieveThreadPreviewResponse>(clientOptions.jsonMapper)

        override fun retrieveThreadPreview(
            params: RunRetrieveThreadPreviewParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunRetrieveThreadPreviewResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("threadId", params.threadId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", "threads", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveThreadPreviewHandler.handle(it) }
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
