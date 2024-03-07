@file:JvmName("Handlers")

package com.langsmith.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith.api.core.http.BinaryResponseContent
import com.langsmith.api.core.http.HttpResponse
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.BadRequestException
import com.langsmith.api.errors.InternalServerException
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.errors.LangSmithException
import com.langsmith.api.errors.NotFoundException
import com.langsmith.api.errors.PermissionDeniedException
import com.langsmith.api.errors.RateLimitException
import com.langsmith.api.errors.UnauthorizedException
import com.langsmith.api.errors.UnexpectedStatusCodeException
import com.langsmith.api.errors.UnprocessableEntityException
import java.io.InputStream
import java.io.OutputStream

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandler

private object EmptyHandler : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}

@JvmSynthetic internal fun stringHandler(): Handler<String> = StringHandler

@JvmSynthetic internal fun binaryHandler(): Handler<BinaryResponseContent> = BinaryHandler

private object StringHandler : Handler<String> {
    override fun handle(response: HttpResponse): String {
        return response.body().readBytes().toString(Charsets.UTF_8)
    }
}

private object BinaryHandler : Handler<BinaryResponseContent> {
    override fun handle(response: HttpResponse): BinaryResponseContent {
        return BinaryResponseContentImpl(response)
    }
}

@JvmSynthetic
internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> {
    return object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            try {
                return jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw LangSmithException("Error reading response", e)
            }
        }
    }
}

@JvmSynthetic
internal fun errorHandler(jsonMapper: JsonMapper): Handler<LangSmithError> {
    val handler = jsonHandler<LangSmithError>(jsonMapper)

    return object : Handler<LangSmithError> {
        override fun handle(response: HttpResponse): LangSmithError {
            try {
                return handler.handle(response)
            } catch (e: Exception) {
                return LangSmithError.builder().build()
            }
        }
    }
}

@JvmSynthetic
internal fun <T> Handler<T>.withErrorHandler(errorHandler: Handler<LangSmithError>): Handler<T> {
    return object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            when (val statusCode = response.statusCode()) {
                in 200..299 -> return this@withErrorHandler.handle(response)
                400 -> throw BadRequestException(response.headers(), errorHandler.handle(response))
                401 ->
                    throw UnauthorizedException(response.headers(), errorHandler.handle(response))
                403 ->
                    throw PermissionDeniedException(
                        response.headers(),
                        errorHandler.handle(response)
                    )
                404 -> throw NotFoundException(response.headers(), errorHandler.handle(response))
                422 ->
                    throw UnprocessableEntityException(
                        response.headers(),
                        errorHandler.handle(response)
                    )
                429 -> throw RateLimitException(response.headers(), errorHandler.handle(response))
                in 500..599 ->
                    throw InternalServerException(
                        statusCode,
                        response.headers(),
                        errorHandler.handle(response)
                    )
                else ->
                    throw UnexpectedStatusCodeException(
                        statusCode,
                        response.headers(),
                        StringHandler.handle(response)
                    )
            }
        }
    }
}

class BinaryResponseContentImpl
constructor(
    private val response: HttpResponse,
) : BinaryResponseContent {
    override fun contentType(): String? {
        return response.headers().get("Content-Type").firstOrNull()
    }

    override fun body(): InputStream {
        return response.body()
    }

    override fun writeTo(outputStream: OutputStream) {
        response.body().copyTo(outputStream)
    }

    override fun close() {
        response.body().close()
    }
}
