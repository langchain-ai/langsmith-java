// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.orgs

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
import com.langsmith_api.api.models.api.v1.orgs.current.CurrentConfirmCheckoutSessionCompletionParams
import com.langsmith_api.api.models.api.v1.orgs.current.CurrentConfirmCheckoutSessionCompletionResponse
import com.langsmith_api.api.models.api.v1.orgs.current.CurrentListParams
import com.langsmith_api.api.models.api.v1.orgs.current.CurrentListResponse
import com.langsmith_api.api.models.api.v1.orgs.current.CurrentPaymentMethodParams
import com.langsmith_api.api.models.api.v1.orgs.current.CurrentPaymentMethodResponse
import com.langsmith_api.api.models.api.v1.orgs.current.CurrentPlanParams
import com.langsmith_api.api.models.api.v1.orgs.current.CurrentPlanResponse
import com.langsmith_api.api.models.api.v1.orgs.current.CurrentRetrieveDashboardParams
import com.langsmith_api.api.models.api.v1.orgs.current.CurrentRetrieveDashboardResponse
import com.langsmith_api.api.models.api.v1.orgs.current.CurrentSetDefaultSsoProvisionParams
import com.langsmith_api.api.models.api.v1.orgs.current.CurrentSetDefaultSsoProvisionResponse
import com.langsmith_api.api.models.api.v1.orgs.current.CurrentSetupParams
import com.langsmith_api.api.models.api.v1.orgs.current.CurrentSetupResponse
import com.langsmith_api.api.models.api.v1.orgs.current.CurrentStripeAccountLinksParams
import com.langsmith_api.api.models.api.v1.orgs.current.CurrentStripeAccountLinksResponse
import com.langsmith_api.api.models.api.v1.orgs.current.CurrentStripeCheckoutSessionParams
import com.langsmith_api.api.models.api.v1.orgs.current.CurrentStripeCheckoutSessionResponse
import com.langsmith_api.api.models.api.v1.orgs.current.CurrentUpdateLoginMethodsParams
import com.langsmith_api.api.models.api.v1.orgs.current.CurrentUpdateLoginMethodsResponse
import com.langsmith_api.api.services.blocking.api.v1.orgs.current.BillingService
import com.langsmith_api.api.services.blocking.api.v1.orgs.current.BillingServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.orgs.current.BusinessInfoService
import com.langsmith_api.api.services.blocking.api.v1.orgs.current.BusinessInfoServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.orgs.current.InfoService
import com.langsmith_api.api.services.blocking.api.v1.orgs.current.InfoServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.orgs.current.MemberService
import com.langsmith_api.api.services.blocking.api.v1.orgs.current.MemberServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.orgs.current.PersonalAccessTokenService
import com.langsmith_api.api.services.blocking.api.v1.orgs.current.PersonalAccessTokenServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.orgs.current.RoleService
import com.langsmith_api.api.services.blocking.api.v1.orgs.current.RoleServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.orgs.current.ServiceKeyService
import com.langsmith_api.api.services.blocking.api.v1.orgs.current.ServiceKeyServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.orgs.current.SsoSettingService
import com.langsmith_api.api.services.blocking.api.v1.orgs.current.SsoSettingServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.orgs.current.UserService
import com.langsmith_api.api.services.blocking.api.v1.orgs.current.UserServiceImpl
import java.util.function.Consumer

class CurrentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CurrentService {

    private val withRawResponse: CurrentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val info: InfoService by lazy { InfoServiceImpl(clientOptions) }

    private val billing: BillingService by lazy { BillingServiceImpl(clientOptions) }

    private val businessInfo: BusinessInfoService by lazy { BusinessInfoServiceImpl(clientOptions) }

    private val roles: RoleService by lazy { RoleServiceImpl(clientOptions) }

    private val members: MemberService by lazy { MemberServiceImpl(clientOptions) }

    private val ssoSettings: SsoSettingService by lazy { SsoSettingServiceImpl(clientOptions) }

    private val user: UserService by lazy { UserServiceImpl(clientOptions) }

