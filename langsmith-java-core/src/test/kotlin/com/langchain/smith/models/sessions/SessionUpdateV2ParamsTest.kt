// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.langchain.smith.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionUpdateV2ParamsTest {

    @Test
    fun create() {
        SessionUpdateV2Params.builder()
            .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("description")
            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .extra(JsonValue.from(mapOf<String, Any>()))
            .longlivedTtlDays(0L)
            .name("name")
            .traceTier(SessionUpdateV2Params.TraceTier.LONG_LIVED)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SessionUpdateV2Params.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SessionUpdateV2Params.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .extra(JsonValue.from(mapOf<String, Any>()))
                .longlivedTtlDays(0L)
                .name("name")
                .traceTier(SessionUpdateV2Params.TraceTier.LONG_LIVED)
                .build()

        val body = params._body()

        assertThat(body.defaultDatasetId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.description()).contains("description")
        assertThat(body.endTime()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body._extra()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.longlivedTtlDays()).contains(0L)
        assertThat(body.name()).contains("name")
        assertThat(body.traceTier()).contains(SessionUpdateV2Params.TraceTier.LONG_LIVED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SessionUpdateV2Params.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
