// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.workspaces.current

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
import com.langchain.smith.core.http.json
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.prepare
import com.langchain.smith.models.workspaces.current.tags.TagListParams
import com.langchain.smith.models.workspaces.current.tags.TagListResponse
import com.langchain.smith.models.workspaces.current.tags.TagResourcesParams
import com.langchain.smith.models.workspaces.current.tags.TagResourcesResponse
import com.langchain.smith.models.workspaces.current.tags.TagRetrieveResourceParams
import com.langchain.smith.models.workspaces.current.tags.TagRetrieveResourceResponse
import java.util.function.Consumer

class TagServiceImpl internal constructor(private val clientOptions: ClientOptions) : TagService {

    private val withRawResponse: TagService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TagService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagService =
        TagServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: TagListParams,
        requestOptions: RequestOptions,
    ): List<TagListResponse> =
        // get /api/v1/workspaces/current/tags
        withRawResponse().list(params, requestOptions).parse()

    override fun resources(
        params: TagResourcesParams,
        requestOptions: RequestOptions,
    ): TagResourcesResponse =
        // post /api/v1/workspaces/current/tags/resources
        withRawResponse().resources(params, requestOptions).parse()

    override fun retrieveResource(
        params: TagRetrieveResourceParams,
        requestOptions: RequestOptions,
    ): List<TagRetrieveResourceResponse> =
        // get /api/v1/workspaces/current/tags/resource
        withRawResponse().retrieveResource(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TagService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TagService.WithRawResponse =
            TagServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<List<TagListResponse>> =
            jsonHandler<List<TagListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: TagListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<TagListResponse>> {
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

        private val resourcesHandler: Handler<TagResourcesResponse> =
            jsonHandler<TagResourcesResponse>(clientOptions.jsonMapper)

        override fun resources(
            params: TagResourcesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TagResourcesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "tags", "resources")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { resourcesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveResourceHandler: Handler<List<TagRetrieveResourceResponse>> =
            jsonHandler<List<TagRetrieveResourceResponse>>(clientOptions.jsonMapper)

        override fun retrieveResource(
            params: TagRetrieveResourceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<TagRetrieveResourceResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "tags", "resource")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveResourceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
