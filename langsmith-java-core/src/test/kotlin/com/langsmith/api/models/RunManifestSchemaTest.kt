// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RunManifestSchemaTest {

    @Test
    fun createRunManifestSchema() {
        val runManifestSchema =
            RunManifestSchema.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .manifest(JsonValue.from(mapOf<String, Any>()))
                .build()
        assertThat(runManifestSchema).isNotNull
        assertThat(runManifestSchema.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runManifestSchema._manifest()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }
}
