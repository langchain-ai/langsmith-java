// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.items

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnnotationQueueItemKeyReviewsTest {

    @Test
    fun create() {
        val annotationQueueItemKeyReviews =
            AnnotationQueueItemKeyReviews.builder()
                .answer(
                    AnnotationQueueItemAnswer.builder()
                        .score(0.0)
                        .addScore(0.0)
                        .value("value")
                        .addValue("string")
                        .build()
                )
                .final_(
                    AnnotationQueueItemAnswer.builder()
                        .score(0.0)
                        .addScore(0.0)
                        .value("value")
                        .addValue("string")
                        .build()
                )
                .finalSetAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .finalSetBy("final_set_by")
                .hasFinal(true)
                .key("key")
                .addReview(
                    AnnotationQueueItemKeyReviews.Review.builder()
                        .answer(
                            AnnotationQueueItemAnswer.builder()
                                .score(0.0)
                                .addScore(0.0)
                                .value("value")
                                .addValue("string")
                                .build()
                        )
                        .lsUserId("ls_user_id")
                        .build()
                )
                .state(AnnotationQueueItemAgreementState.AGREED)
                .build()

        assertThat(annotationQueueItemKeyReviews.answer())
            .contains(
                AnnotationQueueItemAnswer.builder()
                    .score(0.0)
                    .addScore(0.0)
                    .value("value")
                    .addValue("string")
                    .build()
            )
        assertThat(annotationQueueItemKeyReviews.final_())
            .contains(
                AnnotationQueueItemAnswer.builder()
                    .score(0.0)
                    .addScore(0.0)
                    .value("value")
                    .addValue("string")
                    .build()
            )
        assertThat(annotationQueueItemKeyReviews.finalSetAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(annotationQueueItemKeyReviews.finalSetBy()).contains("final_set_by")
        assertThat(annotationQueueItemKeyReviews.hasFinal()).contains(true)
        assertThat(annotationQueueItemKeyReviews.key()).contains("key")
        assertThat(annotationQueueItemKeyReviews.reviews().getOrNull())
            .containsExactly(
                AnnotationQueueItemKeyReviews.Review.builder()
                    .answer(
                        AnnotationQueueItemAnswer.builder()
                            .score(0.0)
                            .addScore(0.0)
                            .value("value")
                            .addValue("string")
                            .build()
                    )
                    .lsUserId("ls_user_id")
                    .build()
            )
        assertThat(annotationQueueItemKeyReviews.state())
            .contains(AnnotationQueueItemAgreementState.AGREED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val annotationQueueItemKeyReviews =
            AnnotationQueueItemKeyReviews.builder()
                .answer(
                    AnnotationQueueItemAnswer.builder()
                        .score(0.0)
                        .addScore(0.0)
                        .value("value")
                        .addValue("string")
                        .build()
                )
                .final_(
                    AnnotationQueueItemAnswer.builder()
                        .score(0.0)
                        .addScore(0.0)
                        .value("value")
                        .addValue("string")
                        .build()
                )
                .finalSetAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .finalSetBy("final_set_by")
                .hasFinal(true)
                .key("key")
                .addReview(
                    AnnotationQueueItemKeyReviews.Review.builder()
                        .answer(
                            AnnotationQueueItemAnswer.builder()
                                .score(0.0)
                                .addScore(0.0)
                                .value("value")
                                .addValue("string")
                                .build()
                        )
                        .lsUserId("ls_user_id")
                        .build()
                )
                .state(AnnotationQueueItemAgreementState.AGREED)
                .build()

        val roundtrippedAnnotationQueueItemKeyReviews =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(annotationQueueItemKeyReviews),
                jacksonTypeRef<AnnotationQueueItemKeyReviews>(),
            )

        assertThat(roundtrippedAnnotationQueueItemKeyReviews)
            .isEqualTo(annotationQueueItemKeyReviews)
    }
}
