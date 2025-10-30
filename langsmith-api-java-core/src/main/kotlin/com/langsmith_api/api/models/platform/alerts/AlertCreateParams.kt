// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.platform.alerts

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

/**
 * Creates a new alert rule. The request body must be a JSON-encoded alert rule object that follows
 * the CreateAlertRuleRequest schema.
 */
class AlertCreateParams
private constructor(
    private val sessionId: JsonValue?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun sessionId(): Optional<JsonValue> = Optional.ofNullable(sessionId)

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actions(): List<AlertActionBase> = body.actions()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rule(): AlertRuleBase = body.rule()

    /**
     * Returns the raw JSON value of [actions].
     *
     * Unlike [actions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _actions(): JsonField<List<AlertActionBase>> = body._actions()

    /**
     * Returns the raw JSON value of [rule].
     *
     * Unlike [rule], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rule(): JsonField<AlertRuleBase> = body._rule()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AlertCreateParams].
         *
         * The following fields are required:
         * ```java
         * .actions()
         * .rule()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AlertCreateParams]. */
    class Builder internal constructor() {

        private var sessionId: JsonValue? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(alertCreateParams: AlertCreateParams) = apply {
            sessionId = alertCreateParams.sessionId
            body = alertCreateParams.body.toBuilder()
            additionalHeaders = alertCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = alertCreateParams.additionalQueryParams.toBuilder()
        }

        fun sessionId(sessionId: JsonValue?) = apply { this.sessionId = sessionId }

        /** Alias for calling [Builder.sessionId] with `sessionId.orElse(null)`. */
        fun sessionId(sessionId: Optional<JsonValue>) = sessionId(sessionId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [actions]
         * - [rule]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun actions(actions: List<AlertActionBase>) = apply { body.actions(actions) }

        /**
         * Sets [Builder.actions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actions] with a well-typed `List<AlertActionBase>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun actions(actions: JsonField<List<AlertActionBase>>) = apply { body.actions(actions) }

        /**
         * Adds a single [AlertActionBase] to [actions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAction(action: AlertActionBase) = apply { body.addAction(action) }

        fun rule(rule: AlertRuleBase) = apply { body.rule(rule) }

        /**
         * Sets [Builder.rule] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rule] with a well-typed [AlertRuleBase] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rule(rule: JsonField<AlertRuleBase>) = apply { body.rule(rule) }

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
         * Returns an immutable instance of [AlertCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .actions()
         * .rule()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AlertCreateParams =
            AlertCreateParams(
                sessionId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> sessionId?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val actions: JsonField<List<AlertActionBase>>,
        private val rule: JsonField<AlertRuleBase>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("actions")
            @ExcludeMissing
            actions: JsonField<List<AlertActionBase>> = JsonMissing.of(),
            @JsonProperty("rule") @ExcludeMissing rule: JsonField<AlertRuleBase> = JsonMissing.of(),
        ) : this(actions, rule, mutableMapOf())

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun actions(): List<AlertActionBase> = actions.getRequired("actions")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun rule(): AlertRuleBase = rule.getRequired("rule")

        /**
         * Returns the raw JSON value of [actions].
         *
         * Unlike [actions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("actions")
        @ExcludeMissing
        fun _actions(): JsonField<List<AlertActionBase>> = actions

        /**
         * Returns the raw JSON value of [rule].
         *
         * Unlike [rule], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rule") @ExcludeMissing fun _rule(): JsonField<AlertRuleBase> = rule

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
             * .actions()
             * .rule()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var actions: JsonField<MutableList<AlertActionBase>>? = null
            private var rule: JsonField<AlertRuleBase>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                actions = body.actions.map { it.toMutableList() }
                rule = body.rule
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun actions(actions: List<AlertActionBase>) = actions(JsonField.of(actions))

            /**
             * Sets [Builder.actions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actions] with a well-typed `List<AlertActionBase>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun actions(actions: JsonField<List<AlertActionBase>>) = apply {
                this.actions = actions.map { it.toMutableList() }
            }

            /**
             * Adds a single [AlertActionBase] to [actions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAction(action: AlertActionBase) = apply {
                actions =
                    (actions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("actions", it).add(action)
                    }
            }

            fun rule(rule: AlertRuleBase) = rule(JsonField.of(rule))

            /**
             * Sets [Builder.rule] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rule] with a well-typed [AlertRuleBase] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rule(rule: JsonField<AlertRuleBase>) = apply { this.rule = rule }

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
             * .actions()
             * .rule()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("actions", actions).map { it.toImmutable() },
                    checkRequired("rule", rule),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            actions().forEach { it.validate() }
            rule().validate()
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
            (actions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (rule.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                actions == other.actions &&
                rule == other.rule &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(actions, rule, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{actions=$actions, rule=$rule, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AlertCreateParams &&
            sessionId == other.sessionId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(sessionId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AlertCreateParams{sessionId=$sessionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
