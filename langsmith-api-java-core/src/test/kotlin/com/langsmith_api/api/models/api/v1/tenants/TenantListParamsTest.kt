// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.tenants

import com.langsmith_api.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TenantListParamsTest {

    @Test
    fun create() {
        TenantListParams.builder().includeDeleted(true).skipCreate(true).build()
    }

    @Test
    fun queryParams() {
        val params = TenantListParams.builder().includeDeleted(true).skipCreate(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("include_deleted", "true")
                    .put("skip_create", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TenantListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
