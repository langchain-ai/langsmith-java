// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.bulkexports

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
import com.langsmith_api.api.models.api.v1.bulkexports.destinations.BulkExportDestination
import com.langsmith_api.api.models.api.v1.bulkexports.destinations.DestinationCreateParams
import com.langsmith_api.api.models.api.v1.bulkexports.destinations.DestinationListParams
import com.langsmith_api.api.models.api.v1.bulkexports.destinations.DestinationRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DestinationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DestinationService {

    private val withRawResponse: DestinationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DestinationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DestinationService =
        DestinationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: DestinationCreateParams,
        requestOptions: RequestOptions,
    ): BulkExportDestination =
        // post /api/v1/bulk-exports/destinations
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: DestinationRetrieveParams,
        requestOptions: RequestOptions,
    ): BulkExportDestination =
        // get /api/v1/bulk-exports/destinations/{destination_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: DestinationListParams,
        requestOptions: RequestOptions,
    ): List<BulkExportDestination> =
        // get /api/v1/bulk-exports/destinations
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DestinationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DestinationService.WithRawResponse =
            DestinationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<BulkExportDestination> =
            jsonHandler<BulkExportDestination>(clientOptions.jsonMapper)

        override fun create(
            params: DestinationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BulkExportDestination> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bulk-exports", "destinations")
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

        private val retrieveHandler: Handler<BulkExportDestination> =
            jsonHandler<BulkExportDestination>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DestinationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BulkExportDestination> {
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

        private val listHandler: Handler<List<BulkExportDestination>> =
            jsonHandler<List<BulkExportDestination>>(clientOptions.jsonMapper)

        override fun list(
            params: DestinationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<BulkExportDestination>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bulk-exports", "destinations")
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
