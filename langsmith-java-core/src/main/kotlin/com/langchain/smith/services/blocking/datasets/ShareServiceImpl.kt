// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.datasets

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
import com.langchain.smith.models.datasets.share.DatasetShareSchema
import com.langchain.smith.models.datasets.share.ShareCreateParams
import com.langchain.smith.models.datasets.share.ShareDeleteAllParams
import com.langchain.smith.models.datasets.share.ShareDeleteAllResponse
import com.langchain.smith.models.datasets.share.ShareRetrieveParams
import java.util.Optional
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ShareServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ShareService {

    private val withRawResponse: ShareService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ShareService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShareService =
        ShareServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ShareCreateParams,
        requestOptions: RequestOptions,
    ): DatasetShareSchema =
        // put /api/v1/datasets/{dataset_id}/share
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ShareRetrieveParams,
        requestOptions: RequestOptions,
    ): Optional<DatasetShareSchema> =
        // get /api/v1/datasets/{dataset_id}/share
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun deleteAll(
        params: ShareDeleteAllParams,
        requestOptions: RequestOptions,
    ): ShareDeleteAllResponse =
        // delete /api/v1/datasets/{dataset_id}/share
        withRawResponse().deleteAll(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ShareService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ShareService.WithRawResponse =
            ShareServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<DatasetShareSchema> =
            jsonHandler<DatasetShareSchema>(clientOptions.jsonMapper)

        override fun create(
            params: ShareCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetShareSchema> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", params._pathParam(0), "share")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
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

        private val retrieveHandler: Handler<Optional<DatasetShareSchema>> =
            jsonHandler<Optional<DatasetShareSchema>>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ShareRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Optional<DatasetShareSchema>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", params._pathParam(0), "share")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.ifPresent { it.validate() }
                        }
                    }
            }
        }

        private val deleteAllHandler: Handler<ShareDeleteAllResponse> =
            jsonHandler<ShareDeleteAllResponse>(clientOptions.jsonMapper)

        override fun deleteAll(
            params: ShareDeleteAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ShareDeleteAllResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", params._pathParam(0), "share")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteAllHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
