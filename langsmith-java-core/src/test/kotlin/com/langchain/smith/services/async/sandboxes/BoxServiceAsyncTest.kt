// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.sandboxes

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.sandboxes.boxes.BoxCreateParams
import com.langchain.smith.models.sandboxes.boxes.BoxCreateSnapshotParams
import com.langchain.smith.models.sandboxes.boxes.BoxGenerateServiceUrlParams
import com.langchain.smith.models.sandboxes.boxes.BoxListParams
import com.langchain.smith.models.sandboxes.boxes.BoxUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BoxServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val boxServiceAsync = client.sandboxes().boxes()

        val boxFuture =
            boxServiceAsync.create(
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
                                                BoxCreateParams.ProxyConfig.Callback.RequestHeader
                                                    .Type
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

        val box = boxFuture.get()
        box.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val boxServiceAsync = client.sandboxes().boxes()

        val boxFuture = boxServiceAsync.retrieve("name")

        val box = boxFuture.get()
        box.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val boxServiceAsync = client.sandboxes().boxes()

        val boxFuture =
            boxServiceAsync.update(
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
                            .addCallback(
                                BoxUpdateParams.ProxyConfig.Callback.builder()
                                    .addMatchHost("string")
                                    .ttlSeconds(60L)
                                    .url("url")
                                    .addRequestHeader(
                                        BoxUpdateParams.ProxyConfig.Callback.RequestHeader.builder()
                                            .bodyName("name")
                                            .type(
                                                BoxUpdateParams.ProxyConfig.Callback.RequestHeader
                                                    .Type
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

        val box = boxFuture.get()
        box.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val boxServiceAsync = client.sandboxes().boxes()

        val boxesFuture =
            boxServiceAsync.list(
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

        val boxes = boxesFuture.get()
        boxes.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val boxServiceAsync = client.sandboxes().boxes()

        val future = boxServiceAsync.delete("name")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createSnapshot() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val boxServiceAsync = client.sandboxes().boxes()

        val responseFuture =
            boxServiceAsync.createSnapshot(
                BoxCreateSnapshotParams.builder()
                    .pathName("name")
                    .bodyName("name")
                    .checkpoint("checkpoint")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun generateServiceUrl() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val boxServiceAsync = client.sandboxes().boxes()

        val responseFuture =
            boxServiceAsync.generateServiceUrl(
                BoxGenerateServiceUrlParams.builder()
                    .name("name")
                    .expiresInSeconds(0L)
                    .port(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getStatus() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val boxServiceAsync = client.sandboxes().boxes()

        val responseFuture = boxServiceAsync.getStatus("name")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun start() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val boxServiceAsync = client.sandboxes().boxes()

        val responseFuture = boxServiceAsync.start("name")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun stop() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val boxServiceAsync = client.sandboxes().boxes()

        val future = boxServiceAsync.stop("name")

        val response = future.get()
    }
}
