// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateOnlineCodeEvaluatorRequestTest {

    @Test
    fun create() {
        val createOnlineCodeEvaluatorRequest =
            CreateOnlineCodeEvaluatorRequest.builder().code("code").language("language").build()

        assertThat(createOnlineCodeEvaluatorRequest.code()).contains("code")
        assertThat(createOnlineCodeEvaluatorRequest.language()).contains("language")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createOnlineCodeEvaluatorRequest =
            CreateOnlineCodeEvaluatorRequest.builder().code("code").language("language").build()

        val roundtrippedCreateOnlineCodeEvaluatorRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createOnlineCodeEvaluatorRequest),
                jacksonTypeRef<CreateOnlineCodeEvaluatorRequest>(),
            )

        assertThat(roundtrippedCreateOnlineCodeEvaluatorRequest)
            .isEqualTo(createOnlineCodeEvaluatorRequest)
    }
}
