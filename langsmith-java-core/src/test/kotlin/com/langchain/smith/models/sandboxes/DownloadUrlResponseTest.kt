// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DownloadUrlResponseTest {

    @Test
    fun create() {
        val downloadUrlResponse =
            DownloadUrlResponse.builder()
                .token("token")
                .downloadUrl("download_url")
                .expiresAt("expires_at")
                .build()

        assertThat(downloadUrlResponse.token()).isEqualTo("token")
        assertThat(downloadUrlResponse.downloadUrl()).isEqualTo("download_url")
        assertThat(downloadUrlResponse.expiresAt()).contains("expires_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val downloadUrlResponse =
            DownloadUrlResponse.builder()
                .token("token")
                .downloadUrl("download_url")
                .expiresAt("expires_at")
                .build()

        val roundtrippedDownloadUrlResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(downloadUrlResponse),
                jacksonTypeRef<DownloadUrlResponse>(),
            )

        assertThat(roundtrippedDownloadUrlResponse).isEqualTo(downloadUrlResponse)
    }
}
