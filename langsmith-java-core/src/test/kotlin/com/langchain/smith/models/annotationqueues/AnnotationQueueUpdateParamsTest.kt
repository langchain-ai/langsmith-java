// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues

import com.langchain.smith.core.JsonValue
import java.time.OffsetDateTime
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
            .metadata(
                AnnotationQueueUpdateParams.Metadata.UnionMember0.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .name("name")
            .numReviewersPerItem(0L)
            .reservationMinutes(0L)
            .reviewerAccessMode(AnnotationQueueUpdateParams.ReviewerAccessMode.ANY)
            .rubricInstructions("rubric_instructions")
            .addRubricItem(
                AnnotationQueueRubricItemSchema.builder()
                    .feedbackKey("feedback_key")
                    .description("description")
                    .feedbackConfig(
                        AnnotationQueueRubricItemSchema.FeedbackConfig.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .feedbackConfig(
                                AnnotationQueueRubricItemSchema.FeedbackConfig.InnerFeedbackConfig
                                    .builder()
                                    .type(
                                        AnnotationQueueRubricItemSchema.FeedbackConfig
                                            .InnerFeedbackConfig
                                            .Type
                                            .CONTINUOUS
                                    )
                                    .addCategory(
                                        AnnotationQueueRubricItemSchema.FeedbackConfig
                                            .InnerFeedbackConfig
                                            .Category
                                            .builder()
                                            .value(0.0)
                                            .label("x")
                                            .build()
                                    )
                                    .max(0.0)
                                    .min(0.0)
                                    .build()
                            )
                            .feedbackKey("feedback_key")
                            .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .isLowerScoreBetter(true)
                            .build()
                    )
                    .feedbackConfigId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .isAssertion(true)
                    .isRequired(true)
                    .regexValidator("string")
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
                .metadata(
                    AnnotationQueueUpdateParams.Metadata.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .name("name")
                .numReviewersPerItem(0L)
                .reservationMinutes(0L)
                .reviewerAccessMode(AnnotationQueueUpdateParams.ReviewerAccessMode.ANY)
                .rubricInstructions("rubric_instructions")
                .addRubricItem(
                    AnnotationQueueRubricItemSchema.builder()
                        .feedbackKey("feedback_key")
                        .description("description")
                        .feedbackConfig(
                            AnnotationQueueRubricItemSchema.FeedbackConfig.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .feedbackConfig(
                                    AnnotationQueueRubricItemSchema.FeedbackConfig
                                        .InnerFeedbackConfig
                                        .builder()
                                        .type(
                                            AnnotationQueueRubricItemSchema.FeedbackConfig
                                                .InnerFeedbackConfig
                                                .Type
                                                .CONTINUOUS
                                        )
                                        .addCategory(
                                            AnnotationQueueRubricItemSchema.FeedbackConfig
                                                .InnerFeedbackConfig
                                                .Category
                                                .builder()
                                                .value(0.0)
                                                .label("x")
                                                .build()
                                        )
                                        .max(0.0)
                                        .min(0.0)
                                        .build()
                                )
                                .feedbackKey("feedback_key")
                                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .isLowerScoreBetter(true)
                                .build()
                        )
                        .feedbackConfigId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .isAssertion(true)
                        .isRequired(true)
                        .regexValidator("string")
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
        assertThat(body.enableReservations())
            .contains(AnnotationQueueUpdateParams.EnableReservations.ofBool(true))
        assertThat(body.metadata())
            .contains(
                AnnotationQueueUpdateParams.Metadata.ofUnionMember0(
                    AnnotationQueueUpdateParams.Metadata.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
            )
        assertThat(body.name()).contains("name")
        assertThat(body.numReviewersPerItem())
            .contains(AnnotationQueueUpdateParams.NumReviewersPerItem.ofInteger(0L))
        assertThat(body.reservationMinutes())
            .contains(AnnotationQueueUpdateParams.ReservationMinutes.ofInteger(0L))
        assertThat(body.reviewerAccessMode())
            .contains(AnnotationQueueUpdateParams.ReviewerAccessMode.ANY)
        assertThat(body.rubricInstructions()).contains("rubric_instructions")
        assertThat(body.rubricItems().getOrNull())
            .containsExactly(
                AnnotationQueueRubricItemSchema.builder()
                    .feedbackKey("feedback_key")
                    .description("description")
                    .feedbackConfig(
                        AnnotationQueueRubricItemSchema.FeedbackConfig.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .feedbackConfig(
                                AnnotationQueueRubricItemSchema.FeedbackConfig.InnerFeedbackConfig
                                    .builder()
                                    .type(
                                        AnnotationQueueRubricItemSchema.FeedbackConfig
                                            .InnerFeedbackConfig
                                            .Type
                                            .CONTINUOUS
                                    )
                                    .addCategory(
                                        AnnotationQueueRubricItemSchema.FeedbackConfig
                                            .InnerFeedbackConfig
                                            .Category
                                            .builder()
                                            .value(0.0)
                                            .label("x")
                                            .build()
                                    )
                                    .max(0.0)
                                    .min(0.0)
                                    .build()
                            )
                            .feedbackKey("feedback_key")
                            .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .isLowerScoreBetter(true)
                            .build()
                    )
                    .feedbackConfigId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .isAssertion(true)
                    .isRequired(true)
                    .regexValidator("string")
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
