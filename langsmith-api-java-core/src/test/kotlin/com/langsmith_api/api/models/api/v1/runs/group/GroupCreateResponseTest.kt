// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.runs.group

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupCreateResponseTest {

    @Test
    fun create() {
        val groupCreateResponse = GroupCreateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val groupCreateResponse = GroupCreateResponse.builder().build()

        val roundtrippedGroupCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(groupCreateResponse),
                jacksonTypeRef<GroupCreateResponse>(),
            )

        assertThat(roundtrippedGroupCreateResponse).isEqualTo(groupCreateResponse)
    }
}
