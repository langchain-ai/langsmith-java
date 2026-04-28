package com.langchain.smith.services

import com.github.luben.zstd.Zstd
import com.langchain.smith.models.annotationqueues.info.InfoListResponse
import kotlin.jvm.optionals.getOrNull

internal fun isRunCompressionDisabled(): Boolean =
    isTruish(System.getProperty("langchain.langsmithDisableRunCompression")) ||
        isTruish(System.getenv("LANGSMITH_DISABLE_RUN_COMPRESSION")) ||
        isTruish(System.getenv("DISABLE_RUN_COMPRESSION"))

internal fun isZstdAvailable(): Boolean = zstdAvailable

private val zstdAvailable: Boolean by lazy {
    try {
        Zstd.compress(byteArrayOf()).isNotEmpty()
    } catch (_: Throwable) {
        false
    }
}

internal fun isZstdCompressionEnabled(info: InfoListResponse): Boolean =
    info
        .instanceFlags()
        .getOrNull()
        ?._additionalProperties()
        ?.get("zstd_compression_enabled")
        ?.asBoolean()
        ?.getOrNull() == true

private val TRUISH_VALUES = setOf("1", "true", "t", "yes", "y", "on")

private fun isTruish(value: String?): Boolean = value?.trim()?.lowercase() in TRUISH_VALUES
