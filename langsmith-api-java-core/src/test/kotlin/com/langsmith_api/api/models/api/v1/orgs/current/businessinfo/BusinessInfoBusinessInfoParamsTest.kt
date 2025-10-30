// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current.businessinfo

import com.langsmith_api.api.models.api.v1.orgs.current.StripeCustomerAddress
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BusinessInfoBusinessInfoParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.companyInfo())
            .contains(
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
        assertThat(body.invoiceEmail()).contains("invoice_email")
        assertThat(body.isBusiness()).contains(true)
        assertThat(body.taxId()).contains(StripeTaxId.builder().type("type").value("value").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BusinessInfoBusinessInfoParams.builder().build()

        val body = params._body()
    }
}
