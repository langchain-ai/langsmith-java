// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

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
import com.langsmith_api.api.core.http.multipartFormData
import com.langsmith_api.api.core.http.parseable
import com.langsmith_api.api.core.prepare
import com.langsmith_api.api.models.api.v1.examples.Example
import com.langsmith_api.api.models.api.v1.examples.ExampleCreateParams
import com.langsmith_api.api.models.api.v1.examples.ExampleDeleteAllParams
import com.langsmith_api.api.models.api.v1.examples.ExampleDeleteAllResponse
import com.langsmith_api.api.models.api.v1.examples.ExampleDeleteParams
import com.langsmith_api.api.models.api.v1.examples.ExampleDeleteResponse
import com.langsmith_api.api.models.api.v1.examples.ExampleListParams
import com.langsmith_api.api.models.api.v1.examples.ExampleRetrieveCountParams
import com.langsmith_api.api.models.api.v1.examples.ExampleRetrieveParams
import com.langsmith_api.api.models.api.v1.examples.ExampleUpdateParams
import com.langsmith_api.api.services.blocking.api.v1.examples.BulkService
import com.langsmith_api.api.services.blocking.api.v1.examples.BulkServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.examples.ValidateService
import com.langsmith_api.api.services.blocking.api.v1.examples.ValidateServiceImpl
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
    ): List<Example> =
        // post /api/v1/examples/upload/{dataset_id}
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
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
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

        private val updateHandler: Handler<List<Example>> =
            jsonHandler<List<Example>>(clientOptions.jsonMapper)

        override fun update(
            params: ExampleUpdateParams,
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
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
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
    }
}
