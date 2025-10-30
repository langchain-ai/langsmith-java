// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.feedback.formulas

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormulaDeleteResponseTest {

    @Test
    fun create() {
        val formulaDeleteResponse = FormulaDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val formulaDeleteResponse = FormulaDeleteResponse.builder().build()

        val roundtrippedFormulaDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(formulaDeleteResponse),
                jacksonTypeRef<FormulaDeleteResponse>(),
            )

        assertThat(roundtrippedFormulaDeleteResponse).isEqualTo(formulaDeleteResponse)
    }
}
