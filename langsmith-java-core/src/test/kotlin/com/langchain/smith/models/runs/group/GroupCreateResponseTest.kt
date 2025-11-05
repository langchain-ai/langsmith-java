// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs.group

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
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
