// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.volumes

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VolumeCloneParamsTest {

    @Test
    fun create() {
        VolumeCloneParams.builder()
            .volume("volume")
            .name("name")
            .description("description")
            .labels(
                VolumeCloneParams.Labels.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = VolumeCloneParams.builder().volume("volume").name("name").build()

        assertThat(params._pathParam(0)).isEqualTo("volume")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            VolumeCloneParams.builder()
                .volume("volume")
                .name("name")
                .description("description")
                .labels(
                    VolumeCloneParams.Labels.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.description()).contains("description")
        assertThat(body.labels())
            .contains(
                VolumeCloneParams.Labels.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = VolumeCloneParams.builder().volume("volume").name("name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
    }
}
