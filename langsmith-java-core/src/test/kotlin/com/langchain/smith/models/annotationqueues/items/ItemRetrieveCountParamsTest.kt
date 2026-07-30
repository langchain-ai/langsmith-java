// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.items

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemRetrieveCountParamsTest {

    @Test
    fun create() {
        ItemRetrieveCountParams.builder()
            .queueId("queue_id")
            .status("status")
            .endTime("end_time")
            .startTime("start_time")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ItemRetrieveCountParams.builder().queueId("queue_id").status("status").build()

        assertThat(params._pathParam(0)).isEqualTo("queue_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ItemRetrieveCountParams.builder()
                .queueId("queue_id")
                .status("status")
                .endTime("end_time")
                .startTime("start_time")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("status", "status")
                    .put("end_time", "end_time")
                    .put("start_time", "start_time")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ItemRetrieveCountParams.builder().queueId("queue_id").status("status").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("status", "status").build())
    }
}
