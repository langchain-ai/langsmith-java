// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.langchain.smith.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionUpdateParamsTest {

    @Test
    fun create() {
        SessionUpdateParams.builder()
            .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("description")
            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .extra(
                SessionUpdateParams.Extra.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .name("name")
            .traceTier(SessionUpdateParams.TraceTier.LONGLIVED)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SessionUpdateParams.builder().sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SessionUpdateParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .extra(
                    SessionUpdateParams.Extra.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .name("name")
                .traceTier(SessionUpdateParams.TraceTier.LONGLIVED)
                .build()

        val body = params._body()

        assertThat(body.defaultDatasetId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.description()).contains("description")
        assertThat(body.endTime()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.extra())
            .contains(
                SessionUpdateParams.Extra.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.name()).contains("name")
        assertThat(body.traceTier()).contains(SessionUpdateParams.TraceTier.LONGLIVED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SessionUpdateParams.builder().sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
