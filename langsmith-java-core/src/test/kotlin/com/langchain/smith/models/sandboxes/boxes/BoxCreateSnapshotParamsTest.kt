// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BoxCreateSnapshotParamsTest {

    @Test
    fun create() {
        BoxCreateSnapshotParams.builder()
            .pathName("name")
            .bodyName("name")
            .checkpoint("checkpoint")
            .description("description")
            .dockerImage("docker_image")
            .fsCapacityBytes(0L)
            .includeMemory(true)
            .labels(
                BoxCreateSnapshotParams.Labels.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
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
                .description("description")
                .dockerImage("docker_image")
                .fsCapacityBytes(0L)
                .includeMemory(true)
                .labels(
                    BoxCreateSnapshotParams.Labels.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .tag("tag")
                .build()

        val body = params._body()

        assertThat(body.bodyName()).isEqualTo("name")
        assertThat(body.checkpoint()).contains("checkpoint")
        assertThat(body.description()).contains("description")
        assertThat(body.dockerImage()).contains("docker_image")
        assertThat(body.fsCapacityBytes()).contains(0L)
        assertThat(body.includeMemory()).contains(true)
        assertThat(body.labels())
            .contains(
                BoxCreateSnapshotParams.Labels.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
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
