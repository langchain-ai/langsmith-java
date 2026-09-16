// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.items

import com.langchain.smith.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemListParamsTest {

    @Test
    fun create() {
        ItemListParams.builder()
            .queueId("queue_id")
            .status(ItemListParams.Status.NEEDS_MY_REVIEW)
            .cursor("cursor")
            .direction(ItemListParams.Direction.FORWARD)
            .itemType(ItemListParams.ItemType.RUN)
            .maxStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .minStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .pageSize(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ItemListParams.builder()
                .queueId("queue_id")
                .status(ItemListParams.Status.NEEDS_MY_REVIEW)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("queue_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ItemListParams.builder()
                .queueId("queue_id")
                .status(ItemListParams.Status.NEEDS_MY_REVIEW)
                .cursor("cursor")
                .direction(ItemListParams.Direction.FORWARD)
                .itemType(ItemListParams.ItemType.RUN)
                .maxStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .minStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("status", "needs_my_review")
                    .put("cursor", "cursor")
                    .put("direction", "forward")
                    .put("item_type", "RUN")
                    .put("max_start_time", "2019-12-27T18:11:19.117Z")
                    .put("min_start_time", "2019-12-27T18:11:19.117Z")
                    .put("page_size", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ItemListParams.builder()
                .queueId("queue_id")
                .status(ItemListParams.Status.NEEDS_MY_REVIEW)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("status", "needs_my_review").build())
    }
}
