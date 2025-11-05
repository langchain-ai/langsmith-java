// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.platform.orgs.current.accesspolicies

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.platform.orgs.current.accesspolicies.roles.RoleAttachParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RoleServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun attach() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val roleServiceAsync = client.platform().orgs().current().accessPolicies().roles()

        val future =
            roleServiceAsync.attach(
                RoleAttachParams.builder()
                    .roleId(JsonValue.from(mapOf<String, Any>()))
                    .payload(RoleAttachParams.Payload.builder().addAccessPolicyId("string").build())
                    .build()
            )

        val response = future.get()
    }
}
