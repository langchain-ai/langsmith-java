// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sandboxes

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
import com.langchain.smith.models.sandboxes.volumes.VolumeCloneParams
import com.langchain.smith.models.sandboxes.volumes.VolumeCreateParams
import com.langchain.smith.models.sandboxes.volumes.VolumeDeleteParams
import com.langchain.smith.models.sandboxes.volumes.VolumeListPage
import com.langchain.smith.models.sandboxes.volumes.VolumeListPageResponse
import com.langchain.smith.models.sandboxes.volumes.VolumeListParams
import com.langchain.smith.models.sandboxes.volumes.VolumeResponse
import com.langchain.smith.models.sandboxes.volumes.VolumeRetrieveParams
import com.langchain.smith.models.sandboxes.volumes.VolumeUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class VolumeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    VolumeService {

    private val withRawResponse: VolumeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VolumeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VolumeService =
        VolumeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: VolumeCreateParams,
        requestOptions: RequestOptions,
    ): VolumeResponse =
        // post /api/v2/sandboxes/volumes
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: VolumeRetrieveParams,
        requestOptions: RequestOptions,
    ): VolumeResponse =
        // get /api/v2/sandboxes/volumes/{volume}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: VolumeUpdateParams,
        requestOptions: RequestOptions,
    ): VolumeResponse =
        // patch /api/v2/sandboxes/volumes/{volume}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: VolumeListParams, requestOptions: RequestOptions): VolumeListPage =
        // get /api/v2/sandboxes/volumes
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: VolumeDeleteParams, requestOptions: RequestOptions) {
        // delete /api/v2/sandboxes/volumes/{volume}
        withRawResponse().delete(params, requestOptions)
    }

    override fun clone(params: VolumeCloneParams, requestOptions: RequestOptions): VolumeResponse =
        // post /api/v2/sandboxes/volumes/{volume}/clone
        withRawResponse().clone(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VolumeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VolumeService.WithRawResponse =
            VolumeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<VolumeResponse> =
            jsonHandler<VolumeResponse>(clientOptions.jsonMapper)

        override fun create(
            params: VolumeCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VolumeResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "sandboxes", "volumes")
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

        private val retrieveHandler: Handler<VolumeResponse> =
            jsonHandler<VolumeResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: VolumeRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VolumeResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("volume", params.volume().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "sandboxes", "volumes", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<VolumeResponse> =
            jsonHandler<VolumeResponse>(clientOptions.jsonMapper)

        override fun update(
            params: VolumeUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VolumeResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("volume", params.volume().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "sandboxes", "volumes", params._pathParam(0))
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

        private val listHandler: Handler<VolumeListPageResponse> =
            jsonHandler<VolumeListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: VolumeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VolumeListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "sandboxes", "volumes")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        VolumeListPage.builder()
                            .service(VolumeServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: VolumeDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("volume", params.volume().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "sandboxes", "volumes", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val cloneHandler: Handler<VolumeResponse> =
            jsonHandler<VolumeResponse>(clientOptions.jsonMapper)

        override fun clone(
            params: VolumeCloneParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VolumeResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("volume", params.volume().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v2",
                        "sandboxes",
                        "volumes",
                        params._pathParam(0),
                        "clone",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cloneHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
