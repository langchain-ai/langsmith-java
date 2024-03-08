// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.tenants

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class MemberServiceTest {

    @Test
    fun callDelete() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val memberService = client.tenants().members()
        val tenantMemberDeleteResponse =
            memberService.delete(
                TenantMemberDeleteParams.builder()
                    .identityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(tenantMemberDeleteResponse)
    }
}
