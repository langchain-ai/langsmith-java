// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.workspaces.current

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
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
import com.langchain.smith.models.workspaces.current.shared.SharedDeleteAllParams
import com.langchain.smith.models.workspaces.current.shared.SharedDeleteAllResponse
import com.langchain.smith.models.workspaces.current.shared.SharedListParams
import com.langchain.smith.models.workspaces.current.shared.SharedListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class SharedServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SharedServiceAsync {

    private val withRawResponse: SharedServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SharedServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SharedServiceAsync =
        SharedServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: SharedListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SharedListResponse> =
        // get /api/v1/workspaces/current/shared
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun deleteAll(
        params: SharedDeleteAllParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SharedDeleteAllResponse> =
        // delete /api/v1/workspaces/current/shared
        withRawResponse().deleteAll(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SharedServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SharedServiceAsync.WithRawResponse =
            SharedServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<SharedListResponse> =
            jsonHandler<SharedListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SharedListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SharedListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "shared")
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

        private val deleteAllHandler: Handler<SharedDeleteAllResponse> =
            jsonHandler<SharedDeleteAllResponse>(clientOptions.jsonMapper)

        override fun deleteAll(
            params: SharedDeleteAllParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SharedDeleteAllResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "shared")
                    .body(json(clientOptions.jsonMapper, params._body()))
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
    }
}
