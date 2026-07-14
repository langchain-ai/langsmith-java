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

        val sandboxResponse =
            boxService.create(
                BoxCreateParams.builder()
                    .cpuMillicores(0L)
                    .deleteAfterStopSeconds(0L)
                    .envVars(
                        BoxCreateParams.EnvVars.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .fsCapacityBytes(0L)
                    .idleTtlSeconds(0L)
                    .memBytes(0L)
                    .mountConfig(
                        BoxCreateParams.MountConfig.builder()
                            .auth(
                                BoxCreateParams.MountConfig.Auth.builder()
                                    .aws(
                                        BoxCreateParams.MountConfig.Auth.Aws.builder()
                                            .accessKeyId(
                                                BoxCreateParams.MountConfig.Auth.Aws.AccessKeyId
                                                    .builder()
                                                    .type(
                                                        BoxCreateParams.MountConfig.Auth.Aws
                                                            .AccessKeyId
                                                            .Type
                                                            .PLAINTEXT
                                                    )
                                                    .isSet(true)
                                                    .value("value")
                                                    .build()
                                            )
                                            .secretAccessKey(
                                                BoxCreateParams.MountConfig.Auth.Aws.SecretAccessKey
                                                    .builder()
                                                    .type(
                                                        BoxCreateParams.MountConfig.Auth.Aws
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
                                    .gcp(
                                        BoxCreateParams.MountConfig.Auth.Gcp.builder()
                                            .serviceAccountJson(
                                                BoxCreateParams.MountConfig.Auth.Gcp
                                                    .ServiceAccountJson
                                                    .builder()
                                                    .type(
                                                        BoxCreateParams.MountConfig.Auth.Gcp
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
                                    .build()
                            )
                            .addMount(
                                BoxCreateParams.MountConfig.Mount.SandboxapiS3BucketMountSpec
                                    .builder()
                                    .id("id")
                                    .mountPath("mount_path")
                                    .s3(
                                        BoxCreateParams.MountConfig.Mount
                                            .SandboxapiS3BucketMountSpec
                                            .S3
                                            .builder()
                                            .bucket("bucket")
                                            .region("region")
                                            .endpointUrl("endpoint_url")
                                            .pathStyle(true)
                                            .prefix("prefix")
                                            .build()
                                    )
                                    .type(
                                        BoxCreateParams.MountConfig.Mount
                                            .SandboxapiS3BucketMountSpec
                                            .Type
                                            .S3
                                    )
                                    .cache(
                                        BoxCreateParams.MountConfig.Mount
                                            .SandboxapiS3BucketMountSpec
                                            .Cache
                                            .builder()
                                            .maxSizeBytes(0L)
                                            .writebackSeconds(0L)
                                            .build()
                                    )
                                    .contexthub(
                                        BoxCreateParams.MountConfig.Mount
                                            .SandboxapiS3BucketMountSpec
                                            .Contexthub
                                            .builder()
                                            .repo("repo")
                                            .initialPullOnly(true)
                                            .build()
                                    )
                                    .gcs(
                                        BoxCreateParams.MountConfig.Mount
                                            .SandboxapiS3BucketMountSpec
                                            .Gcs
                                            .builder()
                                            .bucket("bucket")
                                            .prefix("prefix")
                                            .build()
                                    )
                                    .git(
                                        BoxCreateParams.MountConfig.Mount
                                            .SandboxapiS3BucketMountSpec
                                            .Git
                                            .builder()
                                            .remoteUrl("remote_url")
                                            .ref(
                                                BoxCreateParams.MountConfig.Mount
                                                    .SandboxapiS3BucketMountSpec
                                                    .Git
                                                    .Ref
                                                    .builder()
                                                    .name("name")
                                                    .type(
                                                        BoxCreateParams.MountConfig.Mount
                                                            .SandboxapiS3BucketMountSpec
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
                            .build()
                    )
                    .name("name")
                    .preserveMemoryOnStop(true)
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

        sandboxResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val boxService = client.sandboxes().boxes()

        val sandboxResponse = boxService.retrieve("name")

        sandboxResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val boxService = client.sandboxes().boxes()

        val sandboxResponse =
            boxService.update(
                BoxUpdateParams.builder()
                    .pathName("name")
                    .cpuMillicores(0L)
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

        sandboxResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val boxService = client.sandboxes().boxes()

        val sandboxListResponse =
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

        sandboxListResponse.validate()
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

        val snapshotResponse =
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

        snapshotResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun generateServiceUrl() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val boxService = client.sandboxes().boxes()

        val serviceUrlResponse =
            boxService.generateServiceUrl(
                BoxGenerateServiceUrlParams.builder()
                    .name("name")
                    .expiresInSeconds(0L)
                    .port(0L)
                    .build()
            )

        serviceUrlResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getStatus() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val boxService = client.sandboxes().boxes()

        val sandboxStatusResponse = boxService.getStatus("name")

        sandboxStatusResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun start() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val boxService = client.sandboxes().boxes()

        val sandboxResponse = boxService.start("name")

        sandboxResponse.validate()
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
