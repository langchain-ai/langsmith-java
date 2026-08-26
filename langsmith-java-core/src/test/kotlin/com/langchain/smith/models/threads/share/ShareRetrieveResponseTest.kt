// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.threads.share

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShareRetrieveResponseTest {

    @Test
    fun create() {
        val shareRetrieveResponse =
            ShareRetrieveResponse.builder()
                .shareToken("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                .build()

        assertThat(shareRetrieveResponse.shareToken())
            .isEqualTo("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val shareRetrieveResponse =
            ShareRetrieveResponse.builder()
                .shareToken("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                .build()

        val roundtrippedShareRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(shareRetrieveResponse),
                jacksonTypeRef<ShareRetrieveResponse>(),
            )

        assertThat(roundtrippedShareRetrieveResponse).isEqualTo(shareRetrieveResponse)
    }
}
