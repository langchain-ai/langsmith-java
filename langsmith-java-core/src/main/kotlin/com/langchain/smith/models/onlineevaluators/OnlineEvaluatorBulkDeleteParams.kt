// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Delete multiple evaluators by their IDs. Returns per-item success/failure. */
class OnlineEvaluatorBulkDeleteParams
private constructor(
    private val evaluatorIds: List<String>,
    private val deleteRunRules: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) : Params {

    /** Evaluator IDs to delete */
    fun evaluatorIds(): List<String> = evaluatorIds

    /** When true, delete all run rules for this evaluator before deleting the evaluator */
    fun deleteRunRules(): Optional<Boolean> = Optional.ofNullable(deleteRunRules)

    /** Additional body properties to send with the request. */
    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [OnlineEvaluatorBulkDeleteParams].
         *
         * The following fields are required:
         * ```java
         * .evaluatorIds()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OnlineEvaluatorBulkDeleteParams]. */
    class Builder internal constructor() {

        private var evaluatorIds: MutableList<String>? = null
        private var deleteRunRules: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(onlineEvaluatorBulkDeleteParams: OnlineEvaluatorBulkDeleteParams) =
            apply {
                evaluatorIds = onlineEvaluatorBulkDeleteParams.evaluatorIds.toMutableList()
                deleteRunRules = onlineEvaluatorBulkDeleteParams.deleteRunRules
                additionalHeaders = onlineEvaluatorBulkDeleteParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    onlineEvaluatorBulkDeleteParams.additionalQueryParams.toBuilder()
                additionalBodyProperties =
                    onlineEvaluatorBulkDeleteParams.additionalBodyProperties.toMutableMap()
            }

        /** Evaluator IDs to delete */
        fun evaluatorIds(evaluatorIds: List<String>) = apply {
            this.evaluatorIds = evaluatorIds.toMutableList()
        }

        /**
         * Adds a single [String] to [evaluatorIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvaluatorId(evaluatorId: String) = apply {
            evaluatorIds = (evaluatorIds ?: mutableListOf()).apply { add(evaluatorId) }
        }

        /** When true, delete all run rules for this evaluator before deleting the evaluator */
        fun deleteRunRules(deleteRunRules: Boolean?) = apply {
            this.deleteRunRules = deleteRunRules
        }

        /**
         * Alias for [Builder.deleteRunRules].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun deleteRunRules(deleteRunRules: Boolean) = deleteRunRules(deleteRunRules as Boolean?)

        /** Alias for calling [Builder.deleteRunRules] with `deleteRunRules.orElse(null)`. */
        fun deleteRunRules(deleteRunRules: Optional<Boolean>) =
            deleteRunRules(deleteRunRules.getOrNull())

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        /**
         * Returns an immutable instance of [OnlineEvaluatorBulkDeleteParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .evaluatorIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OnlineEvaluatorBulkDeleteParams =
            OnlineEvaluatorBulkDeleteParams(
                checkRequired("evaluatorIds", evaluatorIds).toImmutable(),
                deleteRunRules,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    fun _body(): Optional<Map<String, JsonValue>> =
        Optional.ofNullable(additionalBodyProperties.ifEmpty { null })

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("evaluator_ids", evaluatorIds.joinToString(","))
                deleteRunRules?.let { put("delete_run_rules", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OnlineEvaluatorBulkDeleteParams &&
            evaluatorIds == other.evaluatorIds &&
            deleteRunRules == other.deleteRunRules &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int =
        Objects.hash(
            evaluatorIds,
            deleteRunRules,
            additionalHeaders,
            additionalQueryParams,
            additionalBodyProperties,
        )

    override fun toString() =
        "OnlineEvaluatorBulkDeleteParams{evaluatorIds=$evaluatorIds, deleteRunRules=$deleteRunRules, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
