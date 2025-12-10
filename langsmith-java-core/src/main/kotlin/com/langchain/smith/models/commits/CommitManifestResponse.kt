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
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response model for get_commit_manifest. */
class CommitManifestResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val commitHash: JsonField<String>,
    private val manifest: JsonField<Manifest>,
    private val examples: JsonField<List<Example>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("commit_hash")
        @ExcludeMissing
        commitHash: JsonField<String> = JsonMissing.of(),
        @JsonProperty("manifest") @ExcludeMissing manifest: JsonField<Manifest> = JsonMissing.of(),
        @JsonProperty("examples")
        @ExcludeMissing
        examples: JsonField<List<Example>> = JsonMissing.of(),
    ) : this(commitHash, manifest, examples, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun commitHash(): String = commitHash.getRequired("commit_hash")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun manifest(): Manifest = manifest.getRequired("manifest")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun examples(): Optional<List<Example>> = examples.getOptional("examples")

    /**
     * Returns the raw JSON value of [commitHash].
     *
     * Unlike [commitHash], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("commit_hash") @ExcludeMissing fun _commitHash(): JsonField<String> = commitHash

    /**
     * Returns the raw JSON value of [manifest].
     *
     * Unlike [manifest], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("manifest") @ExcludeMissing fun _manifest(): JsonField<Manifest> = manifest

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

        /**
         * Returns a mutable builder for constructing an instance of [CommitManifestResponse].
         *
         * The following fields are required:
         * ```java
         * .commitHash()
         * .manifest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommitManifestResponse]. */
    class Builder internal constructor() {

        private var commitHash: JsonField<String>? = null
        private var manifest: JsonField<Manifest>? = null
        private var examples: JsonField<MutableList<Example>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(commitManifestResponse: CommitManifestResponse) = apply {
            commitHash = commitManifestResponse.commitHash
            manifest = commitManifestResponse.manifest
            examples = commitManifestResponse.examples.map { it.toMutableList() }
            additionalProperties = commitManifestResponse.additionalProperties.toMutableMap()
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

        fun manifest(manifest: Manifest) = manifest(JsonField.of(manifest))

        /**
         * Sets [Builder.manifest] to an arbitrary JSON value.
         *
         * You should usually call [Builder.manifest] with a well-typed [Manifest] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun manifest(manifest: JsonField<Manifest>) = apply { this.manifest = manifest }

        fun examples(examples: List<Example>?) = examples(JsonField.ofNullable(examples))

        /** Alias for calling [Builder.examples] with `examples.orElse(null)`. */
        fun examples(examples: Optional<List<Example>>) = examples(examples.getOrNull())

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
         * Returns an immutable instance of [CommitManifestResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .commitHash()
         * .manifest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CommitManifestResponse =
            CommitManifestResponse(
                checkRequired("commitHash", commitHash),
                checkRequired("manifest", manifest),
                (examples ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CommitManifestResponse = apply {
        if (validated) {
            return@apply
        }

        commitHash()
        manifest().validate()
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
            (manifest.asKnown().getOrNull()?.validity() ?: 0) +
            (examples.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Manifest
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

            /** Returns a mutable builder for constructing an instance of [Manifest]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Manifest]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(manifest: Manifest) = apply {
                additionalProperties = manifest.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Manifest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Manifest = Manifest(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Manifest = apply {
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

            return other is Manifest && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Manifest{additionalProperties=$additionalProperties}"
    }

    /** Response model for example runs */
    class Example
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val sessionId: JsonField<String>,
        private val inputs: JsonField<Inputs>,
        private val outputs: JsonField<Outputs>,
        private val startTime: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("session_id")
            @ExcludeMissing
            sessionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inputs") @ExcludeMissing inputs: JsonField<Inputs> = JsonMissing.of(),
            @JsonProperty("outputs") @ExcludeMissing outputs: JsonField<Outputs> = JsonMissing.of(),
            @JsonProperty("start_time")
            @ExcludeMissing
            startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(id, sessionId, inputs, outputs, startTime, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sessionId(): String = sessionId.getRequired("session_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inputs(): Optional<Inputs> = inputs.getOptional("inputs")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun outputs(): Optional<Outputs> = outputs.getOptional("outputs")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

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
         * Returns the raw JSON value of [inputs].
         *
         * Unlike [inputs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("inputs") @ExcludeMissing fun _inputs(): JsonField<Inputs> = inputs

        /**
         * Returns the raw JSON value of [outputs].
         *
         * Unlike [outputs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("outputs") @ExcludeMissing fun _outputs(): JsonField<Outputs> = outputs

        /**
         * Returns the raw JSON value of [startTime].
         *
         * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_time")
        @ExcludeMissing
        fun _startTime(): JsonField<OffsetDateTime> = startTime

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
             * Returns a mutable builder for constructing an instance of [Example].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .sessionId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Example]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var sessionId: JsonField<String>? = null
            private var inputs: JsonField<Inputs> = JsonMissing.of()
            private var outputs: JsonField<Outputs> = JsonMissing.of()
            private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(example: Example) = apply {
                id = example.id
                sessionId = example.sessionId
                inputs = example.inputs
                outputs = example.outputs
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

            fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

            /**
             * Sets [Builder.sessionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

            fun inputs(inputs: Inputs?) = inputs(JsonField.ofNullable(inputs))

            /** Alias for calling [Builder.inputs] with `inputs.orElse(null)`. */
            fun inputs(inputs: Optional<Inputs>) = inputs(inputs.getOrNull())

            /**
             * Sets [Builder.inputs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputs] with a well-typed [Inputs] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputs(inputs: JsonField<Inputs>) = apply { this.inputs = inputs }

            fun outputs(outputs: Outputs?) = outputs(JsonField.ofNullable(outputs))

            /** Alias for calling [Builder.outputs] with `outputs.orElse(null)`. */
            fun outputs(outputs: Optional<Outputs>) = outputs(outputs.getOrNull())

            /**
             * Sets [Builder.outputs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputs] with a well-typed [Outputs] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputs(outputs: JsonField<Outputs>) = apply { this.outputs = outputs }

            fun startTime(startTime: OffsetDateTime?) = startTime(JsonField.ofNullable(startTime))

            /** Alias for calling [Builder.startTime] with `startTime.orElse(null)`. */
            fun startTime(startTime: Optional<OffsetDateTime>) = startTime(startTime.getOrNull())

            /**
             * Sets [Builder.startTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startTime(startTime: JsonField<OffsetDateTime>) = apply {
                this.startTime = startTime
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
             * Returns an immutable instance of [Example].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .sessionId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Example =
                Example(
                    checkRequired("id", id),
                    checkRequired("sessionId", sessionId),
                    inputs,
                    outputs,
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
            inputs().ifPresent { it.validate() }
            outputs().ifPresent { it.validate() }
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
                (inputs.asKnown().getOrNull()?.validity() ?: 0) +
                (outputs.asKnown().getOrNull()?.validity() ?: 0) +
                (if (startTime.asKnown().isPresent) 1 else 0)

        class Inputs
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

                /** Returns a mutable builder for constructing an instance of [Inputs]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Inputs]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inputs: Inputs) = apply {
                    additionalProperties = inputs.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Inputs].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Inputs = Inputs(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Inputs = apply {
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

                return other is Inputs && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Inputs{additionalProperties=$additionalProperties}"
        }

        class Outputs
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

                /** Returns a mutable builder for constructing an instance of [Outputs]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Outputs]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(outputs: Outputs) = apply {
                    additionalProperties = outputs.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Outputs].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Outputs = Outputs(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Outputs = apply {
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

                return other is Outputs && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Outputs{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Example &&
                id == other.id &&
                sessionId == other.sessionId &&
                inputs == other.inputs &&
                outputs == other.outputs &&
                startTime == other.startTime &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, sessionId, inputs, outputs, startTime, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Example{id=$id, sessionId=$sessionId, inputs=$inputs, outputs=$outputs, startTime=$startTime, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CommitManifestResponse &&
            commitHash == other.commitHash &&
            manifest == other.manifest &&
            examples == other.examples &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(commitHash, manifest, examples, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CommitManifestResponse{commitHash=$commitHash, manifest=$manifest, examples=$examples, additionalProperties=$additionalProperties}"
}
