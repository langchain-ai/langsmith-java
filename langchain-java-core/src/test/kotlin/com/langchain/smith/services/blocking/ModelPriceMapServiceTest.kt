// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.modelpricemap.ModelPriceMapModelPriceMapParams
import com.langchain.smith.models.modelpricemap.ModelPriceMapUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ModelPriceMapServiceTest {

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
        val modelPriceMapService = client.modelPriceMap()

        val modelPriceMap =
            modelPriceMapService.update(
                ModelPriceMapUpdateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .completionCost(0.0)
                    .matchPattern("match_pattern")
                    .name("name")
                    .promptCost(0.0)
                    .completionCostDetails(
                        ModelPriceMapUpdateParams.CompletionCostDetails.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .addMatchPath("string")
                    .promptCostDetails(
                        ModelPriceMapUpdateParams.PromptCostDetails.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .provider("provider")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        modelPriceMap.validate()
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
        val modelPriceMapService = client.modelPriceMap()

        val modelPriceMap = modelPriceMapService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        modelPriceMap.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun modelPriceMap() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val modelPriceMapService = client.modelPriceMap()

        val response =
            modelPriceMapService.modelPriceMap(
                ModelPriceMapModelPriceMapParams.builder()
                    .completionCost(0.0)
                    .matchPattern("match_pattern")
                    .name("name")
                    .promptCost(0.0)
                    .completionCostDetails(
                        ModelPriceMapModelPriceMapParams.CompletionCostDetails.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .addMatchPath("string")
                    .promptCostDetails(
                        ModelPriceMapModelPriceMapParams.PromptCostDetails.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .provider("provider")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveModelPriceMap() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val modelPriceMapService = client.modelPriceMap()

        val response = modelPriceMapService.retrieveModelPriceMap()

        response.validate()
    }
}
