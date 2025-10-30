// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.datasets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MissingTest {

    @Test
    fun create() {
        val missing = Missing.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val missing = Missing.builder().build()

        val roundtrippedMissing =
            jsonMapper.readValue(jsonMapper.writeValueAsString(missing), jacksonTypeRef<Missing>())

        assertThat(roundtrippedMissing).isEqualTo(missing)
    }
}
