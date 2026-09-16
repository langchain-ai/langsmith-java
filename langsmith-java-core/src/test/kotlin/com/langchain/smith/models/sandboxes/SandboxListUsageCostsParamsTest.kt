// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes

import com.langchain.smith.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SandboxListUsageCostsParamsTest {

    @Test
    fun create() {
        SandboxListUsageCostsParams.builder()
            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .cursor("cursor")
            .pageSize(1L)
            .addResourceId("string")
            .resourceType(SandboxListUsageCostsParams.ResourceType.SANDBOX)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SandboxListUsageCostsParams.builder()
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .cursor("cursor")
                .pageSize(1L)
                .addResourceId("string")
                .resourceType(SandboxListUsageCostsParams.ResourceType.SANDBOX)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("end_time", "2019-12-27T18:11:19.117Z")
                    .put("start_time", "2019-12-27T18:11:19.117Z")
                    .put("cursor", "cursor")
                    .put("page_size", "1")
                    .put("resource_ids", "string")
                    .put("resource_type", "SANDBOX")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SandboxListUsageCostsParams.builder()
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("end_time", "2019-12-27T18:11:19.117Z")
                    .put("start_time", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }
}
