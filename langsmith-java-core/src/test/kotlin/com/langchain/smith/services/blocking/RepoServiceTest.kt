// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.repos.RepoCreateParams
import com.langchain.smith.models.repos.RepoDeleteParams
import com.langchain.smith.models.repos.RepoRetrieveParams
import com.langchain.smith.models.repos.RepoUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RepoServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val repoService = client.repos()

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
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val repoService = client.repos()

        val getRepoResponse =
            repoService.retrieve(RepoRetrieveParams.builder().owner("owner").repo("repo").build())

        getRepoResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val repoService = client.repos()

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
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val repoService = client.repos()

        val page = repoService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val repoService = client.repos()

        val repo =
            repoService.delete(RepoDeleteParams.builder().owner("owner").repo("repo").build())

        repo.validate()
    }
}
