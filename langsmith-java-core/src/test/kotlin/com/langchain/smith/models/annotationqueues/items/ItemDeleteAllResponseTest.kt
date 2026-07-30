// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.items

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemDeleteAllResponseTest {

    @Test
    fun create() {
        val itemDeleteAllResponse =
            ItemDeleteAllResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("string"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val itemDeleteAllResponse =
            ItemDeleteAllResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("string"))
                .build()

        val roundtrippedItemDeleteAllResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(itemDeleteAllResponse),
                jacksonTypeRef<ItemDeleteAllResponse>(),
            )

        assertThat(roundtrippedItemDeleteAllResponse).isEqualTo(itemDeleteAllResponse)
    }
}
