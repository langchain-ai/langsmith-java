// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.http.QueryParams
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionCreateV2ParamsTest {

    @Test
    fun create() {
        SessionCreateV2Params.builder()
            .upsert(true)
            .type(SessionCreateV2Params.Type.PROJECT)
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("description")
            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .addEvaluatorKey("string")
            .extra(
                SessionCreateV2Params.Extra.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .kickedOffBy("kicked_off_by")
            .longlivedTtlDays(0L)
            .name("name")
            .numExamples(0L)
            .numRepetitions(0L)
            .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .addTagValueId("string")
            .traceTier(SessionCreateV2Params.TraceTier.LONG_LIVED)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SessionCreateV2Params.builder()
                .upsert(true)
                .type(SessionCreateV2Params.Type.PROJECT)
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addEvaluatorKey("string")
                .extra(
                    SessionCreateV2Params.Extra.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .kickedOffBy("kicked_off_by")
                .longlivedTtlDays(0L)
                .name("name")
                .numExamples(0L)
                .numRepetitions(0L)
                .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addTagValueId("string")
                .traceTier(SessionCreateV2Params.TraceTier.LONG_LIVED)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("upsert", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SessionCreateV2Params.builder().type(SessionCreateV2Params.Type.PROJECT).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            SessionCreateV2Params.builder()
                .upsert(true)
                .type(SessionCreateV2Params.Type.PROJECT)
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addEvaluatorKey("string")
                .extra(
                    SessionCreateV2Params.Extra.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .kickedOffBy("kicked_off_by")
                .longlivedTtlDays(0L)
                .name("name")
                .numExamples(0L)
                .numRepetitions(0L)
                .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addTagValueId("string")
                .traceTier(SessionCreateV2Params.TraceTier.LONG_LIVED)
                .build()

        val body = params._body()

        assertThat(body.type()).isEqualTo(SessionCreateV2Params.Type.PROJECT)
        assertThat(body.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.defaultDatasetId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.description()).contains("description")
        assertThat(body.endTime()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.evaluatorKeys().getOrNull()).containsExactly("string")
        assertThat(body.extra())
            .contains(
                SessionCreateV2Params.Extra.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.kickedOffBy()).contains("kicked_off_by")
        assertThat(body.longlivedTtlDays()).contains(0L)
        assertThat(body.name()).contains("name")
        assertThat(body.numExamples()).contains(0L)
        assertThat(body.numRepetitions()).contains(0L)
        assertThat(body.referenceDatasetId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.startTime()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.tagValueIds().getOrNull()).containsExactly("string")
        assertThat(body.traceTier()).contains(SessionCreateV2Params.TraceTier.LONG_LIVED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SessionCreateV2Params.builder().type(SessionCreateV2Params.Type.PROJECT).build()

        val body = params._body()

        assertThat(body.type()).isEqualTo(SessionCreateV2Params.Type.PROJECT)
    }
}
