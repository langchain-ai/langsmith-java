// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.repos

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
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
internal class TagServiceAsyncTest {

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
        val tagServiceAsync = client.repos().tags()

        val repoTagFuture =
            tagServiceAsync.create(
                TagCreateParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .commitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tagName("tag_name")
                    .skipWebhooks(true)
                    .build()
            )

        val repoTag = repoTagFuture.get()
        repoTag.validate()
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
        val tagServiceAsync = client.repos().tags()

        val repoTagFuture =
            tagServiceAsync.retrieve(
                TagRetrieveParams.builder().owner("owner").repo("repo").tagName("tag_name").build()
            )

        val repoTag = repoTagFuture.get()
        repoTag.validate()
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
        val tagServiceAsync = client.repos().tags()

        val repoTagFuture =
            tagServiceAsync.update(
                TagUpdateParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .tagName("tag_name")
                    .commitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .skipWebhooks(true)
                    .build()
            )

        val repoTag = repoTagFuture.get()
        repoTag.validate()
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
        val tagServiceAsync = client.repos().tags()

        val tagsFuture =
            tagServiceAsync.list(
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

        val tags = tagsFuture.get()
        tags.validate()
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
        val tagServiceAsync = client.repos().tags()

        val tagFuture =
            tagServiceAsync.delete(
                TagDeleteParams.builder().owner("owner").repo("repo").tagName("tag_name").build()
            )

        val tag = tagFuture.get()
        tag.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveAll() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagServiceAsync = client.repos().tags()

        val repoTagsFuture =
            tagServiceAsync.retrieveAll(
                TagRetrieveAllParams.builder().owner("owner").repo("repo").build()
            )

        val repoTags = repoTagsFuture.get()
        repoTags.forEach { it.validate() }
    }
}
