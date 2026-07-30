@file:JvmName("BaseUrls")

package com.langchain.smith.core

import java.net.URI

/**
 * Trailing path segments stripped from a configured base URL, longest first.
 *
 * Most generated request paths carry their own prefix (`api/v1/runs/query`, `v2/runs/query`), so
 * the base URL has to point at the deployment root. Users often configure `LANGSMITH_ENDPOINT` with
 * the suffixed URL the Python and JS SDKs accept (`https://api.smith.langchain.com/api/v1`), which
 * would otherwise double up.
 */
private val API_PATH_PREFIXES = listOf("/api/v1", "/api")

/**
 * Strips a trailing `/api/v1` or `/api` path segment from [baseUrl].
 *
 * Only whole trailing path segments of the parsed URL are considered, so a host such as
 * `api.example.com` is left alone, and the scheme and host are never rewritten. The result keeps a
 * trailing slash, matching [ClientOptions.PRODUCTION_URL]. A URL that cannot be parsed, that
 * carries a query or fragment, or that has no such suffix is returned unchanged.
 */
internal fun normalizeBaseUrl(baseUrl: String): String {
    val trimmed = baseUrl.trimEnd('/')
    val uri = runCatching { URI(trimmed) }.getOrNull() ?: return baseUrl
    if (uri.rawQuery != null || uri.rawFragment != null) {
        return baseUrl
    }
    val path = uri.rawPath ?: return baseUrl
    val prefix = API_PATH_PREFIXES.firstOrNull { path.endsWith(it) } ?: return baseUrl
    return trimmed.removeSuffix(prefix) + "/"
}

/**
 * Handwritten requests keep the base URL exactly as configured, via
 * [ClientOptions.configuredBaseUrl].
 *
 * `GET /info` and `POST /runs/multipart` are the only handwritten requests that build a URL from
 * the client base URL, and both are root-relative, so the prefix they sit behind comes from the
 * configured endpoint rather than from the request path. That prefix is deployment specific —
 * `/api` on self-hosted, nothing on SaaS — so it cannot be reconstructed from a normalized root.
 */
