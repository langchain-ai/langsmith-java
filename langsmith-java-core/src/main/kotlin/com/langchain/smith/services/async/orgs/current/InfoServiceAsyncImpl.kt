// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.orgs.current

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
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.prepareAsync
import com.langchain.smith.models.orgs.current.info.InfoListParams
import com.langchain.smith.models.orgs.current.info.InfoPatchAllParams
import com.langchain.smith.models.orgs.current.info.OrganizationInfo
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class InfoServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InfoServiceAsync {

    private val withRawResponse: InfoServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InfoServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InfoServiceAsync =
        InfoServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: InfoListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrganizationInfo> =
        // get /api/v1/orgs/current/info
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun patchAll(
        params: InfoPatchAllParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrganizationInfo> =
        // patch /api/v1/orgs/current/info
        withRawResponse().patchAll(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InfoServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InfoServiceAsync.WithRawResponse =
            InfoServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<OrganizationInfo> =
            jsonHandler<OrganizationInfo>(clientOptions.jsonMapper)

        override fun list(
            params: InfoListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrganizationInfo>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "info")
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
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val patchAllHandler: Handler<OrganizationInfo> =
            jsonHandler<OrganizationInfo>(clientOptions.jsonMapper)

        override fun patchAll(
            params: InfoPatchAllParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrganizationInfo>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "info")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { patchAllHandler.handle(it) }
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
