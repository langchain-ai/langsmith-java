// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.items

import com.langchain.smith.core.http.QueryParams
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemCreateParamsTest {

    @Test
    fun create() {
        ItemCreateParams.builder()
            .queueId("queue_id")
            .extendTraceRetention(true)
            .addItem(
                ItemCreateParams.Item.builder()
                    .itemType(ItemCreateParams.Item.ItemType.RUN)
                    .runId("run_id")
                    .sessionId("session_id")
                    .sourceProposedExampleId("source_proposed_example_id")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .threadId("thread_id")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = ItemCreateParams.builder().queueId("queue_id").build()

        assertThat(params._pathParam(0)).isEqualTo("queue_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ItemCreateParams.builder()
                .queueId("queue_id")
                .extendTraceRetention(true)
                .addItem(
                    ItemCreateParams.Item.builder()
                        .itemType(ItemCreateParams.Item.ItemType.RUN)
                        .runId("run_id")
                        .sessionId("session_id")
                        .sourceProposedExampleId("source_proposed_example_id")
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .threadId("thread_id")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("extend_trace_retention", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ItemCreateParams.builder().queueId("queue_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            ItemCreateParams.builder()
                .queueId("queue_id")
                .extendTraceRetention(true)
                .addItem(
                    ItemCreateParams.Item.builder()
                        .itemType(ItemCreateParams.Item.ItemType.RUN)
                        .runId("run_id")
                        .sessionId("session_id")
                        .sourceProposedExampleId("source_proposed_example_id")
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .threadId("thread_id")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.items().getOrNull())
            .containsExactly(
                ItemCreateParams.Item.builder()
                    .itemType(ItemCreateParams.Item.ItemType.RUN)
                    .runId("run_id")
                    .sessionId("session_id")
                    .sourceProposedExampleId("source_proposed_example_id")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .threadId("thread_id")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ItemCreateParams.builder().queueId("queue_id").build()

        val body = params._body()
    }
}
