// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sandboxes

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.sandboxes.boxes.BoxCreateParams
import com.langchain.smith.models.sandboxes.boxes.BoxCreateSnapshotParams
import com.langchain.smith.models.sandboxes.boxes.BoxGenerateServiceUrlParams
import com.langchain.smith.models.sandboxes.boxes.BoxListParams
import com.langchain.smith.models.sandboxes.boxes.BoxUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BoxServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val boxService = client.sandboxes().boxes()

        val box =
            boxService.create(
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
                                                BoxCreateParams.ProxyConfig.Rule.Header.Type
                                                    .PLAINTEXT
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
            )

        box.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val boxService = client.sandboxes().boxes()

        val box = boxService.retrieve("name")

        box.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val boxService = client.sandboxes().boxes()

        val box =
            boxService.update(
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
                                                BoxUpdateParams.ProxyConfig.Rule.Header.Type
                                                    .PLAINTEXT
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
            )

        box.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val boxService = client.sandboxes().boxes()

        val boxes =
            boxService.list(
                BoxListParams.builder()
                    .limit(0L)
                    .nameContains("name_contains")
                    .offset(0L)
                    .sortBy("sort_by")
                    .sortDirection("sort_direction")
                    .status("status")
                    .templateName("template_name")
                    .build()
            )

        boxes.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val boxService = client.sandboxes().boxes()

        boxService.delete("name")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createSnapshot() {
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val boxService = client.sandboxes().boxes()

        val response =
            boxService.createSnapshot(
                BoxCreateSnapshotParams.builder()
                    .pathName("name")
                    .bodyName("name")
                    .checkpoint("checkpoint")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun generateServiceUrl() {
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val boxService = client.sandboxes().boxes()

        val response =
            boxService.generateServiceUrl(
                BoxGenerateServiceUrlParams.builder()
                    .name("name")
                    .expiresInSeconds(0L)
                    .port(0L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getStatus() {
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val boxService = client.sandboxes().boxes()

        val response = boxService.getStatus("name")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun start() {
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val boxService = client.sandboxes().boxes()

        val response = boxService.start("name")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun stop() {
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val boxService = client.sandboxes().boxes()

        boxService.stop("name")
    }
}
