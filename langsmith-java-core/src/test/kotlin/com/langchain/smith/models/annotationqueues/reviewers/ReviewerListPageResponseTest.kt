// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.reviewers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReviewerListPageResponseTest {

    @Test
    fun create() {
        val reviewerListPageResponse =
            ReviewerListPageResponse.builder()
                .addItem(
                    ReviewerListResponse.builder()
                        .completedCount(0L)
                        .email("email")
                        .identityId("identity_id")
                        .isOnRoster(true)
                        .lastActiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .pendingCount(0L)
                        .build()
                )
                .nextCursor("next_cursor")
                .build()

        assertThat(reviewerListPageResponse.items().getOrNull())
            .containsExactly(
                ReviewerListResponse.builder()
                    .completedCount(0L)
                    .email("email")
                    .identityId("identity_id")
                    .isOnRoster(true)
                    .lastActiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .pendingCount(0L)
                    .build()
            )
        assertThat(reviewerListPageResponse.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reviewerListPageResponse =
            ReviewerListPageResponse.builder()
                .addItem(
                    ReviewerListResponse.builder()
                        .completedCount(0L)
                        .email("email")
                        .identityId("identity_id")
                        .isOnRoster(true)
                        .lastActiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .pendingCount(0L)
                        .build()
                )
                .nextCursor("next_cursor")
                .build()

        val roundtrippedReviewerListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reviewerListPageResponse),
                jacksonTypeRef<ReviewerListPageResponse>(),
            )

        assertThat(roundtrippedReviewerListPageResponse).isEqualTo(reviewerListPageResponse)
    }
}
