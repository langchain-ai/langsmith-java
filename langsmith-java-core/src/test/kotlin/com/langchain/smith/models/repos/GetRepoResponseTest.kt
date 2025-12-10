// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.models.commits.CommitManifestResponse
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GetRepoResponseTest {

    @Test
    fun create() {
        val getRepoResponse =
            GetRepoResponse.builder()
                .repo(
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
                                .manifest(
                                    CommitManifestResponse.Manifest.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .addExample(
                                    CommitManifestResponse.Example.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .inputs(
                                            CommitManifestResponse.Example.Inputs.builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .outputs(
                                            CommitManifestResponse.Example.Outputs.builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
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
                .build()

        assertThat(getRepoResponse.repo())
            .isEqualTo(
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
                            .manifest(
                                CommitManifestResponse.Manifest.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .addExample(
                                CommitManifestResponse.Example.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .inputs(
                                        CommitManifestResponse.Example.Inputs.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .outputs(
                                        CommitManifestResponse.Example.Outputs.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val getRepoResponse =
            GetRepoResponse.builder()
                .repo(
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
                                .manifest(
                                    CommitManifestResponse.Manifest.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .addExample(
                                    CommitManifestResponse.Example.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .inputs(
                                            CommitManifestResponse.Example.Inputs.builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .outputs(
                                            CommitManifestResponse.Example.Outputs.builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
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
                .build()

        val roundtrippedGetRepoResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(getRepoResponse),
                jacksonTypeRef<GetRepoResponse>(),
            )

        assertThat(roundtrippedGetRepoResponse).isEqualTo(getRepoResponse)
    }
}
