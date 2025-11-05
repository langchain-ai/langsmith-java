// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sessions

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
import com.langchain.smith.models.sessions.views.FilterView
import com.langchain.smith.models.sessions.views.ViewCreateParams
import com.langchain.smith.models.sessions.views.ViewDeleteParams
import com.langchain.smith.models.sessions.views.ViewDeleteResponse
import com.langchain.smith.models.sessions.views.ViewListParams
import com.langchain.smith.models.sessions.views.ViewRetrieveParams
import com.langchain.smith.models.sessions.views.ViewUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ViewServiceImpl internal constructor(private val clientOptions: ClientOptions) : ViewService {

    private val withRawResponse: ViewService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ViewService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ViewService =
        ViewServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: ViewCreateParams, requestOptions: RequestOptions): FilterView =
        // post /api/v1/sessions/{session_id}/views
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: ViewRetrieveParams, requestOptions: RequestOptions): FilterView =
        // get /api/v1/sessions/{session_id}/views/{view_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: ViewUpdateParams, requestOptions: RequestOptions): FilterView =
        // patch /api/v1/sessions/{session_id}/views/{view_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: ViewListParams, requestOptions: RequestOptions): List<FilterView> =
        // get /api/v1/sessions/{session_id}/views
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: ViewDeleteParams,
        requestOptions: RequestOptions,
    ): ViewDeleteResponse =
        // delete /api/v1/sessions/{session_id}/views/{view_id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ViewService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ViewService.WithRawResponse =
            ViewServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<FilterView> =
            jsonHandler<FilterView>(clientOptions.jsonMapper)

        override fun create(
            params: ViewCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FilterView> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sessionId", params.sessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sessions", params._pathParam(0), "views")
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

        private val retrieveHandler: Handler<FilterView> =
            jsonHandler<FilterView>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ViewRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FilterView> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("viewId", params.viewId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "sessions",
                        params._pathParam(0),
                        "views",
                        params._pathParam(1),
                    )
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

        private val updateHandler: Handler<FilterView> =
            jsonHandler<FilterView>(clientOptions.jsonMapper)

        override fun update(
            params: ViewUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FilterView> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("viewId", params.viewId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "sessions",
                        params._pathParam(0),
                        "views",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<List<FilterView>> =
            jsonHandler<List<FilterView>>(clientOptions.jsonMapper)

        override fun list(
            params: ViewListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<FilterView>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sessionId", params.sessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sessions", params._pathParam(0), "views")
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

        private val deleteHandler: Handler<ViewDeleteResponse> =
            jsonHandler<ViewDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ViewDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ViewDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("viewId", params.viewId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "sessions",
                        params._pathParam(0),
                        "views",
                        params._pathParam(1),
                    )
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
    }
}
