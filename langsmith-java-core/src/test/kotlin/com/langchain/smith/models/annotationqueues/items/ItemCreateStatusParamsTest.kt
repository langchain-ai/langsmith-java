// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.items

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemCreateStatusParamsTest {

    @Test
    fun create() {
        ItemCreateStatusParams.builder()
            .queueItemId("queue_item_id")
            .overrideAddedAt("override_added_at")
            .status(ItemCreateStatusParams.Status.VIEWED)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ItemCreateStatusParams.builder().queueItemId("queue_item_id").build()

        assertThat(params._pathParam(0)).isEqualTo("queue_item_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ItemCreateStatusParams.builder()
                .queueItemId("queue_item_id")
                .overrideAddedAt("override_added_at")
                .status(ItemCreateStatusParams.Status.VIEWED)
                .build()

        val body = params._body()

        assertThat(body.overrideAddedAt()).contains("override_added_at")
        assertThat(body.status()).contains(ItemCreateStatusParams.Status.VIEWED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ItemCreateStatusParams.builder().queueItemId("queue_item_id").build()

        val body = params._body()
    }
}
