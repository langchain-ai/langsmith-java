// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.orgs

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.orgs.members.MemberUpdateBasicParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MemberServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun updateBasic() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val memberService = client.orgs().members()

        val response =
            memberService.updateBasic(
                MemberUpdateBasicParams.builder().fullName("full_name").password("password").build()
            )

        response.validate()
    }
}
