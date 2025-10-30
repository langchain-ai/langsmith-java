// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current.members

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemberDeleteResponseTest {

    @Test
    fun create() {
        val memberDeleteResponse = MemberDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val memberDeleteResponse = MemberDeleteResponse.builder().build()

        val roundtrippedMemberDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(memberDeleteResponse),
                jacksonTypeRef<MemberDeleteResponse>(),
            )

        assertThat(roundtrippedMemberDeleteResponse).isEqualTo(memberDeleteResponse)
    }
}
