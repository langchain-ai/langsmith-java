// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.items

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemDeleteAllParamsTest {

    @Test
    fun create() {
        ItemDeleteAllParams.builder().queueId("queue_id").addItemId("string").build()
    }

    @Test
    fun pathParams() {
        val params = ItemDeleteAllParams.builder().queueId("queue_id").build()

        assertThat(params._pathParam(0)).isEqualTo("queue_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = ItemDeleteAllParams.builder().queueId("queue_id").addItemId("string").build()

        val body = params._body()

        assertThat(body.itemIds().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ItemDeleteAllParams.builder().queueId("queue_id").build()

        val body = params._body()
    }
}
