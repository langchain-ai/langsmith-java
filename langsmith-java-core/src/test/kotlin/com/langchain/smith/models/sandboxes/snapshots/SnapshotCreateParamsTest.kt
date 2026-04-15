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
            .registryPassword("registry_password")
            .registryUrl("registry_url")
            .registryUsername("registry_username")
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
                .registryPassword("registry_password")
                .registryUrl("registry_url")
                .registryUsername("registry_username")
                .build()

        val body = params._body()

        assertThat(body.dockerImage()).isEqualTo("docker_image")
        assertThat(body.fsCapacityBytes()).isEqualTo(0L)
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.registryId()).contains("registry_id")
        assertThat(body.registryPassword()).contains("registry_password")
        assertThat(body.registryUrl()).contains("registry_url")
        assertThat(body.registryUsername()).contains("registry_username")
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
