// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

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
import com.langsmith_api.api.core.prepareAsync
import com.langsmith_api.api.models.api.v1.bulkexports.BulkExport
import com.langsmith_api.api.models.api.v1.bulkexports.BulkExportBulkExportsParams
import com.langsmith_api.api.models.api.v1.bulkexports.BulkExportRetrieveBulkExportsParams
import com.langsmith_api.api.models.api.v1.bulkexports.BulkExportRetrieveParams
import com.langsmith_api.api.models.api.v1.bulkexports.BulkExportUpdateParams
import com.langsmith_api.api.services.async.api.v1.bulkexports.DestinationServiceAsync
import com.langsmith_api.api.services.async.api.v1.bulkexports.DestinationServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.bulkexports.RunServiceAsync
import com.langsmith_api.api.services.async.api.v1.bulkexports.RunServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BulkExportServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BulkExportServiceAsync {

    private val withRawResponse: BulkExportServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val destinations: DestinationServiceAsync by lazy {
        DestinationServiceAsyncImpl(clientOptions)
    }

    private val runs: RunServiceAsync by lazy { RunServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): BulkExportServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BulkExportServiceAsync =
        BulkExportServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun destinations(): DestinationServiceAsync = destinations

    override fun runs(): RunServiceAsync = runs

    override fun retrieve(
        params: BulkExportRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BulkExport> =
        // get /api/v1/bulk-exports/{bulk_export_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: BulkExportUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BulkExport> =
        // patch /api/v1/bulk-exports/{bulk_export_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun bulkExports(
        params: BulkExportBulkExportsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BulkExport> =
        // post /api/v1/bulk-exports
        withRawResponse().bulkExports(params, requestOptions).thenApply { it.parse() }

    override fun retrieveBulkExports(
        params: BulkExportRetrieveBulkExportsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<BulkExport>> =
        // get /api/v1/bulk-exports
        withRawResponse().retrieveBulkExports(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BulkExportServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val destinations: DestinationServiceAsync.WithRawResponse by lazy {
            DestinationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val runs: RunServiceAsync.WithRawResponse by lazy {
            RunServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BulkExportServiceAsync.WithRawResponse =
            BulkExportServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun destinations(): DestinationServiceAsync.WithRawResponse = destinations

        override fun runs(): RunServiceAsync.WithRawResponse = runs

        private val retrieveHandler: Handler<BulkExport> =
            jsonHandler<BulkExport>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BulkExportRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BulkExport>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("bulkExportId", params.bulkExportId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bulk-exports", params._pathParam(0))
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

        private val updateHandler: Handler<BulkExport> =
            jsonHandler<BulkExport>(clientOptions.jsonMapper)

        override fun update(
            params: BulkExportUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BulkExport>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val bulkExportsHandler: Handler<BulkExport> =
            jsonHandler<BulkExport>(clientOptions.jsonMapper)

        override fun bulkExports(
            params: BulkExportBulkExportsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BulkExport>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bulk-exports")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { bulkExportsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveBulkExportsHandler: Handler<List<BulkExport>> =
            jsonHandler<List<BulkExport>>(clientOptions.jsonMapper)

        override fun retrieveBulkExports(
            params: BulkExportRetrieveBulkExportsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<BulkExport>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bulk-exports")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
