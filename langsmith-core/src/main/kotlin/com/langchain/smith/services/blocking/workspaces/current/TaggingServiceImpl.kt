// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.workspaces.current

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
import com.langchain.smith.models.workspaces.current.taggings.Tagging
import com.langchain.smith.models.workspaces.current.taggings.TaggingCreateParams
import com.langchain.smith.models.workspaces.current.taggings.TaggingDeleteParams
import com.langchain.smith.models.workspaces.current.taggings.TaggingDeleteResponse
import com.langchain.smith.models.workspaces.current.taggings.TaggingListParams
import com.langchain.smith.models.workspaces.current.taggings.TaggingListResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TaggingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TaggingService {

    private val withRawResponse: TaggingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TaggingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaggingService =
        TaggingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: TaggingCreateParams, requestOptions: RequestOptions): Tagging =
        // post /api/v1/workspaces/current/taggings
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: TaggingListParams,
        requestOptions: RequestOptions,
    ): List<TaggingListResponse> =
        // get /api/v1/workspaces/current/taggings
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: TaggingDeleteParams,
        requestOptions: RequestOptions,
    ): TaggingDeleteResponse =
        // delete /api/v1/workspaces/current/taggings/{tagging_id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TaggingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TaggingService.WithRawResponse =
            TaggingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Tagging> = jsonHandler<Tagging>(clientOptions.jsonMapper)

        override fun create(
            params: TaggingCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Tagging> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "taggings")
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

        private val listHandler: Handler<List<TaggingListResponse>> =
            jsonHandler<List<TaggingListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: TaggingListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<TaggingListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "taggings")
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

        private val deleteHandler: Handler<TaggingDeleteResponse> =
            jsonHandler<TaggingDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: TaggingDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TaggingDeleteResponse> {
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
