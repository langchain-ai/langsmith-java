package com.langchain.smith.tracing

import java.time.Instant
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

/** Tests for the [uuidv7] utility. */
internal class Uuidv7Test {

    @Test
    fun embeds_timestamp_in_high_bits() {
        val time = Instant.parse("2026-03-26T20:11:20.557Z")
        val id = UUID.fromString(uuidv7(time))

        // Top 48 bits of the most-significant long encode the Unix epoch millis.
        val embeddedMillis = id.mostSignificantBits ushr 16
        assertThat(embeddedMillis).isEqualTo(time.toEpochMilli())
    }

    @Test
    fun sets_version_7() {
        val id = UUID.fromString(uuidv7(Instant.now()))
        assertThat(id.version()).isEqualTo(7)
    }

    @Test
    fun sets_rfc_variant() {
        val id = UUID.fromString(uuidv7(Instant.now()))
        // UUID.variant() returns 2 for the RFC 4122 / 9562 variant (bits 10xx).
        assertThat(id.variant()).isEqualTo(2)
    }

    @Test
    fun matches_known_prefix_for_fixed_time() {
        // The JS reference implementation produces "019d2bc5-dc6d-7..." for this instant.
        // The first 13 hex chars (timestamp + version nibble) are deterministic.
        val id = uuidv7(Instant.parse("2026-03-26T20:11:20.557Z"))
        assertThat(id).startsWith("019d2bc5-dc6d-7")
    }

    @Test
    fun produces_unique_ids_for_same_instant() {
        val time = Instant.now()
        val ids = (1..100).map { uuidv7(time) }.toSet()
        assertThat(ids).hasSize(100)
    }

    @Test
    fun ids_for_increasing_times_sort_lexicographically() {
        val base = Instant.parse("2025-01-01T00:00:00Z")
        val ids = (0L..9L).map { uuidv7(base.plusMillis(it * 100)) }
        assertThat(ids).isSorted()
    }
}
