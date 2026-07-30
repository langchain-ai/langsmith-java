// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.items

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemCreateStatusResponseTest {

    @Test
    fun create() {
        val itemCreateStatusResponse =
            ItemCreateStatusResponse.builder()
                .isArchived(true)
                .overrideAddedAt("override_added_at")
                .queueItemId("queue_item_id")
                .status(ItemCreateStatusResponse.Status.VIEWED)
                .build()

        assertThat(itemCreateStatusResponse.isArchived()).contains(true)
        assertThat(itemCreateStatusResponse.overrideAddedAt()).contains("override_added_at")
        assertThat(itemCreateStatusResponse.queueItemId()).contains("queue_item_id")
        assertThat(itemCreateStatusResponse.status())
            .contains(ItemCreateStatusResponse.Status.VIEWED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val itemCreateStatusResponse =
            ItemCreateStatusResponse.builder()
                .isArchived(true)
                .overrideAddedAt("override_added_at")
                .queueItemId("queue_item_id")
                .status(ItemCreateStatusResponse.Status.VIEWED)
                .build()

        val roundtrippedItemCreateStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(itemCreateStatusResponse),
                jacksonTypeRef<ItemCreateStatusResponse>(),
            )

        assertThat(roundtrippedItemCreateStatusResponse).isEqualTo(itemCreateStatusResponse)
    }
}
