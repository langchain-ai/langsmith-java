// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.handlers.errorBodyHandler
import com.langsmith_api.api.core.handlers.errorHandler
import com.langsmith_api.api.core.handlers.stringHandler
import com.langsmith_api.api.core.http.HttpMethod
import com.langsmith_api.api.core.http.HttpRequest
import com.langsmith_api.api.core.http.HttpResponse
import com.langsmith_api.api.core.http.HttpResponse.Handler
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.core.http.parseable
import com.langsmith_api.api.core.prepare
import com.langsmith_api.api.models.api.v1.me.MeRetrieveLsUserIdParams
import com.langsmith_api.api.services.blocking.api.v1.me.OnboardingStateService
import com.langsmith_api.api.services.blocking.api.v1.me.OnboardingStateServiceImpl
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
