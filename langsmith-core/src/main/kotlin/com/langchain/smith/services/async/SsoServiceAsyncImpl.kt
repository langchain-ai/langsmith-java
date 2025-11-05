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
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.prepareAsync
import com.langchain.smith.models.sso.SsoRetrieveParams
import com.langchain.smith.models.sso.SsoRetrieveResponse
import com.langchain.smith.services.async.sso.EmailVerificationServiceAsync
import com.langchain.smith.services.async.sso.EmailVerificationServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SsoServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SsoServiceAsync {

    private val withRawResponse: SsoServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val emailVerification: EmailVerificationServiceAsync by lazy {
        EmailVerificationServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): SsoServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SsoServiceAsync =
        SsoServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun emailVerification(): EmailVerificationServiceAsync = emailVerification

    override fun retrieve(
        params: SsoRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<SsoRetrieveResponse>> =
        // get /api/v1/sso/settings/{sso_login_slug}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SsoServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val emailVerification: EmailVerificationServiceAsync.WithRawResponse by lazy {
            EmailVerificationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SsoServiceAsync.WithRawResponse =
            SsoServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun emailVerification(): EmailVerificationServiceAsync.WithRawResponse =
            emailVerification

        private val retrieveHandler: Handler<List<SsoRetrieveResponse>> =
            jsonHandler<List<SsoRetrieveResponse>>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SsoRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<SsoRetrieveResponse>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("ssoLoginSlug", params.ssoLoginSlug().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sso", "settings", params._pathParam(0))
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
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }
    }
}
