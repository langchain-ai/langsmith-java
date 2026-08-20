// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.sandboxes

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.sandboxes.snapshots.SnapshotCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SnapshotServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val snapshotServiceAsync = client.sandboxes().snapshots()

        val snapshotResponseFuture =
            snapshotServiceAsync.create(
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

        val snapshotResponse = snapshotResponseFuture.get()
        snapshotResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val snapshotServiceAsync = client.sandboxes().snapshots()

        val snapshotResponseFuture = snapshotServiceAsync.retrieve("snapshot_id")

        val snapshotResponse = snapshotResponseFuture.get()
        snapshotResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val snapshotServiceAsync = client.sandboxes().snapshots()

        val pageFuture = snapshotServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val snapshotServiceAsync = client.sandboxes().snapshots()

        val future = snapshotServiceAsync.delete("snapshot_id")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveByName() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val snapshotServiceAsync = client.sandboxes().snapshots()

        val responseFuture = snapshotServiceAsync.retrieveByName("name")

        val response = responseFuture.get()
        response.validate()
    }
}
