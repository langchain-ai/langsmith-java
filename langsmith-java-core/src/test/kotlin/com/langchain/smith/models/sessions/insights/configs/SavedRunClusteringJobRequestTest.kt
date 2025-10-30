// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.insights.configs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SavedRunClusteringJobRequestTest {

    @Test
    fun create() {
        val savedRunClusteringJobRequest =
            SavedRunClusteringJobRequest.builder()
                .attributeSchemas(JsonValue.from(mapOf<String, Any>()))
                .filter("filter")
                .addHierarchy(0L)
                .lastNHours(0L)
                .model(SavedRunClusteringJobRequest.Model.OPENAI)
                .name("name")
                .partitions(
                    SavedRunClusteringJobRequest.Partitions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .sample(0.0)
                .summaryPrompt("summary_prompt")
                .build()

        assertThat(savedRunClusteringJobRequest._attributeSchemas())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(savedRunClusteringJobRequest.filter()).contains("filter")
        assertThat(savedRunClusteringJobRequest.hierarchy().getOrNull()).containsExactly(0L)
        assertThat(savedRunClusteringJobRequest.lastNHours()).isEqualTo(0L)
        assertThat(savedRunClusteringJobRequest.model())
            .isEqualTo(SavedRunClusteringJobRequest.Model.OPENAI)
        assertThat(savedRunClusteringJobRequest.name()).isEqualTo("name")
        assertThat(savedRunClusteringJobRequest.partitions())
            .contains(
                SavedRunClusteringJobRequest.Partitions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(savedRunClusteringJobRequest.sample()).contains(0.0)
        assertThat(savedRunClusteringJobRequest.summaryPrompt()).contains("summary_prompt")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val savedRunClusteringJobRequest =
            SavedRunClusteringJobRequest.builder()
                .attributeSchemas(JsonValue.from(mapOf<String, Any>()))
                .filter("filter")
                .addHierarchy(0L)
                .lastNHours(0L)
                .model(SavedRunClusteringJobRequest.Model.OPENAI)
                .name("name")
                .partitions(
                    SavedRunClusteringJobRequest.Partitions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .sample(0.0)
                .summaryPrompt("summary_prompt")
                .build()

        val roundtrippedSavedRunClusteringJobRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(savedRunClusteringJobRequest),
                jacksonTypeRef<SavedRunClusteringJobRequest>(),
            )

        assertThat(roundtrippedSavedRunClusteringJobRequest).isEqualTo(savedRunClusteringJobRequest)
    }
}
