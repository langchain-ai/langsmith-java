// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.datasets

import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.models.feedback.FeedbackLevel
import com.langchain.smith.models.feedback.SourceType
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetRetrieveFeedbackParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            DatasetRetrieveFeedbackParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("has_comment", "true")
                    .put("has_score", "true")
                    .put("key", listOf("string").joinToString(","))
                    .put("level", "run")
                    .put("limit", "1")
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
        val params =
            DatasetRetrieveFeedbackParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
