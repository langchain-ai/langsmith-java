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
import com.langchain.smith.models.examples.Example
import com.langchain.smith.models.examples.ExampleCreateParams
import com.langchain.smith.models.examples.ExampleDeleteAllParams
import com.langchain.smith.models.examples.ExampleDeleteAllResponse
import com.langchain.smith.models.examples.ExampleDeleteParams
import com.langchain.smith.models.examples.ExampleDeleteResponse
import com.langchain.smith.models.examples.ExampleListPageAsync
import com.langchain.smith.models.examples.ExampleListParams
import com.langchain.smith.models.examples.ExampleRetrieveCountParams
import com.langchain.smith.models.examples.ExampleRetrieveParams
import com.langchain.smith.models.examples.ExampleUpdateParams
import com.langchain.smith.models.examples.ExampleUpdateResponse
import com.langchain.smith.models.examples.ExampleUploadFromCsvParams
import com.langchain.smith.services.async.examples.BulkServiceAsync
import com.langchain.smith.services.async.examples.BulkServiceAsyncImpl
import com.langchain.smith.services.async.examples.ValidateServiceAsync
import com.langchain.smith.services.async.examples.ValidateServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ExampleServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ExampleServiceAsync {

    private val withRawResponse: ExampleServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val bulk: BulkServiceAsync by lazy { BulkServiceAsyncImpl(clientOptions) }

    private val validate: ValidateServiceAsync by lazy { ValidateServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ExampleServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExampleServiceAsync =
        ExampleServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun bulk(): BulkServiceAsync = bulk

    override fun validate(): ValidateServiceAsync = validate

    override fun create(
        params: ExampleCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Example> =
        // post /api/v1/examples
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: ExampleRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Example> =
        // get /api/v1/examples/{example_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ExampleUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExampleUpdateResponse> =
        // patch /api/v1/examples/{example_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ExampleListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExampleListPageAsync> =
        // get /api/v1/examples
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ExampleDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExampleDeleteResponse> =
        // delete /api/v1/examples/{example_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun deleteAll(
        params: ExampleDeleteAllParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExampleDeleteAllResponse> =
        // delete /api/v1/examples
        withRawResponse().deleteAll(params, requestOptions).thenApply { it.parse() }

    override fun retrieveCount(
        params: ExampleRetrieveCountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Long> =
        // get /api/v1/examples/count
        withRawResponse().retrieveCount(params, requestOptions).thenApply { it.parse() }

    override fun uploadFromCsv(
        params: ExampleUploadFromCsvParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<Example>> =
        // post /api/v1/examples/upload/{dataset_id}
        withRawResponse().uploadFromCsv(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExampleServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val bulk: BulkServiceAsync.WithRawResponse by lazy {
            BulkServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val validate: ValidateServiceAsync.WithRawResponse by lazy {
            ValidateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExampleServiceAsync.WithRawResponse =
            ExampleServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun bulk(): BulkServiceAsync.WithRawResponse = bulk

        override fun validate(): ValidateServiceAsync.WithRawResponse = validate

        private val createHandler: Handler<Example> = jsonHandler<Example>(clientOptions.jsonMapper)

        override fun create(
            params: ExampleCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Example>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "examples")
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

        private val retrieveHandler: Handler<Example> =
            jsonHandler<Example>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ExampleRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Example>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("exampleId", params.exampleId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "examples", params._pathParam(0))
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

        private val updateHandler: Handler<ExampleUpdateResponse> =
            jsonHandler<ExampleUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ExampleUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExampleUpdateResponse>> {
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

        private val listHandler: Handler<List<Example>> =
            jsonHandler<List<Example>>(clientOptions.jsonMapper)

        override fun list(
            params: ExampleListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExampleListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "examples")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                            .let {
                                ExampleListPageAsync.builder()
                                    .service(ExampleServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .items(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<ExampleDeleteResponse> =
            jsonHandler<ExampleDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ExampleDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExampleDeleteResponse>> {
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

        private val deleteAllHandler: Handler<ExampleDeleteAllResponse> =
            jsonHandler<ExampleDeleteAllResponse>(clientOptions.jsonMapper)

        override fun deleteAll(
            params: ExampleDeleteAllParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExampleDeleteAllResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "examples")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteAllHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveCountHandler: Handler<Long> =
            jsonHandler<Long>(clientOptions.jsonMapper)

        override fun retrieveCount(
            params: ExampleRetrieveCountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Long>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "examples", "count")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { retrieveCountHandler.handle(it) }
                    }
                }
        }

        private val uploadFromCsvHandler: Handler<List<Example>> =
            jsonHandler<List<Example>>(clientOptions.jsonMapper)

        override fun uploadFromCsv(
            params: ExampleUploadFromCsvParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<Example>>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
