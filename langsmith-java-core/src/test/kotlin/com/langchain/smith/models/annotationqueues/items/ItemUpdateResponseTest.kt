// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.items

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemUpdateResponseTest {

    @Test
    fun create() {
        val itemUpdateResponse =
            ItemUpdateResponse.builder()
                .id("id")
                .addedAt("added_at")
                .itemType(ItemUpdateResponse.ItemType.RUN)
                .lastReviewedTime("last_reviewed_time")
                .queueId("queue_id")
                .runId("run_id")
                .sessionId("session_id")
                .sourceProposedExampleId("source_proposed_example_id")
                .startTime("start_time")
                .threadId("thread_id")
                .build()

        assertThat(itemUpdateResponse.id()).contains("id")
        assertThat(itemUpdateResponse.addedAt()).contains("added_at")
        assertThat(itemUpdateResponse.itemType()).contains(ItemUpdateResponse.ItemType.RUN)
        assertThat(itemUpdateResponse.lastReviewedTime()).contains("last_reviewed_time")
        assertThat(itemUpdateResponse.queueId()).contains("queue_id")
        assertThat(itemUpdateResponse.runId()).contains("run_id")
        assertThat(itemUpdateResponse.sessionId()).contains("session_id")
        assertThat(itemUpdateResponse.sourceProposedExampleId())
            .contains("source_proposed_example_id")
        assertThat(itemUpdateResponse.startTime()).contains("start_time")
        assertThat(itemUpdateResponse.threadId()).contains("thread_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val itemUpdateResponse =
            ItemUpdateResponse.builder()
                .id("id")
                .addedAt("added_at")
                .itemType(ItemUpdateResponse.ItemType.RUN)
                .lastReviewedTime("last_reviewed_time")
                .queueId("queue_id")
                .runId("run_id")
                .sessionId("session_id")
                .sourceProposedExampleId("source_proposed_example_id")
                .startTime("start_time")
                .threadId("thread_id")
                .build()

        val roundtrippedItemUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(itemUpdateResponse),
                jacksonTypeRef<ItemUpdateResponse>(),
            )

        assertThat(roundtrippedItemUpdateResponse).isEqualTo(itemUpdateResponse)
    }
}
