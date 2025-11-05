// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.datasets

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
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
internal class ExperimentViewOverrideServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val experimentViewOverrideService = client.datasets().experimentViewOverrides()

        val experimentViewOverride =
            experimentViewOverrideService.create(
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

        experimentViewOverride.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val experimentViewOverrideService = client.datasets().experimentViewOverrides()

        val experimentViewOverride =
            experimentViewOverrideService.retrieve(
                ExperimentViewOverrideRetrieveParams.builder()
                    .datasetId(JsonValue.from("\"550e8400-e29b-41d4-a716-446655440000\""))
                    .id(JsonValue.from("\"123e4567-e89b-12d3-a456-426614174000\""))
                    .build()
            )

        experimentViewOverride.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val experimentViewOverrideService = client.datasets().experimentViewOverrides()

        val experimentViewOverride =
            experimentViewOverrideService.update(
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

        experimentViewOverride.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val experimentViewOverrideService = client.datasets().experimentViewOverrides()

        val experimentViewOverrides =
            experimentViewOverrideService.list(
                JsonValue.from("\"550e8400-e29b-41d4-a716-446655440000\"")
            )

        experimentViewOverrides.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val experimentViewOverrideService = client.datasets().experimentViewOverrides()

        experimentViewOverrideService.delete(
            ExperimentViewOverrideDeleteParams.builder()
                .datasetId(JsonValue.from("\"550e8400-e29b-41d4-a716-446655440000\""))
                .id(JsonValue.from("\"123e4567-e89b-12d3-a456-426614174000\""))
                .build()
        )
    }
}
