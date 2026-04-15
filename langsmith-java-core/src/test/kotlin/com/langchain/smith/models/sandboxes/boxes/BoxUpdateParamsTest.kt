// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BoxUpdateParamsTest {

    @Test
    fun create() {
        BoxUpdateParams.builder()
            .pathName("name")
            .fsCapacityBytes(0L)
            .idleTtlSeconds(0L)
            .memBytes(0L)
            .bodyName("name")
            .proxyConfig(
                BoxUpdateParams.ProxyConfig.builder()
                    .accessControl(
                        BoxUpdateParams.ProxyConfig.AccessControl.builder()
                            .addAllowList("string")
                            .addDenyList("string")
                            .build()
                    )
                    .addNoProxy("string")
                    .addRule(
                        BoxUpdateParams.ProxyConfig.Rule.builder()
                            .addMatchHost("string")
                            .bodyName("name")
                            .enabled(true)
                            .addHeader(
                                BoxUpdateParams.ProxyConfig.Rule.Header.builder()
                                    .bodyName("name")
                                    .type(BoxUpdateParams.ProxyConfig.Rule.Header.Type.PLAINTEXT)
                                    .isSet(true)
                                    .value("value")
                                    .build()
                            )
                            .addMatchPath("string")
                            .build()
                    )
                    .build()
            )
            .ttlSeconds(0L)
            .vcpus(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = BoxUpdateParams.builder().pathName("name").build()

        assertThat(params._pathParam(0)).isEqualTo("name")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BoxUpdateParams.builder()
                .pathName("name")
                .fsCapacityBytes(0L)
                .idleTtlSeconds(0L)
                .memBytes(0L)
                .bodyName("name")
                .proxyConfig(
                    BoxUpdateParams.ProxyConfig.builder()
                        .accessControl(
                            BoxUpdateParams.ProxyConfig.AccessControl.builder()
                                .addAllowList("string")
                                .addDenyList("string")
                                .build()
                        )
                        .addNoProxy("string")
                        .addRule(
                            BoxUpdateParams.ProxyConfig.Rule.builder()
                                .addMatchHost("string")
                                .bodyName("name")
                                .enabled(true)
                                .addHeader(
                                    BoxUpdateParams.ProxyConfig.Rule.Header.builder()
                                        .bodyName("name")
                                        .type(
                                            BoxUpdateParams.ProxyConfig.Rule.Header.Type.PLAINTEXT
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
                .ttlSeconds(0L)
                .vcpus(0L)
                .build()

        val body = params._body()

        assertThat(body.fsCapacityBytes()).contains(0L)
        assertThat(body.idleTtlSeconds()).contains(0L)
        assertThat(body.memBytes()).contains(0L)
        assertThat(body.bodyName()).contains("name")
        assertThat(body.proxyConfig())
            .contains(
                BoxUpdateParams.ProxyConfig.builder()
                    .accessControl(
                        BoxUpdateParams.ProxyConfig.AccessControl.builder()
                            .addAllowList("string")
                            .addDenyList("string")
                            .build()
                    )
                    .addNoProxy("string")
                    .addRule(
                        BoxUpdateParams.ProxyConfig.Rule.builder()
                            .addMatchHost("string")
                            .bodyName("name")
                            .enabled(true)
                            .addHeader(
                                BoxUpdateParams.ProxyConfig.Rule.Header.builder()
                                    .bodyName("name")
                                    .type(BoxUpdateParams.ProxyConfig.Rule.Header.Type.PLAINTEXT)
                                    .isSet(true)
                                    .value("value")
                                    .build()
                            )
                            .addMatchPath("string")
                            .build()
                    )
                    .build()
            )
        assertThat(body.ttlSeconds()).contains(0L)
        assertThat(body.vcpus()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BoxUpdateParams.builder().pathName("name").build()

        val body = params._body()
    }
}
