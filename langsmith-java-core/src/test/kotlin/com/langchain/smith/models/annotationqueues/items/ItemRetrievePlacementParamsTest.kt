// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.items

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemRetrievePlacementParamsTest {

    @Test
    fun create() {
        ItemRetrievePlacementParams.builder().queueId("queue_id").itemId("item_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            ItemRetrievePlacementParams.builder().queueId("queue_id").itemId("item_id").build()

        assertThat(params._pathParam(0)).isEqualTo("queue_id")
        assertThat(params._pathParam(1)).isEqualTo("item_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
