// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos.directories

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.BaseDeserializer
import com.langchain.smith.core.BaseSerializer
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@JsonDeserialize(using = DirectorySelector.Deserializer::class)
@JsonSerialize(using = DirectorySelector.Serializer::class)
class DirectorySelector
private constructor(
    private val latest: JsonValue? = null,
    private val commit: Commit? = null,
    private val _json: JsonValue? = null,
) {

    fun latest(): Optional<JsonValue> = Optional.ofNullable(latest)

    fun commit(): Optional<Commit> = Optional.ofNullable(commit)

    fun isLatest(): Boolean = latest != null

    fun isCommit(): Boolean = commit != null

    fun asLatest(): JsonValue = latest.getOrThrow("latest")

    fun asCommit(): Commit = commit.getOrThrow("commit")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```java
     * import com.langchain.smith.core.JsonValue;
     * import java.util.Optional;
     *
     * Optional<String> result = directorySelector.accept(new DirectorySelector.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitLatest(JsonValue latest) {
     *         return Optional.of(latest.toString());
     *     }
     *
     *     // ...
     *
     *     @Override
     *     public Optional<String> unknown(JsonValue json) {
     *         // Or inspect the `json`.
     *         return Optional.empty();
     *     }
     * });
     * ```
     *
     * @throws LangChainInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and
     *   the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            latest != null -> visitor.visitLatest(latest)
            commit != null -> visitor.visitCommit(commit)
            else -> visitor.unknown(_json)
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
    fun validate(): DirectorySelector = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitLatest(latest: JsonValue) {
                    latest.let {
                        if (it != JsonValue.from(mapOf("type" to "LATEST"))) {
                            throw LangChainInvalidDataException("'latest' is invalid, received $it")
                        }
                    }
                }

                override fun visitCommit(commit: Commit) {
                    commit.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitLatest(latest: JsonValue) =
                    latest.let { if (it == JsonValue.from(mapOf("type" to "LATEST"))) 1 else 0 }

                override fun visitCommit(commit: Commit) = commit.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DirectorySelector && latest == other.latest && commit == other.commit
    }

    override fun hashCode(): Int = Objects.hash(latest, commit)

    override fun toString(): String =
        when {
            latest != null -> "DirectorySelector{latest=$latest}"
            commit != null -> "DirectorySelector{commit=$commit}"
            _json != null -> "DirectorySelector{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid DirectorySelector")
        }

    companion object {

        @JvmStatic
        fun ofLatest() = DirectorySelector(latest = JsonValue.from(mapOf("type" to "LATEST")))

        @JvmStatic fun ofCommit(commit: Commit) = DirectorySelector(commit = commit)
    }

    /**
     * An interface that defines how to map each variant of [DirectorySelector] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitLatest(latest: JsonValue): T

        fun visitCommit(commit: Commit): T

        /**
         * Maps an unknown variant of [DirectorySelector] to a value of type [T].
         *
         * An instance of [DirectorySelector] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws LangChainInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LangChainInvalidDataException("Unknown DirectorySelector: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<DirectorySelector>(DirectorySelector::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): DirectorySelector {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

            when (type) {
                "LATEST" -> {
                    return tryDeserialize(node, jacksonTypeRef<JsonValue>())
                        ?.let { DirectorySelector(latest = it, _json = json) }
                        ?.takeIf { it.isValid() } ?: DirectorySelector(_json = json)
                }
                "COMMIT" -> {
                    return tryDeserialize(node, jacksonTypeRef<Commit>())?.let {
                        DirectorySelector(commit = it, _json = json)
                    } ?: DirectorySelector(_json = json)
                }
            }

            return DirectorySelector(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<DirectorySelector>(DirectorySelector::class) {

        override fun serialize(
            value: DirectorySelector,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.latest != null -> generator.writeObject(value.latest)
                value.commit != null -> generator.writeObject(value.commit)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid DirectorySelector")
            }
        }
    }

    class Commit
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val commitId: JsonField<String>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("commit_id")
            @ExcludeMissing
            commitId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(commitId, type, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun commitId(): String = commitId.getRequired("commit_id")

        /**
         * Expected to always return the following:
         * ```java
         * JsonValue.from("COMMIT")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [commitId].
         *
         * Unlike [commitId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("commit_id") @ExcludeMissing fun _commitId(): JsonField<String> = commitId

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
             * Returns a mutable builder for constructing an instance of [Commit].
             *
             * The following fields are required:
             * ```java
             * .commitId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Commit]. */
        class Builder internal constructor() {

            private var commitId: JsonField<String>? = null
            private var type: JsonValue = JsonValue.from("COMMIT")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(commit: Commit) = apply {
                commitId = commit.commitId
                type = commit.type
                additionalProperties = commit.additionalProperties.toMutableMap()
            }

            fun commitId(commitId: String) = commitId(JsonField.of(commitId))

            /**
             * Sets [Builder.commitId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commitId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commitId(commitId: JsonField<String>) = apply { this.commitId = commitId }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```java
             * JsonValue.from("COMMIT")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

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
             * Returns an immutable instance of [Commit].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .commitId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Commit =
                Commit(
                    checkRequired("commitId", commitId),
                    type,
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
        fun validate(): Commit = apply {
            if (validated) {
                return@apply
            }

            commitId()
            _type().let {
                if (it != JsonValue.from("COMMIT")) {
                    throw LangChainInvalidDataException("'type' is invalid, received $it")
                }
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
            (if (commitId.asKnown().isPresent) 1 else 0) +
                type.let { if (it == JsonValue.from("COMMIT")) 1 else 0 }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Commit &&
                commitId == other.commitId &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(commitId, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Commit{commitId=$commitId, type=$type, additionalProperties=$additionalProperties}"
    }
}
