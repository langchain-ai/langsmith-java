// File generated from our OpenAPI spec by Stainless.

@file:JvmName("ErrorHandler")

package com.langchain.smith.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponse.Handler
import com.langchain.smith.errors.BadRequestException
import com.langchain.smith.errors.InternalServerException
import com.langchain.smith.errors.NotFoundException
import com.langchain.smith.errors.PermissionDeniedException
import com.langchain.smith.errors.RateLimitException
import com.langchain.smith.errors.UnauthorizedException
import com.langchain.smith.errors.UnexpectedStatusCodeException
import com.langchain.smith.errors.UnprocessableEntityException

@JvmSynthetic
internal fun errorBodyHandler(jsonMapper: JsonMapper): Handler<JsonValue> {
    val handler = jsonHandler<JsonValue>(jsonMapper)

    return object : Handler<JsonValue> {
        override fun handle(response: HttpResponse): JsonValue =
            try {
                handler.handle(response)
            } catch (e: Exception) {
                JsonMissing.of()
            }
    }
}

@JvmSynthetic
internal fun errorHandler(errorBodyHandler: Handler<JsonValue>): Handler<HttpResponse> =
    object : Handler<HttpResponse> {
        override fun handle(response: HttpResponse): HttpResponse {
            val statusCode = response.statusCode()
            if (statusCode in 200..299) {
                return response
            }

            val headers = response.headers()
            val body = try {
                errorBodyHandler.handle(response)
            } finally {
                response.close()
            }

            throw when (statusCode) {
                400 -> BadRequestException.builder().headers(headers).body(body).build()
                401 -> UnauthorizedException.builder().headers(headers).body(body).build()
                403 -> PermissionDeniedException.builder().headers(headers).body(body).build()
                404 -> NotFoundException.builder().headers(headers).body(body).build()
                422 -> UnprocessableEntityException.builder().headers(headers).body(body).build()
                429 -> RateLimitException.builder().headers(headers).body(body).build()
                in 500..599 ->
                    InternalServerException.builder()
                        .statusCode(statusCode)
                        .headers(headers)
                        .body(body)
                        .build()
                else ->
                    UnexpectedStatusCodeException.builder()
                        .statusCode(statusCode)
                        .headers(headers)
                        .body(body)
                        .build()
            }
        }
    }
