// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.models.api.v1.commits.CommitRetrieveParams
import com.langsmith_api.api.models.api.v1.commits.CommitUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CommitServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val commitServiceAsync = client.api().v1().commits()

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
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val commitServiceAsync = client.api().v1().commits()

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
}
