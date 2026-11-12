package com.langchain.smith.services

import com.github.tomakehurst.wiremock.client.WireMock.*
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.errors.LangChainServiceException
import com.langchain.smith.models.evaluators.EvaluatorListParams
import com.langchain.smith.models.evaluators.EvaluatorListV2Params
import com.langchain.smith.models.evaluators.Rule
import java.time.Duration
import java.util.concurrent.ExecutionException
import java.util.concurrent.TimeUnit
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Timeout
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
@Timeout(15)
internal class RulePaginationCompatibilityTest {
    data class PaginationCase(val async: Boolean, val scenario: String) {
        override fun toString(): String =
            "${if (async) "asynchronous" else "synchronous"} $scenario"
    }

    companion object {
        private const val PATH = "/api/v2/runs/rules"
        private const val CURSOR = "opaque+/=cursor"
        private const val FIRST_RULE_ID = "00000000-0000-4000-8000-000000000001"
        private const val SECOND_RULE_ID = "00000000-0000-4000-8000-000000000002"

        @JvmStatic
        fun paginationCases() =
            listOf(
                PaginationCase(async = false, scenario = "pages"),
                PaginationCase(async = true, scenario = "pages"),
                PaginationCase(async = false, scenario = "empty"),
                PaginationCase(async = true, scenario = "empty"),
                PaginationCase(async = false, scenario = "failure"),
                PaginationCase(async = true, scenario = "failure"),
            )

        private fun rule(id: String) =
            """{
            "id":"$id", "tenant_id":"00000000-0000-4000-8000-000000000031", "display_name":"Synthetic rule",
            "created_at":"2026-10-13T12:00:00Z", "updated_at":"2026-10-13T12:00:00Z",
            "add_to_dataset_prefer_correction":false, "evaluator_version":1, "extend_only":false,
            "include_extended_stats":false, "is_enabled":true, "is_managed_evaluator":false,
            "is_tracing_disabled":false, "sampling_rate":1, "transient":false, "use_corrections_dataset":false,
            "evaluator_type":"CODE", "code_evaluators":[{"code":"return 1", "require_attachments":false,
            "code_evaluator_input":"TRAJECTORY", "advanced_features_enabled":true}]
        }"""

        private fun checkRule(rule: Rule, ids: MutableList<String>) {
            assertThat(ids).hasSizeLessThan(2)
            ids.add(rule.id())
            assertThat(rule.evaluatorType()).contains("CODE")
            val evaluator =
                rule
                    .codeEvaluators()
                    .orElseThrow { AssertionError("missing code evaluators") }
                    .single()
            assertThat(
                    evaluator
                        .codeEvaluatorInput()
                        .orElseThrow { AssertionError("missing evaluator input") }
                        .asString()
                )
                .isEqualTo("TRAJECTORY")
            assertThat(evaluator.advancedFeaturesEnabled()).contains(true)
        }
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("paginationCases")
    fun paginationPreservesFiltersAndOutcomes(case: PaginationCase, server: WireMockRuntimeInfo) {
        val (async, scenario) = case
        val initial = if (scenario == "empty") "[]" else "[${rule(FIRST_RULE_ID)}]"
        val cursor = if (scenario == "empty") "null" else "\"$CURSOR\""
        stubFor(
            get(urlPathEqualTo(PATH))
                .withQueryParam("cursor", absent())
                .willReturn(okJson("""{"items":$initial,"next_cursor":$cursor}"""))
        )
        stubFor(
            get(urlPathEqualTo(PATH))
                .withQueryParam("cursor", equalTo(CURSOR))
                .willReturn(
                    if (scenario == "failure") status(503).withBody("{}")
                    else okJson("""{"items":[${rule(SECOND_RULE_ID)}],"next_cursor":null}""")
                )
        )

        val params =
            EvaluatorListV2Params.builder()
                .addId("rule-a")
                .addId("rule-b")
                .addTagValueId("tag-a")
                .addTagValueId("tag-b")
                .projectId("project-a")
                .type(EvaluatorListV2Params.Type.PROJECT)
                .nameContains("Synthetic rule")
                .pageSize(2)
                .includeBackfillProgress(true)
                .build()
        val ids = mutableListOf<String>()
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(server.httpBaseUrl)
                .apiKey("synthetic-test-key")
                .tenantId("synthetic-test-tenant")
                .timeout(Duration.ofSeconds(5))
                .maxRetries(0)
                .responseValidation(true)
                .build()
        try {
            val consume = {
                if (async) {
                    client
                        .async()
                        .evaluators()
                        .listV2(params)
                        .get(10, TimeUnit.SECONDS)
                        .autoPager()
                        .subscribe { checkRule(rule = it, ids = ids) }
                        .onCompleteFuture()
                        .get(10, TimeUnit.SECONDS)
                } else {
                    client.evaluators().listV2(params).autoPager().forEach {
                        checkRule(rule = it, ids = ids)
                    }
                }
            }
            if (scenario == "failure") {
                val error = assertThrows<Exception> { consume() }
                val cause = if (error is ExecutionException) error.cause else error
                assertThat(cause).isInstanceOf(LangChainServiceException::class.java)
                assertThat((cause as LangChainServiceException).statusCode()).isEqualTo(503)
            } else {
                consume()
            }
        } finally {
            client.close()
        }
        assertThat(ids)
            .containsExactlyElementsOf(
                when (scenario) {
                    "empty" -> emptyList()
                    "failure" -> listOf(FIRST_RULE_ID)
                    else -> listOf(FIRST_RULE_ID, SECOND_RULE_ID)
                }
            )
        val requests = findAll(getRequestedFor(urlPathEqualTo(PATH)))
        assertThat(requests).hasSize(if (scenario == "empty") 1 else 2)
        requests.forEach { request ->
            assertThat(request.queryParameter("id")?.values()).containsExactly("rule-a", "rule-b")
            assertThat(request.queryParameter("tag_value_id")?.values())
                .containsExactly("tag-a", "tag-b")
            assertThat(request.queryParameter("project_id")?.firstValue()).isEqualTo("project-a")
            assertThat(request.queryParameter("type")?.firstValue()).isEqualTo("PROJECT")
            assertThat(request.queryParameter("name_contains")?.firstValue())
                .isEqualTo("Synthetic rule")
            assertThat(request.queryParameter("page_size")?.firstValue()).isEqualTo("2")
            assertThat(request.queryParameter("include_backfill_progress")?.firstValue())
                .isEqualTo("true")
        }
        if (scenario != "empty") {
            verify(
                1,
                getRequestedFor(urlPathEqualTo(PATH)).withQueryParam("cursor", equalTo(CURSOR)),
            )
        }
        assertThat(params.cursor()).isEmpty()
    }

    @Test
    fun canonicalListKeepsV1(server: WireMockRuntimeInfo) {
        // V1 returns enum values in snake_case.
        val legacyRule =
            rule(FIRST_RULE_ID)
                .replace("\"TRAJECTORY\"", "\"trajectory\"")
                .replace("\"CODE\"", "\"code\"")
        stubFor(get(urlPathEqualTo("/api/v1/runs/rules")).willReturn(okJson("[$legacyRule]")))
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(server.httpBaseUrl)
                .apiKey("synthetic-test-key")
                .tenantId("synthetic-test-tenant")
                .timeout(Duration.ofSeconds(5))
                .maxRetries(0)
                .build()
        try {
            val params = EvaluatorListParams.builder().sessionId("legacy-project").build()
            assertThat(client.evaluators().list(params).single().id()).isEqualTo(FIRST_RULE_ID)
            assertThat(
                    client.async().evaluators().list(params).get(10, TimeUnit.SECONDS).single().id()
                )
                .isEqualTo(FIRST_RULE_ID)
        } finally {
            client.close()
        }
        verify(2, getRequestedFor(urlPathEqualTo("/api/v1/runs/rules")))
        verify(
            2,
            getRequestedFor(urlPathEqualTo("/api/v1/runs/rules"))
                .withQueryParam("session_id", equalTo("legacy-project")),
        )
        verify(0, getRequestedFor(urlPathEqualTo(PATH)))
    }
}
