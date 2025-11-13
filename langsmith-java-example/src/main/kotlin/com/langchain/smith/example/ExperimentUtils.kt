package com.langchain.smith.example

import com.langchain.smith.models.datasets.Dataset
import java.nio.charset.StandardCharsets
import java.security.MessageDigest
import java.util.UUID

/**
 * Generate a deterministic UUID v5 based on namespace and name.
 * This ensures idempotent example creation - the same inputs always generate the same ID.
 */
fun generateUuid5(namespace: UUID, name: String): UUID {
    val nameBytes = name.toByteArray(StandardCharsets.UTF_8)
    val namespaceBytes = ByteArray(16)

    // Convert namespace UUID to bytes
    val bb = java.nio.ByteBuffer.wrap(namespaceBytes)
    bb.putLong(namespace.mostSignificantBits)
    bb.putLong(namespace.leastSignificantBits)

    // Combine namespace and name
    val combined = namespaceBytes + nameBytes

    // Hash using SHA-1 (UUID v5 uses SHA-1)
    val digest = MessageDigest.getInstance("SHA-1")
    val hash = digest.digest(combined)

    // Take first 16 bytes and set version/variant bits
    hash[6] = ((hash[6].toInt() and 0x0F) or 0x50).toByte() // Version 5
    hash[8] = ((hash[8].toInt() and 0x3F) or 0x80).toByte() // Variant

    // Convert to UUID
    val bb2 = java.nio.ByteBuffer.wrap(hash, 0, 16)
    return UUID(bb2.long, bb2.long)
}

/**
 * Generate a deterministic example ID based on dataset ID, inputs, and reference outputs.
 */
fun generateExampleId(datasetId: String, inputs: Map<String, Any>, referenceOutputs: Map<String, Any>): String {
    // Use DNS namespace UUID as per UUID v5 spec
    val namespace = UUID.fromString("6ba7b810-9dad-11d1-80b4-00c04fd430c8")

    // Create a stable string representation
    val inputsJson = inputs.entries.sortedBy { it.key }.joinToString(",") { "${it.key}:${it.value}" }
    val outputsJson = referenceOutputs.entries.sortedBy { it.key }.joinToString(",") { "${it.key}:${it.value}" }
    val name = "$datasetId-$inputsJson-$outputsJson"

    return generateUuid5(namespace, name).toString()
}

/**
 * Constructs the web URL for a dataset from the API base URL.
 */
fun buildDatasetUrl(dataset: Dataset): String {
    val baseUrl = System.getenv("LANGCHAIN_BASE_URL") ?: "https://api.smith.langchain.com"
    val hostUrl = baseUrl.replace("api.", "")
    return "$hostUrl/o/${dataset.tenantId()}/datasets/${dataset.id()}"
}

/**
 * Constructs the web URL for a session/experiment from the API base URL.
 */
fun buildSessionUrl(tenantId: String, sessionId: String): String {
    val baseUrl = System.getenv("LANGCHAIN_BASE_URL") ?: "https://api.smith.langchain.com"
    val hostUrl = baseUrl.replace("api.", "")
    return "$hostUrl/o/$tenantId/projects/p/$sessionId"
}
