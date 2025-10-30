// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current.businessinfo

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import com.langsmith_api.api.models.api.v1.orgs.current.StripeCustomerAddress
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BusinessInfoRetrieveBusinessInfoResponseTest {

    @Test
    fun create() {
        val businessInfoRetrieveBusinessInfoResponse =
            BusinessInfoRetrieveBusinessInfoResponse.builder()
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

        assertThat(businessInfoRetrieveBusinessInfoResponse.companyInfo())
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
        assertThat(businessInfoRetrieveBusinessInfoResponse.invoiceEmail())
            .contains("invoice_email")
        assertThat(businessInfoRetrieveBusinessInfoResponse.isBusiness()).contains(true)
        assertThat(businessInfoRetrieveBusinessInfoResponse.taxId())
            .contains(StripeTaxId.builder().type("type").value("value").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val businessInfoRetrieveBusinessInfoResponse =
            BusinessInfoRetrieveBusinessInfoResponse.builder()
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

        val roundtrippedBusinessInfoRetrieveBusinessInfoResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(businessInfoRetrieveBusinessInfoResponse),
                jacksonTypeRef<BusinessInfoRetrieveBusinessInfoResponse>(),
            )

        assertThat(roundtrippedBusinessInfoRetrieveBusinessInfoResponse)
            .isEqualTo(businessInfoRetrieveBusinessInfoResponse)
    }
}
