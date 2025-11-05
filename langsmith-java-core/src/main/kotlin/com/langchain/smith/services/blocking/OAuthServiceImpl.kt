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
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.prepare
import com.langchain.smith.models.oauth.OAuthRetrieveCallbackParams
import com.langchain.smith.models.oauth.OAuthRetrieveCallbackResponse
import com.langchain.smith.models.oauth.OAuthRetrieveCurrentUserParams
import com.langchain.smith.models.oauth.OAuthRetrieveCurrentUserResponse
import com.langchain.smith.models.oauth.OAuthRetrieveLogoutParams
import com.langchain.smith.models.oauth.OAuthRetrieveLogoutResponse
import com.langchain.smith.models.oauth.OAuthRetrieveParams
import com.langchain.smith.models.oauth.OAuthRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OAuthServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OAuthService {

    private val withRawResponse: OAuthService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OAuthService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OAuthService =
        OAuthServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: OAuthRetrieveParams,
        requestOptions: RequestOptions,
    ): OAuthRetrieveResponse =
        // get /api/v1/oauth/{provider}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun retrieveCallback(
        params: OAuthRetrieveCallbackParams,
        requestOptions: RequestOptions,
    ): OAuthRetrieveCallbackResponse =
        // get /api/v1/oauth/{provider}/callback
        withRawResponse().retrieveCallback(params, requestOptions).parse()

    override fun retrieveCurrentUser(
        params: OAuthRetrieveCurrentUserParams,
        requestOptions: RequestOptions,
    ): OAuthRetrieveCurrentUserResponse =
        // get /api/v1/oauth/{provider}/current-user
        withRawResponse().retrieveCurrentUser(params, requestOptions).parse()

    override fun retrieveLogout(
        params: OAuthRetrieveLogoutParams,
        requestOptions: RequestOptions,
    ): OAuthRetrieveLogoutResponse =
        // get /api/v1/oauth/{provider}/logout
        withRawResponse().retrieveLogout(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OAuthService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OAuthService.WithRawResponse =
            OAuthServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<OAuthRetrieveResponse> =
            jsonHandler<OAuthRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: OAuthRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("provider", params.provider().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "oauth", params._pathParam(0))
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

        private val retrieveCallbackHandler: Handler<OAuthRetrieveCallbackResponse> =
            jsonHandler<OAuthRetrieveCallbackResponse>(clientOptions.jsonMapper)

        override fun retrieveCallback(
            params: OAuthRetrieveCallbackParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthRetrieveCallbackResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("provider", params.provider().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "oauth", params._pathParam(0), "callback")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveCallbackHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveCurrentUserHandler: Handler<OAuthRetrieveCurrentUserResponse> =
            jsonHandler<OAuthRetrieveCurrentUserResponse>(clientOptions.jsonMapper)

        override fun retrieveCurrentUser(
            params: OAuthRetrieveCurrentUserParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthRetrieveCurrentUserResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("provider", params.provider().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "oauth", params._pathParam(0), "current-user")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveCurrentUserHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveLogoutHandler: Handler<OAuthRetrieveLogoutResponse> =
            jsonHandler<OAuthRetrieveLogoutResponse>(clientOptions.jsonMapper)

        override fun retrieveLogout(
            params: OAuthRetrieveLogoutParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthRetrieveLogoutResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("provider", params.provider().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "oauth", params._pathParam(0), "logout")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveLogoutHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
