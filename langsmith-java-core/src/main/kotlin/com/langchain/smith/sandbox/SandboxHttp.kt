package com.langchain.smith.sandbox

import com.fasterxml.jackson.core.JacksonException
import com.fasterxml.jackson.databind.JsonNode
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.Sleeper
import com.langchain.smith.core.http.HttpClient
import com.langchain.smith.core.http.HttpMethod
import com.langchain.smith.core.http.HttpRequest
import com.langchain.smith.core.http.HttpRequestBody
import com.langchain.smith.core.http.HttpResponse
import java.io.OutputStream
import java.util.UUID

/** Request building, JSON handling, and error mapping shared by the sandbox operations. */
internal class SandboxHttp(private val clientOptions: ClientOptions) {

    val httpClient: HttpClient
        get() = clientOptions.httpClient

    val sleeper: Sleeper
        get() = clientOptions.sleeper

    /**
     * A request to one sandbox's instance-op routes.
     *
     * These carry their own `/api/v2` prefix, exactly as the generated sandbox services do, so they
     * are built on the *normalized* [ClientOptions.baseUrl], which points at the deployment root.
     * Do not switch this to `configuredBaseUrl`: that exists for the handwritten requests that are
     * root-relative and need whatever prefix the user configured, and using it here would double
     * the prefix for anyone whose endpoint ends in `/api`.
     */
    fun request(method: HttpMethod, sandboxId: String, vararg path: String): HttpRequest.Builder =
        HttpRequest.builder()
            .method(method)
            .baseUrl(clientOptions.baseUrl())
            .addPathSegments("api", "v2", "sandboxes", sandboxId)
            .apply { path.forEach { addPathSegment(it) } }
            .putAllHeaders(clientOptions.headers)

    fun jsonBody(value: Any): HttpRequestBody =
        bytesBody(clientOptions.jsonMapper.writeValueAsBytes(value), "application/json")

    /**
     * A `multipart/form-data` body with [content] as the sole part.
     *
     * Hand-rolled because the SDK's own multipart helper is internal to its module.
     */
    fun multipartBody(fieldName: String, filename: String, content: ByteArray): HttpRequestBody {
        val boundary = "----LangSmithSandboxBoundary${UUID.randomUUID()}"
        val preamble =
            ("--$boundary\r\n" +
                    "Content-Disposition: form-data; name=\"$fieldName\";" +
                    " filename=\"$filename\"\r\n" +
                    "Content-Type: application/octet-stream\r\n\r\n")
                .toByteArray(Charsets.UTF_8)
        val epilogue = "\r\n--$boundary--\r\n".toByteArray(Charsets.UTF_8)

        return object : HttpRequestBody {
            override fun writeTo(outputStream: OutputStream) {
                outputStream.write(preamble)
                outputStream.write(content)
                outputStream.write(epilogue)
            }

            override fun contentType(): String = "multipart/form-data; boundary=$boundary"

            override fun contentLength(): Long =
                (preamble.size + content.size + epilogue.size).toLong()

            override fun repeatable(): Boolean = true

            override fun close() {}
        }
    }

    private fun bytesBody(bytes: ByteArray, contentType: String): HttpRequestBody =
        object : HttpRequestBody {
            override fun writeTo(outputStream: OutputStream) = outputStream.write(bytes)

            override fun contentType(): String = contentType

            override fun contentLength(): Long = bytes.size.toLong()

            override fun repeatable(): Boolean = true

            override fun close() {}
        }

    /** Sends [request], returning the parsed JSON body, and mapping any error status. */
    fun sendForJson(request: HttpRequest, what: String): JsonNode =
        httpClient.execute(request, RequestOptions.none()).use { response ->
            requireOk(response)
            parse(String(response.body().readBytes(), Charsets.UTF_8), what)
        }

    /** Sends [request], returning the raw body, and mapping any error status. */
    fun sendForBytes(request: HttpRequest): ByteArray =
        httpClient.execute(request, RequestOptions.none()).use { response ->
            requireOk(response)
            response.body().readBytes()
        }

    fun requireOk(response: HttpResponse) {
        if (response.statusCode() !in 200..299) {
            throw errorFor(response)
        }
    }

    fun parse(data: String, what: String): JsonNode =
        try {
            clientOptions.jsonMapper.readTree(data)
        } catch (e: JacksonException) {
            throw SandboxProtocolException("sandbox sent a malformed $what: ${e.message}")
        }

    fun errorFor(response: HttpResponse): SandboxException {
        val message = messageFor(response)
        return when (response.statusCode()) {
            404 -> SandboxNotFoundException(message)
            else -> SandboxApiException(response.statusCode(), message)
        }
    }

    /** Consumes the response body and returns the best error message it carries. */
    fun messageFor(response: HttpResponse): String {
        val body =
            runCatching { String(response.body().readBytes(), Charsets.UTF_8) }.getOrDefault("")
        return detailMessage(body) ?: body
    }

    private fun detailMessage(body: String): String? {
        if (body.isEmpty()) {
            return null
        }
        val detail =
            try {
                clientOptions.jsonMapper.readTree(body).path("detail")
            } catch (e: JacksonException) {
                return null
            }
        val message = detail.path("message").asText("")
        val error = detail.path("error").asText("")
        return when {
            message.isNotEmpty() && error.isNotEmpty() -> "$error: $message"
            message.isNotEmpty() -> message
            error.isNotEmpty() -> error
            else -> null
        }
    }
}
