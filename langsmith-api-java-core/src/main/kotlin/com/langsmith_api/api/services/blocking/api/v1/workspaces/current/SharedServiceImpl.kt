// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.workspaces.current

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.handlers.errorBodyHandler
import com.langsmith_api.api.core.handlers.errorHandler
import com.langsmith_api.api.core.handlers.jsonHandler
import com.langsmith_api.api.core.http.HttpMethod
import com.langsmith_api.api.core.http.HttpRequest
import com.langsmith_api.api.core.http.HttpResponse
import com.langsmith_api.api.core.http.HttpResponse.Handler
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.core.http.json
import com.langsmith_api.api.core.http.parseable
import com.langsmith_api.api.core.prepare
import com.langsmith_api.api.models.api.v1.workspaces.current.shared.SharedDeleteAllParams
import com.langsmith_api.api.models.api.v1.workspaces.current.shared.SharedDeleteAllResponse
import com.langsmith_api.api.models.api.v1.workspaces.current.shared.SharedListParams
import com.langsmith_api.api.models.api.v1.workspaces.current.shared.SharedListResponse
import java.util.function.Consumer

class SharedServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SharedService {

    private val withRawResponse: SharedService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SharedService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SharedService =
        SharedServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: SharedListParams,
        requestOptions: RequestOptions,
    ): SharedListResponse =
        // get /api/v1/workspaces/current/shared
        withRawResponse().list(params, requestOptions).parse()

    override fun deleteAll(
        params: SharedDeleteAllParams,
        requestOptions: RequestOptions,
    ): SharedDeleteAllResponse =
        // delete /api/v1/workspaces/current/shared
        withRawResponse().deleteAll(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SharedService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SharedService.WithRawResponse =
            SharedServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<SharedListResponse> =
            jsonHandler<SharedListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SharedListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SharedListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "shared")
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

        private val deleteAllHandler: Handler<SharedDeleteAllResponse> =
            jsonHandler<SharedDeleteAllResponse>(clientOptions.jsonMapper)

        override fun deleteAll(
            params: SharedDeleteAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SharedDeleteAllResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "shared")
                    .body(json(clientOptions.jsonMapper, params._body()))
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
