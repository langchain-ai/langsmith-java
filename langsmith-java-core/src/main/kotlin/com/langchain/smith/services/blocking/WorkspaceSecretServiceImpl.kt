// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.checkRequired
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
import com.langchain.smith.core.prepare
import com.langchain.smith.models.workspacesecrets.WorkspaceSecret
import com.langchain.smith.models.workspacesecrets.WorkspaceSecretDeleteParams
import com.langchain.smith.models.workspacesecrets.WorkspaceSecretListParams
import com.langchain.smith.models.workspacesecrets.WorkspaceSecretUpsertParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WorkspaceSecretServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WorkspaceSecretService {

    private val withRawResponse: WorkspaceSecretService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WorkspaceSecretService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkspaceSecretService =
        WorkspaceSecretServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: WorkspaceSecretListParams,
        requestOptions: RequestOptions,
    ): List<WorkspaceSecret> =
        // get /api/v1/workspaces/current/secrets
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: WorkspaceSecretDeleteParams, requestOptions: RequestOptions) {
        // delete /api/v1/workspaces/current/secrets/{key}
        withRawResponse().delete(params, requestOptions)
    }

    override fun upsert(
        params: WorkspaceSecretUpsertParams,
        requestOptions: RequestOptions,
    ): WorkspaceSecret =
        // put /api/v1/workspaces/current/secrets/{key}
        withRawResponse().upsert(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WorkspaceSecretService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WorkspaceSecretService.WithRawResponse =
            WorkspaceSecretServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<List<WorkspaceSecret>> =
            jsonHandler<List<WorkspaceSecret>>(clientOptions.jsonMapper)

        override fun list(
            params: WorkspaceSecretListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<WorkspaceSecret>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "secrets")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: WorkspaceSecretDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("key", params.key().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "workspaces",
                        "current",
                        "secrets",
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

        private val upsertHandler: Handler<WorkspaceSecret> =
            jsonHandler<WorkspaceSecret>(clientOptions.jsonMapper)

        override fun upsert(
            params: WorkspaceSecretUpsertParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WorkspaceSecret> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("key", params.key().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "workspaces",
                        "current",
                        "secrets",
                        params._pathParam(0),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { upsertHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
