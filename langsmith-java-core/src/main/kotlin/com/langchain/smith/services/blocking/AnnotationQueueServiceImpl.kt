// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

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
import com.langchain.smith.core.prepare
import com.langchain.smith.models.annotationqueues.AnnotationQueueAnnotationQueuesParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueCreateRunStatusParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueCreateRunStatusResponse
import com.langchain.smith.models.annotationqueues.AnnotationQueueDeleteParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueDeleteResponse
import com.langchain.smith.models.annotationqueues.AnnotationQueueExportParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueExportResponse
import com.langchain.smith.models.annotationqueues.AnnotationQueuePopulateParams
import com.langchain.smith.models.annotationqueues.AnnotationQueuePopulateResponse
import com.langchain.smith.models.annotationqueues.AnnotationQueueRetrieveAnnotationQueuesPage
import com.langchain.smith.models.annotationqueues.AnnotationQueueRetrieveAnnotationQueuesParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueRetrieveAnnotationQueuesResponse
import com.langchain.smith.models.annotationqueues.AnnotationQueueRetrieveParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueRetrieveQueuesParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueRetrieveResponse
import com.langchain.smith.models.annotationqueues.AnnotationQueueRetrieveRunParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueRetrieveSizeParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueRetrieveTotalArchivedParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueRetrieveTotalSizeParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueSchema
import com.langchain.smith.models.annotationqueues.AnnotationQueueSizeSchema
import com.langchain.smith.models.annotationqueues.AnnotationQueueUpdateParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueUpdateResponse
import com.langchain.smith.models.annotationqueues.RunSchemaWithAnnotationQueueInfo
import com.langchain.smith.services.blocking.annotationqueues.InfoService
import com.langchain.smith.services.blocking.annotationqueues.InfoServiceImpl
import com.langchain.smith.services.blocking.annotationqueues.RunService
import com.langchain.smith.services.blocking.annotationqueues.RunServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AnnotationQueueServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AnnotationQueueService {

    private val withRawResponse: AnnotationQueueService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val runs: RunService by lazy { RunServiceImpl(clientOptions) }

    private val info: InfoService by lazy { InfoServiceImpl(clientOptions) }

    override fun withRawResponse(): AnnotationQueueService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AnnotationQueueService =
        AnnotationQueueServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun runs(): RunService = runs

    override fun info(): InfoService = info

    override fun retrieve(
        params: AnnotationQueueRetrieveParams,
        requestOptions: RequestOptions,
    ): AnnotationQueueRetrieveResponse =
        // get /api/v1/annotation-queues/{queue_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: AnnotationQueueUpdateParams,
        requestOptions: RequestOptions,
    ): AnnotationQueueUpdateResponse =
        // patch /api/v1/annotation-queues/{queue_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: AnnotationQueueDeleteParams,
        requestOptions: RequestOptions,
    ): AnnotationQueueDeleteResponse =
        // delete /api/v1/annotation-queues/{queue_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun annotationQueues(
        params: AnnotationQueueAnnotationQueuesParams,
        requestOptions: RequestOptions,
    ): AnnotationQueueSchema =
        // post /api/v1/annotation-queues
        withRawResponse().annotationQueues(params, requestOptions).parse()

    override fun createRunStatus(
        params: AnnotationQueueCreateRunStatusParams,
        requestOptions: RequestOptions,
    ): AnnotationQueueCreateRunStatusResponse =
        // post /api/v1/annotation-queues/status/{annotation_queue_run_id}
        withRawResponse().createRunStatus(params, requestOptions).parse()

    override fun export(
        params: AnnotationQueueExportParams,
        requestOptions: RequestOptions,
    ): AnnotationQueueExportResponse =
        // post /api/v1/annotation-queues/{queue_id}/export
        withRawResponse().export(params, requestOptions).parse()

    override fun populate(
        params: AnnotationQueuePopulateParams,
        requestOptions: RequestOptions,
    ): AnnotationQueuePopulateResponse =
        // post /api/v1/annotation-queues/populate
        withRawResponse().populate(params, requestOptions).parse()

    override fun retrieveAnnotationQueues(
        params: AnnotationQueueRetrieveAnnotationQueuesParams,
        requestOptions: RequestOptions,
    ): AnnotationQueueRetrieveAnnotationQueuesPage =
        // get /api/v1/annotation-queues
        withRawResponse().retrieveAnnotationQueues(params, requestOptions).parse()

    override fun retrieveQueues(
        params: AnnotationQueueRetrieveQueuesParams,
        requestOptions: RequestOptions,
    ): List<AnnotationQueueSchema> =
        // get /api/v1/annotation-queues/{run_id}/queues
        withRawResponse().retrieveQueues(params, requestOptions).parse()

    override fun retrieveRun(
        params: AnnotationQueueRetrieveRunParams,
        requestOptions: RequestOptions,
    ): RunSchemaWithAnnotationQueueInfo =
        // get /api/v1/annotation-queues/{queue_id}/run/{index}
        withRawResponse().retrieveRun(params, requestOptions).parse()

    override fun retrieveSize(
        params: AnnotationQueueRetrieveSizeParams,
        requestOptions: RequestOptions,
    ): AnnotationQueueSizeSchema =
        // get /api/v1/annotation-queues/{queue_id}/size
        withRawResponse().retrieveSize(params, requestOptions).parse()

    override fun retrieveTotalArchived(
        params: AnnotationQueueRetrieveTotalArchivedParams,
        requestOptions: RequestOptions,
    ): AnnotationQueueSizeSchema =
        // get /api/v1/annotation-queues/{queue_id}/total_archived
        withRawResponse().retrieveTotalArchived(params, requestOptions).parse()

    override fun retrieveTotalSize(
        params: AnnotationQueueRetrieveTotalSizeParams,
        requestOptions: RequestOptions,
    ): AnnotationQueueSizeSchema =
        // get /api/v1/annotation-queues/{queue_id}/total_size
        withRawResponse().retrieveTotalSize(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AnnotationQueueService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val runs: RunService.WithRawResponse by lazy {
            RunServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val info: InfoService.WithRawResponse by lazy {
            InfoServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AnnotationQueueService.WithRawResponse =
            AnnotationQueueServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun runs(): RunService.WithRawResponse = runs

        override fun info(): InfoService.WithRawResponse = info

        private val retrieveHandler: Handler<AnnotationQueueRetrieveResponse> =
            jsonHandler<AnnotationQueueRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AnnotationQueueRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnnotationQueueRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueId", params.queueId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "annotation-queues", params._pathParam(0))
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

        private val updateHandler: Handler<AnnotationQueueUpdateResponse> =
            jsonHandler<AnnotationQueueUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: AnnotationQueueUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnnotationQueueUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueId", params.queueId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "annotation-queues", params._pathParam(0))
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

        private val deleteHandler: Handler<AnnotationQueueDeleteResponse> =
            jsonHandler<AnnotationQueueDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: AnnotationQueueDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnnotationQueueDeleteResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val annotationQueuesHandler: Handler<AnnotationQueueSchema> =
            jsonHandler<AnnotationQueueSchema>(clientOptions.jsonMapper)

        override fun annotationQueues(
            params: AnnotationQueueAnnotationQueuesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnnotationQueueSchema> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "annotation-queues")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { annotationQueuesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createRunStatusHandler: Handler<AnnotationQueueCreateRunStatusResponse> =
            jsonHandler<AnnotationQueueCreateRunStatusResponse>(clientOptions.jsonMapper)

        override fun createRunStatus(
            params: AnnotationQueueCreateRunStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnnotationQueueCreateRunStatusResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createRunStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val exportHandler: Handler<AnnotationQueueExportResponse> =
            jsonHandler<AnnotationQueueExportResponse>(clientOptions.jsonMapper)

        override fun export(
            params: AnnotationQueueExportParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnnotationQueueExportResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { exportHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val populateHandler: Handler<AnnotationQueuePopulateResponse> =
            jsonHandler<AnnotationQueuePopulateResponse>(clientOptions.jsonMapper)

        override fun populate(
            params: AnnotationQueuePopulateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnnotationQueuePopulateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "annotation-queues", "populate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { populateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<AnnotationQueueRetrieveAnnotationQueuesPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "annotation-queues")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveAnnotationQueuesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        AnnotationQueueRetrieveAnnotationQueuesPage.builder()
                            .service(AnnotationQueueServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val retrieveQueuesHandler: Handler<List<AnnotationQueueSchema>> =
            jsonHandler<List<AnnotationQueueSchema>>(clientOptions.jsonMapper)

        override fun retrieveQueues(
            params: AnnotationQueueRetrieveQueuesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AnnotationQueueSchema>> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveQueuesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val retrieveRunHandler: Handler<RunSchemaWithAnnotationQueueInfo> =
            jsonHandler<RunSchemaWithAnnotationQueueInfo>(clientOptions.jsonMapper)

        override fun retrieveRun(
            params: AnnotationQueueRetrieveRunParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunSchemaWithAnnotationQueueInfo> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveRunHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveSizeHandler: Handler<AnnotationQueueSizeSchema> =
            jsonHandler<AnnotationQueueSizeSchema>(clientOptions.jsonMapper)

        override fun retrieveSize(
            params: AnnotationQueueRetrieveSizeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnnotationQueueSizeSchema> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueId", params.queueId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "annotation-queues", params._pathParam(0), "size")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveSizeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveTotalArchivedHandler: Handler<AnnotationQueueSizeSchema> =
            jsonHandler<AnnotationQueueSizeSchema>(clientOptions.jsonMapper)

        override fun retrieveTotalArchived(
            params: AnnotationQueueRetrieveTotalArchivedParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnnotationQueueSizeSchema> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveTotalArchivedHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveTotalSizeHandler: Handler<AnnotationQueueSizeSchema> =
            jsonHandler<AnnotationQueueSizeSchema>(clientOptions.jsonMapper)

        override fun retrieveTotalSize(
            params: AnnotationQueueRetrieveTotalSizeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnnotationQueueSizeSchema> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
