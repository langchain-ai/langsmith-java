// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

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
import com.langsmith_api.api.models.api.v1.tenants.AppSchemasTenant
import com.langsmith_api.api.models.api.v1.tenants.TenantForUser
import com.langsmith_api.api.models.api.v1.workspaces.WorkspaceCreateParams
import com.langsmith_api.api.models.api.v1.workspaces.WorkspaceDeleteParams
import com.langsmith_api.api.models.api.v1.workspaces.WorkspaceDeleteResponse
import com.langsmith_api.api.models.api.v1.workspaces.WorkspaceListParams
import com.langsmith_api.api.models.api.v1.workspaces.WorkspaceUpdateParams
import com.langsmith_api.api.services.blocking.api.v1.workspaces.CurrentService
import com.langsmith_api.api.services.blocking.api.v1.workspaces.CurrentServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.workspaces.PendingService
import com.langsmith_api.api.services.blocking.api.v1.workspaces.PendingServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WorkspaceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WorkspaceService {

    private val withRawResponse: WorkspaceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val pending: PendingService by lazy { PendingServiceImpl(clientOptions) }

    private val current: CurrentService by lazy { CurrentServiceImpl(clientOptions) }

    override fun withRawResponse(): WorkspaceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkspaceService =
        WorkspaceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun pending(): PendingService = pending

    override fun current(): CurrentService = current

    override fun create(
        params: WorkspaceCreateParams,
        requestOptions: RequestOptions,
    ): AppSchemasTenant =
        // post /api/v1/workspaces
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: WorkspaceUpdateParams,
        requestOptions: RequestOptions,
    ): AppSchemasTenant =
        // patch /api/v1/workspaces/{workspace_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: WorkspaceListParams,
        requestOptions: RequestOptions,
    ): List<TenantForUser> =
        // get /api/v1/workspaces
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: WorkspaceDeleteParams,
        requestOptions: RequestOptions,
    ): WorkspaceDeleteResponse =
        // delete /api/v1/workspaces/{workspace_id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WorkspaceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val pending: PendingService.WithRawResponse by lazy {
            PendingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val current: CurrentService.WithRawResponse by lazy {
            CurrentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WorkspaceService.WithRawResponse =
            WorkspaceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun pending(): PendingService.WithRawResponse = pending

        override fun current(): CurrentService.WithRawResponse = current

        private val createHandler: Handler<AppSchemasTenant> =
            jsonHandler<AppSchemasTenant>(clientOptions.jsonMapper)

        override fun create(
            params: WorkspaceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AppSchemasTenant> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces")
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

        private val updateHandler: Handler<AppSchemasTenant> =
            jsonHandler<AppSchemasTenant>(clientOptions.jsonMapper)

        override fun update(
            params: WorkspaceUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AppSchemasTenant> {
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

        private val listHandler: Handler<List<TenantForUser>> =
            jsonHandler<List<TenantForUser>>(clientOptions.jsonMapper)

        override fun list(
            params: WorkspaceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<TenantForUser>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces")
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

        private val deleteHandler: Handler<WorkspaceDeleteResponse> =
            jsonHandler<WorkspaceDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: WorkspaceDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WorkspaceDeleteResponse> {
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
