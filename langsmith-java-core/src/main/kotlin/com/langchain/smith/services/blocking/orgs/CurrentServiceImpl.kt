// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.orgs

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
import com.langchain.smith.services.blocking.orgs.current.BillingService
import com.langchain.smith.services.blocking.orgs.current.BillingServiceImpl
import com.langchain.smith.services.blocking.orgs.current.BusinessInfoService
import com.langchain.smith.services.blocking.orgs.current.BusinessInfoServiceImpl
import com.langchain.smith.services.blocking.orgs.current.InfoService
import com.langchain.smith.services.blocking.orgs.current.InfoServiceImpl
import com.langchain.smith.services.blocking.orgs.current.MemberService
import com.langchain.smith.services.blocking.orgs.current.MemberServiceImpl
import com.langchain.smith.services.blocking.orgs.current.PersonalAccessTokenService
import com.langchain.smith.services.blocking.orgs.current.PersonalAccessTokenServiceImpl
import com.langchain.smith.services.blocking.orgs.current.RoleService
import com.langchain.smith.services.blocking.orgs.current.RoleServiceImpl
import com.langchain.smith.services.blocking.orgs.current.ServiceKeyService
import com.langchain.smith.services.blocking.orgs.current.ServiceKeyServiceImpl
import com.langchain.smith.services.blocking.orgs.current.SsoSettingService
import com.langchain.smith.services.blocking.orgs.current.SsoSettingServiceImpl
import com.langchain.smith.services.blocking.orgs.current.UserService
import com.langchain.smith.services.blocking.orgs.current.UserServiceImpl
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
