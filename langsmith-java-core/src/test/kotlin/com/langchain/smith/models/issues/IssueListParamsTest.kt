// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.issues

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IssueListParamsTest {

    @Test
    fun create() {
        IssueListParams.builder()
            .addActivity(IssueListParams.Activity.FIXING)
            .limit(0L)
            .offset(0L)
            .sessionId("session_id")
            .sessionName("session_name")
            .severity(IssueListParams.Severity._0)
            .addSeverityExact(IssueListParams.SeverityExact._0)
            .sortBy(IssueListParams.SortBy.DEFAULT)
            .status(IssueListParams.Status.OPEN)
            .statusFirst(true)
            .tag("tag")
            .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .updatedAt("updated_at")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            IssueListParams.builder()
                .addActivity(IssueListParams.Activity.FIXING)
                .limit(0L)
                .offset(0L)
                .sessionId("session_id")
                .sessionName("session_name")
                .severity(IssueListParams.Severity._0)
                .addSeverityExact(IssueListParams.SeverityExact._0)
                .sortBy(IssueListParams.SortBy.DEFAULT)
                .status(IssueListParams.Status.OPEN)
                .statusFirst(true)
                .tag("tag")
                .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt("updated_at")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("activity", "fixing")
                    .put("limit", "0")
                    .put("offset", "0")
                    .put("session_id", "session_id")
                    .put("session_name", "session_name")
                    .put("severity", "0")
                    .put("severity_exact", "0")
                    .put("sort_by", "default")
                    .put("status", "open")
                    .put("status_first", "true")
                    .put("tag", "tag")
                    .put("trace_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
