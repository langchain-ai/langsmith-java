// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.issues

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IssueListParamsTest {

    @Test
    fun create() {
        IssueListParams.builder()
            .limit(0L)
            .offset(0L)
            .sessionId("session_id")
            .sessionName("session_name")
            .severity(IssueListParams.Severity._0)
            .sortBy(IssueListParams.SortBy.CREATED_AT)
            .status(IssueListParams.Status.OPEN)
            .tag("tag")
            .updatedAt("updated_at")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            IssueListParams.builder()
                .limit(0L)
                .offset(0L)
                .sessionId("session_id")
                .sessionName("session_name")
                .severity(IssueListParams.Severity._0)
                .sortBy(IssueListParams.SortBy.CREATED_AT)
                .status(IssueListParams.Status.OPEN)
                .tag("tag")
                .updatedAt("updated_at")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("limit", "0")
                    .put("offset", "0")
                    .put("session_id", "session_id")
                    .put("session_name", "session_name")
                    .put("severity", "0")
                    .put("sort_by", "created_at")
                    .put("status", "open")
                    .put("tag", "tag")
                    .put("updated_at", "updated_at")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = IssueListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
