// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BoxCreateParamsTest {

    @Test
    fun create() {
        BoxCreateParams.builder()
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
            .snapshotId("snapshot_id")
            .snapshotName("snapshot_name")
            .templateName("template_name")
            .timeout(0L)
            .ttlSeconds(0L)
            .vcpus(0L)
            .waitForReady(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            BoxCreateParams.builder()
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
                .snapshotId("snapshot_id")
                .snapshotName("snapshot_name")
                .templateName("template_name")
                .timeout(0L)
                .ttlSeconds(0L)
                .vcpus(0L)
                .waitForReady(true)
                .build()

        val body = params._body()

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
        assertThat(body.snapshotId()).contains("snapshot_id")
        assertThat(body.snapshotName()).contains("snapshot_name")
        assertThat(body.templateName()).contains("template_name")
        assertThat(body.timeout()).contains(0L)
        assertThat(body.ttlSeconds()).contains(0L)
        assertThat(body.vcpus()).contains(0L)
        assertThat(body.waitForReady()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BoxCreateParams.builder().build()

        val body = params._body()
    }
}
