// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.items

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemSetFinalParamsTest {

    @Test
    fun create() {
        ItemSetFinalParams.builder()
            .queueId("queue_id")
            .itemId("item_id")
            .key("key")
            .score(0.0)
            .value("value")
            .addValue("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ItemSetFinalParams.builder().queueId("queue_id").itemId("item_id").key("key").build()

        assertThat(params._pathParam(0)).isEqualTo("queue_id")
        assertThat(params._pathParam(1)).isEqualTo("item_id")
        assertThat(params._pathParam(2)).isEqualTo("key")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ItemSetFinalParams.builder()
                .queueId("queue_id")
                .itemId("item_id")
                .key("key")
                .score(0.0)
                .value("value")
                .addValue("string")
                .build()

        val body = params._body()

        assertThat(body.score()).contains(0.0)
        assertThat(body.value()).contains("value")
        assertThat(body.values().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ItemSetFinalParams.builder().queueId("queue_id").itemId("item_id").key("key").build()

        val body = params._body()
    }
}
