// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.workspacetags

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.workspacetags.keys.KeyCreateParams
import com.langchain.smith.models.workspacetags.keys.KeyUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class KeyServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val keyService = client.workspaceTags().keys()

        val tagKey =
            keyService.create(KeyCreateParams.builder().key("x").description("description").build())

        tagKey.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val keyService = client.workspaceTags().keys()

        val tagKey = keyService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        tagKey.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val keyService = client.workspaceTags().keys()

        val tagKey =
            keyService.update(
                KeyUpdateParams.builder()
                    .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .key("x")
                    .build()
            )

        tagKey.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val keyService = client.workspaceTags().keys()

        val tagKeys = keyService.list()

        tagKeys.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val keyService = client.workspaceTags().keys()

        keyService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
