// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.repos

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import com.langsmith_api.api.models.api.v1.commits.CommitManifestResponse
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RepoListResponseTest {

    @Test
    fun create() {
        val repoListResponse =
            RepoListResponse.builder()
                .addRepo(
                    RepoWithLookups.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .fullName("full_name")
                        .isArchived(true)
                        .isPublic(true)
                        .numCommits(0L)
                        .numDownloads(0L)
                        .numLikes(0L)
                        .numViews(0L)
                        .owner("owner")
                        .repoHandle("repo_handle")
                        .addTag("string")
                        .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .lastCommitHash("last_commit_hash")
                        .latestCommitManifest(
                            CommitManifestResponse.builder()
                                .commitHash("commit_hash")
                                .manifest(JsonValue.from(mapOf<String, Any>()))
                                .addExample(
                                    CommitManifestResponse.Example.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .inputs(JsonValue.from(mapOf<String, Any>()))
                                        .outputs(JsonValue.from(mapOf<String, Any>()))
                                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                                .build()
                        )
                        .likedByAuthUser(true)
                        .originalRepoFullName("original_repo_full_name")
                        .originalRepoId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .readme("readme")
                        .upstreamRepoFullName("upstream_repo_full_name")
                        .upstreamRepoId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .total(0L)
                .build()

        assertThat(repoListResponse.repos())
            .containsExactly(
                RepoWithLookups.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .fullName("full_name")
                    .isArchived(true)
                    .isPublic(true)
                    .numCommits(0L)
                    .numDownloads(0L)
                    .numLikes(0L)
                    .numViews(0L)
                    .owner("owner")
                    .repoHandle("repo_handle")
                    .addTag("string")
                    .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .lastCommitHash("last_commit_hash")
                    .latestCommitManifest(
                        CommitManifestResponse.builder()
                            .commitHash("commit_hash")
                            .manifest(JsonValue.from(mapOf<String, Any>()))
                            .addExample(
                                CommitManifestResponse.Example.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .inputs(JsonValue.from(mapOf<String, Any>()))
                                    .outputs(JsonValue.from(mapOf<String, Any>()))
                                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .build()
                    )
                    .likedByAuthUser(true)
                    .originalRepoFullName("original_repo_full_name")
                    .originalRepoId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .readme("readme")
                    .upstreamRepoFullName("upstream_repo_full_name")
                    .upstreamRepoId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(repoListResponse.total()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val repoListResponse =
            RepoListResponse.builder()
                .addRepo(
                    RepoWithLookups.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .fullName("full_name")
                        .isArchived(true)
                        .isPublic(true)
                        .numCommits(0L)
                        .numDownloads(0L)
                        .numLikes(0L)
                        .numViews(0L)
                        .owner("owner")
                        .repoHandle("repo_handle")
                        .addTag("string")
                        .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .lastCommitHash("last_commit_hash")
                        .latestCommitManifest(
                            CommitManifestResponse.builder()
                                .commitHash("commit_hash")
                                .manifest(JsonValue.from(mapOf<String, Any>()))
                                .addExample(
                                    CommitManifestResponse.Example.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .inputs(JsonValue.from(mapOf<String, Any>()))
                                        .outputs(JsonValue.from(mapOf<String, Any>()))
                                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                                .build()
                        )
                        .likedByAuthUser(true)
                        .originalRepoFullName("original_repo_full_name")
                        .originalRepoId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .readme("readme")
                        .upstreamRepoFullName("upstream_repo_full_name")
                        .upstreamRepoId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .total(0L)
                .build()

        val roundtrippedRepoListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(repoListResponse),
                jacksonTypeRef<RepoListResponse>(),
            )

        assertThat(roundtrippedRepoListResponse).isEqualTo(repoListResponse)
    }
}
