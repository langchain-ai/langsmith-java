// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.orgs

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
import com.langchain.smith.models.orgs.current.CurrentConfirmCheckoutSessionCompletionParams
import com.langchain.smith.models.orgs.current.CurrentConfirmCheckoutSessionCompletionResponse
import com.langchain.smith.models.orgs.current.CurrentListParams
import com.langchain.smith.models.orgs.current.CurrentListResponse
import com.langchain.smith.models.orgs.current.CurrentPaymentMethodParams
import com.langchain.smith.models.orgs.current.CurrentPaymentMethodResponse
import com.langchain.smith.models.orgs.current.CurrentPlanParams
import com.langchain.smith.models.orgs.current.CurrentPlanResponse
import com.langchain.smith.models.orgs.current.CurrentRetrieveDashboardParams
import com.langchain.smith.models.orgs.current.CurrentRetrieveDashboardResponse
import com.langchain.smith.models.orgs.current.CurrentSetDefaultSsoProvisionParams
import com.langchain.smith.models.orgs.current.CurrentSetDefaultSsoProvisionResponse
import com.langchain.smith.models.orgs.current.CurrentSetupParams
import com.langchain.smith.models.orgs.current.CurrentSetupResponse
import com.langchain.smith.models.orgs.current.CurrentStripeAccountLinksParams
import com.langchain.smith.models.orgs.current.CurrentStripeAccountLinksResponse
import com.langchain.smith.models.orgs.current.CurrentStripeCheckoutSessionParams
import com.langchain.smith.models.orgs.current.CurrentStripeCheckoutSessionResponse
import com.langchain.smith.models.orgs.current.CurrentUpdateLoginMethodsParams
import com.langchain.smith.models.orgs.current.CurrentUpdateLoginMethodsResponse
import com.langchain.smith.services.async.orgs.current.BillingServiceAsync
import com.langchain.smith.services.async.orgs.current.BillingServiceAsyncImpl
import com.langchain.smith.services.async.orgs.current.BusinessInfoServiceAsync
import com.langchain.smith.services.async.orgs.current.BusinessInfoServiceAsyncImpl
import com.langchain.smith.services.async.orgs.current.InfoServiceAsync
import com.langchain.smith.services.async.orgs.current.InfoServiceAsyncImpl
import com.langchain.smith.services.async.orgs.current.MemberServiceAsync
import com.langchain.smith.services.async.orgs.current.MemberServiceAsyncImpl
import com.langchain.smith.services.async.orgs.current.PersonalAccessTokenServiceAsync
import com.langchain.smith.services.async.orgs.current.PersonalAccessTokenServiceAsyncImpl
import com.langchain.smith.services.async.orgs.current.RoleServiceAsync
import com.langchain.smith.services.async.orgs.current.RoleServiceAsyncImpl
import com.langchain.smith.services.async.orgs.current.ServiceKeyServiceAsync
import com.langchain.smith.services.async.orgs.current.ServiceKeyServiceAsyncImpl
import com.langchain.smith.services.async.orgs.current.SsoSettingServiceAsync
import com.langchain.smith.services.async.orgs.current.SsoSettingServiceAsyncImpl
import com.langchain.smith.services.async.orgs.current.UserServiceAsync
import com.langchain.smith.services.async.orgs.current.UserServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class CurrentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CurrentServiceAsync {

    private val withRawResponse: CurrentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val info: InfoServiceAsync by lazy { InfoServiceAsyncImpl(clientOptions) }

    private val billing: BillingServiceAsync by lazy { BillingServiceAsyncImpl(clientOptions) }

    private val businessInfo: BusinessInfoServiceAsync by lazy {
        BusinessInfoServiceAsyncImpl(clientOptions)
    }

    private val roles: RoleServiceAsync by lazy { RoleServiceAsyncImpl(clientOptions) }

    private val members: MemberServiceAsync by lazy { MemberServiceAsyncImpl(clientOptions) }

    private val ssoSettings: SsoSettingServiceAsync by lazy {
        SsoSettingServiceAsyncImpl(clientOptions)
    }

    private val user: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptions) }

    private val serviceKeys: ServiceKeyServiceAsync by lazy {
        ServiceKeyServiceAsyncImpl(clientOptions)
    }

    private val personalAccessTokens: PersonalAccessTokenServiceAsync by lazy {
        PersonalAccessTokenServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): CurrentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrentServiceAsync =
        CurrentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun info(): InfoServiceAsync = info

    override fun billing(): BillingServiceAsync = billing

    override fun businessInfo(): BusinessInfoServiceAsync = businessInfo

    override fun roles(): RoleServiceAsync = roles

    override fun members(): MemberServiceAsync = members

    override fun ssoSettings(): SsoSettingServiceAsync = ssoSettings

    override fun user(): UserServiceAsync = user

    override fun serviceKeys(): ServiceKeyServiceAsync = serviceKeys

    override fun personalAccessTokens(): PersonalAccessTokenServiceAsync = personalAccessTokens

    override fun list(
        params: CurrentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CurrentListResponse> =
        // get /api/v1/orgs/current
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun confirmCheckoutSessionCompletion(
        params: CurrentConfirmCheckoutSessionCompletionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CurrentConfirmCheckoutSessionCompletionResponse> =
        // post /api/v1/orgs/current/confirm_checkout_session_completion
        withRawResponse().confirmCheckoutSessionCompletion(params, requestOptions).thenApply {
            it.parse()
        }

    override fun paymentMethod(
        params: CurrentPaymentMethodParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CurrentPaymentMethodResponse> =
        // post /api/v1/orgs/current/payment-method
        withRawResponse().paymentMethod(params, requestOptions).thenApply { it.parse() }

    override fun plan(
        params: CurrentPlanParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CurrentPlanResponse> =
        // post /api/v1/orgs/current/plan
        withRawResponse().plan(params, requestOptions).thenApply { it.parse() }

    override fun retrieveDashboard(
        params: CurrentRetrieveDashboardParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CurrentRetrieveDashboardResponse> =
        // get /api/v1/orgs/current/dashboard
        withRawResponse().retrieveDashboard(params, requestOptions).thenApply { it.parse() }

    override fun setDefaultSsoProvision(
        params: CurrentSetDefaultSsoProvisionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CurrentSetDefaultSsoProvisionResponse> =
        // post /api/v1/orgs/current/set-default-sso-provision
        withRawResponse().setDefaultSsoProvision(params, requestOptions).thenApply { it.parse() }

    override fun setup(
        params: CurrentSetupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CurrentSetupResponse> =
        // post /api/v1/orgs/current/setup
        withRawResponse().setup(params, requestOptions).thenApply { it.parse() }

    override fun stripeAccountLinks(
        params: CurrentStripeAccountLinksParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CurrentStripeAccountLinksResponse> =
        // post /api/v1/orgs/current/stripe_account_links
        withRawResponse().stripeAccountLinks(params, requestOptions).thenApply { it.parse() }

    override fun stripeCheckoutSession(
        params: CurrentStripeCheckoutSessionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CurrentStripeCheckoutSessionResponse> =
        // post /api/v1/orgs/current/stripe_checkout_session
        withRawResponse().stripeCheckoutSession(params, requestOptions).thenApply { it.parse() }

    override fun updateLoginMethods(
        params: CurrentUpdateLoginMethodsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CurrentUpdateLoginMethodsResponse> =
        // patch /api/v1/orgs/current/login-methods
        withRawResponse().updateLoginMethods(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CurrentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val info: InfoServiceAsync.WithRawResponse by lazy {
            InfoServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val billing: BillingServiceAsync.WithRawResponse by lazy {
            BillingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val businessInfo: BusinessInfoServiceAsync.WithRawResponse by lazy {
            BusinessInfoServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val roles: RoleServiceAsync.WithRawResponse by lazy {
            RoleServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val members: MemberServiceAsync.WithRawResponse by lazy {
            MemberServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ssoSettings: SsoSettingServiceAsync.WithRawResponse by lazy {
            SsoSettingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val user: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val serviceKeys: ServiceKeyServiceAsync.WithRawResponse by lazy {
            ServiceKeyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val personalAccessTokens: PersonalAccessTokenServiceAsync.WithRawResponse by lazy {
            PersonalAccessTokenServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CurrentServiceAsync.WithRawResponse =
            CurrentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun info(): InfoServiceAsync.WithRawResponse = info

        override fun billing(): BillingServiceAsync.WithRawResponse = billing

        override fun businessInfo(): BusinessInfoServiceAsync.WithRawResponse = businessInfo

        override fun roles(): RoleServiceAsync.WithRawResponse = roles

        override fun members(): MemberServiceAsync.WithRawResponse = members

        override fun ssoSettings(): SsoSettingServiceAsync.WithRawResponse = ssoSettings

        override fun user(): UserServiceAsync.WithRawResponse = user

        override fun serviceKeys(): ServiceKeyServiceAsync.WithRawResponse = serviceKeys

        override fun personalAccessTokens(): PersonalAccessTokenServiceAsync.WithRawResponse =
            personalAccessTokens

        private val listHandler: Handler<CurrentListResponse> =
            jsonHandler<CurrentListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CurrentListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CurrentListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current")
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

        private val confirmCheckoutSessionCompletionHandler:
            Handler<CurrentConfirmCheckoutSessionCompletionResponse> =
            jsonHandler<CurrentConfirmCheckoutSessionCompletionResponse>(clientOptions.jsonMapper)

        override fun confirmCheckoutSessionCompletion(
            params: CurrentConfirmCheckoutSessionCompletionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CurrentConfirmCheckoutSessionCompletionResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "orgs",
                        "current",
                        "confirm_checkout_session_completion",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { confirmCheckoutSessionCompletionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val paymentMethodHandler: Handler<CurrentPaymentMethodResponse> =
            jsonHandler<CurrentPaymentMethodResponse>(clientOptions.jsonMapper)

        override fun paymentMethod(
            params: CurrentPaymentMethodParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CurrentPaymentMethodResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "payment-method")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { paymentMethodHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val planHandler: Handler<CurrentPlanResponse> =
            jsonHandler<CurrentPlanResponse>(clientOptions.jsonMapper)

        override fun plan(
            params: CurrentPlanParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CurrentPlanResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "plan")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { planHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveDashboardHandler: Handler<CurrentRetrieveDashboardResponse> =
            jsonHandler<CurrentRetrieveDashboardResponse>(clientOptions.jsonMapper)

        override fun retrieveDashboard(
            params: CurrentRetrieveDashboardParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CurrentRetrieveDashboardResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "dashboard")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveDashboardHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val setDefaultSsoProvisionHandler: Handler<CurrentSetDefaultSsoProvisionResponse> =
            jsonHandler<CurrentSetDefaultSsoProvisionResponse>(clientOptions.jsonMapper)

        override fun setDefaultSsoProvision(
            params: CurrentSetDefaultSsoProvisionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CurrentSetDefaultSsoProvisionResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "set-default-sso-provision")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { setDefaultSsoProvisionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val setupHandler: Handler<CurrentSetupResponse> =
            jsonHandler<CurrentSetupResponse>(clientOptions.jsonMapper)

        override fun setup(
            params: CurrentSetupParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CurrentSetupResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "setup")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { setupHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val stripeAccountLinksHandler: Handler<CurrentStripeAccountLinksResponse> =
            jsonHandler<CurrentStripeAccountLinksResponse>(clientOptions.jsonMapper)

        override fun stripeAccountLinks(
            params: CurrentStripeAccountLinksParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CurrentStripeAccountLinksResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "stripe_account_links")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { stripeAccountLinksHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val stripeCheckoutSessionHandler: Handler<CurrentStripeCheckoutSessionResponse> =
            jsonHandler<CurrentStripeCheckoutSessionResponse>(clientOptions.jsonMapper)

        override fun stripeCheckoutSession(
            params: CurrentStripeCheckoutSessionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CurrentStripeCheckoutSessionResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "stripe_checkout_session")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { stripeCheckoutSessionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateLoginMethodsHandler: Handler<CurrentUpdateLoginMethodsResponse> =
            jsonHandler<CurrentUpdateLoginMethodsResponse>(clientOptions.jsonMapper)

        override fun updateLoginMethods(
            params: CurrentUpdateLoginMethodsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CurrentUpdateLoginMethodsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "login-methods")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateLoginMethodsHandler.handle(it) }
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
