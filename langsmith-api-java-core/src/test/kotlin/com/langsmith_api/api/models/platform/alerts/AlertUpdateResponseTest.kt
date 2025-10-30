// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.platform.alerts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
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
