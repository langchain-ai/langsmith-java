// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

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
import com.langchain.smith.models.sessions.SessionCreateParams
import com.langchain.smith.models.sessions.SessionDeleteParams
import com.langchain.smith.models.sessions.SessionDeleteResponse
import com.langchain.smith.models.sessions.SessionListParams
import com.langchain.smith.models.sessions.SessionRetrieveParams
import com.langchain.smith.models.sessions.SessionUpdateParams
import com.langchain.smith.models.sessions.TracerSession
import com.langchain.smith.models.sessions.TracerSessionWithoutVirtualFields
import com.langchain.smith.services.async.sessions.InsightServiceAsync
import com.langchain.smith.services.async.sessions.InsightServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SessionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SessionServiceAsync {

    private val withRawResponse: SessionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val insights: InsightServiceAsync by lazy { InsightServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): SessionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SessionServiceAsync =
        SessionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun insights(): InsightServiceAsync = insights

    override fun create(
        params: SessionCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TracerSessionWithoutVirtualFields> =
        // post /api/v1/sessions
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: SessionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TracerSession> =
        // get /api/v1/sessions/{session_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: SessionUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TracerSessionWithoutVirtualFields> =
        // patch /api/v1/sessions/{session_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: SessionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<TracerSession>> =
        // get /api/v1/sessions
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: SessionDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionDeleteResponse> =
        // delete /api/v1/sessions/{session_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SessionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val insights: InsightServiceAsync.WithRawResponse by lazy {
            InsightServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SessionServiceAsync.WithRawResponse =
            SessionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun insights(): InsightServiceAsync.WithRawResponse = insights

        private val createHandler: Handler<TracerSessionWithoutVirtualFields> =
            jsonHandler<TracerSessionWithoutVirtualFields>(clientOptions.jsonMapper)

        override fun create(
            params: SessionCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TracerSessionWithoutVirtualFields>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sessions")
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

        private val retrieveHandler: Handler<TracerSession> =
            jsonHandler<TracerSession>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SessionRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TracerSession>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sessionId", params.sessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sessions", params._pathParam(0))
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

        private val updateHandler: Handler<TracerSessionWithoutVirtualFields> =
            jsonHandler<TracerSessionWithoutVirtualFields>(clientOptions.jsonMapper)

        override fun update(
            params: SessionUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TracerSessionWithoutVirtualFields>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sessionId", params.sessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sessions", params._pathParam(0))
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

        private val listHandler: Handler<List<TracerSession>> =
            jsonHandler<List<TracerSession>>(clientOptions.jsonMapper)

        override fun list(
            params: SessionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<TracerSession>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sessions")
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

        private val deleteHandler: Handler<SessionDeleteResponse> =
            jsonHandler<SessionDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: SessionDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sessionId", params.sessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sessions", params._pathParam(0))
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
    }
}
