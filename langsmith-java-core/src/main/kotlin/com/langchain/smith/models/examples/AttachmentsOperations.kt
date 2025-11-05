// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.examples

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AttachmentsOperations
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val rename: JsonField<Rename>,
    private val retain: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("rename") @ExcludeMissing rename: JsonField<Rename> = JsonMissing.of(),
        @JsonProperty("retain") @ExcludeMissing retain: JsonField<List<String>> = JsonMissing.of(),
    ) : this(rename, retain, mutableMapOf())

    /**
     * Mapping of old attachment names to new names
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rename(): Optional<Rename> = rename.getOptional("rename")

    /**
     * List of attachment names to keep
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun retain(): Optional<List<String>> = retain.getOptional("retain")

    /**
     * Returns the raw JSON value of [rename].
     *
     * Unlike [rename], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rename") @ExcludeMissing fun _rename(): JsonField<Rename> = rename

    /**
     * Returns the raw JSON value of [retain].
     *
     * Unlike [retain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("retain") @ExcludeMissing fun _retain(): JsonField<List<String>> = retain

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

        /** Returns a mutable builder for constructing an instance of [AttachmentsOperations]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AttachmentsOperations]. */
    class Builder internal constructor() {

        private var rename: JsonField<Rename> = JsonMissing.of()
        private var retain: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(attachmentsOperations: AttachmentsOperations) = apply {
            rename = attachmentsOperations.rename
            retain = attachmentsOperations.retain.map { it.toMutableList() }
            additionalProperties = attachmentsOperations.additionalProperties.toMutableMap()
        }

        /** Mapping of old attachment names to new names */
        fun rename(rename: Rename) = rename(JsonField.of(rename))

        /**
         * Sets [Builder.rename] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rename] with a well-typed [Rename] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rename(rename: JsonField<Rename>) = apply { this.rename = rename }

        /** List of attachment names to keep */
        fun retain(retain: List<String>) = retain(JsonField.of(retain))

        /**
         * Sets [Builder.retain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retain] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun retain(retain: JsonField<List<String>>) = apply {
            this.retain = retain.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.retain].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRetain(retain: String) = apply {
            this.retain =
                (this.retain ?: JsonField.of(mutableListOf())).also {
                    checkKnown("retain", it).add(retain)
                }
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
         * Returns an immutable instance of [AttachmentsOperations].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AttachmentsOperations =
            AttachmentsOperations(
                rename,
                (retain ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AttachmentsOperations = apply {
        if (validated) {
            return@apply
        }

        rename().ifPresent { it.validate() }
        retain()
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
        (rename.asKnown().getOrNull()?.validity() ?: 0) + (retain.asKnown().getOrNull()?.size ?: 0)

    /** Mapping of old attachment names to new names */
    class Rename
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

            /** Returns a mutable builder for constructing an instance of [Rename]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Rename]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rename: Rename) = apply {
                additionalProperties = rename.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Rename].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Rename = Rename(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Rename = apply {
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

            return other is Rename && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Rename{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AttachmentsOperations &&
            rename == other.rename &&
            retain == other.retain &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(rename, retain, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AttachmentsOperations{rename=$rename, retain=$retain, additionalProperties=$additionalProperties}"
}
