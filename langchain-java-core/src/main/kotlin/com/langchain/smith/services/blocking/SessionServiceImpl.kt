// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

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
import com.langchain.smith.models.sessions.CustomChartsSection
import com.langchain.smith.models.sessions.SessionCreateParams
import com.langchain.smith.models.sessions.SessionDashboardParams
import com.langchain.smith.models.sessions.SessionDeleteAllParams
import com.langchain.smith.models.sessions.SessionDeleteAllResponse
import com.langchain.smith.models.sessions.SessionDeleteParams
import com.langchain.smith.models.sessions.SessionDeleteResponse
import com.langchain.smith.models.sessions.SessionListParams
import com.langchain.smith.models.sessions.SessionRetrieveMetadataParams
import com.langchain.smith.models.sessions.SessionRetrieveMetadataResponse
import com.langchain.smith.models.sessions.SessionRetrieveParams
import com.langchain.smith.models.sessions.SessionUpdateParams
import com.langchain.smith.models.sessions.TracerSession
import com.langchain.smith.models.sessions.TracerSessionWithoutVirtualFields
import com.langchain.smith.services.blocking.sessions.InsightService
import com.langchain.smith.services.blocking.sessions.InsightServiceImpl
import com.langchain.smith.services.blocking.sessions.ViewService
import com.langchain.smith.services.blocking.sessions.ViewServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SessionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SessionService {

    private val withRawResponse: SessionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val views: ViewService by lazy { ViewServiceImpl(clientOptions) }

    private val insights: InsightService by lazy { InsightServiceImpl(clientOptions) }

    override fun withRawResponse(): SessionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SessionService =
        SessionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun views(): ViewService = views

    override fun insights(): InsightService = insights

    override fun create(
        params: SessionCreateParams,
        requestOptions: RequestOptions,
    ): TracerSessionWithoutVirtualFields =
        // post /api/v1/sessions
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: SessionRetrieveParams,
        requestOptions: RequestOptions,
    ): TracerSession =
        // get /api/v1/sessions/{session_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: SessionUpdateParams,
        requestOptions: RequestOptions,
    ): TracerSessionWithoutVirtualFields =
        // patch /api/v1/sessions/{session_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: SessionListParams,
        requestOptions: RequestOptions,
    ): List<TracerSession> =
        // get /api/v1/sessions
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: SessionDeleteParams,
        requestOptions: RequestOptions,
    ): SessionDeleteResponse =
        // delete /api/v1/sessions/{session_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun dashboard(
        params: SessionDashboardParams,
        requestOptions: RequestOptions,
    ): CustomChartsSection =
        // post /api/v1/sessions/{session_id}/dashboard
        withRawResponse().dashboard(params, requestOptions).parse()

    override fun deleteAll(
        params: SessionDeleteAllParams,
        requestOptions: RequestOptions,
    ): SessionDeleteAllResponse =
        // delete /api/v1/sessions
        withRawResponse().deleteAll(params, requestOptions).parse()

    override fun retrieveMetadata(
        params: SessionRetrieveMetadataParams,
        requestOptions: RequestOptions,
    ): SessionRetrieveMetadataResponse =
        // get /api/v1/sessions/{session_id}/metadata
        withRawResponse().retrieveMetadata(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SessionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val views: ViewService.WithRawResponse by lazy {
            ViewServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val insights: InsightService.WithRawResponse by lazy {
            InsightServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SessionService.WithRawResponse =
            SessionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun views(): ViewService.WithRawResponse = views

        override fun insights(): InsightService.WithRawResponse = insights

        private val createHandler: Handler<TracerSessionWithoutVirtualFields> =
            jsonHandler<TracerSessionWithoutVirtualFields>(clientOptions.jsonMapper)

        override fun create(
            params: SessionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TracerSessionWithoutVirtualFields> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sessions")
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

        private val retrieveHandler: Handler<TracerSession> =
            jsonHandler<TracerSession>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SessionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TracerSession> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sessionId", params.sessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sessions", params._pathParam(0))
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

        private val updateHandler: Handler<TracerSessionWithoutVirtualFields> =
            jsonHandler<TracerSessionWithoutVirtualFields>(clientOptions.jsonMapper)

        override fun update(
            params: SessionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TracerSessionWithoutVirtualFields> {
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

        private val listHandler: Handler<List<TracerSession>> =
            jsonHandler<List<TracerSession>>(clientOptions.jsonMapper)

        override fun list(
            params: SessionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<TracerSession>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sessions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val deleteHandler: Handler<SessionDeleteResponse> =
            jsonHandler<SessionDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: SessionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionDeleteResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val dashboardHandler: Handler<CustomChartsSection> =
            jsonHandler<CustomChartsSection>(clientOptions.jsonMapper)

        override fun dashboard(
            params: SessionDashboardParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomChartsSection> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { dashboardHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteAllHandler: Handler<SessionDeleteAllResponse> =
            jsonHandler<SessionDeleteAllResponse>(clientOptions.jsonMapper)

        override fun deleteAll(
            params: SessionDeleteAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionDeleteAllResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sessions")
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

        private val retrieveMetadataHandler: Handler<SessionRetrieveMetadataResponse> =
            jsonHandler<SessionRetrieveMetadataResponse>(clientOptions.jsonMapper)

        override fun retrieveMetadata(
            params: SessionRetrieveMetadataParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionRetrieveMetadataResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sessionId", params.sessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sessions", params._pathParam(0), "metadata")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveMetadataHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
