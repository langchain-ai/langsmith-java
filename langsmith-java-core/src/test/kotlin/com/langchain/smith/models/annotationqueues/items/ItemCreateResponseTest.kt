// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.items

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemCreateResponseTest {

    @Test
    fun create() {
        val itemCreateResponse =
            ItemCreateResponse.builder()
                .addItem(
                    ItemCreateResponse.Item.builder()
                        .id("id")
                        .addedAt("added_at")
                        .itemType(ItemCreateResponse.Item.ItemType.RUN)
                        .lastReviewedTime("last_reviewed_time")
                        .projectId("project_id")
                        .queueId("queue_id")
                        .runId("run_id")
                        .sourceProposedExampleId("source_proposed_example_id")
                        .startTime("start_time")
                        .threadId("thread_id")
                        .build()
                )
                .build()

        assertThat(itemCreateResponse.items().getOrNull())
            .containsExactly(
                ItemCreateResponse.Item.builder()
                    .id("id")
                    .addedAt("added_at")
                    .itemType(ItemCreateResponse.Item.ItemType.RUN)
                    .lastReviewedTime("last_reviewed_time")
                    .projectId("project_id")
                    .queueId("queue_id")
                    .runId("run_id")
                    .sourceProposedExampleId("source_proposed_example_id")
                    .startTime("start_time")
                    .threadId("thread_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val itemCreateResponse =
            ItemCreateResponse.builder()
                .addItem(
                    ItemCreateResponse.Item.builder()
                        .id("id")
                        .addedAt("added_at")
                        .itemType(ItemCreateResponse.Item.ItemType.RUN)
                        .lastReviewedTime("last_reviewed_time")
                        .projectId("project_id")
                        .queueId("queue_id")
                        .runId("run_id")
                        .sourceProposedExampleId("source_proposed_example_id")
                        .startTime("start_time")
                        .threadId("thread_id")
                        .build()
                )
                .build()

        val roundtrippedItemCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(itemCreateResponse),
                jacksonTypeRef<ItemCreateResponse>(),
            )

        assertThat(roundtrippedItemCreateResponse).isEqualTo(itemCreateResponse)
    }
}
