// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.comparative

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimpleExperimentInfoTest {

    @Test
    fun create() {
        val simpleExperimentInfo =
            SimpleExperimentInfo.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .build()

        assertThat(simpleExperimentInfo.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(simpleExperimentInfo.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simpleExperimentInfo =
            SimpleExperimentInfo.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .build()

        val roundtrippedSimpleExperimentInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simpleExperimentInfo),
                jacksonTypeRef<SimpleExperimentInfo>(),
            )

        assertThat(roundtrippedSimpleExperimentInfo).isEqualTo(simpleExperimentInfo)
    }
}
