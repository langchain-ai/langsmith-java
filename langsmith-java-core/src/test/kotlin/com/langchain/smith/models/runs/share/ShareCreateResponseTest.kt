// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs.share

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShareCreateResponseTest {

    @Test
    fun create() {
        val shareCreateResponse =
            ShareCreateResponse.builder().shareToken("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327").build()

        assertThat(shareCreateResponse.shareToken())
            .contains("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val shareCreateResponse =
            ShareCreateResponse.builder().shareToken("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327").build()

        val roundtrippedShareCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(shareCreateResponse),
                jacksonTypeRef<ShareCreateResponse>(),
            )

        assertThat(roundtrippedShareCreateResponse).isEqualTo(shareCreateResponse)
    }
}
