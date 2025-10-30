// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.modelpricemap

import com.langsmith_api.api.core.JsonValue
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelPriceMapUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            ModelPriceMapUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .completionCost(0.0)
                .matchPattern("match_pattern")
                .name("name")
                .promptCost(0.0)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.completionCost())
            .isEqualTo(ModelPriceMapUpdateParams.CompletionCost.ofNumber(0.0))
        assertThat(body.matchPattern()).isEqualTo("match_pattern")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.promptCost()).isEqualTo(ModelPriceMapUpdateParams.PromptCost.ofNumber(0.0))
        assertThat(body.completionCostDetails())
            .contains(
                ModelPriceMapUpdateParams.CompletionCostDetails.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(body.matchPath().getOrNull()).containsExactly("string")
        assertThat(body.promptCostDetails())
            .contains(
                ModelPriceMapUpdateParams.PromptCostDetails.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(body.provider()).contains("provider")
        assertThat(body.startTime()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ModelPriceMapUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .completionCost(0.0)
                .matchPattern("match_pattern")
                .name("name")
                .promptCost(0.0)
                .build()

        val body = params._body()

        assertThat(body.completionCost())
            .isEqualTo(ModelPriceMapUpdateParams.CompletionCost.ofNumber(0.0))
        assertThat(body.matchPattern()).isEqualTo("match_pattern")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.promptCost()).isEqualTo(ModelPriceMapUpdateParams.PromptCost.ofNumber(0.0))
    }
}
