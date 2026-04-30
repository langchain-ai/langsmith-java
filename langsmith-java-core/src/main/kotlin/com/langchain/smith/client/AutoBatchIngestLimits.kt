package com.langchain.smith.client

import com.langchain.smith.models.info.InfoListResponse.BatchIngestConfig
import kotlin.jvm.optionals.getOrNull

internal data class AutoBatchIngestLimits(
    val batchSizeLimit: Int = AutoBatchQueue.DEFAULT_BATCH_SIZE_LIMIT,
    val batchSizeLimitBytes: Int = AutoBatchQueue.DEFAULT_BATCH_SIZE_LIMIT_BYTES,
    val useMultipartEndpoint: Boolean = true,
)

internal fun BatchIngestConfig?.toAutoBatchIngestLimits(): AutoBatchIngestLimits =
    AutoBatchIngestLimits(
        batchSizeLimit =
            this?.sizeLimit()?.getOrNull()?.takeIf { it > 0 && it <= Int.MAX_VALUE }?.toInt()
                ?: AutoBatchQueue.DEFAULT_BATCH_SIZE_LIMIT,
        batchSizeLimitBytes =
            this?.sizeLimitBytes()?.getOrNull()?.takeIf { it > 0 && it <= Int.MAX_VALUE }?.toInt()
                ?: AutoBatchQueue.DEFAULT_BATCH_SIZE_LIMIT_BYTES,
        useMultipartEndpoint = this?.useMultipartEndpoint()?.getOrNull() ?: true,
    )
