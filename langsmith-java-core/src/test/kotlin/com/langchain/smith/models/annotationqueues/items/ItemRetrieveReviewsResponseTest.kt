// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.items

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemRetrieveReviewsResponseTest {

    @Test
    fun create() {
        val itemRetrieveReviewsResponse =
            ItemRetrieveReviewsResponse.builder()
                .addKey(
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
                )
                .addReviewer(
                    ItemRetrieveReviewsResponse.Reviewer.builder()
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("email")
                        .identityId("identity_id")
                        .lsUserId("ls_user_id")
                        .name("name")
                        .build()
                )
                .build()

        assertThat(itemRetrieveReviewsResponse.keys().getOrNull())
            .containsExactly(
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
            )
        assertThat(itemRetrieveReviewsResponse.reviewers().getOrNull())
            .containsExactly(
                ItemRetrieveReviewsResponse.Reviewer.builder()
                    .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .email("email")
                    .identityId("identity_id")
                    .lsUserId("ls_user_id")
                    .name("name")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val itemRetrieveReviewsResponse =
            ItemRetrieveReviewsResponse.builder()
                .addKey(
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
                )
                .addReviewer(
                    ItemRetrieveReviewsResponse.Reviewer.builder()
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("email")
                        .identityId("identity_id")
                        .lsUserId("ls_user_id")
                        .name("name")
                        .build()
                )
                .build()

        val roundtrippedItemRetrieveReviewsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(itemRetrieveReviewsResponse),
                jacksonTypeRef<ItemRetrieveReviewsResponse>(),
            )

        assertThat(roundtrippedItemRetrieveReviewsResponse).isEqualTo(itemRetrieveReviewsResponse)
    }
}
