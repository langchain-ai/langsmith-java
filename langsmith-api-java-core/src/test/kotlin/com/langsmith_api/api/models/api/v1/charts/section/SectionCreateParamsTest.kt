// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.charts.section

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SectionCreateParamsTest {

    @Test
    fun create() {
        SectionCreateParams.builder()
            .customChartsSectionCreate(
                CustomChartsSectionCreate.builder()
                    .title("title")
                    .description("description")
                    .index(0L)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            SectionCreateParams.builder()
                .customChartsSectionCreate(
                    CustomChartsSectionCreate.builder()
                        .title("title")
                        .description("description")
                        .index(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CustomChartsSectionCreate.builder()
                    .title("title")
                    .description("description")
                    .index(0L)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SectionCreateParams.builder()
                .customChartsSectionCreate(
                    CustomChartsSectionCreate.builder().title("title").build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(CustomChartsSectionCreate.builder().title("title").build())
    }
}
