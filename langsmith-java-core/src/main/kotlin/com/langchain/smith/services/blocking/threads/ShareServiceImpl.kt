// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.threads

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
import com.langchain.smith.models.threads.share.ShareCreateParams
import com.langchain.smith.models.threads.share.ShareCreateResponse
import com.langchain.smith.models.threads.share.ShareDeleteParams
import com.langchain.smith.models.threads.share.ShareRetrieveParams
import com.langchain.smith.models.threads.share.ShareRetrieveResponse
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
    ): ShareCreateResponse =
        // post /api/v2/threads/{thread_id}/share
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ShareRetrieveParams,
        requestOptions: RequestOptions,
    ): ShareRetrieveResponse =
        // get /api/v2/threads/{thread_id}/share
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun delete(params: ShareDeleteParams, requestOptions: RequestOptions) {
        // delete /api/v2/threads/{thread_id}/share
        withRawResponse().delete(params, requestOptions)
    }

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

        private val createHandler: Handler<ShareCreateResponse> =
            jsonHandler<ShareCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ShareCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ShareCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("threadId", params.threadId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "threads", params._pathParam(0), "share")
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

        private val retrieveHandler: Handler<ShareRetrieveResponse> =
            jsonHandler<ShareRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ShareRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ShareRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("threadId", params.threadId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "threads", params._pathParam(0), "share")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ShareDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("threadId", params.threadId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "threads", params._pathParam(0), "share")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
