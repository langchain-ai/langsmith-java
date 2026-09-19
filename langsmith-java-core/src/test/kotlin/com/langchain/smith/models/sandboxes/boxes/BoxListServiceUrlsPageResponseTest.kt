// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BoxListServiceUrlsPageResponseTest {

    @Test
    fun create() {
        val boxListServiceUrlsPageResponse =
            BoxListServiceUrlsPageResponse.builder()
                .addItem(
                    BoxListServiceUrlsResponse.builder()
                        .access(BoxListServiceUrlsResponse.Access.TOKEN)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .port(0L)
                        .createdBy("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextCursor("next_cursor")
                .build()

        assertThat(boxListServiceUrlsPageResponse.items())
            .containsExactly(
                BoxListServiceUrlsResponse.builder()
                    .access(BoxListServiceUrlsResponse.Access.TOKEN)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .port(0L)
                    .createdBy("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(boxListServiceUrlsPageResponse.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val boxListServiceUrlsPageResponse =
            BoxListServiceUrlsPageResponse.builder()
                .addItem(
                    BoxListServiceUrlsResponse.builder()
                        .access(BoxListServiceUrlsResponse.Access.TOKEN)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .port(0L)
                        .createdBy("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextCursor("next_cursor")
                .build()

        val roundtrippedBoxListServiceUrlsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(boxListServiceUrlsPageResponse),
                jacksonTypeRef<BoxListServiceUrlsPageResponse>(),
            )

        assertThat(roundtrippedBoxListServiceUrlsPageResponse)
            .isEqualTo(boxListServiceUrlsPageResponse)
    }
}
