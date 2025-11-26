// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.insights

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateRunClusteringJobRequestTest {

    @Test
    fun create() {
        val createRunClusteringJobRequest =
            CreateRunClusteringJobRequest.builder()
                .attributeSchemas(
                    CreateRunClusteringJobRequest.AttributeSchemas.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filter("filter")
                .addHierarchy(0L)
                .lastNHours(0L)
                .model(CreateRunClusteringJobRequest.Model.OPENAI)
                .name("name")
                .partitions(
                    CreateRunClusteringJobRequest.Partitions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .sample(0.0)
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .summaryPrompt("summary_prompt")
                .userContext(
                    CreateRunClusteringJobRequest.UserContext.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .validateModelSecrets(true)
                .build()

        assertThat(createRunClusteringJobRequest.attributeSchemas())
            .contains(
                CreateRunClusteringJobRequest.AttributeSchemas.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(createRunClusteringJobRequest.endTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(createRunClusteringJobRequest.filter()).contains("filter")
        assertThat(createRunClusteringJobRequest.hierarchy().getOrNull()).containsExactly(0L)
        assertThat(createRunClusteringJobRequest.lastNHours()).contains(0L)
        assertThat(createRunClusteringJobRequest.model())
            .contains(CreateRunClusteringJobRequest.Model.OPENAI)
        assertThat(createRunClusteringJobRequest.name()).contains("name")
        assertThat(createRunClusteringJobRequest.partitions())
            .contains(
                CreateRunClusteringJobRequest.Partitions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(createRunClusteringJobRequest.sample()).contains(0.0)
        assertThat(createRunClusteringJobRequest.startTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(createRunClusteringJobRequest.summaryPrompt()).contains("summary_prompt")
        assertThat(createRunClusteringJobRequest.userContext())
            .contains(
                CreateRunClusteringJobRequest.UserContext.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(createRunClusteringJobRequest.validateModelSecrets()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createRunClusteringJobRequest =
            CreateRunClusteringJobRequest.builder()
                .attributeSchemas(
                    CreateRunClusteringJobRequest.AttributeSchemas.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filter("filter")
                .addHierarchy(0L)
                .lastNHours(0L)
                .model(CreateRunClusteringJobRequest.Model.OPENAI)
                .name("name")
                .partitions(
                    CreateRunClusteringJobRequest.Partitions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .sample(0.0)
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .summaryPrompt("summary_prompt")
                .userContext(
                    CreateRunClusteringJobRequest.UserContext.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .validateModelSecrets(true)
                .build()

        val roundtrippedCreateRunClusteringJobRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createRunClusteringJobRequest),
                jacksonTypeRef<CreateRunClusteringJobRequest>(),
            )

        assertThat(roundtrippedCreateRunClusteringJobRequest)
            .isEqualTo(createRunClusteringJobRequest)
    }
}
