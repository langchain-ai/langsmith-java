// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.workspaces.current

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
import com.langchain.smith.models.workspaces.current.taggings.Tagging
import com.langchain.smith.models.workspaces.current.taggings.TaggingCreateParams
import com.langchain.smith.models.workspaces.current.taggings.TaggingDeleteParams
import com.langchain.smith.models.workspaces.current.taggings.TaggingDeleteResponse
import com.langchain.smith.models.workspaces.current.taggings.TaggingListParams
import com.langchain.smith.models.workspaces.current.taggings.TaggingListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TaggingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TaggingServiceAsync {

    private val withRawResponse: TaggingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TaggingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaggingServiceAsync =
        TaggingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TaggingCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Tagging> =
        // post /api/v1/workspaces/current/taggings
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: TaggingListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<TaggingListResponse>> =
        // get /api/v1/workspaces/current/taggings
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: TaggingDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TaggingDeleteResponse> =
        // delete /api/v1/workspaces/current/taggings/{tagging_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TaggingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TaggingServiceAsync.WithRawResponse =
            TaggingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Tagging> = jsonHandler<Tagging>(clientOptions.jsonMapper)

        override fun create(
            params: TaggingCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Tagging>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "taggings")
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

        private val listHandler: Handler<List<TaggingListResponse>> =
            jsonHandler<List<TaggingListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: TaggingListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<TaggingListResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "taggings")
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

        private val deleteHandler: Handler<TaggingDeleteResponse> =
            jsonHandler<TaggingDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: TaggingDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TaggingDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("taggingId", params.taggingId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "workspaces",
                        "current",
                        "taggings",
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
    }
}
