// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.workspaces.current.tagkeys

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.tagvalues.TagValueDeleteParams
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.tagvalues.TagValueRetrieveParams
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.tagvalues.TagValueTagValuesParams
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.tagvalues.TagValueUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TagValueServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagValueServiceAsync = client.api().v1().workspaces().current().tagKeys().tagValues()

        val tagValueFuture =
            tagValueServiceAsync.retrieve(
                TagValueRetrieveParams.builder()
                    .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val tagValue = tagValueFuture.get()
        tagValue.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagValueServiceAsync = client.api().v1().workspaces().current().tagKeys().tagValues()

        val tagValueFuture =
            tagValueServiceAsync.update(
                TagValueUpdateParams.builder()
                    .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .value("x")
                    .build()
            )

        val tagValue = tagValueFuture.get()
        tagValue.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagValueServiceAsync = client.api().v1().workspaces().current().tagKeys().tagValues()

        val tagValueFuture =
            tagValueServiceAsync.delete(
                TagValueDeleteParams.builder()
                    .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val tagValue = tagValueFuture.get()
        tagValue.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveTagValues() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagValueServiceAsync = client.api().v1().workspaces().current().tagKeys().tagValues()

        val tagValuesFuture =
            tagValueServiceAsync.retrieveTagValues("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val tagValues = tagValuesFuture.get()
        tagValues.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun tagValues() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagValueServiceAsync = client.api().v1().workspaces().current().tagKeys().tagValues()

        val tagValueFuture =
            tagValueServiceAsync.tagValues(
                TagValueTagValuesParams.builder()
                    .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .value("x")
                    .description("description")
                    .build()
            )

        val tagValue = tagValueFuture.get()
        tagValue.validate()
    }
}
