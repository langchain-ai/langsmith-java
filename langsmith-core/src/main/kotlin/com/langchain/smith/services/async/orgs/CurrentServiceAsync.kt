// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.orgs

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
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
import com.langchain.smith.services.async.orgs.current.BusinessInfoServiceAsync
import com.langchain.smith.services.async.orgs.current.InfoServiceAsync
import com.langchain.smith.services.async.orgs.current.MemberServiceAsync
import com.langchain.smith.services.async.orgs.current.PersonalAccessTokenServiceAsync
import com.langchain.smith.services.async.orgs.current.RoleServiceAsync
import com.langchain.smith.services.async.orgs.current.ServiceKeyServiceAsync
import com.langchain.smith.services.async.orgs.current.SsoSettingServiceAsync
import com.langchain.smith.services.async.orgs.current.UserServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CurrentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrentServiceAsync

    fun info(): InfoServiceAsync

    fun billing(): BillingServiceAsync

    fun businessInfo(): BusinessInfoServiceAsync

    fun roles(): RoleServiceAsync

    fun members(): MemberServiceAsync

    fun ssoSettings(): SsoSettingServiceAsync

    fun user(): UserServiceAsync

    fun serviceKeys(): ServiceKeyServiceAsync

    fun personalAccessTokens(): PersonalAccessTokenServiceAsync

    /** Get Organization Info */
    fun list(): CompletableFuture<CurrentListResponse> = list(CurrentListParams.none())

    /** @see list */
    fun list(
        params: CurrentListParams = CurrentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CurrentListResponse>

    /** @see list */
    fun list(
        params: CurrentListParams = CurrentListParams.none()
    ): CompletableFuture<CurrentListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CurrentListResponse> =
        list(CurrentListParams.none(), requestOptions)

    /** Complete a Stripe checkout session flow. */
    fun confirmCheckoutSessionCompletion(
        params: CurrentConfirmCheckoutSessionCompletionParams
    ): CompletableFuture<CurrentConfirmCheckoutSessionCompletionResponse> =
        confirmCheckoutSessionCompletion(params, RequestOptions.none())

    /** @see confirmCheckoutSessionCompletion */
    fun confirmCheckoutSessionCompletion(
        params: CurrentConfirmCheckoutSessionCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CurrentConfirmCheckoutSessionCompletionResponse>

    /** On Payment Method Created */
    fun paymentMethod(
        params: CurrentPaymentMethodParams
    ): CompletableFuture<CurrentPaymentMethodResponse> =
        paymentMethod(params, RequestOptions.none())

    /** @see paymentMethod */
    fun paymentMethod(
        params: CurrentPaymentMethodParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CurrentPaymentMethodResponse>

    /** Change Payment Plan */
    fun plan(params: CurrentPlanParams): CompletableFuture<CurrentPlanResponse> =
        plan(params, RequestOptions.none())

    /** @see plan */
    fun plan(
        params: CurrentPlanParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CurrentPlanResponse>

    /** Get Dashboard */
    fun retrieveDashboard(
        params: CurrentRetrieveDashboardParams
    ): CompletableFuture<CurrentRetrieveDashboardResponse> =
        retrieveDashboard(params, RequestOptions.none())

    /** @see retrieveDashboard */
    fun retrieveDashboard(
        params: CurrentRetrieveDashboardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CurrentRetrieveDashboardResponse>

    /**
     * Set the current organization as the default for SSO provisioning in self-hosted environments.
     */
    fun setDefaultSsoProvision(): CompletableFuture<CurrentSetDefaultSsoProvisionResponse> =
        setDefaultSsoProvision(CurrentSetDefaultSsoProvisionParams.none())

    /** @see setDefaultSsoProvision */
    fun setDefaultSsoProvision(
        params: CurrentSetDefaultSsoProvisionParams = CurrentSetDefaultSsoProvisionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CurrentSetDefaultSsoProvisionResponse>

    /** @see setDefaultSsoProvision */
    fun setDefaultSsoProvision(
        params: CurrentSetDefaultSsoProvisionParams = CurrentSetDefaultSsoProvisionParams.none()
    ): CompletableFuture<CurrentSetDefaultSsoProvisionResponse> =
        setDefaultSsoProvision(params, RequestOptions.none())

    /** @see setDefaultSsoProvision */
    fun setDefaultSsoProvision(
        requestOptions: RequestOptions
    ): CompletableFuture<CurrentSetDefaultSsoProvisionResponse> =
        setDefaultSsoProvision(CurrentSetDefaultSsoProvisionParams.none(), requestOptions)

    /** Create Customers And Get Stripe Setup Intent */
    fun setup(): CompletableFuture<CurrentSetupResponse> = setup(CurrentSetupParams.none())

    /** @see setup */
    fun setup(
        params: CurrentSetupParams = CurrentSetupParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CurrentSetupResponse>

    /** @see setup */
    fun setup(
        params: CurrentSetupParams = CurrentSetupParams.none()
    ): CompletableFuture<CurrentSetupResponse> = setup(params, RequestOptions.none())

    /** @see setup */
    fun setup(requestOptions: RequestOptions): CompletableFuture<CurrentSetupResponse> =
        setup(CurrentSetupParams.none(), requestOptions)

    /** Kick off a Stripe account link flow. */
    fun stripeAccountLinks(
        params: CurrentStripeAccountLinksParams
    ): CompletableFuture<CurrentStripeAccountLinksResponse> =
        stripeAccountLinks(params, RequestOptions.none())

    /** @see stripeAccountLinks */
    fun stripeAccountLinks(
        params: CurrentStripeAccountLinksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CurrentStripeAccountLinksResponse>

    /** Kick off a Stripe checkout session flow. */
    fun stripeCheckoutSession(
        params: CurrentStripeCheckoutSessionParams
    ): CompletableFuture<CurrentStripeCheckoutSessionResponse> =
        stripeCheckoutSession(params, RequestOptions.none())

    /** @see stripeCheckoutSession */
    fun stripeCheckoutSession(
        params: CurrentStripeCheckoutSessionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CurrentStripeCheckoutSessionResponse>

    /** Update allowed login methods for the current organization. */
    fun updateLoginMethods(
        params: CurrentUpdateLoginMethodsParams
    ): CompletableFuture<CurrentUpdateLoginMethodsResponse> =
        updateLoginMethods(params, RequestOptions.none())

    /** @see updateLoginMethods */
    fun updateLoginMethods(
        params: CurrentUpdateLoginMethodsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CurrentUpdateLoginMethodsResponse>

    /**
     * A view of [CurrentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CurrentServiceAsync.WithRawResponse

        fun info(): InfoServiceAsync.WithRawResponse

        fun billing(): BillingServiceAsync.WithRawResponse

        fun businessInfo(): BusinessInfoServiceAsync.WithRawResponse

        fun roles(): RoleServiceAsync.WithRawResponse

        fun members(): MemberServiceAsync.WithRawResponse

        fun ssoSettings(): SsoSettingServiceAsync.WithRawResponse

        fun user(): UserServiceAsync.WithRawResponse

        fun serviceKeys(): ServiceKeyServiceAsync.WithRawResponse

        fun personalAccessTokens(): PersonalAccessTokenServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/current`, but is otherwise the same as
         * [CurrentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CurrentListResponse>> =
            list(CurrentListParams.none())

        /** @see list */
        fun list(
            params: CurrentListParams = CurrentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CurrentListResponse>>

        /** @see list */
        fun list(
            params: CurrentListParams = CurrentListParams.none()
        ): CompletableFuture<HttpResponseFor<CurrentListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CurrentListResponse>> =
            list(CurrentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/orgs/current/confirm_checkout_session_completion`, but is otherwise the same as
         * [CurrentServiceAsync.confirmCheckoutSessionCompletion].
         */
        fun confirmCheckoutSessionCompletion(
            params: CurrentConfirmCheckoutSessionCompletionParams
        ): CompletableFuture<HttpResponseFor<CurrentConfirmCheckoutSessionCompletionResponse>> =
            confirmCheckoutSessionCompletion(params, RequestOptions.none())

        /** @see confirmCheckoutSessionCompletion */
        fun confirmCheckoutSessionCompletion(
            params: CurrentConfirmCheckoutSessionCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CurrentConfirmCheckoutSessionCompletionResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/current/payment-method`, but is
         * otherwise the same as [CurrentServiceAsync.paymentMethod].
         */
        fun paymentMethod(
            params: CurrentPaymentMethodParams
        ): CompletableFuture<HttpResponseFor<CurrentPaymentMethodResponse>> =
            paymentMethod(params, RequestOptions.none())

        /** @see paymentMethod */
        fun paymentMethod(
            params: CurrentPaymentMethodParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CurrentPaymentMethodResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/current/plan`, but is otherwise the
         * same as [CurrentServiceAsync.plan].
         */
        fun plan(
            params: CurrentPlanParams
        ): CompletableFuture<HttpResponseFor<CurrentPlanResponse>> =
            plan(params, RequestOptions.none())

        /** @see plan */
        fun plan(
            params: CurrentPlanParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CurrentPlanResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/current/dashboard`, but is otherwise
         * the same as [CurrentServiceAsync.retrieveDashboard].
         */
        fun retrieveDashboard(
            params: CurrentRetrieveDashboardParams
        ): CompletableFuture<HttpResponseFor<CurrentRetrieveDashboardResponse>> =
            retrieveDashboard(params, RequestOptions.none())

        /** @see retrieveDashboard */
        fun retrieveDashboard(
            params: CurrentRetrieveDashboardParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CurrentRetrieveDashboardResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/current/set-default-sso-provision`,
         * but is otherwise the same as [CurrentServiceAsync.setDefaultSsoProvision].
         */
        fun setDefaultSsoProvision():
            CompletableFuture<HttpResponseFor<CurrentSetDefaultSsoProvisionResponse>> =
            setDefaultSsoProvision(CurrentSetDefaultSsoProvisionParams.none())

        /** @see setDefaultSsoProvision */
        fun setDefaultSsoProvision(
            params: CurrentSetDefaultSsoProvisionParams =
                CurrentSetDefaultSsoProvisionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CurrentSetDefaultSsoProvisionResponse>>

        /** @see setDefaultSsoProvision */
        fun setDefaultSsoProvision(
            params: CurrentSetDefaultSsoProvisionParams = CurrentSetDefaultSsoProvisionParams.none()
        ): CompletableFuture<HttpResponseFor<CurrentSetDefaultSsoProvisionResponse>> =
            setDefaultSsoProvision(params, RequestOptions.none())

        /** @see setDefaultSsoProvision */
        fun setDefaultSsoProvision(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CurrentSetDefaultSsoProvisionResponse>> =
            setDefaultSsoProvision(CurrentSetDefaultSsoProvisionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/current/setup`, but is otherwise the
         * same as [CurrentServiceAsync.setup].
         */
        fun setup(): CompletableFuture<HttpResponseFor<CurrentSetupResponse>> =
            setup(CurrentSetupParams.none())

        /** @see setup */
        fun setup(
            params: CurrentSetupParams = CurrentSetupParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CurrentSetupResponse>>

        /** @see setup */
        fun setup(
            params: CurrentSetupParams = CurrentSetupParams.none()
        ): CompletableFuture<HttpResponseFor<CurrentSetupResponse>> =
            setup(params, RequestOptions.none())

        /** @see setup */
        fun setup(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CurrentSetupResponse>> =
            setup(CurrentSetupParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/current/stripe_account_links`, but is
         * otherwise the same as [CurrentServiceAsync.stripeAccountLinks].
         */
        fun stripeAccountLinks(
            params: CurrentStripeAccountLinksParams
        ): CompletableFuture<HttpResponseFor<CurrentStripeAccountLinksResponse>> =
            stripeAccountLinks(params, RequestOptions.none())

        /** @see stripeAccountLinks */
        fun stripeAccountLinks(
            params: CurrentStripeAccountLinksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CurrentStripeAccountLinksResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/current/stripe_checkout_session`, but
         * is otherwise the same as [CurrentServiceAsync.stripeCheckoutSession].
         */
        fun stripeCheckoutSession(
            params: CurrentStripeCheckoutSessionParams
        ): CompletableFuture<HttpResponseFor<CurrentStripeCheckoutSessionResponse>> =
            stripeCheckoutSession(params, RequestOptions.none())

        /** @see stripeCheckoutSession */
        fun stripeCheckoutSession(
            params: CurrentStripeCheckoutSessionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CurrentStripeCheckoutSessionResponse>>

        /**
         * Returns a raw HTTP response for `patch /api/v1/orgs/current/login-methods`, but is
         * otherwise the same as [CurrentServiceAsync.updateLoginMethods].
         */
        fun updateLoginMethods(
            params: CurrentUpdateLoginMethodsParams
        ): CompletableFuture<HttpResponseFor<CurrentUpdateLoginMethodsResponse>> =
            updateLoginMethods(params, RequestOptions.none())

        /** @see updateLoginMethods */
        fun updateLoginMethods(
            params: CurrentUpdateLoginMethodsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CurrentUpdateLoginMethodsResponse>>
    }
}
