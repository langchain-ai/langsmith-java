// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

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
import com.langchain.smith.models.bulkexports.BulkExport
import com.langchain.smith.models.bulkexports.BulkExportBulkExportsParams
import com.langchain.smith.models.bulkexports.BulkExportRetrieveBulkExportsParams
import com.langchain.smith.models.bulkexports.BulkExportRetrieveParams
import com.langchain.smith.models.bulkexports.BulkExportUpdateParams
import com.langchain.smith.services.blocking.bulkexports.DestinationService
import com.langchain.smith.services.blocking.bulkexports.DestinationServiceImpl
import com.langchain.smith.services.blocking.bulkexports.RunService
import com.langchain.smith.services.blocking.bulkexports.RunServiceImpl
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
