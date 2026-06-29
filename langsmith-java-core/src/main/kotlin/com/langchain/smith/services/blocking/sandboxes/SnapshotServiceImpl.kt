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
import com.langchain.smith.models.sandboxes.SnapshotListResponse
import com.langchain.smith.models.sandboxes.SnapshotResponse
import com.langchain.smith.models.sandboxes.snapshots.SnapshotCreateParams
import com.langchain.smith.models.sandboxes.snapshots.SnapshotDeleteParams
import com.langchain.smith.models.sandboxes.snapshots.SnapshotListParams
import com.langchain.smith.models.sandboxes.snapshots.SnapshotRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SnapshotServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SnapshotService {

    private val withRawResponse: SnapshotService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SnapshotService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SnapshotService =
        SnapshotServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SnapshotCreateParams,
        requestOptions: RequestOptions,
    ): SnapshotResponse =
        // post /v2/sandboxes/snapshots
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: SnapshotRetrieveParams,
        requestOptions: RequestOptions,
    ): SnapshotResponse =
        // get /v2/sandboxes/snapshots/{snapshot_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: SnapshotListParams,
        requestOptions: RequestOptions,
    ): SnapshotListResponse =
        // get /v2/sandboxes/snapshots
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: SnapshotDeleteParams, requestOptions: RequestOptions) {
        // delete /v2/sandboxes/snapshots/{snapshot_id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SnapshotService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SnapshotService.WithRawResponse =
            SnapshotServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SnapshotResponse> =
            jsonHandler<SnapshotResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SnapshotCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SnapshotResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "sandboxes", "snapshots")
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

        private val retrieveHandler: Handler<SnapshotResponse> =
            jsonHandler<SnapshotResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SnapshotRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SnapshotResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("snapshotId", params.snapshotId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "sandboxes", "snapshots", params._pathParam(0))
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

        private val listHandler: Handler<SnapshotListResponse> =
            jsonHandler<SnapshotListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SnapshotListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SnapshotListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "sandboxes", "snapshots")
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
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: SnapshotDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("snapshotId", params.snapshotId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "sandboxes", "snapshots", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
