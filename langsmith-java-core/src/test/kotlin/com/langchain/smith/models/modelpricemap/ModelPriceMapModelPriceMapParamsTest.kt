// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.modelpricemap

import com.langchain.smith.core.JsonValue
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelPriceMapModelPriceMapParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.completionCost())
            .isEqualTo(ModelPriceMapModelPriceMapParams.CompletionCost.ofNumber(0.0))
        assertThat(body.matchPattern()).isEqualTo("match_pattern")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.promptCost())
            .isEqualTo(ModelPriceMapModelPriceMapParams.PromptCost.ofNumber(0.0))
        assertThat(body.completionCostDetails())
            .contains(
                ModelPriceMapModelPriceMapParams.CompletionCostDetails.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(body.matchPath().getOrNull()).containsExactly("string")
        assertThat(body.promptCostDetails())
            .contains(
                ModelPriceMapModelPriceMapParams.PromptCostDetails.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(body.provider()).contains("provider")
        assertThat(body.startTime()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ModelPriceMapModelPriceMapParams.builder()
                .completionCost(0.0)
                .matchPattern("match_pattern")
                .name("name")
                .promptCost(0.0)
                .build()

        val body = params._body()

        assertThat(body.completionCost())
            .isEqualTo(ModelPriceMapModelPriceMapParams.CompletionCost.ofNumber(0.0))
        assertThat(body.matchPattern()).isEqualTo("match_pattern")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.promptCost())
            .isEqualTo(ModelPriceMapModelPriceMapParams.PromptCost.ofNumber(0.0))
    }
}
