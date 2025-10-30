// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.models.api.v1.usagelimits.UsageLimitType
import com.langsmith_api.api.models.api.v1.usagelimits.UsageLimitUpdateUsageLimitsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UsageLimitServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val usageLimitServiceAsync = client.api().v1().usageLimits()

        val usageLimitFuture = usageLimitServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val usageLimit = usageLimitFuture.get()
        usageLimit.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveOrg() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val usageLimitServiceAsync = client.api().v1().usageLimits()

        val usageLimitsFuture = usageLimitServiceAsync.retrieveOrg()

        val usageLimits = usageLimitsFuture.get()
        usageLimits.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveUsageLimits() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val usageLimitServiceAsync = client.api().v1().usageLimits()

        val usageLimitsFuture = usageLimitServiceAsync.retrieveUsageLimits()

        val usageLimits = usageLimitsFuture.get()
        usageLimits.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateUsageLimits() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val usageLimitServiceAsync = client.api().v1().usageLimits()

        val usageLimitFuture =
            usageLimitServiceAsync.updateUsageLimits(
                UsageLimitUpdateUsageLimitsParams.builder()
                    .limitType(UsageLimitType.MONTHLY_TRACES)
                    .limitValue(0L)
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val usageLimit = usageLimitFuture.get()
        usageLimit.validate()
    }
}
