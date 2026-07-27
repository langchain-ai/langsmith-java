// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.items

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemListResponseTest {

    @Test
    fun create() {
        val itemListResponse =
            ItemListResponse.builder()
                .id("id")
                .addedAt("added_at")
                .addCompletedBy("string")
                .effectiveAddedAt("effective_added_at")
                .itemType(ItemListResponse.ItemType.RUN)
                .lastReviewedTime("last_reviewed_time")
                .queueId("queue_id")
                .addReservedBy("string")
                .runId("run_id")
                .sessionId("session_id")
                .sourceProposedExampleId("source_proposed_example_id")
                .startTime("start_time")
                .threadId("thread_id")
                .build()

        assertThat(itemListResponse.id()).contains("id")
        assertThat(itemListResponse.addedAt()).contains("added_at")
        assertThat(itemListResponse.completedBy().getOrNull()).containsExactly("string")
        assertThat(itemListResponse.effectiveAddedAt()).contains("effective_added_at")
        assertThat(itemListResponse.itemType()).contains(ItemListResponse.ItemType.RUN)
        assertThat(itemListResponse.lastReviewedTime()).contains("last_reviewed_time")
        assertThat(itemListResponse.queueId()).contains("queue_id")
        assertThat(itemListResponse.reservedBy().getOrNull()).containsExactly("string")
        assertThat(itemListResponse.runId()).contains("run_id")
        assertThat(itemListResponse.sessionId()).contains("session_id")
        assertThat(itemListResponse.sourceProposedExampleId())
            .contains("source_proposed_example_id")
        assertThat(itemListResponse.startTime()).contains("start_time")
        assertThat(itemListResponse.threadId()).contains("thread_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val itemListResponse =
            ItemListResponse.builder()
                .id("id")
                .addedAt("added_at")
                .addCompletedBy("string")
                .effectiveAddedAt("effective_added_at")
                .itemType(ItemListResponse.ItemType.RUN)
                .lastReviewedTime("last_reviewed_time")
                .queueId("queue_id")
                .addReservedBy("string")
                .runId("run_id")
                .sessionId("session_id")
                .sourceProposedExampleId("source_proposed_example_id")
                .startTime("start_time")
                .threadId("thread_id")
                .build()

        val roundtrippedItemListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(itemListResponse),
                jacksonTypeRef<ItemListResponse>(),
            )

        assertThat(roundtrippedItemListResponse).isEqualTo(itemListResponse)
    }
}
