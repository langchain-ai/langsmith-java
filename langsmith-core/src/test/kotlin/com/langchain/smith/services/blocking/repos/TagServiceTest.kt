// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.repos

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.repos.tags.TagCreateParams
import com.langchain.smith.models.repos.tags.TagDeleteParams
import com.langchain.smith.models.repos.tags.TagListParams
import com.langchain.smith.models.repos.tags.TagRetrieveAllParams
import com.langchain.smith.models.repos.tags.TagRetrieveParams
import com.langchain.smith.models.repos.tags.TagUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TagServiceTest {

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
        val tagService = client.repos().tags()

        val repoTag =
            tagService.create(
                TagCreateParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .commitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tagName("tag_name")
                    .skipWebhooks(true)
                    .build()
            )

        repoTag.validate()
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
        val tagService = client.repos().tags()

        val repoTag =
            tagService.retrieve(
                TagRetrieveParams.builder().owner("owner").repo("repo").tagName("tag_name").build()
            )

        repoTag.validate()
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
        val tagService = client.repos().tags()

        val repoTag =
            tagService.update(
                TagUpdateParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .tagName("tag_name")
                    .commitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .skipWebhooks(true)
                    .build()
            )

        repoTag.validate()
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
        val tagService = client.repos().tags()

        val tags =
            tagService.list(
                TagListParams.builder()
                    .hasCommits(true)
                    .isArchived(TagListParams.IsArchived.TRUE)
                    .isPublic(TagListParams.IsPublic.TRUE)
                    .limit(1L)
                    .offset(0L)
                    .query("query")
                    .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addTag("string")
                    .tenantHandle("tenant_handle")
                    .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .upstreamRepoHandle("upstream_repo_handle")
                    .upstreamRepoOwner("upstream_repo_owner")
                    .build()
            )

        tags.validate()
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
        val tagService = client.repos().tags()

        val tag =
            tagService.delete(
                TagDeleteParams.builder().owner("owner").repo("repo").tagName("tag_name").build()
            )

        tag.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveAll() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagService = client.repos().tags()

        val repoTags =
            tagService.retrieveAll(
                TagRetrieveAllParams.builder().owner("owner").repo("repo").build()
            )

        repoTags.forEach { it.validate() }
    }
}
