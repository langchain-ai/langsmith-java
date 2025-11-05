// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.charts.section

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SectionDeleteResponseTest {

    @Test
    fun create() {
        val sectionDeleteResponse = SectionDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sectionDeleteResponse = SectionDeleteResponse.builder().build()

        val roundtrippedSectionDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sectionDeleteResponse),
                jacksonTypeRef<SectionDeleteResponse>(),
            )

        assertThat(roundtrippedSectionDeleteResponse).isEqualTo(sectionDeleteResponse)
    }
}
