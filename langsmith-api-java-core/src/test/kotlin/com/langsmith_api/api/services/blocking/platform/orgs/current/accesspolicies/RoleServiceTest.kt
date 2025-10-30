// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.platform.orgs.current.accesspolicies

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.models.platform.orgs.current.accesspolicies.roles.RoleAttachParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RoleServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun attach() {
        val client =
            LangsmithApiOkHttpClient.builder()
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
