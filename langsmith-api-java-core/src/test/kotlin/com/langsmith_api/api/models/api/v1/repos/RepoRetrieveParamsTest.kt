// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.repos

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RepoRetrieveParamsTest {

    @Test
    fun create() {
        RepoRetrieveParams.builder().owner("owner").repo("repo").build()
    }

    @Test
    fun pathParams() {
        val params = RepoRetrieveParams.builder().owner("owner").repo("repo").build()

        assertThat(params._pathParam(0)).isEqualTo("owner")
        assertThat(params._pathParam(1)).isEqualTo("repo")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
