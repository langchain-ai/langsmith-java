// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.platform.orgs.current.accesspolicies

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.platform.orgs.current.accesspolicies.roles.RoleAttachParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RoleServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun attach() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val roleService = client.platform().orgs().current().accessPolicies().roles()

        roleService.attach(
            RoleAttachParams.builder()
                .roleId(JsonValue.from(mapOf<String, Any>()))
                .payload(RoleAttachParams.Payload.builder().addAccessPolicyId("string").build())
                .build()
        )
    }
}
