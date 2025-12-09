// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.commits.CommitCreateParams
import com.langchain.smith.models.commits.CommitListParams
import com.langchain.smith.models.commits.CommitRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CommitServiceTest {

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
        val commitService = client.commits()

        val commit =
            commitService.create(
                CommitCreateParams.builder()
                    .owner(JsonValue.from(mapOf<String, Any>()))
                    .repo(JsonValue.from(mapOf<String, Any>()))
                    .manifest(JsonValue.from(mapOf<String, Any>()))
                    .parentCommit("parent_commit")
                    .skipWebhooks(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        commit.validate()
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
        val commitService = client.commits()

        val commit =
            commitService.retrieve(
                CommitRetrieveParams.builder()
                    .owner(JsonValue.from(mapOf<String, Any>()))
                    .repo(JsonValue.from(mapOf<String, Any>()))
                    .commit(JsonValue.from(mapOf<String, Any>()))
                    .getExamples(true)
                    .includeModel(true)
                    .isView(true)
                    .build()
            )

        commit.validate()
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
        val commitService = client.commits()

        val page =
            commitService.list(
                CommitListParams.builder()
                    .owner(JsonValue.from(mapOf<String, Any>()))
                    .repo(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        page.response().validate()
    }
}
