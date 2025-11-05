// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.orgs.current.members

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.orgs.current.members.basic.BasicBatchParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BasicServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun batch() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val basicService = client.orgs().current().members().basic()

        val response =
            basicService.batch(
                BasicBatchParams.builder()
                    .addBody(
                        BasicBatchParams.Body.builder()
                            .email("email")
                            .fullName("full_name")
                            .lsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .password("password")
                            .readOnly(true)
                            .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .workspaceRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .build()
            )

        response.forEach { it.validate() }
    }
}
