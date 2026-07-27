// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.items

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemUpdateParamsTest {

    @Test
    fun create() {
        ItemUpdateParams.builder()
            .queueId("queue_id")
            .itemId("item_id")
            .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .lastReviewedTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun pathParams() {
        val params = ItemUpdateParams.builder().queueId("queue_id").itemId("item_id").build()

        assertThat(params._pathParam(0)).isEqualTo("queue_id")
        assertThat(params._pathParam(1)).isEqualTo("item_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ItemUpdateParams.builder()
                .queueId("queue_id")
                .itemId("item_id")
                .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastReviewedTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertThat(body.addedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.lastReviewedTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ItemUpdateParams.builder().queueId("queue_id").itemId("item_id").build()

        val body = params._body()
    }
}
