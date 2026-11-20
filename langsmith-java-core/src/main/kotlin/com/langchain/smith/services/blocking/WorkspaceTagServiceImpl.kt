// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.handlers.errorBodyHandler
import com.langchain.smith.core.handlers.errorHandler
import com.langchain.smith.core.handlers.jsonHandler
import com.langchain.smith.core.http.HttpMethod
import com.langchain.smith.core.http.HttpRequest
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponse.Handler
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.prepare
import com.langchain.smith.models.workspacetags.TagKeyWithValues
import com.langchain.smith.models.workspacetags.WorkspaceTagListParams
import com.langchain.smith.services.blocking.workspacetags.KeyService
import com.langchain.smith.services.blocking.workspacetags.KeyServiceImpl
import java.util.function.Consumer

class WorkspaceTagServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WorkspaceTagService {

    private val withRawResponse: WorkspaceTagService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val keys: KeyService by lazy { KeyServiceImpl(clientOptions) }

    override fun withRawResponse(): WorkspaceTagService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkspaceTagService =
        WorkspaceTagServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun keys(): KeyService = keys

    override fun list(
        params: WorkspaceTagListParams,
        requestOptions: RequestOptions,
    ): List<TagKeyWithValues> =
        // get /api/v1/workspaces/current/tags
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WorkspaceTagService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val keys: KeyService.WithRawResponse by lazy {
            KeyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WorkspaceTagService.WithRawResponse =
            WorkspaceTagServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun keys(): KeyService.WithRawResponse = keys

        private val listHandler: Handler<List<TagKeyWithValues>> =
            jsonHandler<List<TagKeyWithValues>>(clientOptions.jsonMapper)

        override fun list(
            params: WorkspaceTagListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<TagKeyWithValues>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "tags")
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
    }
}
