// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.models.commits.CommitManifestResponse
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RepoWithLookupsTest {

    @Test
    fun create() {
        val repoWithLookups =
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
                .createdBy("created_by")
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

        assertThat(repoWithLookups.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(repoWithLookups.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(repoWithLookups.fullName()).isEqualTo("full_name")
        assertThat(repoWithLookups.isArchived()).isEqualTo(true)
        assertThat(repoWithLookups.isPublic()).isEqualTo(true)
        assertThat(repoWithLookups.numCommits()).isEqualTo(0L)
        assertThat(repoWithLookups.numDownloads()).isEqualTo(0L)
        assertThat(repoWithLookups.numLikes()).isEqualTo(0L)
        assertThat(repoWithLookups.numViews()).isEqualTo(0L)
        assertThat(repoWithLookups.owner()).contains("owner")
        assertThat(repoWithLookups.repoHandle()).isEqualTo("repo_handle")
        assertThat(repoWithLookups.tags()).containsExactly("string")
        assertThat(repoWithLookups.tenantId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(repoWithLookups.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(repoWithLookups.createdBy()).contains("created_by")
        assertThat(repoWithLookups.description()).contains("description")
        assertThat(repoWithLookups.lastCommitHash()).contains("last_commit_hash")
        assertThat(repoWithLookups.latestCommitManifest())
            .contains(
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
        assertThat(repoWithLookups.likedByAuthUser()).contains(true)
        assertThat(repoWithLookups.originalRepoFullName()).contains("original_repo_full_name")
        assertThat(repoWithLookups.originalRepoId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(repoWithLookups.readme()).contains("readme")
        assertThat(repoWithLookups.upstreamRepoFullName()).contains("upstream_repo_full_name")
        assertThat(repoWithLookups.upstreamRepoId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val repoWithLookups =
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
                .createdBy("created_by")
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

        val roundtrippedRepoWithLookups =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(repoWithLookups),
                jacksonTypeRef<RepoWithLookups>(),
            )

        assertThat(roundtrippedRepoWithLookups).isEqualTo(repoWithLookups)
    }
}
