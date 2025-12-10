// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.feedback.tokens

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenUpdateParamsTest {

    @Test
    fun create() {
        TokenUpdateParams.builder()
            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .comment("comment")
            .correction(
                TokenUpdateParams.Correction.UnionMember0.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .metadata(
                TokenUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .score(0.0)
            .value(0.0)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TokenUpdateParams.builder().token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TokenUpdateParams.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comment("comment")
                .correction(
                    TokenUpdateParams.Correction.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .metadata(
                    TokenUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .score(0.0)
                .value(0.0)
                .build()

        val body = params._body()

        assertThat(body.comment()).contains("comment")
        assertThat(body.correction())
            .contains(
                TokenUpdateParams.Correction.ofUnionMember0(
                    TokenUpdateParams.Correction.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
            )
        assertThat(body.metadata())
            .contains(
                TokenUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.score()).contains(TokenUpdateParams.Score.ofNumber(0.0))
        assertThat(body.value()).contains(TokenUpdateParams.Value.ofNumber(0.0))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TokenUpdateParams.builder().token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
