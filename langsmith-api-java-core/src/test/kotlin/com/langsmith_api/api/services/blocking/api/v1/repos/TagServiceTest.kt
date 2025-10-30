// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.repos

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.models.api.v1.repos.tags.TagCreateParams
import com.langsmith_api.api.models.api.v1.repos.tags.TagDeleteParams
import com.langsmith_api.api.models.api.v1.repos.tags.TagListParams
import com.langsmith_api.api.models.api.v1.repos.tags.TagRetrieveParams
import com.langsmith_api.api.models.api.v1.repos.tags.TagUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TagServiceTest {

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
        val tagService = client.api().v1().repos().tags()

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
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagService = client.api().v1().repos().tags()

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
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagService = client.api().v1().repos().tags()

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
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tagService = client.api().v1().repos().tags()

        val repoTags = tagService.list(TagListParams.builder().owner("owner").repo("repo").build())

        repoTags.forEach { it.validate() }
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
        val tagService = client.api().v1().repos().tags()

        val tag =
            tagService.delete(
                TagDeleteParams.builder().owner("owner").repo("repo").tagName("tag_name").build()
            )

        tag.validate()
    }
}
