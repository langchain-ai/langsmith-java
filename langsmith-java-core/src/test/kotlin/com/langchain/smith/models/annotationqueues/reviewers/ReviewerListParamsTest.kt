// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.reviewers

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReviewerListParamsTest {

    @Test
    fun create() {
        ReviewerListParams.builder().queueId("queue_id").cursor("cursor").pageSize(0L).build()
    }

    @Test
    fun pathParams() {
        val params = ReviewerListParams.builder().queueId("queue_id").build()

        assertThat(params._pathParam(0)).isEqualTo("queue_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ReviewerListParams.builder().queueId("queue_id").cursor("cursor").pageSize(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("cursor", "cursor").put("page_size", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ReviewerListParams.builder().queueId("queue_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
