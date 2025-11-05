// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TimedeltaInputTest {

    @Test
    fun create() {
        val timedeltaInput = TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build()

        assertThat(timedeltaInput.days()).contains(0L)
        assertThat(timedeltaInput.hours()).contains(0L)
        assertThat(timedeltaInput.minutes()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val timedeltaInput = TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build()

        val roundtrippedTimedeltaInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(timedeltaInput),
                jacksonTypeRef<TimedeltaInput>(),
            )

        assertThat(roundtrippedTimedeltaInput).isEqualTo(timedeltaInput)
    }
}
