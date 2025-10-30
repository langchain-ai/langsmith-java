// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.models.api.v1.usagelimits.UsageLimitType
import com.langsmith_api.api.models.api.v1.usagelimits.UsageLimitUpdateUsageLimitsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UsageLimitServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val usageLimitService = client.api().v1().usageLimits()

        val usageLimit = usageLimitService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        usageLimit.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveOrg() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val usageLimitService = client.api().v1().usageLimits()

        val usageLimits = usageLimitService.retrieveOrg()

        usageLimits.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveUsageLimits() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val usageLimitService = client.api().v1().usageLimits()

        val usageLimits = usageLimitService.retrieveUsageLimits()

        usageLimits.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateUsageLimits() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val usageLimitService = client.api().v1().usageLimits()

        val usageLimit =
            usageLimitService.updateUsageLimits(
                UsageLimitUpdateUsageLimitsParams.builder()
                    .limitType(UsageLimitType.MONTHLY_TRACES)
                    .limitValue(0L)
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        usageLimit.validate()
    }
}