    private val serviceKeys: ServiceKeyService by lazy { ServiceKeyServiceImpl(clientOptions) }

    private val personalAccessTokens: PersonalAccessTokenService by lazy {
        PersonalAccessTokenServiceImpl(clientOptions)
    }

    override fun withRawResponse(): CurrentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrentService =
        CurrentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun info(): InfoService = info

    override fun billing(): BillingService = billing

    override fun businessInfo(): BusinessInfoService = businessInfo

    override fun roles(): RoleService = roles

    override fun members(): MemberService = members

    override fun ssoSettings(): SsoSettingService = ssoSettings

    override fun user(): UserService = user

    override fun serviceKeys(): ServiceKeyService = serviceKeys

    override fun personalAccessTokens(): PersonalAccessTokenService = personalAccessTokens

    override fun list(
        params: CurrentListParams,
        requestOptions: RequestOptions,
    ): CurrentListResponse =
        // get /api/v1/orgs/current
        withRawResponse().list(params, requestOptions).parse()

    override fun confirmCheckoutSessionCompletion(
        params: CurrentConfirmCheckoutSessionCompletionParams,
        requestOptions: RequestOptions,
    ): CurrentConfirmCheckoutSessionCompletionResponse =
        // post /api/v1/orgs/current/confirm_checkout_session_completion
        withRawResponse().confirmCheckoutSessionCompletion(params, requestOptions).parse()

    override fun paymentMethod(
        params: CurrentPaymentMethodParams,
        requestOptions: RequestOptions,
    ): CurrentPaymentMethodResponse =
        // post /api/v1/orgs/current/payment-method
        withRawResponse().paymentMethod(params, requestOptions).parse()

    override fun plan(
        params: CurrentPlanParams,
        requestOptions: RequestOptions,
    ): CurrentPlanResponse =
        // post /api/v1/orgs/current/plan
        withRawResponse().plan(params, requestOptions).parse()

    override fun retrieveDashboard(
        params: CurrentRetrieveDashboardParams,
        requestOptions: RequestOptions,
    ): CurrentRetrieveDashboardResponse =
        // get /api/v1/orgs/current/dashboard
        withRawResponse().retrieveDashboard(params, requestOptions).parse()

    override fun setDefaultSsoProvision(
        params: CurrentSetDefaultSsoProvisionParams,
        requestOptions: RequestOptions,
    ): CurrentSetDefaultSsoProvisionResponse =
        // post /api/v1/orgs/current/set-default-sso-provision
        withRawResponse().setDefaultSsoProvision(params, requestOptions).parse()

    override fun setup(
        params: CurrentSetupParams,
        requestOptions: RequestOptions,
    ): CurrentSetupResponse =
        // post /api/v1/orgs/current/setup
        withRawResponse().setup(params, requestOptions).parse()

    override fun stripeAccountLinks(
        params: CurrentStripeAccountLinksParams,
        requestOptions: RequestOptions,
    ): CurrentStripeAccountLinksResponse =
        // post /api/v1/orgs/current/stripe_account_links
        withRawResponse().stripeAccountLinks(params, requestOptions).parse()

    override fun stripeCheckoutSession(
        params: CurrentStripeCheckoutSessionParams,
        requestOptions: RequestOptions,
    ): CurrentStripeCheckoutSessionResponse =
        // post /api/v1/orgs/current/stripe_checkout_session
        withRawResponse().stripeCheckoutSession(params, requestOptions).parse()

