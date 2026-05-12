// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.sandboxes

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.handlers.emptyHandler
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
import com.langchain.smith.models.sandboxes.boxes.BoxCreateParams
import com.langchain.smith.models.sandboxes.boxes.BoxCreateResponse
import com.langchain.smith.models.sandboxes.boxes.BoxCreateSnapshotParams
import com.langchain.smith.models.sandboxes.boxes.BoxCreateSnapshotResponse
import com.langchain.smith.models.sandboxes.boxes.BoxDeleteParams
import com.langchain.smith.models.sandboxes.boxes.BoxGenerateServiceUrlParams
import com.langchain.smith.models.sandboxes.boxes.BoxGenerateServiceUrlResponse
import com.langchain.smith.models.sandboxes.boxes.BoxGetStatusParams
import com.langchain.smith.models.sandboxes.boxes.BoxGetStatusResponse
import com.langchain.smith.models.sandboxes.boxes.BoxListParams
import com.langchain.smith.models.sandboxes.boxes.BoxListResponse
import com.langchain.smith.models.sandboxes.boxes.BoxRetrieveParams
import com.langchain.smith.models.sandboxes.boxes.BoxRetrieveResponse
import com.langchain.smith.models.sandboxes.boxes.BoxStopParams
import com.langchain.smith.models.sandboxes.boxes.BoxUpdateParams
import com.langchain.smith.models.sandboxes.boxes.BoxUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BoxServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BoxServiceAsync {

    private val withRawResponse: BoxServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BoxServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BoxServiceAsync =
        BoxServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: BoxCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BoxCreateResponse> =
        // post /v2/sandboxes/boxes
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: BoxRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BoxRetrieveResponse> =
        // get /v2/sandboxes/boxes/{name}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: BoxUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BoxUpdateResponse> =
        // patch /v2/sandboxes/boxes/{name}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: BoxListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BoxListResponse> =
        // get /v2/sandboxes/boxes
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: BoxDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v2/sandboxes/boxes/{name}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun createSnapshot(
        params: BoxCreateSnapshotParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BoxCreateSnapshotResponse> =
        // post /v2/sandboxes/boxes/{name}/snapshot
        withRawResponse().createSnapshot(params, requestOptions).thenApply { it.parse() }

    override fun generateServiceUrl(
        params: BoxGenerateServiceUrlParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BoxGenerateServiceUrlResponse> =
        // post /v2/sandboxes/boxes/{name}/service-url
        withRawResponse().generateServiceUrl(params, requestOptions).thenApply { it.parse() }

    override fun getStatus(
        params: BoxGetStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BoxGetStatusResponse> =
        // get /v2/sandboxes/boxes/{name}/status
        withRawResponse().getStatus(params, requestOptions).thenApply { it.parse() }

    override fun stop(
        params: BoxStopParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /v2/sandboxes/boxes/{name}/stop
        withRawResponse().stop(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BoxServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BoxServiceAsync.WithRawResponse =
            BoxServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<BoxCreateResponse> =
            jsonHandler<BoxCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: BoxCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BoxCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "sandboxes", "boxes")
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

        private val retrieveHandler: Handler<BoxRetrieveResponse> =
            jsonHandler<BoxRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BoxRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BoxRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("name", params.name().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "sandboxes", "boxes", params._pathParam(0))
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

        private val updateHandler: Handler<BoxUpdateResponse> =
            jsonHandler<BoxUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: BoxUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BoxUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathName", params.pathName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "sandboxes", "boxes", params._pathParam(0))
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

        private val listHandler: Handler<BoxListResponse> =
            jsonHandler<BoxListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BoxListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BoxListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "sandboxes", "boxes")
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
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: BoxDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("name", params.name().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "sandboxes", "boxes", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val createSnapshotHandler: Handler<BoxCreateSnapshotResponse> =
            jsonHandler<BoxCreateSnapshotResponse>(clientOptions.jsonMapper)

        override fun createSnapshot(
            params: BoxCreateSnapshotParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BoxCreateSnapshotResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathName", params.pathName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "sandboxes", "boxes", params._pathParam(0), "snapshot")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createSnapshotHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val generateServiceUrlHandler: Handler<BoxGenerateServiceUrlResponse> =
            jsonHandler<BoxGenerateServiceUrlResponse>(clientOptions.jsonMapper)

        override fun generateServiceUrl(
            params: BoxGenerateServiceUrlParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BoxGenerateServiceUrlResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("name", params.name().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v2",
                        "sandboxes",
                        "boxes",
                        params._pathParam(0),
                        "service-url",
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
                            .use { generateServiceUrlHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getStatusHandler: Handler<BoxGetStatusResponse> =
            jsonHandler<BoxGetStatusResponse>(clientOptions.jsonMapper)

        override fun getStatus(
            params: BoxGetStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BoxGetStatusResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("name", params.name().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "sandboxes", "boxes", params._pathParam(0), "status")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getStatusHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val stopHandler: Handler<Void?> = emptyHandler()

        override fun stop(
            params: BoxStopParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("name", params.name().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "sandboxes", "boxes", params._pathParam(0), "stop")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { stopHandler.handle(it) }
                    }
                }
        }
    }
}
