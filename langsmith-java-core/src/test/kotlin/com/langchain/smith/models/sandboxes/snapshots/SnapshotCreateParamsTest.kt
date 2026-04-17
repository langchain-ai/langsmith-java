// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.snapshots

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SnapshotCreateParamsTest {

    @Test
    fun create() {
        SnapshotCreateParams.builder()
            .dockerImage("docker_image")
            .fsCapacityBytes(0L)
            .name("name")
            .registryId("registry_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            SnapshotCreateParams.builder()
                .dockerImage("docker_image")
                .fsCapacityBytes(0L)
                .name("name")
                .registryId("registry_id")
                .build()

        val body = params._body()

        assertThat(body.dockerImage()).isEqualTo("docker_image")
        assertThat(body.fsCapacityBytes()).isEqualTo(0L)
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.registryId()).contains("registry_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SnapshotCreateParams.builder()
                .dockerImage("docker_image")
                .fsCapacityBytes(0L)
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.dockerImage()).isEqualTo("docker_image")
        assertThat(body.fsCapacityBytes()).isEqualTo(0L)
        assertThat(body.name()).isEqualTo("name")
    }
}
