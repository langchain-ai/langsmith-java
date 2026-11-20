// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.workspacetags.keys

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.workspacetags.keys.values.ValueCreateParams
import com.langchain.smith.models.workspacetags.keys.values.ValueDeleteParams
import com.langchain.smith.models.workspacetags.keys.values.ValueRetrieveParams
import com.langchain.smith.models.workspacetags.keys.values.ValueUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ValueServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val valueService = client.workspaceTags().keys().values()

        val tagValue =
            valueService.create(
                ValueCreateParams.builder()
                    .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .value("x")
                    .description("description")
                    .build()
            )

        tagValue.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val valueService = client.workspaceTags().keys().values()

        val tagValue =
            valueService.retrieve(
                ValueRetrieveParams.builder()
                    .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        tagValue.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val valueService = client.workspaceTags().keys().values()

        val tagValue =
            valueService.update(
                ValueUpdateParams.builder()
                    .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .value("x")
                    .build()
            )

        tagValue.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val valueService = client.workspaceTags().keys().values()

        val tagValues = valueService.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        tagValues.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val valueService = client.workspaceTags().keys().values()

        valueService.delete(
            ValueDeleteParams.builder()
                .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }
}
