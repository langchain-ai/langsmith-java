// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.datasets

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
import com.langchain.smith.models.datasets.examples.ExampleDeleteParams
import com.langchain.smith.models.datasets.examples.ExampleUpdateMetadataParams
import com.langchain.smith.models.datasets.examples.ExampleUpdateMetadataResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ExampleServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExampleService {

    private val withRawResponse: ExampleService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExampleService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExampleService =
        ExampleServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun delete(params: ExampleDeleteParams, requestOptions: RequestOptions) {
        // delete /api/v1/platform/datasets/{dataset_id}/examples/{example_id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun updateMetadata(
        params: ExampleUpdateMetadataParams,
        requestOptions: RequestOptions,
    ): ExampleUpdateMetadataResponse =
        // patch /api/v1/platform/datasets/{dataset_id}/examples/metadata
        withRawResponse().updateMetadata(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExampleService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExampleService.WithRawResponse =
            ExampleServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ExampleDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("exampleId", params.exampleId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "platform",
                        "datasets",
                        params._pathParam(0),
                        "examples",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val updateMetadataHandler: Handler<ExampleUpdateMetadataResponse> =
            jsonHandler<ExampleUpdateMetadataResponse>(clientOptions.jsonMapper)

        override fun updateMetadata(
            params: ExampleUpdateMetadataParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExampleUpdateMetadataResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "platform",
                        "datasets",
                        params._pathParam(0),
                        "examples",
                        "metadata",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateMetadataHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
