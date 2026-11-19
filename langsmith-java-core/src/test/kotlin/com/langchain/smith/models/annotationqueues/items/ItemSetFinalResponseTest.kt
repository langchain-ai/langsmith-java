// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.items

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemSetFinalResponseTest {

    @Test
    fun create() {
        val itemSetFinalResponse =
            ItemSetFinalResponse.builder()
                .answer(
                    ItemSetFinalResponse.Answer.builder()
                        .score(0.0)
                        .addScore(0.0)
                        .value("value")
                        .addValue("string")
                        .build()
                )
                .final_(
                    ItemSetFinalResponse.Final.builder()
                        .score(0.0)
                        .addScore(0.0)
                        .value("value")
                        .addValue("string")
                        .build()
                )
                .finalSetAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .finalSetBy("final_set_by")
                .hasFinal(true)
                .key("key")
                .state(ItemSetFinalResponse.State.AGREED)
                .build()

        assertThat(itemSetFinalResponse.answer())
            .contains(
                ItemSetFinalResponse.Answer.builder()
                    .score(0.0)
                    .addScore(0.0)
                    .value("value")
                    .addValue("string")
                    .build()
            )
        assertThat(itemSetFinalResponse.final_())
            .contains(
                ItemSetFinalResponse.Final.builder()
                    .score(0.0)
                    .addScore(0.0)
                    .value("value")
                    .addValue("string")
                    .build()
            )
        assertThat(itemSetFinalResponse.finalSetAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(itemSetFinalResponse.finalSetBy()).contains("final_set_by")
        assertThat(itemSetFinalResponse.hasFinal()).contains(true)
        assertThat(itemSetFinalResponse.key()).contains("key")
        assertThat(itemSetFinalResponse.state()).contains(ItemSetFinalResponse.State.AGREED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val itemSetFinalResponse =
            ItemSetFinalResponse.builder()
                .answer(
                    ItemSetFinalResponse.Answer.builder()
                        .score(0.0)
                        .addScore(0.0)
                        .value("value")
                        .addValue("string")
                        .build()
                )
                .final_(
                    ItemSetFinalResponse.Final.builder()
                        .score(0.0)
                        .addScore(0.0)
                        .value("value")
                        .addValue("string")
                        .build()
                )
                .finalSetAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .finalSetBy("final_set_by")
                .hasFinal(true)
                .key("key")
                .state(ItemSetFinalResponse.State.AGREED)
                .build()

        val roundtrippedItemSetFinalResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(itemSetFinalResponse),
                jacksonTypeRef<ItemSetFinalResponse>(),
            )

        assertThat(roundtrippedItemSetFinalResponse).isEqualTo(itemSetFinalResponse)
    }
}
