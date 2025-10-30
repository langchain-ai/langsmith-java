// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.orgs

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
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
import com.langsmith_api.api.services.blocking.api.v1.orgs.current.BusinessInfoService
import com.langsmith_api.api.services.blocking.api.v1.orgs.current.InfoService
import com.langsmith_api.api.services.blocking.api.v1.orgs.current.MemberService
import com.langsmith_api.api.services.blocking.api.v1.orgs.current.PersonalAccessTokenService
import com.langsmith_api.api.services.blocking.api.v1.orgs.current.RoleService
import com.langsmith_api.api.services.blocking.api.v1.orgs.current.ServiceKeyService
import com.langsmith_api.api.services.blocking.api.v1.orgs.current.SsoSettingService
import com.langsmith_api.api.services.blocking.api.v1.orgs.current.UserService
import java.util.function.Consumer

interface CurrentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrentService

    fun info(): InfoService

    fun billing(): BillingService

    fun businessInfo(): BusinessInfoService

    fun roles(): RoleService

    fun members(): MemberService

    fun ssoSettings(): SsoSettingService

    fun user(): UserService

    fun serviceKeys(): ServiceKeyService

    fun personalAccessTokens(): PersonalAccessTokenService

    /** Get Organization Info */
    fun list(): CurrentListResponse = list(CurrentListParams.none())

    /** @see list */
    fun list(
        params: CurrentListParams = CurrentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrentListResponse

    /** @see list */
    fun list(params: CurrentListParams = CurrentListParams.none()): CurrentListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CurrentListResponse =
        list(CurrentListParams.none(), requestOptions)

    /** Complete a Stripe checkout session flow. */
    fun confirmCheckoutSessionCompletion(
        params: CurrentConfirmCheckoutSessionCompletionParams
    ): CurrentConfirmCheckoutSessionCompletionResponse =
        confirmCheckoutSessionCompletion(params, RequestOptions.none())

    /** @see confirmCheckoutSessionCompletion */
    fun confirmCheckoutSessionCompletion(
        params: CurrentConfirmCheckoutSessionCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrentConfirmCheckoutSessionCompletionResponse

    /** On Payment Method Created */
    fun paymentMethod(params: CurrentPaymentMethodParams): CurrentPaymentMethodResponse =
        paymentMethod(params, RequestOptions.none())

    /** @see paymentMethod */
    fun paymentMethod(
        params: CurrentPaymentMethodParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrentPaymentMethodResponse

    /** Change Payment Plan */
    fun plan(params: CurrentPlanParams): CurrentPlanResponse = plan(params, RequestOptions.none())

    /** @see plan */
    fun plan(
        params: CurrentPlanParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrentPlanResponse

    /** Get Dashboard */
    fun retrieveDashboard(
        params: CurrentRetrieveDashboardParams
    ): CurrentRetrieveDashboardResponse = retrieveDashboard(params, RequestOptions.none())

    /** @see retrieveDashboard */
    fun retrieveDashboard(
        params: CurrentRetrieveDashboardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrentRetrieveDashboardResponse

    /**
     * Set the current organization as the default for SSO provisioning in self-hosted environments.
     */
    fun setDefaultSsoProvision(): CurrentSetDefaultSsoProvisionResponse =
        setDefaultSsoProvision(CurrentSetDefaultSsoProvisionParams.none())

    /** @see setDefaultSsoProvision */
    fun setDefaultSsoProvision(
        params: CurrentSetDefaultSsoProvisionParams = CurrentSetDefaultSsoProvisionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrentSetDefaultSsoProvisionResponse

    /** @see setDefaultSsoProvision */
    fun setDefaultSsoProvision(
        params: CurrentSetDefaultSsoProvisionParams = CurrentSetDefaultSsoProvisionParams.none()
    ): CurrentSetDefaultSsoProvisionResponse = setDefaultSsoProvision(params, RequestOptions.none())

    /** @see setDefaultSsoProvision */
    fun setDefaultSsoProvision(
        requestOptions: RequestOptions
    ): CurrentSetDefaultSsoProvisionResponse =
        setDefaultSsoProvision(CurrentSetDefaultSsoProvisionParams.none(), requestOptions)

    /** Create Customers And Get Stripe Setup Intent */
    fun setup(): CurrentSetupResponse = setup(CurrentSetupParams.none())

    /** @see setup */
    fun setup(
        params: CurrentSetupParams = CurrentSetupParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrentSetupResponse

    /** @see setup */
    fun setup(params: CurrentSetupParams = CurrentSetupParams.none()): CurrentSetupResponse =
        setup(params, RequestOptions.none())

    /** @see setup */
    fun setup(requestOptions: RequestOptions): CurrentSetupResponse =
        setup(CurrentSetupParams.none(), requestOptions)

    /** Kick off a Stripe account link flow. */
    fun stripeAccountLinks(
        params: CurrentStripeAccountLinksParams
    ): CurrentStripeAccountLinksResponse = stripeAccountLinks(params, RequestOptions.none())

    /** @see stripeAccountLinks */
    fun stripeAccountLinks(
        params: CurrentStripeAccountLinksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrentStripeAccountLinksResponse

    /** Kick off a Stripe checkout session flow. */
    fun stripeCheckoutSession(
        params: CurrentStripeCheckoutSessionParams
    ): CurrentStripeCheckoutSessionResponse = stripeCheckoutSession(params, RequestOptions.none())

    /** @see stripeCheckoutSession */
    fun stripeCheckoutSession(
        params: CurrentStripeCheckoutSessionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrentStripeCheckoutSessionResponse

    /** Update allowed login methods for the current organization. */
    fun updateLoginMethods(
        params: CurrentUpdateLoginMethodsParams
    ): CurrentUpdateLoginMethodsResponse = updateLoginMethods(params, RequestOptions.none())

    /** @see updateLoginMethods */
    fun updateLoginMethods(
        params: CurrentUpdateLoginMethodsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrentUpdateLoginMethodsResponse

    /** A view of [CurrentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrentService.WithRawResponse

        fun info(): InfoService.WithRawResponse

        fun billing(): BillingService.WithRawResponse

        fun businessInfo(): BusinessInfoService.WithRawResponse

        fun roles(): RoleService.WithRawResponse

        fun members(): MemberService.WithRawResponse

        fun ssoSettings(): SsoSettingService.WithRawResponse

        fun user(): UserService.WithRawResponse

        fun serviceKeys(): ServiceKeyService.WithRawResponse

        fun personalAccessTokens(): PersonalAccessTokenService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/current`, but is otherwise the same as
         * [CurrentService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CurrentListResponse> = list(CurrentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CurrentListParams = CurrentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrentListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CurrentListParams = CurrentListParams.none()
        ): HttpResponseFor<CurrentListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CurrentListResponse> =
            list(CurrentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/orgs/current/confirm_checkout_session_completion`, but is otherwise the same as
         * [CurrentService.confirmCheckoutSessionCompletion].
         */
        @MustBeClosed
        fun confirmCheckoutSessionCompletion(
            params: CurrentConfirmCheckoutSessionCompletionParams
        ): HttpResponseFor<CurrentConfirmCheckoutSessionCompletionResponse> =
            confirmCheckoutSessionCompletion(params, RequestOptions.none())

        /** @see confirmCheckoutSessionCompletion */
        @MustBeClosed
        fun confirmCheckoutSessionCompletion(
            params: CurrentConfirmCheckoutSessionCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrentConfirmCheckoutSessionCompletionResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/current/payment-method`, but is
         * otherwise the same as [CurrentService.paymentMethod].
         */
        @MustBeClosed
        fun paymentMethod(
            params: CurrentPaymentMethodParams
        ): HttpResponseFor<CurrentPaymentMethodResponse> =
            paymentMethod(params, RequestOptions.none())

        /** @see paymentMethod */
        @MustBeClosed
        fun paymentMethod(
            params: CurrentPaymentMethodParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrentPaymentMethodResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/current/plan`, but is otherwise the
         * same as [CurrentService.plan].
         */
        @MustBeClosed
        fun plan(params: CurrentPlanParams): HttpResponseFor<CurrentPlanResponse> =
            plan(params, RequestOptions.none())

        /** @see plan */
        @MustBeClosed
        fun plan(
            params: CurrentPlanParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrentPlanResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/current/dashboard`, but is otherwise
         * the same as [CurrentService.retrieveDashboard].
         */
        @MustBeClosed
        fun retrieveDashboard(
            params: CurrentRetrieveDashboardParams
        ): HttpResponseFor<CurrentRetrieveDashboardResponse> =
            retrieveDashboard(params, RequestOptions.none())

        /** @see retrieveDashboard */
        @MustBeClosed
        fun retrieveDashboard(
            params: CurrentRetrieveDashboardParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrentRetrieveDashboardResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/current/set-default-sso-provision`,
         * but is otherwise the same as [CurrentService.setDefaultSsoProvision].
         */
        @MustBeClosed
        fun setDefaultSsoProvision(): HttpResponseFor<CurrentSetDefaultSsoProvisionResponse> =
            setDefaultSsoProvision(CurrentSetDefaultSsoProvisionParams.none())

        /** @see setDefaultSsoProvision */
        @MustBeClosed
        fun setDefaultSsoProvision(
            params: CurrentSetDefaultSsoProvisionParams =
                CurrentSetDefaultSsoProvisionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrentSetDefaultSsoProvisionResponse>

        /** @see setDefaultSsoProvision */
        @MustBeClosed
        fun setDefaultSsoProvision(
            params: CurrentSetDefaultSsoProvisionParams = CurrentSetDefaultSsoProvisionParams.none()
        ): HttpResponseFor<CurrentSetDefaultSsoProvisionResponse> =
            setDefaultSsoProvision(params, RequestOptions.none())

        /** @see setDefaultSsoProvision */
        @MustBeClosed
        fun setDefaultSsoProvision(
            requestOptions: RequestOptions
        ): HttpResponseFor<CurrentSetDefaultSsoProvisionResponse> =
            setDefaultSsoProvision(CurrentSetDefaultSsoProvisionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/current/setup`, but is otherwise the
         * same as [CurrentService.setup].
         */
        @MustBeClosed
        fun setup(): HttpResponseFor<CurrentSetupResponse> = setup(CurrentSetupParams.none())

        /** @see setup */
        @MustBeClosed
        fun setup(
            params: CurrentSetupParams = CurrentSetupParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrentSetupResponse>

        /** @see setup */
        @MustBeClosed
        fun setup(
            params: CurrentSetupParams = CurrentSetupParams.none()
        ): HttpResponseFor<CurrentSetupResponse> = setup(params, RequestOptions.none())

        /** @see setup */
        @MustBeClosed
        fun setup(requestOptions: RequestOptions): HttpResponseFor<CurrentSetupResponse> =
            setup(CurrentSetupParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/current/stripe_account_links`, but is
         * otherwise the same as [CurrentService.stripeAccountLinks].
         */
        @MustBeClosed
        fun stripeAccountLinks(
            params: CurrentStripeAccountLinksParams
        ): HttpResponseFor<CurrentStripeAccountLinksResponse> =
            stripeAccountLinks(params, RequestOptions.none())

        /** @see stripeAccountLinks */
        @MustBeClosed
        fun stripeAccountLinks(
            params: CurrentStripeAccountLinksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrentStripeAccountLinksResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/current/stripe_checkout_session`, but
         * is otherwise the same as [CurrentService.stripeCheckoutSession].
         */
        @MustBeClosed
        fun stripeCheckoutSession(
            params: CurrentStripeCheckoutSessionParams
        ): HttpResponseFor<CurrentStripeCheckoutSessionResponse> =
            stripeCheckoutSession(params, RequestOptions.none())

        /** @see stripeCheckoutSession */
        @MustBeClosed
        fun stripeCheckoutSession(
            params: CurrentStripeCheckoutSessionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrentStripeCheckoutSessionResponse>

        /**
         * Returns a raw HTTP response for `patch /api/v1/orgs/current/login-methods`, but is
         * otherwise the same as [CurrentService.updateLoginMethods].
         */
        @MustBeClosed
        fun updateLoginMethods(
            params: CurrentUpdateLoginMethodsParams
        ): HttpResponseFor<CurrentUpdateLoginMethodsResponse> =
            updateLoginMethods(params, RequestOptions.none())

        /** @see updateLoginMethods */
        @MustBeClosed
        fun updateLoginMethods(
            params: CurrentUpdateLoginMethodsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrentUpdateLoginMethodsResponse>
    }
}
