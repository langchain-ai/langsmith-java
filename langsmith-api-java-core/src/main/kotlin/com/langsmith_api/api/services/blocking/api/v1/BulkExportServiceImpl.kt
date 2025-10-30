// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

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
import com.langsmith_api.api.models.api.v1.bulkexports.BulkExport
import com.langsmith_api.api.models.api.v1.bulkexports.BulkExportBulkExportsParams
import com.langsmith_api.api.models.api.v1.bulkexports.BulkExportRetrieveBulkExportsParams
import com.langsmith_api.api.models.api.v1.bulkexports.BulkExportRetrieveParams
import com.langsmith_api.api.models.api.v1.bulkexports.BulkExportUpdateParams
import com.langsmith_api.api.services.blocking.api.v1.bulkexports.DestinationService
import com.langsmith_api.api.services.blocking.api.v1.bulkexports.DestinationServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.bulkexports.RunService
import com.langsmith_api.api.services.blocking.api.v1.bulkexports.RunServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BulkExportServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BulkExportService {

    private val withRawResponse: BulkExportService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val destinations: DestinationService by lazy { DestinationServiceImpl(clientOptions) }

    private val runs: RunService by lazy { RunServiceImpl(clientOptions) }

    override fun withRawResponse(): BulkExportService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BulkExportService =
        BulkExportServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun destinations(): DestinationService = destinations

    override fun runs(): RunService = runs

    override fun retrieve(
        params: BulkExportRetrieveParams,
        requestOptions: RequestOptions,
    ): BulkExport =
        // get /api/v1/bulk-exports/{bulk_export_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: BulkExportUpdateParams,
        requestOptions: RequestOptions,
    ): BulkExport =
        // patch /api/v1/bulk-exports/{bulk_export_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun bulkExports(
        params: BulkExportBulkExportsParams,
        requestOptions: RequestOptions,
    ): BulkExport =
        // post /api/v1/bulk-exports
        withRawResponse().bulkExports(params, requestOptions).parse()

    override fun retrieveBulkExports(
        params: BulkExportRetrieveBulkExportsParams,
        requestOptions: RequestOptions,
    ): List<BulkExport> =
        // get /api/v1/bulk-exports
        withRawResponse().retrieveBulkExports(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BulkExportService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val destinations: DestinationService.WithRawResponse by lazy {
            DestinationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val runs: RunService.WithRawResponse by lazy {
            RunServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BulkExportService.WithRawResponse =
            BulkExportServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun destinations(): DestinationService.WithRawResponse = destinations

        override fun runs(): RunService.WithRawResponse = runs

        private val retrieveHandler: Handler<BulkExport> =
            jsonHandler<BulkExport>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BulkExportRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BulkExport> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("bulkExportId", params.bulkExportId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bulk-exports", params._pathParam(0))
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

        private val updateHandler: Handler<BulkExport> =
            jsonHandler<BulkExport>(clientOptions.jsonMapper)

        override fun update(
            params: BulkExportUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BulkExport> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("bulkExportId", params.bulkExportId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bulk-exports", params._pathParam(0))
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

        private val bulkExportsHandler: Handler<BulkExport> =
            jsonHandler<BulkExport>(clientOptions.jsonMapper)

        override fun bulkExports(
            params: BulkExportBulkExportsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BulkExport> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bulk-exports")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { bulkExportsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveBulkExportsHandler: Handler<List<BulkExport>> =
            jsonHandler<List<BulkExport>>(clientOptions.jsonMapper)

        override fun retrieveBulkExports(
            params: BulkExportRetrieveBulkExportsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<BulkExport>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bulk-exports")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveBulkExportsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
