// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.runs.share

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunShareSchemaTest {

    @Test
    fun create() {
        val runShareSchema =
            RunShareSchema.builder()
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(runShareSchema.runId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runShareSchema.shareToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runShareSchema =
            RunShareSchema.builder()
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedRunShareSchema =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runShareSchema),
                jacksonTypeRef<RunShareSchema>(),
            )

        assertThat(roundtrippedRunShareSchema).isEqualTo(runShareSchema)
    }
}
