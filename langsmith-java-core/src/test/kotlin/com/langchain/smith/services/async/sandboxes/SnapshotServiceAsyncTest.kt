// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.sandboxes

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.sandboxes.snapshots.SnapshotCreateParams
import com.langchain.smith.models.sandboxes.snapshots.SnapshotListParams
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

        val snapshotFuture =
            snapshotServiceAsync.create(
                SnapshotCreateParams.builder()
                    .dockerImage("docker_image")
                    .fsCapacityBytes(0L)
                    .name("name")
                    .registryId("registry_id")
                    .build()
            )

        val snapshot = snapshotFuture.get()
        snapshot.validate()
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

        val snapshotFuture = snapshotServiceAsync.retrieve("snapshot_id")

        val snapshot = snapshotFuture.get()
        snapshot.validate()
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

        val snapshotsFuture =
            snapshotServiceAsync.list(
                SnapshotListParams.builder()
                    .limit(0L)
                    .nameContains("name_contains")
                    .offset(0L)
                    .sortBy("sort_by")
                    .sortDirection("sort_direction")
                    .status("status")
                    .build()
            )

        val snapshots = snapshotsFuture.get()
        snapshots.validate()
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
}
