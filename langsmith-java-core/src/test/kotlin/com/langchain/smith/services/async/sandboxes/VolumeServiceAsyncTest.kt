// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.sandboxes

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.sandboxes.volumes.VolumeCloneParams
import com.langchain.smith.models.sandboxes.volumes.VolumeCreateParams
import com.langchain.smith.models.sandboxes.volumes.VolumeUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VolumeServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val volumeServiceAsync = client.sandboxes().volumes()

        val volumeResponseFuture =
            volumeServiceAsync.create(
                VolumeCreateParams.builder()
                    .name("name")
                    .sizeBytes(0L)
                    .description("description")
                    .labels(
                        VolumeCreateParams.Labels.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val volumeResponse = volumeResponseFuture.get()
        volumeResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val volumeServiceAsync = client.sandboxes().volumes()

        val volumeResponseFuture = volumeServiceAsync.retrieve("volume")

        val volumeResponse = volumeResponseFuture.get()
        volumeResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val volumeServiceAsync = client.sandboxes().volumes()

        val volumeResponseFuture =
            volumeServiceAsync.update(
                VolumeUpdateParams.builder()
                    .volume("volume")
                    .description("description")
                    .labels(
                        VolumeUpdateParams.Labels.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val volumeResponse = volumeResponseFuture.get()
        volumeResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val volumeServiceAsync = client.sandboxes().volumes()

        val pageFuture = volumeServiceAsync.list()

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
        val volumeServiceAsync = client.sandboxes().volumes()

        val future = volumeServiceAsync.delete("volume")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun clone() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val volumeServiceAsync = client.sandboxes().volumes()

        val volumeResponseFuture =
            volumeServiceAsync.clone(
                VolumeCloneParams.builder()
                    .volume("volume")
                    .name("name")
                    .description("description")
                    .labels(
                        VolumeCloneParams.Labels.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val volumeResponse = volumeResponseFuture.get()
        volumeResponse.validate()
    }
}
