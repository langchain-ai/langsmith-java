// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.charts

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.charts.section.CustomChartsSectionCreate
import com.langchain.smith.models.charts.section.CustomChartsSectionUpdate
import com.langchain.smith.models.charts.section.SectionCloneParams
import com.langchain.smith.models.charts.section.SectionListParams
import com.langchain.smith.models.charts.section.SectionRetrieveParams
import com.langchain.smith.models.charts.section.SectionUpdateParams
import com.langchain.smith.models.sessions.CustomChartsSectionRequest
import com.langchain.smith.models.sessions.RunStatsGroupBy
import com.langchain.smith.models.sessions.TimedeltaInput
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SectionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val sectionService = client.charts().section()

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
    fun retrieve() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val sectionService = client.charts().section()

        val customChartsSection =
            sectionService.retrieve(
                SectionRetrieveParams.builder()
                    .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .customChartsSectionRequest(
                        CustomChartsSectionRequest.builder()
                            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .groupBy(
                                RunStatsGroupBy.builder()
                                    .attribute(RunStatsGroupBy.Attribute.NAME)
                                    .maxGroups(0L)
                                    .path("path")
                                    .build()
                            )
                            .omitData(true)
                            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .stride(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
                            .timezone("timezone")
                            .build()
                    )
                    .build()
            )

        customChartsSection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val sectionService = client.charts().section()

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
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val sectionService = client.charts().section()

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
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val sectionService = client.charts().section()

        val section = sectionService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        section.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun clone() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val sectionService = client.charts().section()

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
