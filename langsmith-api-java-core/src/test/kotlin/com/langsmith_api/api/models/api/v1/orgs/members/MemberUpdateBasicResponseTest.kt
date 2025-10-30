// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.members

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemberUpdateBasicResponseTest {

    @Test
    fun create() {
        val memberUpdateBasicResponse = MemberUpdateBasicResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val memberUpdateBasicResponse = MemberUpdateBasicResponse.builder().build()

        val roundtrippedMemberUpdateBasicResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(memberUpdateBasicResponse),
                jacksonTypeRef<MemberUpdateBasicResponse>(),
            )

        assertThat(roundtrippedMemberUpdateBasicResponse).isEqualTo(memberUpdateBasicResponse)
    }
}
