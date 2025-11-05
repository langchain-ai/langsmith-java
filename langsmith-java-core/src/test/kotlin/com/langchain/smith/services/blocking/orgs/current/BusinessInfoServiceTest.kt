// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.orgs.current

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.orgs.current.StripeCustomerAddress
import com.langchain.smith.models.orgs.current.businessinfo.BusinessInfoBusinessInfoParams
import com.langchain.smith.models.orgs.current.businessinfo.StripeBusinessBillingInfo
import com.langchain.smith.models.orgs.current.businessinfo.StripeTaxId
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BusinessInfoServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun businessInfo() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val businessInfoService = client.orgs().current().businessInfo()

        val response =
            businessInfoService.businessInfo(
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

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveBusinessInfo() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val businessInfoService = client.orgs().current().businessInfo()

        val response = businessInfoService.retrieveBusinessInfo()

        response.validate()
    }
}
