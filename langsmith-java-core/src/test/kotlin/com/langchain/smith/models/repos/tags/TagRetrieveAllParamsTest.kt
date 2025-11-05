// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos.tags

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagRetrieveAllParamsTest {

    @Test
    fun create() {
        TagRetrieveAllParams.builder().owner("owner").repo("repo").build()
    }

    @Test
    fun pathParams() {
        val params = TagRetrieveAllParams.builder().owner("owner").repo("repo").build()

        assertThat(params._pathParam(0)).isEqualTo("owner")
        assertThat(params._pathParam(1)).isEqualTo("repo")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
