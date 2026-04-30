// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.repos.RepoCreateParams
import com.langchain.smith.models.repos.RepoDeleteParams
import com.langchain.smith.models.repos.RepoRetrieveParams
import com.langchain.smith.models.repos.RepoUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RepoServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val repoService = client.repos()

        val createRepoResponse =
            repoService.create(
                RepoCreateParams.builder()
                    .isPublic(true)
                    .repoHandle("repo_handle")
                    .description("description")
                    .readme("readme")
                    .repoType(RepoCreateParams.RepoType.PROMPT)
                    .restrictedMode(true)
                    .addTag("string")
                    .build()
            )

        createRepoResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val repoService = client.repos()

        val getRepoResponse =
            repoService.retrieve(RepoRetrieveParams.builder().owner("owner").repo("repo").build())

        getRepoResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
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
                    .restrictedMode(true)
                    .addTag("string")
                    .build()
            )

        createRepoResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val repoService = client.repos()

        val page = repoService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val repoService = client.repos()

        val repo =
            repoService.delete(RepoDeleteParams.builder().owner("owner").repo("repo").build())

        repo.validate()
    }
}
