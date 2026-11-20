// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.workspacetags.keys

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.workspacetags.keys.values.ValueCreateParams
import com.langchain.smith.models.workspacetags.keys.values.ValueDeleteParams
import com.langchain.smith.models.workspacetags.keys.values.ValueRetrieveParams
import com.langchain.smith.models.workspacetags.keys.values.ValueUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ValueServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val valueServiceAsync = client.workspaceTags().keys().values()

        val tagValueFuture =
            valueServiceAsync.create(
                ValueCreateParams.builder()
                    .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .value("x")
                    .description("description")
                    .build()
            )

        val tagValue = tagValueFuture.get()
        tagValue.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val valueServiceAsync = client.workspaceTags().keys().values()

        val tagValueFuture =
            valueServiceAsync.retrieve(
                ValueRetrieveParams.builder()
                    .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val tagValue = tagValueFuture.get()
        tagValue.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val valueServiceAsync = client.workspaceTags().keys().values()

        val tagValueFuture =
            valueServiceAsync.update(
                ValueUpdateParams.builder()
                    .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .value("x")
                    .build()
            )

        val tagValue = tagValueFuture.get()
        tagValue.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val valueServiceAsync = client.workspaceTags().keys().values()

        val tagValuesFuture = valueServiceAsync.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val tagValues = tagValuesFuture.get()
        tagValues.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val valueServiceAsync = client.workspaceTags().keys().values()

        val future =
            valueServiceAsync.delete(
                ValueDeleteParams.builder()
                    .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = future.get()
    }
}
