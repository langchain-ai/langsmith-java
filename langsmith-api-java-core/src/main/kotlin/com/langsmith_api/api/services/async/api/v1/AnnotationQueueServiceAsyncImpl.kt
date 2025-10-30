// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.handlers.errorBodyHandler
import com.langsmith_api.api.core.handlers.errorHandler
import com.langsmith_api.api.core.handlers.jsonHandler
import com.langsmith_api.api.core.http.HttpMethod
import com.langsmith_api.api.core.http.HttpRequest
import com.langsmith_api.api.core.http.HttpResponse
import com.langsmith_api.api.core.http.HttpResponse.Handler
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.core.http.json
import com.langsmith_api.api.core.http.parseable
import com.langsmith_api.api.core.prepareAsync
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueAnnotationQueuesParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueDeleteParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueDeleteResponse
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueExportParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueExportResponse
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueuePopulateParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueuePopulateResponse
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueRetrieveAnnotationQueuesParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueRetrieveAnnotationQueuesResponse
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueRetrieveParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueRetrieveQueuesParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueRetrieveSizeParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueRetrieveTotalArchivedParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueRetrieveTotalSizeParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueSchema
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueSizeSchema
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueUpdateParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueUpdateResponse
import com.langsmith_api.api.models.api.v1.annotationqueues.RunSchemaWithAnnotationQueueInfo
import com.langsmith_api.api.services.async.api.v1.annotationqueues.RunServiceAsync
import com.langsmith_api.api.services.async.api.v1.annotationqueues.RunServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AnnotationQueueServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : AnnotationQueueServiceAsync {

    private val withRawResponse: AnnotationQueueServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val runs: RunServiceAsync by lazy { RunServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AnnotationQueueServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): AnnotationQueueServiceAsync =
        AnnotationQueueServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun runs(): RunServiceAsync = runs

    override fun retrieve(
        params: AnnotationQueueRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunSchemaWithAnnotationQueueInfo> =
        // get /api/v1/annotation-queues/{queue_id}/run/{index}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: AnnotationQueueUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnnotationQueueUpdateResponse> =
        // post /api/v1/annotation-queues/status/{annotation_queue_run_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AnnotationQueueDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnnotationQueueDeleteResponse> =
        // delete /api/v1/annotation-queues/{queue_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun annotationQueues(
        params: AnnotationQueueAnnotationQueuesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnnotationQueueSchema> =
        // post /api/v1/annotation-queues
        withRawResponse().annotationQueues(params, requestOptions).thenApply { it.parse() }

    override fun export(
        params: AnnotationQueueExportParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnnotationQueueExportResponse> =
        // post /api/v1/annotation-queues/{queue_id}/export
        withRawResponse().export(params, requestOptions).thenApply { it.parse() }

    override fun populate(
        params: AnnotationQueuePopulateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnnotationQueuePopulateResponse> =
        // post /api/v1/annotation-queues/populate
        withRawResponse().populate(params, requestOptions).thenApply { it.parse() }

    override fun retrieveAnnotationQueues(
        params: AnnotationQueueRetrieveAnnotationQueuesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<AnnotationQueueRetrieveAnnotationQueuesResponse>> =
        // get /api/v1/annotation-queues
        withRawResponse().retrieveAnnotationQueues(params, requestOptions).thenApply { it.parse() }

    override fun retrieveQueues(
        params: AnnotationQueueRetrieveQueuesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<AnnotationQueueSchema>> =
        // get /api/v1/annotation-queues/{run_id}/queues
        withRawResponse().retrieveQueues(params, requestOptions).thenApply { it.parse() }

    override fun retrieveSize(
        params: AnnotationQueueRetrieveSizeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnnotationQueueSizeSchema> =
        // get /api/v1/annotation-queues/{queue_id}/size
        withRawResponse().retrieveSize(params, requestOptions).thenApply { it.parse() }

    override fun retrieveTotalArchived(
        params: AnnotationQueueRetrieveTotalArchivedParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnnotationQueueSizeSchema> =
        // get /api/v1/annotation-queues/{queue_id}/total_archived
        withRawResponse().retrieveTotalArchived(params, requestOptions).thenApply { it.parse() }

    override fun retrieveTotalSize(
        params: AnnotationQueueRetrieveTotalSizeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnnotationQueueSizeSchema> =
        // get /api/v1/annotation-queues/{queue_id}/total_size
        withRawResponse().retrieveTotalSize(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AnnotationQueueServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val runs: RunServiceAsync.WithRawResponse by lazy {
            RunServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AnnotationQueueServiceAsync.WithRawResponse =
            AnnotationQueueServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun runs(): RunServiceAsync.WithRawResponse = runs

        private val retrieveHandler: Handler<RunSchemaWithAnnotationQueueInfo> =
            jsonHandler<RunSchemaWithAnnotationQueueInfo>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AnnotationQueueRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunSchemaWithAnnotationQueueInfo>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("index", params.index().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "annotation-queues",
                        params._pathParam(0),
                        "run",
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

        private val updateHandler: Handler<AnnotationQueueUpdateResponse> =
            jsonHandler<AnnotationQueueUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: AnnotationQueueUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnnotationQueueUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("annotationQueueRunId", params.annotationQueueRunId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "annotation-queues",
                        "status",
                        params._pathParam(0),
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
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<AnnotationQueueDeleteResponse> =
            jsonHandler<AnnotationQueueDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: AnnotationQueueDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnnotationQueueDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueId", params.queueId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "annotation-queues", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
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

        private val annotationQueuesHandler: Handler<AnnotationQueueSchema> =
            jsonHandler<AnnotationQueueSchema>(clientOptions.jsonMapper)

        override fun annotationQueues(
            params: AnnotationQueueAnnotationQueuesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnnotationQueueSchema>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "annotation-queues")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { annotationQueuesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val exportHandler: Handler<AnnotationQueueExportResponse> =
            jsonHandler<AnnotationQueueExportResponse>(clientOptions.jsonMapper)

        override fun export(
            params: AnnotationQueueExportParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnnotationQueueExportResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueId", params.queueId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "annotation-queues",
                        params._pathParam(0),
                        "export",
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
                            .use { exportHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val populateHandler: Handler<AnnotationQueuePopulateResponse> =
            jsonHandler<AnnotationQueuePopulateResponse>(clientOptions.jsonMapper)

        override fun populate(
            params: AnnotationQueuePopulateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnnotationQueuePopulateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "annotation-queues", "populate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { populateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveAnnotationQueuesHandler:
            Handler<List<AnnotationQueueRetrieveAnnotationQueuesResponse>> =
            jsonHandler<List<AnnotationQueueRetrieveAnnotationQueuesResponse>>(
                clientOptions.jsonMapper
            )

        override fun retrieveAnnotationQueues(
            params: AnnotationQueueRetrieveAnnotationQueuesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<List<AnnotationQueueRetrieveAnnotationQueuesResponse>>
        > {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "annotation-queues")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveAnnotationQueuesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val retrieveQueuesHandler: Handler<List<AnnotationQueueSchema>> =
            jsonHandler<List<AnnotationQueueSchema>>(clientOptions.jsonMapper)

        override fun retrieveQueues(
            params: AnnotationQueueRetrieveQueuesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<AnnotationQueueSchema>>> {
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
                        "annotation-queues",
                        params._pathParam(0),
                        "queues",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveQueuesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val retrieveSizeHandler: Handler<AnnotationQueueSizeSchema> =
            jsonHandler<AnnotationQueueSizeSchema>(clientOptions.jsonMapper)

        override fun retrieveSize(
            params: AnnotationQueueRetrieveSizeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnnotationQueueSizeSchema>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueId", params.queueId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "annotation-queues", params._pathParam(0), "size")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveSizeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveTotalArchivedHandler: Handler<AnnotationQueueSizeSchema> =
            jsonHandler<AnnotationQueueSizeSchema>(clientOptions.jsonMapper)

        override fun retrieveTotalArchived(
            params: AnnotationQueueRetrieveTotalArchivedParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnnotationQueueSizeSchema>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueId", params.queueId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "annotation-queues",
                        params._pathParam(0),
                        "total_archived",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveTotalArchivedHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveTotalSizeHandler: Handler<AnnotationQueueSizeSchema> =
            jsonHandler<AnnotationQueueSizeSchema>(clientOptions.jsonMapper)

        override fun retrieveTotalSize(
            params: AnnotationQueueRetrieveTotalSizeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnnotationQueueSizeSchema>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueId", params.queueId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "annotation-queues",
                        params._pathParam(0),
                        "total_size",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveTotalSizeHandler.handle(it) }
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
