package com.langchain.smith.sandbox

import com.fasterxml.jackson.databind.JsonNode
import com.langchain.smith.core.http.HttpMethod

/** Filesystem operations against one sandbox. */
internal class SandboxFileOps(private val http: SandboxHttp) {

    fun readFile(sandboxId: String, path: String): ByteArray =
        http.sendForBytes(
            http
                .request(HttpMethod.GET, sandboxId, "download")
                .putQueryParam("path", path)
                .replaceHeaders("Accept", "application/octet-stream")
                .build()
        )

    fun writeFile(sandboxId: String, path: String, content: ByteArray): UploadResult {
        val payload =
            http.sendForJson(
                http
                    .request(HttpMethod.POST, sandboxId, "upload")
                    .putQueryParam("path", path)
                    .body(http.multipartBody("file", "file", content))
                    .build(),
                "upload response",
            )
        return UploadResult(payload.path("path").asText(path), payload.path("written").asLong(0))
    }

    fun glob(sandboxId: String, request: GlobRequest): GlobResult {
        val payload =
            http.sendForJson(
                http
                    .request(HttpMethod.POST, sandboxId, "glob")
                    .body(http.jsonBody(request.toBody()))
                    .build(),
                "glob response",
            )
        return GlobResult(
            payload.path("matches").map { fileInfo(it) },
            payload.path("truncated").asBoolean(false),
        )
    }

    fun grep(sandboxId: String, request: GrepRequest): GrepResult {
        val payload =
            http.sendForJson(
                http
                    .request(HttpMethod.POST, sandboxId, "grep")
                    .body(http.jsonBody(request.toBody()))
                    .build(),
                "grep response",
            )
        return GrepResult(
            payload.path("matches").map { grepMatch(it) },
            payload.path("truncated").asBoolean(false),
        )
    }

    private fun fileInfo(node: JsonNode): FileInfo =
        FileInfo(
            node.path("path").asText(""),
            node.path("is_dir").asBoolean(false),
            node.path("size_bytes").asLong(0),
            node.path("modified_at").asText(""),
        )

    private fun grepMatch(node: JsonNode): GrepMatch =
        GrepMatch(
            node.path("path").asText(""),
            node.path("line").asInt(0),
            node.path("text").asText(""),
        )
}
