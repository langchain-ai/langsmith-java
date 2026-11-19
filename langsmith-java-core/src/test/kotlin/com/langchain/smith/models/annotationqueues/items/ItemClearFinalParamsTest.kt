// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.items

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemClearFinalParamsTest {

    @Test
    fun create() {
        ItemClearFinalParams.builder().queueId("queue_id").itemId("item_id").key("key").build()
    }

    @Test
    fun pathParams() {
        val params =
            ItemClearFinalParams.builder().queueId("queue_id").itemId("item_id").key("key").build()

        assertThat(params._pathParam(0)).isEqualTo("queue_id")
        assertThat(params._pathParam(1)).isEqualTo("item_id")
        assertThat(params._pathParam(2)).isEqualTo("key")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
