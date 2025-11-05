// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.promptwebhooks

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

/** Schema for a prompt webhook. */
class PromptWebhook
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val tenantId: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val url: JsonField<String>,
    private val excludePrompts: JsonField<List<String>>,
    private val headers: JsonValue,
    private val includePrompts: JsonField<List<String>>,
    private val triggers: JsonField<List<EPromptWebhookTrigger>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("exclude_prompts")
        @ExcludeMissing
        excludePrompts: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("headers") @ExcludeMissing headers: JsonValue = JsonMissing.of(),
        @JsonProperty("include_prompts")
        @ExcludeMissing
        includePrompts: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("triggers")
        @ExcludeMissing
        triggers: JsonField<List<EPromptWebhookTrigger>> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        tenantId,
        updatedAt,
        url,
        excludePrompts,
        headers,
        includePrompts,
        triggers,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tenantId(): String = tenantId.getRequired("tenant_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun excludePrompts(): Optional<List<String>> = excludePrompts.getOptional("exclude_prompts")

    @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonValue = headers

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includePrompts(): Optional<List<String>> = includePrompts.getOptional("include_prompts")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun triggers(): Optional<List<EPromptWebhookTrigger>> = triggers.getOptional("triggers")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    /**
     * Returns the raw JSON value of [excludePrompts].
     *
     * Unlike [excludePrompts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exclude_prompts")
    @ExcludeMissing
    fun _excludePrompts(): JsonField<List<String>> = excludePrompts

    /**
     * Returns the raw JSON value of [includePrompts].
     *
     * Unlike [includePrompts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("include_prompts")
    @ExcludeMissing
    fun _includePrompts(): JsonField<List<String>> = includePrompts

    /**
     * Returns the raw JSON value of [triggers].
     *
     * Unlike [triggers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("triggers")
    @ExcludeMissing
    fun _triggers(): JsonField<List<EPromptWebhookTrigger>> = triggers

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
         * Returns a mutable builder for constructing an instance of [PromptWebhook].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .tenantId()
         * .updatedAt()
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PromptWebhook]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var tenantId: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var url: JsonField<String>? = null
        private var excludePrompts: JsonField<MutableList<String>>? = null
        private var headers: JsonValue = JsonMissing.of()
        private var includePrompts: JsonField<MutableList<String>>? = null
        private var triggers: JsonField<MutableList<EPromptWebhookTrigger>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(promptWebhook: PromptWebhook) = apply {
            id = promptWebhook.id
            createdAt = promptWebhook.createdAt
            tenantId = promptWebhook.tenantId
            updatedAt = promptWebhook.updatedAt
            url = promptWebhook.url
            excludePrompts = promptWebhook.excludePrompts.map { it.toMutableList() }
            headers = promptWebhook.headers
            includePrompts = promptWebhook.includePrompts.map { it.toMutableList() }
            triggers = promptWebhook.triggers.map { it.toMutableList() }
            additionalProperties = promptWebhook.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        fun excludePrompts(excludePrompts: List<String>?) =
            excludePrompts(JsonField.ofNullable(excludePrompts))

        /** Alias for calling [Builder.excludePrompts] with `excludePrompts.orElse(null)`. */
        fun excludePrompts(excludePrompts: Optional<List<String>>) =
            excludePrompts(excludePrompts.getOrNull())

        /**
         * Sets [Builder.excludePrompts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.excludePrompts] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun excludePrompts(excludePrompts: JsonField<List<String>>) = apply {
            this.excludePrompts = excludePrompts.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [excludePrompts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExcludePrompt(excludePrompt: String) = apply {
            excludePrompts =
                (excludePrompts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("excludePrompts", it).add(excludePrompt)
                }
        }

        fun headers(headers: JsonValue) = apply { this.headers = headers }

        fun includePrompts(includePrompts: List<String>?) =
            includePrompts(JsonField.ofNullable(includePrompts))

        /** Alias for calling [Builder.includePrompts] with `includePrompts.orElse(null)`. */
        fun includePrompts(includePrompts: Optional<List<String>>) =
            includePrompts(includePrompts.getOrNull())

        /**
         * Sets [Builder.includePrompts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includePrompts] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includePrompts(includePrompts: JsonField<List<String>>) = apply {
            this.includePrompts = includePrompts.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [includePrompts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIncludePrompt(includePrompt: String) = apply {
            includePrompts =
                (includePrompts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("includePrompts", it).add(includePrompt)
                }
        }

        fun triggers(triggers: List<EPromptWebhookTrigger>) = triggers(JsonField.of(triggers))

        /**
         * Sets [Builder.triggers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.triggers] with a well-typed
         * `List<EPromptWebhookTrigger>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun triggers(triggers: JsonField<List<EPromptWebhookTrigger>>) = apply {
            this.triggers = triggers.map { it.toMutableList() }
        }

        /**
         * Adds a single [EPromptWebhookTrigger] to [triggers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTrigger(trigger: EPromptWebhookTrigger) = apply {
            triggers =
                (triggers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("triggers", it).add(trigger)
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
         * Returns an immutable instance of [PromptWebhook].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .tenantId()
         * .updatedAt()
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PromptWebhook =
            PromptWebhook(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("tenantId", tenantId),
                checkRequired("updatedAt", updatedAt),
                checkRequired("url", url),
                (excludePrompts ?: JsonMissing.of()).map { it.toImmutable() },
                headers,
                (includePrompts ?: JsonMissing.of()).map { it.toImmutable() },
                (triggers ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PromptWebhook = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        tenantId()
        updatedAt()
        url()
        excludePrompts()
        includePrompts()
        triggers().ifPresent { it.forEach { it.validate() } }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0) +
            (excludePrompts.asKnown().getOrNull()?.size ?: 0) +
            (includePrompts.asKnown().getOrNull()?.size ?: 0) +
            (triggers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PromptWebhook &&
            id == other.id &&
            createdAt == other.createdAt &&
            tenantId == other.tenantId &&
            updatedAt == other.updatedAt &&
            url == other.url &&
            excludePrompts == other.excludePrompts &&
            headers == other.headers &&
            includePrompts == other.includePrompts &&
            triggers == other.triggers &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            tenantId,
            updatedAt,
            url,
            excludePrompts,
            headers,
            includePrompts,
            triggers,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PromptWebhook{id=$id, createdAt=$createdAt, tenantId=$tenantId, updatedAt=$updatedAt, url=$url, excludePrompts=$excludePrompts, headers=$headers, includePrompts=$includePrompts, triggers=$triggers, additionalProperties=$additionalProperties}"
}
