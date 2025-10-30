// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.public_.examples

import com.langsmith_api.api.core.http.QueryParams
import com.langsmith_api.api.models.api.v1.examples.ExampleSelect
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExampleListParamsTest {

    @Test
    fun create() {
        ExampleListParams.builder()
            .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .filter("filter")
            .limit(1L)
            .metadata("metadata")
            .offset(0L)
            .addSelect(ExampleSelect.ID)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExampleListParams.builder().shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ExampleListParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filter("filter")
                .limit(1L)
                .metadata("metadata")
                .offset(0L)
                .addSelect(ExampleSelect.ID)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").joinToString(","))
                    .put("as_of", "2019-12-27T18:11:19.117Z")
                    .put("filter", "filter")
                    .put("limit", "1")
                    .put("metadata", "metadata")
                    .put("offset", "0")
                    .put("select", listOf("id").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ExampleListParams.builder().shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
