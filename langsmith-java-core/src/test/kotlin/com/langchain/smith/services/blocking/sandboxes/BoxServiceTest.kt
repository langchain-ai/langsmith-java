// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sandboxes

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
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
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val boxService = client.sandboxes().boxes()

        val box =
            boxService.create(
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
                    .addMount(
                        BoxCreateParams.Mount.SandboxapiS3BucketMountSpec.builder()
                            .id("id")
                            .mountPath("mount_path")
                            .s3(
                                BoxCreateParams.Mount.SandboxapiS3BucketMountSpec.S3.builder()
                                    .bucket("bucket")
                                    .endpointUrl("endpoint_url")
                                    .region("region")
                                    .pathStyle(true)
                                    .prefix("prefix")
                                    .build()
                            )
                            .type(BoxCreateParams.Mount.SandboxapiS3BucketMountSpec.Type.S3)
                            .cache(
                                BoxCreateParams.Mount.SandboxapiS3BucketMountSpec.Cache.builder()
                                    .maxSizeBytes(0L)
                                    .writebackSeconds(0L)
                                    .build()
                            )
                            .gcs(
                                BoxCreateParams.Mount.SandboxapiS3BucketMountSpec.Gcs.builder()
                                    .bucket("bucket")
                                    .prefix("prefix")
                                    .build()
                            )
                            .git(
                                BoxCreateParams.Mount.SandboxapiS3BucketMountSpec.Git.builder()
                                    .remoteUrl("remote_url")
                                    .ref(
                                        BoxCreateParams.Mount.SandboxapiS3BucketMountSpec.Git.Ref
                                            .builder()
                                            .name("name")
                                            .type(
                                                BoxCreateParams.Mount.SandboxapiS3BucketMountSpec
                                                    .Git
                                                    .Ref
                                                    .Type
                                                    .BRANCH
                                            )
                                            .build()
                                    )
                                    .refreshIntervalSeconds(1L)
                                    .build()
                            )
                            .readOnly(true)
                            .build()
                    )
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
                                    .name("name")
                                    .aws(
                                        BoxCreateParams.ProxyConfig.Rule.Aws.builder()
                                            .accessKeyId(
                                                BoxCreateParams.ProxyConfig.Rule.Aws.AccessKeyId
                                                    .builder()
                                                    .type(
                                                        BoxCreateParams.ProxyConfig.Rule.Aws
                                                            .AccessKeyId
                                                            .Type
                                                            .PLAINTEXT
                                                    )
                                                    .isSet(true)
                                                    .value("value")
                                                    .build()
                                            )
                                            .secretAccessKey(
                                                BoxCreateParams.ProxyConfig.Rule.Aws.SecretAccessKey
                                                    .builder()
                                                    .type(
                                                        BoxCreateParams.ProxyConfig.Rule.Aws
                                                            .SecretAccessKey
                                                            .Type
                                                            .PLAINTEXT
                                                    )
                                                    .isSet(true)
                                                    .value("value")
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .enabled(true)
                                    .gcp(
                                        BoxCreateParams.ProxyConfig.Rule.Gcp.builder()
                                            .addScope("string")
                                            .serviceAccountJson(
                                                BoxCreateParams.ProxyConfig.Rule.Gcp
                                                    .ServiceAccountJson
                                                    .builder()
                                                    .type(
                                                        BoxCreateParams.ProxyConfig.Rule.Gcp
                                                            .ServiceAccountJson
                                                            .Type
                                                            .PLAINTEXT
                                                    )
                                                    .isSet(true)
                                                    .value("value")
                                                    .build()
                                            )
                                            .build()
                                    )
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
                                    .addMatchHost("string")
                                    .addMatchPath("string")
                                    .type("type")
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
            )

        box.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val boxService = client.sandboxes().boxes()

        val box = boxService.retrieve("name")

        box.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val boxService = client.sandboxes().boxes()

        val box =
            boxService.update(
                BoxUpdateParams.builder()
                    .pathName("name")
                    .deleteAfterStopSeconds(0L)
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
                                    .fullRequest(true)
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
                                    .bodyName("name")
                                    .aws(
                                        BoxUpdateParams.ProxyConfig.Rule.Aws.builder()
                                            .accessKeyId(
                                                BoxUpdateParams.ProxyConfig.Rule.Aws.AccessKeyId
                                                    .builder()
                                                    .type(
                                                        BoxUpdateParams.ProxyConfig.Rule.Aws
                                                            .AccessKeyId
                                                            .Type
                                                            .PLAINTEXT
                                                    )
                                                    .isSet(true)
                                                    .value("value")
                                                    .build()
                                            )
                                            .secretAccessKey(
                                                BoxUpdateParams.ProxyConfig.Rule.Aws.SecretAccessKey
                                                    .builder()
                                                    .type(
                                                        BoxUpdateParams.ProxyConfig.Rule.Aws
                                                            .SecretAccessKey
                                                            .Type
                                                            .PLAINTEXT
                                                    )
                                                    .isSet(true)
                                                    .value("value")
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .enabled(true)
                                    .gcp(
                                        BoxUpdateParams.ProxyConfig.Rule.Gcp.builder()
                                            .addScope("string")
                                            .serviceAccountJson(
                                                BoxUpdateParams.ProxyConfig.Rule.Gcp
                                                    .ServiceAccountJson
                                                    .builder()
                                                    .type(
                                                        BoxUpdateParams.ProxyConfig.Rule.Gcp
                                                            .ServiceAccountJson
                                                            .Type
                                                            .PLAINTEXT
                                                    )
                                                    .isSet(true)
                                                    .value("value")
                                                    .build()
                                            )
                                            .build()
                                    )
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
                                    .addMatchHost("string")
                                    .addMatchPath("string")
                                    .type("type")
                                    .build()
                            )
                            .build()
                    )
                    .addTagValueId("string")
                    .vcpus(0L)
                    .build()
            )

        box.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val boxService = client.sandboxes().boxes()

        val boxes =
            boxService.list(
                BoxListParams.builder()
                    .createdBy("created_by")
                    .limit(0L)
                    .nameContains("name_contains")
                    .offset(0L)
                    .sortBy("sort_by")
                    .sortDirection("sort_direction")
                    .status("status")
                    .build()
            )

        boxes.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val boxService = client.sandboxes().boxes()

        boxService.delete("name")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createSnapshot() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val boxService = client.sandboxes().boxes()

        val response =
            boxService.createSnapshot(
                BoxCreateSnapshotParams.builder()
                    .pathName("name")
                    .bodyName("name")
                    .checkpoint("checkpoint")
                    .dockerImage("docker_image")
                    .fsCapacityBytes(0L)
                    .includeMemory(true)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun generateServiceUrl() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
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
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val boxService = client.sandboxes().boxes()

        val response = boxService.getStatus("name")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun start() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val boxService = client.sandboxes().boxes()

        val response = boxService.start("name")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun stop() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val boxService = client.sandboxes().boxes()

        boxService.stop("name")
    }
}
