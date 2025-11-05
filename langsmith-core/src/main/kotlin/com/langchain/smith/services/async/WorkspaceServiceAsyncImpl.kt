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
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.prepareAsync
import com.langchain.smith.models.tenants.AppSchemasTenant
import com.langchain.smith.models.tenants.TenantForUser
import com.langchain.smith.models.workspaces.WorkspaceCreateParams
import com.langchain.smith.models.workspaces.WorkspaceDeleteParams
import com.langchain.smith.models.workspaces.WorkspaceDeleteResponse
import com.langchain.smith.models.workspaces.WorkspaceListParams
import com.langchain.smith.models.workspaces.WorkspaceUpdateParams
import com.langchain.smith.services.async.workspaces.CurrentServiceAsync
import com.langchain.smith.services.async.workspaces.CurrentServiceAsyncImpl
import com.langchain.smith.services.async.workspaces.PendingServiceAsync
import com.langchain.smith.services.async.workspaces.PendingServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WorkspaceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WorkspaceServiceAsync {

    private val withRawResponse: WorkspaceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val pending: PendingServiceAsync by lazy { PendingServiceAsyncImpl(clientOptions) }

    private val current: CurrentServiceAsync by lazy { CurrentServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): WorkspaceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkspaceServiceAsync =
        WorkspaceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun pending(): PendingServiceAsync = pending

    override fun current(): CurrentServiceAsync = current

    override fun create(
        params: WorkspaceCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AppSchemasTenant> =
        // post /api/v1/workspaces
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: WorkspaceUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AppSchemasTenant> =
        // patch /api/v1/workspaces/{workspace_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: WorkspaceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<TenantForUser>> =
        // get /api/v1/workspaces
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: WorkspaceDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkspaceDeleteResponse> =
        // delete /api/v1/workspaces/{workspace_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WorkspaceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val pending: PendingServiceAsync.WithRawResponse by lazy {
            PendingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val current: CurrentServiceAsync.WithRawResponse by lazy {
            CurrentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WorkspaceServiceAsync.WithRawResponse =
            WorkspaceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun pending(): PendingServiceAsync.WithRawResponse = pending

        override fun current(): CurrentServiceAsync.WithRawResponse = current

        private val createHandler: Handler<AppSchemasTenant> =
            jsonHandler<AppSchemasTenant>(clientOptions.jsonMapper)

        override fun create(
            params: WorkspaceCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AppSchemasTenant>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces")
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

        private val updateHandler: Handler<AppSchemasTenant> =
            jsonHandler<AppSchemasTenant>(clientOptions.jsonMapper)

        override fun update(
            params: WorkspaceUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AppSchemasTenant>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("workspaceId", params.workspaceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", params._pathParam(0))
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

        private val listHandler: Handler<List<TenantForUser>> =
            jsonHandler<List<TenantForUser>>(clientOptions.jsonMapper)

        override fun list(
            params: WorkspaceListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<TenantForUser>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces")
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

        private val deleteHandler: Handler<WorkspaceDeleteResponse> =
            jsonHandler<WorkspaceDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: WorkspaceDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkspaceDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("workspaceId", params.workspaceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", params._pathParam(0))
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
    }
}
