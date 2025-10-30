// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.repos.tags

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagCreateParamsTest {

    @Test
    fun create() {
        TagCreateParams.builder()
            .owner("owner")
            .repo("repo")
            .commitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .tagName("tag_name")
            .skipWebhooks(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TagCreateParams.builder()
                .owner("owner")
                .repo("repo")
                .commitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tagName("tag_name")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("owner")
        assertThat(params._pathParam(1)).isEqualTo("repo")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TagCreateParams.builder()
                .owner("owner")
                .repo("repo")
                .commitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tagName("tag_name")
                .skipWebhooks(true)
                .build()

        val body = params._body()

        assertThat(body.commitId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.tagName()).isEqualTo("tag_name")
        assertThat(body.skipWebhooks()).contains(TagCreateParams.SkipWebhooks.ofBool(true))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TagCreateParams.builder()
                .owner("owner")
                .repo("repo")
                .commitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tagName("tag_name")
                .build()

        val body = params._body()

        assertThat(body.commitId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.tagName()).isEqualTo("tag_name")
    }
}
