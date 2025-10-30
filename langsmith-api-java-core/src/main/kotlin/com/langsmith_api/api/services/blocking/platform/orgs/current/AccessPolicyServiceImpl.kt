// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.platform.orgs.current

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
import com.langsmith_api.api.core.prepare
import com.langsmith_api.api.models.platform.orgs.current.accesspolicies.AccessPolicy
import com.langsmith_api.api.models.platform.orgs.current.accesspolicies.AccessPolicyCreateParams
import com.langsmith_api.api.models.platform.orgs.current.accesspolicies.AccessPolicyCreateResponse
import com.langsmith_api.api.models.platform.orgs.current.accesspolicies.AccessPolicyDeleteParams
import com.langsmith_api.api.models.platform.orgs.current.accesspolicies.AccessPolicyListParams
import com.langsmith_api.api.models.platform.orgs.current.accesspolicies.AccessPolicyListResponse
import com.langsmith_api.api.models.platform.orgs.current.accesspolicies.AccessPolicyRetrieveParams
import com.langsmith_api.api.services.blocking.platform.orgs.current.accesspolicies.RoleService
import com.langsmith_api.api.services.blocking.platform.orgs.current.accesspolicies.RoleServiceImpl
import java.util.function.Consumer

class AccessPolicyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AccessPolicyService {

    private val withRawResponse: AccessPolicyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val roles: RoleService by lazy { RoleServiceImpl(clientOptions) }

    override fun withRawResponse(): AccessPolicyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccessPolicyService =
        AccessPolicyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun roles(): RoleService = roles

    override fun create(
        params: AccessPolicyCreateParams,
        requestOptions: RequestOptions,
    ): AccessPolicyCreateResponse =
        // post /v1/platform/orgs/current/access-policies
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AccessPolicyRetrieveParams,
        requestOptions: RequestOptions,
    ): AccessPolicy =
        // get /v1/platform/orgs/current/access-policies/{access_policy_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: AccessPolicyListParams,
        requestOptions: RequestOptions,
    ): AccessPolicyListResponse =
        // get /v1/platform/orgs/current/access-policies
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: AccessPolicyDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/platform/orgs/current/access-policies/{access_policy_id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccessPolicyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val roles: RoleService.WithRawResponse by lazy {
            RoleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccessPolicyService.WithRawResponse =
            AccessPolicyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun roles(): RoleService.WithRawResponse = roles

        private val createHandler: Handler<AccessPolicyCreateResponse> =
            jsonHandler<AccessPolicyCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AccessPolicyCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccessPolicyCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "platform", "orgs", "current", "access-policies")
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

        private val retrieveHandler: Handler<AccessPolicy> =
            jsonHandler<AccessPolicy>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AccessPolicyRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccessPolicy> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "platform",
                        "orgs",
                        "current",
                        "access-policies",
                        params._pathParam(0),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<AccessPolicyListResponse> =
            jsonHandler<AccessPolicyListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AccessPolicyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccessPolicyListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "platform", "orgs", "current", "access-policies")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: AccessPolicyDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "platform",
                        "orgs",
                        "current",
                        "access-policies",
                        params._pathParam(0),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
