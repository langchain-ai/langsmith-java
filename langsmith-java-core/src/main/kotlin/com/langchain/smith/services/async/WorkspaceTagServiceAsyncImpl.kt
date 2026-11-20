// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

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
import com.langchain.smith.core.prepareAsync
import com.langchain.smith.models.workspacetags.TagKeyWithValues
import com.langchain.smith.models.workspacetags.WorkspaceTagListParams
import com.langchain.smith.services.async.workspacetags.KeyServiceAsync
import com.langchain.smith.services.async.workspacetags.KeyServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class WorkspaceTagServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WorkspaceTagServiceAsync {

    private val withRawResponse: WorkspaceTagServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val keys: KeyServiceAsync by lazy { KeyServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): WorkspaceTagServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkspaceTagServiceAsync =
        WorkspaceTagServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun keys(): KeyServiceAsync = keys

    override fun list(
        params: WorkspaceTagListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<TagKeyWithValues>> =
        // get /api/v1/workspaces/current/tags
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WorkspaceTagServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val keys: KeyServiceAsync.WithRawResponse by lazy {
            KeyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WorkspaceTagServiceAsync.WithRawResponse =
            WorkspaceTagServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun keys(): KeyServiceAsync.WithRawResponse = keys

        private val listHandler: Handler<List<TagKeyWithValues>> =
            jsonHandler<List<TagKeyWithValues>>(clientOptions.jsonMapper)

        override fun list(
            params: WorkspaceTagListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<TagKeyWithValues>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "tags")
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
    }
}
