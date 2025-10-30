// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.tagvalues

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagValueUpdateParamsTest {

    @Test
    fun create() {
        TagValueUpdateParams.builder()
            .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("description")
            .value("x")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TagValueUpdateParams.builder()
                .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TagValueUpdateParams.builder()
                .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .value("x")
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.value()).contains("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TagValueUpdateParams.builder()
                .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
