// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.repos.RepoCreateParams
import com.langchain.smith.models.repos.RepoDeleteParams
import com.langchain.smith.models.repos.RepoRetrieveParams
import com.langchain.smith.models.repos.RepoUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RepoServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val repoServiceAsync = client.repos()

        val createRepoResponseFuture =
            repoServiceAsync.create(
                RepoCreateParams.builder()
                    .isPublic(true)
                    .repoHandle("repo_handle")
                    .description("description")
                    .readme("readme")
                    .repoType(RepoCreateParams.RepoType.PROMPT)
                    .restrictedMode(true)
                    .source(RepoCreateParams.Source.INTERNAL)
                    .addTag("string")
                    .build()
            )

        val createRepoResponse = createRepoResponseFuture.get()
        createRepoResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val repoServiceAsync = client.repos()

        val getRepoResponseFuture =
            repoServiceAsync.retrieve(
                RepoRetrieveParams.builder().owner("owner").repo("repo").build()
            )

        val getRepoResponse = getRepoResponseFuture.get()
        getRepoResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
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
                    .restrictedMode(true)
                    .addTag("string")
                    .build()
            )

        val createRepoResponse = createRepoResponseFuture.get()
        createRepoResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val repoServiceAsync = client.repos()

        val pageFuture = repoServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val repoServiceAsync = client.repos()

        val repoFuture =
            repoServiceAsync.delete(RepoDeleteParams.builder().owner("owner").repo("repo").build())

        val repo = repoFuture.get()
        repo.validate()
    }
}
