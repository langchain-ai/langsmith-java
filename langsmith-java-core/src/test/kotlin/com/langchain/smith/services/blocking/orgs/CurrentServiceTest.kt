// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.orgs

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
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
internal class CurrentServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val currentService = client.orgs().current()

        val currents = currentService.list()

        currents.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun confirmCheckoutSessionCompletion() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val currentService = client.orgs().current()

        val response =
            currentService.confirmCheckoutSessionCompletion(
                CurrentConfirmCheckoutSessionCompletionParams.builder()
                    .stripeSessionId("stripe_session_id")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun paymentMethod() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val currentService = client.orgs().current()

        val response =
            currentService.paymentMethod(
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

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun plan() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val currentService = client.orgs().current()

        val response =
            currentService.plan(
                CurrentPlanParams.builder().tier(CurrentPlanParams.Tier.DISABLED).build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveDashboard() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val currentService = client.orgs().current()

        val response =
            currentService.retrieveDashboard(
                CurrentRetrieveDashboardParams.builder()
                    .colorScheme(CurrentRetrieveDashboardParams.ColorScheme.LIGHT)
                    .type(CurrentRetrieveDashboardParams.Type.INVOICES)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun setDefaultSsoProvision() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val currentService = client.orgs().current()

        val response = currentService.setDefaultSsoProvision()

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun setup() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val currentService = client.orgs().current()

        val response = currentService.setup()

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun stripeAccountLinks() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val currentService = client.orgs().current()

        val response =
            currentService.stripeAccountLinks(
                CurrentStripeAccountLinksParams.builder().successPath("success_path").build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun stripeCheckoutSession() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val currentService = client.orgs().current()

        val response =
            currentService.stripeCheckoutSession(
                CurrentStripeCheckoutSessionParams.builder()
                    .amountCents(0L)
                    .successPath("success_path")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateLoginMethods() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val currentService = client.orgs().current()

        val response =
            currentService.updateLoginMethods(
                CurrentUpdateLoginMethodsParams.builder().ssoOnly(true).build()
            )

        response.validate()
    }
}
