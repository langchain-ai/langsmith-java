// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.feedback

import com.langsmith_api.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedbackListParamsTest {

    @Test
    fun create() {
        FeedbackListParams.builder()
            .hasComment(true)
            .hasScore(true)
            .includeUserNames(true)
            .addKey("string")
            .level(FeedbackLevel.RUN)
            .limit(1L)
            .maxCreatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .minCreatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .offset(0L)
            .addRun("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addSource(SourceType.API)
            .addUser("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            FeedbackListParams.builder()
                .hasComment(true)
                .hasScore(true)
                .includeUserNames(true)
                .addKey("string")
                .level(FeedbackLevel.RUN)
                .limit(1L)
                .maxCreatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .minCreatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .offset(0L)
                .addRun("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addSource(SourceType.API)
                .addUser("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("has_comment", "true")
                    .put("has_score", "true")
                    .put("include_user_names", "true")
                    .put("key", listOf("string").joinToString(","))
                    .put("level", "run")
                    .put("limit", "1")
                    .put("max_created_at", "2019-12-27T18:11:19.117Z")
                    .put("min_created_at", "2019-12-27T18:11:19.117Z")
                    .put("offset", "0")
                    .put("run", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").joinToString(","))
                    .put(
                        "session",
                        listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").joinToString(","),
                    )
                    .put("source", listOf("api").joinToString(","))
                    .put("user", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FeedbackListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
