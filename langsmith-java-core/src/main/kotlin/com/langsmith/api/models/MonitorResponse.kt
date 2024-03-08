// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

// //
// templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnyGetter // templates/JavaSDK/components/file.ts:28:17
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

@JsonDeserialize(
    builder = MonitorResponse.Builder::class
) // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13
@NoAutoDetect
class MonitorResponse
private constructor(
    private val blocks: JsonField<List<MonitorBlock>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
    // templates/JavaSDK/entities/objects.ts:76:13

    private var hashCode: Int = 0

    fun blocks(): List<MonitorBlock> = blocks.getRequired("blocks")

    @JsonProperty("blocks") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _blocks() = blocks

    @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
    // templates/JavaSDK/entities/objects.ts:180:12
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): MonitorResponse = apply { // templates/JavaSDK/entities/objects.ts:198:28
        if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:198:28 //
            // templates/JavaSDK/entities/objects.ts:198:28
            blocks().forEach { it.validate() } // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:201:20
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is MonitorResponse && // templates/JavaSDK/entities/fields.ts:143:33
            this.blocks == other.blocks &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        if (hashCode == 0) { // templates/JavaSDK/entities/fields.ts:175:16 //
            // templates/JavaSDK/entities/fields.ts:174:16 //
            // templates/JavaSDK/entities/fields.ts:174:16
            hashCode = Objects.hash(blocks, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "MonitorResponse{blocks=$blocks, additionalProperties=$additionalProperties}"

    companion object { // templates/JavaSDK/entities/objects.ts:217:10

        @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
        // templates/JavaSDK/entities/objects.ts:217:10
        fun builder() = Builder()
    }

    class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10

        private var blocks: JsonField<List<MonitorBlock>> =
            JsonMissing.of() // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:224:10
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
        internal fun from(monitorResponse: MonitorResponse) =
            apply { // templates/JavaSDK/entities/objects.ts:240:30
                this.blocks =
                    monitorResponse.blocks // templates/JavaSDK/entities/objects.ts:240:30 //
                // templates/JavaSDK/entities/objects.ts:240:30
                additionalProperties(monitorResponse.additionalProperties)
            }

        fun blocks(blocks: List<MonitorBlock>) =
            blocks(JsonField.of(blocks)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("blocks") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun blocks(blocks: JsonField<List<MonitorBlock>>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.blocks = blocks
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/entities/objects.ts:290:30
                this.additionalProperties.clear() // templates/JavaSDK/entities/objects.ts:290:30 //
                // templates/JavaSDK/entities/objects.ts:290:30
                this.additionalProperties.putAll(additionalProperties)
            }

        @JsonAnySetter // templates/JavaSDK/entities/objects.ts:299:14
        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply { // templates/JavaSDK/entities/objects.ts:304:30
                this.additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/entities/objects.ts:316:30
                this.additionalProperties.putAll(additionalProperties)
            }

        fun build(): MonitorResponse =
            MonitorResponse(
                blocks.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable()
            )
    }

    @JsonDeserialize(
        builder = MonitorBlock.Builder::class
    ) // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13
    // // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13
    @NoAutoDetect
    class MonitorBlock
    private constructor( // templates/JavaSDK/entities/objects.ts:76:13
        private val title: JsonField<String>, // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
        private val section: JsonField<String>,
        private val columns: JsonField<List<String>>,
        private val subtitle: JsonField<String>,
        private val rows: JsonField<List<List<JsonValue>>>,
        private val chartSpec: JsonValue,
        private val clickTarget: JsonField<String>,
        private val toggleableMarks: JsonField<ToggleableMarks>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
        // templates/JavaSDK/entities/objects.ts:76:13

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

        @JsonProperty("title") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _title() = title

        @JsonProperty("section") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _section() = section

        @JsonProperty("columns") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _columns() = columns

        @JsonProperty("subtitle") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _subtitle() = subtitle

        @JsonProperty("rows") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _rows() = rows

        @JsonProperty("chart_spec") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _chartSpec() = chartSpec

        @JsonProperty("click_target") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _clickTarget() = clickTarget

        @JsonProperty("toggleable_marks") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _toggleableMarks() = toggleableMarks

        @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
        // templates/JavaSDK/entities/objects.ts:180:12
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): MonitorBlock = apply { // templates/JavaSDK/entities/objects.ts:198:28
            if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
                // templates/JavaSDK/entities/objects.ts:198:28 //
                // templates/JavaSDK/entities/objects.ts:198:28
                title() // templates/JavaSDK/entities/objects.ts:201:20 //
                // templates/JavaSDK/entities/objects.ts:201:20
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

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is MonitorBlock && // templates/JavaSDK/entities/fields.ts:143:33
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

        override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
            if (hashCode == 0) { // templates/JavaSDK/entities/fields.ts:175:16 //
                // templates/JavaSDK/entities/fields.ts:174:16 //
                // templates/JavaSDK/entities/fields.ts:174:16
                hashCode =
                    Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
                        // templates/JavaSDK/entities/fields.ts:175:16 //
                        // templates/JavaSDK/entities/fields.ts:175:16
                        title, // templates/JavaSDK/entities/fields.ts:163:19
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
            "MonitorBlock{title=$title, section=$section, columns=$columns, subtitle=$subtitle, rows=$rows, chartSpec=$chartSpec, clickTarget=$clickTarget, toggleableMarks=$toggleableMarks, additionalProperties=$additionalProperties}"

        companion object { // templates/JavaSDK/entities/objects.ts:217:10

            @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
            // templates/JavaSDK/entities/objects.ts:217:10
            fun builder() = Builder()
        }

        class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10

            private var title: JsonField<String> =
                JsonMissing.of() // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:224:10
            private var section: JsonField<String> = JsonMissing.of()
            private var columns: JsonField<List<String>> = JsonMissing.of()
            private var subtitle: JsonField<String> = JsonMissing.of()
            private var rows: JsonField<List<List<JsonValue>>> = JsonMissing.of()
            private var chartSpec: JsonValue = JsonMissing.of()
            private var clickTarget: JsonField<String> = JsonMissing.of()
            private var toggleableMarks: JsonField<ToggleableMarks> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
            internal fun from(monitorBlock: MonitorBlock) =
                apply { // templates/JavaSDK/entities/objects.ts:240:30
                    this.title =
                        monitorBlock.title // templates/JavaSDK/entities/objects.ts:240:30 //
                    // templates/JavaSDK/entities/objects.ts:240:30
                    this.section = monitorBlock.section
                    this.columns = monitorBlock.columns
                    this.subtitle = monitorBlock.subtitle
                    this.rows = monitorBlock.rows
                    this.chartSpec = monitorBlock.chartSpec
                    this.clickTarget = monitorBlock.clickTarget
                    this.toggleableMarks = monitorBlock.toggleableMarks
                    additionalProperties(monitorBlock.additionalProperties)
                }

            fun title(title: String) =
                title(JsonField.of(title)) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("title") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun title(title: JsonField<String>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.title = title
                }

            fun section(section: String) =
                section(JsonField.of(section)) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("section") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun section(section: JsonField<String>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.section = section
                }

            fun columns(columns: List<String>) =
                columns(JsonField.of(columns)) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("columns") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun columns(columns: JsonField<List<String>>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.columns = columns
                }

            fun subtitle(subtitle: String) =
                subtitle(JsonField.of(subtitle)) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("subtitle") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun subtitle(subtitle: JsonField<String>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.subtitle = subtitle
                }

            fun rows(rows: List<List<JsonValue>>) =
                rows(JsonField.of(rows)) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("rows") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun rows(rows: JsonField<List<List<JsonValue>>>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.rows = rows
                }

            @JsonProperty("chart_spec") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            @ExcludeMissing
            fun chartSpec(chartSpec: JsonValue) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.chartSpec = chartSpec
                }

            fun clickTarget(clickTarget: String) =
                clickTarget(
                    JsonField.of(clickTarget)
                ) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("click_target") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun clickTarget(clickTarget: JsonField<String>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.clickTarget = clickTarget
                }

            fun toggleableMarks(toggleableMarks: ToggleableMarks) =
                toggleableMarks(
                    JsonField.of(toggleableMarks)
                ) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("toggleable_marks") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun toggleableMarks(toggleableMarks: JsonField<ToggleableMarks>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.toggleableMarks = toggleableMarks
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply { // templates/JavaSDK/entities/objects.ts:290:30
                    this.additionalProperties
                        .clear() // templates/JavaSDK/entities/objects.ts:290:30 //
                    // templates/JavaSDK/entities/objects.ts:290:30
                    this.additionalProperties.putAll(additionalProperties)
                }

            @JsonAnySetter // templates/JavaSDK/entities/objects.ts:299:14
            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply { // templates/JavaSDK/entities/objects.ts:304:30
                    this.additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply { // templates/JavaSDK/entities/objects.ts:316:30
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun build(): MonitorBlock =
                MonitorBlock( // templates/JavaSDK/entities/objects.ts:326:30
                    title, // templates/JavaSDK/entities/objects.ts:326:30
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

        @JsonDeserialize(
            builder = ToggleableMarks.Builder::class
        ) // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
        @NoAutoDetect
        class ToggleableMarks
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
            // templates/JavaSDK/entities/objects.ts:76:13

            private var hashCode: Int = 0

            @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
            // templates/JavaSDK/entities/objects.ts:180:12
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ToggleableMarks =
                apply { // templates/JavaSDK/entities/objects.ts:198:28
                    if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
                        // templates/JavaSDK/entities/objects.ts:198:28 //
                        // templates/JavaSDK/entities/objects.ts:198:28
                        validated = true
                    }
                }

            fun toBuilder() = Builder().from(this)

            override fun equals(
                other: Any?
            ): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
                if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                    return true
                }

                return other is ToggleableMarks && // templates/JavaSDK/entities/fields.ts:143:33
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
                if (hashCode == 0) { // templates/JavaSDK/entities/fields.ts:175:16 //
                    // templates/JavaSDK/entities/fields.ts:174:16 //
                    // templates/JavaSDK/entities/fields.ts:174:16
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "ToggleableMarks{additionalProperties=$additionalProperties}"

            companion object { // templates/JavaSDK/entities/objects.ts:217:10

                @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
                // templates/JavaSDK/entities/objects.ts:217:10
                fun builder() = Builder()
            }

            class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
                // templates/JavaSDK/entities/objects.ts:224:10 //
                // templates/JavaSDK/entities/objects.ts:224:10

                private var additionalProperties: MutableMap<String, JsonValue> =
                    mutableMapOf() // templates/JavaSDK/entities/objects.ts:224:10

                @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
                internal fun from(toggleableMarks: ToggleableMarks) =
                    apply { // templates/JavaSDK/entities/objects.ts:240:30
                        additionalProperties(toggleableMarks.additionalProperties)
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply { // templates/JavaSDK/entities/objects.ts:290:30
                        this.additionalProperties
                            .clear() // templates/JavaSDK/entities/objects.ts:290:30 //
                        // templates/JavaSDK/entities/objects.ts:290:30
                        this.additionalProperties.putAll(additionalProperties)
                    }

                @JsonAnySetter // templates/JavaSDK/entities/objects.ts:299:14
                fun putAdditionalProperty(key: String, value: JsonValue) =
                    apply { // templates/JavaSDK/entities/objects.ts:304:30
                        this.additionalProperties.put(key, value)
                    }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply { // templates/JavaSDK/entities/objects.ts:316:30
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ToggleableMarks =
                    ToggleableMarks(additionalProperties.toUnmodifiable())
            }
        }
    }
}
