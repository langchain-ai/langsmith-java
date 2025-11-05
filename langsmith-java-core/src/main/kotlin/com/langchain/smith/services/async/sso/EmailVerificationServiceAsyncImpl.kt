// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.sso

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
import com.langchain.smith.models.sso.emailverification.EmailVerificationConfirmParams
import com.langchain.smith.models.sso.emailverification.EmailVerificationConfirmResponse
import com.langchain.smith.models.sso.emailverification.EmailVerificationSendParams
import com.langchain.smith.models.sso.emailverification.EmailVerificationSendResponse
import com.langchain.smith.models.sso.emailverification.EmailVerificationStatusParams
import com.langchain.smith.models.sso.emailverification.EmailVerificationStatusResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class EmailVerificationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : EmailVerificationServiceAsync {

    private val withRawResponse: EmailVerificationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EmailVerificationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): EmailVerificationServiceAsync =
        EmailVerificationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun confirm(
        params: EmailVerificationConfirmParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailVerificationConfirmResponse> =
        // post /api/v1/sso/email-verification/confirm
        withRawResponse().confirm(params, requestOptions).thenApply { it.parse() }

    override fun send(
        params: EmailVerificationSendParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailVerificationSendResponse> =
        // post /api/v1/sso/email-verification/send
        withRawResponse().send(params, requestOptions).thenApply { it.parse() }

    override fun status(
        params: EmailVerificationStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailVerificationStatusResponse> =
        // post /api/v1/sso/email-verification/status
        withRawResponse().status(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmailVerificationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailVerificationServiceAsync.WithRawResponse =
            EmailVerificationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val confirmHandler: Handler<EmailVerificationConfirmResponse> =
            jsonHandler<EmailVerificationConfirmResponse>(clientOptions.jsonMapper)

        override fun confirm(
            params: EmailVerificationConfirmParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailVerificationConfirmResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sso", "email-verification", "confirm")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { confirmHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val sendHandler: Handler<EmailVerificationSendResponse> =
            jsonHandler<EmailVerificationSendResponse>(clientOptions.jsonMapper)

        override fun send(
            params: EmailVerificationSendParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailVerificationSendResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sso", "email-verification", "send")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { sendHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val statusHandler: Handler<EmailVerificationStatusResponse> =
            jsonHandler<EmailVerificationStatusResponse>(clientOptions.jsonMapper)

        override fun status(
            params: EmailVerificationStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailVerificationStatusResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sso", "email-verification", "status")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { statusHandler.handle(it) }
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
