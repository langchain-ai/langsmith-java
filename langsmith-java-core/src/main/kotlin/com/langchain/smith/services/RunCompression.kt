package com.langchain.smith.services

import com.github.luben.zstd.Zstd
import com.langchain.smith.models.info.InfoListResponse
import kotlin.jvm.optionals.getOrNull

internal fun isRunCompressionDisabled(): Boolean =
    isTruish(System.getenv("LANGSMITH_DISABLE_RUN_COMPRESSION"))

internal fun isZstdAvailable(): Boolean = zstdAvailable

internal fun shouldDefaultRunCompressionEnabled(): Boolean =
    !isRunCompressionDisabled() && isZstdAvailable()

private val zstdAvailable: Boolean by lazy {
    try {
        Zstd.compress(byteArrayOf()).isNotEmpty()
    } catch (_: Throwable) {
        false
    }
}

internal fun isZstdCompressionEnabled(info: InfoListResponse): Boolean =
    // Default on; the server must explicitly return false to disable compression.
    info
        .instanceFlags()
        .getOrNull()
        ?._additionalProperties()
        ?.get("zstd_compression_enabled")
        ?.asBoolean()
        ?.getOrNull() ?: true

private val TRUISH_VALUES = setOf("1", "true", "t", "yes", "y", "on")

private fun isTruish(value: String?): Boolean = value?.trim()?.lowercase() in TRUISH_VALUES
