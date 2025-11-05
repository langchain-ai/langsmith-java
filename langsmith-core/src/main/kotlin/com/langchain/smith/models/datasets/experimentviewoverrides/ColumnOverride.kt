// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.experimentviewoverrides

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
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ColumnOverride
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val column: JsonField<String>,
    private val colorGradient: JsonField<List<List<JsonValue>>>,
    private val colorMap: JsonField<ColorMap>,
    private val hide: JsonField<Boolean>,
    private val precision: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("column") @ExcludeMissing column: JsonField<String> = JsonMissing.of(),
        @JsonProperty("color_gradient")
        @ExcludeMissing
        colorGradient: JsonField<List<List<JsonValue>>> = JsonMissing.of(),
        @JsonProperty("color_map") @ExcludeMissing colorMap: JsonField<ColorMap> = JsonMissing.of(),
        @JsonProperty("hide") @ExcludeMissing hide: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("precision") @ExcludeMissing precision: JsonField<Long> = JsonMissing.of(),
    ) : this(column, colorGradient, colorMap, hide, precision, mutableMapOf())

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun column(): String = column.getRequired("column")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun colorGradient(): Optional<List<List<JsonValue>>> =
        colorGradient.getOptional("color_gradient")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun colorMap(): Optional<ColorMap> = colorMap.getOptional("color_map")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hide(): Optional<Boolean> = hide.getOptional("hide")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun precision(): Optional<Long> = precision.getOptional("precision")

    /**
     * Returns the raw JSON value of [column].
     *
     * Unlike [column], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("column") @ExcludeMissing fun _column(): JsonField<String> = column

    /**
     * Returns the raw JSON value of [colorGradient].
     *
     * Unlike [colorGradient], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("color_gradient")
    @ExcludeMissing
    fun _colorGradient(): JsonField<List<List<JsonValue>>> = colorGradient

    /**
     * Returns the raw JSON value of [colorMap].
     *
     * Unlike [colorMap], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("color_map") @ExcludeMissing fun _colorMap(): JsonField<ColorMap> = colorMap

    /**
     * Returns the raw JSON value of [hide].
     *
     * Unlike [hide], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hide") @ExcludeMissing fun _hide(): JsonField<Boolean> = hide

    /**
     * Returns the raw JSON value of [precision].
     *
     * Unlike [precision], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("precision") @ExcludeMissing fun _precision(): JsonField<Long> = precision

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
         * Returns a mutable builder for constructing an instance of [ColumnOverride].
         *
         * The following fields are required:
         * ```java
         * .column()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ColumnOverride]. */
    class Builder internal constructor() {

        private var column: JsonField<String>? = null
        private var colorGradient: JsonField<MutableList<List<JsonValue>>>? = null
        private var colorMap: JsonField<ColorMap> = JsonMissing.of()
        private var hide: JsonField<Boolean> = JsonMissing.of()
        private var precision: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(columnOverride: ColumnOverride) = apply {
            column = columnOverride.column
            colorGradient = columnOverride.colorGradient.map { it.toMutableList() }
            colorMap = columnOverride.colorMap
            hide = columnOverride.hide
            precision = columnOverride.precision
            additionalProperties = columnOverride.additionalProperties.toMutableMap()
        }

        fun column(column: String) = column(JsonField.of(column))

        /**
         * Sets [Builder.column] to an arbitrary JSON value.
         *
         * You should usually call [Builder.column] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun column(column: JsonField<String>) = apply { this.column = column }

        fun colorGradient(colorGradient: List<List<JsonValue>>) =
            colorGradient(JsonField.of(colorGradient))

        /**
         * Sets [Builder.colorGradient] to an arbitrary JSON value.
         *
         * You should usually call [Builder.colorGradient] with a well-typed `List<List<JsonValue>>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun colorGradient(colorGradient: JsonField<List<List<JsonValue>>>) = apply {
            this.colorGradient = colorGradient.map { it.toMutableList() }
        }

        /**
         * Adds a single [List<JsonValue>] to [Builder.colorGradient].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addColorGradient(colorGradient: List<JsonValue>) = apply {
            this.colorGradient =
                (this.colorGradient ?: JsonField.of(mutableListOf())).also {
                    checkKnown("colorGradient", it).add(colorGradient)
                }
        }

        fun colorMap(colorMap: ColorMap) = colorMap(JsonField.of(colorMap))

        /**
         * Sets [Builder.colorMap] to an arbitrary JSON value.
         *
         * You should usually call [Builder.colorMap] with a well-typed [ColorMap] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun colorMap(colorMap: JsonField<ColorMap>) = apply { this.colorMap = colorMap }

        fun hide(hide: Boolean) = hide(JsonField.of(hide))

        /**
         * Sets [Builder.hide] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hide] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hide(hide: JsonField<Boolean>) = apply { this.hide = hide }

        fun precision(precision: Long) = precision(JsonField.of(precision))

        /**
         * Sets [Builder.precision] to an arbitrary JSON value.
         *
         * You should usually call [Builder.precision] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun precision(precision: JsonField<Long>) = apply { this.precision = precision }

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
         * Returns an immutable instance of [ColumnOverride].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .column()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ColumnOverride =
            ColumnOverride(
                checkRequired("column", column),
                (colorGradient ?: JsonMissing.of()).map { it.toImmutable() },
                colorMap,
                hide,
                precision,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ColumnOverride = apply {
        if (validated) {
            return@apply
        }

        column()
        colorGradient()
        colorMap().ifPresent { it.validate() }
        hide()
        precision()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LangsmithInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (column.asKnown().isPresent) 1 else 0) +
            (colorGradient.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
            (colorMap.asKnown().getOrNull()?.validity() ?: 0) +
            (if (hide.asKnown().isPresent) 1 else 0) +
            (if (precision.asKnown().isPresent) 1 else 0)

    class ColorMap
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

            /** Returns a mutable builder for constructing an instance of [ColorMap]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ColorMap]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(colorMap: ColorMap) = apply {
                additionalProperties = colorMap.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ColorMap].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ColorMap = ColorMap(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ColorMap = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangsmithInvalidDataException) {
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

            return other is ColorMap && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ColorMap{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ColumnOverride &&
            column == other.column &&
            colorGradient == other.colorGradient &&
            colorMap == other.colorMap &&
            hide == other.hide &&
            precision == other.precision &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(column, colorGradient, colorMap, hide, precision, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ColumnOverride{column=$column, colorGradient=$colorGradient, colorMap=$colorMap, hide=$hide, precision=$precision, additionalProperties=$additionalProperties}"
}
