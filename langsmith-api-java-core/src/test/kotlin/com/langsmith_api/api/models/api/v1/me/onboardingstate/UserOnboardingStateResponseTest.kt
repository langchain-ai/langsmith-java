// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.me.onboardingstate

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserOnboardingStateResponseTest {

    @Test
    fun create() {
        val userOnboardingStateResponse =
            UserOnboardingStateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .evaluationCompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lgstudioCompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .playgroundCompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .successViewedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tracingCompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(userOnboardingStateResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(userOnboardingStateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userOnboardingStateResponse.lsUserId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(userOnboardingStateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userOnboardingStateResponse.evaluationCompletedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userOnboardingStateResponse.lgstudioCompletedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userOnboardingStateResponse.playgroundCompletedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userOnboardingStateResponse.successViewedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userOnboardingStateResponse.tracingCompletedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userOnboardingStateResponse =
            UserOnboardingStateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .evaluationCompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lgstudioCompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .playgroundCompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .successViewedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tracingCompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedUserOnboardingStateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userOnboardingStateResponse),
                jacksonTypeRef<UserOnboardingStateResponse>(),
            )

        assertThat(roundtrippedUserOnboardingStateResponse).isEqualTo(userOnboardingStateResponse)
    }
}
