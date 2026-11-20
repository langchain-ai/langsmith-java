// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sandboxes

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.sandboxes.volumes.VolumeCloneParams
import com.langchain.smith.models.sandboxes.volumes.VolumeCreateParams
import com.langchain.smith.models.sandboxes.volumes.VolumeUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VolumeServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val volumeService = client.sandboxes().volumes()

        val volumeResponse =
            volumeService.create(
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

        volumeResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val volumeService = client.sandboxes().volumes()

        val volumeResponse = volumeService.retrieve("volume")

        volumeResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val volumeService = client.sandboxes().volumes()

        val volumeResponse =
            volumeService.update(
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

        volumeResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val volumeService = client.sandboxes().volumes()

        val page = volumeService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val volumeService = client.sandboxes().volumes()

        volumeService.delete("volume")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun clone() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val volumeService = client.sandboxes().volumes()

        val volumeResponse =
            volumeService.clone(
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

        volumeResponse.validate()
    }
}
