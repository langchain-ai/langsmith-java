// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.workspaces.current.tagkeys

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.tagvalues.TagValueDeleteParams
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.tagvalues.TagValueRetrieveParams
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.tagvalues.TagValueTagValuesParams
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.tagvalues.TagValueUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TagValueServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagValueService = client.api().v1().workspaces().current().tagKeys().tagValues()

        val tagValue =
            tagValueService.retrieve(
                TagValueRetrieveParams.builder()
                    .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        tagValue.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagValueService = client.api().v1().workspaces().current().tagKeys().tagValues()

        val tagValue =
            tagValueService.update(
                TagValueUpdateParams.builder()
                    .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .value("x")
                    .build()
            )

        tagValue.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagValueService = client.api().v1().workspaces().current().tagKeys().tagValues()

        val tagValue =
            tagValueService.delete(
                TagValueDeleteParams.builder()
                    .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        tagValue.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveTagValues() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagValueService = client.api().v1().workspaces().current().tagKeys().tagValues()

        val tagValues = tagValueService.retrieveTagValues("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        tagValues.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun tagValues() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagValueService = client.api().v1().workspaces().current().tagKeys().tagValues()

        val tagValue =
            tagValueService.tagValues(
                TagValueTagValuesParams.builder()
                    .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .value("x")
                    .description("description")
                    .build()
            )

        tagValue.validate()
    }
}
