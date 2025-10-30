// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.public_

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
import com.langsmith_api.api.core.http.parseable
import com.langsmith_api.api.core.prepareAsync
import com.langsmith_api.api.models.api.v1.public_.schemas.SchemaRetrieveMessageJsonParams
import com.langsmith_api.api.models.api.v1.public_.schemas.SchemaRetrieveMessageJsonResponse
import com.langsmith_api.api.models.api.v1.public_.schemas.SchemaRetrieveTooldefJsonParams
import com.langsmith_api.api.models.api.v1.public_.schemas.SchemaRetrieveTooldefJsonResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SchemaServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SchemaServiceAsync {

    private val withRawResponse: SchemaServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SchemaServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SchemaServiceAsync =
        SchemaServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieveMessageJson(
        params: SchemaRetrieveMessageJsonParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SchemaRetrieveMessageJsonResponse> =
        // get /api/v1/public/schemas/{version}/message.json
        withRawResponse().retrieveMessageJson(params, requestOptions).thenApply { it.parse() }

    override fun retrieveTooldefJson(
        params: SchemaRetrieveTooldefJsonParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SchemaRetrieveTooldefJsonResponse> =
        // get /api/v1/public/schemas/{version}/tooldef.json
        withRawResponse().retrieveTooldefJson(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SchemaServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SchemaServiceAsync.WithRawResponse =
            SchemaServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveMessageJsonHandler: Handler<SchemaRetrieveMessageJsonResponse> =
            jsonHandler<SchemaRetrieveMessageJsonResponse>(clientOptions.jsonMapper)

        override fun retrieveMessageJson(
            params: SchemaRetrieveMessageJsonParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SchemaRetrieveMessageJsonResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("version", params.version().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "public",
                        "schemas",
                        params._pathParam(0),
                        "message.json",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveMessageJsonHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveTooldefJsonHandler: Handler<SchemaRetrieveTooldefJsonResponse> =
            jsonHandler<SchemaRetrieveTooldefJsonResponse>(clientOptions.jsonMapper)

        override fun retrieveTooldefJson(
            params: SchemaRetrieveTooldefJsonParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SchemaRetrieveTooldefJsonResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("version", params.version().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "public",
                        "schemas",
                        params._pathParam(0),
                        "tooldef.json",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveTooldefJsonHandler.handle(it) }
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
