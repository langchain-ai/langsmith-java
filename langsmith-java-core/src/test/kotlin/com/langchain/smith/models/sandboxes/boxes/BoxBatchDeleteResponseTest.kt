// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BoxBatchDeleteResponseTest {

    @Test
    fun create() {
        val boxBatchDeleteResponse =
            BoxBatchDeleteResponse.builder()
                .addDeleted("string")
                .addSkipped(
                    BoxBatchDeleteResponse.Skipped.builder().name("name").reason("reason").build()
                )
                .build()

        assertThat(boxBatchDeleteResponse.deleted().getOrNull()).containsExactly("string")
        assertThat(boxBatchDeleteResponse.skipped().getOrNull())
            .containsExactly(
                BoxBatchDeleteResponse.Skipped.builder().name("name").reason("reason").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val boxBatchDeleteResponse =
            BoxBatchDeleteResponse.builder()
                .addDeleted("string")
                .addSkipped(
                    BoxBatchDeleteResponse.Skipped.builder().name("name").reason("reason").build()
                )
                .build()

        val roundtrippedBoxBatchDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(boxBatchDeleteResponse),
                jacksonTypeRef<BoxBatchDeleteResponse>(),
            )

        assertThat(roundtrippedBoxBatchDeleteResponse).isEqualTo(boxBatchDeleteResponse)
    }
}
