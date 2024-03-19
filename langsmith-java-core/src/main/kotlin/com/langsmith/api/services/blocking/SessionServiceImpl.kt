// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.SessionCreateParams
import com.langsmith.api.models.SessionDeleteParams
import com.langsmith.api.models.SessionDeleteResponse
import com.langsmith.api.models.SessionListParams
import com.langsmith.api.models.SessionRetrieveParams
import com.langsmith.api.models.SessionUpdateParams
import com.langsmith.api.models.TracerSession
import com.langsmith.api.models.TracerSessionWithoutVirtualFields
import com.langsmith.api.services.blocking.sessions.MetadataService
import com.langsmith.api.services.blocking.sessions.MetadataServiceImpl
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.json
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class SessionServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : SessionService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val metadata: MetadataService by lazy { MetadataServiceImpl(clientOptions) }

    override fun metadata(): MetadataService = metadata

    private val createHandler: Handler<TracerSessionWithoutVirtualFields> =
        jsonHandler<TracerSessionWithoutVirtualFields>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create a new session. */
    override fun create(
        params: SessionCreateParams,
        requestOptions: RequestOptions
    ): TracerSessionWithoutVirtualFields {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("sessions")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<TracerSession> =
        jsonHandler<TracerSession>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a specific session. */
    override fun retrieve(
        params: SessionRetrieveParams,
        requestOptions: RequestOptions
    ): TracerSession {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("sessions", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<TracerSessionWithoutVirtualFields> =
        jsonHandler<TracerSessionWithoutVirtualFields>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create a new session. */
    override fun update(
        params: SessionUpdateParams,
        requestOptions: RequestOptions
    ): TracerSessionWithoutVirtualFields {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("sessions", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<List<TracerSession>> =
        jsonHandler<List<TracerSession>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get all sessions. */
    override fun list(
        params: SessionListParams,
        requestOptions: RequestOptions
    ): List<TracerSession> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("sessions")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
        }
    }

    private val deleteHandler: Handler<SessionDeleteResponse> =
        jsonHandler<SessionDeleteResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete a specific session. */
    override fun delete(
        params: SessionDeleteParams,
        requestOptions: RequestOptions
    ): SessionDeleteResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("sessions")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { deleteHandler.handle(it) }
        }
    }
}
