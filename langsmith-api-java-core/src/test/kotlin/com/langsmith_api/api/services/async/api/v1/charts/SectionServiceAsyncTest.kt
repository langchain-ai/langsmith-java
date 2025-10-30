// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.charts

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.models.api.v1.charts.section.CustomChartsSectionCreate
import com.langsmith_api.api.models.api.v1.charts.section.CustomChartsSectionUpdate
import com.langsmith_api.api.models.api.v1.charts.section.SectionCloneParams
import com.langsmith_api.api.models.api.v1.charts.section.SectionListParams
import com.langsmith_api.api.models.api.v1.charts.section.SectionUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SectionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val sectionServiceAsync = client.api().v1().charts().section()

        val customChartsSectionResponseFuture =
            sectionServiceAsync.create(
                CustomChartsSectionCreate.builder()
                    .title("title")
                    .description("description")
                    .index(0L)
                    .build()
            )

        val customChartsSectionResponse = customChartsSectionResponseFuture.get()
        customChartsSectionResponse.validate()
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
        val sectionServiceAsync = client.api().v1().charts().section()

        val customChartsSectionResponseFuture =
            sectionServiceAsync.update(
                SectionUpdateParams.builder()
                    .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .customChartsSectionUpdate(
                        CustomChartsSectionUpdate.builder()
                            .description("string")
                            .index(0L)
                            .title("string")
                            .build()
                    )
                    .build()
            )

        val customChartsSectionResponse = customChartsSectionResponseFuture.get()
        customChartsSectionResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val sectionServiceAsync = client.api().v1().charts().section()

        val customChartsSectionResponsesFuture =
            sectionServiceAsync.list(
                SectionListParams.builder()
                    .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(1L)
                    .offset(0L)
                    .sortBy("sort_by")
                    .sortByDesc(true)
                    .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .titleContains("title_contains")
                    .build()
            )

        val customChartsSectionResponses = customChartsSectionResponsesFuture.get()
        customChartsSectionResponses.forEach { it.validate() }
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
        val sectionServiceAsync = client.api().v1().charts().section()

        val sectionFuture = sectionServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val section = sectionFuture.get()
        section.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun clone() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val sectionServiceAsync = client.api().v1().charts().section()

        val customChartsSectionResponseFuture =
            sectionServiceAsync.clone(
                SectionCloneParams.builder()
                    .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val customChartsSectionResponse = customChartsSectionResponseFuture.get()
        customChartsSectionResponse.validate()
    }
}
