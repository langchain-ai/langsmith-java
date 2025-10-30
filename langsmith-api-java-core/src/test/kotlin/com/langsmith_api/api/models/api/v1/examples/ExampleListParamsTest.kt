// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.examples

import com.langsmith_api.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExampleListParamsTest {

    @Test
    fun create() {
        ExampleListParams.builder()
            .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .dataset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .descending(true)
            .filter("filter")
            .addFullTextContain("string")
            .limit(1L)
            .metadata("metadata")
            .offset(0L)
            .order(ExampleListParams.Order.RECENT)
            .randomSeed(0.0)
            .addSelect(ExampleSelect.ID)
            .addSplit("string")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ExampleListParams.builder()
                .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dataset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .descending(true)
                .filter("filter")
                .addFullTextContain("string")
                .limit(1L)
                .metadata("metadata")
                .offset(0L)
                .order(ExampleListParams.Order.RECENT)
                .randomSeed(0.0)
                .addSelect(ExampleSelect.ID)
                .addSplit("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").joinToString(","))
                    .put("as_of", "2019-12-27T18:11:19.117Z")
                    .put("dataset", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("descending", "true")
                    .put("filter", "filter")
                    .put("full_text_contains", listOf("string").joinToString(","))
                    .put("limit", "1")
                    .put("metadata", "metadata")
                    .put("offset", "0")
                    .put("order", "recent")
                    .put("random_seed", "0.0")
                    .put("select", listOf("id").joinToString(","))
                    .put("splits", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ExampleListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
