// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.datasets

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.handlers.emptyHandler
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
import com.langsmith_api.api.models.datasets.experimentviewoverrides.ExperimentViewOverride
import com.langsmith_api.api.models.datasets.experimentviewoverrides.ExperimentViewOverrideCreateParams
import com.langsmith_api.api.models.datasets.experimentviewoverrides.ExperimentViewOverrideDeleteParams
import com.langsmith_api.api.models.datasets.experimentviewoverrides.ExperimentViewOverrideListParams
import com.langsmith_api.api.models.datasets.experimentviewoverrides.ExperimentViewOverrideRetrieveParams
import com.langsmith_api.api.models.datasets.experimentviewoverrides.ExperimentViewOverrideUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class ExperimentViewOverrideServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    ExperimentViewOverrideServiceAsync {

    private val withRawResponse: ExperimentViewOverrideServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExperimentViewOverrideServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ExperimentViewOverrideServiceAsync =
        ExperimentViewOverrideServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: ExperimentViewOverrideCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExperimentViewOverride> =
        // post /datasets/{dataset_id}/experiment-view-overrides
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: ExperimentViewOverrideRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExperimentViewOverride> =
        // get /datasets/{dataset_id}/experiment-view-overrides/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ExperimentViewOverrideUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExperimentViewOverride> =
        // patch /datasets/{dataset_id}/experiment-view-overrides/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ExperimentViewOverrideListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<ExperimentViewOverride>> =
        // get /datasets/{dataset_id}/experiment-view-overrides
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ExperimentViewOverrideDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /datasets/{dataset_id}/experiment-view-overrides/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExperimentViewOverrideServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExperimentViewOverrideServiceAsync.WithRawResponse =
            ExperimentViewOverrideServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ExperimentViewOverride> =
            jsonHandler<ExperimentViewOverride>(clientOptions.jsonMapper)

        override fun create(
            params: ExperimentViewOverrideCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExperimentViewOverride>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("datasets", params._pathParam(0), "experiment-view-overrides")
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

        private val retrieveHandler: Handler<ExperimentViewOverride> =
            jsonHandler<ExperimentViewOverride>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ExperimentViewOverrideRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExperimentViewOverride>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "datasets",
                        params._pathParam(0),
                        "experiment-view-overrides",
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

        private val updateHandler: Handler<ExperimentViewOverride> =
            jsonHandler<ExperimentViewOverride>(clientOptions.jsonMapper)

        override fun update(
            params: ExperimentViewOverrideUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExperimentViewOverride>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "datasets",
                        params._pathParam(0),
                        "experiment-view-overrides",
                        params._pathParam(1),
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

        private val listHandler: Handler<List<ExperimentViewOverride>> =
            jsonHandler<List<ExperimentViewOverride>>(clientOptions.jsonMapper)

        override fun list(
            params: ExperimentViewOverrideListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<ExperimentViewOverride>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("datasets", params._pathParam(0), "experiment-view-overrides")
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
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ExperimentViewOverrideDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "datasets",
                        params._pathParam(0),
                        "experiment-view-overrides",
                        params._pathParam(1),
                    )
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
    }
}
