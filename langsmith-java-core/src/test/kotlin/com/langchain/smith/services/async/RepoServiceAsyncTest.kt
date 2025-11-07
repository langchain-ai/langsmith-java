// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.repos.RepoCreateParams
import com.langchain.smith.models.repos.RepoDeleteParams
import com.langchain.smith.models.repos.RepoListParams
import com.langchain.smith.models.repos.RepoRetrieveParams
import com.langchain.smith.models.repos.RepoUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RepoServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val repoServiceAsync = client.repos()

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
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val repoServiceAsync = client.repos()

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
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val repoServiceAsync = client.repos()

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
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val repoServiceAsync = client.repos()

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
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val repoServiceAsync = client.repos()

        val repoFuture =
            repoServiceAsync.delete(RepoDeleteParams.builder().owner("owner").repo("repo").build())

        val repo = repoFuture.get()
        repo.validate()
    }
}
