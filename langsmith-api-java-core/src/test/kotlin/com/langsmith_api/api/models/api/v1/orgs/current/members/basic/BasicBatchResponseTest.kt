// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current.members.basic

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BasicBatchResponseTest {

    @Test
    fun create() {
        val basicBatchResponse =
            BasicBatchResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("email")
                .lsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .avatarUrl("avatar_url")
                .fullName("full_name")
                .password("password")
                .build()

        assertThat(basicBatchResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(basicBatchResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(basicBatchResponse.email()).isEqualTo("email")
        assertThat(basicBatchResponse.lsUserId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(basicBatchResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(basicBatchResponse.avatarUrl()).contains("avatar_url")
        assertThat(basicBatchResponse.fullName()).contains("full_name")
        assertThat(basicBatchResponse.password()).contains("password")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val basicBatchResponse =
            BasicBatchResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("email")
                .lsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .avatarUrl("avatar_url")
                .fullName("full_name")
                .password("password")
                .build()

        val roundtrippedBasicBatchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(basicBatchResponse),
                jacksonTypeRef<BasicBatchResponse>(),
            )

        assertThat(roundtrippedBasicBatchResponse).isEqualTo(basicBatchResponse)
    }
}
