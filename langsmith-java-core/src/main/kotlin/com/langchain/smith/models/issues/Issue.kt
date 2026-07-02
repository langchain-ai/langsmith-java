// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.issues

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.Enum
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

class Issue
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val actions: JsonValue,
    private val createdAt: JsonField<String>,
    private val description: JsonField<String>,
    private val firstSeenAt: JsonField<String>,
    private val fixBranch: JsonField<String>,
    private val fixDispatchedAt: JsonField<String>,
    private val fixPrNumber: JsonField<Long>,
    private val fixPrompt: JsonField<String>,
    private val fixVerification: JsonValue,
    private val lastSeenAt: JsonField<String>,
    private val name: JsonField<String>,
    private val proposedContextFixes: JsonField<List<JsonValue>>,
    private val proposedExamples: JsonField<List<JsonValue>>,
    private val proposedFix: JsonField<String>,
    private val proposedPromptFixes: JsonField<List<JsonValue>>,
    private val sessionId: JsonField<String>,
    private val severity: JsonField<Severity>,
    private val status: JsonField<Status>,
    private val tags: JsonField<List<String>>,
    private val tenantId: JsonField<String>,
    private val traces: JsonValue,
    private val updatedAt: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("actions") @ExcludeMissing actions: JsonValue = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("first_seen_at")
        @ExcludeMissing
        firstSeenAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fix_branch") @ExcludeMissing fixBranch: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fix_dispatched_at")
        @ExcludeMissing
        fixDispatchedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fix_pr_number")
        @ExcludeMissing
        fixPrNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("fix_prompt") @ExcludeMissing fixPrompt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fix_verification")
        @ExcludeMissing
        fixVerification: JsonValue = JsonMissing.of(),
        @JsonProperty("last_seen_at")
        @ExcludeMissing
        lastSeenAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("proposed_context_fixes")
        @ExcludeMissing
        proposedContextFixes: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("proposed_examples")
        @ExcludeMissing
        proposedExamples: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("proposed_fix")
        @ExcludeMissing
        proposedFix: JsonField<String> = JsonMissing.of(),
        @JsonProperty("proposed_prompt_fixes")
        @ExcludeMissing
        proposedPromptFixes: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("session_id") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("severity") @ExcludeMissing severity: JsonField<Severity> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("traces") @ExcludeMissing traces: JsonValue = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        actions,
        createdAt,
        description,
        firstSeenAt,
        fixBranch,
        fixDispatchedAt,
        fixPrNumber,
        fixPrompt,
        fixVerification,
        lastSeenAt,
        name,
        proposedContextFixes,
        proposedExamples,
        proposedFix,
        proposedPromptFixes,
        sessionId,
        severity,
        status,
        tags,
        tenantId,
        traces,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = issue.actions().convert(MyClass.class);
     * ```
     */
    @JsonProperty("actions") @ExcludeMissing fun _actions(): JsonValue = actions

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstSeenAt(): Optional<String> = firstSeenAt.getOptional("first_seen_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fixBranch(): Optional<String> = fixBranch.getOptional("fix_branch")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fixDispatchedAt(): Optional<String> = fixDispatchedAt.getOptional("fix_dispatched_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fixPrNumber(): Optional<Long> = fixPrNumber.getOptional("fix_pr_number")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fixPrompt(): Optional<String> = fixPrompt.getOptional("fix_prompt")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = issue.fixVerification().convert(MyClass.class);
     * ```
     */
    @JsonProperty("fix_verification")
    @ExcludeMissing
    fun _fixVerification(): JsonValue = fixVerification

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastSeenAt(): Optional<String> = lastSeenAt.getOptional("last_seen_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun proposedContextFixes(): Optional<List<JsonValue>> =
        proposedContextFixes.getOptional("proposed_context_fixes")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun proposedExamples(): Optional<List<JsonValue>> =
        proposedExamples.getOptional("proposed_examples")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun proposedFix(): Optional<String> = proposedFix.getOptional("proposed_fix")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun proposedPromptFixes(): Optional<List<JsonValue>> =
        proposedPromptFixes.getOptional("proposed_prompt_fixes")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sessionId(): Optional<String> = sessionId.getOptional("session_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun severity(): Optional<Severity> = severity.getOptional("severity")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tenantId(): Optional<String> = tenantId.getOptional("tenant_id")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = issue.traces().convert(MyClass.class);
     * ```
     */
    @JsonProperty("traces") @ExcludeMissing fun _traces(): JsonValue = traces

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

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
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [firstSeenAt].
     *
     * Unlike [firstSeenAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("first_seen_at")
    @ExcludeMissing
    fun _firstSeenAt(): JsonField<String> = firstSeenAt

    /**
     * Returns the raw JSON value of [fixBranch].
     *
     * Unlike [fixBranch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fix_branch") @ExcludeMissing fun _fixBranch(): JsonField<String> = fixBranch

    /**
     * Returns the raw JSON value of [fixDispatchedAt].
     *
     * Unlike [fixDispatchedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fix_dispatched_at")
    @ExcludeMissing
    fun _fixDispatchedAt(): JsonField<String> = fixDispatchedAt

    /**
     * Returns the raw JSON value of [fixPrNumber].
     *
     * Unlike [fixPrNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fix_pr_number") @ExcludeMissing fun _fixPrNumber(): JsonField<Long> = fixPrNumber

    /**
     * Returns the raw JSON value of [fixPrompt].
     *
     * Unlike [fixPrompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fix_prompt") @ExcludeMissing fun _fixPrompt(): JsonField<String> = fixPrompt

    /**
     * Returns the raw JSON value of [lastSeenAt].
     *
     * Unlike [lastSeenAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_seen_at") @ExcludeMissing fun _lastSeenAt(): JsonField<String> = lastSeenAt

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [proposedContextFixes].
     *
     * Unlike [proposedContextFixes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("proposed_context_fixes")
    @ExcludeMissing
    fun _proposedContextFixes(): JsonField<List<JsonValue>> = proposedContextFixes

    /**
     * Returns the raw JSON value of [proposedExamples].
     *
     * Unlike [proposedExamples], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("proposed_examples")
    @ExcludeMissing
    fun _proposedExamples(): JsonField<List<JsonValue>> = proposedExamples

    /**
     * Returns the raw JSON value of [proposedFix].
     *
     * Unlike [proposedFix], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("proposed_fix")
    @ExcludeMissing
    fun _proposedFix(): JsonField<String> = proposedFix

    /**
     * Returns the raw JSON value of [proposedPromptFixes].
     *
     * Unlike [proposedPromptFixes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("proposed_prompt_fixes")
    @ExcludeMissing
    fun _proposedPromptFixes(): JsonField<List<JsonValue>> = proposedPromptFixes

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

    /**
     * Returns the raw JSON value of [severity].
     *
     * Unlike [severity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("severity") @ExcludeMissing fun _severity(): JsonField<Severity> = severity

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

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
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

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

        /** Returns a mutable builder for constructing an instance of [Issue]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Issue]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var actions: JsonValue = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var firstSeenAt: JsonField<String> = JsonMissing.of()
        private var fixBranch: JsonField<String> = JsonMissing.of()
        private var fixDispatchedAt: JsonField<String> = JsonMissing.of()
        private var fixPrNumber: JsonField<Long> = JsonMissing.of()
        private var fixPrompt: JsonField<String> = JsonMissing.of()
        private var fixVerification: JsonValue = JsonMissing.of()
        private var lastSeenAt: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var proposedContextFixes: JsonField<MutableList<JsonValue>>? = null
        private var proposedExamples: JsonField<MutableList<JsonValue>>? = null
        private var proposedFix: JsonField<String> = JsonMissing.of()
        private var proposedPromptFixes: JsonField<MutableList<JsonValue>>? = null
        private var sessionId: JsonField<String> = JsonMissing.of()
        private var severity: JsonField<Severity> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var tenantId: JsonField<String> = JsonMissing.of()
        private var traces: JsonValue = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(issue: Issue) = apply {
            id = issue.id
            actions = issue.actions
            createdAt = issue.createdAt
            description = issue.description
            firstSeenAt = issue.firstSeenAt
            fixBranch = issue.fixBranch
            fixDispatchedAt = issue.fixDispatchedAt
            fixPrNumber = issue.fixPrNumber
            fixPrompt = issue.fixPrompt
            fixVerification = issue.fixVerification
            lastSeenAt = issue.lastSeenAt
            name = issue.name
            proposedContextFixes = issue.proposedContextFixes.map { it.toMutableList() }
            proposedExamples = issue.proposedExamples.map { it.toMutableList() }
            proposedFix = issue.proposedFix
            proposedPromptFixes = issue.proposedPromptFixes.map { it.toMutableList() }
            sessionId = issue.sessionId
            severity = issue.severity
            status = issue.status
            tags = issue.tags.map { it.toMutableList() }
            tenantId = issue.tenantId
            traces = issue.traces
            updatedAt = issue.updatedAt
            additionalProperties = issue.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun actions(actions: JsonValue) = apply { this.actions = actions }

        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun firstSeenAt(firstSeenAt: String) = firstSeenAt(JsonField.of(firstSeenAt))

        /**
         * Sets [Builder.firstSeenAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstSeenAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstSeenAt(firstSeenAt: JsonField<String>) = apply { this.firstSeenAt = firstSeenAt }

        fun fixBranch(fixBranch: String) = fixBranch(JsonField.of(fixBranch))

        /**
         * Sets [Builder.fixBranch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fixBranch] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fixBranch(fixBranch: JsonField<String>) = apply { this.fixBranch = fixBranch }

        fun fixDispatchedAt(fixDispatchedAt: String) =
            fixDispatchedAt(JsonField.of(fixDispatchedAt))

        /**
         * Sets [Builder.fixDispatchedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fixDispatchedAt] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fixDispatchedAt(fixDispatchedAt: JsonField<String>) = apply {
            this.fixDispatchedAt = fixDispatchedAt
        }

        fun fixPrNumber(fixPrNumber: Long) = fixPrNumber(JsonField.of(fixPrNumber))

        /**
         * Sets [Builder.fixPrNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fixPrNumber] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fixPrNumber(fixPrNumber: JsonField<Long>) = apply { this.fixPrNumber = fixPrNumber }

        fun fixPrompt(fixPrompt: String) = fixPrompt(JsonField.of(fixPrompt))

        /**
         * Sets [Builder.fixPrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fixPrompt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fixPrompt(fixPrompt: JsonField<String>) = apply { this.fixPrompt = fixPrompt }

        fun fixVerification(fixVerification: JsonValue) = apply {
            this.fixVerification = fixVerification
        }

        fun lastSeenAt(lastSeenAt: String) = lastSeenAt(JsonField.of(lastSeenAt))

        /**
         * Sets [Builder.lastSeenAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastSeenAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lastSeenAt(lastSeenAt: JsonField<String>) = apply { this.lastSeenAt = lastSeenAt }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun proposedContextFixes(proposedContextFixes: List<JsonValue>) =
            proposedContextFixes(JsonField.of(proposedContextFixes))

        /**
         * Sets [Builder.proposedContextFixes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.proposedContextFixes] with a well-typed
         * `List<JsonValue>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun proposedContextFixes(proposedContextFixes: JsonField<List<JsonValue>>) = apply {
            this.proposedContextFixes = proposedContextFixes.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [proposedContextFixes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProposedContextFix(proposedContextFix: JsonValue) = apply {
            proposedContextFixes =
                (proposedContextFixes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("proposedContextFixes", it).add(proposedContextFix)
                }
        }

        fun proposedExamples(proposedExamples: List<JsonValue>) =
            proposedExamples(JsonField.of(proposedExamples))

        /**
         * Sets [Builder.proposedExamples] to an arbitrary JSON value.
         *
         * You should usually call [Builder.proposedExamples] with a well-typed `List<JsonValue>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun proposedExamples(proposedExamples: JsonField<List<JsonValue>>) = apply {
            this.proposedExamples = proposedExamples.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [proposedExamples].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProposedExample(proposedExample: JsonValue) = apply {
            proposedExamples =
                (proposedExamples ?: JsonField.of(mutableListOf())).also {
                    checkKnown("proposedExamples", it).add(proposedExample)
                }
        }

        fun proposedFix(proposedFix: String) = proposedFix(JsonField.of(proposedFix))

        /**
         * Sets [Builder.proposedFix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.proposedFix] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun proposedFix(proposedFix: JsonField<String>) = apply { this.proposedFix = proposedFix }

        fun proposedPromptFixes(proposedPromptFixes: List<JsonValue>) =
            proposedPromptFixes(JsonField.of(proposedPromptFixes))

        /**
         * Sets [Builder.proposedPromptFixes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.proposedPromptFixes] with a well-typed `List<JsonValue>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun proposedPromptFixes(proposedPromptFixes: JsonField<List<JsonValue>>) = apply {
            this.proposedPromptFixes = proposedPromptFixes.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [proposedPromptFixes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProposedPromptFix(proposedPromptFix: JsonValue) = apply {
            proposedPromptFixes =
                (proposedPromptFixes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("proposedPromptFixes", it).add(proposedPromptFix)
                }
        }

        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        fun severity(severity: Severity) = severity(JsonField.of(severity))

        /**
         * Sets [Builder.severity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.severity] with a well-typed [Severity] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun severity(severity: JsonField<Severity>) = apply { this.severity = severity }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply {
            this.tags = tags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

        fun traces(traces: JsonValue) = apply { this.traces = traces }

        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [Issue].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Issue =
            Issue(
                id,
                actions,
                createdAt,
                description,
                firstSeenAt,
                fixBranch,
                fixDispatchedAt,
                fixPrNumber,
                fixPrompt,
                fixVerification,
                lastSeenAt,
                name,
                (proposedContextFixes ?: JsonMissing.of()).map { it.toImmutable() },
                (proposedExamples ?: JsonMissing.of()).map { it.toImmutable() },
                proposedFix,
                (proposedPromptFixes ?: JsonMissing.of()).map { it.toImmutable() },
                sessionId,
                severity,
                status,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                tenantId,
                traces,
                updatedAt,
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
    fun validate(): Issue = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        description()
        firstSeenAt()
        fixBranch()
        fixDispatchedAt()
        fixPrNumber()
        fixPrompt()
        lastSeenAt()
        name()
        proposedContextFixes()
        proposedExamples()
        proposedFix()
        proposedPromptFixes()
        sessionId()
        severity().ifPresent { it.validate() }
        status().ifPresent { it.validate() }
        tags()
        tenantId()
        updatedAt()
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
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (firstSeenAt.asKnown().isPresent) 1 else 0) +
            (if (fixBranch.asKnown().isPresent) 1 else 0) +
            (if (fixDispatchedAt.asKnown().isPresent) 1 else 0) +
            (if (fixPrNumber.asKnown().isPresent) 1 else 0) +
            (if (fixPrompt.asKnown().isPresent) 1 else 0) +
            (if (lastSeenAt.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (proposedContextFixes.asKnown().getOrNull()?.size ?: 0) +
            (proposedExamples.asKnown().getOrNull()?.size ?: 0) +
            (if (proposedFix.asKnown().isPresent) 1 else 0) +
            (proposedPromptFixes.asKnown().getOrNull()?.size ?: 0) +
            (if (sessionId.asKnown().isPresent) 1 else 0) +
            (severity.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    class Severity @JsonCreator private constructor(private val value: JsonField<Long>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Long> = value

        companion object {

            @JvmField val _0 = of(0L)

            @JvmField val _1 = of(1L)

            @JvmField val _2 = of(2L)

            @JvmField val _3 = of(3L)

            @JvmStatic fun of(value: Long) = Severity(JsonField.of(value))
        }

        /** An enum containing [Severity]'s known values. */
        enum class Known {
            _0,
            _1,
            _2,
            _3,
        }

        /**
         * An enum containing [Severity]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Severity] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _0,
            _1,
            _2,
            _3,
            /** An enum member indicating that [Severity] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                _0 -> Value._0
                _1 -> Value._1
                _2 -> Value._2
                _3 -> Value._3
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangChainInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                _0 -> Known._0
                _1 -> Known._1
                _2 -> Known._2
                _3 -> Known._3
                else -> throw LangChainInvalidDataException("Unknown Severity: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * @throws LangChainInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asLong(): Long =
            _value().asNumber().getOrNull()?.let {
                if (it.toDouble() % 1 == 0.0) it.toLong() else null
            } ?: throw LangChainInvalidDataException("Value is not a Long")

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
        fun validate(): Severity = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Severity && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val OPEN = of("open")

            @JvmField val COMPLETED = of("completed")

            @JvmField val IGNORED = of("ignored")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            OPEN,
            COMPLETED,
            IGNORED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OPEN,
            COMPLETED,
            IGNORED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                OPEN -> Value.OPEN
                COMPLETED -> Value.COMPLETED
                IGNORED -> Value.IGNORED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangChainInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                OPEN -> Known.OPEN
                COMPLETED -> Known.COMPLETED
                IGNORED -> Known.IGNORED
                else -> throw LangChainInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangChainInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangChainInvalidDataException("Value is not a String")
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
        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Issue &&
            id == other.id &&
            actions == other.actions &&
            createdAt == other.createdAt &&
            description == other.description &&
            firstSeenAt == other.firstSeenAt &&
            fixBranch == other.fixBranch &&
            fixDispatchedAt == other.fixDispatchedAt &&
            fixPrNumber == other.fixPrNumber &&
            fixPrompt == other.fixPrompt &&
            fixVerification == other.fixVerification &&
            lastSeenAt == other.lastSeenAt &&
            name == other.name &&
            proposedContextFixes == other.proposedContextFixes &&
            proposedExamples == other.proposedExamples &&
            proposedFix == other.proposedFix &&
            proposedPromptFixes == other.proposedPromptFixes &&
            sessionId == other.sessionId &&
            severity == other.severity &&
            status == other.status &&
            tags == other.tags &&
            tenantId == other.tenantId &&
            traces == other.traces &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            actions,
            createdAt,
            description,
            firstSeenAt,
            fixBranch,
            fixDispatchedAt,
            fixPrNumber,
            fixPrompt,
            fixVerification,
            lastSeenAt,
            name,
            proposedContextFixes,
            proposedExamples,
            proposedFix,
            proposedPromptFixes,
            sessionId,
            severity,
            status,
            tags,
            tenantId,
            traces,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Issue{id=$id, actions=$actions, createdAt=$createdAt, description=$description, firstSeenAt=$firstSeenAt, fixBranch=$fixBranch, fixDispatchedAt=$fixDispatchedAt, fixPrNumber=$fixPrNumber, fixPrompt=$fixPrompt, fixVerification=$fixVerification, lastSeenAt=$lastSeenAt, name=$name, proposedContextFixes=$proposedContextFixes, proposedExamples=$proposedExamples, proposedFix=$proposedFix, proposedPromptFixes=$proposedPromptFixes, sessionId=$sessionId, severity=$severity, status=$status, tags=$tags, tenantId=$tenantId, traces=$traces, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
