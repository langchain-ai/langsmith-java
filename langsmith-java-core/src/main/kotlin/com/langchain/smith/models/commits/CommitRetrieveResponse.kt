// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.commits

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

class CommitRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val commitHash: JsonField<String>,
    private val examples: JsonField<List<Example>>,
    private val manifest: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("commit_hash")
        @ExcludeMissing
        commitHash: JsonField<String> = JsonMissing.of(),
        @JsonProperty("examples")
        @ExcludeMissing
        examples: JsonField<List<Example>> = JsonMissing.of(),
        @JsonProperty("manifest") @ExcludeMissing manifest: JsonValue = JsonMissing.of(),
    ) : this(commitHash, examples, manifest, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commitHash(): Optional<String> = commitHash.getOptional("commit_hash")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun examples(): Optional<List<Example>> = examples.getOptional("examples")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = commitRetrieveResponse.manifest().convert(MyClass.class);
     * ```
     */
    @JsonProperty("manifest") @ExcludeMissing fun _manifest(): JsonValue = manifest

    /**
     * Returns the raw JSON value of [commitHash].
     *
     * Unlike [commitHash], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("commit_hash") @ExcludeMissing fun _commitHash(): JsonField<String> = commitHash

    /**
     * Returns the raw JSON value of [examples].
     *
     * Unlike [examples], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("examples") @ExcludeMissing fun _examples(): JsonField<List<Example>> = examples

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

        /** Returns a mutable builder for constructing an instance of [CommitRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommitRetrieveResponse]. */
    class Builder internal constructor() {

        private var commitHash: JsonField<String> = JsonMissing.of()
        private var examples: JsonField<MutableList<Example>>? = null
        private var manifest: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(commitRetrieveResponse: CommitRetrieveResponse) = apply {
            commitHash = commitRetrieveResponse.commitHash
            examples = commitRetrieveResponse.examples.map { it.toMutableList() }
            manifest = commitRetrieveResponse.manifest
            additionalProperties = commitRetrieveResponse.additionalProperties.toMutableMap()
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

        fun examples(examples: List<Example>) = examples(JsonField.of(examples))

        /**
         * Sets [Builder.examples] to an arbitrary JSON value.
         *
         * You should usually call [Builder.examples] with a well-typed `List<Example>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun examples(examples: JsonField<List<Example>>) = apply {
            this.examples = examples.map { it.toMutableList() }
        }

        /**
         * Adds a single [Example] to [examples].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExample(example: Example) = apply {
            examples =
                (examples ?: JsonField.of(mutableListOf())).also {
                    checkKnown("examples", it).add(example)
                }
        }

        fun manifest(manifest: JsonValue) = apply { this.manifest = manifest }

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
         * Returns an immutable instance of [CommitRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CommitRetrieveResponse =
            CommitRetrieveResponse(
                commitHash,
                (examples ?: JsonMissing.of()).map { it.toImmutable() },
                manifest,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CommitRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        commitHash()
        examples().ifPresent { it.forEach { it.validate() } }
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
            (examples.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Example
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val inputs: JsonValue,
        private val outputs: JsonValue,
        private val sessionId: JsonField<String>,
        private val startTime: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inputs") @ExcludeMissing inputs: JsonValue = JsonMissing.of(),
            @JsonProperty("outputs") @ExcludeMissing outputs: JsonValue = JsonMissing.of(),
            @JsonProperty("session_id")
            @ExcludeMissing
            sessionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start_time")
            @ExcludeMissing
            startTime: JsonField<String> = JsonMissing.of(),
        ) : this(id, inputs, outputs, sessionId, startTime, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = example.inputs().convert(MyClass.class);
         * ```
         */
        @JsonProperty("inputs") @ExcludeMissing fun _inputs(): JsonValue = inputs

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = example.outputs().convert(MyClass.class);
         * ```
         */
        @JsonProperty("outputs") @ExcludeMissing fun _outputs(): JsonValue = outputs

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sessionId(): Optional<String> = sessionId.getOptional("session_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startTime(): Optional<String> = startTime.getOptional("start_time")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [sessionId].
         *
         * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

        /**
         * Returns the raw JSON value of [startTime].
         *
         * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_time") @ExcludeMissing fun _startTime(): JsonField<String> = startTime

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

            /** Returns a mutable builder for constructing an instance of [Example]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Example]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var inputs: JsonValue = JsonMissing.of()
            private var outputs: JsonValue = JsonMissing.of()
            private var sessionId: JsonField<String> = JsonMissing.of()
            private var startTime: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(example: Example) = apply {
                id = example.id
                inputs = example.inputs
                outputs = example.outputs
                sessionId = example.sessionId
                startTime = example.startTime
                additionalProperties = example.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun inputs(inputs: JsonValue) = apply { this.inputs = inputs }

            fun outputs(outputs: JsonValue) = apply { this.outputs = outputs }

            fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

            /**
             * Sets [Builder.sessionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

            fun startTime(startTime: String) = startTime(JsonField.of(startTime))

            /**
             * Sets [Builder.startTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startTime] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startTime(startTime: JsonField<String>) = apply { this.startTime = startTime }

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
             * Returns an immutable instance of [Example].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Example =
                Example(
                    id,
                    inputs,
                    outputs,
                    sessionId,
                    startTime,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Example = apply {
            if (validated) {
                return@apply
            }

            id()
            sessionId()
            startTime()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (sessionId.asKnown().isPresent) 1 else 0) +
                (if (startTime.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Example &&
                id == other.id &&
                inputs == other.inputs &&
                outputs == other.outputs &&
                sessionId == other.sessionId &&
                startTime == other.startTime &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, inputs, outputs, sessionId, startTime, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Example{id=$id, inputs=$inputs, outputs=$outputs, sessionId=$sessionId, startTime=$startTime, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CommitRetrieveResponse &&
            commitHash == other.commitHash &&
            examples == other.examples &&
            manifest == other.manifest &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(commitHash, examples, manifest, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CommitRetrieveResponse{commitHash=$commitHash, examples=$examples, manifest=$manifest, additionalProperties=$additionalProperties}"
}
