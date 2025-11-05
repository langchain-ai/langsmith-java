// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.platform.orgs.current

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
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
import com.langchain.smith.models.platform.orgs.current.accesspolicies.AccessPolicy
import com.langchain.smith.models.platform.orgs.current.accesspolicies.AccessPolicyCreateParams
import com.langchain.smith.models.platform.orgs.current.accesspolicies.AccessPolicyCreateResponse
import com.langchain.smith.models.platform.orgs.current.accesspolicies.AccessPolicyDeleteParams
import com.langchain.smith.models.platform.orgs.current.accesspolicies.AccessPolicyListParams
import com.langchain.smith.models.platform.orgs.current.accesspolicies.AccessPolicyListResponse
import com.langchain.smith.models.platform.orgs.current.accesspolicies.AccessPolicyRetrieveParams
import com.langchain.smith.services.async.platform.orgs.current.accesspolicies.RoleServiceAsync
import com.langchain.smith.services.async.platform.orgs.current.accesspolicies.RoleServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AccessPolicyServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AccessPolicyServiceAsync {

    private val withRawResponse: AccessPolicyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val roles: RoleServiceAsync by lazy { RoleServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AccessPolicyServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccessPolicyServiceAsync =
        AccessPolicyServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun roles(): RoleServiceAsync = roles

    override fun create(
        params: AccessPolicyCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccessPolicyCreateResponse> =
        // post /v1/platform/orgs/current/access-policies
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: AccessPolicyRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccessPolicy> =
        // get /v1/platform/orgs/current/access-policies/{access_policy_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AccessPolicyListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccessPolicyListResponse> =
        // get /v1/platform/orgs/current/access-policies
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AccessPolicyDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v1/platform/orgs/current/access-policies/{access_policy_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccessPolicyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val roles: RoleServiceAsync.WithRawResponse by lazy {
            RoleServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccessPolicyServiceAsync.WithRawResponse =
            AccessPolicyServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun roles(): RoleServiceAsync.WithRawResponse = roles

        private val createHandler: Handler<AccessPolicyCreateResponse> =
            jsonHandler<AccessPolicyCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AccessPolicyCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccessPolicyCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "platform", "orgs", "current", "access-policies")
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

        private val retrieveHandler: Handler<AccessPolicy> =
            jsonHandler<AccessPolicy>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AccessPolicyRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccessPolicy>> {
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

        private val listHandler: Handler<AccessPolicyListResponse> =
            jsonHandler<AccessPolicyListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AccessPolicyListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccessPolicyListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "platform", "orgs", "current", "access-policies")
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
            params: AccessPolicyDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
