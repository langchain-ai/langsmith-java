// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.tenants.members

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PendingServiceTest {

    @Test
    fun callDelete() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val pendingService = client.tenants().members().pending()
        val tenantMemberPendingDeleteResponse =
            pendingService.delete(
                TenantMemberPendingDeleteParams.builder()
                    .identityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(tenantMemberPendingDeleteResponse)
    }
}
