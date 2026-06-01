// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import com.langchain.smith.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BoxCreateParamsTest {

    @Test
    fun create() {
        BoxCreateParams.builder()
            .deleteAfterStopSeconds(0L)
            .envVars(
                BoxCreateParams.EnvVars.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .fsCapacityBytes(0L)
            .idleTtlSeconds(0L)
            .memBytes(0L)
            .name("name")
            .proxyConfig(
                BoxCreateParams.ProxyConfig.builder()
                    .accessControl(
                        BoxCreateParams.ProxyConfig.AccessControl.builder()
                            .addAllowList("string")
                            .addDenyList("string")
                            .build()
                    )
                    .addCallback(
                        BoxCreateParams.ProxyConfig.Callback.builder()
                            .addMatchHost("string")
                            .ttlSeconds(60L)
                            .url("url")
                            .fullRequest(true)
                            .addRequestHeader(
                                BoxCreateParams.ProxyConfig.Callback.RequestHeader.builder()
                                    .name("name")
                                    .type(
                                        BoxCreateParams.ProxyConfig.Callback.RequestHeader.Type
                                            .PLAINTEXT
                                    )
                                    .isSet(true)
                                    .value("value")
                                    .build()
                            )
                            .build()
                    )
                    .addNoProxy("string")
                    .addRule(
                        BoxCreateParams.ProxyConfig.Rule.builder()
                            .addMatchHost("string")
                            .name("name")
                            .enabled(true)
                            .addHeader(
                                BoxCreateParams.ProxyConfig.Rule.Header.builder()
                                    .name("name")
                                    .type(BoxCreateParams.ProxyConfig.Rule.Header.Type.PLAINTEXT)
                                    .isSet(true)
                                    .value("value")
                                    .build()
                            )
                            .addMatchPath("string")
                            .build()
                    )
                    .build()
            )
            .restoreMemory(true)
            .snapshotId("snapshot_id")
            .snapshotName("snapshot_name")
            .addTagValueId("string")
            .vcpus(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            BoxCreateParams.builder()
                .deleteAfterStopSeconds(0L)
                .envVars(
                    BoxCreateParams.EnvVars.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .fsCapacityBytes(0L)
                .idleTtlSeconds(0L)
                .memBytes(0L)
                .name("name")
                .proxyConfig(
                    BoxCreateParams.ProxyConfig.builder()
                        .accessControl(
                            BoxCreateParams.ProxyConfig.AccessControl.builder()
                                .addAllowList("string")
                                .addDenyList("string")
                                .build()
                        )
                        .addCallback(
                            BoxCreateParams.ProxyConfig.Callback.builder()
                                .addMatchHost("string")
                                .ttlSeconds(60L)
                                .url("url")
                                .fullRequest(true)
                                .addRequestHeader(
                                    BoxCreateParams.ProxyConfig.Callback.RequestHeader.builder()
                                        .name("name")
                                        .type(
                                            BoxCreateParams.ProxyConfig.Callback.RequestHeader.Type
                                                .PLAINTEXT
                                        )
                                        .isSet(true)
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .addNoProxy("string")
                        .addRule(
                            BoxCreateParams.ProxyConfig.Rule.builder()
                                .addMatchHost("string")
                                .name("name")
                                .enabled(true)
                                .addHeader(
                                    BoxCreateParams.ProxyConfig.Rule.Header.builder()
                                        .name("name")
                                        .type(
                                            BoxCreateParams.ProxyConfig.Rule.Header.Type.PLAINTEXT
                                        )
                                        .isSet(true)
                                        .value("value")
                                        .build()
                                )
                                .addMatchPath("string")
                                .build()
                        )
                        .build()
                )
                .restoreMemory(true)
                .snapshotId("snapshot_id")
                .snapshotName("snapshot_name")
                .addTagValueId("string")
                .vcpus(0L)
                .build()

        val body = params._body()

        assertThat(body.deleteAfterStopSeconds()).contains(0L)
        assertThat(body.envVars())
            .contains(
                BoxCreateParams.EnvVars.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.fsCapacityBytes()).contains(0L)
        assertThat(body.idleTtlSeconds()).contains(0L)
        assertThat(body.memBytes()).contains(0L)
        assertThat(body.name()).contains("name")
        assertThat(body.proxyConfig())
            .contains(
                BoxCreateParams.ProxyConfig.builder()
                    .accessControl(
                        BoxCreateParams.ProxyConfig.AccessControl.builder()
                            .addAllowList("string")
                            .addDenyList("string")
                            .build()
                    )
                    .addCallback(
                        BoxCreateParams.ProxyConfig.Callback.builder()
                            .addMatchHost("string")
                            .ttlSeconds(60L)
                            .url("url")
                            .fullRequest(true)
                            .addRequestHeader(
                                BoxCreateParams.ProxyConfig.Callback.RequestHeader.builder()
                                    .name("name")
                                    .type(
                                        BoxCreateParams.ProxyConfig.Callback.RequestHeader.Type
                                            .PLAINTEXT
                                    )
                                    .isSet(true)
                                    .value("value")
                                    .build()
                            )
                            .build()
                    )
                    .addNoProxy("string")
                    .addRule(
                        BoxCreateParams.ProxyConfig.Rule.builder()
                            .addMatchHost("string")
                            .name("name")
                            .enabled(true)
                            .addHeader(
                                BoxCreateParams.ProxyConfig.Rule.Header.builder()
                                    .name("name")
                                    .type(BoxCreateParams.ProxyConfig.Rule.Header.Type.PLAINTEXT)
                                    .isSet(true)
                                    .value("value")
                                    .build()
                            )
                            .addMatchPath("string")
                            .build()
                    )
                    .build()
            )
        assertThat(body.restoreMemory()).contains(true)
        assertThat(body.snapshotId()).contains("snapshot_id")
        assertThat(body.snapshotName()).contains("snapshot_name")
        assertThat(body.tagValueIds().getOrNull()).containsExactly("string")
        assertThat(body.vcpus()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BoxCreateParams.builder().build()

        val body = params._body()

        assertThat(body.snapshotId()).isEmpty()
        assertThat(body.snapshotName()).isEmpty()
    }
}
