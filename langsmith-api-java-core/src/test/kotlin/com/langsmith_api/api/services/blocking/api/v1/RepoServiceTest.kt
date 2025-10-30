// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
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
internal class RepoServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val repoService = client.api().v1().repos()

        val createRepoResponse =
            repoService.create(
                RepoCreateParams.builder()
                    .isPublic(true)
                    .repoHandle("repo_handle")
                    .description("description")
                    .readme("readme")
                    .addTag("string")
                    .build()
            )

        createRepoResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val repoService = client.api().v1().repos()

        val getRepoResponse =
            repoService.retrieve(RepoRetrieveParams.builder().owner("owner").repo("repo").build())

        getRepoResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val repoService = client.api().v1().repos()

        val createRepoResponse =
            repoService.update(
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

        createRepoResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val repoService = client.api().v1().repos()

        val repos =
            repoService.list(
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

        repos.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val repoService = client.api().v1().repos()

        val repo =
            repoService.delete(RepoDeleteParams.builder().owner("owner").repo("repo").build())

        repo.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun fork() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val repoService = client.api().v1().repos()

        val getRepoResponse =
            repoService.fork(
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

        getRepoResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun optimizeJob() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val repoService = client.api().v1().repos()

        val response =
            repoService.optimizeJob(
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

        response.validate()
    }
}
