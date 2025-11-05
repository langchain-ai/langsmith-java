// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.orgcharts

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.charts.section.CustomChartsSectionCreate
import com.langchain.smith.models.charts.section.CustomChartsSectionUpdate
import com.langchain.smith.models.orgcharts.section.CustomChartsRequestBase
import com.langchain.smith.models.orgcharts.section.SectionListParams
import com.langchain.smith.models.orgcharts.section.SectionRetrieveParams
import com.langchain.smith.models.orgcharts.section.SectionUpdateParams
import com.langchain.smith.models.sessions.TimedeltaInput
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SectionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val sectionServiceAsync = client.orgCharts().section()

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
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val sectionServiceAsync = client.orgCharts().section()

        val customChartsSectionFuture =
            sectionServiceAsync.retrieve(
                SectionRetrieveParams.builder()
                    .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .customChartsRequestBase(
                        CustomChartsRequestBase.builder()
                            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .omitData(true)
                            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .stride(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
                            .timezone("timezone")
                            .build()
                    )
                    .build()
            )

        val customChartsSection = customChartsSectionFuture.get()
        customChartsSection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val sectionServiceAsync = client.orgCharts().section()

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
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val sectionServiceAsync = client.orgCharts().section()

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
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val sectionServiceAsync = client.orgCharts().section()

        val sectionFuture = sectionServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val section = sectionFuture.get()
        section.validate()
    }
}
