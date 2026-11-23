// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.reviewers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReviewerListResponseTest {

    @Test
    fun create() {
        val reviewerListResponse =
            ReviewerListResponse.builder()
                .completedCount(0L)
                .email("email")
                .identityId("identity_id")
                .isOnRoster(true)
                .lastActiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .pendingCount(0L)
                .build()

        assertThat(reviewerListResponse.completedCount()).contains(0L)
        assertThat(reviewerListResponse.email()).contains("email")
        assertThat(reviewerListResponse.identityId()).contains("identity_id")
        assertThat(reviewerListResponse.isOnRoster()).contains(true)
        assertThat(reviewerListResponse.lastActiveAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(reviewerListResponse.name()).contains("name")
        assertThat(reviewerListResponse.pendingCount()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reviewerListResponse =
            ReviewerListResponse.builder()
                .completedCount(0L)
                .email("email")
                .identityId("identity_id")
                .isOnRoster(true)
                .lastActiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .pendingCount(0L)
                .build()

        val roundtrippedReviewerListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reviewerListResponse),
                jacksonTypeRef<ReviewerListResponse>(),
            )

        assertThat(roundtrippedReviewerListResponse).isEqualTo(reviewerListResponse)
    }
}
