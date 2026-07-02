// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.issues

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IssueRetrieveParamsTest {

    @Test
    fun create() {
        IssueRetrieveParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = IssueRetrieveParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
