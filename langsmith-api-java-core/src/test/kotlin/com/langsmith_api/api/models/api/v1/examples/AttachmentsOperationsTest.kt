// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.examples

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttachmentsOperationsTest {

    @Test
    fun create() {
        val attachmentsOperations =
            AttachmentsOperations.builder()
                .rename(
                    AttachmentsOperations.Rename.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addRetain("string")
                .build()

        assertThat(attachmentsOperations.rename())
            .contains(
                AttachmentsOperations.Rename.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(attachmentsOperations.retain().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val attachmentsOperations =
            AttachmentsOperations.builder()
                .rename(
                    AttachmentsOperations.Rename.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addRetain("string")
                .build()

        val roundtrippedAttachmentsOperations =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attachmentsOperations),
                jacksonTypeRef<AttachmentsOperations>(),
            )

        assertThat(roundtrippedAttachmentsOperations).isEqualTo(attachmentsOperations)
    }
}
