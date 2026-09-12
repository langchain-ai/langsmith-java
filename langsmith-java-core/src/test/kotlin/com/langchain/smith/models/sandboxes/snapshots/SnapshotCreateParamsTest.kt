// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.snapshots

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SnapshotCreateParamsTest {

    @Test
    fun create() {
        SnapshotCreateParams.builder()
            .dockerImage("docker_image")
            .fsCapacityBytes(0L)
            .name("name")
            .description("description")
            .labels(
                SnapshotCreateParams.Labels.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .registryId("registry_id")
            .runConfig(
                SnapshotCreateParams.RunConfig.builder()
                    .envVars(
                        SnapshotCreateParams.RunConfig.EnvVars.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .user("user")
                    .workDir("work_dir")
                    .build()
            )
            .tag("tag")
            .build()
    }

    @Test
    fun body() {
        val params =
            SnapshotCreateParams.builder()
                .dockerImage("docker_image")
                .fsCapacityBytes(0L)
                .name("name")
                .description("description")
                .labels(
                    SnapshotCreateParams.Labels.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .registryId("registry_id")
                .runConfig(
                    SnapshotCreateParams.RunConfig.builder()
                        .envVars(
                            SnapshotCreateParams.RunConfig.EnvVars.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .user("user")
                        .workDir("work_dir")
                        .build()
                )
                .tag("tag")
                .build()

        val body = params._body()

        assertThat(body.dockerImage()).isEqualTo("docker_image")
        assertThat(body.fsCapacityBytes()).isEqualTo(0L)
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.description()).contains("description")
        assertThat(body.labels())
            .contains(
                SnapshotCreateParams.Labels.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.registryId()).contains("registry_id")
        assertThat(body.runConfig())
            .contains(
                SnapshotCreateParams.RunConfig.builder()
                    .envVars(
                        SnapshotCreateParams.RunConfig.EnvVars.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .user("user")
                    .workDir("work_dir")
                    .build()
            )
        assertThat(body.tag()).contains("tag")
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
