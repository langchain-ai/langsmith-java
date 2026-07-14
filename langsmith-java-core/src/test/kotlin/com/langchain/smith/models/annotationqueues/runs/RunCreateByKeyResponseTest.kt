// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunCreateByKeyResponseTest {

    @Test
    fun create() {
        val runCreateByKeyResponse =
            RunCreateByKeyResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastReviewedTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .sourceProposedExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(runCreateByKeyResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runCreateByKeyResponse.queueId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runCreateByKeyResponse.runId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runCreateByKeyResponse.addedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runCreateByKeyResponse.lastReviewedTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runCreateByKeyResponse.sourceProposedExampleId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runCreateByKeyResponse =
            RunCreateByKeyResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastReviewedTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .sourceProposedExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedRunCreateByKeyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runCreateByKeyResponse),
                jacksonTypeRef<RunCreateByKeyResponse>(),
            )

        assertThat(roundtrippedRunCreateByKeyResponse).isEqualTo(runCreateByKeyResponse)
    }
}
