// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create a snapshot by capturing the current state of a sandbox or promoting an existing
 * checkpoint.
 */
class BoxCreateSnapshotParams
private constructor(
    private val pathName: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun pathName(): Optional<String> = Optional.ofNullable(pathName)

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bodyName(): String = body.bodyName()

    /**
     * if omitted, creates a fresh checkpoint from the running VM
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun checkpoint(): Optional<String> = body.checkpoint()

    /**
     * sandbox-local Docker image to export
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dockerImage(): Optional<String> = body.dockerImage()

    /**
     * required for Docker image export unless the sandbox has a capacity
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fsCapacityBytes(): Optional<Long> = body.fsCapacityBytes()

    /**
     * IncludeMemory, when true, captures a full VM memory snapshot alongside the filesystem clone.
     * Only honored when the sandbox is running AND Checkpoint is omitted (i.e. a fresh in-VM
     * checkpoint is requested). Defaults to false to keep snapshots small unless memory restore is
     * explicitly desired.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeMemory(): Optional<Boolean> = body.includeMemory()

    /**
     * Returns the raw JSON value of [bodyName].
     *
     * Unlike [bodyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bodyName(): JsonField<String> = body._bodyName()

    /**
     * Returns the raw JSON value of [checkpoint].
     *
     * Unlike [checkpoint], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _checkpoint(): JsonField<String> = body._checkpoint()

    /**
     * Returns the raw JSON value of [dockerImage].
     *
     * Unlike [dockerImage], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dockerImage(): JsonField<String> = body._dockerImage()

    /**
     * Returns the raw JSON value of [fsCapacityBytes].
     *
     * Unlike [fsCapacityBytes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fsCapacityBytes(): JsonField<Long> = body._fsCapacityBytes()

    /**
     * Returns the raw JSON value of [includeMemory].
     *
     * Unlike [includeMemory], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _includeMemory(): JsonField<Boolean> = body._includeMemory()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BoxCreateSnapshotParams].
         *
         * The following fields are required:
         * ```java
         * .bodyName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BoxCreateSnapshotParams]. */
    class Builder internal constructor() {

        private var pathName: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(boxCreateSnapshotParams: BoxCreateSnapshotParams) = apply {
            pathName = boxCreateSnapshotParams.pathName
            body = boxCreateSnapshotParams.body.toBuilder()
            additionalHeaders = boxCreateSnapshotParams.additionalHeaders.toBuilder()
            additionalQueryParams = boxCreateSnapshotParams.additionalQueryParams.toBuilder()
        }

        fun pathName(pathName: String?) = apply { this.pathName = pathName }

        /** Alias for calling [Builder.pathName] with `pathName.orElse(null)`. */
        fun pathName(pathName: Optional<String>) = pathName(pathName.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [bodyName]
         * - [checkpoint]
         * - [dockerImage]
         * - [fsCapacityBytes]
         * - [includeMemory]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun bodyName(bodyName: String) = apply { body.bodyName(bodyName) }

        /**
         * Sets [Builder.bodyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bodyName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bodyName(bodyName: JsonField<String>) = apply { body.bodyName(bodyName) }

        /** if omitted, creates a fresh checkpoint from the running VM */
        fun checkpoint(checkpoint: String) = apply { body.checkpoint(checkpoint) }

        /**
         * Sets [Builder.checkpoint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.checkpoint] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun checkpoint(checkpoint: JsonField<String>) = apply { body.checkpoint(checkpoint) }

        /** sandbox-local Docker image to export */
        fun dockerImage(dockerImage: String) = apply { body.dockerImage(dockerImage) }

        /**
         * Sets [Builder.dockerImage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dockerImage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dockerImage(dockerImage: JsonField<String>) = apply { body.dockerImage(dockerImage) }

        /** required for Docker image export unless the sandbox has a capacity */
        fun fsCapacityBytes(fsCapacityBytes: Long) = apply { body.fsCapacityBytes(fsCapacityBytes) }

        /**
         * Sets [Builder.fsCapacityBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fsCapacityBytes] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fsCapacityBytes(fsCapacityBytes: JsonField<Long>) = apply {
            body.fsCapacityBytes(fsCapacityBytes)
        }

        /**
         * IncludeMemory, when true, captures a full VM memory snapshot alongside the filesystem
         * clone. Only honored when the sandbox is running AND Checkpoint is omitted (i.e. a fresh
         * in-VM checkpoint is requested). Defaults to false to keep snapshots small unless memory
         * restore is explicitly desired.
         */
        fun includeMemory(includeMemory: Boolean) = apply { body.includeMemory(includeMemory) }

        /**
         * Sets [Builder.includeMemory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeMemory] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeMemory(includeMemory: JsonField<Boolean>) = apply {
            body.includeMemory(includeMemory)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [BoxCreateSnapshotParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .bodyName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BoxCreateSnapshotParams =
            BoxCreateSnapshotParams(
                pathName,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> pathName ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val bodyName: JsonField<String>,
        private val checkpoint: JsonField<String>,
        private val dockerImage: JsonField<String>,
        private val fsCapacityBytes: JsonField<Long>,
        private val includeMemory: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing bodyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("checkpoint")
            @ExcludeMissing
            checkpoint: JsonField<String> = JsonMissing.of(),
            @JsonProperty("docker_image")
            @ExcludeMissing
            dockerImage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fs_capacity_bytes")
            @ExcludeMissing
            fsCapacityBytes: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("include_memory")
            @ExcludeMissing
            includeMemory: JsonField<Boolean> = JsonMissing.of(),
        ) : this(bodyName, checkpoint, dockerImage, fsCapacityBytes, includeMemory, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun bodyName(): String = bodyName.getRequired("name")

        /**
         * if omitted, creates a fresh checkpoint from the running VM
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun checkpoint(): Optional<String> = checkpoint.getOptional("checkpoint")

        /**
         * sandbox-local Docker image to export
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dockerImage(): Optional<String> = dockerImage.getOptional("docker_image")

        /**
         * required for Docker image export unless the sandbox has a capacity
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fsCapacityBytes(): Optional<Long> = fsCapacityBytes.getOptional("fs_capacity_bytes")

        /**
         * IncludeMemory, when true, captures a full VM memory snapshot alongside the filesystem
         * clone. Only honored when the sandbox is running AND Checkpoint is omitted (i.e. a fresh
         * in-VM checkpoint is requested). Defaults to false to keep snapshots small unless memory
         * restore is explicitly desired.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun includeMemory(): Optional<Boolean> = includeMemory.getOptional("include_memory")

        /**
         * Returns the raw JSON value of [bodyName].
         *
         * Unlike [bodyName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _bodyName(): JsonField<String> = bodyName

        /**
         * Returns the raw JSON value of [checkpoint].
         *
         * Unlike [checkpoint], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("checkpoint")
        @ExcludeMissing
        fun _checkpoint(): JsonField<String> = checkpoint

        /**
         * Returns the raw JSON value of [dockerImage].
         *
         * Unlike [dockerImage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("docker_image")
        @ExcludeMissing
        fun _dockerImage(): JsonField<String> = dockerImage

        /**
         * Returns the raw JSON value of [fsCapacityBytes].
         *
         * Unlike [fsCapacityBytes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fs_capacity_bytes")
        @ExcludeMissing
        fun _fsCapacityBytes(): JsonField<Long> = fsCapacityBytes

        /**
         * Returns the raw JSON value of [includeMemory].
         *
         * Unlike [includeMemory], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("include_memory")
        @ExcludeMissing
        fun _includeMemory(): JsonField<Boolean> = includeMemory

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .bodyName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var bodyName: JsonField<String>? = null
            private var checkpoint: JsonField<String> = JsonMissing.of()
            private var dockerImage: JsonField<String> = JsonMissing.of()
            private var fsCapacityBytes: JsonField<Long> = JsonMissing.of()
            private var includeMemory: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                bodyName = body.bodyName
                checkpoint = body.checkpoint
                dockerImage = body.dockerImage
                fsCapacityBytes = body.fsCapacityBytes
                includeMemory = body.includeMemory
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun bodyName(bodyName: String) = bodyName(JsonField.of(bodyName))

            /**
             * Sets [Builder.bodyName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bodyName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bodyName(bodyName: JsonField<String>) = apply { this.bodyName = bodyName }

            /** if omitted, creates a fresh checkpoint from the running VM */
            fun checkpoint(checkpoint: String) = checkpoint(JsonField.of(checkpoint))

            /**
             * Sets [Builder.checkpoint] to an arbitrary JSON value.
             *
             * You should usually call [Builder.checkpoint] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun checkpoint(checkpoint: JsonField<String>) = apply { this.checkpoint = checkpoint }

            /** sandbox-local Docker image to export */
            fun dockerImage(dockerImage: String) = dockerImage(JsonField.of(dockerImage))

            /**
             * Sets [Builder.dockerImage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dockerImage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dockerImage(dockerImage: JsonField<String>) = apply {
                this.dockerImage = dockerImage
            }

            /** required for Docker image export unless the sandbox has a capacity */
            fun fsCapacityBytes(fsCapacityBytes: Long) =
                fsCapacityBytes(JsonField.of(fsCapacityBytes))

            /**
             * Sets [Builder.fsCapacityBytes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fsCapacityBytes] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fsCapacityBytes(fsCapacityBytes: JsonField<Long>) = apply {
                this.fsCapacityBytes = fsCapacityBytes
            }

            /**
             * IncludeMemory, when true, captures a full VM memory snapshot alongside the filesystem
             * clone. Only honored when the sandbox is running AND Checkpoint is omitted (i.e. a
             * fresh in-VM checkpoint is requested). Defaults to false to keep snapshots small
             * unless memory restore is explicitly desired.
             */
            fun includeMemory(includeMemory: Boolean) = includeMemory(JsonField.of(includeMemory))

            /**
             * Sets [Builder.includeMemory] to an arbitrary JSON value.
             *
             * You should usually call [Builder.includeMemory] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun includeMemory(includeMemory: JsonField<Boolean>) = apply {
                this.includeMemory = includeMemory
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .bodyName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("bodyName", bodyName),
                    checkpoint,
                    dockerImage,
                    fsCapacityBytes,
                    includeMemory,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            bodyName()
            checkpoint()
            dockerImage()
            fsCapacityBytes()
            includeMemory()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangChainInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (bodyName.asKnown().isPresent) 1 else 0) +
                (if (checkpoint.asKnown().isPresent) 1 else 0) +
                (if (dockerImage.asKnown().isPresent) 1 else 0) +
                (if (fsCapacityBytes.asKnown().isPresent) 1 else 0) +
                (if (includeMemory.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                bodyName == other.bodyName &&
                checkpoint == other.checkpoint &&
                dockerImage == other.dockerImage &&
                fsCapacityBytes == other.fsCapacityBytes &&
                includeMemory == other.includeMemory &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                bodyName,
                checkpoint,
                dockerImage,
                fsCapacityBytes,
                includeMemory,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{bodyName=$bodyName, checkpoint=$checkpoint, dockerImage=$dockerImage, fsCapacityBytes=$fsCapacityBytes, includeMemory=$includeMemory, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BoxCreateSnapshotParams &&
            pathName == other.pathName &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(pathName, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BoxCreateSnapshotParams{pathName=$pathName, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
