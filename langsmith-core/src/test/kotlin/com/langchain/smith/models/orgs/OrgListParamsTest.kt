// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrgListParamsTest {

    @Test
    fun create() {
        OrgListParams.builder().includeTier(true).skipCreate(true).build()
    }

    @Test
    fun queryParams() {
        val params = OrgListParams.builder().includeTier(true).skipCreate(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("include_tier", "true").put("skip_create", "true").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = OrgListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
