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
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BoxBatchDeleteResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val deleted: JsonField<List<String>>,
    private val skipped: JsonField<List<Skipped>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("deleted")
        @ExcludeMissing
        deleted: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("skipped")
        @ExcludeMissing
        skipped: JsonField<List<Skipped>> = JsonMissing.of(),
    ) : this(deleted, skipped, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deleted(): Optional<List<String>> = deleted.getOptional("deleted")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun skipped(): Optional<List<Skipped>> = skipped.getOptional("skipped")

    /**
     * Returns the raw JSON value of [deleted].
     *
     * Unlike [deleted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deleted") @ExcludeMissing fun _deleted(): JsonField<List<String>> = deleted

    /**
     * Returns the raw JSON value of [skipped].
     *
     * Unlike [skipped], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("skipped") @ExcludeMissing fun _skipped(): JsonField<List<Skipped>> = skipped

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

        /** Returns a mutable builder for constructing an instance of [BoxBatchDeleteResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BoxBatchDeleteResponse]. */
    class Builder internal constructor() {

        private var deleted: JsonField<MutableList<String>>? = null
        private var skipped: JsonField<MutableList<Skipped>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(boxBatchDeleteResponse: BoxBatchDeleteResponse) = apply {
            deleted = boxBatchDeleteResponse.deleted.map { it.toMutableList() }
            skipped = boxBatchDeleteResponse.skipped.map { it.toMutableList() }
            additionalProperties = boxBatchDeleteResponse.additionalProperties.toMutableMap()
        }

        fun deleted(deleted: List<String>) = deleted(JsonField.of(deleted))

        /**
         * Sets [Builder.deleted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deleted] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deleted(deleted: JsonField<List<String>>) = apply {
            this.deleted = deleted.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.deleted].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDeleted(deleted: String) = apply {
            this.deleted =
                (this.deleted ?: JsonField.of(mutableListOf())).also {
                    checkKnown("deleted", it).add(deleted)
                }
        }

        fun skipped(skipped: List<Skipped>) = skipped(JsonField.of(skipped))

        /**
         * Sets [Builder.skipped] to an arbitrary JSON value.
         *
         * You should usually call [Builder.skipped] with a well-typed `List<Skipped>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun skipped(skipped: JsonField<List<Skipped>>) = apply {
            this.skipped = skipped.map { it.toMutableList() }
        }

        /**
         * Adds a single [Skipped] to [Builder.skipped].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSkipped(skipped: Skipped) = apply {
            this.skipped =
                (this.skipped ?: JsonField.of(mutableListOf())).also {
                    checkKnown("skipped", it).add(skipped)
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
         * Returns an immutable instance of [BoxBatchDeleteResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BoxBatchDeleteResponse =
            BoxBatchDeleteResponse(
                (deleted ?: JsonMissing.of()).map { it.toImmutable() },
                (skipped ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): BoxBatchDeleteResponse = apply {
        if (validated) {
            return@apply
        }

        deleted()
        skipped().ifPresent { it.forEach { it.validate() } }
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
        (deleted.asKnown().getOrNull()?.size ?: 0) +
            (skipped.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Skipped
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val reason: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
        ) : this(name, reason, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun reason(): Optional<String> = reason.getOptional("reason")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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

            /** Returns a mutable builder for constructing an instance of [Skipped]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Skipped]. */
        class Builder internal constructor() {

            private var name: JsonField<String> = JsonMissing.of()
            private var reason: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(skipped: Skipped) = apply {
                name = skipped.name
                reason = skipped.reason
                additionalProperties = skipped.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun reason(reason: String) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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
             * Returns an immutable instance of [Skipped].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Skipped = Skipped(name, reason, additionalProperties.toMutableMap())
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
        fun validate(): Skipped = apply {
            if (validated) {
                return@apply
            }

            name()
            reason()
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
            (if (name.asKnown().isPresent) 1 else 0) + (if (reason.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Skipped &&
                name == other.name &&
                reason == other.reason &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(name, reason, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Skipped{name=$name, reason=$reason, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BoxBatchDeleteResponse &&
            deleted == other.deleted &&
            skipped == other.skipped &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(deleted, skipped, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BoxBatchDeleteResponse{deleted=$deleted, skipped=$skipped, additionalProperties=$additionalProperties}"
}
