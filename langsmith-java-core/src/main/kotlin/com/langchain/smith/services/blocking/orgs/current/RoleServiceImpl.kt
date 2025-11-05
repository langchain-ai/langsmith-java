// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.orgs.current

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
import com.langchain.smith.core.prepare
import com.langchain.smith.models.orgs.current.roles.Role
import com.langchain.smith.models.orgs.current.roles.RoleCreateParams
import com.langchain.smith.models.orgs.current.roles.RoleDeleteParams
import com.langchain.smith.models.orgs.current.roles.RoleListParams
import com.langchain.smith.models.orgs.current.roles.RoleUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RoleServiceImpl internal constructor(private val clientOptions: ClientOptions) : RoleService {

    private val withRawResponse: RoleService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RoleService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoleService =
        RoleServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: RoleCreateParams, requestOptions: RequestOptions): Role =
        // post /api/v1/orgs/current/roles
        withRawResponse().create(params, requestOptions).parse()

    override fun update(params: RoleUpdateParams, requestOptions: RequestOptions): Role =
        // patch /api/v1/orgs/current/roles/{role_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: RoleListParams, requestOptions: RequestOptions): List<Role> =
        // get /api/v1/orgs/current/roles
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: RoleDeleteParams, requestOptions: RequestOptions): Role =
        // delete /api/v1/orgs/current/roles/{role_id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RoleService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RoleService.WithRawResponse =
            RoleServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Role> = jsonHandler<Role>(clientOptions.jsonMapper)

        override fun create(
            params: RoleCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Role> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "roles")
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

        private val updateHandler: Handler<Role> = jsonHandler<Role>(clientOptions.jsonMapper)

        override fun update(
            params: RoleUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Role> {
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

        private val listHandler: Handler<List<Role>> =
            jsonHandler<List<Role>>(clientOptions.jsonMapper)

        override fun list(
            params: RoleListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Role>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "roles")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val deleteHandler: Handler<Role> = jsonHandler<Role>(clientOptions.jsonMapper)

        override fun delete(
            params: RoleDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Role> {
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
    }
}
