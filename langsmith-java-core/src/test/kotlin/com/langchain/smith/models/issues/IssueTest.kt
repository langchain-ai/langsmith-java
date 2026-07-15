// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.issues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IssueTest {

    @Test
    fun create() {
        val issue =
            Issue.builder()
                .id("id")
                .actions(JsonValue.from(mapOf<String, Any>()))
                .createdAt("created_at")
                .description("description")
                .firstSeenAt("first_seen_at")
                .fixBranch("fix_branch")
                .fixDispatchedAt("fix_dispatched_at")
                .fixPrNumber(0L)
                .fixPrompt("fix_prompt")
                .fixVerification(JsonValue.from(mapOf<String, Any>()))
                .lastSeenAt("last_seen_at")
                .name("name")
                .addProposedContextFix(JsonValue.from(mapOf<String, Any>()))
                .addProposedExample(JsonValue.from(mapOf<String, Any>()))
                .proposedFix("proposed_fix")
                .addProposedPromptFix(JsonValue.from(mapOf<String, Any>()))
                .recurrencesSinceWatching(0L)
                .sessionId("session_id")
                .severity(Issue.Severity._0)
                .status(Issue.Status.OPEN)
                .addTag("string")
                .tenantId("tenant_id")
                .traces(JsonValue.from(mapOf<String, Any>()))
                .updatedAt("updated_at")
                .watchingSince("watching_since")
                .build()

        assertThat(issue.id()).contains("id")
        assertThat(issue._actions()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(issue.createdAt()).contains("created_at")
        assertThat(issue.description()).contains("description")
        assertThat(issue.firstSeenAt()).contains("first_seen_at")
        assertThat(issue.fixBranch()).contains("fix_branch")
        assertThat(issue.fixDispatchedAt()).contains("fix_dispatched_at")
        assertThat(issue.fixPrNumber()).contains(0L)
        assertThat(issue.fixPrompt()).contains("fix_prompt")
        assertThat(issue._fixVerification()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(issue.lastSeenAt()).contains("last_seen_at")
        assertThat(issue.name()).contains("name")
        assertThat(issue.proposedContextFixes().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(issue.proposedExamples().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(issue.proposedFix()).contains("proposed_fix")
        assertThat(issue.proposedPromptFixes().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(issue.recurrencesSinceWatching()).contains(0L)
        assertThat(issue.sessionId()).contains("session_id")
        assertThat(issue.severity()).contains(Issue.Severity._0)
        assertThat(issue.status()).contains(Issue.Status.OPEN)
        assertThat(issue.tags().getOrNull()).containsExactly("string")
        assertThat(issue.tenantId()).contains("tenant_id")
        assertThat(issue._traces()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(issue.updatedAt()).contains("updated_at")
        assertThat(issue.watchingSince()).contains("watching_since")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val issue =
            Issue.builder()
                .id("id")
                .actions(JsonValue.from(mapOf<String, Any>()))
                .createdAt("created_at")
                .description("description")
                .firstSeenAt("first_seen_at")
                .fixBranch("fix_branch")
                .fixDispatchedAt("fix_dispatched_at")
                .fixPrNumber(0L)
                .fixPrompt("fix_prompt")
                .fixVerification(JsonValue.from(mapOf<String, Any>()))
                .lastSeenAt("last_seen_at")
                .name("name")
                .addProposedContextFix(JsonValue.from(mapOf<String, Any>()))
                .addProposedExample(JsonValue.from(mapOf<String, Any>()))
                .proposedFix("proposed_fix")
                .addProposedPromptFix(JsonValue.from(mapOf<String, Any>()))
                .recurrencesSinceWatching(0L)
                .sessionId("session_id")
                .severity(Issue.Severity._0)
                .status(Issue.Status.OPEN)
                .addTag("string")
                .tenantId("tenant_id")
                .traces(JsonValue.from(mapOf<String, Any>()))
                .updatedAt("updated_at")
                .watchingSince("watching_since")
                .build()

        val roundtrippedIssue =
            jsonMapper.readValue(jsonMapper.writeValueAsString(issue), jacksonTypeRef<Issue>())

        assertThat(roundtrippedIssue).isEqualTo(issue)
    }
}
