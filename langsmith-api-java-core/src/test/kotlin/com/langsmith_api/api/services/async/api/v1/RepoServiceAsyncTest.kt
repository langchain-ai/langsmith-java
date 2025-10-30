// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.models.api.v1.repos.EPromptOptimizationAlgorithm
import com.langsmith_api.api.models.api.v1.repos.PromptimConfig
import com.langsmith_api.api.models.api.v1.repos.RepoCreateParams
import com.langsmith_api.api.models.api.v1.repos.RepoDeleteParams
import com.langsmith_api.api.models.api.v1.repos.RepoForkParams
import com.langsmith_api.api.models.api.v1.repos.RepoListParams
import com.langsmith_api.api.models.api.v1.repos.RepoOptimizeJobParams
import com.langsmith_api.api.models.api.v1.repos.RepoRetrieveParams
import com.langsmith_api.api.models.api.v1.repos.RepoUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RepoServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val repoServiceAsync = client.api().v1().repos()

        val createRepoResponseFuture =
            repoServiceAsync.create(
                RepoCreateParams.builder()
                    .isPublic(true)
                    .repoHandle("repo_handle")
                    .description("description")
                    .readme("readme")
                    .addTag("string")
                    .build()
            )

        val createRepoResponse = createRepoResponseFuture.get()
        createRepoResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val repoServiceAsync = client.api().v1().repos()

        val getRepoResponseFuture =
            repoServiceAsync.retrieve(
                RepoRetrieveParams.builder().owner("owner").repo("repo").build()
            )

        val getRepoResponse = getRepoResponseFuture.get()
        getRepoResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val repoServiceAsync = client.api().v1().repos()

        val createRepoResponseFuture =
            repoServiceAsync.update(
                RepoUpdateParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .description("description")
                    .isArchived(true)
                    .isPublic(true)
                    .readme("readme")
                    .addTag("string")
                    .build()
            )

        val createRepoResponse = createRepoResponseFuture.get()
        createRepoResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val repoServiceAsync = client.api().v1().repos()

        val reposFuture =
            repoServiceAsync.list(
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
            )

        val repos = reposFuture.get()
        repos.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val repoServiceAsync = client.api().v1().repos()

        val repoFuture =
            repoServiceAsync.delete(RepoDeleteParams.builder().owner("owner").repo("repo").build())

        val repo = repoFuture.get()
        repo.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun fork() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val repoServiceAsync = client.api().v1().repos()

        val getRepoResponseFuture =
            repoServiceAsync.fork(
                RepoForkParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .repoHandle("repo_handle")
                    .description("description")
                    .isPublic(true)
                    .readme("readme")
                    .addTag("string")
                    .build()
            )

        val getRepoResponse = getRepoResponseFuture.get()
        getRepoResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun optimizeJob() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val repoServiceAsync = client.api().v1().repos()

        val responseFuture =
            repoServiceAsync.optimizeJob(
                RepoOptimizeJobParams.builder()
                    .algorithm(EPromptOptimizationAlgorithm.PROMPTIM)
                    .config(
                        PromptimConfig.builder()
                            .autoCommit(true)
                            .datasetName("dataset_name")
                            .devSplit("dev_split")
                            .addEvaluator("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .messageIndex(0L)
                            .numEpochs(0L)
                            .taskDescription("task_description")
                            .testSplit("test_split")
                            .trainSplit("train_split")
                            .build()
                    )
                    .promptName("prompt_name")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
