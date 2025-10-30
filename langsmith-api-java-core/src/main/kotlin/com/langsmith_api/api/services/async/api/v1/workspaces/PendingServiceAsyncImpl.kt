// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.workspaces

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
import com.langsmith_api.api.models.api.v1.tenants.AppSchemasTenant
import com.langsmith_api.api.models.api.v1.workspaces.pending.PendingClaimParams
import com.langsmith_api.api.models.api.v1.workspaces.pending.PendingClaimResponse
import com.langsmith_api.api.models.api.v1.workspaces.pending.PendingDeleteParams
import com.langsmith_api.api.models.api.v1.workspaces.pending.PendingDeleteResponse
import com.langsmith_api.api.models.api.v1.workspaces.pending.PendingListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PendingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PendingServiceAsync {

    private val withRawResponse: PendingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PendingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PendingServiceAsync =
        PendingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: PendingListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<AppSchemasTenant>> =
        // get /api/v1/workspaces/pending
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: PendingDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PendingDeleteResponse> =
        // delete /api/v1/workspaces/pending/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    @Deprecated("deprecated")
    override fun claim(
        params: PendingClaimParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PendingClaimResponse> =
        // post /api/v1/workspaces/pending/{workspace_id}/claim
        withRawResponse().claim(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PendingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PendingServiceAsync.WithRawResponse =
            PendingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<List<AppSchemasTenant>> =
            jsonHandler<List<AppSchemasTenant>>(clientOptions.jsonMapper)

        override fun list(
            params: PendingListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<AppSchemasTenant>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "pending")
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

        private val deleteHandler: Handler<PendingDeleteResponse> =
            jsonHandler<PendingDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: PendingDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PendingDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "pending", params._pathParam(0))
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

        private val claimHandler: Handler<PendingClaimResponse> =
            jsonHandler<PendingClaimResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun claim(
            params: PendingClaimParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PendingClaimResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("workspaceId", params.workspaceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "workspaces",
                        "pending",
                        params._pathParam(0),
                        "claim",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { claimHandler.handle(it) }
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
