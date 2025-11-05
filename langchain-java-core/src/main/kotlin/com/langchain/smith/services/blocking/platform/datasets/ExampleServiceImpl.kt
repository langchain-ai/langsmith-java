// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.platform.datasets

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
import com.langchain.smith.core.http.multipartFormData
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.prepare
import com.langchain.smith.models.platform.datasets.examples.ExampleHardDeleteParams
import com.langchain.smith.models.platform.datasets.examples.ExampleHardDeleteResponse
import com.langchain.smith.models.platform.datasets.examples.ExampleUpdateParams
import com.langchain.smith.models.platform.datasets.examples.ExampleUpdateResponse
import com.langchain.smith.models.platform.datasets.examples.ExampleUploadParams
import com.langchain.smith.models.platform.datasets.examples.ExampleUploadResponse
import java.util.function.Consumer

class ExampleServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExampleService {

    private val withRawResponse: ExampleService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExampleService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExampleService =
        ExampleServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: ExampleUpdateParams,
        requestOptions: RequestOptions,
    ): ExampleUpdateResponse =
        // patch /v1/platform/datasets/{dataset_id}/examples
        withRawResponse().update(params, requestOptions).parse()

    override fun hardDelete(
        params: ExampleHardDeleteParams,
        requestOptions: RequestOptions,
    ): ExampleHardDeleteResponse =
        // post /v1/platform/datasets/examples/delete
        withRawResponse().hardDelete(params, requestOptions).parse()

    override fun upload(
        params: ExampleUploadParams,
        requestOptions: RequestOptions,
    ): ExampleUploadResponse =
        // post /v1/platform/datasets/{dataset_id}/examples
        withRawResponse().upload(params, requestOptions).parse()

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

        private val updateHandler: Handler<ExampleUpdateResponse> =
            jsonHandler<ExampleUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ExampleUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExampleUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "platform", "datasets", params._pathParam(0), "examples")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
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

        private val hardDeleteHandler: Handler<ExampleHardDeleteResponse> =
            jsonHandler<ExampleHardDeleteResponse>(clientOptions.jsonMapper)

        override fun hardDelete(
            params: ExampleHardDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExampleHardDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "platform", "datasets", "examples", "delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { hardDeleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val uploadHandler: Handler<ExampleUploadResponse> =
            jsonHandler<ExampleUploadResponse>(clientOptions.jsonMapper)

        override fun upload(
            params: ExampleUploadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExampleUploadResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "platform", "datasets", params._pathParam(0), "examples")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { uploadHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
