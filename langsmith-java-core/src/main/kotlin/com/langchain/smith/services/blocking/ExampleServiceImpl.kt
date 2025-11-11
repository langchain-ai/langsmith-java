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
import com.langchain.smith.core.http.multipartFormData
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.prepare
import com.langchain.smith.models.examples.Example
import com.langchain.smith.models.examples.ExampleCreateParams
import com.langchain.smith.models.examples.ExampleDeleteAllParams
import com.langchain.smith.models.examples.ExampleDeleteAllResponse
import com.langchain.smith.models.examples.ExampleDeleteParams
import com.langchain.smith.models.examples.ExampleDeleteResponse
import com.langchain.smith.models.examples.ExampleListParams
import com.langchain.smith.models.examples.ExampleRetrieveCountParams
import com.langchain.smith.models.examples.ExampleRetrieveParams
import com.langchain.smith.models.examples.ExampleUpdateParams
import com.langchain.smith.models.examples.ExampleUpdateResponse
import com.langchain.smith.models.examples.ExampleUploadFromCsvParams
import com.langchain.smith.services.blocking.examples.BulkService
import com.langchain.smith.services.blocking.examples.BulkServiceImpl
import com.langchain.smith.services.blocking.examples.ValidateService
import com.langchain.smith.services.blocking.examples.ValidateServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ExampleServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExampleService {

    private val withRawResponse: ExampleService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val bulk: BulkService by lazy { BulkServiceImpl(clientOptions) }

    private val validate: ValidateService by lazy { ValidateServiceImpl(clientOptions) }

    override fun withRawResponse(): ExampleService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExampleService =
        ExampleServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun bulk(): BulkService = bulk

    override fun validate(): ValidateService = validate

    override fun create(params: ExampleCreateParams, requestOptions: RequestOptions): Example =
        // post /api/v1/examples
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: ExampleRetrieveParams, requestOptions: RequestOptions): Example =
        // get /api/v1/examples/{example_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ExampleUpdateParams,
        requestOptions: RequestOptions,
    ): ExampleUpdateResponse =
        // patch /api/v1/examples/{example_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: ExampleListParams, requestOptions: RequestOptions): List<Example> =
        // get /api/v1/examples
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: ExampleDeleteParams,
        requestOptions: RequestOptions,
    ): ExampleDeleteResponse =
        // delete /api/v1/examples/{example_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun deleteAll(
        params: ExampleDeleteAllParams,
        requestOptions: RequestOptions,
    ): ExampleDeleteAllResponse =
        // delete /api/v1/examples
        withRawResponse().deleteAll(params, requestOptions).parse()

    override fun retrieveCount(
        params: ExampleRetrieveCountParams,
        requestOptions: RequestOptions,
    ): Long =
        // get /api/v1/examples/count
        withRawResponse().retrieveCount(params, requestOptions).parse()

    override fun uploadFromCsv(
        params: ExampleUploadFromCsvParams,
        requestOptions: RequestOptions,
    ): List<Example> =
        // post /api/v1/examples/upload/{dataset_id}
        withRawResponse().uploadFromCsv(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExampleService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val bulk: BulkService.WithRawResponse by lazy {
            BulkServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val validate: ValidateService.WithRawResponse by lazy {
            ValidateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExampleService.WithRawResponse =
            ExampleServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun bulk(): BulkService.WithRawResponse = bulk

        override fun validate(): ValidateService.WithRawResponse = validate

        private val createHandler: Handler<Example> = jsonHandler<Example>(clientOptions.jsonMapper)

        override fun create(
            params: ExampleCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Example> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "examples")
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

        private val retrieveHandler: Handler<Example> =
            jsonHandler<Example>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ExampleRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Example> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("exampleId", params.exampleId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "examples", params._pathParam(0))
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

        private val updateHandler: Handler<ExampleUpdateResponse> =
            jsonHandler<ExampleUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ExampleUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExampleUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("exampleId", params.exampleId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "examples", params._pathParam(0))
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

        private val listHandler: Handler<List<Example>> =
            jsonHandler<List<Example>>(clientOptions.jsonMapper)

        override fun list(
            params: ExampleListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Example>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "examples")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val deleteHandler: Handler<ExampleDeleteResponse> =
            jsonHandler<ExampleDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ExampleDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExampleDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("exampleId", params.exampleId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "examples", params._pathParam(0))
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

        private val deleteAllHandler: Handler<ExampleDeleteAllResponse> =
            jsonHandler<ExampleDeleteAllResponse>(clientOptions.jsonMapper)

        override fun deleteAll(
            params: ExampleDeleteAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExampleDeleteAllResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "examples")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteAllHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveCountHandler: Handler<Long> =
            jsonHandler<Long>(clientOptions.jsonMapper)

        override fun retrieveCount(
            params: ExampleRetrieveCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Long> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "examples", "count")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { retrieveCountHandler.handle(it) }
            }
        }

        private val uploadFromCsvHandler: Handler<List<Example>> =
            jsonHandler<List<Example>>(clientOptions.jsonMapper)

        override fun uploadFromCsv(
            params: ExampleUploadFromCsvParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Example>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "examples", "upload", params._pathParam(0))
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { uploadFromCsvHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
