// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.orgs

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.orgs.current.CurrentConfirmCheckoutSessionCompletionParams
import com.langchain.smith.models.orgs.current.CurrentPaymentMethodParams
import com.langchain.smith.models.orgs.current.CurrentPlanParams
import com.langchain.smith.models.orgs.current.CurrentRetrieveDashboardParams
import com.langchain.smith.models.orgs.current.CurrentStripeAccountLinksParams
import com.langchain.smith.models.orgs.current.CurrentStripeCheckoutSessionParams
import com.langchain.smith.models.orgs.current.CurrentUpdateLoginMethodsParams
import com.langchain.smith.models.orgs.current.StripeCustomerAddress
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CurrentServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val currentServiceAsync = client.orgs().current()

        val currentsFuture = currentServiceAsync.list()

        val currents = currentsFuture.get()
        currents.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun confirmCheckoutSessionCompletion() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val currentServiceAsync = client.orgs().current()

        val responseFuture =
            currentServiceAsync.confirmCheckoutSessionCompletion(
                CurrentConfirmCheckoutSessionCompletionParams.builder()
                    .stripeSessionId("stripe_session_id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun paymentMethod() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val currentServiceAsync = client.orgs().current()

        val responseFuture =
            currentServiceAsync.paymentMethod(
                CurrentPaymentMethodParams.builder()
                    .billingInfo(
                        CurrentPaymentMethodParams.BillingInfo.builder()
                            .address(
                                StripeCustomerAddress.builder()
                                    .city("city")
                                    .country("country")
                                    .line1("line1")
                                    .postalCode("postal_code")
                                    .line2("line2")
                                    .state("state")
                                    .build()
                            )
                            .name("name")
                            .build()
                    )
                    .setupIntent("setup_intent")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun plan() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val currentServiceAsync = client.orgs().current()

        val responseFuture =
            currentServiceAsync.plan(
                CurrentPlanParams.builder().tier(CurrentPlanParams.Tier.DISABLED).build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveDashboard() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val currentServiceAsync = client.orgs().current()

        val responseFuture =
            currentServiceAsync.retrieveDashboard(
                CurrentRetrieveDashboardParams.builder()
                    .colorScheme(CurrentRetrieveDashboardParams.ColorScheme.LIGHT)
                    .type(CurrentRetrieveDashboardParams.Type.INVOICES)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun setDefaultSsoProvision() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val currentServiceAsync = client.orgs().current()

        val responseFuture = currentServiceAsync.setDefaultSsoProvision()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun setup() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val currentServiceAsync = client.orgs().current()

        val responseFuture = currentServiceAsync.setup()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun stripeAccountLinks() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val currentServiceAsync = client.orgs().current()

        val responseFuture =
            currentServiceAsync.stripeAccountLinks(
                CurrentStripeAccountLinksParams.builder().successPath("success_path").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun stripeCheckoutSession() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val currentServiceAsync = client.orgs().current()

        val responseFuture =
            currentServiceAsync.stripeCheckoutSession(
                CurrentStripeCheckoutSessionParams.builder()
                    .amountCents(0L)
                    .successPath("success_path")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateLoginMethods() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val currentServiceAsync = client.orgs().current()

        val responseFuture =
            currentServiceAsync.updateLoginMethods(
                CurrentUpdateLoginMethodsParams.builder().ssoOnly(true).build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
