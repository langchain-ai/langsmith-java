// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.comparative

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ComparativeCreateResponseTest {

    @Test
    fun create() {
        val comparativeCreateResponse =
            ComparativeCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .extra(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .build()

        assertThat(comparativeCreateResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(comparativeCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(comparativeCreateResponse.modifiedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(comparativeCreateResponse.referenceDatasetId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(comparativeCreateResponse.tenantId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(comparativeCreateResponse.description()).contains("description")
        assertThat(comparativeCreateResponse._extra())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(comparativeCreateResponse.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val comparativeCreateResponse =
            ComparativeCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .extra(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .build()

        val roundtrippedComparativeCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(comparativeCreateResponse),
                jacksonTypeRef<ComparativeCreateResponse>(),
            )

        assertThat(roundtrippedComparativeCreateResponse).isEqualTo(comparativeCreateResponse)
    }
}
