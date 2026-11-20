// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.volumes

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VolumeCreateParamsTest {

    @Test
    fun create() {
        VolumeCreateParams.builder()
            .name("name")
            .sizeBytes(0L)
            .description("description")
            .labels(
                VolumeCreateParams.Labels.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            VolumeCreateParams.builder()
                .name("name")
                .sizeBytes(0L)
                .description("description")
                .labels(
                    VolumeCreateParams.Labels.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.sizeBytes()).isEqualTo(0L)
        assertThat(body.description()).contains("description")
        assertThat(body.labels())
            .contains(
                VolumeCreateParams.Labels.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = VolumeCreateParams.builder().name("name").sizeBytes(0L).build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.sizeBytes()).isEqualTo(0L)
    }
}
