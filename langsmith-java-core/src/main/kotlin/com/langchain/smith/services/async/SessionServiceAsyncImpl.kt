// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

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
import com.langchain.smith.core.prepareAsync
import com.langchain.smith.models.sessions.CustomChartsSection
import com.langchain.smith.models.sessions.Session
import com.langchain.smith.models.sessions.SessionCreateParams
import com.langchain.smith.models.sessions.SessionCreateV2Params
import com.langchain.smith.models.sessions.SessionDashboardParams
import com.langchain.smith.models.sessions.SessionDeleteParams
import com.langchain.smith.models.sessions.SessionListPageAsync
import com.langchain.smith.models.sessions.SessionListParams
import com.langchain.smith.models.sessions.SessionListV1PageAsync
import com.langchain.smith.models.sessions.SessionListV1Params
import com.langchain.smith.models.sessions.SessionListV2PageAsync
import com.langchain.smith.models.sessions.SessionListV2PageResponse
import com.langchain.smith.models.sessions.SessionListV2Params
import com.langchain.smith.models.sessions.SessionResolveParams
import com.langchain.smith.models.sessions.SessionResolveResponse
import com.langchain.smith.models.sessions.SessionRetrieveParams
import com.langchain.smith.models.sessions.SessionRetrieveV2Params
import com.langchain.smith.models.sessions.SessionUpdateParams
import com.langchain.smith.models.sessions.SessionUpdateV2Params
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

    @Deprecated(
        "Deprecated: use createV2 instead, which calls POST /api/v2/sessions. The v1 endpoint is scheduled for removal on Jul 1, 2027."
    )
    override fun create(
        params: SessionCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TracerSessionWithoutVirtualFields> =
        // post /api/v1/sessions
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    @Deprecated(
        "Deprecated: use retrieveV2 instead, which calls GET /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
    )
    override fun retrieve(
        params: SessionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TracerSession> =
        // get /api/v1/sessions/{session_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    @Deprecated(
        "Deprecated: use updateV2 instead, which calls PATCH /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
    )
    override fun update(
        params: SessionUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TracerSessionWithoutVirtualFields> =
        // patch /api/v1/sessions/{session_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: SessionDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /api/v1/sessions/{session_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun createV2(
        params: SessionCreateV2Params,
        requestOptions: RequestOptions,
    ): CompletableFuture<Session> =
        // post /api/v2/sessions
        withRawResponse().createV2(params, requestOptions).thenApply { it.parse() }

    override fun dashboard(
        params: SessionDashboardParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomChartsSection> =
        // post /api/v1/sessions/{session_id}/dashboard
        withRawResponse().dashboard(params, requestOptions).thenApply { it.parse() }

    @Deprecated(
        "Deprecated: use listV2 instead, which calls GET /api/v2/sessions and pages with a cursor. The v1 endpoint is scheduled for removal on Jul 1, 2027."
    )
    override fun listV1(
        params: SessionListV1Params,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionListV1PageAsync> =
        // get /api/v1/sessions
        withRawResponse().listV1(params, requestOptions).thenApply { it.parse() }

    override fun listV2(
        params: SessionListV2Params,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionListV2PageAsync> =
        // get /api/v2/sessions
        withRawResponse().listV2(params, requestOptions).thenApply { it.parse() }

    override fun resolve(
        params: SessionResolveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionResolveResponse> =
        // get /api/v1/sessions/resolutions
        withRawResponse().resolve(params, requestOptions).thenApply { it.parse() }

    override fun retrieveV2(
        params: SessionRetrieveV2Params,
        requestOptions: RequestOptions,
    ): CompletableFuture<Session> =
        // get /api/v2/sessions/{session_id}
        withRawResponse().retrieveV2(params, requestOptions).thenApply { it.parse() }

    override fun updateV2(
        params: SessionUpdateV2Params,
        requestOptions: RequestOptions,
    ): CompletableFuture<Session> =
        // patch /api/v2/sessions/{session_id}
        withRawResponse().updateV2(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: SessionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionListPageAsync> =
        // get /api/v1/sessions
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

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

        @Deprecated(
            "Deprecated: use createV2 instead, which calls POST /api/v2/sessions. The v1 endpoint is scheduled for removal on Jul 1, 2027."
        )
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

        @Deprecated(
            "Deprecated: use retrieveV2 instead, which calls GET /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
        )
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

        @Deprecated(
            "Deprecated: use updateV2 instead, which calls PATCH /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
        )
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: SessionDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val createV2Handler: Handler<Session> =
            jsonHandler<Session>(clientOptions.jsonMapper)

        override fun createV2(
            params: SessionCreateV2Params,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Session>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "sessions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createV2Handler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val dashboardHandler: Handler<CustomChartsSection> =
            jsonHandler<CustomChartsSection>(clientOptions.jsonMapper)

        override fun dashboard(
            params: SessionDashboardParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomChartsSection>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sessionId", params.sessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sessions", params._pathParam(0), "dashboard")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { dashboardHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listV1Handler: Handler<List<TracerSession>> =
            jsonHandler<List<TracerSession>>(clientOptions.jsonMapper)

        @Deprecated(
            "Deprecated: use listV2 instead, which calls GET /api/v2/sessions and pages with a cursor. The v1 endpoint is scheduled for removal on Jul 1, 2027."
        )
        override fun listV1(
            params: SessionListV1Params,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionListV1PageAsync>> {
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
                            .use { listV1Handler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                            .let {
                                SessionListV1PageAsync.builder()
                                    .service(SessionServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .items(it)
                                    .build()
                            }
                    }
                }
        }

        private val listV2Handler: Handler<SessionListV2PageResponse> =
            jsonHandler<SessionListV2PageResponse>(clientOptions.jsonMapper)

        override fun listV2(
            params: SessionListV2Params,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionListV2PageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "sessions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listV2Handler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                SessionListV2PageAsync.builder()
                                    .service(SessionServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val resolveHandler: Handler<SessionResolveResponse> =
            jsonHandler<SessionResolveResponse>(clientOptions.jsonMapper)

        override fun resolve(
            params: SessionResolveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionResolveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sessions", "resolutions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { resolveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveV2Handler: Handler<Session> =
            jsonHandler<Session>(clientOptions.jsonMapper)

        override fun retrieveV2(
            params: SessionRetrieveV2Params,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Session>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sessionId", params.sessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "sessions", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveV2Handler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateV2Handler: Handler<Session> =
            jsonHandler<Session>(clientOptions.jsonMapper)

        override fun updateV2(
            params: SessionUpdateV2Params,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Session>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sessionId", params.sessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "sessions", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateV2Handler.handle(it) }
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
        ): CompletableFuture<HttpResponseFor<SessionListPageAsync>> {
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
                            .let {
                                SessionListPageAsync.builder()
                                    .service(SessionServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .items(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
