package com.langchain.smith.core

import java.net.URI

internal fun requireSecureAuthUrl(url: String, description: String): String =
    url.also {
        require(isSecureAuthUrl(it)) {
            "$description must use https when sending credentials; http is only allowed for localhost."
        }
    }

internal fun isSecureAuthUrl(url: String): Boolean =
    runCatching {
            val uri = URI(url)
            when {
                uri.scheme.equals("https", ignoreCase = true) -> true
                uri.scheme.equals("http", ignoreCase = true) && uri.isLoopbackHost() -> true
                else -> false
            }
        }
        .getOrDefault(false)

private fun URI.isLoopbackHost(): Boolean {
    val normalizedHost = host?.trimEnd('.')?.lowercase() ?: return false
    return normalizedHost == "localhost" || normalizedHost == "127.0.0.1" || normalizedHost == "::1" ||
        normalizedHost == "[::1]"
}
