@file:JvmName("HttpRequestBodies")

package com.langsmith.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.langsmith.api.core.http.HttpRequestBody
import com.langsmith.api.errors.LangSmithException
import java.io.ByteArrayOutputStream
import java.io.OutputStream
import org.apache.hc.client5.http.entity.mime.MultipartEntityBuilder

@JvmSynthetic
internal inline fun <reified T> json(
    jsonMapper: JsonMapper,
    value: T,
): HttpRequestBody {
    return object : HttpRequestBody {
        private var cachedBytes: ByteArray? = null

        private fun serialize(): ByteArray {
            if (cachedBytes != null) return cachedBytes!!

            val buffer = ByteArrayOutputStream()
            try {
                jsonMapper.writeValue(buffer, value)
                cachedBytes = buffer.toByteArray()
                return cachedBytes!!
            } catch (e: Exception) {
                throw LangSmithException("Error writing request", e)
            }
        }

        override fun writeTo(outputStream: OutputStream) {
            outputStream.write(serialize())
        }

        override fun contentType(): String = "application/json"

        override fun contentLength(): Long {
            return serialize().size.toLong()
        }

        override fun repeatable(): Boolean = true

        override fun close() {}
    }
}

@JvmSynthetic
internal fun multipartFormData(
    files: Map<String, ByteArray>,
): HttpRequestBody {
    val builder = MultipartEntityBuilder.create()
    files.forEach { file, bytes -> builder.addBinaryBody(file, bytes) }
    val entity = builder.build()

    return object : HttpRequestBody {
        override fun writeTo(outputStream: OutputStream) {
            try {
                return entity.writeTo(outputStream)
            } catch (e: Exception) {
                throw LangSmithException("Error writing request", e)
            }
        }

        override fun contentType(): String = entity.contentType

        override fun contentLength(): Long = -1

        override fun repeatable(): Boolean = entity.isRepeatable

        override fun close() = entity.close()
    }
}
