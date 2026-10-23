// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import com.langchain.smith.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BoxCreateSnapshotParamsTest {

    @Test
    fun create() {
        BoxCreateSnapshotParams.builder()
            .pathName("name")
            .bodyName("name")
            .checkpoint("checkpoint")
            .confirmAllowSnapshotSecretValues(true)
            .description("description")
            .dockerImage("docker_image")
            .fsCapacityBytes(0L)
            .imageConfig(
                BoxCreateSnapshotParams.ImageConfig.builder()
                    .addCmd("string")
                    .addEntrypoint("string")
                    .addExposedPort(0L)
                    .build()
            )
            .addInclude(BoxCreateSnapshotParams.Include.ALL)
            .includeMemory(true)
            .labels(
                BoxCreateSnapshotParams.Labels.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .runConfig(
                BoxCreateSnapshotParams.RunConfig.builder()
                    .envVars(
                        BoxCreateSnapshotParams.RunConfig.EnvVars.builder()
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
    fun pathParams() {
        val params = BoxCreateSnapshotParams.builder().pathName("name").bodyName("name").build()

        assertThat(params._pathParam(0)).isEqualTo("name")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BoxCreateSnapshotParams.builder()
                .pathName("name")
                .bodyName("name")
                .checkpoint("checkpoint")
                .confirmAllowSnapshotSecretValues(true)
                .description("description")
                .dockerImage("docker_image")
                .fsCapacityBytes(0L)
                .imageConfig(
                    BoxCreateSnapshotParams.ImageConfig.builder()
                        .addCmd("string")
                        .addEntrypoint("string")
                        .addExposedPort(0L)
                        .build()
                )
                .addInclude(BoxCreateSnapshotParams.Include.ALL)
                .includeMemory(true)
                .labels(
                    BoxCreateSnapshotParams.Labels.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .runConfig(
                    BoxCreateSnapshotParams.RunConfig.builder()
                        .envVars(
                            BoxCreateSnapshotParams.RunConfig.EnvVars.builder()
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

        assertThat(body.bodyName()).isEqualTo("name")
        assertThat(body.checkpoint()).contains("checkpoint")
        assertThat(body.confirmAllowSnapshotSecretValues()).contains(true)
        assertThat(body.description()).contains("description")
        assertThat(body.dockerImage()).contains("docker_image")
        assertThat(body.fsCapacityBytes()).contains(0L)
        assertThat(body.imageConfig())
            .contains(
                BoxCreateSnapshotParams.ImageConfig.builder()
                    .addCmd("string")
                    .addEntrypoint("string")
                    .addExposedPort(0L)
                    .build()
            )
        assertThat(body.include().getOrNull()).containsExactly(BoxCreateSnapshotParams.Include.ALL)
        assertThat(body.includeMemory()).contains(true)
        assertThat(body.labels())
            .contains(
                BoxCreateSnapshotParams.Labels.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.runConfig())
            .contains(
                BoxCreateSnapshotParams.RunConfig.builder()
                    .envVars(
                        BoxCreateSnapshotParams.RunConfig.EnvVars.builder()
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
        val params = BoxCreateSnapshotParams.builder().pathName("name").bodyName("name").build()

        val body = params._body()

        assertThat(body.bodyName()).isEqualTo("name")
    }
}
