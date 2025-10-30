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
import com.langsmith_api.api.models.api.v1.commits.CommitManifestResponse
import com.langsmith_api.api.models.api.v1.commits.CommitRetrieveParams
import com.langsmith_api.api.models.api.v1.commits.CommitUpdateParams
import com.langsmith_api.api.models.api.v1.commits.CommitUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CommitServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CommitServiceAsync {

    private val withRawResponse: CommitServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CommitServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommitServiceAsync =
        CommitServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: CommitRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommitManifestResponse> =
        // get /api/v1/commits/{owner}/{repo}/{commit}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CommitUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommitUpdateResponse> =
        // post /api/v1/commits/{owner}/{repo}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CommitServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CommitServiceAsync.WithRawResponse =
            CommitServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<CommitManifestResponse> =
            jsonHandler<CommitManifestResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CommitRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommitManifestResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("commit", params.commit().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "commits",
                        params._pathParam(0),
                        params._pathParam(1),
                        params._pathParam(2),
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

        private val updateHandler: Handler<CommitUpdateResponse> =
            jsonHandler<CommitUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: CommitUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommitUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("repo", params.repo().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "commits",
                        params._pathParam(0),
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
    }
}
