// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnlineEvaluatorSpendDayTest {

    @Test
    fun create() {
        val onlineEvaluatorSpendDay =
            OnlineEvaluatorSpendDay.builder().date("date").spendUsd(0.0).traceCount(0L).build()

        assertThat(onlineEvaluatorSpendDay.date()).contains("date")
        assertThat(onlineEvaluatorSpendDay.spendUsd()).contains(0.0)
        assertThat(onlineEvaluatorSpendDay.traceCount()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val onlineEvaluatorSpendDay =
            OnlineEvaluatorSpendDay.builder().date("date").spendUsd(0.0).traceCount(0L).build()

        val roundtrippedOnlineEvaluatorSpendDay =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(onlineEvaluatorSpendDay),
                jacksonTypeRef<OnlineEvaluatorSpendDay>(),
            )

        assertThat(roundtrippedOnlineEvaluatorSpendDay).isEqualTo(onlineEvaluatorSpendDay)
    }
}
