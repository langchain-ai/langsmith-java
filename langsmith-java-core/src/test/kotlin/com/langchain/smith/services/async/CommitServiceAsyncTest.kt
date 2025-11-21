// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.commits.CommitListParams
import com.langchain.smith.models.commits.CommitRetrieveParams
import com.langchain.smith.models.commits.CommitUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CommitServiceAsyncTest {

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
        val commitServiceAsync = client.commits()

        val commitManifestResponseFuture =
            commitServiceAsync.retrieve(
                CommitRetrieveParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .commit("commit")
                    .getExamples(true)
                    .includeModel(true)
                    .isView(true)
                    .build()
            )

        val commitManifestResponse = commitManifestResponseFuture.get()
        commitManifestResponse.validate()
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
        val commitServiceAsync = client.commits()

        val commitFuture =
            commitServiceAsync.update(
                CommitUpdateParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .manifest(JsonValue.from(mapOf<String, Any>()))
                    .addExampleRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .parentCommit("parent_commit")
                    .skipWebhooks(true)
                    .build()
            )

        val commit = commitFuture.get()
        commit.validate()
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
        val commitServiceAsync = client.commits()

        val pageFuture =
            commitServiceAsync.list(CommitListParams.builder().owner("owner").repo("repo").build())

        val page = pageFuture.get()
        page.response().validate()
    }
}
