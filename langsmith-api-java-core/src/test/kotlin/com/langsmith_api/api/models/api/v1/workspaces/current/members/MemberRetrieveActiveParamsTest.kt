// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.workspaces.current.members

import com.langsmith_api.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemberRetrieveActiveParamsTest {

    @Test
    fun create() {
        MemberRetrieveActiveParams.builder()
            .addEmail("string")
            .limit(1L)
            .addLsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .offset(0L)
            .addUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            MemberRetrieveActiveParams.builder()
                .addEmail("string")
                .limit(1L)
                .addLsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .offset(0L)
                .addUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("emails", listOf("string").joinToString(","))
                    .put("limit", "1")
                    .put(
                        "ls_user_ids",
                        listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").joinToString(","),
                    )
                    .put("offset", "0")
                    .put(
                        "user_ids",
                        listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").joinToString(","),
                    )
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MemberRetrieveActiveParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
