// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.datasets.playgroundexperiment

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

/** Dataset Handler */
class PlaygroundExperimentBatchParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun datasetId(): String = body.datasetId()

    fun _manifest(): JsonValue = body._manifest()

    /**
     * Configuration for a Runnable.
     *
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun options(): RunnableConfig = body.options()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectName(): String = body.projectName()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun secrets(): Secrets = body.secrets()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun batchSize(): Optional<Long> = body.batchSize()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun commit(): Optional<String> = body.commit()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun datasetSplits(): Optional<List<String>> = body.datasetSplits()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun evaluatorRules(): Optional<List<String>> = body.evaluatorRules()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun owner(): Optional<String> = body.owner()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun parallelToolCalls(): Optional<Boolean> = body.parallelToolCalls()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun repetitions(): Optional<Long> = body.repetitions()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun repoHandle(): Optional<String> = body.repoHandle()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun repoId(): Optional<String> = body.repoId()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun requestsPerSecond(): Optional<Long> = body.requestsPerSecond()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun runId(): Optional<String> = body.runId()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun runnerContext(): Optional<RunnerContextEnum> = body.runnerContext()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun toolChoice(): Optional<String> = body.toolChoice()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tools(): Optional<List<JsonValue>> = body.tools()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun useOrFallbackToWorkspaceSecrets(): Optional<Boolean> =
        body.useOrFallbackToWorkspaceSecrets()

    /**
     * Returns the raw JSON value of [datasetId].
     *
     * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _datasetId(): JsonField<String> = body._datasetId()

    /**
     * Returns the raw JSON value of [options].
     *
     * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _options(): JsonField<RunnableConfig> = body._options()

    /**
     * Returns the raw JSON value of [projectName].
     *
     * Unlike [projectName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _projectName(): JsonField<String> = body._projectName()

    /**
     * Returns the raw JSON value of [secrets].
     *
     * Unlike [secrets], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _secrets(): JsonField<Secrets> = body._secrets()

    /**
     * Returns the raw JSON value of [batchSize].
     *
     * Unlike [batchSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _batchSize(): JsonField<Long> = body._batchSize()

    /**
     * Returns the raw JSON value of [commit].
     *
     * Unlike [commit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _commit(): JsonField<String> = body._commit()

    /**
     * Returns the raw JSON value of [datasetSplits].
     *
     * Unlike [datasetSplits], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _datasetSplits(): JsonField<List<String>> = body._datasetSplits()

    /**
     * Returns the raw JSON value of [evaluatorRules].
     *
     * Unlike [evaluatorRules], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _evaluatorRules(): JsonField<List<String>> = body._evaluatorRules()

    /**
     * Returns the raw JSON value of [owner].
     *
     * Unlike [owner], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _owner(): JsonField<String> = body._owner()

    /**
     * Returns the raw JSON value of [parallelToolCalls].
     *
     * Unlike [parallelToolCalls], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _parallelToolCalls(): JsonField<Boolean> = body._parallelToolCalls()

    /**
     * Returns the raw JSON value of [repetitions].
     *
     * Unlike [repetitions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _repetitions(): JsonField<Long> = body._repetitions()

    /**
     * Returns the raw JSON value of [repoHandle].
     *
     * Unlike [repoHandle], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _repoHandle(): JsonField<String> = body._repoHandle()

    /**
     * Returns the raw JSON value of [repoId].
     *
     * Unlike [repoId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _repoId(): JsonField<String> = body._repoId()

    /**
     * Returns the raw JSON value of [requestsPerSecond].
     *
     * Unlike [requestsPerSecond], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _requestsPerSecond(): JsonField<Long> = body._requestsPerSecond()

    /**
     * Returns the raw JSON value of [runId].
     *
     * Unlike [runId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _runId(): JsonField<String> = body._runId()

    /**
     * Returns the raw JSON value of [runnerContext].
     *
     * Unlike [runnerContext], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _runnerContext(): JsonField<RunnerContextEnum> = body._runnerContext()

    /**
     * Returns the raw JSON value of [toolChoice].
     *
     * Unlike [toolChoice], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _toolChoice(): JsonField<String> = body._toolChoice()

    /**
     * Returns the raw JSON value of [tools].
     *
     * Unlike [tools], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tools(): JsonField<List<JsonValue>> = body._tools()

    /**
     * Returns the raw JSON value of [useOrFallbackToWorkspaceSecrets].
     *
     * Unlike [useOrFallbackToWorkspaceSecrets], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _useOrFallbackToWorkspaceSecrets(): JsonField<Boolean> =
        body._useOrFallbackToWorkspaceSecrets()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PlaygroundExperimentBatchParams].
         *
         * The following fields are required:
         * ```java
         * .datasetId()
         * .manifest()
         * .options()
         * .projectName()
         * .secrets()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PlaygroundExperimentBatchParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(playgroundExperimentBatchParams: PlaygroundExperimentBatchParams) =
            apply {
                body = playgroundExperimentBatchParams.body.toBuilder()
                additionalHeaders = playgroundExperimentBatchParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    playgroundExperimentBatchParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [datasetId]
         * - [manifest]
         * - [options]
         * - [projectName]
         * - [secrets]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun datasetId(datasetId: String) = apply { body.datasetId(datasetId) }

        /**
         * Sets [Builder.datasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasetId(datasetId: JsonField<String>) = apply { body.datasetId(datasetId) }

        fun manifest(manifest: JsonValue) = apply { body.manifest(manifest) }

        /** Configuration for a Runnable. */
        fun options(options: RunnableConfig) = apply { body.options(options) }

        /**
         * Sets [Builder.options] to an arbitrary JSON value.
         *
         * You should usually call [Builder.options] with a well-typed [RunnableConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun options(options: JsonField<RunnableConfig>) = apply { body.options(options) }

        fun projectName(projectName: String) = apply { body.projectName(projectName) }

        /**
         * Sets [Builder.projectName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectName(projectName: JsonField<String>) = apply { body.projectName(projectName) }

        fun secrets(secrets: Secrets) = apply { body.secrets(secrets) }

        /**
         * Sets [Builder.secrets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secrets] with a well-typed [Secrets] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun secrets(secrets: JsonField<Secrets>) = apply { body.secrets(secrets) }

        fun batchSize(batchSize: Long?) = apply { body.batchSize(batchSize) }

        /**
         * Alias for [Builder.batchSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun batchSize(batchSize: Long) = batchSize(batchSize as Long?)

        /** Alias for calling [Builder.batchSize] with `batchSize.orElse(null)`. */
        fun batchSize(batchSize: Optional<Long>) = batchSize(batchSize.getOrNull())

        /**
         * Sets [Builder.batchSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.batchSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun batchSize(batchSize: JsonField<Long>) = apply { body.batchSize(batchSize) }

        fun commit(commit: String?) = apply { body.commit(commit) }

        /** Alias for calling [Builder.commit] with `commit.orElse(null)`. */
        fun commit(commit: Optional<String>) = commit(commit.getOrNull())

        /**
         * Sets [Builder.commit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commit] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun commit(commit: JsonField<String>) = apply { body.commit(commit) }

        fun datasetSplits(datasetSplits: List<String>?) = apply {
            body.datasetSplits(datasetSplits)
        }

        /** Alias for calling [Builder.datasetSplits] with `datasetSplits.orElse(null)`. */
        fun datasetSplits(datasetSplits: Optional<List<String>>) =
            datasetSplits(datasetSplits.getOrNull())

        /**
         * Sets [Builder.datasetSplits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetSplits] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun datasetSplits(datasetSplits: JsonField<List<String>>) = apply {
            body.datasetSplits(datasetSplits)
        }

        /**
         * Adds a single [String] to [datasetSplits].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDatasetSplit(datasetSplit: String) = apply { body.addDatasetSplit(datasetSplit) }

        fun evaluatorRules(evaluatorRules: List<String>?) = apply {
            body.evaluatorRules(evaluatorRules)
        }

        /** Alias for calling [Builder.evaluatorRules] with `evaluatorRules.orElse(null)`. */
        fun evaluatorRules(evaluatorRules: Optional<List<String>>) =
            evaluatorRules(evaluatorRules.getOrNull())

        /**
         * Sets [Builder.evaluatorRules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluatorRules] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun evaluatorRules(evaluatorRules: JsonField<List<String>>) = apply {
            body.evaluatorRules(evaluatorRules)
        }

        /**
         * Adds a single [String] to [evaluatorRules].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvaluatorRule(evaluatorRule: String) = apply { body.addEvaluatorRule(evaluatorRule) }

        fun owner(owner: String?) = apply { body.owner(owner) }

        /** Alias for calling [Builder.owner] with `owner.orElse(null)`. */
        fun owner(owner: Optional<String>) = owner(owner.getOrNull())

        /**
         * Sets [Builder.owner] to an arbitrary JSON value.
         *
         * You should usually call [Builder.owner] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun owner(owner: JsonField<String>) = apply { body.owner(owner) }

        fun parallelToolCalls(parallelToolCalls: Boolean?) = apply {
            body.parallelToolCalls(parallelToolCalls)
        }

        /**
         * Alias for [Builder.parallelToolCalls].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun parallelToolCalls(parallelToolCalls: Boolean) =
            parallelToolCalls(parallelToolCalls as Boolean?)

        /** Alias for calling [Builder.parallelToolCalls] with `parallelToolCalls.orElse(null)`. */
        fun parallelToolCalls(parallelToolCalls: Optional<Boolean>) =
            parallelToolCalls(parallelToolCalls.getOrNull())

        /**
         * Sets [Builder.parallelToolCalls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parallelToolCalls] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parallelToolCalls(parallelToolCalls: JsonField<Boolean>) = apply {
            body.parallelToolCalls(parallelToolCalls)
        }

        fun repetitions(repetitions: Long) = apply { body.repetitions(repetitions) }

        /**
         * Sets [Builder.repetitions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.repetitions] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun repetitions(repetitions: JsonField<Long>) = apply { body.repetitions(repetitions) }

        fun repoHandle(repoHandle: String?) = apply { body.repoHandle(repoHandle) }

        /** Alias for calling [Builder.repoHandle] with `repoHandle.orElse(null)`. */
        fun repoHandle(repoHandle: Optional<String>) = repoHandle(repoHandle.getOrNull())

        /**
         * Sets [Builder.repoHandle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.repoHandle] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun repoHandle(repoHandle: JsonField<String>) = apply { body.repoHandle(repoHandle) }

        fun repoId(repoId: String?) = apply { body.repoId(repoId) }

        /** Alias for calling [Builder.repoId] with `repoId.orElse(null)`. */
        fun repoId(repoId: Optional<String>) = repoId(repoId.getOrNull())

        /**
         * Sets [Builder.repoId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.repoId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun repoId(repoId: JsonField<String>) = apply { body.repoId(repoId) }

        fun requestsPerSecond(requestsPerSecond: Long?) = apply {
            body.requestsPerSecond(requestsPerSecond)
        }

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
            body.requestsPerSecond(requestsPerSecond)
        }

        fun runId(runId: String?) = apply { body.runId(runId) }

        /** Alias for calling [Builder.runId] with `runId.orElse(null)`. */
        fun runId(runId: Optional<String>) = runId(runId.getOrNull())

        /**
         * Sets [Builder.runId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runId(runId: JsonField<String>) = apply { body.runId(runId) }

        fun runnerContext(runnerContext: RunnerContextEnum?) = apply {
            body.runnerContext(runnerContext)
        }

        /** Alias for calling [Builder.runnerContext] with `runnerContext.orElse(null)`. */
        fun runnerContext(runnerContext: Optional<RunnerContextEnum>) =
            runnerContext(runnerContext.getOrNull())

        /**
         * Sets [Builder.runnerContext] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runnerContext] with a well-typed [RunnerContextEnum]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun runnerContext(runnerContext: JsonField<RunnerContextEnum>) = apply {
            body.runnerContext(runnerContext)
        }

        fun toolChoice(toolChoice: String?) = apply { body.toolChoice(toolChoice) }

        /** Alias for calling [Builder.toolChoice] with `toolChoice.orElse(null)`. */
        fun toolChoice(toolChoice: Optional<String>) = toolChoice(toolChoice.getOrNull())

        /**
         * Sets [Builder.toolChoice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolChoice] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun toolChoice(toolChoice: JsonField<String>) = apply { body.toolChoice(toolChoice) }

        fun tools(tools: List<JsonValue>?) = apply { body.tools(tools) }

        /** Alias for calling [Builder.tools] with `tools.orElse(null)`. */
        fun tools(tools: Optional<List<JsonValue>>) = tools(tools.getOrNull())

        /**
         * Sets [Builder.tools] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tools] with a well-typed `List<JsonValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tools(tools: JsonField<List<JsonValue>>) = apply { body.tools(tools) }

        /**
         * Adds a single [JsonValue] to [tools].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTool(tool: JsonValue) = apply { body.addTool(tool) }

        fun useOrFallbackToWorkspaceSecrets(useOrFallbackToWorkspaceSecrets: Boolean) = apply {
            body.useOrFallbackToWorkspaceSecrets(useOrFallbackToWorkspaceSecrets)
        }

        /**
         * Sets [Builder.useOrFallbackToWorkspaceSecrets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useOrFallbackToWorkspaceSecrets] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun useOrFallbackToWorkspaceSecrets(useOrFallbackToWorkspaceSecrets: JsonField<Boolean>) =
            apply {
                body.useOrFallbackToWorkspaceSecrets(useOrFallbackToWorkspaceSecrets)
            }

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
         * Returns an immutable instance of [PlaygroundExperimentBatchParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .datasetId()
         * .manifest()
         * .options()
         * .projectName()
         * .secrets()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PlaygroundExperimentBatchParams =
            PlaygroundExperimentBatchParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val datasetId: JsonField<String>,
        private val manifest: JsonValue,
        private val options: JsonField<RunnableConfig>,
        private val projectName: JsonField<String>,
        private val secrets: JsonField<Secrets>,
        private val batchSize: JsonField<Long>,
        private val commit: JsonField<String>,
        private val datasetSplits: JsonField<List<String>>,
        private val evaluatorRules: JsonField<List<String>>,
        private val owner: JsonField<String>,
        private val parallelToolCalls: JsonField<Boolean>,
        private val repetitions: JsonField<Long>,
        private val repoHandle: JsonField<String>,
        private val repoId: JsonField<String>,
        private val requestsPerSecond: JsonField<Long>,
        private val runId: JsonField<String>,
        private val runnerContext: JsonField<RunnerContextEnum>,
        private val toolChoice: JsonField<String>,
        private val tools: JsonField<List<JsonValue>>,
        private val useOrFallbackToWorkspaceSecrets: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("dataset_id")
            @ExcludeMissing
            datasetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("manifest") @ExcludeMissing manifest: JsonValue = JsonMissing.of(),
            @JsonProperty("options")
            @ExcludeMissing
            options: JsonField<RunnableConfig> = JsonMissing.of(),
            @JsonProperty("project_name")
            @ExcludeMissing
            projectName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("secrets") @ExcludeMissing secrets: JsonField<Secrets> = JsonMissing.of(),
            @JsonProperty("batch_size")
            @ExcludeMissing
            batchSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("commit") @ExcludeMissing commit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dataset_splits")
            @ExcludeMissing
            datasetSplits: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("evaluator_rules")
            @ExcludeMissing
            evaluatorRules: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("owner") @ExcludeMissing owner: JsonField<String> = JsonMissing.of(),
            @JsonProperty("parallel_tool_calls")
            @ExcludeMissing
            parallelToolCalls: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("repetitions")
            @ExcludeMissing
            repetitions: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("repo_handle")
            @ExcludeMissing
            repoHandle: JsonField<String> = JsonMissing.of(),
            @JsonProperty("repo_id") @ExcludeMissing repoId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("requests_per_second")
            @ExcludeMissing
            requestsPerSecond: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("run_id") @ExcludeMissing runId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("runner_context")
            @ExcludeMissing
            runnerContext: JsonField<RunnerContextEnum> = JsonMissing.of(),
            @JsonProperty("tool_choice")
            @ExcludeMissing
            toolChoice: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tools")
            @ExcludeMissing
            tools: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("use_or_fallback_to_workspace_secrets")
            @ExcludeMissing
            useOrFallbackToWorkspaceSecrets: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            datasetId,
            manifest,
            options,
            projectName,
            secrets,
            batchSize,
            commit,
            datasetSplits,
            evaluatorRules,
            owner,
            parallelToolCalls,
            repetitions,
            repoHandle,
            repoId,
            requestsPerSecond,
            runId,
            runnerContext,
            toolChoice,
            tools,
            useOrFallbackToWorkspaceSecrets,
            mutableMapOf(),
        )

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun datasetId(): String = datasetId.getRequired("dataset_id")

        @JsonProperty("manifest") @ExcludeMissing fun _manifest(): JsonValue = manifest

        /**
         * Configuration for a Runnable.
         *
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun options(): RunnableConfig = options.getRequired("options")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun projectName(): String = projectName.getRequired("project_name")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun secrets(): Secrets = secrets.getRequired("secrets")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun batchSize(): Optional<Long> = batchSize.getOptional("batch_size")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun commit(): Optional<String> = commit.getOptional("commit")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun datasetSplits(): Optional<List<String>> = datasetSplits.getOptional("dataset_splits")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun evaluatorRules(): Optional<List<String>> = evaluatorRules.getOptional("evaluator_rules")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun owner(): Optional<String> = owner.getOptional("owner")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun parallelToolCalls(): Optional<Boolean> =
            parallelToolCalls.getOptional("parallel_tool_calls")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun repetitions(): Optional<Long> = repetitions.getOptional("repetitions")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun repoHandle(): Optional<String> = repoHandle.getOptional("repo_handle")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun repoId(): Optional<String> = repoId.getOptional("repo_id")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun requestsPerSecond(): Optional<Long> =
            requestsPerSecond.getOptional("requests_per_second")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun runId(): Optional<String> = runId.getOptional("run_id")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun runnerContext(): Optional<RunnerContextEnum> =
            runnerContext.getOptional("runner_context")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun toolChoice(): Optional<String> = toolChoice.getOptional("tool_choice")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun tools(): Optional<List<JsonValue>> = tools.getOptional("tools")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun useOrFallbackToWorkspaceSecrets(): Optional<Boolean> =
            useOrFallbackToWorkspaceSecrets.getOptional("use_or_fallback_to_workspace_secrets")

        /**
         * Returns the raw JSON value of [datasetId].
         *
         * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId(): JsonField<String> = datasetId

        /**
         * Returns the raw JSON value of [options].
         *
         * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("options") @ExcludeMissing fun _options(): JsonField<RunnableConfig> = options

        /**
         * Returns the raw JSON value of [projectName].
         *
         * Unlike [projectName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("project_name")
        @ExcludeMissing
        fun _projectName(): JsonField<String> = projectName

        /**
         * Returns the raw JSON value of [secrets].
         *
         * Unlike [secrets], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("secrets") @ExcludeMissing fun _secrets(): JsonField<Secrets> = secrets

        /**
         * Returns the raw JSON value of [batchSize].
         *
         * Unlike [batchSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("batch_size") @ExcludeMissing fun _batchSize(): JsonField<Long> = batchSize

        /**
         * Returns the raw JSON value of [commit].
         *
         * Unlike [commit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("commit") @ExcludeMissing fun _commit(): JsonField<String> = commit

        /**
         * Returns the raw JSON value of [datasetSplits].
         *
         * Unlike [datasetSplits], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dataset_splits")
        @ExcludeMissing
        fun _datasetSplits(): JsonField<List<String>> = datasetSplits

        /**
         * Returns the raw JSON value of [evaluatorRules].
         *
         * Unlike [evaluatorRules], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("evaluator_rules")
        @ExcludeMissing
        fun _evaluatorRules(): JsonField<List<String>> = evaluatorRules

        /**
         * Returns the raw JSON value of [owner].
         *
         * Unlike [owner], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("owner") @ExcludeMissing fun _owner(): JsonField<String> = owner

        /**
         * Returns the raw JSON value of [parallelToolCalls].
         *
         * Unlike [parallelToolCalls], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("parallel_tool_calls")
        @ExcludeMissing
        fun _parallelToolCalls(): JsonField<Boolean> = parallelToolCalls

        /**
         * Returns the raw JSON value of [repetitions].
         *
         * Unlike [repetitions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("repetitions")
        @ExcludeMissing
        fun _repetitions(): JsonField<Long> = repetitions

        /**
         * Returns the raw JSON value of [repoHandle].
         *
         * Unlike [repoHandle], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("repo_handle")
        @ExcludeMissing
        fun _repoHandle(): JsonField<String> = repoHandle

        /**
         * Returns the raw JSON value of [repoId].
         *
         * Unlike [repoId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("repo_id") @ExcludeMissing fun _repoId(): JsonField<String> = repoId

        /**
         * Returns the raw JSON value of [requestsPerSecond].
         *
         * Unlike [requestsPerSecond], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("requests_per_second")
        @ExcludeMissing
        fun _requestsPerSecond(): JsonField<Long> = requestsPerSecond

        /**
         * Returns the raw JSON value of [runId].
         *
         * Unlike [runId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("run_id") @ExcludeMissing fun _runId(): JsonField<String> = runId

        /**
         * Returns the raw JSON value of [runnerContext].
         *
         * Unlike [runnerContext], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("runner_context")
        @ExcludeMissing
        fun _runnerContext(): JsonField<RunnerContextEnum> = runnerContext

        /**
         * Returns the raw JSON value of [toolChoice].
         *
         * Unlike [toolChoice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tool_choice")
        @ExcludeMissing
        fun _toolChoice(): JsonField<String> = toolChoice

        /**
         * Returns the raw JSON value of [tools].
         *
         * Unlike [tools], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tools") @ExcludeMissing fun _tools(): JsonField<List<JsonValue>> = tools

        /**
         * Returns the raw JSON value of [useOrFallbackToWorkspaceSecrets].
         *
         * Unlike [useOrFallbackToWorkspaceSecrets], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("use_or_fallback_to_workspace_secrets")
        @ExcludeMissing
        fun _useOrFallbackToWorkspaceSecrets(): JsonField<Boolean> = useOrFallbackToWorkspaceSecrets

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
             * .datasetId()
             * .manifest()
             * .options()
             * .projectName()
             * .secrets()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var datasetId: JsonField<String>? = null
            private var manifest: JsonValue? = null
            private var options: JsonField<RunnableConfig>? = null
            private var projectName: JsonField<String>? = null
            private var secrets: JsonField<Secrets>? = null
            private var batchSize: JsonField<Long> = JsonMissing.of()
            private var commit: JsonField<String> = JsonMissing.of()
            private var datasetSplits: JsonField<MutableList<String>>? = null
            private var evaluatorRules: JsonField<MutableList<String>>? = null
            private var owner: JsonField<String> = JsonMissing.of()
            private var parallelToolCalls: JsonField<Boolean> = JsonMissing.of()
            private var repetitions: JsonField<Long> = JsonMissing.of()
            private var repoHandle: JsonField<String> = JsonMissing.of()
            private var repoId: JsonField<String> = JsonMissing.of()
            private var requestsPerSecond: JsonField<Long> = JsonMissing.of()
            private var runId: JsonField<String> = JsonMissing.of()
            private var runnerContext: JsonField<RunnerContextEnum> = JsonMissing.of()
            private var toolChoice: JsonField<String> = JsonMissing.of()
            private var tools: JsonField<MutableList<JsonValue>>? = null
            private var useOrFallbackToWorkspaceSecrets: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                datasetId = body.datasetId
                manifest = body.manifest
                options = body.options
                projectName = body.projectName
                secrets = body.secrets
                batchSize = body.batchSize
                commit = body.commit
                datasetSplits = body.datasetSplits.map { it.toMutableList() }
                evaluatorRules = body.evaluatorRules.map { it.toMutableList() }
                owner = body.owner
                parallelToolCalls = body.parallelToolCalls
                repetitions = body.repetitions
                repoHandle = body.repoHandle
                repoId = body.repoId
                requestsPerSecond = body.requestsPerSecond
                runId = body.runId
                runnerContext = body.runnerContext
                toolChoice = body.toolChoice
                tools = body.tools.map { it.toMutableList() }
                useOrFallbackToWorkspaceSecrets = body.useOrFallbackToWorkspaceSecrets
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

            /**
             * Sets [Builder.datasetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

            fun manifest(manifest: JsonValue) = apply { this.manifest = manifest }

            /** Configuration for a Runnable. */
            fun options(options: RunnableConfig) = options(JsonField.of(options))

            /**
             * Sets [Builder.options] to an arbitrary JSON value.
             *
             * You should usually call [Builder.options] with a well-typed [RunnableConfig] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun options(options: JsonField<RunnableConfig>) = apply { this.options = options }

            fun projectName(projectName: String) = projectName(JsonField.of(projectName))

            /**
             * Sets [Builder.projectName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projectName(projectName: JsonField<String>) = apply {
                this.projectName = projectName
            }

            fun secrets(secrets: Secrets) = secrets(JsonField.of(secrets))

            /**
             * Sets [Builder.secrets] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secrets] with a well-typed [Secrets] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secrets(secrets: JsonField<Secrets>) = apply { this.secrets = secrets }

            fun batchSize(batchSize: Long?) = batchSize(JsonField.ofNullable(batchSize))

            /**
             * Alias for [Builder.batchSize].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun batchSize(batchSize: Long) = batchSize(batchSize as Long?)

            /** Alias for calling [Builder.batchSize] with `batchSize.orElse(null)`. */
            fun batchSize(batchSize: Optional<Long>) = batchSize(batchSize.getOrNull())

            /**
             * Sets [Builder.batchSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.batchSize] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun batchSize(batchSize: JsonField<Long>) = apply { this.batchSize = batchSize }

            fun commit(commit: String?) = commit(JsonField.ofNullable(commit))

            /** Alias for calling [Builder.commit] with `commit.orElse(null)`. */
            fun commit(commit: Optional<String>) = commit(commit.getOrNull())

            /**
             * Sets [Builder.commit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commit] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commit(commit: JsonField<String>) = apply { this.commit = commit }

            fun datasetSplits(datasetSplits: List<String>?) =
                datasetSplits(JsonField.ofNullable(datasetSplits))

            /** Alias for calling [Builder.datasetSplits] with `datasetSplits.orElse(null)`. */
            fun datasetSplits(datasetSplits: Optional<List<String>>) =
                datasetSplits(datasetSplits.getOrNull())

            /**
             * Sets [Builder.datasetSplits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.datasetSplits] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun datasetSplits(datasetSplits: JsonField<List<String>>) = apply {
                this.datasetSplits = datasetSplits.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [datasetSplits].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDatasetSplit(datasetSplit: String) = apply {
                datasetSplits =
                    (datasetSplits ?: JsonField.of(mutableListOf())).also {
                        checkKnown("datasetSplits", it).add(datasetSplit)
                    }
            }

            fun evaluatorRules(evaluatorRules: List<String>?) =
                evaluatorRules(JsonField.ofNullable(evaluatorRules))

            /** Alias for calling [Builder.evaluatorRules] with `evaluatorRules.orElse(null)`. */
            fun evaluatorRules(evaluatorRules: Optional<List<String>>) =
                evaluatorRules(evaluatorRules.getOrNull())

            /**
             * Sets [Builder.evaluatorRules] to an arbitrary JSON value.
             *
             * You should usually call [Builder.evaluatorRules] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun evaluatorRules(evaluatorRules: JsonField<List<String>>) = apply {
                this.evaluatorRules = evaluatorRules.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [evaluatorRules].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEvaluatorRule(evaluatorRule: String) = apply {
                evaluatorRules =
                    (evaluatorRules ?: JsonField.of(mutableListOf())).also {
                        checkKnown("evaluatorRules", it).add(evaluatorRule)
                    }
            }

            fun owner(owner: String?) = owner(JsonField.ofNullable(owner))

            /** Alias for calling [Builder.owner] with `owner.orElse(null)`. */
            fun owner(owner: Optional<String>) = owner(owner.getOrNull())

            /**
             * Sets [Builder.owner] to an arbitrary JSON value.
             *
             * You should usually call [Builder.owner] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun owner(owner: JsonField<String>) = apply { this.owner = owner }

            fun parallelToolCalls(parallelToolCalls: Boolean?) =
                parallelToolCalls(JsonField.ofNullable(parallelToolCalls))

            /**
             * Alias for [Builder.parallelToolCalls].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun parallelToolCalls(parallelToolCalls: Boolean) =
                parallelToolCalls(parallelToolCalls as Boolean?)

            /**
             * Alias for calling [Builder.parallelToolCalls] with `parallelToolCalls.orElse(null)`.
             */
            fun parallelToolCalls(parallelToolCalls: Optional<Boolean>) =
                parallelToolCalls(parallelToolCalls.getOrNull())

            /**
             * Sets [Builder.parallelToolCalls] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parallelToolCalls] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parallelToolCalls(parallelToolCalls: JsonField<Boolean>) = apply {
                this.parallelToolCalls = parallelToolCalls
            }

            fun repetitions(repetitions: Long) = repetitions(JsonField.of(repetitions))

            /**
             * Sets [Builder.repetitions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.repetitions] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun repetitions(repetitions: JsonField<Long>) = apply { this.repetitions = repetitions }

            fun repoHandle(repoHandle: String?) = repoHandle(JsonField.ofNullable(repoHandle))

            /** Alias for calling [Builder.repoHandle] with `repoHandle.orElse(null)`. */
            fun repoHandle(repoHandle: Optional<String>) = repoHandle(repoHandle.getOrNull())

            /**
             * Sets [Builder.repoHandle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.repoHandle] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun repoHandle(repoHandle: JsonField<String>) = apply { this.repoHandle = repoHandle }

            fun repoId(repoId: String?) = repoId(JsonField.ofNullable(repoId))

            /** Alias for calling [Builder.repoId] with `repoId.orElse(null)`. */
            fun repoId(repoId: Optional<String>) = repoId(repoId.getOrNull())

            /**
             * Sets [Builder.repoId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.repoId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun repoId(repoId: JsonField<String>) = apply { this.repoId = repoId }

            fun requestsPerSecond(requestsPerSecond: Long?) =
                requestsPerSecond(JsonField.ofNullable(requestsPerSecond))

            /**
             * Alias for [Builder.requestsPerSecond].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun requestsPerSecond(requestsPerSecond: Long) =
                requestsPerSecond(requestsPerSecond as Long?)

            /**
             * Alias for calling [Builder.requestsPerSecond] with `requestsPerSecond.orElse(null)`.
             */
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

            fun runId(runId: String?) = runId(JsonField.ofNullable(runId))

            /** Alias for calling [Builder.runId] with `runId.orElse(null)`. */
            fun runId(runId: Optional<String>) = runId(runId.getOrNull())

            /**
             * Sets [Builder.runId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun runId(runId: JsonField<String>) = apply { this.runId = runId }

            fun runnerContext(runnerContext: RunnerContextEnum?) =
                runnerContext(JsonField.ofNullable(runnerContext))

            /** Alias for calling [Builder.runnerContext] with `runnerContext.orElse(null)`. */
            fun runnerContext(runnerContext: Optional<RunnerContextEnum>) =
                runnerContext(runnerContext.getOrNull())

            /**
             * Sets [Builder.runnerContext] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runnerContext] with a well-typed [RunnerContextEnum]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun runnerContext(runnerContext: JsonField<RunnerContextEnum>) = apply {
                this.runnerContext = runnerContext
            }

            fun toolChoice(toolChoice: String?) = toolChoice(JsonField.ofNullable(toolChoice))

            /** Alias for calling [Builder.toolChoice] with `toolChoice.orElse(null)`. */
            fun toolChoice(toolChoice: Optional<String>) = toolChoice(toolChoice.getOrNull())

            /**
             * Sets [Builder.toolChoice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toolChoice] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun toolChoice(toolChoice: JsonField<String>) = apply { this.toolChoice = toolChoice }

            fun tools(tools: List<JsonValue>?) = tools(JsonField.ofNullable(tools))

            /** Alias for calling [Builder.tools] with `tools.orElse(null)`. */
            fun tools(tools: Optional<List<JsonValue>>) = tools(tools.getOrNull())

            /**
             * Sets [Builder.tools] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tools] with a well-typed `List<JsonValue>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tools(tools: JsonField<List<JsonValue>>) = apply {
                this.tools = tools.map { it.toMutableList() }
            }

            /**
             * Adds a single [JsonValue] to [tools].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTool(tool: JsonValue) = apply {
                tools =
                    (tools ?: JsonField.of(mutableListOf())).also {
                        checkKnown("tools", it).add(tool)
                    }
            }

            fun useOrFallbackToWorkspaceSecrets(useOrFallbackToWorkspaceSecrets: Boolean) =
                useOrFallbackToWorkspaceSecrets(JsonField.of(useOrFallbackToWorkspaceSecrets))

            /**
             * Sets [Builder.useOrFallbackToWorkspaceSecrets] to an arbitrary JSON value.
             *
             * You should usually call [Builder.useOrFallbackToWorkspaceSecrets] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun useOrFallbackToWorkspaceSecrets(
                useOrFallbackToWorkspaceSecrets: JsonField<Boolean>
            ) = apply { this.useOrFallbackToWorkspaceSecrets = useOrFallbackToWorkspaceSecrets }

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
             * .datasetId()
             * .manifest()
             * .options()
             * .projectName()
             * .secrets()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("datasetId", datasetId),
                    checkRequired("manifest", manifest),
                    checkRequired("options", options),
                    checkRequired("projectName", projectName),
                    checkRequired("secrets", secrets),
                    batchSize,
                    commit,
                    (datasetSplits ?: JsonMissing.of()).map { it.toImmutable() },
                    (evaluatorRules ?: JsonMissing.of()).map { it.toImmutable() },
                    owner,
                    parallelToolCalls,
                    repetitions,
                    repoHandle,
                    repoId,
                    requestsPerSecond,
                    runId,
                    runnerContext,
                    toolChoice,
                    (tools ?: JsonMissing.of()).map { it.toImmutable() },
                    useOrFallbackToWorkspaceSecrets,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            datasetId()
            options().validate()
            projectName()
            secrets().validate()
            batchSize()
            commit()
            datasetSplits()
            evaluatorRules()
            owner()
            parallelToolCalls()
            repetitions()
            repoHandle()
            repoId()
            requestsPerSecond()
            runId()
            runnerContext().ifPresent { it.validate() }
            toolChoice()
            tools()
            useOrFallbackToWorkspaceSecrets()
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
            (if (datasetId.asKnown().isPresent) 1 else 0) +
                (options.asKnown().getOrNull()?.validity() ?: 0) +
                (if (projectName.asKnown().isPresent) 1 else 0) +
                (secrets.asKnown().getOrNull()?.validity() ?: 0) +
                (if (batchSize.asKnown().isPresent) 1 else 0) +
                (if (commit.asKnown().isPresent) 1 else 0) +
                (datasetSplits.asKnown().getOrNull()?.size ?: 0) +
                (evaluatorRules.asKnown().getOrNull()?.size ?: 0) +
                (if (owner.asKnown().isPresent) 1 else 0) +
                (if (parallelToolCalls.asKnown().isPresent) 1 else 0) +
                (if (repetitions.asKnown().isPresent) 1 else 0) +
                (if (repoHandle.asKnown().isPresent) 1 else 0) +
                (if (repoId.asKnown().isPresent) 1 else 0) +
                (if (requestsPerSecond.asKnown().isPresent) 1 else 0) +
                (if (runId.asKnown().isPresent) 1 else 0) +
                (runnerContext.asKnown().getOrNull()?.validity() ?: 0) +
                (if (toolChoice.asKnown().isPresent) 1 else 0) +
                (tools.asKnown().getOrNull()?.size ?: 0) +
                (if (useOrFallbackToWorkspaceSecrets.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                datasetId == other.datasetId &&
                manifest == other.manifest &&
                options == other.options &&
                projectName == other.projectName &&
                secrets == other.secrets &&
                batchSize == other.batchSize &&
                commit == other.commit &&
                datasetSplits == other.datasetSplits &&
                evaluatorRules == other.evaluatorRules &&
                owner == other.owner &&
                parallelToolCalls == other.parallelToolCalls &&
                repetitions == other.repetitions &&
                repoHandle == other.repoHandle &&
                repoId == other.repoId &&
                requestsPerSecond == other.requestsPerSecond &&
                runId == other.runId &&
                runnerContext == other.runnerContext &&
                toolChoice == other.toolChoice &&
                tools == other.tools &&
                useOrFallbackToWorkspaceSecrets == other.useOrFallbackToWorkspaceSecrets &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                datasetId,
                manifest,
                options,
                projectName,
                secrets,
                batchSize,
                commit,
                datasetSplits,
                evaluatorRules,
                owner,
                parallelToolCalls,
                repetitions,
                repoHandle,
                repoId,
                requestsPerSecond,
                runId,
                runnerContext,
                toolChoice,
                tools,
                useOrFallbackToWorkspaceSecrets,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{datasetId=$datasetId, manifest=$manifest, options=$options, projectName=$projectName, secrets=$secrets, batchSize=$batchSize, commit=$commit, datasetSplits=$datasetSplits, evaluatorRules=$evaluatorRules, owner=$owner, parallelToolCalls=$parallelToolCalls, repetitions=$repetitions, repoHandle=$repoHandle, repoId=$repoId, requestsPerSecond=$requestsPerSecond, runId=$runId, runnerContext=$runnerContext, toolChoice=$toolChoice, tools=$tools, useOrFallbackToWorkspaceSecrets=$useOrFallbackToWorkspaceSecrets, additionalProperties=$additionalProperties}"
    }

    class Secrets
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

            /** Returns a mutable builder for constructing an instance of [Secrets]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Secrets]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(secrets: Secrets) = apply {
                additionalProperties = secrets.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Secrets].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Secrets = Secrets(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Secrets = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Secrets && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Secrets{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlaygroundExperimentBatchParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PlaygroundExperimentBatchParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
