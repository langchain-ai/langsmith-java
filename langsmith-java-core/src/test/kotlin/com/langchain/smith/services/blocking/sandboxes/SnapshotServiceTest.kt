// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sandboxes

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.sandboxes.snapshots.SnapshotCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SnapshotServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val snapshotService = client.sandboxes().snapshots()

        val snapshotResponse =
            snapshotService.create(
                SnapshotCreateParams.builder()
                    .dockerImage("docker_image")
                    .fsCapacityBytes(0L)
                    .name("name")
                    .labels(
                        SnapshotCreateParams.Labels.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .registryId("registry_id")
                    .tag("tag")
                    .build()
            )

        snapshotResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val snapshotService = client.sandboxes().snapshots()

        val snapshotResponse = snapshotService.retrieve("snapshot_id")

        snapshotResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val snapshotService = client.sandboxes().snapshots()

        val page = snapshotService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val snapshotService = client.sandboxes().snapshots()

        snapshotService.delete("snapshot_id")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveByName() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val snapshotService = client.sandboxes().snapshots()

        val response = snapshotService.retrieveByName("name")

        response.validate()
    }
}
