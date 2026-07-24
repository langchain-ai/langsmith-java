// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.info

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InfoListResponseTest {

    @Test
    fun create() {
        val infoListResponse =
            InfoListResponse.builder()
                .batchIngestConfig(
                    InfoListResponse.BatchIngestConfig.builder()
                        .scaleDownNemptyTrigger(0L)
                        .scaleUpNthreadsLimit(0L)
                        .scaleUpQsizeTrigger(0L)
                        .sizeLimit(0L)
                        .sizeLimitBytes(0L)
                        .useMultipartEndpoint(true)
                        .build()
                )
                .customerInfo(
                    InfoListResponse.CustomerInfo.builder()
                        .customerId("customer_id")
                        .customerName("customer_name")
                        .build()
                )
                .gitSha("git_sha")
                .instanceFlags(
                    InfoListResponse.InstanceFlags.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .licenseExpirationTime("license_expiration_time")
                .sdkVersions(
                    InfoListResponse.SdkVersions.builder()
                        .maxGoSdkVersion("max_go_sdk_version")
                        .maxJavaSdkVersion("max_java_sdk_version")
                        .maxJsSdkVersion("max_js_sdk_version")
                        .maxPythonSdkVersion("max_python_sdk_version")
                        .build()
                )
                .version("version")
                .build()

        assertThat(infoListResponse.batchIngestConfig())
            .contains(
                InfoListResponse.BatchIngestConfig.builder()
                    .scaleDownNemptyTrigger(0L)
                    .scaleUpNthreadsLimit(0L)
                    .scaleUpQsizeTrigger(0L)
                    .sizeLimit(0L)
                    .sizeLimitBytes(0L)
                    .useMultipartEndpoint(true)
                    .build()
            )
        assertThat(infoListResponse.customerInfo())
            .contains(
                InfoListResponse.CustomerInfo.builder()
                    .customerId("customer_id")
                    .customerName("customer_name")
                    .build()
            )
        assertThat(infoListResponse.gitSha()).contains("git_sha")
        assertThat(infoListResponse.instanceFlags())
            .contains(
                InfoListResponse.InstanceFlags.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(infoListResponse.licenseExpirationTime()).contains("license_expiration_time")
        assertThat(infoListResponse.sdkVersions())
            .contains(
                InfoListResponse.SdkVersions.builder()
                    .maxGoSdkVersion("max_go_sdk_version")
                    .maxJavaSdkVersion("max_java_sdk_version")
                    .maxJsSdkVersion("max_js_sdk_version")
                    .maxPythonSdkVersion("max_python_sdk_version")
                    .build()
            )
        assertThat(infoListResponse.version()).contains("version")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val infoListResponse =
            InfoListResponse.builder()
                .batchIngestConfig(
                    InfoListResponse.BatchIngestConfig.builder()
                        .scaleDownNemptyTrigger(0L)
                        .scaleUpNthreadsLimit(0L)
                        .scaleUpQsizeTrigger(0L)
                        .sizeLimit(0L)
                        .sizeLimitBytes(0L)
                        .useMultipartEndpoint(true)
                        .build()
                )
                .customerInfo(
                    InfoListResponse.CustomerInfo.builder()
                        .customerId("customer_id")
                        .customerName("customer_name")
                        .build()
                )
                .gitSha("git_sha")
                .instanceFlags(
                    InfoListResponse.InstanceFlags.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .licenseExpirationTime("license_expiration_time")
                .sdkVersions(
                    InfoListResponse.SdkVersions.builder()
                        .maxGoSdkVersion("max_go_sdk_version")
                        .maxJavaSdkVersion("max_java_sdk_version")
                        .maxJsSdkVersion("max_js_sdk_version")
                        .maxPythonSdkVersion("max_python_sdk_version")
                        .build()
                )
                .version("version")
                .build()

        val roundtrippedInfoListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(infoListResponse),
                jacksonTypeRef<InfoListResponse>(),
            )

        assertThat(roundtrippedInfoListResponse).isEqualTo(infoListResponse)
    }
}
