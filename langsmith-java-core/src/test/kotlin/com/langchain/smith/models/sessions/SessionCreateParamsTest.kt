// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.models.orgs.ttlsettings.TraceTier
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionCreateParamsTest {

    @Test
    fun create() {
        SessionCreateParams.builder()
            .upsert(true)
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("description")
            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .extra(JsonValue.from(mapOf<String, Any>()))
            .name("name")
            .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .traceTier(TraceTier.LONGLIVED)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SessionCreateParams.builder()
                .upsert(true)
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .extra(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .traceTier(TraceTier.LONGLIVED)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("upsert", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SessionCreateParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            SessionCreateParams.builder()
                .upsert(true)
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .extra(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .traceTier(TraceTier.LONGLIVED)
                .build()

        val body = params._body()

        assertThat(body.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.defaultDatasetId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.description()).contains("description")
        assertThat(body.endTime()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body._extra()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.name()).contains("name")
        assertThat(body.referenceDatasetId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.startTime()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.traceTier()).contains(TraceTier.LONGLIVED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SessionCreateParams.builder().build()

        val body = params._body()
    }
}
