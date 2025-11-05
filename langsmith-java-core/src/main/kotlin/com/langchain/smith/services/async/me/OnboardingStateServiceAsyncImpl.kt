// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.me

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
import com.langchain.smith.core.http.json
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.prepareAsync
import com.langchain.smith.models.me.onboardingstate.OnboardingStateCreateParams
import com.langchain.smith.models.me.onboardingstate.OnboardingStateListParams
import com.langchain.smith.models.me.onboardingstate.OnboardingStateUpdateParams
import com.langchain.smith.models.me.onboardingstate.UserOnboardingStateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OnboardingStateServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : OnboardingStateServiceAsync {

    private val withRawResponse: OnboardingStateServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OnboardingStateServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): OnboardingStateServiceAsync =
        OnboardingStateServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: OnboardingStateCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserOnboardingStateResponse> =
        // post /api/v1/me/onboarding_state
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: OnboardingStateUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserOnboardingStateResponse> =
        // put /api/v1/me/onboarding_state/{field}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: OnboardingStateListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserOnboardingStateResponse> =
        // get /api/v1/me/onboarding_state
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OnboardingStateServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OnboardingStateServiceAsync.WithRawResponse =
            OnboardingStateServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<UserOnboardingStateResponse> =
            jsonHandler<UserOnboardingStateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: OnboardingStateCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserOnboardingStateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "me", "onboarding_state")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<UserOnboardingStateResponse> =
            jsonHandler<UserOnboardingStateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: OnboardingStateUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserOnboardingStateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("field", params.field().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "me", "onboarding_state", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<UserOnboardingStateResponse> =
            jsonHandler<UserOnboardingStateResponse>(clientOptions.jsonMapper)

        override fun list(
            params: OnboardingStateListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserOnboardingStateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "me", "onboarding_state")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
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
