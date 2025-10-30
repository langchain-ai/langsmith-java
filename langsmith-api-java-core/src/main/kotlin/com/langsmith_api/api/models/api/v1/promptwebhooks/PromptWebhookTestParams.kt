// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.promptwebhooks

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.Params
import com.langsmith_api.api.core.checkKnown
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.http.Headers
import com.langsmith_api.api.core.http.QueryParams
import com.langsmith_api.api.core.toImmutable
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Test a specific prompt webhook. */
class PromptWebhookTestParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun payload(): Payload = body.payload()

    /**
     * Base schema for prompt webhooks.
     *
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun webhook(): Webhook = body.webhook()

    /**
     * Returns the raw JSON value of [payload].
     *
     * Unlike [payload], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _payload(): JsonField<Payload> = body._payload()

    /**
     * Returns the raw JSON value of [webhook].
     *
     * Unlike [webhook], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _webhook(): JsonField<Webhook> = body._webhook()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PromptWebhookTestParams].
         *
         * The following fields are required:
         * ```java
         * .payload()
         * .webhook()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PromptWebhookTestParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(promptWebhookTestParams: PromptWebhookTestParams) = apply {
            body = promptWebhookTestParams.body.toBuilder()
            additionalHeaders = promptWebhookTestParams.additionalHeaders.toBuilder()
            additionalQueryParams = promptWebhookTestParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [payload]
         * - [webhook]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun payload(payload: Payload) = apply { body.payload(payload) }

        /**
         * Sets [Builder.payload] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payload] with a well-typed [Payload] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun payload(payload: JsonField<Payload>) = apply { body.payload(payload) }

        /** Base schema for prompt webhooks. */
        fun webhook(webhook: Webhook) = apply { body.webhook(webhook) }

        /**
         * Sets [Builder.webhook] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhook] with a well-typed [Webhook] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun webhook(webhook: JsonField<Webhook>) = apply { body.webhook(webhook) }

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
         * Returns an immutable instance of [PromptWebhookTestParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .payload()
         * .webhook()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PromptWebhookTestParams =
            PromptWebhookTestParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Schema for testing a prompt webhook. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val payload: JsonField<Payload>,
        private val webhook: JsonField<Webhook>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("payload") @ExcludeMissing payload: JsonField<Payload> = JsonMissing.of(),
            @JsonProperty("webhook") @ExcludeMissing webhook: JsonField<Webhook> = JsonMissing.of(),
        ) : this(payload, webhook, mutableMapOf())

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun payload(): Payload = payload.getRequired("payload")

        /**
         * Base schema for prompt webhooks.
         *
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun webhook(): Webhook = webhook.getRequired("webhook")

        /**
         * Returns the raw JSON value of [payload].
         *
         * Unlike [payload], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payload") @ExcludeMissing fun _payload(): JsonField<Payload> = payload

        /**
         * Returns the raw JSON value of [webhook].
         *
         * Unlike [webhook], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("webhook") @ExcludeMissing fun _webhook(): JsonField<Webhook> = webhook

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
             * .payload()
             * .webhook()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var payload: JsonField<Payload>? = null
            private var webhook: JsonField<Webhook>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                payload = body.payload
                webhook = body.webhook
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun payload(payload: Payload) = payload(JsonField.of(payload))

            /**
             * Sets [Builder.payload] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payload] with a well-typed [Payload] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payload(payload: JsonField<Payload>) = apply { this.payload = payload }

            /** Base schema for prompt webhooks. */
            fun webhook(webhook: Webhook) = webhook(JsonField.of(webhook))

            /**
             * Sets [Builder.webhook] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhook] with a well-typed [Webhook] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhook(webhook: JsonField<Webhook>) = apply { this.webhook = webhook }

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
             * .payload()
             * .webhook()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("payload", payload),
                    checkRequired("webhook", webhook),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            payload().validate()
            webhook().validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (payload.asKnown().getOrNull()?.validity() ?: 0) +
                (webhook.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                payload == other.payload &&
                webhook == other.webhook &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(payload, webhook, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{payload=$payload, webhook=$webhook, additionalProperties=$additionalProperties}"
    }

    class Payload
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val commitHash: JsonField<String>,
        private val createdAt: JsonField<String>,
        private val createdBy: JsonField<String>,
        private val event: JsonField<EPromptWebhookTrigger>,
        private val manifest: JsonValue,
        private val promptId: JsonField<String>,
        private val promptName: JsonField<String>,
        private val tagName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("commit_hash")
            @ExcludeMissing
            commitHash: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_by")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("event")
            @ExcludeMissing
            event: JsonField<EPromptWebhookTrigger> = JsonMissing.of(),
            @JsonProperty("manifest") @ExcludeMissing manifest: JsonValue = JsonMissing.of(),
            @JsonProperty("prompt_id")
            @ExcludeMissing
            promptId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("prompt_name")
            @ExcludeMissing
            promptName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tag_name") @ExcludeMissing tagName: JsonField<String> = JsonMissing.of(),
        ) : this(
            commitHash,
            createdAt,
            createdBy,
            event,
            manifest,
            promptId,
            promptName,
            tagName,
            mutableMapOf(),
        )

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun commitHash(): String = commitHash.getRequired("commit_hash")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): String = createdAt.getRequired("created_at")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdBy(): String = createdBy.getRequired("created_by")

        /**
         * Valid trigger types for prompt webhooks.
         *
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun event(): EPromptWebhookTrigger = event.getRequired("event")

        @JsonProperty("manifest") @ExcludeMissing fun _manifest(): JsonValue = manifest

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun promptId(): String = promptId.getRequired("prompt_id")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun promptName(): String = promptName.getRequired("prompt_name")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun tagName(): Optional<String> = tagName.getOptional("tag_name")

        /**
         * Returns the raw JSON value of [commitHash].
         *
         * Unlike [commitHash], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("commit_hash")
        @ExcludeMissing
        fun _commitHash(): JsonField<String> = commitHash

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

        /**
         * Returns the raw JSON value of [createdBy].
         *
         * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_by") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

        /**
         * Returns the raw JSON value of [event].
         *
         * Unlike [event], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("event")
        @ExcludeMissing
        fun _event(): JsonField<EPromptWebhookTrigger> = event

        /**
         * Returns the raw JSON value of [promptId].
         *
         * Unlike [promptId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prompt_id") @ExcludeMissing fun _promptId(): JsonField<String> = promptId

        /**
         * Returns the raw JSON value of [promptName].
         *
         * Unlike [promptName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prompt_name")
        @ExcludeMissing
        fun _promptName(): JsonField<String> = promptName

        /**
         * Returns the raw JSON value of [tagName].
         *
         * Unlike [tagName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tag_name") @ExcludeMissing fun _tagName(): JsonField<String> = tagName

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
             * Returns a mutable builder for constructing an instance of [Payload].
             *
             * The following fields are required:
             * ```java
             * .commitHash()
             * .createdAt()
             * .createdBy()
             * .event()
             * .manifest()
             * .promptId()
             * .promptName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Payload]. */
        class Builder internal constructor() {

            private var commitHash: JsonField<String>? = null
            private var createdAt: JsonField<String>? = null
            private var createdBy: JsonField<String>? = null
            private var event: JsonField<EPromptWebhookTrigger>? = null
            private var manifest: JsonValue? = null
            private var promptId: JsonField<String>? = null
            private var promptName: JsonField<String>? = null
            private var tagName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(payload: Payload) = apply {
                commitHash = payload.commitHash
                createdAt = payload.createdAt
                createdBy = payload.createdBy
                event = payload.event
                manifest = payload.manifest
                promptId = payload.promptId
                promptName = payload.promptName
                tagName = payload.tagName
                additionalProperties = payload.additionalProperties.toMutableMap()
            }

            fun commitHash(commitHash: String) = commitHash(JsonField.of(commitHash))

            /**
             * Sets [Builder.commitHash] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commitHash] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commitHash(commitHash: JsonField<String>) = apply { this.commitHash = commitHash }

            fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            /** Valid trigger types for prompt webhooks. */
            fun event(event: EPromptWebhookTrigger) = event(JsonField.of(event))

            /**
             * Sets [Builder.event] to an arbitrary JSON value.
             *
             * You should usually call [Builder.event] with a well-typed [EPromptWebhookTrigger]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun event(event: JsonField<EPromptWebhookTrigger>) = apply { this.event = event }

            fun manifest(manifest: JsonValue) = apply { this.manifest = manifest }

            fun promptId(promptId: String) = promptId(JsonField.of(promptId))

            /**
             * Sets [Builder.promptId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promptId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun promptId(promptId: JsonField<String>) = apply { this.promptId = promptId }

            fun promptName(promptName: String) = promptName(JsonField.of(promptName))

            /**
             * Sets [Builder.promptName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promptName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun promptName(promptName: JsonField<String>) = apply { this.promptName = promptName }

            fun tagName(tagName: String?) = tagName(JsonField.ofNullable(tagName))

            /** Alias for calling [Builder.tagName] with `tagName.orElse(null)`. */
            fun tagName(tagName: Optional<String>) = tagName(tagName.getOrNull())

            /**
             * Sets [Builder.tagName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tagName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tagName(tagName: JsonField<String>) = apply { this.tagName = tagName }

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
             * Returns an immutable instance of [Payload].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .commitHash()
             * .createdAt()
             * .createdBy()
             * .event()
             * .manifest()
             * .promptId()
             * .promptName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Payload =
                Payload(
                    checkRequired("commitHash", commitHash),
                    checkRequired("createdAt", createdAt),
                    checkRequired("createdBy", createdBy),
                    checkRequired("event", event),
                    checkRequired("manifest", manifest),
                    checkRequired("promptId", promptId),
                    checkRequired("promptName", promptName),
                    tagName,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Payload = apply {
            if (validated) {
                return@apply
            }

            commitHash()
            createdAt()
            createdBy()
            event().validate()
            promptId()
            promptName()
            tagName()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (commitHash.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (event.asKnown().getOrNull()?.validity() ?: 0) +
                (if (promptId.asKnown().isPresent) 1 else 0) +
                (if (promptName.asKnown().isPresent) 1 else 0) +
                (if (tagName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Payload &&
                commitHash == other.commitHash &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                event == other.event &&
                manifest == other.manifest &&
                promptId == other.promptId &&
                promptName == other.promptName &&
                tagName == other.tagName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                commitHash,
                createdAt,
                createdBy,
                event,
                manifest,
                promptId,
                promptName,
                tagName,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Payload{commitHash=$commitHash, createdAt=$createdAt, createdBy=$createdBy, event=$event, manifest=$manifest, promptId=$promptId, promptName=$promptName, tagName=$tagName, additionalProperties=$additionalProperties}"
    }

    /** Base schema for prompt webhooks. */
    class Webhook
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val url: JsonField<String>,
        private val excludePrompts: JsonField<List<String>>,
        private val headers: JsonValue,
        private val includePrompts: JsonField<List<String>>,
        private val triggers: JsonField<List<EPromptWebhookTrigger>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
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
        ) : this(url, excludePrompts, headers, includePrompts, triggers, mutableMapOf())

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun excludePrompts(): Optional<List<String>> = excludePrompts.getOptional("exclude_prompts")

        @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonValue = headers

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun includePrompts(): Optional<List<String>> = includePrompts.getOptional("include_prompts")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun triggers(): Optional<List<EPromptWebhookTrigger>> = triggers.getOptional("triggers")

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        /**
         * Returns the raw JSON value of [excludePrompts].
         *
         * Unlike [excludePrompts], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("exclude_prompts")
        @ExcludeMissing
        fun _excludePrompts(): JsonField<List<String>> = excludePrompts

        /**
         * Returns the raw JSON value of [includePrompts].
         *
         * Unlike [includePrompts], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * Returns a mutable builder for constructing an instance of [Webhook].
             *
             * The following fields are required:
             * ```java
             * .url()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Webhook]. */
        class Builder internal constructor() {

            private var url: JsonField<String>? = null
            private var excludePrompts: JsonField<MutableList<String>>? = null
            private var headers: JsonValue = JsonMissing.of()
            private var includePrompts: JsonField<MutableList<String>>? = null
            private var triggers: JsonField<MutableList<EPromptWebhookTrigger>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(webhook: Webhook) = apply {
                url = webhook.url
                excludePrompts = webhook.excludePrompts.map { it.toMutableList() }
                headers = webhook.headers
                includePrompts = webhook.includePrompts.map { it.toMutableList() }
                triggers = webhook.triggers.map { it.toMutableList() }
                additionalProperties = webhook.additionalProperties.toMutableMap()
            }

            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * You should usually call [Builder.excludePrompts] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.includePrompts] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * Returns an immutable instance of [Webhook].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .url()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Webhook =
                Webhook(
                    checkRequired("url", url),
                    (excludePrompts ?: JsonMissing.of()).map { it.toImmutable() },
                    headers,
                    (includePrompts ?: JsonMissing.of()).map { it.toImmutable() },
                    (triggers ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Webhook = apply {
            if (validated) {
                return@apply
            }

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
            } catch (e: LangsmithApiInvalidDataException) {
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
            (if (url.asKnown().isPresent) 1 else 0) +
                (excludePrompts.asKnown().getOrNull()?.size ?: 0) +
                (includePrompts.asKnown().getOrNull()?.size ?: 0) +
                (triggers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Webhook &&
                url == other.url &&
                excludePrompts == other.excludePrompts &&
                headers == other.headers &&
                includePrompts == other.includePrompts &&
                triggers == other.triggers &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
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
            "Webhook{url=$url, excludePrompts=$excludePrompts, headers=$headers, includePrompts=$includePrompts, triggers=$triggers, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PromptWebhookTestParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PromptWebhookTestParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
