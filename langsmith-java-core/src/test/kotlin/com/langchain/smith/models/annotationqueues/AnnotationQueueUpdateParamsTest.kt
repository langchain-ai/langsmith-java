// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues

import com.langchain.smith.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnnotationQueueUpdateParamsTest {

    @Test
    fun create() {
        AnnotationQueueUpdateParams.builder()
            .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .defaultDataset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("description")
            .enableReservations(true)
            .name("name")
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
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AnnotationQueueUpdateParams.builder()
                .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AnnotationQueueUpdateParams.builder()
                .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .defaultDataset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .enableReservations(true)
                .name("name")
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
                .build()

        val body = params._body()

        assertThat(body.defaultDataset()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.description()).contains("description")
        assertThat(body.enableReservations()).contains(true)
        assertThat(body.name()).contains("name")
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AnnotationQueueUpdateParams.builder()
                .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
