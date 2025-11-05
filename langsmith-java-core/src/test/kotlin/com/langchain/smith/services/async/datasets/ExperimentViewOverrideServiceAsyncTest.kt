// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.datasets

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.datasets.experimentviewoverrides.ColumnOverride
import com.langchain.smith.models.datasets.experimentviewoverrides.ExperimentViewOverrideCreateParams
import com.langchain.smith.models.datasets.experimentviewoverrides.ExperimentViewOverrideDeleteParams
import com.langchain.smith.models.datasets.experimentviewoverrides.ExperimentViewOverrideRetrieveParams
import com.langchain.smith.models.datasets.experimentviewoverrides.ExperimentViewOverrideUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExperimentViewOverrideServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val experimentViewOverrideServiceAsync = client.datasets().experimentViewOverrides()

        val experimentViewOverrideFuture =
            experimentViewOverrideServiceAsync.create(
                ExperimentViewOverrideCreateParams.builder()
                    .datasetId(JsonValue.from("\"550e8400-e29b-41d4-a716-446655440000\""))
                    .addColumnOverride(
                        ColumnOverride.builder()
                            .column("column")
                            .addColorGradient(listOf(JsonValue.from(mapOf<String, Any>())))
                            .colorMap(
                                ColumnOverride.ColorMap.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .hide(true)
                            .precision(1L)
                            .build()
                    )
                    .build()
            )

        val experimentViewOverride = experimentViewOverrideFuture.get()
        experimentViewOverride.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val experimentViewOverrideServiceAsync = client.datasets().experimentViewOverrides()

        val experimentViewOverrideFuture =
            experimentViewOverrideServiceAsync.retrieve(
                ExperimentViewOverrideRetrieveParams.builder()
                    .datasetId(JsonValue.from("\"550e8400-e29b-41d4-a716-446655440000\""))
                    .id(JsonValue.from("\"123e4567-e89b-12d3-a456-426614174000\""))
                    .build()
            )

        val experimentViewOverride = experimentViewOverrideFuture.get()
        experimentViewOverride.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val experimentViewOverrideServiceAsync = client.datasets().experimentViewOverrides()

        val experimentViewOverrideFuture =
            experimentViewOverrideServiceAsync.update(
                ExperimentViewOverrideUpdateParams.builder()
                    .datasetId(JsonValue.from("\"550e8400-e29b-41d4-a716-446655440000\""))
                    .id(JsonValue.from("\"123e4567-e89b-12d3-a456-426614174000\""))
                    .addColumnOverride(
                        ColumnOverride.builder()
                            .column("column")
                            .addColorGradient(listOf(JsonValue.from(mapOf<String, Any>())))
                            .colorMap(
                                ColumnOverride.ColorMap.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .hide(true)
                            .precision(1L)
                            .build()
                    )
                    .build()
            )

        val experimentViewOverride = experimentViewOverrideFuture.get()
        experimentViewOverride.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val experimentViewOverrideServiceAsync = client.datasets().experimentViewOverrides()

        val experimentViewOverridesFuture =
            experimentViewOverrideServiceAsync.list(
                JsonValue.from("\"550e8400-e29b-41d4-a716-446655440000\"")
            )

        val experimentViewOverrides = experimentViewOverridesFuture.get()
        experimentViewOverrides.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val experimentViewOverrideServiceAsync = client.datasets().experimentViewOverrides()

        val future =
            experimentViewOverrideServiceAsync.delete(
                ExperimentViewOverrideDeleteParams.builder()
                    .datasetId(JsonValue.from("\"550e8400-e29b-41d4-a716-446655440000\""))
                    .id(JsonValue.from("\"123e4567-e89b-12d3-a456-426614174000\""))
                    .build()
            )

        val response = future.get()
    }
}
