// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.charts.section

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SectionCloneParamsTest {

    @Test
    fun create() {
        SectionCloneParams.builder()
            .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun body() {
        val params =
            SectionCloneParams.builder()
                .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.sectionId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.sessionId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SectionCloneParams.builder().build()

        val body = params._body()
    }
}
