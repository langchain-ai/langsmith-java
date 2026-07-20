package com.langchain.smith.core.http

internal val DEFAULT_REDACTED_HEADERS: Set<String> =
    setOf("authorization", "api-key", "x-api-key", "cookie", "set-cookie", "x-tenant-id")

internal fun isSensitiveHeader(name: String, redactedHeaders: Set<String> = DEFAULT_REDACTED_HEADERS): Boolean =
    redactedHeaders.any { it.equals(name, ignoreCase = true) }
