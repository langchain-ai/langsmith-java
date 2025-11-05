// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.orgs.current

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UserServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveLoginMethods() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val userService = client.orgs().current().user()

        val providerUserSlims = userService.retrieveLoginMethods()

        providerUserSlims.forEach { it.validate() }
    }
}
