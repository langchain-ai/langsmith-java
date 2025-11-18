// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RepoListParamsTest {

    @Test
    fun create() {
        RepoListParams.builder()
            .hasCommits(true)
            .isArchived(RepoListParams.IsArchived.TRUE)
            .isPublic(RepoListParams.IsPublic.TRUE)
            .limit(1L)
            .offset(0L)
            .query("query")
            .sortDirection(RepoListParams.SortDirection.ASC)
            .sortField(RepoListParams.SortField.NUM_LIKES)
            .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addTag("string")
            .tenantHandle("tenant_handle")
            .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .upstreamRepoHandle("upstream_repo_handle")
            .upstreamRepoOwner("upstream_repo_owner")
            .withLatestManifest(true)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RepoListParams.builder()
                .hasCommits(true)
                .isArchived(RepoListParams.IsArchived.TRUE)
                .isPublic(RepoListParams.IsPublic.TRUE)
                .limit(1L)
                .offset(0L)
                .query("query")
                .sortDirection(RepoListParams.SortDirection.ASC)
                .sortField(RepoListParams.SortField.NUM_LIKES)
                .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addTag("string")
                .tenantHandle("tenant_handle")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .upstreamRepoHandle("upstream_repo_handle")
                .upstreamRepoOwner("upstream_repo_owner")
                .withLatestManifest(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("has_commits", "true")
                    .put("is_archived", "true")
                    .put("is_public", "true")
                    .put("limit", "1")
                    .put("offset", "0")
                    .put("query", "query")
                    .put("sort_direction", "asc")
                    .put("sort_field", "num_likes")
                    .put(
                        "tag_value_id",
                        listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").joinToString(","),
                    )
                    .put("tags", listOf("string").joinToString(","))
                    .put("tenant_handle", "tenant_handle")
                    .put("tenant_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("upstream_repo_handle", "upstream_repo_handle")
                    .put("upstream_repo_owner", "upstream_repo_owner")
                    .put("with_latest_manifest", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RepoListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
