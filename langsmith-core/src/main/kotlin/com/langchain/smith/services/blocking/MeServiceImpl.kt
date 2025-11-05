// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.handlers.errorBodyHandler
import com.langchain.smith.core.handlers.errorHandler
import com.langchain.smith.core.handlers.stringHandler
import com.langchain.smith.core.http.HttpMethod
import com.langchain.smith.core.http.HttpRequest
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponse.Handler
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.prepare
import com.langchain.smith.models.me.MeRetrieveLsUserIdParams
import com.langchain.smith.services.blocking.me.OnboardingStateService
import com.langchain.smith.services.blocking.me.OnboardingStateServiceImpl
import java.util.function.Consumer

class MeServiceImpl internal constructor(private val clientOptions: ClientOptions) : MeService {

    private val withRawResponse: MeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val onboardingState: OnboardingStateService by lazy {
        OnboardingStateServiceImpl(clientOptions)
    }

    override fun withRawResponse(): MeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeService =
        MeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun onboardingState(): OnboardingStateService = onboardingState

    override fun retrieveLsUserId(
        params: MeRetrieveLsUserIdParams,
        requestOptions: RequestOptions,
    ): String =
        // get /api/v1/me/ls_user_id
        withRawResponse().retrieveLsUserId(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val onboardingState: OnboardingStateService.WithRawResponse by lazy {
            OnboardingStateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MeService.WithRawResponse =
            MeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun onboardingState(): OnboardingStateService.WithRawResponse = onboardingState

        private val retrieveLsUserIdHandler: Handler<String> = stringHandler()

        override fun retrieveLsUserId(
            params: MeRetrieveLsUserIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "me", "ls_user_id")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { retrieveLsUserIdHandler.handle(it) }
            }
        }
    }
}
