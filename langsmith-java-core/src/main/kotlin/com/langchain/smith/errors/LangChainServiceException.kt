// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.errors

import com.fasterxml.jackson.databind.ObjectMapper
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.http.Headers

abstract class LangChainServiceException
protected constructor(message: String, cause: Throwable? = null) :
    LangChainException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue

    companion object {

        /** Formats a status code and [JsonValue] error body into an error message. */
        @JvmStatic
        fun formatMessage(statusCode: Int, body: JsonValue): String {
            val bodyStr =
                try {
                    ObjectMapper().writeValueAsString(body)
                } catch (_: Exception) {
                    body.toString()
                }
            return "$statusCode: $bodyStr"
        }
    }
}
