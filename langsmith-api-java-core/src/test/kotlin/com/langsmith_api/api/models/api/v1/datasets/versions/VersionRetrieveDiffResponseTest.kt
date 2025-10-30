// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.datasets.versions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VersionRetrieveDiffResponseTest {

    @Test
    fun create() {
        val versionRetrieveDiffResponse =
            VersionRetrieveDiffResponse.builder()
                .addExamplesAdded("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addExamplesModified("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addExamplesRemoved("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(versionRetrieveDiffResponse.examplesAdded())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(versionRetrieveDiffResponse.examplesModified())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(versionRetrieveDiffResponse.examplesRemoved())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val versionRetrieveDiffResponse =
            VersionRetrieveDiffResponse.builder()
                .addExamplesAdded("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addExamplesModified("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addExamplesRemoved("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedVersionRetrieveDiffResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(versionRetrieveDiffResponse),
                jacksonTypeRef<VersionRetrieveDiffResponse>(),
            )

        assertThat(roundtrippedVersionRetrieveDiffResponse).isEqualTo(versionRetrieveDiffResponse)
    }
}
