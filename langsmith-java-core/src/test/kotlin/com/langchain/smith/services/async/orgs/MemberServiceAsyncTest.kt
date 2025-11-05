// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.orgs

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.orgs.members.MemberUpdateBasicParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MemberServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun updateBasic() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val memberServiceAsync = client.orgs().members()

        val responseFuture =
            memberServiceAsync.updateBasic(
                MemberUpdateBasicParams.builder().fullName("full_name").password("password").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
