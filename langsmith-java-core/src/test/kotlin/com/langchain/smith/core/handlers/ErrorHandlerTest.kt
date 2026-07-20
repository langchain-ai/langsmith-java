package com.langchain.smith.core.handlers

import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.errors.BadRequestException
import java.io.ByteArrayInputStream
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class ErrorHandlerTest {

    @Test
    fun errorHandlerClosesNonSuccessfulResponseBeforeThrowing() {
        val response = TestHttpResponse(statusCode = 400)
        val handler = errorHandler(testErrorBodyHandler())

        val exception = assertThrows<BadRequestException> { handler.handle(response) }

        assertThat(exception.statusCode()).isEqualTo(400)
        assertThat(response.closed).isTrue()
    }

    @Test
    fun errorHandlerLeavesSuccessfulResponseOpenForCaller() {
        val response = TestHttpResponse(statusCode = 200)
        val handler = errorHandler(testErrorBodyHandler())

        assertThat(handler.handle(response)).isSameAs(response)
        assertThat(response.closed).isFalse()
    }

    private fun testErrorBodyHandler(): HttpResponse.Handler<JsonValue> =
        object : HttpResponse.Handler<JsonValue> {
            override fun handle(response: HttpResponse): JsonValue = JsonValue.from(mapOf("error" to "bad"))
        }

    private class TestHttpResponse(private val statusCode: Int) : HttpResponse {
        var closed = false
            private set

        override fun statusCode(): Int = statusCode

        override fun headers(): Headers = Headers.builder().build()

        override fun body(): InputStream = ByteArrayInputStream(ByteArray(0))

        override fun close() {
            closed = true
        }
    }
}
