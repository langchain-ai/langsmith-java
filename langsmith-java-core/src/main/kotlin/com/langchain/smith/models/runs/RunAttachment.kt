package com.langchain.smith.models.runs

import java.io.ByteArrayInputStream
import java.io.InputStream
import java.util.Optional

/** Binary attachment data to send with `/runs/multipart` ingest. */
class RunAttachment
private constructor(
    private val contentType: String,
    private val data: Any,
    private val length: Long?,
    private val filename: String?,
) {

    fun contentType(): String = contentType

    fun data(): InputStream =
        when (val data = data) {
            is ByteArray -> ByteArrayInputStream(data)
            is InputStream -> data
            else -> error("Unexpected attachment data type: ${data::class.java}")
        }

    @JvmSynthetic internal fun multipartValue(): Any = data

    fun length(): Optional<Long> = Optional.ofNullable(length)

    fun filename(): Optional<String> = Optional.ofNullable(filename)

    fun toBuilder(): Builder = Builder().from(this)

    companion object {

        @JvmStatic
        fun of(contentType: String, data: ByteArray): RunAttachment =
            builder().contentType(contentType).data(data).build()

        @JvmStatic
        fun of(contentType: String, data: InputStream): RunAttachment =
            builder().contentType(contentType).data(data).build()

        @JvmStatic fun builder(): Builder = Builder()
    }

    class Builder internal constructor() {

        private var contentType: String? = null
        private var data: Any? = null
        private var length: Long? = null
        private var filename: String? = null

        @JvmSynthetic
        internal fun from(runAttachment: RunAttachment) = apply {
            contentType = runAttachment.contentType
            data = runAttachment.data
            length = runAttachment.length
            filename = runAttachment.filename
        }

        /** MIME type of the attachment, for example `text/plain` or `image/png`. */
        fun contentType(contentType: String) = apply { this.contentType = contentType }

        /** Attachment bytes. This sets [length] automatically. */
        fun data(data: ByteArray) = apply {
            this.data = data
            this.length = data.size.toLong()
        }

        /** Attachment stream. Prefer [data] with bytes for repeatable requests. */
        fun data(data: InputStream) = apply { this.data = data }

        /** Attachment byte length, if known. Included in the part content type for the ingester. */
        fun length(length: Long?) = apply { this.length = length }

        /** Alias for calling [Builder.length] with `length.orElse(null)`. */
        fun length(length: Optional<Long>) = length(length.orElse(null))

        /** Optional filename directive for the multipart part. */
        fun filename(filename: String?) = apply { this.filename = filename }

        /** Alias for calling [Builder.filename] with `filename.orElse(null)`. */
        fun filename(filename: Optional<String>) = filename(filename.orElse(null))

        fun build(): RunAttachment =
            RunAttachment(
                checkNotNull(contentType) { "`contentType` is required but was not set" },
                checkNotNull(data) { "`data` is required but was not set" },
                length,
                filename,
            )
    }
}
