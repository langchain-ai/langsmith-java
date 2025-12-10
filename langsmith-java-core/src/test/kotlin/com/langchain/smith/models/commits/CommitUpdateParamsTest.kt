// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.commits

import com.langchain.smith.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommitUpdateParamsTest {

    @Test
    fun create() {
        CommitUpdateParams.builder()
            .owner("owner")
            .repo("repo")
            .manifest(
                CommitUpdateParams.Manifest.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addExampleRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .parentCommit("parent_commit")
            .skipWebhooks(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CommitUpdateParams.builder()
                .owner("owner")
                .repo("repo")
                .manifest(
                    CommitUpdateParams.Manifest.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("owner")
        assertThat(params._pathParam(1)).isEqualTo("repo")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CommitUpdateParams.builder()
                .owner("owner")
                .repo("repo")
                .manifest(
                    CommitUpdateParams.Manifest.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addExampleRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .parentCommit("parent_commit")
                .skipWebhooks(true)
                .build()

        val body = params._body()

        assertThat(body.manifest())
            .isEqualTo(
                CommitUpdateParams.Manifest.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.exampleRunIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.parentCommit()).contains("parent_commit")
        assertThat(body.skipWebhooks()).contains(CommitUpdateParams.SkipWebhooks.ofBool(true))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CommitUpdateParams.builder()
                .owner("owner")
                .repo("repo")
                .manifest(
                    CommitUpdateParams.Manifest.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.manifest())
            .isEqualTo(
                CommitUpdateParams.Manifest.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }
}
