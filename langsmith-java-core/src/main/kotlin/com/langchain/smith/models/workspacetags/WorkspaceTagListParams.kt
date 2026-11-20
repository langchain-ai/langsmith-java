// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspacetags

import com.fasterxml.jackson.annotation.JsonCreator
import com.langchain.smith.core.Enum
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.Params
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * List the workspace's tag keys, each with its values.
 *
 * With resource_type, only values applied to at least one resource of that type are returned, and
 * keys with no such values are left out.
 */
class WorkspaceTagListParams
private constructor(
    private val resourceType: ResourceType?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun resourceType(): Optional<ResourceType> = Optional.ofNullable(resourceType)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): WorkspaceTagListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [WorkspaceTagListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WorkspaceTagListParams]. */
    class Builder internal constructor() {

        private var resourceType: ResourceType? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(workspaceTagListParams: WorkspaceTagListParams) = apply {
            resourceType = workspaceTagListParams.resourceType
            additionalHeaders = workspaceTagListParams.additionalHeaders.toBuilder()
            additionalQueryParams = workspaceTagListParams.additionalQueryParams.toBuilder()
        }

        fun resourceType(resourceType: ResourceType?) = apply { this.resourceType = resourceType }

        /** Alias for calling [Builder.resourceType] with `resourceType.orElse(null)`. */
        fun resourceType(resourceType: Optional<ResourceType>) =
            resourceType(resourceType.getOrNull())

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
         * Returns an immutable instance of [WorkspaceTagListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WorkspaceTagListParams =
            WorkspaceTagListParams(
                resourceType,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                resourceType?.let { put("resource_type", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    class ResourceType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val AGENT = of("agent")

            @JvmField val CUSTOM_APP = of("custom_app")

            @JvmField val DASHBOARD = of("dashboard")

            @JvmField val DATASET = of("dataset")

            @JvmField val DEPLOYMENT = of("deployment")

            @JvmField val EVALUATOR = of("evaluator")

            @JvmField val EXPERIMENT = of("experiment")

            @JvmField val FLEET_INTEGRATION = of("fleet_integration")

            @JvmField val MCP_SERVER = of("mcp_server")

            @JvmField val PROJECT = of("project")

            @JvmField val PROMPT = of("prompt")

            @JvmField val QUEUE = of("queue")

            @JvmField val SANDBOX = of("sandbox")

            @JvmField val SKILL = of("skill")

            @JvmField val SNAPSHOT_NAME = of("snapshot_name")

            @JvmStatic fun of(value: String) = ResourceType(JsonField.of(value))
        }

        /** An enum containing [ResourceType]'s known values. */
        enum class Known {
            AGENT,
            CUSTOM_APP,
            DASHBOARD,
            DATASET,
            DEPLOYMENT,
            EVALUATOR,
            EXPERIMENT,
            FLEET_INTEGRATION,
            MCP_SERVER,
            PROJECT,
            PROMPT,
            QUEUE,
            SANDBOX,
            SKILL,
            SNAPSHOT_NAME,
        }

        /**
         * An enum containing [ResourceType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ResourceType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AGENT,
            CUSTOM_APP,
            DASHBOARD,
            DATASET,
            DEPLOYMENT,
            EVALUATOR,
            EXPERIMENT,
            FLEET_INTEGRATION,
            MCP_SERVER,
            PROJECT,
            PROMPT,
            QUEUE,
            SANDBOX,
            SKILL,
            SNAPSHOT_NAME,
            /**
             * An enum member indicating that [ResourceType] was instantiated with an unknown value.
             */
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
                AGENT -> Value.AGENT
                CUSTOM_APP -> Value.CUSTOM_APP
                DASHBOARD -> Value.DASHBOARD
                DATASET -> Value.DATASET
                DEPLOYMENT -> Value.DEPLOYMENT
                EVALUATOR -> Value.EVALUATOR
                EXPERIMENT -> Value.EXPERIMENT
                FLEET_INTEGRATION -> Value.FLEET_INTEGRATION
                MCP_SERVER -> Value.MCP_SERVER
                PROJECT -> Value.PROJECT
                PROMPT -> Value.PROMPT
                QUEUE -> Value.QUEUE
                SANDBOX -> Value.SANDBOX
                SKILL -> Value.SKILL
                SNAPSHOT_NAME -> Value.SNAPSHOT_NAME
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
                AGENT -> Known.AGENT
                CUSTOM_APP -> Known.CUSTOM_APP
                DASHBOARD -> Known.DASHBOARD
                DATASET -> Known.DATASET
                DEPLOYMENT -> Known.DEPLOYMENT
                EVALUATOR -> Known.EVALUATOR
                EXPERIMENT -> Known.EXPERIMENT
                FLEET_INTEGRATION -> Known.FLEET_INTEGRATION
                MCP_SERVER -> Known.MCP_SERVER
                PROJECT -> Known.PROJECT
                PROMPT -> Known.PROMPT
                QUEUE -> Known.QUEUE
                SANDBOX -> Known.SANDBOX
                SKILL -> Known.SKILL
                SNAPSHOT_NAME -> Known.SNAPSHOT_NAME
                else -> throw LangChainInvalidDataException("Unknown ResourceType: $value")
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
        fun validate(): ResourceType = apply {
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

            return other is ResourceType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WorkspaceTagListParams &&
            resourceType == other.resourceType &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(resourceType, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "WorkspaceTagListParams{resourceType=$resourceType, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
