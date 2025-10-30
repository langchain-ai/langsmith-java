// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.examples

import com.langchain.smith.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExampleRetrieveCountParamsTest {

    @Test
    fun create() {
        ExampleRetrieveCountParams.builder()
            .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .dataset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .filter("filter")
            .addFullTextContain("string")
            .metadata("metadata")
            .addSplit("string")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ExampleRetrieveCountParams.builder()
                .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dataset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filter("filter")
                .addFullTextContain("string")
                .metadata("metadata")
                .addSplit("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").joinToString(","))
                    .put("as_of", "2019-12-27T18:11:19.117Z")
                    .put("dataset", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("filter", "filter")
                    .put("full_text_contains", listOf("string").joinToString(","))
                    .put("metadata", "metadata")
                    .put("splits", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ExampleRetrieveCountParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
