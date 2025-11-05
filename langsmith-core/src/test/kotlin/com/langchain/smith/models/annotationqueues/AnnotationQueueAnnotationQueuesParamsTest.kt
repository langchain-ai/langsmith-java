// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues

import com.langchain.smith.core.JsonValue
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnnotationQueueAnnotationQueuesParamsTest {

    @Test
    fun create() {
        AnnotationQueueAnnotationQueuesParams.builder()
            .name("name")
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .defaultDataset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("description")
            .enableReservations(true)
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .numReviewersPerItem(0L)
            .reservationMinutes(0L)
            .rubricInstructions("rubric_instructions")
            .addRubricItem(
                AnnotationQueueRubricItemSchema.builder()
                    .feedbackKey("feedback_key")
                    .description("description")
                    .scoreDescriptions(
                        AnnotationQueueRubricItemSchema.ScoreDescriptions.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .valueDescriptions(
                        AnnotationQueueRubricItemSchema.ValueDescriptions.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
            .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun body() {
        val params =
            AnnotationQueueAnnotationQueuesParams.builder()
                .name("name")
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultDataset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .enableReservations(true)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .numReviewersPerItem(0L)
                .reservationMinutes(0L)
                .rubricInstructions("rubric_instructions")
                .addRubricItem(
                    AnnotationQueueRubricItemSchema.builder()
                        .feedbackKey("feedback_key")
                        .description("description")
                        .scoreDescriptions(
                            AnnotationQueueRubricItemSchema.ScoreDescriptions.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .valueDescriptions(
                            AnnotationQueueRubricItemSchema.ValueDescriptions.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.defaultDataset()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.description()).contains("description")
        assertThat(body.enableReservations()).contains(true)
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.numReviewersPerItem()).contains(0L)
        assertThat(body.reservationMinutes()).contains(0L)
        assertThat(body.rubricInstructions()).contains("rubric_instructions")
        assertThat(body.rubricItems().getOrNull())
            .containsExactly(
                AnnotationQueueRubricItemSchema.builder()
                    .feedbackKey("feedback_key")
                    .description("description")
                    .scoreDescriptions(
                        AnnotationQueueRubricItemSchema.ScoreDescriptions.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .valueDescriptions(
                        AnnotationQueueRubricItemSchema.ValueDescriptions.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.sessionIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.updatedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AnnotationQueueAnnotationQueuesParams.builder().name("name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
    }
}
