// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.workspacetags

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.workspacetags.keys.KeyCreateParams
import com.langchain.smith.models.workspacetags.keys.KeyUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class KeyServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val keyServiceAsync = client.workspaceTags().keys()

        val tagKeyFuture =
            keyServiceAsync.create(
                KeyCreateParams.builder().key("x").description("description").build()
            )

        val tagKey = tagKeyFuture.get()
        tagKey.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val keyServiceAsync = client.workspaceTags().keys()

        val tagKeyFuture = keyServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val tagKey = tagKeyFuture.get()
        tagKey.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val keyServiceAsync = client.workspaceTags().keys()

        val tagKeyFuture =
            keyServiceAsync.update(
                KeyUpdateParams.builder()
                    .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .key("x")
                    .build()
            )

        val tagKey = tagKeyFuture.get()
        tagKey.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val keyServiceAsync = client.workspaceTags().keys()

        val tagKeysFuture = keyServiceAsync.list()

        val tagKeys = tagKeysFuture.get()
        tagKeys.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val keyServiceAsync = client.workspaceTags().keys()

        val future = keyServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }
}
