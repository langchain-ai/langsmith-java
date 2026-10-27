// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.core

import com.fasterxml.jackson.databind.json.JsonMapper
import com.langchain.smith.core.http.StreamResponse
import com.langchain.smith.errors.LangChainInvalidDataException
import com.langchain.smith.models.QueryPatchOperation
import java.util.Optional
import java.util.stream.Stream
import kotlin.streams.asStream

/**
 * Yields the items of a streamed query and follows the next page cursor across pages.
 *
 * A page that only appends items (the initial document, then "<items>/-") yields each item as it
 * arrives. As soon as a page inserts at an index ("add <items>/<n>"), replaces or removes an item,
 * the position of an item is only known once the page's stream ends: the rest of that page is
 * yielded then, in final order. Items yielded before that point cannot be reordered, and replacing
 * or removing them is ignored. Patches deeper than one item ("<items>/<n>/<field>") are ignored.
 */
internal class QueryStreamingItems<T : Any>(
    private val type: Class<T>,
    private val jsonMapper: JsonMapper,
    private val itemsPath: String = "/items",
    private val nextCursorPath: String = "/next_cursor",
    private val fetch: (cursor: String?) -> StreamResponse<List<QueryPatchOperation>>,
) : StreamResponse<T> {

    private val itemPath = Regex(Regex.escape(itemsPath) + """/(-|\d+)""")

    @Volatile private var page: StreamResponse<List<QueryPatchOperation>>? = null
    @Volatile private var closed = false

    override fun stream(): Stream<T> =
        sequence {
                var cursor: String? = null
                do {
                    cursor = drainPage(cursor)
                } while (cursor != null)
            }
            .constrainOnce()
            .asStream()

    /** Yields every item of the page for [cursor] and returns the page's next cursor. */
    private suspend fun SequenceScope<T>.drainPage(cursor: String?): String? {
        if (closed) return null
        val current = fetch(cursor)
        page = current
        var next: String? = null
        // Items of the page in their final order, of which the first yielded were yielded.
        val items = mutableListOf<JsonValue>()
        var yielded = 0
        // Whether the page changes items by index, so that positions are only final at the end.
        var buffered = false
        try {
            for (event in current.stream()) {
                for (op in event) {
                    if (closed) return null
                    val path = op.path()
                    when {
                        path == "" -> {
                            while (items.size > yielded) items.removeAt(items.size - 1)
                            items.addAll(
                                document(op)[itemsPath.removePrefix("/")]
                                    ?.asArray()
                                    ?.orElse(emptyList()) ?: emptyList()
                            )
                        }
                        else -> {
                            val index = itemPath.matchEntire(path)?.groupValues?.get(1)
                            if (index == "-" && opName(op) == "add") {
                                items.add(op._value())
                            } else if (index != null && index != "-") {
                                val i = index.toIntOrNull()
                                when (opName(op)) {
                                    "add" -> {
                                        buffered = true
                                        items.add(
                                            maxOf(i ?: items.size, yielded)
                                                .coerceAtMost(items.size),
                                            op._value(),
                                        )
                                    }
                                    "replace" -> {
                                        buffered = true
                                        if (i != null && i >= yielded && i < items.size)
                                            items[i] = op._value()
                                    }
                                    "remove" -> {
                                        buffered = true
                                        if (i != null && i >= yielded && i < items.size)
                                            items.removeAt(i)
                                    }
                                }
                            }
                        }
                    }
                    cursorOf(op)?.let { next = it.orElse(null) }
                    while (!buffered && yielded < items.size) {
                        if (closed) return null
                        yield(convert(items[yielded++]))
                    }
                }
            }
        } finally {
            current.close()
            page = null
        }
        while (yielded < items.size) {
            if (closed) return null
            yield(convert(items[yielded++]))
        }
        return if (closed) null else next?.ifEmpty { null }
    }

    /** The JSON Patch operation name of [op], such as add. */
    private fun opName(op: QueryPatchOperation): String = op.op().toString()

    /** The next cursor [op] sets, or null when it does not set one. */
    private fun cursorOf(op: QueryPatchOperation): Optional<String>? =
        when (op.path()) {
            "" ->
                Optional.ofNullable(
                    document(op)[nextCursorPath.removePrefix("/")]?.asString()?.orElse(null)
                )
            nextCursorPath -> Optional.ofNullable(op._value().asString().orElse(null))
            else -> null
        }

    private fun document(op: QueryPatchOperation): Map<String, JsonValue> =
        op._value().asObject().orElse(emptyMap())

    private fun convert(value: JsonValue): T =
        try {
            jsonMapper.convertValue(value, type)
        } catch (e: Exception) {
            throw LangChainInvalidDataException("Error reading streamed item", e)
        }

    override fun close() {
        closed = true
        page?.close()
    }
}
