// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionFeedbackStatTest {

    @Test
    fun create() {
        val sessionFeedbackStat =
            SessionFeedbackStat.builder()
                .avg(0.0)
                .containsThreadFeedback(true)
                .errors(0L)
                .max(0.0)
                .median(0.0)
                .min(0.0)
                .n(0L)
                .stdev(0.0)
                .type(SessionFeedbackStat.Type.PRIMARY)
                .values(
                    SessionFeedbackStat.Values.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .build()

        assertThat(sessionFeedbackStat.avg()).contains(0.0)
        assertThat(sessionFeedbackStat.containsThreadFeedback()).isEqualTo(true)
        assertThat(sessionFeedbackStat.errors()).isEqualTo(0L)
        assertThat(sessionFeedbackStat.max()).contains(0.0)
        assertThat(sessionFeedbackStat.median()).contains(0.0)
        assertThat(sessionFeedbackStat.min()).contains(0.0)
        assertThat(sessionFeedbackStat.n()).isEqualTo(0L)
        assertThat(sessionFeedbackStat.stdev()).contains(0.0)
        assertThat(sessionFeedbackStat.type()).isEqualTo(SessionFeedbackStat.Type.PRIMARY)
        assertThat(sessionFeedbackStat.values())
            .isEqualTo(
                SessionFeedbackStat.Values.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionFeedbackStat =
            SessionFeedbackStat.builder()
                .avg(0.0)
                .containsThreadFeedback(true)
                .errors(0L)
                .max(0.0)
                .median(0.0)
                .min(0.0)
                .n(0L)
                .stdev(0.0)
                .type(SessionFeedbackStat.Type.PRIMARY)
                .values(
                    SessionFeedbackStat.Values.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .build()

        val roundtrippedSessionFeedbackStat =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionFeedbackStat),
                jacksonTypeRef<SessionFeedbackStat>(),
            )

        assertThat(roundtrippedSessionFeedbackStat).isEqualTo(sessionFeedbackStat)
    }
}
