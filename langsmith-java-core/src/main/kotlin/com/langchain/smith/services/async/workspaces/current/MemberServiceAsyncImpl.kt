// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.workspaces.current

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
import com.langchain.smith.models.workspaces.current.members.MemberBatchParams
import com.langchain.smith.models.workspaces.current.members.MemberBatchResponse
import com.langchain.smith.models.workspaces.current.members.MemberCreateParams
import com.langchain.smith.models.workspaces.current.members.MemberCreateResponse
import com.langchain.smith.models.workspaces.current.members.MemberDeleteParams
import com.langchain.smith.models.workspaces.current.members.MemberDeleteResponse
import com.langchain.smith.models.workspaces.current.members.MemberIdentity
import com.langchain.smith.models.workspaces.current.members.MemberListParams
import com.langchain.smith.models.workspaces.current.members.MemberListResponse
import com.langchain.smith.models.workspaces.current.members.MemberRetrieveActiveParams
import com.langchain.smith.models.workspaces.current.members.MemberUpdateParams
import com.langchain.smith.models.workspaces.current.members.MemberUpdateResponse
import com.langchain.smith.services.async.workspaces.current.members.PendingServiceAsync
import com.langchain.smith.services.async.workspaces.current.members.PendingServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MemberServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MemberServiceAsync {

    private val withRawResponse: MemberServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val pending: PendingServiceAsync by lazy { PendingServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): MemberServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemberServiceAsync =
        MemberServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun pending(): PendingServiceAsync = pending

    override fun create(
        params: MemberCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MemberCreateResponse> =
        // post /api/v1/workspaces/current/members
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: MemberUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MemberUpdateResponse> =
        // patch /api/v1/workspaces/current/members/{identity_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: MemberListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MemberListResponse> =
        // get /api/v1/workspaces/current/members
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: MemberDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MemberDeleteResponse> =
        // delete /api/v1/workspaces/current/members/{identity_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun batch(
        params: MemberBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<MemberBatchResponse>> =
        // post /api/v1/workspaces/current/members/batch
        withRawResponse().batch(params, requestOptions).thenApply { it.parse() }

    override fun retrieveActive(
        params: MemberRetrieveActiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<MemberIdentity>> =
        // get /api/v1/workspaces/current/members/active
        withRawResponse().retrieveActive(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MemberServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val pending: PendingServiceAsync.WithRawResponse by lazy {
            PendingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MemberServiceAsync.WithRawResponse =
            MemberServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun pending(): PendingServiceAsync.WithRawResponse = pending

        private val createHandler: Handler<MemberCreateResponse> =
            jsonHandler<MemberCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: MemberCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MemberCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "members")
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

        private val updateHandler: Handler<MemberUpdateResponse> =
            jsonHandler<MemberUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: MemberUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MemberUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("identityId", params.identityId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "workspaces",
                        "current",
                        "members",
                        params._pathParam(0),
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

        private val listHandler: Handler<MemberListResponse> =
            jsonHandler<MemberListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MemberListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MemberListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "members")
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

        private val deleteHandler: Handler<MemberDeleteResponse> =
            jsonHandler<MemberDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: MemberDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MemberDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("identityId", params.identityId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "workspaces",
                        "current",
                        "members",
                        params._pathParam(0),
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
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val batchHandler: Handler<List<MemberBatchResponse>> =
            jsonHandler<List<MemberBatchResponse>>(clientOptions.jsonMapper)

        override fun batch(
            params: MemberBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<MemberBatchResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "members", "batch")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { batchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val retrieveActiveHandler: Handler<List<MemberIdentity>> =
            jsonHandler<List<MemberIdentity>>(clientOptions.jsonMapper)

        override fun retrieveActive(
            params: MemberRetrieveActiveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<MemberIdentity>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "members", "active")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveActiveHandler.handle(it) }
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
