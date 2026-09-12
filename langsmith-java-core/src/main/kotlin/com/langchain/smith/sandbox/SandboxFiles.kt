package com.langchain.smith.sandbox

import java.util.Optional

/** The result of writing a file into a sandbox. */
class UploadResult internal constructor(val path: String, val bytesWritten: Long) {

    override fun toString(): String = "UploadResult{path=$path, bytesWritten=$bytesWritten}"
}

/**
 * A single filesystem entry.
 *
 * [modifiedAt] is the RFC 3339 timestamp exactly as the sandbox reported it.
 */
class FileInfo
internal constructor(
    val path: String,
    val isDir: Boolean,
    val sizeBytes: Long,
    val modifiedAt: String,
) {

    override fun toString(): String =
        "FileInfo{path=$path, isDir=$isDir, sizeBytes=$sizeBytes, modifiedAt=$modifiedAt}"
}

/**
 * Finds files under [path] whose path relative to it matches [pattern].
 *
 * `**` matches any number of path segments; other wildcards match within a single segment, so a
 * bare `*` lists a directory's immediate entries.
 */
class GlobRequest
private constructor(val pattern: String, val path: String, private val limit: Int) {

    /** The cap on returned entries, if one was set. */
    fun limit(): Optional<Int> = if (limit > 0) Optional.of(limit) else Optional.empty()

    internal fun toBody(): Map<String, Any> = buildMap {
        put("pattern", pattern)
        put("path", path)
        if (limit > 0) put("limit", limit)
    }

    companion object {

        @JvmStatic fun builder(): Builder = Builder()

        @JvmStatic
        fun of(path: String, pattern: String): GlobRequest =
            builder().path(path).pattern(pattern).build()
    }

    class Builder internal constructor() {

        private var pattern: String? = null
        private var path: String? = null
        private var limit: Int = 0

        fun pattern(pattern: String) = apply { this.pattern = pattern }

        /** The absolute root path to search under. */
        fun path(path: String) = apply { this.path = path }

        fun limit(limit: Int) = apply {
            require(limit > 0) { "limit must be positive" }
            this.limit = limit
        }

        fun build(): GlobRequest =
            GlobRequest(
                checkNotNull(pattern) { "pattern is required" },
                requireAbsolutePath(checkNotNull(path) { "path is required" }),
                limit,
            )
    }
}

/**
 * Matched entries, ordered lexically by path.
 *
 * [isTruncated] is true when the limit or the sandbox's search deadline stopped the walk early, so
 * more entries may exist.
 */
class GlobResult internal constructor(val matches: List<FileInfo>, val isTruncated: Boolean) {

    override fun toString(): String =
        "GlobResult{matches=${matches.size}, isTruncated=$isTruncated}"
}

/**
 * Searches file contents under [path] for [pattern].
 *
 * [pattern] is matched as literal text, not as a regular expression.
 *
 * [glob], when set, restricts the search to matching files: a bare `*.py` matches by basename at
 * any depth, while a pattern containing `/` or `**` matches the path relative to [path].
 */
class GrepRequest
private constructor(
    val pattern: String,
    val path: String,
    private val glob: String?,
    private val limit: Int,
) {

    fun glob(): Optional<String> = Optional.ofNullable(glob)

    /** The cap on returned matches, if one was set. */
    fun limit(): Optional<Int> = if (limit > 0) Optional.of(limit) else Optional.empty()

    internal fun toBody(): Map<String, Any> = buildMap {
        put("pattern", pattern)
        put("path", path)
        glob?.let { put("glob", it) }
        if (limit > 0) put("limit", limit)
    }

    companion object {

        @JvmStatic fun builder(): Builder = Builder()

        @JvmStatic
        fun of(path: String, pattern: String): GrepRequest =
            builder().path(path).pattern(pattern).build()
    }

    class Builder internal constructor() {

        private var pattern: String? = null
        private var path: String? = null
        private var glob: String? = null
        private var limit: Int = 0

        /** The literal text to search for. Not a regular expression. */
        fun pattern(pattern: String) = apply { this.pattern = pattern }

        /** The absolute root path to search under. */
        fun path(path: String) = apply { this.path = path }

        fun glob(glob: String) = apply { this.glob = glob }

        fun limit(limit: Int) = apply {
            require(limit > 0) { "limit must be positive" }
            this.limit = limit
        }

        fun build(): GrepRequest =
            GrepRequest(
                checkNotNull(pattern) { "pattern is required" },
                requireAbsolutePath(checkNotNull(path) { "path is required" }),
                glob,
                limit,
            )
    }
}

/** A single matching line. [line] is 1-based. */
class GrepMatch internal constructor(val path: String, val line: Int, val text: String) {

    override fun toString(): String = "$path:$line: $text"
}

/**
 * Matched lines.
 *
 * [isTruncated] is true when the limit or the sandbox's search deadline stopped the walk early, so
 * more matches may exist.
 */
class GrepResult internal constructor(val matches: List<GrepMatch>, val isTruncated: Boolean) {

    override fun toString(): String =
        "GrepResult{matches=${matches.size}, isTruncated=$isTruncated}"
}

private fun requireAbsolutePath(path: String): String {
    require(path.startsWith("/")) { "path must be absolute, got '$path'" }
    return path
}