    override fun updateLoginMethods(
        params: CurrentUpdateLoginMethodsParams,
        requestOptions: RequestOptions,
    ): CurrentUpdateLoginMethodsResponse =
        // patch /api/v1/orgs/current/login-methods
        withRawResponse().updateLoginMethods(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CurrentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val info: InfoService.WithRawResponse by lazy {
            InfoServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val billing: BillingService.WithRawResponse by lazy {
            BillingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val businessInfo: BusinessInfoService.WithRawResponse by lazy {
            BusinessInfoServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val roles: RoleService.WithRawResponse by lazy {
            RoleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val members: MemberService.WithRawResponse by lazy {
            MemberServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ssoSettings: SsoSettingService.WithRawResponse by lazy {
            SsoSettingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val user: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val serviceKeys: ServiceKeyService.WithRawResponse by lazy {
            ServiceKeyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val personalAccessTokens: PersonalAccessTokenService.WithRawResponse by lazy {
            PersonalAccessTokenServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CurrentService.WithRawResponse =
            CurrentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun info(): InfoService.WithRawResponse = info

        override fun billing(): BillingService.WithRawResponse = billing

        override fun businessInfo(): BusinessInfoService.WithRawResponse = businessInfo

        override fun roles(): RoleService.WithRawResponse = roles

        override fun members(): MemberService.WithRawResponse = members

        override fun ssoSettings(): SsoSettingService.WithRawResponse = ssoSettings

        override fun user(): UserService.WithRawResponse = user

        override fun serviceKeys(): ServiceKeyService.WithRawResponse = serviceKeys

        override fun personalAccessTokens(): PersonalAccessTokenService.WithRawResponse =
            personalAccessTokens

        private val listHandler: Handler<CurrentListResponse> =
            jsonHandler<CurrentListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CurrentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrentListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<CurrentConfirmCheckoutSessionCompletionResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { confirmCheckoutSessionCompletionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val paymentMethodHandler: Handler<CurrentPaymentMethodResponse> =
            jsonHandler<CurrentPaymentMethodResponse>(clientOptions.jsonMapper)

        override fun paymentMethod(
            params: CurrentPaymentMethodParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrentPaymentMethodResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "payment-method")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { paymentMethodHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val planHandler: Handler<CurrentPlanResponse> =
            jsonHandler<CurrentPlanResponse>(clientOptions.jsonMapper)

        override fun plan(
            params: CurrentPlanParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrentPlanResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "plan")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { planHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveDashboardHandler: Handler<CurrentRetrieveDashboardResponse> =
            jsonHandler<CurrentRetrieveDashboardResponse>(clientOptions.jsonMapper)

        override fun retrieveDashboard(
            params: CurrentRetrieveDashboardParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrentRetrieveDashboardResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "dashboard")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveDashboardHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val setDefaultSsoProvisionHandler: Handler<CurrentSetDefaultSsoProvisionResponse> =
            jsonHandler<CurrentSetDefaultSsoProvisionResponse>(clientOptions.jsonMapper)

        override fun setDefaultSsoProvision(
            params: CurrentSetDefaultSsoProvisionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrentSetDefaultSsoProvisionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "set-default-sso-provision")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { setDefaultSsoProvisionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val setupHandler: Handler<CurrentSetupResponse> =
            jsonHandler<CurrentSetupResponse>(clientOptions.jsonMapper)

        override fun setup(
            params: CurrentSetupParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrentSetupResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "setup")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { setupHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val stripeAccountLinksHandler: Handler<CurrentStripeAccountLinksResponse> =
            jsonHandler<CurrentStripeAccountLinksResponse>(clientOptions.jsonMapper)

        override fun stripeAccountLinks(
            params: CurrentStripeAccountLinksParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrentStripeAccountLinksResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "stripe_account_links")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { stripeAccountLinksHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val stripeCheckoutSessionHandler: Handler<CurrentStripeCheckoutSessionResponse> =
            jsonHandler<CurrentStripeCheckoutSessionResponse>(clientOptions.jsonMapper)

        override fun stripeCheckoutSession(
            params: CurrentStripeCheckoutSessionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrentStripeCheckoutSessionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "stripe_checkout_session")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { stripeCheckoutSessionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateLoginMethodsHandler: Handler<CurrentUpdateLoginMethodsResponse> =
            jsonHandler<CurrentUpdateLoginMethodsResponse>(clientOptions.jsonMapper)

        override fun updateLoginMethods(
            params: CurrentUpdateLoginMethodsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrentUpdateLoginMethodsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "login-methods")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
