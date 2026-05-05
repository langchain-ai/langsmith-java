// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos.directories

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class DirectoryListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val commitHash: JsonField<String>,
    private val commitId: JsonField<String>,
    private val files: JsonField<Files>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("commit_hash")
        @ExcludeMissing
        commitHash: JsonField<String> = JsonMissing.of(),
        @JsonProperty("commit_id") @ExcludeMissing commitId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("files") @ExcludeMissing files: JsonField<Files> = JsonMissing.of(),
    ) : this(commitHash, commitId, files, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commitHash(): Optional<String> = commitHash.getOptional("commit_hash")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commitId(): Optional<String> = commitId.getOptional("commit_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun files(): Optional<Files> = files.getOptional("files")

    /**
     * Returns the raw JSON value of [commitHash].
     *
     * Unlike [commitHash], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("commit_hash") @ExcludeMissing fun _commitHash(): JsonField<String> = commitHash

    /**
     * Returns the raw JSON value of [commitId].
     *
     * Unlike [commitId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("commit_id") @ExcludeMissing fun _commitId(): JsonField<String> = commitId

    /**
     * Returns the raw JSON value of [files].
     *
     * Unlike [files], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("files") @ExcludeMissing fun _files(): JsonField<Files> = files

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

        /** Returns a mutable builder for constructing an instance of [DirectoryListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DirectoryListResponse]. */
    class Builder internal constructor() {

        private var commitHash: JsonField<String> = JsonMissing.of()
        private var commitId: JsonField<String> = JsonMissing.of()
        private var files: JsonField<Files> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(directoryListResponse: DirectoryListResponse) = apply {
            commitHash = directoryListResponse.commitHash
            commitId = directoryListResponse.commitId
            files = directoryListResponse.files
            additionalProperties = directoryListResponse.additionalProperties.toMutableMap()
        }

        fun commitHash(commitHash: String) = commitHash(JsonField.of(commitHash))

        /**
         * Sets [Builder.commitHash] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commitHash] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun commitHash(commitHash: JsonField<String>) = apply { this.commitHash = commitHash }

        fun commitId(commitId: String) = commitId(JsonField.of(commitId))

        /**
         * Sets [Builder.commitId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commitId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun commitId(commitId: JsonField<String>) = apply { this.commitId = commitId }

        fun files(files: Files) = files(JsonField.of(files))

        /**
         * Sets [Builder.files] to an arbitrary JSON value.
         *
         * You should usually call [Builder.files] with a well-typed [Files] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun files(files: JsonField<Files>) = apply { this.files = files }

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
         * Returns an immutable instance of [DirectoryListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DirectoryListResponse =
            DirectoryListResponse(commitHash, commitId, files, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LangChainInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): DirectoryListResponse = apply {
        if (validated) {
            return@apply
        }

        commitHash()
        commitId()
        files().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (commitHash.asKnown().isPresent) 1 else 0) +
            (if (commitId.asKnown().isPresent) 1 else 0) +
            (files.asKnown().getOrNull()?.validity() ?: 0)

    class Files
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Files]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Files]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(files: Files) = apply {
                additionalProperties = files.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Files].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Files = Files(additionalProperties.toImmutable())
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
        fun validate(): Files = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Files && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Files{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DirectoryListResponse &&
            commitHash == other.commitHash &&
            commitId == other.commitId &&
            files == other.files &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(commitHash, commitId, files, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DirectoryListResponse{commitHash=$commitHash, commitId=$commitId, files=$files, additionalProperties=$additionalProperties}"
}
