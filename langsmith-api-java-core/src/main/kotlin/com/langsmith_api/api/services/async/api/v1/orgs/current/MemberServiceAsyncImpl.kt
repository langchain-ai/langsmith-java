// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.orgs.current

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
import com.langsmith_api.api.models.api.v1.orgs.current.members.MemberBatchParams
import com.langsmith_api.api.models.api.v1.orgs.current.members.MemberCreateParams
import com.langsmith_api.api.models.api.v1.orgs.current.members.MemberDeleteParams
import com.langsmith_api.api.models.api.v1.orgs.current.members.MemberDeleteResponse
import com.langsmith_api.api.models.api.v1.orgs.current.members.MemberListParams
import com.langsmith_api.api.models.api.v1.orgs.current.members.MemberListResponse
import com.langsmith_api.api.models.api.v1.orgs.current.members.MemberRetrieveActiveParams
import com.langsmith_api.api.models.api.v1.orgs.current.members.MemberUpdateParams
import com.langsmith_api.api.models.api.v1.orgs.current.members.MemberUpdateResponse
import com.langsmith_api.api.models.api.v1.orgs.current.members.OrgMemberIdentity
import com.langsmith_api.api.models.api.v1.orgs.current.members.PendingIdentity
import com.langsmith_api.api.services.async.api.v1.orgs.current.members.BasicServiceAsync
import com.langsmith_api.api.services.async.api.v1.orgs.current.members.BasicServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.orgs.current.members.PendingServiceAsync
import com.langsmith_api.api.services.async.api.v1.orgs.current.members.PendingServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MemberServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MemberServiceAsync {

    private val withRawResponse: MemberServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val pending: PendingServiceAsync by lazy { PendingServiceAsyncImpl(clientOptions) }

    private val basic: BasicServiceAsync by lazy { BasicServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): MemberServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemberServiceAsync =
        MemberServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun pending(): PendingServiceAsync = pending

    override fun basic(): BasicServiceAsync = basic

    override fun create(
        params: MemberCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PendingIdentity> =
        // post /api/v1/orgs/current/members
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: MemberUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MemberUpdateResponse> =
        // patch /api/v1/orgs/current/members/{identity_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: MemberListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MemberListResponse> =
        // get /api/v1/orgs/current/members
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: MemberDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MemberDeleteResponse> =
        // delete /api/v1/orgs/current/members/{identity_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun batch(
        params: MemberBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<PendingIdentity>> =
        // post /api/v1/orgs/current/members/batch
        withRawResponse().batch(params, requestOptions).thenApply { it.parse() }

    override fun retrieveActive(
        params: MemberRetrieveActiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<OrgMemberIdentity>> =
        // get /api/v1/orgs/current/members/active
        withRawResponse().retrieveActive(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MemberServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val pending: PendingServiceAsync.WithRawResponse by lazy {
            PendingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val basic: BasicServiceAsync.WithRawResponse by lazy {
            BasicServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MemberServiceAsync.WithRawResponse =
            MemberServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun pending(): PendingServiceAsync.WithRawResponse = pending

        override fun basic(): BasicServiceAsync.WithRawResponse = basic

        private val createHandler: Handler<PendingIdentity> =
            jsonHandler<PendingIdentity>(clientOptions.jsonMapper)

        override fun create(
            params: MemberCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PendingIdentity>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "members")
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
                        "orgs",
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
                    .addPathSegments("api", "v1", "orgs", "current", "members")
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
                        "orgs",
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

        private val batchHandler: Handler<List<PendingIdentity>> =
            jsonHandler<List<PendingIdentity>>(clientOptions.jsonMapper)

        override fun batch(
            params: MemberBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<PendingIdentity>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "members", "batch")
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

        private val retrieveActiveHandler: Handler<List<OrgMemberIdentity>> =
            jsonHandler<List<OrgMemberIdentity>>(clientOptions.jsonMapper)

        override fun retrieveActive(
            params: MemberRetrieveActiveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<OrgMemberIdentity>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "members", "active")
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
