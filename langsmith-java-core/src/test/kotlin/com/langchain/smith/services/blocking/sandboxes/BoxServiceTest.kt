// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sandboxes

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.sandboxes.ProxyConfig
import com.langchain.smith.models.sandboxes.SandboxMountConfig
import com.langchain.smith.models.sandboxes.boxes.BoxCreateParams
import com.langchain.smith.models.sandboxes.boxes.BoxCreateSnapshotParams
import com.langchain.smith.models.sandboxes.boxes.BoxDeleteServiceUrlParams
import com.langchain.smith.models.sandboxes.boxes.BoxGenerateDownloadUrlParams
import com.langchain.smith.models.sandboxes.boxes.BoxGenerateServiceUrlParams
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
                    .accessDelegation(
                        BoxCreateParams.AccessDelegation.builder()
                            .mode(BoxCreateParams.AccessDelegation.Mode.INHERIT)
                            .addPermission("string")
                            .build()
                    )
                    .cpuMillicores(0L)
                    .deleteAfterStopSeconds(0L)
                    .envVars(
                        BoxCreateParams.EnvVars.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .fsCapacityBytes(0L)
                    .idleTtlSeconds(0L)
                    .labels(
                        BoxCreateParams.Labels.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .memBytes(0L)
                    .mountConfig(
                        SandboxMountConfig.builder()
                            .auth(
                                SandboxMountConfig.Auth.builder()
                                    .aws(
                                        SandboxMountConfig.Auth.Aws
                                            .SandboxesSandboxAwsMountRoleAuthConfig
                                            .builder()
                                            .roleArn("x")
                                            .subjectScope(
                                                "tag:2fdcD1Dc-bbDb-2BBD-0Afa-1A3C33cFaADc"
                                            )
                                            .build()
                                    )
                                    .azure(
                                        SandboxMountConfig.Auth.Azure
                                            .SandboxesSandboxAzureMountWorkloadIdentityAuthConfig
                                            .builder()
                                            .clientId("E1CB97d8-Ddf3-aAae-0Afa-1A3C33cFaADc")
                                            .tenantId("E1CB97d8-Ddf3-aAae-0Afa-1A3C33cFaADc")
                                            .subjectScope(
                                                "tag:2fdcD1Dc-bbDb-2BBD-0Afa-1A3C33cFaADc"
                                            )
                                            .build()
                                    )
                                    .gcp(
                                        SandboxMountConfig.Auth.Gcp
                                            .SandboxesSandboxGcpMountWorkloadIdentityAuthConfig
                                            .builder()
                                            .workloadIdentityProvider("x")
                                            .serviceAccountEmail("service_account_email")
                                            .subjectScope(
                                                "tag:2fdcD1Dc-bbDb-2BBD-0Afa-1A3C33cFaADc"
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .addMount(
                                SandboxMountConfig.Mount.SandboxapiS3BucketMountSpec.builder()
                                    .id("id")
                                    .mountPath("mount_path")
                                    .s3(
                                        SandboxMountConfig.Mount.SandboxapiS3BucketMountSpec.S3
                                            .builder()
                                            .bucket("bucket")
                                            .region("region")
                                            .endpointUrl("endpoint_url")
                                            .pathStyle(true)
                                            .prefix("prefix")
                                            .build()
                                    )
                                    .type(
                                        SandboxMountConfig.Mount.SandboxapiS3BucketMountSpec.Type.S3
                                    )
                                    .azureBlob(
                                        SandboxMountConfig.Mount.SandboxapiS3BucketMountSpec
                                            .AzureBlob
                                            .builder()
                                            .container("container")
                                            .storageAccount("26f1klzn5713")
                                            .prefix("prefix")
                                            .build()
                                    )
                                    .cache(
                                        SandboxMountConfig.Mount.SandboxapiS3BucketMountSpec.Cache
                                            .builder()
                                            .maxSizeBytes(0L)
                                            .writebackSeconds(0L)
                                            .build()
                                    )
                                    .contexthub(
                                        SandboxMountConfig.Mount.SandboxapiS3BucketMountSpec
                                            .Contexthub
                                            .builder()
                                            .repo("repo")
                                            .initialPullOnly(true)
                                            .build()
                                    )
                                    .encryption(
                                        SandboxMountConfig.Mount.SandboxapiS3BucketMountSpec
                                            .Encryption
                                            .builder()
                                            .kmsKey("kms_key")
                                            .build()
                                    )
                                    .gcs(
                                        SandboxMountConfig.Mount.SandboxapiS3BucketMountSpec.Gcs
                                            .builder()
                                            .bucket("bucket")
                                            .prefix("prefix")
                                            .build()
                                    )
                                    .git(
                                        SandboxMountConfig.Mount.SandboxapiS3BucketMountSpec.Git
                                            .builder()
                                            .remoteUrl("remote_url")
                                            .ref(
                                                SandboxMountConfig.Mount.SandboxapiS3BucketMountSpec
                                                    .Git
                                                    .Ref
                                                    .builder()
                                                    .name("name")
                                                    .type(
                                                        SandboxMountConfig.Mount
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
                                            .subjectScope(
                                                "tag:2fdcD1Dc-bbDb-2BBD-0Afa-1A3C33cFaADc"
                                            )
                                            .build()
                                    )
                                    .azure(
                                        ProxyConfig.Rule.Azure
                                            .SandboxesProxyAzureWorkloadIdentityConfig
                                            .builder()
                                            .clientId("E1CB97d8-Ddf3-aAae-0Afa-1A3C33cFaADc")
                                            .tenantId("E1CB97d8-Ddf3-aAae-0Afa-1A3C33cFaADc")
                                            .addResource(
                                                ProxyConfig.Rule.Azure
                                                    .SandboxesProxyAzureWorkloadIdentityConfig
                                                    .Resource
                                                    .HTTPS_STORAGE_AZURE_COM
                                            )
                                            .subjectScope(
                                                "tag:2fdcD1Dc-bbDb-2BBD-0Afa-1A3C33cFaADc"
                                            )
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
                                        ProxyConfig.Rule.Gcp.SandboxesProxyGcpWorkloadIdentityConfig
                                            .builder()
                                            .workloadIdentityProvider("x")
                                            .addScope("string")
                                            .serviceAccountEmail("service_account_email")
                                            .subjectScope(
                                                "tag:2fdcD1Dc-bbDb-2BBD-0Afa-1A3C33cFaADc"
                                            )
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
                    )
                    .restoreMemory(true)
                    .runConfig(
                        BoxCreateParams.RunConfig.builder()
                            .envVars(
                                BoxCreateParams.RunConfig.EnvVars.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .user("user")
                            .workDir("work_dir")
                            .build()
                    )
                    .snapshot("snapshot")
                    .snapshotId("snapshot_id")
                    .snapshotName("snapshot_name")
                    .addTagValueId("string")
                    .vcpus(0L)
                    .addVolume(
                        BoxCreateParams.Volume.builder()
                            .mountPath("mount_path")
                            .volume("volume")
                            .readOnly(true)
                            .build()
                    )
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
                                            .subjectScope(
                                                "tag:2fdcD1Dc-bbDb-2BBD-0Afa-1A3C33cFaADc"
                                            )
                                            .build()
                                    )
                                    .azure(
                                        ProxyConfig.Rule.Azure
                                            .SandboxesProxyAzureWorkloadIdentityConfig
                                            .builder()
                                            .clientId("E1CB97d8-Ddf3-aAae-0Afa-1A3C33cFaADc")
                                            .tenantId("E1CB97d8-Ddf3-aAae-0Afa-1A3C33cFaADc")
                                            .addResource(
                                                ProxyConfig.Rule.Azure
                                                    .SandboxesProxyAzureWorkloadIdentityConfig
                                                    .Resource
                                                    .HTTPS_STORAGE_AZURE_COM
                                            )
                                            .subjectScope(
                                                "tag:2fdcD1Dc-bbDb-2BBD-0Afa-1A3C33cFaADc"
                                            )
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
                                        ProxyConfig.Rule.Gcp.SandboxesProxyGcpWorkloadIdentityConfig
                                            .builder()
                                            .workloadIdentityProvider("x")
                                            .addScope("string")
                                            .serviceAccountEmail("service_account_email")
                                            .subjectScope(
                                                "tag:2fdcD1Dc-bbDb-2BBD-0Afa-1A3C33cFaADc"
                                            )
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
                    )
                    .runConfig(
                        BoxUpdateParams.RunConfig.builder()
                            .envVars(
                                BoxUpdateParams.RunConfig.EnvVars.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .user("user")
                            .workDir("work_dir")
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

        val page = boxService.list()

        page.response().validate()
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
                    .confirmAllowSnapshotSecretValues(true)
                    .description("description")
                    .dockerImage("docker_image")
                    .fsCapacityBytes(0L)
                    .imageConfig(
                        BoxCreateSnapshotParams.ImageConfig.builder()
                            .addCmd("string")
                            .addEntrypoint("string")
                            .addExposedPort(0L)
                            .build()
                    )
                    .addInclude(BoxCreateSnapshotParams.Include.ALL)
                    .includeMemory(true)
                    .labels(
                        BoxCreateSnapshotParams.Labels.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .runConfig(
                        BoxCreateSnapshotParams.RunConfig.builder()
                            .envVars(
                                BoxCreateSnapshotParams.RunConfig.EnvVars.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .user("user")
                            .workDir("work_dir")
                            .build()
                    )
                    .tag("tag")
                    .build()
            )

        snapshotResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteServiceUrl() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val boxService = client.sandboxes().boxes()

        boxService.deleteServiceUrl(
            BoxDeleteServiceUrlParams.builder().name("name").port(0L).build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun generateDownloadUrl() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val boxService = client.sandboxes().boxes()

        val downloadUrlResponse =
            boxService.generateDownloadUrl(
                BoxGenerateDownloadUrlParams.builder()
                    .name("name")
                    .path("path")
                    .contentDisposition("content_disposition")
                    .contentType("content_type")
                    .cspSandbox(true)
                    .addCspSandboxFlag(BoxGenerateDownloadUrlParams.CspSandboxFlag.ALLOW_DOWNLOADS)
                    .addCspSourceBundle(BoxGenerateDownloadUrlParams.CspSourceBundle.CDNJS)
                    .expiresInSeconds(0L)
                    .build()
            )

        downloadUrlResponse.validate()
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
                    .access(BoxGenerateServiceUrlParams.Access.RESTRICTED)
                    .addEmbedOrigin("string")
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
    fun listServiceUrls() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val boxService = client.sandboxes().boxes()

        val page = boxService.listServiceUrls("name")

        page.response().validate()
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
