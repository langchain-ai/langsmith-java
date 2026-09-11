// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BoxGenerateDownloadUrlParamsTest {

    @Test
    fun create() {
        BoxGenerateDownloadUrlParams.builder()
            .name("name")
            .path("path")
            .contentDisposition("content_disposition")
            .contentType("content_type")
            .addCspSandboxFlag(BoxGenerateDownloadUrlParams.CspSandboxFlag.ALLOW_DOWNLOADS)
            .addCspSourceBundle(BoxGenerateDownloadUrlParams.CspSourceBundle.CDNJS)
            .expiresInSeconds(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = BoxGenerateDownloadUrlParams.builder().name("name").path("path").build()

        assertThat(params._pathParam(0)).isEqualTo("name")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BoxGenerateDownloadUrlParams.builder()
                .name("name")
                .path("path")
                .contentDisposition("content_disposition")
                .contentType("content_type")
                .addCspSandboxFlag(BoxGenerateDownloadUrlParams.CspSandboxFlag.ALLOW_DOWNLOADS)
                .addCspSourceBundle(BoxGenerateDownloadUrlParams.CspSourceBundle.CDNJS)
                .expiresInSeconds(0L)
                .build()

        val body = params._body()

        assertThat(body.path()).isEqualTo("path")
        assertThat(body.contentDisposition()).contains("content_disposition")
        assertThat(body.contentType()).contains("content_type")
        assertThat(body.cspSandboxFlags().getOrNull())
            .containsExactly(BoxGenerateDownloadUrlParams.CspSandboxFlag.ALLOW_DOWNLOADS)
        assertThat(body.cspSourceBundles().getOrNull())
            .containsExactly(BoxGenerateDownloadUrlParams.CspSourceBundle.CDNJS)
        assertThat(body.expiresInSeconds()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BoxGenerateDownloadUrlParams.builder().name("name").path("path").build()

        val body = params._body()

        assertThat(body.path()).isEqualTo("path")
    }
}
