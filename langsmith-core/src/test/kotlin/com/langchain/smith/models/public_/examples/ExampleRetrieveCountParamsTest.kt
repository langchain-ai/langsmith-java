// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.examples

import com.langchain.smith.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExampleRetrieveCountParamsTest {

    @Test
    fun create() {
        ExampleRetrieveCountParams.builder()
            .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .filter("filter")
            .metadata("metadata")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExampleRetrieveCountParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ExampleRetrieveCountParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filter("filter")
                .metadata("metadata")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").joinToString(","))
                    .put("as_of", "2019-12-27T18:11:19.117Z")
                    .put("filter", "filter")
                    .put("metadata", "metadata")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ExampleRetrieveCountParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
