// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sso

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
import com.langchain.smith.core.prepare
import com.langchain.smith.models.sso.emailverification.EmailVerificationConfirmParams
import com.langchain.smith.models.sso.emailverification.EmailVerificationConfirmResponse
import com.langchain.smith.models.sso.emailverification.EmailVerificationSendParams
import com.langchain.smith.models.sso.emailverification.EmailVerificationSendResponse
import com.langchain.smith.models.sso.emailverification.EmailVerificationStatusParams
import com.langchain.smith.models.sso.emailverification.EmailVerificationStatusResponse
import java.util.function.Consumer

class EmailVerificationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EmailVerificationService {

    private val withRawResponse: EmailVerificationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EmailVerificationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailVerificationService =
        EmailVerificationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun confirm(
        params: EmailVerificationConfirmParams,
        requestOptions: RequestOptions,
    ): EmailVerificationConfirmResponse =
        // post /api/v1/sso/email-verification/confirm
        withRawResponse().confirm(params, requestOptions).parse()

    override fun send(
        params: EmailVerificationSendParams,
        requestOptions: RequestOptions,
    ): EmailVerificationSendResponse =
        // post /api/v1/sso/email-verification/send
        withRawResponse().send(params, requestOptions).parse()

    override fun status(
        params: EmailVerificationStatusParams,
        requestOptions: RequestOptions,
    ): EmailVerificationStatusResponse =
        // post /api/v1/sso/email-verification/status
        withRawResponse().status(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmailVerificationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailVerificationService.WithRawResponse =
            EmailVerificationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val confirmHandler: Handler<EmailVerificationConfirmResponse> =
            jsonHandler<EmailVerificationConfirmResponse>(clientOptions.jsonMapper)

        override fun confirm(
            params: EmailVerificationConfirmParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailVerificationConfirmResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sso", "email-verification", "confirm")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { confirmHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val sendHandler: Handler<EmailVerificationSendResponse> =
            jsonHandler<EmailVerificationSendResponse>(clientOptions.jsonMapper)

        override fun send(
            params: EmailVerificationSendParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailVerificationSendResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sso", "email-verification", "send")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { sendHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val statusHandler: Handler<EmailVerificationStatusResponse> =
            jsonHandler<EmailVerificationStatusResponse>(clientOptions.jsonMapper)

        override fun status(
            params: EmailVerificationStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailVerificationStatusResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sso", "email-verification", "status")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
