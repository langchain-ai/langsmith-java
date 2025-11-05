// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.orgs.current

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.orgs.current.StripeCustomerAddress
import com.langchain.smith.models.orgs.current.businessinfo.BusinessInfoBusinessInfoParams
import com.langchain.smith.models.orgs.current.businessinfo.StripeBusinessBillingInfo
import com.langchain.smith.models.orgs.current.businessinfo.StripeTaxId
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BusinessInfoServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun businessInfo() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val businessInfoServiceAsync = client.orgs().current().businessInfo()

        val responseFuture =
            businessInfoServiceAsync.businessInfo(
                BusinessInfoBusinessInfoParams.builder()
                    .companyInfo(
                        StripeBusinessBillingInfo.builder()
                            .name("name")
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
                            .build()
                    )
                    .invoiceEmail("invoice_email")
                    .isBusiness(true)
                    .taxId(StripeTaxId.builder().type("type").value("value").build())
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveBusinessInfo() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val businessInfoServiceAsync = client.orgs().current().businessInfo()

        val responseFuture = businessInfoServiceAsync.retrieveBusinessInfo()

        val response = responseFuture.get()
        response.validate()
    }
}
