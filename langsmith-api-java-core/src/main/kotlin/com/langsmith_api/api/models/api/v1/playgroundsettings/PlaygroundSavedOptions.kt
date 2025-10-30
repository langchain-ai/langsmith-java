// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.playgroundsettings

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PlaygroundSavedOptions
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val requestsPerSecond: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("requests_per_second")
        @ExcludeMissing
        requestsPerSecond: JsonField<Long> = JsonMissing.of()
    ) : this(requestsPerSecond, mutableMapOf())

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun requestsPerSecond(): Optional<Long> = requestsPerSecond.getOptional("requests_per_second")

    /**
     * Returns the raw JSON value of [requestsPerSecond].
     *
     * Unlike [requestsPerSecond], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("requests_per_second")
    @ExcludeMissing
    fun _requestsPerSecond(): JsonField<Long> = requestsPerSecond

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

        /** Returns a mutable builder for constructing an instance of [PlaygroundSavedOptions]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PlaygroundSavedOptions]. */
    class Builder internal constructor() {

        private var requestsPerSecond: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(playgroundSavedOptions: PlaygroundSavedOptions) = apply {
            requestsPerSecond = playgroundSavedOptions.requestsPerSecond
            additionalProperties = playgroundSavedOptions.additionalProperties.toMutableMap()
        }

        fun requestsPerSecond(requestsPerSecond: Long?) =
            requestsPerSecond(JsonField.ofNullable(requestsPerSecond))

        /**
         * Alias for [Builder.requestsPerSecond].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun requestsPerSecond(requestsPerSecond: Long) =
            requestsPerSecond(requestsPerSecond as Long?)

        /** Alias for calling [Builder.requestsPerSecond] with `requestsPerSecond.orElse(null)`. */
        fun requestsPerSecond(requestsPerSecond: Optional<Long>) =
            requestsPerSecond(requestsPerSecond.getOrNull())

        /**
         * Sets [Builder.requestsPerSecond] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestsPerSecond] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requestsPerSecond(requestsPerSecond: JsonField<Long>) = apply {
            this.requestsPerSecond = requestsPerSecond
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
         * Returns an immutable instance of [PlaygroundSavedOptions].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PlaygroundSavedOptions =
            PlaygroundSavedOptions(requestsPerSecond, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): PlaygroundSavedOptions = apply {
        if (validated) {
            return@apply
        }

        requestsPerSecond()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LangsmithApiInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int = (if (requestsPerSecond.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlaygroundSavedOptions &&
            requestsPerSecond == other.requestsPerSecond &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(requestsPerSecond, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlaygroundSavedOptions{requestsPerSecond=$requestsPerSecond, additionalProperties=$additionalProperties}"
}
