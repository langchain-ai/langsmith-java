// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sql

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

class SqlQueryResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val columns: JsonField<List<Column>>,
    private val executionTimeMs: JsonField<Double>,
    private val isTruncated: JsonField<Boolean>,
    private val rowCount: JsonField<Long>,
    private val rows: JsonField<List<List<JsonValue>>>,
    private val truncationReason: JsonField<TruncationReason>,
    private val warnings: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("columns")
        @ExcludeMissing
        columns: JsonField<List<Column>> = JsonMissing.of(),
        @JsonProperty("execution_time_ms")
        @ExcludeMissing
        executionTimeMs: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("is_truncated")
        @ExcludeMissing
        isTruncated: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("row_count") @ExcludeMissing rowCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("rows")
        @ExcludeMissing
        rows: JsonField<List<List<JsonValue>>> = JsonMissing.of(),
        @JsonProperty("truncation_reason")
        @ExcludeMissing
        truncationReason: JsonField<TruncationReason> = JsonMissing.of(),
        @JsonProperty("warnings")
        @ExcludeMissing
        warnings: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        columns,
        executionTimeMs,
        isTruncated,
        rowCount,
        rows,
        truncationReason,
        warnings,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun columns(): Optional<List<Column>> = columns.getOptional("columns")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun executionTimeMs(): Optional<Double> = executionTimeMs.getOptional("execution_time_ms")

    /**
     * IsTruncated reports that the query matched rows not included in Rows.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isTruncated(): Optional<Boolean> = isTruncated.getOptional("is_truncated")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rowCount(): Optional<Long> = rowCount.getOptional("row_count")

    /**
     * Rows holds at most the configured row limit (1000 by default), each ordered like Columns.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rows(): Optional<List<List<JsonValue>>> = rows.getOptional("rows")

    /**
     * TruncationReason is "row_limit" when the query matched more rows than the row limit,
     * "size_limit" when the rows past about 10 MB were left out, or null.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun truncationReason(): Optional<TruncationReason> =
        truncationReason.getOptional("truncation_reason")

    /**
     * Warnings contains query planning warnings. Empty when there are no warnings.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun warnings(): Optional<List<String>> = warnings.getOptional("warnings")

    /**
     * Returns the raw JSON value of [columns].
     *
     * Unlike [columns], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("columns") @ExcludeMissing fun _columns(): JsonField<List<Column>> = columns

    /**
     * Returns the raw JSON value of [executionTimeMs].
     *
     * Unlike [executionTimeMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("execution_time_ms")
    @ExcludeMissing
    fun _executionTimeMs(): JsonField<Double> = executionTimeMs

    /**
     * Returns the raw JSON value of [isTruncated].
     *
     * Unlike [isTruncated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_truncated")
    @ExcludeMissing
    fun _isTruncated(): JsonField<Boolean> = isTruncated

    /**
     * Returns the raw JSON value of [rowCount].
     *
     * Unlike [rowCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("row_count") @ExcludeMissing fun _rowCount(): JsonField<Long> = rowCount

    /**
     * Returns the raw JSON value of [rows].
     *
     * Unlike [rows], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rows") @ExcludeMissing fun _rows(): JsonField<List<List<JsonValue>>> = rows

    /**
     * Returns the raw JSON value of [truncationReason].
     *
     * Unlike [truncationReason], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("truncation_reason")
    @ExcludeMissing
    fun _truncationReason(): JsonField<TruncationReason> = truncationReason

    /**
     * Returns the raw JSON value of [warnings].
     *
     * Unlike [warnings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("warnings") @ExcludeMissing fun _warnings(): JsonField<List<String>> = warnings

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

        /** Returns a mutable builder for constructing an instance of [SqlQueryResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SqlQueryResponse]. */
    class Builder internal constructor() {

        private var columns: JsonField<MutableList<Column>>? = null
        private var executionTimeMs: JsonField<Double> = JsonMissing.of()
        private var isTruncated: JsonField<Boolean> = JsonMissing.of()
        private var rowCount: JsonField<Long> = JsonMissing.of()
        private var rows: JsonField<MutableList<List<JsonValue>>>? = null
        private var truncationReason: JsonField<TruncationReason> = JsonMissing.of()
        private var warnings: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sqlQueryResponse: SqlQueryResponse) = apply {
            columns = sqlQueryResponse.columns.map { it.toMutableList() }
            executionTimeMs = sqlQueryResponse.executionTimeMs
            isTruncated = sqlQueryResponse.isTruncated
            rowCount = sqlQueryResponse.rowCount
            rows = sqlQueryResponse.rows.map { it.toMutableList() }
            truncationReason = sqlQueryResponse.truncationReason
            warnings = sqlQueryResponse.warnings.map { it.toMutableList() }
            additionalProperties = sqlQueryResponse.additionalProperties.toMutableMap()
        }

        fun columns(columns: List<Column>) = columns(JsonField.of(columns))

        /**
         * Sets [Builder.columns] to an arbitrary JSON value.
         *
         * You should usually call [Builder.columns] with a well-typed `List<Column>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun columns(columns: JsonField<List<Column>>) = apply {
            this.columns = columns.map { it.toMutableList() }
        }

        /**
         * Adds a single [Column] to [columns].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addColumn(column: Column) = apply {
            columns =
                (columns ?: JsonField.of(mutableListOf())).also {
                    checkKnown("columns", it).add(column)
                }
        }

        fun executionTimeMs(executionTimeMs: Double) =
            executionTimeMs(JsonField.of(executionTimeMs))

        /**
         * Sets [Builder.executionTimeMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.executionTimeMs] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun executionTimeMs(executionTimeMs: JsonField<Double>) = apply {
            this.executionTimeMs = executionTimeMs
        }

        /** IsTruncated reports that the query matched rows not included in Rows. */
        fun isTruncated(isTruncated: Boolean) = isTruncated(JsonField.of(isTruncated))

        /**
         * Sets [Builder.isTruncated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isTruncated] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isTruncated(isTruncated: JsonField<Boolean>) = apply { this.isTruncated = isTruncated }

        fun rowCount(rowCount: Long) = rowCount(JsonField.of(rowCount))

        /**
         * Sets [Builder.rowCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rowCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rowCount(rowCount: JsonField<Long>) = apply { this.rowCount = rowCount }

        /**
         * Rows holds at most the configured row limit (1000 by default), each ordered like Columns.
         */
        fun rows(rows: List<List<JsonValue>>) = rows(JsonField.of(rows))

        /**
         * Sets [Builder.rows] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rows] with a well-typed `List<List<JsonValue>>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rows(rows: JsonField<List<List<JsonValue>>>) = apply {
            this.rows = rows.map { it.toMutableList() }
        }

        /**
         * Adds a single [List<JsonValue>] to [rows].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRow(row: List<JsonValue>) = apply {
            rows = (rows ?: JsonField.of(mutableListOf())).also { checkKnown("rows", it).add(row) }
        }

        /**
         * TruncationReason is "row_limit" when the query matched more rows than the row limit,
         * "size_limit" when the rows past about 10 MB were left out, or null.
         */
        fun truncationReason(truncationReason: TruncationReason?) =
            truncationReason(JsonField.ofNullable(truncationReason))

        /** Alias for calling [Builder.truncationReason] with `truncationReason.orElse(null)`. */
        fun truncationReason(truncationReason: Optional<TruncationReason>) =
            truncationReason(truncationReason.getOrNull())

        /**
         * Sets [Builder.truncationReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.truncationReason] with a well-typed [TruncationReason]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun truncationReason(truncationReason: JsonField<TruncationReason>) = apply {
            this.truncationReason = truncationReason
        }

        /** Warnings contains query planning warnings. Empty when there are no warnings. */
        fun warnings(warnings: List<String>) = warnings(JsonField.of(warnings))

        /**
         * Sets [Builder.warnings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.warnings] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun warnings(warnings: JsonField<List<String>>) = apply {
            this.warnings = warnings.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [warnings].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWarning(warning: String) = apply {
            warnings =
                (warnings ?: JsonField.of(mutableListOf())).also {
                    checkKnown("warnings", it).add(warning)
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
         * Returns an immutable instance of [SqlQueryResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SqlQueryResponse =
            SqlQueryResponse(
                (columns ?: JsonMissing.of()).map { it.toImmutable() },
                executionTimeMs,
                isTruncated,
                rowCount,
                (rows ?: JsonMissing.of()).map { it.toImmutable() },
                truncationReason,
                (warnings ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): SqlQueryResponse = apply {
        if (validated) {
            return@apply
        }

        columns().ifPresent { it.forEach { it.validate() } }
        executionTimeMs()
        isTruncated()
        rowCount()
        rows()
        truncationReason().ifPresent { it.validate() }
        warnings()
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
        (columns.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (executionTimeMs.asKnown().isPresent) 1 else 0) +
            (if (isTruncated.asKnown().isPresent) 1 else 0) +
            (if (rowCount.asKnown().isPresent) 1 else 0) +
            (rows.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
            (truncationReason.asKnown().getOrNull()?.validity() ?: 0) +
            (warnings.asKnown().getOrNull()?.size ?: 0)

    class Column
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val dataType: JsonField<DataType>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data_type")
            @ExcludeMissing
            dataType: JsonField<DataType> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(dataType, name, mutableMapOf())

        /**
         * DataType is how the column's values are encoded in JSON: uuid, string, integer, float,
         * boolean, timestamp and date (RFC 3339 strings), binary (base64 strings), list, object or
         * null. Float values JSON cannot represent are the strings "NaN", "Infinity" and
         * "-Infinity".
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dataType(): Optional<DataType> = dataType.getOptional("data_type")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [dataType].
         *
         * Unlike [dataType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data_type") @ExcludeMissing fun _dataType(): JsonField<DataType> = dataType

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

            /** Returns a mutable builder for constructing an instance of [Column]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Column]. */
        class Builder internal constructor() {

            private var dataType: JsonField<DataType> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(column: Column) = apply {
                dataType = column.dataType
                name = column.name
                additionalProperties = column.additionalProperties.toMutableMap()
            }

            /**
             * DataType is how the column's values are encoded in JSON: uuid, string, integer,
             * float, boolean, timestamp and date (RFC 3339 strings), binary (base64 strings), list,
             * object or null. Float values JSON cannot represent are the strings "NaN", "Infinity"
             * and "-Infinity".
             */
            fun dataType(dataType: DataType) = dataType(JsonField.of(dataType))

            /**
             * Sets [Builder.dataType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataType] with a well-typed [DataType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataType(dataType: JsonField<DataType>) = apply { this.dataType = dataType }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [Column].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Column = Column(dataType, name, additionalProperties.toMutableMap())
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
        fun validate(): Column = apply {
            if (validated) {
                return@apply
            }

            dataType().ifPresent { it.validate() }
            name()
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
            (dataType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        /**
         * DataType is how the column's values are encoded in JSON: uuid, string, integer, float,
         * boolean, timestamp and date (RFC 3339 strings), binary (base64 strings), list, object or
         * null. Float values JSON cannot represent are the strings "NaN", "Infinity" and
         * "-Infinity".
         */
        class DataType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val UUID = of("uuid")

                @JvmField val STRING = of("string")

                @JvmField val INTEGER = of("integer")

                @JvmField val FLOAT = of("float")

                @JvmField val BOOLEAN = of("boolean")

                @JvmField val TIMESTAMP = of("timestamp")

                @JvmField val DATE = of("date")

                @JvmField val BINARY = of("binary")

                @JvmField val LIST = of("list")

                @JvmField val OBJECT = of("object")

                @JvmField val NULL = of("null")

                @JvmStatic fun of(value: String) = DataType(JsonField.of(value))
            }

            /** An enum containing [DataType]'s known values. */
            enum class Known {
                UUID,
                STRING,
                INTEGER,
                FLOAT,
                BOOLEAN,
                TIMESTAMP,
                DATE,
                BINARY,
                LIST,
                OBJECT,
                NULL,
            }

            /**
             * An enum containing [DataType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DataType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                UUID,
                STRING,
                INTEGER,
                FLOAT,
                BOOLEAN,
                TIMESTAMP,
                DATE,
                BINARY,
                LIST,
                OBJECT,
                NULL,
                /**
                 * An enum member indicating that [DataType] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    UUID -> Value.UUID
                    STRING -> Value.STRING
                    INTEGER -> Value.INTEGER
                    FLOAT -> Value.FLOAT
                    BOOLEAN -> Value.BOOLEAN
                    TIMESTAMP -> Value.TIMESTAMP
                    DATE -> Value.DATE
                    BINARY -> Value.BINARY
                    LIST -> Value.LIST
                    OBJECT -> Value.OBJECT
                    NULL -> Value.NULL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LangChainInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    UUID -> Known.UUID
                    STRING -> Known.STRING
                    INTEGER -> Known.INTEGER
                    FLOAT -> Known.FLOAT
                    BOOLEAN -> Known.BOOLEAN
                    TIMESTAMP -> Known.TIMESTAMP
                    DATE -> Known.DATE
                    BINARY -> Known.BINARY
                    LIST -> Known.LIST
                    OBJECT -> Known.OBJECT
                    NULL -> Known.NULL
                    else -> throw LangChainInvalidDataException("Unknown DataType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LangChainInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): DataType = apply {
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

                return other is DataType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Column &&
                dataType == other.dataType &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(dataType, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Column{dataType=$dataType, name=$name, additionalProperties=$additionalProperties}"
    }

    /**
     * TruncationReason is "row_limit" when the query matched more rows than the row limit,
     * "size_limit" when the rows past about 10 MB were left out, or null.
     */
    class TruncationReason @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ROW_LIMIT = of("row_limit")

            @JvmField val SIZE_LIMIT = of("size_limit")

            @JvmStatic fun of(value: String) = TruncationReason(JsonField.of(value))
        }

        /** An enum containing [TruncationReason]'s known values. */
        enum class Known {
            ROW_LIMIT,
            SIZE_LIMIT,
        }

        /**
         * An enum containing [TruncationReason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TruncationReason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ROW_LIMIT,
            SIZE_LIMIT,
            /**
             * An enum member indicating that [TruncationReason] was instantiated with an unknown
             * value.
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
                ROW_LIMIT -> Value.ROW_LIMIT
                SIZE_LIMIT -> Value.SIZE_LIMIT
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
                ROW_LIMIT -> Known.ROW_LIMIT
                SIZE_LIMIT -> Known.SIZE_LIMIT
                else -> throw LangChainInvalidDataException("Unknown TruncationReason: $value")
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
        fun validate(): TruncationReason = apply {
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

            return other is TruncationReason && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SqlQueryResponse &&
            columns == other.columns &&
            executionTimeMs == other.executionTimeMs &&
            isTruncated == other.isTruncated &&
            rowCount == other.rowCount &&
            rows == other.rows &&
            truncationReason == other.truncationReason &&
            warnings == other.warnings &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            columns,
            executionTimeMs,
            isTruncated,
            rowCount,
            rows,
            truncationReason,
            warnings,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SqlQueryResponse{columns=$columns, executionTimeMs=$executionTimeMs, isTruncated=$isTruncated, rowCount=$rowCount, rows=$rows, truncationReason=$truncationReason, warnings=$warnings, additionalProperties=$additionalProperties}"
}
