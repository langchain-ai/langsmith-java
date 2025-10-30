// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.handlers.errorBodyHandler
import com.langsmith_api.api.core.handlers.errorHandler
import com.langsmith_api.api.core.handlers.jsonHandler
import com.langsmith_api.api.core.http.HttpMethod
import com.langsmith_api.api.core.http.HttpRequest
import com.langsmith_api.api.core.http.HttpResponse
import com.langsmith_api.api.core.http.HttpResponse.Handler
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.core.http.parseable
import com.langsmith_api.api.core.prepare
import com.langsmith_api.api.models.api.v1.sso.SsoRetrieveParams
import com.langsmith_api.api.models.api.v1.sso.SsoRetrieveResponse
import com.langsmith_api.api.services.blocking.api.v1.sso.EmailVerificationService
import com.langsmith_api.api.services.blocking.api.v1.sso.EmailVerificationServiceImpl
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
