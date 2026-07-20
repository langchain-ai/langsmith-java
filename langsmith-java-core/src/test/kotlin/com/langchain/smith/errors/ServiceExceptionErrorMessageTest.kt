package com.langchain.smith.errors

import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ServiceExceptionErrorMessageTest {

    @Test
    fun serviceExceptionMessageRedactsResponseBody() {
        val body = JsonValue.from(mapOf("detail" to "secret response detail"))

        val exception = BadRequestException.builder().headers(Headers.builder().build()).body(body).build()

        assertThat(exception.message).isEqualTo("400: response body redacted; inspect body() for details")
        assertThat(exception.message).doesNotContain("secret response detail")
        assertThat(exception.body()).isEqualTo(body)
    }
}
