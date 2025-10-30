// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.charts

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.models.api.v1.charts.section.CustomChartsSectionCreate
import com.langsmith_api.api.models.api.v1.charts.section.CustomChartsSectionUpdate
import com.langsmith_api.api.models.api.v1.charts.section.SectionCloneParams
import com.langsmith_api.api.models.api.v1.charts.section.SectionListParams
import com.langsmith_api.api.models.api.v1.charts.section.SectionUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SectionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val sectionService = client.api().v1().charts().section()

        val customChartsSectionResponse =
            sectionService.create(
                CustomChartsSectionCreate.builder()
                    .title("title")
                    .description("description")
                    .index(0L)
                    .build()
            )

        customChartsSectionResponse.validate()
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
        val sectionService = client.api().v1().charts().section()

        val customChartsSectionResponse =
            sectionService.update(
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

        customChartsSectionResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val sectionService = client.api().v1().charts().section()

        val customChartsSectionResponses =
            sectionService.list(
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

        customChartsSectionResponses.forEach { it.validate() }
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
        val sectionService = client.api().v1().charts().section()

        val section = sectionService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        section.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun clone() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val sectionService = client.api().v1().charts().section()

        val customChartsSectionResponse =
            sectionService.clone(
                SectionCloneParams.builder()
                    .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        customChartsSectionResponse.validate()
    }
}
