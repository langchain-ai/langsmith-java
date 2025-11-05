// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.orgs.current

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.orgs.current.billing.BillingRetrieveUsageParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BillingServiceAsyncTest {

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
        val billingServiceAsync = client.orgs().current().billing()

        val billingsFuture = billingServiceAsync.list()

        val billings = billingsFuture.get()
        billings.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveUsage() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val billingServiceAsync = client.orgs().current().billing()

        val responseFuture =
            billingServiceAsync.retrieveUsage(
                BillingRetrieveUsageParams.builder()
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onCurrentPlan(true)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
