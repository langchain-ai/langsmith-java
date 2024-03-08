// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.langsmith.api.core.ExcludeMissing
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.models.*
import java.util.Objects
import java.util.Optional

class RunMonitorCreateParams
constructor(
    private val groups: List<Group>,
    private val interval: Interval?,
    private val stride: Stride?,
    private val timezone: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun groups(): List<Group> = groups

    fun interval(): Optional<Interval> = Optional.ofNullable(interval)

    fun stride(): Optional<Stride> = Optional.ofNullable(stride)

    fun timezone(): Optional<String> = Optional.ofNullable(timezone)

    @JvmSynthetic
    internal fun getBody(): RunMonitorCreateBody {
        return RunMonitorCreateBody(
            groups,
            interval,
            stride,
            timezone,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = RunMonitorCreateBody.Builder::class)
    @NoAutoDetect
    class RunMonitorCreateBody
    internal constructor(
        private val groups: List<Group>?,
        private val interval: Interval?,
        private val stride: Stride?,
        private val timezone: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("groups") fun groups(): List<Group>? = groups

        /** Timedelta input. */
        @JsonProperty("interval") fun interval(): Interval? = interval

        /** Timedelta input. */
        @JsonProperty("stride") fun stride(): Stride? = stride

        @JsonProperty("timezone") fun timezone(): String? = timezone

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RunMonitorCreateBody &&
                this.groups == other.groups &&
                this.interval == other.interval &&
                this.stride == other.stride &&
                this.timezone == other.timezone &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        groups,
                        interval,
                        stride,
                        timezone,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "RunMonitorCreateBody{groups=$groups, interval=$interval, stride=$stride, timezone=$timezone, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var groups: List<Group>? = null
            private var interval: Interval? = null
            private var stride: Stride? = null
            private var timezone: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(runMonitorCreateBody: RunMonitorCreateBody) = apply {
                this.groups = runMonitorCreateBody.groups
                this.interval = runMonitorCreateBody.interval
                this.stride = runMonitorCreateBody.stride
                this.timezone = runMonitorCreateBody.timezone
                additionalProperties(runMonitorCreateBody.additionalProperties)
            }

            @JsonProperty("groups") fun groups(groups: List<Group>) = apply { this.groups = groups }

            /** Timedelta input. */
            @JsonProperty("interval")
            fun interval(interval: Interval) = apply { this.interval = interval }

            /** Timedelta input. */
            @JsonProperty("stride") fun stride(stride: Stride) = apply { this.stride = stride }

            @JsonProperty("timezone")
            fun timezone(timezone: String) = apply { this.timezone = timezone }

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

            fun build(): RunMonitorCreateBody =
                RunMonitorCreateBody(
                    checkNotNull(groups) { "`groups` is required but was not set" }
                        .toUnmodifiable(),
                    interval,
                    stride,
                    timezone,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunMonitorCreateParams &&
            this.groups == other.groups &&
            this.interval == other.interval &&
            this.stride == other.stride &&
            this.timezone == other.timezone &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            groups,
            interval,
            stride,
            timezone,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "RunMonitorCreateParams{groups=$groups, interval=$interval, stride=$stride, timezone=$timezone, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var groups: MutableList<Group> = mutableListOf()
        private var interval: Interval? = null
        private var stride: Stride? = null
        private var timezone: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(runMonitorCreateParams: RunMonitorCreateParams) = apply {
            this.groups(runMonitorCreateParams.groups)
            this.interval = runMonitorCreateParams.interval
            this.stride = runMonitorCreateParams.stride
            this.timezone = runMonitorCreateParams.timezone
            additionalQueryParams(runMonitorCreateParams.additionalQueryParams)
            additionalHeaders(runMonitorCreateParams.additionalHeaders)
            additionalBodyProperties(runMonitorCreateParams.additionalBodyProperties)
        }

        fun groups(groups: List<Group>) = apply {
            this.groups.clear()
            this.groups.addAll(groups)
        }

        fun addGroup(group: Group) = apply { this.groups.add(group) }

        /** Timedelta input. */
        fun interval(interval: Interval) = apply { this.interval = interval }

        /** Timedelta input. */
        fun stride(stride: Stride) = apply { this.stride = stride }

        fun timezone(timezone: String) = apply { this.timezone = timezone }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): RunMonitorCreateParams =
            RunMonitorCreateParams(
                checkNotNull(groups) { "`groups` is required but was not set" }.toUnmodifiable(),
                interval,
                stride,
                timezone,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Group.Builder::class)
    @NoAutoDetect
    class Group
    private constructor(
        private val session: String?,
        private val tag: String?,
        private val metadata: Metadata?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("session") fun session(): String? = session

        @JsonProperty("tag") fun tag(): String? = tag

        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Group &&
                this.session == other.session &&
                this.tag == other.tag &&
                this.metadata == other.metadata &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        session,
                        tag,
                        metadata,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Group{session=$session, tag=$tag, metadata=$metadata, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var session: String? = null
            private var tag: String? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(group: Group) = apply {
                this.session = group.session
                this.tag = group.tag
                this.metadata = group.metadata
                additionalProperties(group.additionalProperties)
            }

            @JsonProperty("session") fun session(session: String) = apply { this.session = session }

            @JsonProperty("tag") fun tag(tag: String) = apply { this.tag = tag }

            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

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

            fun build(): Group =
                Group(
                    checkNotNull(session) { "`session` is required but was not set" },
                    tag,
                    metadata,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val key: String?,
            private val value: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            @JsonProperty("key") fun key(): String? = key

            @JsonProperty("value") fun value(): String? = value

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Metadata &&
                    this.key == other.key &&
                    this.value == other.value &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            key,
                            value,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Metadata{key=$key, value=$value, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var key: String? = null
                private var value: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(metadata: Metadata) = apply {
                    this.key = metadata.key
                    this.value = metadata.value
                    additionalProperties(metadata.additionalProperties)
                }

                @JsonProperty("key") fun key(key: String) = apply { this.key = key }

                @JsonProperty("value") fun value(value: String) = apply { this.value = value }

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

                fun build(): Metadata =
                    Metadata(
                        checkNotNull(key) { "`key` is required but was not set" },
                        checkNotNull(value) { "`value` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }
    }

    /** Timedelta input. */
    @JsonDeserialize(builder = Interval.Builder::class)
    @NoAutoDetect
    class Interval
    private constructor(
        private val days: Long?,
        private val minutes: Long?,
        private val hours: Long?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("days") fun days(): Long? = days

        @JsonProperty("minutes") fun minutes(): Long? = minutes

        @JsonProperty("hours") fun hours(): Long? = hours

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Interval &&
                this.days == other.days &&
                this.minutes == other.minutes &&
                this.hours == other.hours &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        days,
                        minutes,
                        hours,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Interval{days=$days, minutes=$minutes, hours=$hours, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var days: Long? = null
            private var minutes: Long? = null
            private var hours: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(interval: Interval) = apply {
                this.days = interval.days
                this.minutes = interval.minutes
                this.hours = interval.hours
                additionalProperties(interval.additionalProperties)
            }

            @JsonProperty("days") fun days(days: Long) = apply { this.days = days }

            @JsonProperty("minutes") fun minutes(minutes: Long) = apply { this.minutes = minutes }

            @JsonProperty("hours") fun hours(hours: Long) = apply { this.hours = hours }

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

            fun build(): Interval =
                Interval(
                    days,
                    minutes,
                    hours,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    /** Timedelta input. */
    @JsonDeserialize(builder = Stride.Builder::class)
    @NoAutoDetect
    class Stride
    private constructor(
        private val days: Long?,
        private val minutes: Long?,
        private val hours: Long?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("days") fun days(): Long? = days

        @JsonProperty("minutes") fun minutes(): Long? = minutes

        @JsonProperty("hours") fun hours(): Long? = hours

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Stride &&
                this.days == other.days &&
                this.minutes == other.minutes &&
                this.hours == other.hours &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        days,
                        minutes,
                        hours,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Stride{days=$days, minutes=$minutes, hours=$hours, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var days: Long? = null
            private var minutes: Long? = null
            private var hours: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(stride: Stride) = apply {
                this.days = stride.days
                this.minutes = stride.minutes
                this.hours = stride.hours
                additionalProperties(stride.additionalProperties)
            }

            @JsonProperty("days") fun days(days: Long) = apply { this.days = days }

            @JsonProperty("minutes") fun minutes(minutes: Long) = apply { this.minutes = minutes }

            @JsonProperty("hours") fun hours(hours: Long) = apply { this.hours = hours }

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

            fun build(): Stride =
                Stride(
                    days,
                    minutes,
                    hours,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
