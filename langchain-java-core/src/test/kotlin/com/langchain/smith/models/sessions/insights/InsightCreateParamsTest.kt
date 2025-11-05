// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.insights

import com.langchain.smith.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightCreateParamsTest {

    @Test
    fun create() {
        InsightCreateParams.builder()
            .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .createRunClusteringJobRequest(
                CreateRunClusteringJobRequest.builder()
                    .attributeSchemas(JsonValue.from(mapOf<String, Any>()))
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InsightCreateParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createRunClusteringJobRequest(CreateRunClusteringJobRequest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            InsightCreateParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createRunClusteringJobRequest(
                    CreateRunClusteringJobRequest.builder()
                        .attributeSchemas(JsonValue.from(mapOf<String, Any>()))
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CreateRunClusteringJobRequest.builder()
                    .attributeSchemas(JsonValue.from(mapOf<String, Any>()))
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InsightCreateParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createRunClusteringJobRequest(CreateRunClusteringJobRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(CreateRunClusteringJobRequest.builder().build())
    }
}
