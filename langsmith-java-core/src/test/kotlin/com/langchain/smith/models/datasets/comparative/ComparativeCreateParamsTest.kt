// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.comparative

import com.langchain.smith.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ComparativeCreateParamsTest {

    @Test
    fun create() {
        ComparativeCreateParams.builder()
            .addExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .description("description")
            .extra(JsonValue.from(mapOf<String, Any>()))
            .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .name("name")
            .build()
    }

    @Test
    fun body() {
        val params =
            ComparativeCreateParams.builder()
                .addExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .extra(JsonValue.from(mapOf<String, Any>()))
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.experimentIds()).containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.referenceDatasetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.description()).contains("description")
        assertThat(body._extra()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.modifiedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.name()).contains("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ComparativeCreateParams.builder()
                .addExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.experimentIds()).containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.referenceDatasetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
