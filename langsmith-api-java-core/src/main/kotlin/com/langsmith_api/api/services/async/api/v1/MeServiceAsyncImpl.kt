// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

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
import com.langsmith_api.api.core.prepareAsync
import com.langsmith_api.api.models.api.v1.me.MeRetrieveLsUserIdParams
import com.langsmith_api.api.services.async.api.v1.me.OnboardingStateServiceAsync
import com.langsmith_api.api.services.async.api.v1.me.OnboardingStateServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class MeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MeServiceAsync {

    private val withRawResponse: MeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val onboardingState: OnboardingStateServiceAsync by lazy {
        OnboardingStateServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): MeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeServiceAsync =
        MeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun onboardingState(): OnboardingStateServiceAsync = onboardingState

    override fun retrieveLsUserId(
        params: MeRetrieveLsUserIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /api/v1/me/ls_user_id
        withRawResponse().retrieveLsUserId(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val onboardingState: OnboardingStateServiceAsync.WithRawResponse by lazy {
            OnboardingStateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MeServiceAsync.WithRawResponse =
            MeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun onboardingState(): OnboardingStateServiceAsync.WithRawResponse =
            onboardingState

        private val retrieveLsUserIdHandler: Handler<String> = stringHandler()

        override fun retrieveLsUserId(
            params: MeRetrieveLsUserIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "me", "ls_user_id")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { retrieveLsUserIdHandler.handle(it) }
                    }
                }
        }
    }
}
