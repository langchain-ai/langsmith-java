// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current.businessinfo

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StripeTaxIdTest {

    @Test
    fun create() {
        val stripeTaxId = StripeTaxId.builder().type("type").value("value").build()

        assertThat(stripeTaxId.type()).isEqualTo("type")
        assertThat(stripeTaxId.value()).isEqualTo("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val stripeTaxId = StripeTaxId.builder().type("type").value("value").build()

        val roundtrippedStripeTaxId =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(stripeTaxId),
                jacksonTypeRef<StripeTaxId>(),
            )

        assertThat(roundtrippedStripeTaxId).isEqualTo(stripeTaxId)
    }
}
