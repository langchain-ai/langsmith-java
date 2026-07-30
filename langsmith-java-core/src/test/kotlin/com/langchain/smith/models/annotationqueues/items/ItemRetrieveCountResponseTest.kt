// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.items

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemRetrieveCountResponseTest {

    @Test
    fun create() {
        val itemRetrieveCountResponse = ItemRetrieveCountResponse.builder().count(0L).build()

        assertThat(itemRetrieveCountResponse.count()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val itemRetrieveCountResponse = ItemRetrieveCountResponse.builder().count(0L).build()

        val roundtrippedItemRetrieveCountResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(itemRetrieveCountResponse),
                jacksonTypeRef<ItemRetrieveCountResponse>(),
            )

        assertThat(roundtrippedItemRetrieveCountResponse).isEqualTo(itemRetrieveCountResponse)
    }
}
