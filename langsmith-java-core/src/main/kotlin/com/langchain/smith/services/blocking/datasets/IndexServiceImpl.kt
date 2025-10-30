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
import com.langchain.smith.models.datasets.index.IndexCreateParams
import com.langchain.smith.models.datasets.index.IndexCreateResponse
import com.langchain.smith.models.datasets.index.IndexDeleteAllParams
import com.langchain.smith.models.datasets.index.IndexDeleteAllResponse
import com.langchain.smith.models.datasets.index.IndexListParams
import com.langchain.smith.models.datasets.index.IndexListResponse
import com.langchain.smith.models.datasets.index.IndexSyncParams
import com.langchain.smith.models.datasets.index.IndexSyncResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class IndexServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    IndexService {

    private val withRawResponse: IndexService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IndexService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IndexService =
        IndexServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: IndexCreateParams,
        requestOptions: RequestOptions,
    ): IndexCreateResponse =
        // post /api/v1/datasets/{dataset_id}/index
        withRawResponse().create(params, requestOptions).parse()

    override fun list(params: IndexListParams, requestOptions: RequestOptions): IndexListResponse =
        // get /api/v1/datasets/{dataset_id}/index
        withRawResponse().list(params, requestOptions).parse()

    override fun deleteAll(
        params: IndexDeleteAllParams,
        requestOptions: RequestOptions,
    ): IndexDeleteAllResponse =
        // delete /api/v1/datasets/{dataset_id}/index
        withRawResponse().deleteAll(params, requestOptions).parse()

    override fun sync(params: IndexSyncParams, requestOptions: RequestOptions): IndexSyncResponse =
        // post /api/v1/datasets/{dataset_id}/index/sync
        withRawResponse().sync(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IndexService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IndexService.WithRawResponse =
            IndexServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<IndexCreateResponse> =
            jsonHandler<IndexCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: IndexCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IndexCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", params._pathParam(0), "index")
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

        private val listHandler: Handler<IndexListResponse> =
            jsonHandler<IndexListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: IndexListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IndexListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", params._pathParam(0), "index")
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

        private val deleteAllHandler: Handler<IndexDeleteAllResponse> =
            jsonHandler<IndexDeleteAllResponse>(clientOptions.jsonMapper)

        override fun deleteAll(
            params: IndexDeleteAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IndexDeleteAllResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", params._pathParam(0), "index")
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

        private val syncHandler: Handler<IndexSyncResponse> =
            jsonHandler<IndexSyncResponse>(clientOptions.jsonMapper)

        override fun sync(
            params: IndexSyncParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IndexSyncResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", params._pathParam(0), "index", "sync")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { syncHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
