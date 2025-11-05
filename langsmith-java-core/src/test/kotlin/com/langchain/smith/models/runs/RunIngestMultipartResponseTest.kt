// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunIngestMultipartResponseTest {

    @Test
    fun create() {
        val runIngestMultipartResponse =
            RunIngestMultipartResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("string"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runIngestMultipartResponse =
            RunIngestMultipartResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("string"))
                .build()

        val roundtrippedRunIngestMultipartResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runIngestMultipartResponse),
                jacksonTypeRef<RunIngestMultipartResponse>(),
            )

        assertThat(roundtrippedRunIngestMultipartResponse).isEqualTo(runIngestMultipartResponse)
    }
}
