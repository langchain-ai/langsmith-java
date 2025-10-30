// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.orgs.current

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.models.api.v1.orgs.current.StripeCustomerAddress
import com.langsmith_api.api.models.api.v1.orgs.current.businessinfo.BusinessInfoBusinessInfoParams
import com.langsmith_api.api.models.api.v1.orgs.current.businessinfo.StripeBusinessBillingInfo
import com.langsmith_api.api.models.api.v1.orgs.current.businessinfo.StripeTaxId
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BusinessInfoServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun businessInfo() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val businessInfoService = client.api().v1().orgs().current().businessInfo()

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
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val businessInfoService = client.api().v1().orgs().current().businessInfo()

        val response = businessInfoService.retrieveBusinessInfo()

        response.validate()
    }
}
