// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.workspaces.current

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
import com.langsmith_api.api.core.prepare
import com.langsmith_api.api.models.api.v1.orgs.current.members.PendingIdentity
import com.langsmith_api.api.models.api.v1.orgs.pending.Identity
import com.langsmith_api.api.models.api.v1.workspaces.current.members.MemberBatchParams
import com.langsmith_api.api.models.api.v1.workspaces.current.members.MemberCreateParams
import com.langsmith_api.api.models.api.v1.workspaces.current.members.MemberDeleteParams
import com.langsmith_api.api.models.api.v1.workspaces.current.members.MemberDeleteResponse
import com.langsmith_api.api.models.api.v1.workspaces.current.members.MemberIdentity
import com.langsmith_api.api.models.api.v1.workspaces.current.members.MemberListParams
import com.langsmith_api.api.models.api.v1.workspaces.current.members.MemberListResponse
import com.langsmith_api.api.models.api.v1.workspaces.current.members.MemberRetrieveActiveParams
import com.langsmith_api.api.models.api.v1.workspaces.current.members.MemberUpdateParams
import com.langsmith_api.api.models.api.v1.workspaces.current.members.MemberUpdateResponse
import com.langsmith_api.api.services.blocking.api.v1.workspaces.current.members.PendingService
import com.langsmith_api.api.services.blocking.api.v1.workspaces.current.members.PendingServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MemberServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MemberService {

    private val withRawResponse: MemberService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val pending: PendingService by lazy { PendingServiceImpl(clientOptions) }

    override fun withRawResponse(): MemberService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemberService =
        MemberServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun pending(): PendingService = pending

    override fun create(params: MemberCreateParams, requestOptions: RequestOptions): Identity =
        // post /api/v1/workspaces/current/members
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: MemberUpdateParams,
        requestOptions: RequestOptions,
    ): MemberUpdateResponse =
        // patch /api/v1/workspaces/current/members/{identity_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: MemberListParams,
        requestOptions: RequestOptions,
    ): MemberListResponse =
        // get /api/v1/workspaces/current/members
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: MemberDeleteParams,
        requestOptions: RequestOptions,
    ): MemberDeleteResponse =
        // delete /api/v1/workspaces/current/members/{identity_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun batch(
        params: MemberBatchParams,
        requestOptions: RequestOptions,
    ): List<PendingIdentity> =
        // post /api/v1/workspaces/current/members/batch
        withRawResponse().batch(params, requestOptions).parse()

    override fun retrieveActive(
        params: MemberRetrieveActiveParams,
        requestOptions: RequestOptions,
    ): List<MemberIdentity> =
        // get /api/v1/workspaces/current/members/active
        withRawResponse().retrieveActive(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MemberService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val pending: PendingService.WithRawResponse by lazy {
            PendingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MemberService.WithRawResponse =
            MemberServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun pending(): PendingService.WithRawResponse = pending

        private val createHandler: Handler<Identity> =
            jsonHandler<Identity>(clientOptions.jsonMapper)

        override fun create(
            params: MemberCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Identity> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "members")
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val updateHandler: Handler<MemberUpdateResponse> =
            jsonHandler<MemberUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: MemberUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MemberUpdateResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<MemberListResponse> =
            jsonHandler<MemberListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MemberListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MemberListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "members")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<MemberDeleteResponse> =
            jsonHandler<MemberDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: MemberDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MemberDeleteResponse> {
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

        private val batchHandler: Handler<List<PendingIdentity>> =
            jsonHandler<List<PendingIdentity>>(clientOptions.jsonMapper)

        override fun batch(
            params: MemberBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<PendingIdentity>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "members", "batch")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { batchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val retrieveActiveHandler: Handler<List<MemberIdentity>> =
            jsonHandler<List<MemberIdentity>>(clientOptions.jsonMapper)

        override fun retrieveActive(
            params: MemberRetrieveActiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<MemberIdentity>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "members", "active")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
