// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.orgs.current

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
import com.langchain.smith.models.orgs.current.roles.Role
import com.langchain.smith.models.orgs.current.roles.RoleCreateParams
import com.langchain.smith.models.orgs.current.roles.RoleDeleteParams
import com.langchain.smith.models.orgs.current.roles.RoleListParams
import com.langchain.smith.models.orgs.current.roles.RoleUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RoleServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RoleServiceAsync {

    private val withRawResponse: RoleServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RoleServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoleServiceAsync =
        RoleServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: RoleCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Role> =
        // post /api/v1/orgs/current/roles
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: RoleUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Role> =
        // patch /api/v1/orgs/current/roles/{role_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: RoleListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<Role>> =
        // get /api/v1/orgs/current/roles
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: RoleDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Role> =
        // delete /api/v1/orgs/current/roles/{role_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RoleServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RoleServiceAsync.WithRawResponse =
            RoleServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Role> = jsonHandler<Role>(clientOptions.jsonMapper)

        override fun create(
            params: RoleCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Role>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "roles")
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

        private val updateHandler: Handler<Role> = jsonHandler<Role>(clientOptions.jsonMapper)

        override fun update(
            params: RoleUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Role>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("roleId", params.roleId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "roles", params._pathParam(0))
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

        private val listHandler: Handler<List<Role>> =
            jsonHandler<List<Role>>(clientOptions.jsonMapper)

        override fun list(
            params: RoleListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<Role>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "roles")
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

        private val deleteHandler: Handler<Role> = jsonHandler<Role>(clientOptions.jsonMapper)

        override fun delete(
            params: RoleDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Role>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("roleId", params.roleId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "roles", params._pathParam(0))
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
