// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.bulkexports

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
import com.langchain.smith.models.bulkexports.destinations.BulkExportDestination
import com.langchain.smith.models.bulkexports.destinations.DestinationCreateParams
import com.langchain.smith.models.bulkexports.destinations.DestinationListParams
import com.langchain.smith.models.bulkexports.destinations.DestinationRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DestinationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DestinationServiceAsync {

    private val withRawResponse: DestinationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DestinationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DestinationServiceAsync =
        DestinationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: DestinationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BulkExportDestination> =
        // post /api/v1/bulk-exports/destinations
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: DestinationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BulkExportDestination> =
        // get /api/v1/bulk-exports/destinations/{destination_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: DestinationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<BulkExportDestination>> =
        // get /api/v1/bulk-exports/destinations
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DestinationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DestinationServiceAsync.WithRawResponse =
            DestinationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<BulkExportDestination> =
            jsonHandler<BulkExportDestination>(clientOptions.jsonMapper)

        override fun create(
            params: DestinationCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BulkExportDestination>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bulk-exports", "destinations")
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

        private val retrieveHandler: Handler<BulkExportDestination> =
            jsonHandler<BulkExportDestination>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DestinationRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BulkExportDestination>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("destinationId", params.destinationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "bulk-exports",
                        "destinations",
                        params._pathParam(0),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<List<BulkExportDestination>> =
            jsonHandler<List<BulkExportDestination>>(clientOptions.jsonMapper)

        override fun list(
            params: DestinationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<BulkExportDestination>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bulk-exports", "destinations")
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
