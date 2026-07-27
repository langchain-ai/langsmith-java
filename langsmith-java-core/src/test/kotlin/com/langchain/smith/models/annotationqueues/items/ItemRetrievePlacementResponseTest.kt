// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.items

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemRetrievePlacementResponseTest {

    @Test
    fun create() {
        val itemRetrievePlacementResponse =
            ItemRetrievePlacementResponse.builder()
                .cursor("cursor")
                .itemType(ItemRetrievePlacementResponse.ItemType.RUN)
                .position(0L)
                .section(ItemRetrievePlacementResponse.Section.NEEDS_MY_REVIEW)
                .build()

        assertThat(itemRetrievePlacementResponse.cursor()).contains("cursor")
        assertThat(itemRetrievePlacementResponse.itemType())
            .contains(ItemRetrievePlacementResponse.ItemType.RUN)
        assertThat(itemRetrievePlacementResponse.position()).contains(0L)
        assertThat(itemRetrievePlacementResponse.section())
            .contains(ItemRetrievePlacementResponse.Section.NEEDS_MY_REVIEW)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val itemRetrievePlacementResponse =
            ItemRetrievePlacementResponse.builder()
                .cursor("cursor")
                .itemType(ItemRetrievePlacementResponse.ItemType.RUN)
                .position(0L)
                .section(ItemRetrievePlacementResponse.Section.NEEDS_MY_REVIEW)
                .build()

        val roundtrippedItemRetrievePlacementResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(itemRetrievePlacementResponse),
                jacksonTypeRef<ItemRetrievePlacementResponse>(),
            )

        assertThat(roundtrippedItemRetrievePlacementResponse)
            .isEqualTo(itemRetrievePlacementResponse)
    }
}
