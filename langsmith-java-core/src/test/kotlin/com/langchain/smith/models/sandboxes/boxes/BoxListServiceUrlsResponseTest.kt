// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BoxListServiceUrlsResponseTest {

    @Test
    fun create() {
        val boxListServiceUrlsResponse =
            BoxListServiceUrlsResponse.builder()
                .access(BoxListServiceUrlsResponse.Access.TOKEN)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .port(0L)
                .createdBy("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(boxListServiceUrlsResponse.access())
            .isEqualTo(BoxListServiceUrlsResponse.Access.TOKEN)
        assertThat(boxListServiceUrlsResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(boxListServiceUrlsResponse.port()).isEqualTo(0L)
        assertThat(boxListServiceUrlsResponse.createdBy())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(boxListServiceUrlsResponse.expiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val boxListServiceUrlsResponse =
            BoxListServiceUrlsResponse.builder()
                .access(BoxListServiceUrlsResponse.Access.TOKEN)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .port(0L)
                .createdBy("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBoxListServiceUrlsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(boxListServiceUrlsResponse),
                jacksonTypeRef<BoxListServiceUrlsResponse>(),
            )

        assertThat(roundtrippedBoxListServiceUrlsResponse).isEqualTo(boxListServiceUrlsResponse)
    }
}
