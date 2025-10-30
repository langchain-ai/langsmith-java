// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.sso

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
import com.langsmith_api.api.models.api.v1.sso.emailverification.EmailVerificationConfirmParams
import com.langsmith_api.api.models.api.v1.sso.emailverification.EmailVerificationConfirmResponse
import com.langsmith_api.api.models.api.v1.sso.emailverification.EmailVerificationSendParams
import com.langsmith_api.api.models.api.v1.sso.emailverification.EmailVerificationSendResponse
import com.langsmith_api.api.models.api.v1.sso.emailverification.EmailVerificationStatusParams
import com.langsmith_api.api.models.api.v1.sso.emailverification.EmailVerificationStatusResponse
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
