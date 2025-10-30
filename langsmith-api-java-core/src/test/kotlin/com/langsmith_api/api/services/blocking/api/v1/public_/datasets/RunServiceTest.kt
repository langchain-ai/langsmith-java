// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.public_.datasets

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.models.api.v1.datasets.runs.QueryFeedbackDelta
import com.langsmith_api.api.models.api.v1.public_.datasets.runs.RunDeltaParams
import com.langsmith_api.api.models.api.v1.public_.datasets.runs.RunGenerateQueryParams
import com.langsmith_api.api.models.api.v1.public_.datasets.runs.RunQueryParams
import com.langsmith_api.api.models.api.v1.public_.datasets.runs.RunRetrieveParams
import com.langsmith_api.api.models.api.v1.public_.datasets.runs.RunStatsParams
import com.langsmith_api.api.models.api.v1.runs.BodyParamsForRunSchema
import com.langsmith_api.api.models.api.v1.runs.RequestBodyForRunsGenerateQuery
import com.langsmith_api.api.models.api.v1.runs.RunStatsQueryParams
import com.langsmith_api.api.models.api.v1.runs.RunTypeEnum
import com.langsmith_api.api.models.api.v1.runs.RunsFilterDataSourceTypeEnum
import com.langsmith_api.api.models.api.v1.sessions.RunStatsGroupBy
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RunServiceTest {

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
        val runService = client.api().v1().public_().datasets().runs()

        val runPublicDatasetSchema =
            runService.retrieve(
                RunRetrieveParams.builder()
                    .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .excludeS3StoredAttributes(true)
                    .build()
            )

        runPublicDatasetSchema.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delta() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val runService = client.api().v1().public_().datasets().runs()

        val sessionFeedbackDelta =
            runService.delta(
                RunDeltaParams.builder()
                    .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .queryFeedbackDelta(
                        QueryFeedbackDelta.builder()
                            .baselineSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addComparisonSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .feedbackKey("feedback_key")
                            .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .filters(
                                QueryFeedbackDelta.Filters.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                    .build()
                            )
                            .limit(1L)
                            .offset(0L)
                            .build()
                    )
                    .build()
            )

        sessionFeedbackDelta.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun generateQuery() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val runService = client.api().v1().public_().datasets().runs()

        val responseBodyForRunsGenerateQuery =
            runService.generateQuery(
                RunGenerateQueryParams.builder()
                    .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .requestBodyForRunsGenerateQuery(
                        RequestBodyForRunsGenerateQuery.builder()
                            .query("query")
                            .addFeedbackKey(RequestBodyForRunsGenerateQuery.FeedbackKey.USER_SCORE)
                            .build()
                    )
                    .build()
            )

        responseBodyForRunsGenerateQuery.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun query() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val runService = client.api().v1().public_().datasets().runs()

        val response =
            runService.query(
                RunQueryParams.builder()
                    .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .bodyParamsForRunSchema(
                        BodyParamsForRunSchema.builder()
                            .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .cursor("cursor")
                            .dataSourceType(RunsFilterDataSourceTypeEnum.CURRENT)
                            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .error(true)
                            .executionOrder(1L)
                            .filter("filter")
                            .isRoot(true)
                            .limit(1L)
                            .order(BodyParamsForRunSchema.Order.ASC)
                            .parentRun("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .query("query")
                            .addReferenceExample("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .runType(RunTypeEnum.TOOL)
                            .searchFilter("search_filter")
                            .addSelect(BodyParamsForRunSchema.Select.ID)
                            .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .skipPagination(true)
                            .skipPrevCursor(true)
                            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .trace("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .traceFilter("trace_filter")
                            .treeFilter("tree_filter")
                            .useExperimentalSearch(true)
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun stats() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val runService = client.api().v1().public_().datasets().runs()

        val runStats =
            runService.stats(
                RunStatsParams.builder()
                    .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runStatsQueryParams(
                        RunStatsQueryParams.builder()
                            .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .dataSourceType(RunsFilterDataSourceTypeEnum.CURRENT)
                            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .error(true)
                            .executionOrder(1L)
                            .filter("filter")
                            .groupBy(
                                RunStatsGroupBy.builder()
                                    .attribute(RunStatsGroupBy.Attribute.NAME)
                                    .maxGroups(0L)
                                    .path("path")
                                    .build()
                            )
                            .addGroup("string")
                            .isRoot(true)
                            .parentRun("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .query("query")
                            .addReferenceExample("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .runType(RunTypeEnum.TOOL)
                            .searchFilter("search_filter")
                            .addSelect(RunStatsQueryParams.Select.RUN_COUNT)
                            .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .skipPagination(true)
                            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .trace("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .traceFilter("trace_filter")
                            .treeFilter("tree_filter")
                            .useExperimentalSearch(true)
                            .build()
                    )
                    .build()
            )

        runStats.validate()
    }
}
