// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.datasets

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.datasets.versions.VersionRetrieveDiffParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VersionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val versionService = client.datasets().versions()

        val page = versionService.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        page.items().forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveDiff() {
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val versionService = client.datasets().versions()

        val response =
            versionService.retrieveDiff(
                VersionRetrieveDiffParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fromVersion(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .toVersion(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        response.validate()
    }
}
