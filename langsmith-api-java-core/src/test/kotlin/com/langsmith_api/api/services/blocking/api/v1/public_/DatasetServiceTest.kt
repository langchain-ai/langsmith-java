// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.public_

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.models.api.v1.datasets.SortByDatasetColumn
import com.langsmith_api.api.models.api.v1.datasets.comparative.SortByComparativeExperimentColumn
import com.langsmith_api.api.models.api.v1.feedback.FeedbackLevel
import com.langsmith_api.api.models.api.v1.feedback.SourceType
import com.langsmith_api.api.models.api.v1.public_.datasets.DatasetListParams
import com.langsmith_api.api.models.api.v1.public_.datasets.DatasetRetrieveComparativeParams
import com.langsmith_api.api.models.api.v1.public_.datasets.DatasetRetrieveFeedbackParams
import com.langsmith_api.api.models.api.v1.public_.datasets.DatasetRetrieveSessionsBulkParams
import com.langsmith_api.api.models.api.v1.public_.datasets.DatasetRetrieveSessionsParams
import com.langsmith_api.api.models.api.v1.sessions.SessionSortableColumns
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DatasetServiceTest {

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
        val datasetService = client.api().v1().public_().datasets()

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
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val datasetService = client.api().v1().public_().datasets()

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
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val datasetService = client.api().v1().public_().datasets()

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
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val datasetService = client.api().v1().public_().datasets()

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
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val datasetService = client.api().v1().public_().datasets()

        val tracerSessions =
            datasetService.retrieveSessionsBulk(
                DatasetRetrieveSessionsBulkParams.builder().addShareToken("string").build()
            )

        tracerSessions.forEach { it.validate() }
    }
}
