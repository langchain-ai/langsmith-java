package com.langchain.smith.tracing

import java.security.SecureRandom
import java.time.Instant
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter
import java.util.UUID

internal val ISO_FORMAT: DateTimeFormatter =
    DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'").withZone(ZoneOffset.UTC)

private val DOTTED_ORDER_STRIP = Regex("[-:.]")

private val secureRandom = SecureRandom()

/**
 * Generates a UUIDv7 from the given [Instant] — time-ordered with millisecond precision and random
 * lower bits.
 *
 * Layout (RFC 9562):
 * - bits 0-47: Unix timestamp in milliseconds (48 bits)
 * - bits 48-51: version `0111` (4 bits)
 * - bits 52-63: rand_a (12 random bits)
 * - bits 64-65: variant `10` (2 bits)
 * - bits 66-127: rand_b (62 random bits)
 */
internal fun uuidv7(time: Instant): String {
    val timestamp = time.toEpochMilli()
    val randomBytes = ByteArray(10) // 80 bits; we use 74 (12 + 62)
    secureRandom.nextBytes(randomBytes)

    val msb =
        ((timestamp and 0xFFFFFFFFFFFFL) shl 16) or // bits 0-47: timestamp
            0x7000L or // bits 48-51: version 7
            ((randomBytes[0].toLong() and 0x0F) shl 8) or // bits 52-55: rand_a high
            (randomBytes[1].toLong() and 0xFF) // bits 56-63: rand_a low

    val lsb =
        (0x2L shl 62) or // bits 64-65: variant 10
            ((randomBytes[2].toLong() and 0x3F) shl 56) or // bits 66-71: rand_b
            ((randomBytes[3].toLong() and 0xFF) shl 48) or
            ((randomBytes[4].toLong() and 0xFF) shl 40) or
            ((randomBytes[5].toLong() and 0xFF) shl 32) or
            ((randomBytes[6].toLong() and 0xFF) shl 24) or
            ((randomBytes[7].toLong() and 0xFF) shl 16) or
            ((randomBytes[8].toLong() and 0xFF) shl 8) or
            (randomBytes[9].toLong() and 0xFF)

    return UUID(msb, lsb).toString()
}

/** Creates a dotted order segment from an ISO timestamp and a run ID. */
internal fun dottedOrderSegment(time: String, id: String): String =
    time.replace(DOTTED_ORDER_STRIP, "") + id

internal fun nowIso(): String = ISO_FORMAT.format(Instant.now())
