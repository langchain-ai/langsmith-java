// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.charts

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
import com.langchain.smith.models.charts.section.CustomChartsSectionResponse
import com.langchain.smith.models.charts.section.SectionCloneParams
import com.langchain.smith.models.charts.section.SectionCreateParams
import com.langchain.smith.models.charts.section.SectionDeleteParams
import com.langchain.smith.models.charts.section.SectionDeleteResponse
import com.langchain.smith.models.charts.section.SectionListParams
import com.langchain.smith.models.charts.section.SectionRetrieveParams
import com.langchain.smith.models.charts.section.SectionUpdateParams
import com.langchain.smith.models.sessions.CustomChartsSection
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SectionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SectionServiceAsync {

    private val withRawResponse: SectionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SectionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SectionServiceAsync =
        SectionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SectionCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomChartsSectionResponse> =
        // post /api/v1/charts/section
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: SectionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomChartsSection> =
        // post /api/v1/charts/section/{section_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: SectionUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomChartsSectionResponse> =
        // patch /api/v1/charts/section/{section_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: SectionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<CustomChartsSectionResponse>> =
        // get /api/v1/charts/section
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: SectionDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SectionDeleteResponse> =
        // delete /api/v1/charts/section/{section_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun clone(
        params: SectionCloneParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomChartsSectionResponse> =
        // post /api/v1/charts/section/clone
        withRawResponse().clone(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SectionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SectionServiceAsync.WithRawResponse =
            SectionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CustomChartsSectionResponse> =
            jsonHandler<CustomChartsSectionResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SectionCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomChartsSectionResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "charts", "section")
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

        private val retrieveHandler: Handler<CustomChartsSection> =
            jsonHandler<CustomChartsSection>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SectionRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomChartsSection>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sectionId", params.sectionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "charts", "section", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val updateHandler: Handler<CustomChartsSectionResponse> =
            jsonHandler<CustomChartsSectionResponse>(clientOptions.jsonMapper)

        override fun update(
            params: SectionUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomChartsSectionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sectionId", params.sectionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "charts", "section", params._pathParam(0))
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

        private val listHandler: Handler<List<CustomChartsSectionResponse>> =
            jsonHandler<List<CustomChartsSectionResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: SectionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<CustomChartsSectionResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "charts", "section")
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

        private val deleteHandler: Handler<SectionDeleteResponse> =
            jsonHandler<SectionDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: SectionDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SectionDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sectionId", params.sectionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "charts", "section", params._pathParam(0))
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

        private val cloneHandler: Handler<CustomChartsSectionResponse> =
            jsonHandler<CustomChartsSectionResponse>(clientOptions.jsonMapper)

        override fun clone(
            params: SectionCloneParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomChartsSectionResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "charts", "section", "clone")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
