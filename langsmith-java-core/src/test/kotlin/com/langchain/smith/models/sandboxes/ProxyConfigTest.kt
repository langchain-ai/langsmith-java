// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProxyConfigTest {

    @Test
    fun create() {
        val proxyConfig =
            ProxyConfig.builder()
                .accessControl(
                    ProxyConfig.AccessControl.builder()
                        .addAllowList("string")
                        .addDenyList("string")
                        .build()
                )
                .addCallback(
                    ProxyConfig.Callback.builder()
                        .addMatchHost("string")
                        .ttlSeconds(60L)
                        .url("url")
                        .fullRequest(true)
                        .addRequestHeader(
                            ProxyConfig.Callback.RequestHeader.builder()
                                .name("name")
                                .type(ProxyConfig.Callback.RequestHeader.Type.PLAINTEXT)
                                .isSet(true)
                                .value("value")
                                .build()
                        )
                        .build()
                )
                .description("description")
                .addNoProxy("string")
                .addRule(
                    ProxyConfig.Rule.builder()
                        .name("name")
                        .aws(
                            ProxyConfig.Rule.Aws.SandboxesProxyAwsRoleConfig.builder()
                                .roleArn("x")
                                .subjectScope("tag:2fdcD1Dc-bbDb-2BBD-0Afa-1A3C33cFaADc")
                                .build()
                        )
                        .azure(
                            ProxyConfig.Rule.Azure.SandboxesProxyAzureWorkloadIdentityConfig
                                .builder()
                                .clientId("E1CB97d8-Ddf3-aAae-0Afa-1A3C33cFaADc")
                                .tenantId("E1CB97d8-Ddf3-aAae-0Afa-1A3C33cFaADc")
                                .addResource(
                                    ProxyConfig.Rule.Azure.SandboxesProxyAzureWorkloadIdentityConfig
                                        .Resource
                                        .HTTPS_STORAGE_AZURE_COM
                                )
                                .subjectScope("tag:2fdcD1Dc-bbDb-2BBD-0Afa-1A3C33cFaADc")
                                .build()
                        )
                        .description("description")
                        .enabled(true)
                        .envVars(
                            ProxyConfig.Rule.EnvVars.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .gcp(
                            ProxyConfig.Rule.Gcp.SandboxesProxyGcpWorkloadIdentityConfig.builder()
                                .workloadIdentityProvider("x")
                                .addScope("string")
                                .serviceAccountEmail("service_account_email")
                                .subjectScope("tag:2fdcD1Dc-bbDb-2BBD-0Afa-1A3C33cFaADc")
                                .build()
                        )
                        .addHeader(
                            ProxyConfig.Rule.Header.builder()
                                .name("name")
                                .type(ProxyConfig.Rule.Header.Type.PLAINTEXT)
                                .isSet(true)
                                .value("value")
                                .build()
                        )
                        .addMatchHeader("string")
                        .addMatchHost("string")
                        .addMatchPath("string")
                        .type("type")
                        .build()
                )
                .build()

        assertThat(proxyConfig.accessControl())
            .contains(
                ProxyConfig.AccessControl.builder()
                    .addAllowList("string")
                    .addDenyList("string")
                    .build()
            )
        assertThat(proxyConfig.callbacks().getOrNull())
            .containsExactly(
                ProxyConfig.Callback.builder()
                    .addMatchHost("string")
                    .ttlSeconds(60L)
                    .url("url")
                    .fullRequest(true)
                    .addRequestHeader(
                        ProxyConfig.Callback.RequestHeader.builder()
                            .name("name")
                            .type(ProxyConfig.Callback.RequestHeader.Type.PLAINTEXT)
                            .isSet(true)
                            .value("value")
                            .build()
                    )
                    .build()
            )
        assertThat(proxyConfig.description()).contains("description")
        assertThat(proxyConfig.noProxy().getOrNull()).containsExactly("string")
        assertThat(proxyConfig.rules().getOrNull())
            .containsExactly(
                ProxyConfig.Rule.builder()
                    .name("name")
                    .aws(
                        ProxyConfig.Rule.Aws.SandboxesProxyAwsRoleConfig.builder()
                            .roleArn("x")
                            .subjectScope("tag:2fdcD1Dc-bbDb-2BBD-0Afa-1A3C33cFaADc")
                            .build()
                    )
                    .azure(
                        ProxyConfig.Rule.Azure.SandboxesProxyAzureWorkloadIdentityConfig.builder()
                            .clientId("E1CB97d8-Ddf3-aAae-0Afa-1A3C33cFaADc")
                            .tenantId("E1CB97d8-Ddf3-aAae-0Afa-1A3C33cFaADc")
                            .addResource(
                                ProxyConfig.Rule.Azure.SandboxesProxyAzureWorkloadIdentityConfig
                                    .Resource
                                    .HTTPS_STORAGE_AZURE_COM
                            )
                            .subjectScope("tag:2fdcD1Dc-bbDb-2BBD-0Afa-1A3C33cFaADc")
                            .build()
                    )
                    .description("description")
                    .enabled(true)
                    .envVars(
                        ProxyConfig.Rule.EnvVars.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .gcp(
                        ProxyConfig.Rule.Gcp.SandboxesProxyGcpWorkloadIdentityConfig.builder()
                            .workloadIdentityProvider("x")
                            .addScope("string")
                            .serviceAccountEmail("service_account_email")
                            .subjectScope("tag:2fdcD1Dc-bbDb-2BBD-0Afa-1A3C33cFaADc")
                            .build()
                    )
                    .addHeader(
                        ProxyConfig.Rule.Header.builder()
                            .name("name")
                            .type(ProxyConfig.Rule.Header.Type.PLAINTEXT)
                            .isSet(true)
                            .value("value")
                            .build()
                    )
                    .addMatchHeader("string")
                    .addMatchHost("string")
                    .addMatchPath("string")
                    .type("type")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val proxyConfig =
            ProxyConfig.builder()
                .accessControl(
                    ProxyConfig.AccessControl.builder()
                        .addAllowList("string")
                        .addDenyList("string")
                        .build()
                )
                .addCallback(
                    ProxyConfig.Callback.builder()
                        .addMatchHost("string")
                        .ttlSeconds(60L)
                        .url("url")
                        .fullRequest(true)
                        .addRequestHeader(
                            ProxyConfig.Callback.RequestHeader.builder()
                                .name("name")
                                .type(ProxyConfig.Callback.RequestHeader.Type.PLAINTEXT)
                                .isSet(true)
                                .value("value")
                                .build()
                        )
                        .build()
                )
                .description("description")
                .addNoProxy("string")
                .addRule(
                    ProxyConfig.Rule.builder()
                        .name("name")
                        .aws(
                            ProxyConfig.Rule.Aws.SandboxesProxyAwsRoleConfig.builder()
                                .roleArn("x")
                                .subjectScope("tag:2fdcD1Dc-bbDb-2BBD-0Afa-1A3C33cFaADc")
                                .build()
                        )
                        .azure(
                            ProxyConfig.Rule.Azure.SandboxesProxyAzureWorkloadIdentityConfig
                                .builder()
                                .clientId("E1CB97d8-Ddf3-aAae-0Afa-1A3C33cFaADc")
                                .tenantId("E1CB97d8-Ddf3-aAae-0Afa-1A3C33cFaADc")
                                .addResource(
                                    ProxyConfig.Rule.Azure.SandboxesProxyAzureWorkloadIdentityConfig
                                        .Resource
                                        .HTTPS_STORAGE_AZURE_COM
                                )
                                .subjectScope("tag:2fdcD1Dc-bbDb-2BBD-0Afa-1A3C33cFaADc")
                                .build()
                        )
                        .description("description")
                        .enabled(true)
                        .envVars(
                            ProxyConfig.Rule.EnvVars.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .gcp(
                            ProxyConfig.Rule.Gcp.SandboxesProxyGcpWorkloadIdentityConfig.builder()
                                .workloadIdentityProvider("x")
                                .addScope("string")
                                .serviceAccountEmail("service_account_email")
                                .subjectScope("tag:2fdcD1Dc-bbDb-2BBD-0Afa-1A3C33cFaADc")
                                .build()
                        )
                        .addHeader(
                            ProxyConfig.Rule.Header.builder()
                                .name("name")
                                .type(ProxyConfig.Rule.Header.Type.PLAINTEXT)
                                .isSet(true)
                                .value("value")
                                .build()
                        )
                        .addMatchHeader("string")
                        .addMatchHost("string")
                        .addMatchPath("string")
                        .type("type")
                        .build()
                )
                .build()

        val roundtrippedProxyConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(proxyConfig),
                jacksonTypeRef<ProxyConfig>(),
            )

        assertThat(roundtrippedProxyConfig).isEqualTo(proxyConfig)
    }
}
