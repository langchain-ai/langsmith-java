// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.sessions.insights.configs

import com.langsmith_api.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigGenerateParamsTest {

    @Test
    fun create() {
        ConfigGenerateParams.builder()
            .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .userContext(
                ConfigGenerateParams.UserContext.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .model(ConfigGenerateParams.Model.OPENAI)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ConfigGenerateParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userContext(
                    ConfigGenerateParams.UserContext.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ConfigGenerateParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userContext(
                    ConfigGenerateParams.UserContext.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .model(ConfigGenerateParams.Model.OPENAI)
                .build()

        val body = params._body()

        assertThat(body.userContext())
            .isEqualTo(
                ConfigGenerateParams.UserContext.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.model()).contains(ConfigGenerateParams.Model.OPENAI)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ConfigGenerateParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userContext(
                    ConfigGenerateParams.UserContext.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.userContext())
            .isEqualTo(
                ConfigGenerateParams.UserContext.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }
}
