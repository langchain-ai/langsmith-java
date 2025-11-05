// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.orgs.current

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UserServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveLoginMethods() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val userServiceAsync = client.orgs().current().user()

        val providerUserSlimsFuture = userServiceAsync.retrieveLoginMethods()

        val providerUserSlims = providerUserSlimsFuture.get()
        providerUserSlims.forEach { it.validate() }
    }
}
