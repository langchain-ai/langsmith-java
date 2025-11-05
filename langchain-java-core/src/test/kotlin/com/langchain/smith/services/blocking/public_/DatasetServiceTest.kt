// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.public_

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.datasets.SortByDatasetColumn
import com.langchain.smith.models.datasets.comparative.SortByComparativeExperimentColumn
import com.langchain.smith.models.feedback.FeedbackLevel
import com.langchain.smith.models.feedback.SourceType
import com.langchain.smith.models.public_.datasets.DatasetListParams
import com.langchain.smith.models.public_.datasets.DatasetRetrieveComparativeParams
import com.langchain.smith.models.public_.datasets.DatasetRetrieveFeedbackParams
import com.langchain.smith.models.public_.datasets.DatasetRetrieveSessionsBulkParams
import com.langchain.smith.models.public_.datasets.DatasetRetrieveSessionsParams
import com.langchain.smith.models.sessions.SessionSortableColumns
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DatasetServiceTest {

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
        val datasetService = client.public_().datasets()

        val datasets =
            datasetService.list(
                DatasetListParams.builder()
                    .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(1L)
                    .offset(0L)
                    .sortBy(SortByDatasetColumn.NAME)
                    .sortByDesc(true)
                    .build()
            )

        datasets.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveComparative() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val datasetService = client.public_().datasets()

        val response =
            datasetService.retrieveComparative(
                DatasetRetrieveComparativeParams.builder()
                    .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(1L)
                    .name("name")
                    .nameContains("name_contains")
                    .offset(0L)
                    .sortBy(SortByComparativeExperimentColumn.NAME)
                    .sortByDesc(true)
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveFeedback() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val datasetService = client.public_().datasets()

        val feedbackSchemata =
            datasetService.retrieveFeedback(
                DatasetRetrieveFeedbackParams.builder()
                    .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .hasComment(true)
                    .hasScore(true)
                    .addKey("string")
                    .level(FeedbackLevel.RUN)
                    .limit(1L)
                    .offset(0L)
                    .addRun("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addSource(SourceType.API)
                    .addUser("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        feedbackSchemata.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveSessions() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val datasetService = client.public_().datasets()

        val tracerSessions =
            datasetService.retrieveSessions(
                DatasetRetrieveSessionsParams.builder()
                    .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .datasetVersion("dataset_version")
                    .facets(true)
                    .limit(1L)
                    .name("name")
                    .nameContains("name_contains")
                    .offset(0L)
                    .sortBy(SessionSortableColumns.NAME)
                    .sortByDesc(true)
                    .sortByFeedbackKey("sort_by_feedback_key")
                    .accept("accept")
                    .build()
            )

        tracerSessions.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveSessionsBulk() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val datasetService = client.public_().datasets()

        val tracerSessions =
            datasetService.retrieveSessionsBulk(
                DatasetRetrieveSessionsBulkParams.builder().addShareToken("string").build()
            )

        tracerSessions.forEach { it.validate() }
    }
}
