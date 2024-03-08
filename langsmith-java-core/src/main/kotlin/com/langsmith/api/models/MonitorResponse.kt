// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.langsmith.api.core.ExcludeMissing
import com.langsmith.api.core.JsonField
import com.langsmith.api.core.JsonMissing
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = MonitorResponse.Builder::class)
@NoAutoDetect
class MonitorResponse
private constructor(
    private val blocks: JsonField<List<Block>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun blocks(): List<Block> = blocks.getRequired("blocks")

    @JsonProperty("blocks") @ExcludeMissing fun _blocks() = blocks

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): MonitorResponse = apply {
        if (!validated) {
            blocks().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MonitorResponse &&
            this.blocks == other.blocks &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(blocks, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "MonitorResponse{blocks=$blocks, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var blocks: JsonField<List<Block>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(monitorResponse: MonitorResponse) = apply {
            this.blocks = monitorResponse.blocks
            additionalProperties(monitorResponse.additionalProperties)
        }

        fun blocks(blocks: List<Block>) = blocks(JsonField.of(blocks))

        @JsonProperty("blocks")
        @ExcludeMissing
        fun blocks(blocks: JsonField<List<Block>>) = apply { this.blocks = blocks }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): MonitorResponse =
            MonitorResponse(
                blocks.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable()
            )
    }

    @JsonDeserialize(builder = Block.Builder::class)
    @NoAutoDetect
    class Block
    private constructor(
        private val title: JsonField<String>,
        private val section: JsonField<String>,
        private val columns: JsonField<List<String>>,
        private val subtitle: JsonField<String>,
        private val rows: JsonField<List<List<JsonValue>>>,
        private val chartSpec: JsonValue,
        private val clickTarget: JsonField<String>,
        private val toggleableMarks: JsonField<ToggleableMarks>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun title(): String = title.getRequired("title")

        fun section(): String = section.getRequired("section")

        fun columns(): List<String> = columns.getRequired("columns")

        fun subtitle(): Optional<String> = Optional.ofNullable(subtitle.getNullable("subtitle"))

        fun rows(): List<List<JsonValue>> = rows.getRequired("rows")

        fun clickTarget(): Optional<String> =
            Optional.ofNullable(clickTarget.getNullable("click_target"))

        fun toggleableMarks(): Optional<ToggleableMarks> =
            Optional.ofNullable(toggleableMarks.getNullable("toggleable_marks"))

        @JsonProperty("title") @ExcludeMissing fun _title() = title

        @JsonProperty("section") @ExcludeMissing fun _section() = section

        @JsonProperty("columns") @ExcludeMissing fun _columns() = columns

        @JsonProperty("subtitle") @ExcludeMissing fun _subtitle() = subtitle

        @JsonProperty("rows") @ExcludeMissing fun _rows() = rows

        @JsonProperty("chart_spec") @ExcludeMissing fun _chartSpec() = chartSpec

        @JsonProperty("click_target") @ExcludeMissing fun _clickTarget() = clickTarget

        @JsonProperty("toggleable_marks") @ExcludeMissing fun _toggleableMarks() = toggleableMarks

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Block = apply {
            if (!validated) {
                title()
                section()
                columns()
                subtitle()
                rows()
                clickTarget()
                toggleableMarks().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Block &&
                this.title == other.title &&
                this.section == other.section &&
                this.columns == other.columns &&
                this.subtitle == other.subtitle &&
                this.rows == other.rows &&
                this.chartSpec == other.chartSpec &&
                this.clickTarget == other.clickTarget &&
                this.toggleableMarks == other.toggleableMarks &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        title,
                        section,
                        columns,
                        subtitle,
                        rows,
                        chartSpec,
                        clickTarget,
                        toggleableMarks,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Block{title=$title, section=$section, columns=$columns, subtitle=$subtitle, rows=$rows, chartSpec=$chartSpec, clickTarget=$clickTarget, toggleableMarks=$toggleableMarks, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var title: JsonField<String> = JsonMissing.of()
            private var section: JsonField<String> = JsonMissing.of()
            private var columns: JsonField<List<String>> = JsonMissing.of()
            private var subtitle: JsonField<String> = JsonMissing.of()
            private var rows: JsonField<List<List<JsonValue>>> = JsonMissing.of()
            private var chartSpec: JsonValue = JsonMissing.of()
            private var clickTarget: JsonField<String> = JsonMissing.of()
            private var toggleableMarks: JsonField<ToggleableMarks> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(block: Block) = apply {
                this.title = block.title
                this.section = block.section
                this.columns = block.columns
                this.subtitle = block.subtitle
                this.rows = block.rows
                this.chartSpec = block.chartSpec
                this.clickTarget = block.clickTarget
                this.toggleableMarks = block.toggleableMarks
                additionalProperties(block.additionalProperties)
            }

            fun title(title: String) = title(JsonField.of(title))

            @JsonProperty("title")
            @ExcludeMissing
            fun title(title: JsonField<String>) = apply { this.title = title }

            fun section(section: String) = section(JsonField.of(section))

            @JsonProperty("section")
            @ExcludeMissing
            fun section(section: JsonField<String>) = apply { this.section = section }

            fun columns(columns: List<String>) = columns(JsonField.of(columns))

            @JsonProperty("columns")
            @ExcludeMissing
            fun columns(columns: JsonField<List<String>>) = apply { this.columns = columns }

            fun subtitle(subtitle: String) = subtitle(JsonField.of(subtitle))

            @JsonProperty("subtitle")
            @ExcludeMissing
            fun subtitle(subtitle: JsonField<String>) = apply { this.subtitle = subtitle }

            fun rows(rows: List<List<JsonValue>>) = rows(JsonField.of(rows))

            @JsonProperty("rows")
            @ExcludeMissing
            fun rows(rows: JsonField<List<List<JsonValue>>>) = apply { this.rows = rows }

            @JsonProperty("chart_spec")
            @ExcludeMissing
            fun chartSpec(chartSpec: JsonValue) = apply { this.chartSpec = chartSpec }

            fun clickTarget(clickTarget: String) = clickTarget(JsonField.of(clickTarget))

            @JsonProperty("click_target")
            @ExcludeMissing
            fun clickTarget(clickTarget: JsonField<String>) = apply {
                this.clickTarget = clickTarget
            }

            fun toggleableMarks(toggleableMarks: ToggleableMarks) =
                toggleableMarks(JsonField.of(toggleableMarks))

            @JsonProperty("toggleable_marks")
            @ExcludeMissing
            fun toggleableMarks(toggleableMarks: JsonField<ToggleableMarks>) = apply {
                this.toggleableMarks = toggleableMarks
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Block =
                Block(
                    title,
                    section,
                    columns.map { it.toUnmodifiable() },
                    subtitle,
                    rows.map { it.toUnmodifiable() },
                    chartSpec,
                    clickTarget,
                    toggleableMarks,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = ToggleableMarks.Builder::class)
        @NoAutoDetect
        class ToggleableMarks
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ToggleableMarks = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ToggleableMarks &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "ToggleableMarks{additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(toggleableMarks: ToggleableMarks) = apply {
                    additionalProperties(toggleableMarks.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ToggleableMarks =
                    ToggleableMarks(additionalProperties.toUnmodifiable())
            }
        }
    }
}
