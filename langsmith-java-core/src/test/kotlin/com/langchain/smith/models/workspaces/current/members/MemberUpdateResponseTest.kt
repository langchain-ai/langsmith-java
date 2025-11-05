// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces.current.members

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemberUpdateResponseTest {

    @Test
    fun create() {
        val memberUpdateResponse = MemberUpdateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val memberUpdateResponse = MemberUpdateResponse.builder().build()

        val roundtrippedMemberUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(memberUpdateResponse),
                jacksonTypeRef<MemberUpdateResponse>(),
            )

        assertThat(roundtrippedMemberUpdateResponse).isEqualTo(memberUpdateResponse)
    }
}
