// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TracerSessionMetadataResponseTest {

    @Test
    fun createTracerSessionMetadataResponse() {
        val tracerSessionMetadataResponse = TracerSessionMetadataResponse.builder().build()
        assertThat(tracerSessionMetadataResponse).isNotNull
    }
}
