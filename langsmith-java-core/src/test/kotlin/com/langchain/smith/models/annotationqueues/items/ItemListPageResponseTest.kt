// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.items

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemListPageResponseTest {

    @Test
    fun create() {
        val itemListPageResponse =
            ItemListPageResponse.builder()
                .addItem(
                    ItemListResponse.builder()
                        .id("id")
                        .addedAt("added_at")
                        .agreementState(ItemListResponse.AgreementState.AGREED)
                        .addAssignedTo("string")
                        .addCompletedBy("string")
                        .effectiveAddedAt("effective_added_at")
                        .hasUnresolvedKeys(true)
                        .itemType(ItemListResponse.ItemType.RUN)
                        .keyAgreements(
                            ItemListResponse.KeyAgreements.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "answer" to
                                                mapOf(
                                                    "score" to 0,
                                                    "scores" to listOf(0),
                                                    "value" to "value",
                                                    "values" to listOf("string"),
                                                ),
                                            "has_final" to true,
                                            "state" to "agreed",
                                        )
                                    ),
                                )
                                .build()
                        )
                        .lastReviewedTime("last_reviewed_time")
                        .projectId("project_id")
                        .queueId("queue_id")
                        .addReservedBy("string")
                        .runId("run_id")
                        .sourceProposedExampleId("source_proposed_example_id")
                        .startTime("start_time")
                        .threadId("thread_id")
                        .build()
                )
                .nextCursor("next_cursor")
                .previousCursor("previous_cursor")
                .build()

        assertThat(itemListPageResponse.items().getOrNull())
            .containsExactly(
                ItemListResponse.builder()
                    .id("id")
                    .addedAt("added_at")
                    .agreementState(ItemListResponse.AgreementState.AGREED)
                    .addAssignedTo("string")
                    .addCompletedBy("string")
                    .effectiveAddedAt("effective_added_at")
                    .hasUnresolvedKeys(true)
                    .itemType(ItemListResponse.ItemType.RUN)
                    .keyAgreements(
                        ItemListResponse.KeyAgreements.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf(
                                        "answer" to
                                            mapOf(
                                                "score" to 0,
                                                "scores" to listOf(0),
                                                "value" to "value",
                                                "values" to listOf("string"),
                                            ),
                                        "has_final" to true,
                                        "state" to "agreed",
                                    )
                                ),
                            )
                            .build()
                    )
                    .lastReviewedTime("last_reviewed_time")
                    .projectId("project_id")
                    .queueId("queue_id")
                    .addReservedBy("string")
                    .runId("run_id")
                    .sourceProposedExampleId("source_proposed_example_id")
                    .startTime("start_time")
                    .threadId("thread_id")
                    .build()
            )
        assertThat(itemListPageResponse.nextCursor()).contains("next_cursor")
        assertThat(itemListPageResponse.previousCursor()).contains("previous_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val itemListPageResponse =
            ItemListPageResponse.builder()
                .addItem(
                    ItemListResponse.builder()
                        .id("id")
                        .addedAt("added_at")
                        .agreementState(ItemListResponse.AgreementState.AGREED)
                        .addAssignedTo("string")
                        .addCompletedBy("string")
                        .effectiveAddedAt("effective_added_at")
                        .hasUnresolvedKeys(true)
                        .itemType(ItemListResponse.ItemType.RUN)
                        .keyAgreements(
                            ItemListResponse.KeyAgreements.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "answer" to
                                                mapOf(
                                                    "score" to 0,
                                                    "scores" to listOf(0),
                                                    "value" to "value",
                                                    "values" to listOf("string"),
                                                ),
                                            "has_final" to true,
                                            "state" to "agreed",
                                        )
                                    ),
                                )
                                .build()
                        )
                        .lastReviewedTime("last_reviewed_time")
                        .projectId("project_id")
                        .queueId("queue_id")
                        .addReservedBy("string")
                        .runId("run_id")
                        .sourceProposedExampleId("source_proposed_example_id")
                        .startTime("start_time")
                        .threadId("thread_id")
                        .build()
                )
                .nextCursor("next_cursor")
                .previousCursor("previous_cursor")
                .build()

        val roundtrippedItemListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(itemListPageResponse),
                jacksonTypeRef<ItemListPageResponse>(),
            )

        assertThat(roundtrippedItemListPageResponse).isEqualTo(itemListPageResponse)
    }
}
