// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos.tags

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagDeleteParamsTest {

    @Test
    fun create() {
        TagDeleteParams.builder().owner("owner").repo("repo").tagName("tag_name").build()
    }

    @Test
    fun pathParams() {
        val params =
            TagDeleteParams.builder().owner("owner").repo("repo").tagName("tag_name").build()

        assertThat(params._pathParam(0)).isEqualTo("owner")
        assertThat(params._pathParam(1)).isEqualTo("repo")
        assertThat(params._pathParam(2)).isEqualTo("tag_name")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
