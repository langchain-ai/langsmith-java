// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.issues

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IssueRetrieveParamsTest {

    @Test
    fun create() {
        IssueRetrieveParams.builder().id("id").includeLinearContext(true).build()
    }

    @Test
    fun pathParams() {
        val params = IssueRetrieveParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = IssueRetrieveParams.builder().id("id").includeLinearContext(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("include_linear_context", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = IssueRetrieveParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
