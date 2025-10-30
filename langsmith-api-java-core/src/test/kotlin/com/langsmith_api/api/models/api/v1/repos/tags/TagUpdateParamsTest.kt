// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.repos.tags

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagUpdateParamsTest {

    @Test
    fun create() {
        TagUpdateParams.builder()
            .owner("owner")
            .repo("repo")
            .tagName("tag_name")
            .commitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .skipWebhooks(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TagUpdateParams.builder()
                .owner("owner")
                .repo("repo")
                .tagName("tag_name")
                .commitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("owner")
        assertThat(params._pathParam(1)).isEqualTo("repo")
        assertThat(params._pathParam(2)).isEqualTo("tag_name")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TagUpdateParams.builder()
                .owner("owner")
                .repo("repo")
                .tagName("tag_name")
                .commitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .skipWebhooks(true)
                .build()

        val body = params._body()

        assertThat(body.commitId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.skipWebhooks()).contains(TagUpdateParams.SkipWebhooks.ofBool(true))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TagUpdateParams.builder()
                .owner("owner")
                .repo("repo")
                .tagName("tag_name")
                .commitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.commitId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
