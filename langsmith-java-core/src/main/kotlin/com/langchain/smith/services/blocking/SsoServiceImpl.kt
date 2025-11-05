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
import com.langchain.smith.models.sso.SsoRetrieveParams
import com.langchain.smith.models.sso.SsoRetrieveResponse
import com.langchain.smith.services.blocking.sso.EmailVerificationService
import com.langchain.smith.services.blocking.sso.EmailVerificationServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SsoServiceImpl internal constructor(private val clientOptions: ClientOptions) : SsoService {

    private val withRawResponse: SsoService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val emailVerification: EmailVerificationService by lazy {
        EmailVerificationServiceImpl(clientOptions)
    }

    override fun withRawResponse(): SsoService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SsoService =
        SsoServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun emailVerification(): EmailVerificationService = emailVerification

    override fun retrieve(
        params: SsoRetrieveParams,
        requestOptions: RequestOptions,
    ): List<SsoRetrieveResponse> =
        // get /api/v1/sso/settings/{sso_login_slug}
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SsoService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val emailVerification: EmailVerificationService.WithRawResponse by lazy {
            EmailVerificationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SsoService.WithRawResponse =
            SsoServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun emailVerification(): EmailVerificationService.WithRawResponse =
            emailVerification

        private val retrieveHandler: Handler<List<SsoRetrieveResponse>> =
            jsonHandler<List<SsoRetrieveResponse>>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SsoRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<SsoRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("ssoLoginSlug", params.ssoLoginSlug().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "sso", "settings", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
