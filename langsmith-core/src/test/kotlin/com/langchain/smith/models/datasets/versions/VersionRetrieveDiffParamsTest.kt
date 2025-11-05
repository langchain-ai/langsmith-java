// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.versions

import com.langchain.smith.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VersionRetrieveDiffParamsTest {

    @Test
    fun create() {
        VersionRetrieveDiffParams.builder()
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .fromVersion(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .toVersion(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            VersionRetrieveDiffParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fromVersion(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .toVersion(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            VersionRetrieveDiffParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fromVersion(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .toVersion(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("from_version", "2019-12-27T18:11:19.117Z")
                    .put("to_version", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }
}
