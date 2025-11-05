// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.platform.alerts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlertUpdateResponseTest {

    @Test
    fun create() {
        val alertUpdateResponse =
            AlertUpdateResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from(mapOf("message" to "message")))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val alertUpdateResponse =
            AlertUpdateResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from(mapOf("message" to "message")))
                .build()

        val roundtrippedAlertUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(alertUpdateResponse),
                jacksonTypeRef<AlertUpdateResponse>(),
            )

        assertThat(roundtrippedAlertUpdateResponse).isEqualTo(alertUpdateResponse)
    }
}
