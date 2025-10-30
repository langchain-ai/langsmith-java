// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.prompts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.BaseDeserializer
import com.langsmith_api.api.core.BaseSerializer
import com.langsmith_api.api.core.Enum
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.Params
import com.langsmith_api.api.core.allMaxBy
import com.langsmith_api.api.core.checkKnown
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.getOrThrow
import com.langsmith_api.api.core.http.Headers
import com.langsmith_api.api.core.http.QueryParams
import com.langsmith_api.api.core.toImmutable
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Prompt Canvas */
class PromptCanvasParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messages(): List<Message> = body.messages()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun secrets(): Secrets = body.secrets()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun templateFormat(): TemplateFormat = body.templateFormat()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun artifact(): Optional<Artifact> = body.artifact()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun artifactLength(): Optional<ArtifactLength> = body.artifactLength()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customAction(): Optional<String> = body.customAction()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun highlighted(): Optional<Highlighted> = body.highlighted()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun readingLevel(): Optional<ReadingLevel> = body.readingLevel()

    /**
     * Returns the raw JSON value of [messages].
     *
     * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _messages(): JsonField<List<Message>> = body._messages()

    /**
     * Returns the raw JSON value of [secrets].
     *
     * Unlike [secrets], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _secrets(): JsonField<Secrets> = body._secrets()

    /**
     * Returns the raw JSON value of [templateFormat].
     *
     * Unlike [templateFormat], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _templateFormat(): JsonField<TemplateFormat> = body._templateFormat()

    /**
     * Returns the raw JSON value of [artifact].
     *
     * Unlike [artifact], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _artifact(): JsonField<Artifact> = body._artifact()

    /**
     * Returns the raw JSON value of [artifactLength].
     *
     * Unlike [artifactLength], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _artifactLength(): JsonField<ArtifactLength> = body._artifactLength()

    /**
     * Returns the raw JSON value of [customAction].
     *
     * Unlike [customAction], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customAction(): JsonField<String> = body._customAction()

    /**
     * Returns the raw JSON value of [highlighted].
     *
     * Unlike [highlighted], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _highlighted(): JsonField<Highlighted> = body._highlighted()

    /**
     * Returns the raw JSON value of [readingLevel].
     *
     * Unlike [readingLevel], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _readingLevel(): JsonField<ReadingLevel> = body._readingLevel()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PromptCanvasParams].
         *
         * The following fields are required:
         * ```java
         * .messages()
         * .secrets()
         * .templateFormat()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PromptCanvasParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(promptCanvasParams: PromptCanvasParams) = apply {
            body = promptCanvasParams.body.toBuilder()
            additionalHeaders = promptCanvasParams.additionalHeaders.toBuilder()
            additionalQueryParams = promptCanvasParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [messages]
         * - [secrets]
         * - [templateFormat]
         * - [artifact]
         * - [artifactLength]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun messages(messages: List<Message>) = apply { body.messages(messages) }

        /**
         * Sets [Builder.messages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messages] with a well-typed `List<Message>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messages(messages: JsonField<List<Message>>) = apply { body.messages(messages) }

        /**
         * Adds a single [Message] to [messages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMessage(message: Message) = apply { body.addMessage(message) }

        /** Alias for calling [addMessage] with `Message.ofAi(ai)`. */
        fun addMessage(ai: Message.AiMessage) = apply { body.addMessage(ai) }

        /** Alias for calling [addMessage] with `Message.ofHuman(human)`. */
        fun addMessage(human: Message.HumanMessage) = apply { body.addMessage(human) }

        /** Alias for calling [addMessage] with `Message.ofChat(chat)`. */
        fun addMessage(chat: Message.ChatMessage) = apply { body.addMessage(chat) }

        /** Alias for calling [addMessage] with `Message.ofSystem(system)`. */
        fun addMessage(system: Message.SystemMessage) = apply { body.addMessage(system) }

        /** Alias for calling [addMessage] with `Message.ofFunction(function)`. */
        fun addMessage(function: Message.FunctionMessage) = apply { body.addMessage(function) }

        /** Alias for calling [addMessage] with `Message.ofTool(tool)`. */
        fun addMessage(tool: Message.ToolMessage) = apply { body.addMessage(tool) }

        /** Alias for calling [addMessage] with `Message.ofAiMessageChunk(aiMessageChunk)`. */
        fun addMessage(aiMessageChunk: Message.AiMessageChunk) = apply {
            body.addMessage(aiMessageChunk)
        }

        /** Alias for calling [addMessage] with `Message.ofHumanMessageChunk(humanMessageChunk)`. */
        fun addMessage(humanMessageChunk: Message.HumanMessageChunk) = apply {
            body.addMessage(humanMessageChunk)
        }

        /** Alias for calling [addMessage] with `Message.ofChatMessageChunk(chatMessageChunk)`. */
        fun addMessage(chatMessageChunk: Message.ChatMessageChunk) = apply {
            body.addMessage(chatMessageChunk)
        }

        /**
         * Alias for calling [addMessage] with `Message.ofSystemMessageChunk(systemMessageChunk)`.
         */
        fun addMessage(systemMessageChunk: Message.SystemMessageChunk) = apply {
            body.addMessage(systemMessageChunk)
        }

        /**
         * Alias for calling [addMessage] with
         * `Message.ofFunctionMessageChunk(functionMessageChunk)`.
         */
        fun addMessage(functionMessageChunk: Message.FunctionMessageChunk) = apply {
            body.addMessage(functionMessageChunk)
        }

        /** Alias for calling [addMessage] with `Message.ofToolMessageChunk(toolMessageChunk)`. */
        fun addMessage(toolMessageChunk: Message.ToolMessageChunk) = apply {
            body.addMessage(toolMessageChunk)
        }

        fun secrets(secrets: Secrets) = apply { body.secrets(secrets) }

        /**
         * Sets [Builder.secrets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secrets] with a well-typed [Secrets] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun secrets(secrets: JsonField<Secrets>) = apply { body.secrets(secrets) }

        fun templateFormat(templateFormat: TemplateFormat) = apply {
            body.templateFormat(templateFormat)
        }

        /**
         * Sets [Builder.templateFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateFormat] with a well-typed [TemplateFormat] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun templateFormat(templateFormat: JsonField<TemplateFormat>) = apply {
            body.templateFormat(templateFormat)
        }

        fun artifact(artifact: Artifact?) = apply { body.artifact(artifact) }

        /** Alias for calling [Builder.artifact] with `artifact.orElse(null)`. */
        fun artifact(artifact: Optional<Artifact>) = artifact(artifact.getOrNull())

        /**
         * Sets [Builder.artifact] to an arbitrary JSON value.
         *
         * You should usually call [Builder.artifact] with a well-typed [Artifact] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun artifact(artifact: JsonField<Artifact>) = apply { body.artifact(artifact) }

        fun artifactLength(artifactLength: ArtifactLength?) = apply {
            body.artifactLength(artifactLength)
        }

        /** Alias for calling [Builder.artifactLength] with `artifactLength.orElse(null)`. */
        fun artifactLength(artifactLength: Optional<ArtifactLength>) =
            artifactLength(artifactLength.getOrNull())

        /**
         * Sets [Builder.artifactLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.artifactLength] with a well-typed [ArtifactLength] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun artifactLength(artifactLength: JsonField<ArtifactLength>) = apply {
            body.artifactLength(artifactLength)
        }

        fun customAction(customAction: String?) = apply { body.customAction(customAction) }

        /** Alias for calling [Builder.customAction] with `customAction.orElse(null)`. */
        fun customAction(customAction: Optional<String>) = customAction(customAction.getOrNull())

        /**
         * Sets [Builder.customAction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customAction] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customAction(customAction: JsonField<String>) = apply {
            body.customAction(customAction)
        }

        fun highlighted(highlighted: Highlighted?) = apply { body.highlighted(highlighted) }

        /** Alias for calling [Builder.highlighted] with `highlighted.orElse(null)`. */
        fun highlighted(highlighted: Optional<Highlighted>) = highlighted(highlighted.getOrNull())

        /**
         * Sets [Builder.highlighted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.highlighted] with a well-typed [Highlighted] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun highlighted(highlighted: JsonField<Highlighted>) = apply {
            body.highlighted(highlighted)
        }

        fun readingLevel(readingLevel: ReadingLevel?) = apply { body.readingLevel(readingLevel) }

        /** Alias for calling [Builder.readingLevel] with `readingLevel.orElse(null)`. */
        fun readingLevel(readingLevel: Optional<ReadingLevel>) =
            readingLevel(readingLevel.getOrNull())

        /**
         * Sets [Builder.readingLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readingLevel] with a well-typed [ReadingLevel] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun readingLevel(readingLevel: JsonField<ReadingLevel>) = apply {
            body.readingLevel(readingLevel)
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
         * Returns an immutable instance of [PromptCanvasParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .messages()
         * .secrets()
         * .templateFormat()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PromptCanvasParams =
            PromptCanvasParams(
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
        private val messages: JsonField<List<Message>>,
        private val secrets: JsonField<Secrets>,
        private val templateFormat: JsonField<TemplateFormat>,
        private val artifact: JsonField<Artifact>,
        private val artifactLength: JsonField<ArtifactLength>,
        private val customAction: JsonField<String>,
        private val highlighted: JsonField<Highlighted>,
        private val readingLevel: JsonField<ReadingLevel>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("messages")
            @ExcludeMissing
            messages: JsonField<List<Message>> = JsonMissing.of(),
            @JsonProperty("secrets") @ExcludeMissing secrets: JsonField<Secrets> = JsonMissing.of(),
            @JsonProperty("template_format")
            @ExcludeMissing
            templateFormat: JsonField<TemplateFormat> = JsonMissing.of(),
            @JsonProperty("artifact")
            @ExcludeMissing
            artifact: JsonField<Artifact> = JsonMissing.of(),
            @JsonProperty("artifact_length")
            @ExcludeMissing
            artifactLength: JsonField<ArtifactLength> = JsonMissing.of(),
            @JsonProperty("custom_action")
            @ExcludeMissing
            customAction: JsonField<String> = JsonMissing.of(),
            @JsonProperty("highlighted")
            @ExcludeMissing
            highlighted: JsonField<Highlighted> = JsonMissing.of(),
            @JsonProperty("reading_level")
            @ExcludeMissing
            readingLevel: JsonField<ReadingLevel> = JsonMissing.of(),
        ) : this(
            messages,
            secrets,
            templateFormat,
            artifact,
            artifactLength,
            customAction,
            highlighted,
            readingLevel,
            mutableMapOf(),
        )

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun messages(): List<Message> = messages.getRequired("messages")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun secrets(): Secrets = secrets.getRequired("secrets")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun templateFormat(): TemplateFormat = templateFormat.getRequired("template_format")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun artifact(): Optional<Artifact> = artifact.getOptional("artifact")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun artifactLength(): Optional<ArtifactLength> =
            artifactLength.getOptional("artifact_length")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun customAction(): Optional<String> = customAction.getOptional("custom_action")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun highlighted(): Optional<Highlighted> = highlighted.getOptional("highlighted")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun readingLevel(): Optional<ReadingLevel> = readingLevel.getOptional("reading_level")

        /**
         * Returns the raw JSON value of [messages].
         *
         * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("messages")
        @ExcludeMissing
        fun _messages(): JsonField<List<Message>> = messages

        /**
         * Returns the raw JSON value of [secrets].
         *
         * Unlike [secrets], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("secrets") @ExcludeMissing fun _secrets(): JsonField<Secrets> = secrets

        /**
         * Returns the raw JSON value of [templateFormat].
         *
         * Unlike [templateFormat], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("template_format")
        @ExcludeMissing
        fun _templateFormat(): JsonField<TemplateFormat> = templateFormat

        /**
         * Returns the raw JSON value of [artifact].
         *
         * Unlike [artifact], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("artifact") @ExcludeMissing fun _artifact(): JsonField<Artifact> = artifact

        /**
         * Returns the raw JSON value of [artifactLength].
         *
         * Unlike [artifactLength], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("artifact_length")
        @ExcludeMissing
        fun _artifactLength(): JsonField<ArtifactLength> = artifactLength

        /**
         * Returns the raw JSON value of [customAction].
         *
         * Unlike [customAction], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_action")
        @ExcludeMissing
        fun _customAction(): JsonField<String> = customAction

        /**
         * Returns the raw JSON value of [highlighted].
         *
         * Unlike [highlighted], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("highlighted")
        @ExcludeMissing
        fun _highlighted(): JsonField<Highlighted> = highlighted

        /**
         * Returns the raw JSON value of [readingLevel].
         *
         * Unlike [readingLevel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("reading_level")
        @ExcludeMissing
        fun _readingLevel(): JsonField<ReadingLevel> = readingLevel

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
             * .messages()
             * .secrets()
             * .templateFormat()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var messages: JsonField<MutableList<Message>>? = null
            private var secrets: JsonField<Secrets>? = null
            private var templateFormat: JsonField<TemplateFormat>? = null
            private var artifact: JsonField<Artifact> = JsonMissing.of()
            private var artifactLength: JsonField<ArtifactLength> = JsonMissing.of()
            private var customAction: JsonField<String> = JsonMissing.of()
            private var highlighted: JsonField<Highlighted> = JsonMissing.of()
            private var readingLevel: JsonField<ReadingLevel> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                messages = body.messages.map { it.toMutableList() }
                secrets = body.secrets
                templateFormat = body.templateFormat
                artifact = body.artifact
                artifactLength = body.artifactLength
                customAction = body.customAction
                highlighted = body.highlighted
                readingLevel = body.readingLevel
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun messages(messages: List<Message>) = messages(JsonField.of(messages))

            /**
             * Sets [Builder.messages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messages] with a well-typed `List<Message>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun messages(messages: JsonField<List<Message>>) = apply {
                this.messages = messages.map { it.toMutableList() }
            }

            /**
             * Adds a single [Message] to [messages].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMessage(message: Message) = apply {
                messages =
                    (messages ?: JsonField.of(mutableListOf())).also {
                        checkKnown("messages", it).add(message)
                    }
            }

            /** Alias for calling [addMessage] with `Message.ofAi(ai)`. */
            fun addMessage(ai: Message.AiMessage) = addMessage(Message.ofAi(ai))

            /** Alias for calling [addMessage] with `Message.ofHuman(human)`. */
            fun addMessage(human: Message.HumanMessage) = addMessage(Message.ofHuman(human))

            /** Alias for calling [addMessage] with `Message.ofChat(chat)`. */
            fun addMessage(chat: Message.ChatMessage) = addMessage(Message.ofChat(chat))

            /** Alias for calling [addMessage] with `Message.ofSystem(system)`. */
            fun addMessage(system: Message.SystemMessage) = addMessage(Message.ofSystem(system))

            /** Alias for calling [addMessage] with `Message.ofFunction(function)`. */
            fun addMessage(function: Message.FunctionMessage) =
                addMessage(Message.ofFunction(function))

            /** Alias for calling [addMessage] with `Message.ofTool(tool)`. */
            fun addMessage(tool: Message.ToolMessage) = addMessage(Message.ofTool(tool))

            /** Alias for calling [addMessage] with `Message.ofAiMessageChunk(aiMessageChunk)`. */
            fun addMessage(aiMessageChunk: Message.AiMessageChunk) =
                addMessage(Message.ofAiMessageChunk(aiMessageChunk))

            /**
             * Alias for calling [addMessage] with `Message.ofHumanMessageChunk(humanMessageChunk)`.
             */
            fun addMessage(humanMessageChunk: Message.HumanMessageChunk) =
                addMessage(Message.ofHumanMessageChunk(humanMessageChunk))

            /**
             * Alias for calling [addMessage] with `Message.ofChatMessageChunk(chatMessageChunk)`.
             */
            fun addMessage(chatMessageChunk: Message.ChatMessageChunk) =
                addMessage(Message.ofChatMessageChunk(chatMessageChunk))

            /**
             * Alias for calling [addMessage] with
             * `Message.ofSystemMessageChunk(systemMessageChunk)`.
             */
            fun addMessage(systemMessageChunk: Message.SystemMessageChunk) =
                addMessage(Message.ofSystemMessageChunk(systemMessageChunk))

            /**
             * Alias for calling [addMessage] with
             * `Message.ofFunctionMessageChunk(functionMessageChunk)`.
             */
            fun addMessage(functionMessageChunk: Message.FunctionMessageChunk) =
                addMessage(Message.ofFunctionMessageChunk(functionMessageChunk))

            /**
             * Alias for calling [addMessage] with `Message.ofToolMessageChunk(toolMessageChunk)`.
             */
            fun addMessage(toolMessageChunk: Message.ToolMessageChunk) =
                addMessage(Message.ofToolMessageChunk(toolMessageChunk))

            fun secrets(secrets: Secrets) = secrets(JsonField.of(secrets))

            /**
             * Sets [Builder.secrets] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secrets] with a well-typed [Secrets] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secrets(secrets: JsonField<Secrets>) = apply { this.secrets = secrets }

            fun templateFormat(templateFormat: TemplateFormat) =
                templateFormat(JsonField.of(templateFormat))

            /**
             * Sets [Builder.templateFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.templateFormat] with a well-typed [TemplateFormat]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun templateFormat(templateFormat: JsonField<TemplateFormat>) = apply {
                this.templateFormat = templateFormat
            }

            fun artifact(artifact: Artifact?) = artifact(JsonField.ofNullable(artifact))

            /** Alias for calling [Builder.artifact] with `artifact.orElse(null)`. */
            fun artifact(artifact: Optional<Artifact>) = artifact(artifact.getOrNull())

            /**
             * Sets [Builder.artifact] to an arbitrary JSON value.
             *
             * You should usually call [Builder.artifact] with a well-typed [Artifact] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun artifact(artifact: JsonField<Artifact>) = apply { this.artifact = artifact }

            fun artifactLength(artifactLength: ArtifactLength?) =
                artifactLength(JsonField.ofNullable(artifactLength))

            /** Alias for calling [Builder.artifactLength] with `artifactLength.orElse(null)`. */
            fun artifactLength(artifactLength: Optional<ArtifactLength>) =
                artifactLength(artifactLength.getOrNull())

            /**
             * Sets [Builder.artifactLength] to an arbitrary JSON value.
             *
             * You should usually call [Builder.artifactLength] with a well-typed [ArtifactLength]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun artifactLength(artifactLength: JsonField<ArtifactLength>) = apply {
                this.artifactLength = artifactLength
            }

            fun customAction(customAction: String?) =
                customAction(JsonField.ofNullable(customAction))

            /** Alias for calling [Builder.customAction] with `customAction.orElse(null)`. */
            fun customAction(customAction: Optional<String>) =
                customAction(customAction.getOrNull())

            /**
             * Sets [Builder.customAction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customAction] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customAction(customAction: JsonField<String>) = apply {
                this.customAction = customAction
            }

            fun highlighted(highlighted: Highlighted?) =
                highlighted(JsonField.ofNullable(highlighted))

            /** Alias for calling [Builder.highlighted] with `highlighted.orElse(null)`. */
            fun highlighted(highlighted: Optional<Highlighted>) =
                highlighted(highlighted.getOrNull())

            /**
             * Sets [Builder.highlighted] to an arbitrary JSON value.
             *
             * You should usually call [Builder.highlighted] with a well-typed [Highlighted] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun highlighted(highlighted: JsonField<Highlighted>) = apply {
                this.highlighted = highlighted
            }

            fun readingLevel(readingLevel: ReadingLevel?) =
                readingLevel(JsonField.ofNullable(readingLevel))

            /** Alias for calling [Builder.readingLevel] with `readingLevel.orElse(null)`. */
            fun readingLevel(readingLevel: Optional<ReadingLevel>) =
                readingLevel(readingLevel.getOrNull())

            /**
             * Sets [Builder.readingLevel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.readingLevel] with a well-typed [ReadingLevel] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun readingLevel(readingLevel: JsonField<ReadingLevel>) = apply {
                this.readingLevel = readingLevel
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .messages()
             * .secrets()
             * .templateFormat()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("messages", messages).map { it.toImmutable() },
                    checkRequired("secrets", secrets),
                    checkRequired("templateFormat", templateFormat),
                    artifact,
                    artifactLength,
                    customAction,
                    highlighted,
                    readingLevel,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            messages().forEach { it.validate() }
            secrets().validate()
            templateFormat().validate()
            artifact().ifPresent { it.validate() }
            artifactLength().ifPresent { it.validate() }
            customAction()
            highlighted().ifPresent { it.validate() }
            readingLevel().ifPresent { it.validate() }
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
            (messages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (secrets.asKnown().getOrNull()?.validity() ?: 0) +
                (templateFormat.asKnown().getOrNull()?.validity() ?: 0) +
                (artifact.asKnown().getOrNull()?.validity() ?: 0) +
                (artifactLength.asKnown().getOrNull()?.validity() ?: 0) +
                (if (customAction.asKnown().isPresent) 1 else 0) +
                (highlighted.asKnown().getOrNull()?.validity() ?: 0) +
                (readingLevel.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                messages == other.messages &&
                secrets == other.secrets &&
                templateFormat == other.templateFormat &&
                artifact == other.artifact &&
                artifactLength == other.artifactLength &&
                customAction == other.customAction &&
                highlighted == other.highlighted &&
                readingLevel == other.readingLevel &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                messages,
                secrets,
                templateFormat,
                artifact,
                artifactLength,
                customAction,
                highlighted,
                readingLevel,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{messages=$messages, secrets=$secrets, templateFormat=$templateFormat, artifact=$artifact, artifactLength=$artifactLength, customAction=$customAction, highlighted=$highlighted, readingLevel=$readingLevel, additionalProperties=$additionalProperties}"
    }

    /**
     * Message from an AI.
     *
     * An `AIMessage` is returned from a chat model as a response to a prompt.
     *
     * This message represents the output of the model and consists of both the raw output as
     * returned by the model and standardized fields (e.g., tool calls, usage metadata) added by the
     * LangChain framework.
     */
    @JsonDeserialize(using = Message.Deserializer::class)
    @JsonSerialize(using = Message.Serializer::class)
    class Message
    private constructor(
        private val ai: AiMessage? = null,
        private val human: HumanMessage? = null,
        private val chat: ChatMessage? = null,
        private val system: SystemMessage? = null,
        private val function: FunctionMessage? = null,
        private val tool: ToolMessage? = null,
        private val aiMessageChunk: AiMessageChunk? = null,
        private val humanMessageChunk: HumanMessageChunk? = null,
        private val chatMessageChunk: ChatMessageChunk? = null,
        private val systemMessageChunk: SystemMessageChunk? = null,
        private val functionMessageChunk: FunctionMessageChunk? = null,
        private val toolMessageChunk: ToolMessageChunk? = null,
        private val _json: JsonValue? = null,
    ) {

        /**
         * Message from an AI.
         *
         * An `AIMessage` is returned from a chat model as a response to a prompt.
         *
         * This message represents the output of the model and consists of both the raw output as
         * returned by the model and standardized fields (e.g., tool calls, usage metadata) added by
         * the LangChain framework.
         */
        fun ai(): Optional<AiMessage> = Optional.ofNullable(ai)

        /**
         * Message from the user.
         *
         * A `HumanMessage` is a message that is passed in from a user to the model.
         *
         * Example:
         *
         *     ```python
         *     from langchain_core.messages import HumanMessage, SystemMessage
         *
         *     messages = [
         *         SystemMessage(content="You are a helpful assistant! Your name is Bob."),
         *         HumanMessage(content="What is your name?"),
         *     ]
         *
         *     # Instantiate a chat model and invoke it with the messages
         *     model = ...
         *     print(model.invoke(messages))
         *     ```
         */
        fun human(): Optional<HumanMessage> = Optional.ofNullable(human)

        /** Message that can be assigned an arbitrary speaker (i.e. role). */
        fun chat(): Optional<ChatMessage> = Optional.ofNullable(chat)

        /**
         * Message for priming AI behavior.
         *
         * The system message is usually passed in as the first of a sequence of input messages.
         *
         * Example:
         *
         *     ```python
         *     from langchain_core.messages import HumanMessage, SystemMessage
         *
         *     messages = [
         *         SystemMessage(content="You are a helpful assistant! Your name is Bob."),
         *         HumanMessage(content="What is your name?"),
         *     ]
         *
         *     # Define a chat model and invoke it with the messages
         *     print(model.invoke(messages))
         *     ```
         */
        fun system(): Optional<SystemMessage> = Optional.ofNullable(system)

        /**
         * Message for passing the result of executing a tool back to a model.
         *
         * `FunctionMessage` are an older version of the `ToolMessage` schema, and do not contain
         * the `tool_call_id` field.
         *
         * The `tool_call_id` field is used to associate the tool call request with the tool call
         * response. Useful in situations where a chat model is able to request multiple tool calls
         * in parallel.
         */
        fun function(): Optional<FunctionMessage> = Optional.ofNullable(function)

        /**
         * Message for passing the result of executing a tool back to a model.
         *
         * `ToolMessage` objects contain the result of a tool invocation. Typically, the result is
         * encoded inside the `content` field.
         *
         * Example: A `ToolMessage` representing a result of `42` from a tool call with id
         *
         * ```python
         * from langchain_core.messages import ToolMessage
         *
         * ToolMessage(content="42", tool_call_id="call_Jja7J89XsjrOLA5r!MEOW!SL")
         * ```
         *
         * Example: A `ToolMessage` where only part of the tool output is sent to the model and the
         * full output is passed in to artifact.
         *
         * ```python
         * from langchain_core.messages import ToolMessage
         *
         * tool_output = {
         *     "stdout": "From the graph we can see that the correlation between "
         *     "x and y is ...",
         *     "stderr": None,
         *     "artifacts": {"type": "image", "base64_data": "/9j/4gIcSU..."},
         * }
         *
         * ToolMessage(
         *     content=tool_output["stdout"],
         *     artifact=tool_output,
         *     tool_call_id="call_Jja7J89XsjrOLA5r!MEOW!SL",
         * )
         * ```
         *
         * The `tool_call_id` field is used to associate the tool call request with the tool call
         * response. Useful in situations where a chat model is able to request multiple tool calls
         * in parallel.
         */
        fun tool(): Optional<ToolMessage> = Optional.ofNullable(tool)

        /** Message chunk from an AI (yielded when streaming). */
        fun aiMessageChunk(): Optional<AiMessageChunk> = Optional.ofNullable(aiMessageChunk)

        /** Human Message chunk. */
        fun humanMessageChunk(): Optional<HumanMessageChunk> =
            Optional.ofNullable(humanMessageChunk)

        /** Chat Message chunk. */
        fun chatMessageChunk(): Optional<ChatMessageChunk> = Optional.ofNullable(chatMessageChunk)

        /** System Message chunk. */
        fun systemMessageChunk(): Optional<SystemMessageChunk> =
            Optional.ofNullable(systemMessageChunk)

        /** Function Message chunk. */
        fun functionMessageChunk(): Optional<FunctionMessageChunk> =
            Optional.ofNullable(functionMessageChunk)

        /** Tool Message chunk. */
        fun toolMessageChunk(): Optional<ToolMessageChunk> = Optional.ofNullable(toolMessageChunk)

        fun isAi(): Boolean = ai != null

        fun isHuman(): Boolean = human != null

        fun isChat(): Boolean = chat != null

        fun isSystem(): Boolean = system != null

        fun isFunction(): Boolean = function != null

        fun isTool(): Boolean = tool != null

        fun isAiMessageChunk(): Boolean = aiMessageChunk != null

        fun isHumanMessageChunk(): Boolean = humanMessageChunk != null

        fun isChatMessageChunk(): Boolean = chatMessageChunk != null

        fun isSystemMessageChunk(): Boolean = systemMessageChunk != null

        fun isFunctionMessageChunk(): Boolean = functionMessageChunk != null

        fun isToolMessageChunk(): Boolean = toolMessageChunk != null

        /**
         * Message from an AI.
         *
         * An `AIMessage` is returned from a chat model as a response to a prompt.
         *
         * This message represents the output of the model and consists of both the raw output as
         * returned by the model and standardized fields (e.g., tool calls, usage metadata) added by
         * the LangChain framework.
         */
        fun asAi(): AiMessage = ai.getOrThrow("ai")

        /**
         * Message from the user.
         *
         * A `HumanMessage` is a message that is passed in from a user to the model.
         *
         * Example:
         *
         *     ```python
         *     from langchain_core.messages import HumanMessage, SystemMessage
         *
         *     messages = [
         *         SystemMessage(content="You are a helpful assistant! Your name is Bob."),
         *         HumanMessage(content="What is your name?"),
         *     ]
         *
         *     # Instantiate a chat model and invoke it with the messages
         *     model = ...
         *     print(model.invoke(messages))
         *     ```
         */
        fun asHuman(): HumanMessage = human.getOrThrow("human")

        /** Message that can be assigned an arbitrary speaker (i.e. role). */
        fun asChat(): ChatMessage = chat.getOrThrow("chat")

        /**
         * Message for priming AI behavior.
         *
         * The system message is usually passed in as the first of a sequence of input messages.
         *
         * Example:
         *
         *     ```python
         *     from langchain_core.messages import HumanMessage, SystemMessage
         *
         *     messages = [
         *         SystemMessage(content="You are a helpful assistant! Your name is Bob."),
         *         HumanMessage(content="What is your name?"),
         *     ]
         *
         *     # Define a chat model and invoke it with the messages
         *     print(model.invoke(messages))
         *     ```
         */
        fun asSystem(): SystemMessage = system.getOrThrow("system")

        /**
         * Message for passing the result of executing a tool back to a model.
         *
         * `FunctionMessage` are an older version of the `ToolMessage` schema, and do not contain
         * the `tool_call_id` field.
         *
         * The `tool_call_id` field is used to associate the tool call request with the tool call
         * response. Useful in situations where a chat model is able to request multiple tool calls
         * in parallel.
         */
        fun asFunction(): FunctionMessage = function.getOrThrow("function")

        /**
         * Message for passing the result of executing a tool back to a model.
         *
         * `ToolMessage` objects contain the result of a tool invocation. Typically, the result is
         * encoded inside the `content` field.
         *
         * Example: A `ToolMessage` representing a result of `42` from a tool call with id
         *
         * ```python
         * from langchain_core.messages import ToolMessage
         *
         * ToolMessage(content="42", tool_call_id="call_Jja7J89XsjrOLA5r!MEOW!SL")
         * ```
         *
         * Example: A `ToolMessage` where only part of the tool output is sent to the model and the
         * full output is passed in to artifact.
         *
         * ```python
         * from langchain_core.messages import ToolMessage
         *
         * tool_output = {
         *     "stdout": "From the graph we can see that the correlation between "
         *     "x and y is ...",
         *     "stderr": None,
         *     "artifacts": {"type": "image", "base64_data": "/9j/4gIcSU..."},
         * }
         *
         * ToolMessage(
         *     content=tool_output["stdout"],
         *     artifact=tool_output,
         *     tool_call_id="call_Jja7J89XsjrOLA5r!MEOW!SL",
         * )
         * ```
         *
         * The `tool_call_id` field is used to associate the tool call request with the tool call
         * response. Useful in situations where a chat model is able to request multiple tool calls
         * in parallel.
         */
        fun asTool(): ToolMessage = tool.getOrThrow("tool")

        /** Message chunk from an AI (yielded when streaming). */
        fun asAiMessageChunk(): AiMessageChunk = aiMessageChunk.getOrThrow("aiMessageChunk")

        /** Human Message chunk. */
        fun asHumanMessageChunk(): HumanMessageChunk =
            humanMessageChunk.getOrThrow("humanMessageChunk")

        /** Chat Message chunk. */
        fun asChatMessageChunk(): ChatMessageChunk = chatMessageChunk.getOrThrow("chatMessageChunk")

        /** System Message chunk. */
        fun asSystemMessageChunk(): SystemMessageChunk =
            systemMessageChunk.getOrThrow("systemMessageChunk")

        /** Function Message chunk. */
        fun asFunctionMessageChunk(): FunctionMessageChunk =
            functionMessageChunk.getOrThrow("functionMessageChunk")

        /** Tool Message chunk. */
        fun asToolMessageChunk(): ToolMessageChunk = toolMessageChunk.getOrThrow("toolMessageChunk")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                ai != null -> visitor.visitAi(ai)
                human != null -> visitor.visitHuman(human)
                chat != null -> visitor.visitChat(chat)
                system != null -> visitor.visitSystem(system)
                function != null -> visitor.visitFunction(function)
                tool != null -> visitor.visitTool(tool)
                aiMessageChunk != null -> visitor.visitAiMessageChunk(aiMessageChunk)
                humanMessageChunk != null -> visitor.visitHumanMessageChunk(humanMessageChunk)
                chatMessageChunk != null -> visitor.visitChatMessageChunk(chatMessageChunk)
                systemMessageChunk != null -> visitor.visitSystemMessageChunk(systemMessageChunk)
                functionMessageChunk != null ->
                    visitor.visitFunctionMessageChunk(functionMessageChunk)
                toolMessageChunk != null -> visitor.visitToolMessageChunk(toolMessageChunk)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Message = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitAi(ai: AiMessage) {
                        ai.validate()
                    }

                    override fun visitHuman(human: HumanMessage) {
                        human.validate()
                    }

                    override fun visitChat(chat: ChatMessage) {
                        chat.validate()
                    }

                    override fun visitSystem(system: SystemMessage) {
                        system.validate()
                    }

                    override fun visitFunction(function: FunctionMessage) {
                        function.validate()
                    }

                    override fun visitTool(tool: ToolMessage) {
                        tool.validate()
                    }

                    override fun visitAiMessageChunk(aiMessageChunk: AiMessageChunk) {
                        aiMessageChunk.validate()
                    }

                    override fun visitHumanMessageChunk(humanMessageChunk: HumanMessageChunk) {
                        humanMessageChunk.validate()
                    }

                    override fun visitChatMessageChunk(chatMessageChunk: ChatMessageChunk) {
                        chatMessageChunk.validate()
                    }

                    override fun visitSystemMessageChunk(systemMessageChunk: SystemMessageChunk) {
                        systemMessageChunk.validate()
                    }

                    override fun visitFunctionMessageChunk(
                        functionMessageChunk: FunctionMessageChunk
                    ) {
                        functionMessageChunk.validate()
                    }

                    override fun visitToolMessageChunk(toolMessageChunk: ToolMessageChunk) {
                        toolMessageChunk.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitAi(ai: AiMessage) = ai.validity()

                    override fun visitHuman(human: HumanMessage) = human.validity()

                    override fun visitChat(chat: ChatMessage) = chat.validity()

                    override fun visitSystem(system: SystemMessage) = system.validity()

                    override fun visitFunction(function: FunctionMessage) = function.validity()

                    override fun visitTool(tool: ToolMessage) = tool.validity()

                    override fun visitAiMessageChunk(aiMessageChunk: AiMessageChunk) =
                        aiMessageChunk.validity()

                    override fun visitHumanMessageChunk(humanMessageChunk: HumanMessageChunk) =
                        humanMessageChunk.validity()

                    override fun visitChatMessageChunk(chatMessageChunk: ChatMessageChunk) =
                        chatMessageChunk.validity()

                    override fun visitSystemMessageChunk(systemMessageChunk: SystemMessageChunk) =
                        systemMessageChunk.validity()

                    override fun visitFunctionMessageChunk(
                        functionMessageChunk: FunctionMessageChunk
                    ) = functionMessageChunk.validity()

                    override fun visitToolMessageChunk(toolMessageChunk: ToolMessageChunk) =
                        toolMessageChunk.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Message &&
                ai == other.ai &&
                human == other.human &&
                chat == other.chat &&
                system == other.system &&
                function == other.function &&
                tool == other.tool &&
                aiMessageChunk == other.aiMessageChunk &&
                humanMessageChunk == other.humanMessageChunk &&
                chatMessageChunk == other.chatMessageChunk &&
                systemMessageChunk == other.systemMessageChunk &&
                functionMessageChunk == other.functionMessageChunk &&
                toolMessageChunk == other.toolMessageChunk
        }

        override fun hashCode(): Int =
            Objects.hash(
                ai,
                human,
                chat,
                system,
                function,
                tool,
                aiMessageChunk,
                humanMessageChunk,
                chatMessageChunk,
                systemMessageChunk,
                functionMessageChunk,
                toolMessageChunk,
            )

        override fun toString(): String =
            when {
                ai != null -> "Message{ai=$ai}"
                human != null -> "Message{human=$human}"
                chat != null -> "Message{chat=$chat}"
                system != null -> "Message{system=$system}"
                function != null -> "Message{function=$function}"
                tool != null -> "Message{tool=$tool}"
                aiMessageChunk != null -> "Message{aiMessageChunk=$aiMessageChunk}"
                humanMessageChunk != null -> "Message{humanMessageChunk=$humanMessageChunk}"
                chatMessageChunk != null -> "Message{chatMessageChunk=$chatMessageChunk}"
                systemMessageChunk != null -> "Message{systemMessageChunk=$systemMessageChunk}"
                functionMessageChunk != null ->
                    "Message{functionMessageChunk=$functionMessageChunk}"
                toolMessageChunk != null -> "Message{toolMessageChunk=$toolMessageChunk}"
                _json != null -> "Message{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Message")
            }

        companion object {

            /**
             * Message from an AI.
             *
             * An `AIMessage` is returned from a chat model as a response to a prompt.
             *
             * This message represents the output of the model and consists of both the raw output
             * as returned by the model and standardized fields (e.g., tool calls, usage metadata)
             * added by the LangChain framework.
             */
            @JvmStatic fun ofAi(ai: AiMessage) = Message(ai = ai)

            /**
             * Message from the user.
             *
             * A `HumanMessage` is a message that is passed in from a user to the model.
             *
             * Example:
             *
             *     ```python
             *     from langchain_core.messages import HumanMessage, SystemMessage
             *
             *     messages = [
             *         SystemMessage(content="You are a helpful assistant! Your name is Bob."),
             *         HumanMessage(content="What is your name?"),
             *     ]
             *
             *     # Instantiate a chat model and invoke it with the messages
             *     model = ...
             *     print(model.invoke(messages))
             *     ```
             */
            @JvmStatic fun ofHuman(human: HumanMessage) = Message(human = human)

            /** Message that can be assigned an arbitrary speaker (i.e. role). */
            @JvmStatic fun ofChat(chat: ChatMessage) = Message(chat = chat)

            /**
             * Message for priming AI behavior.
             *
             * The system message is usually passed in as the first of a sequence of input messages.
             *
             * Example:
             *
             *     ```python
             *     from langchain_core.messages import HumanMessage, SystemMessage
             *
             *     messages = [
             *         SystemMessage(content="You are a helpful assistant! Your name is Bob."),
             *         HumanMessage(content="What is your name?"),
             *     ]
             *
             *     # Define a chat model and invoke it with the messages
             *     print(model.invoke(messages))
             *     ```
             */
            @JvmStatic fun ofSystem(system: SystemMessage) = Message(system = system)

            /**
             * Message for passing the result of executing a tool back to a model.
             *
             * `FunctionMessage` are an older version of the `ToolMessage` schema, and do not
             * contain the `tool_call_id` field.
             *
             * The `tool_call_id` field is used to associate the tool call request with the tool
             * call response. Useful in situations where a chat model is able to request multiple
             * tool calls in parallel.
             */
            @JvmStatic fun ofFunction(function: FunctionMessage) = Message(function = function)

            /**
             * Message for passing the result of executing a tool back to a model.
             *
             * `ToolMessage` objects contain the result of a tool invocation. Typically, the result
             * is encoded inside the `content` field.
             *
             * Example: A `ToolMessage` representing a result of `42` from a tool call with id
             *
             * ```python
             * from langchain_core.messages import ToolMessage
             *
             * ToolMessage(content="42", tool_call_id="call_Jja7J89XsjrOLA5r!MEOW!SL")
             * ```
             *
             * Example: A `ToolMessage` where only part of the tool output is sent to the model and
             * the full output is passed in to artifact.
             *
             * ```python
             * from langchain_core.messages import ToolMessage
             *
             * tool_output = {
             *     "stdout": "From the graph we can see that the correlation between "
             *     "x and y is ...",
             *     "stderr": None,
             *     "artifacts": {"type": "image", "base64_data": "/9j/4gIcSU..."},
             * }
             *
             * ToolMessage(
             *     content=tool_output["stdout"],
             *     artifact=tool_output,
             *     tool_call_id="call_Jja7J89XsjrOLA5r!MEOW!SL",
             * )
             * ```
             *
             * The `tool_call_id` field is used to associate the tool call request with the tool
             * call response. Useful in situations where a chat model is able to request multiple
             * tool calls in parallel.
             */
            @JvmStatic fun ofTool(tool: ToolMessage) = Message(tool = tool)

            /** Message chunk from an AI (yielded when streaming). */
            @JvmStatic
            fun ofAiMessageChunk(aiMessageChunk: AiMessageChunk) =
                Message(aiMessageChunk = aiMessageChunk)

            /** Human Message chunk. */
            @JvmStatic
            fun ofHumanMessageChunk(humanMessageChunk: HumanMessageChunk) =
                Message(humanMessageChunk = humanMessageChunk)

            /** Chat Message chunk. */
            @JvmStatic
            fun ofChatMessageChunk(chatMessageChunk: ChatMessageChunk) =
                Message(chatMessageChunk = chatMessageChunk)

            /** System Message chunk. */
            @JvmStatic
            fun ofSystemMessageChunk(systemMessageChunk: SystemMessageChunk) =
                Message(systemMessageChunk = systemMessageChunk)

            /** Function Message chunk. */
            @JvmStatic
            fun ofFunctionMessageChunk(functionMessageChunk: FunctionMessageChunk) =
                Message(functionMessageChunk = functionMessageChunk)

            /** Tool Message chunk. */
            @JvmStatic
            fun ofToolMessageChunk(toolMessageChunk: ToolMessageChunk) =
                Message(toolMessageChunk = toolMessageChunk)
        }

        /**
         * An interface that defines how to map each variant of [Message] to a value of type [T].
         */
        interface Visitor<out T> {

            /**
             * Message from an AI.
             *
             * An `AIMessage` is returned from a chat model as a response to a prompt.
             *
             * This message represents the output of the model and consists of both the raw output
             * as returned by the model and standardized fields (e.g., tool calls, usage metadata)
             * added by the LangChain framework.
             */
            fun visitAi(ai: AiMessage): T

            /**
             * Message from the user.
             *
             * A `HumanMessage` is a message that is passed in from a user to the model.
             *
             * Example:
             *
             *     ```python
             *     from langchain_core.messages import HumanMessage, SystemMessage
             *
             *     messages = [
             *         SystemMessage(content="You are a helpful assistant! Your name is Bob."),
             *         HumanMessage(content="What is your name?"),
             *     ]
             *
             *     # Instantiate a chat model and invoke it with the messages
             *     model = ...
             *     print(model.invoke(messages))
             *     ```
             */
            fun visitHuman(human: HumanMessage): T

            /** Message that can be assigned an arbitrary speaker (i.e. role). */
            fun visitChat(chat: ChatMessage): T

            /**
             * Message for priming AI behavior.
             *
             * The system message is usually passed in as the first of a sequence of input messages.
             *
             * Example:
             *
             *     ```python
             *     from langchain_core.messages import HumanMessage, SystemMessage
             *
             *     messages = [
             *         SystemMessage(content="You are a helpful assistant! Your name is Bob."),
             *         HumanMessage(content="What is your name?"),
             *     ]
             *
             *     # Define a chat model and invoke it with the messages
             *     print(model.invoke(messages))
             *     ```
             */
            fun visitSystem(system: SystemMessage): T

            /**
             * Message for passing the result of executing a tool back to a model.
             *
             * `FunctionMessage` are an older version of the `ToolMessage` schema, and do not
             * contain the `tool_call_id` field.
             *
             * The `tool_call_id` field is used to associate the tool call request with the tool
             * call response. Useful in situations where a chat model is able to request multiple
             * tool calls in parallel.
             */
            fun visitFunction(function: FunctionMessage): T

            /**
             * Message for passing the result of executing a tool back to a model.
             *
             * `ToolMessage` objects contain the result of a tool invocation. Typically, the result
             * is encoded inside the `content` field.
             *
             * Example: A `ToolMessage` representing a result of `42` from a tool call with id
             *
             * ```python
             * from langchain_core.messages import ToolMessage
             *
             * ToolMessage(content="42", tool_call_id="call_Jja7J89XsjrOLA5r!MEOW!SL")
             * ```
             *
             * Example: A `ToolMessage` where only part of the tool output is sent to the model and
             * the full output is passed in to artifact.
             *
             * ```python
             * from langchain_core.messages import ToolMessage
             *
             * tool_output = {
             *     "stdout": "From the graph we can see that the correlation between "
             *     "x and y is ...",
             *     "stderr": None,
             *     "artifacts": {"type": "image", "base64_data": "/9j/4gIcSU..."},
             * }
             *
             * ToolMessage(
             *     content=tool_output["stdout"],
             *     artifact=tool_output,
             *     tool_call_id="call_Jja7J89XsjrOLA5r!MEOW!SL",
             * )
             * ```
             *
             * The `tool_call_id` field is used to associate the tool call request with the tool
             * call response. Useful in situations where a chat model is able to request multiple
             * tool calls in parallel.
             */
            fun visitTool(tool: ToolMessage): T

            /** Message chunk from an AI (yielded when streaming). */
            fun visitAiMessageChunk(aiMessageChunk: AiMessageChunk): T

            /** Human Message chunk. */
            fun visitHumanMessageChunk(humanMessageChunk: HumanMessageChunk): T

            /** Chat Message chunk. */
            fun visitChatMessageChunk(chatMessageChunk: ChatMessageChunk): T

            /** System Message chunk. */
            fun visitSystemMessageChunk(systemMessageChunk: SystemMessageChunk): T

            /** Function Message chunk. */
            fun visitFunctionMessageChunk(functionMessageChunk: FunctionMessageChunk): T

            /** Tool Message chunk. */
            fun visitToolMessageChunk(toolMessageChunk: ToolMessageChunk): T

            /**
             * Maps an unknown variant of [Message] to a value of type [T].
             *
             * An instance of [Message] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LangsmithApiInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangsmithApiInvalidDataException("Unknown Message: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Message>(Message::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Message {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<AiMessage>())?.let {
                                Message(ai = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<HumanMessage>())?.let {
                                Message(human = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ChatMessage>())?.let {
                                Message(chat = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<SystemMessage>())?.let {
                                Message(system = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FunctionMessage>())?.let {
                                Message(function = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ToolMessage>())?.let {
                                Message(tool = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<AiMessageChunk>())?.let {
                                Message(aiMessageChunk = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<HumanMessageChunk>())?.let {
                                Message(humanMessageChunk = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ChatMessageChunk>())?.let {
                                Message(chatMessageChunk = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<SystemMessageChunk>())?.let {
                                Message(systemMessageChunk = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FunctionMessageChunk>())?.let {
                                Message(functionMessageChunk = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ToolMessageChunk>())?.let {
                                Message(toolMessageChunk = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Message(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Message>(Message::class) {

            override fun serialize(
                value: Message,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.ai != null -> generator.writeObject(value.ai)
                    value.human != null -> generator.writeObject(value.human)
                    value.chat != null -> generator.writeObject(value.chat)
                    value.system != null -> generator.writeObject(value.system)
                    value.function != null -> generator.writeObject(value.function)
                    value.tool != null -> generator.writeObject(value.tool)
                    value.aiMessageChunk != null -> generator.writeObject(value.aiMessageChunk)
                    value.humanMessageChunk != null ->
                        generator.writeObject(value.humanMessageChunk)
                    value.chatMessageChunk != null -> generator.writeObject(value.chatMessageChunk)
                    value.systemMessageChunk != null ->
                        generator.writeObject(value.systemMessageChunk)
                    value.functionMessageChunk != null ->
                        generator.writeObject(value.functionMessageChunk)
                    value.toolMessageChunk != null -> generator.writeObject(value.toolMessageChunk)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Message")
                }
            }
        }

        /**
         * Message from an AI.
         *
         * An `AIMessage` is returned from a chat model as a response to a prompt.
         *
         * This message represents the output of the model and consists of both the raw output as
         * returned by the model and standardized fields (e.g., tool calls, usage metadata) added by
         * the LangChain framework.
         */
        class AiMessage
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<Content>,
            private val id: JsonField<String>,
            private val additionalKwargs: JsonValue,
            private val invalidToolCalls: JsonField<List<InvalidToolCall>>,
            private val name: JsonField<String>,
            private val responseMetadata: JsonValue,
            private val toolCalls: JsonField<List<ToolCall>>,
            private val type: JsonField<Type>,
            private val usageMetadata: JsonField<UsageMetadata>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<Content> = JsonMissing.of(),
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("additional_kwargs")
                @ExcludeMissing
                additionalKwargs: JsonValue = JsonMissing.of(),
                @JsonProperty("invalid_tool_calls")
                @ExcludeMissing
                invalidToolCalls: JsonField<List<InvalidToolCall>> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("response_metadata")
                @ExcludeMissing
                responseMetadata: JsonValue = JsonMissing.of(),
                @JsonProperty("tool_calls")
                @ExcludeMissing
                toolCalls: JsonField<List<ToolCall>> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("usage_metadata")
                @ExcludeMissing
                usageMetadata: JsonField<UsageMetadata> = JsonMissing.of(),
            ) : this(
                content,
                id,
                additionalKwargs,
                invalidToolCalls,
                name,
                responseMetadata,
                toolCalls,
                type,
                usageMetadata,
                mutableMapOf(),
            )

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): Content = content.getRequired("content")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            @JsonProperty("additional_kwargs")
            @ExcludeMissing
            fun _additionalKwargs(): JsonValue = additionalKwargs

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun invalidToolCalls(): Optional<List<InvalidToolCall>> =
                invalidToolCalls.getOptional("invalid_tool_calls")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            @JsonProperty("response_metadata")
            @ExcludeMissing
            fun _responseMetadata(): JsonValue = responseMetadata

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun toolCalls(): Optional<List<ToolCall>> = toolCalls.getOptional("tool_calls")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Usage metadata for a message, such as token counts.
             *
             * This is a standard representation of token usage that is consistent across models.
             *
             * Example:
             *
             *     ```python
             *     {
             *         "input_tokens": 350,
             *         "output_tokens": 240,
             *         "total_tokens": 590,
             *         "input_token_details": {
             *             "audio": 10,
             *             "cache_creation": 200,
             *             "cache_read": 100,
             *         },
             *         "output_token_details": {
             *             "audio": 10,
             *             "reasoning": 200,
             *         },
             *     }
             *     ```
             *
             * !!! warning "Behavior changed in 0.3.9" Added `input_token_details` and
             * `output_token_details`.
             *
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun usageMetadata(): Optional<UsageMetadata> =
                usageMetadata.getOptional("usage_metadata")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [invalidToolCalls].
             *
             * Unlike [invalidToolCalls], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("invalid_tool_calls")
            @ExcludeMissing
            fun _invalidToolCalls(): JsonField<List<InvalidToolCall>> = invalidToolCalls

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [toolCalls].
             *
             * Unlike [toolCalls], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tool_calls")
            @ExcludeMissing
            fun _toolCalls(): JsonField<List<ToolCall>> = toolCalls

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [usageMetadata].
             *
             * Unlike [usageMetadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("usage_metadata")
            @ExcludeMissing
            fun _usageMetadata(): JsonField<UsageMetadata> = usageMetadata

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
                 * Returns a mutable builder for constructing an instance of [AiMessage].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AiMessage]. */
            class Builder internal constructor() {

                private var content: JsonField<Content>? = null
                private var id: JsonField<String> = JsonMissing.of()
                private var additionalKwargs: JsonValue = JsonMissing.of()
                private var invalidToolCalls: JsonField<MutableList<InvalidToolCall>>? = null
                private var name: JsonField<String> = JsonMissing.of()
                private var responseMetadata: JsonValue = JsonMissing.of()
                private var toolCalls: JsonField<MutableList<ToolCall>>? = null
                private var type: JsonField<Type> = JsonMissing.of()
                private var usageMetadata: JsonField<UsageMetadata> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(aiMessage: AiMessage) = apply {
                    content = aiMessage.content
                    id = aiMessage.id
                    additionalKwargs = aiMessage.additionalKwargs
                    invalidToolCalls = aiMessage.invalidToolCalls.map { it.toMutableList() }
                    name = aiMessage.name
                    responseMetadata = aiMessage.responseMetadata
                    toolCalls = aiMessage.toolCalls.map { it.toMutableList() }
                    type = aiMessage.type
                    usageMetadata = aiMessage.usageMetadata
                    additionalProperties = aiMessage.additionalProperties.toMutableMap()
                }

                fun content(content: Content) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [Content] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<Content>) = apply { this.content = content }

                /** Alias for calling [content] with `Content.ofString(string)`. */
                fun content(string: String) = content(Content.ofString(string))

                /**
                 * Alias for calling [content] with
                 * `Content.ofUnnamedSchemaWithArrayParent0s(unnamedSchemaWithArrayParent0s)`.
                 */
                fun contentOfUnnamedSchemaWithArrayParent0s(
                    unnamedSchemaWithArrayParent0s: List<Content.UnnamedSchemaWithArrayParent0>
                ) =
                    content(
                        Content.ofUnnamedSchemaWithArrayParent0s(unnamedSchemaWithArrayParent0s)
                    )

                fun id(id: String?) = id(JsonField.ofNullable(id))

                /** Alias for calling [Builder.id] with `id.orElse(null)`. */
                fun id(id: Optional<String>) = id(id.getOrNull())

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalKwargs(additionalKwargs: JsonValue) = apply {
                    this.additionalKwargs = additionalKwargs
                }

                fun invalidToolCalls(invalidToolCalls: List<InvalidToolCall>) =
                    invalidToolCalls(JsonField.of(invalidToolCalls))

                /**
                 * Sets [Builder.invalidToolCalls] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invalidToolCalls] with a well-typed
                 * `List<InvalidToolCall>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun invalidToolCalls(invalidToolCalls: JsonField<List<InvalidToolCall>>) = apply {
                    this.invalidToolCalls = invalidToolCalls.map { it.toMutableList() }
                }

                /**
                 * Adds a single [InvalidToolCall] to [invalidToolCalls].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addInvalidToolCall(invalidToolCall: InvalidToolCall) = apply {
                    invalidToolCalls =
                        (invalidToolCalls ?: JsonField.of(mutableListOf())).also {
                            checkKnown("invalidToolCalls", it).add(invalidToolCall)
                        }
                }

                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun responseMetadata(responseMetadata: JsonValue) = apply {
                    this.responseMetadata = responseMetadata
                }

                fun toolCalls(toolCalls: List<ToolCall>) = toolCalls(JsonField.of(toolCalls))

                /**
                 * Sets [Builder.toolCalls] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.toolCalls] with a well-typed `List<ToolCall>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun toolCalls(toolCalls: JsonField<List<ToolCall>>) = apply {
                    this.toolCalls = toolCalls.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ToolCall] to [toolCalls].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addToolCall(toolCall: ToolCall) = apply {
                    toolCalls =
                        (toolCalls ?: JsonField.of(mutableListOf())).also {
                            checkKnown("toolCalls", it).add(toolCall)
                        }
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /**
                 * Usage metadata for a message, such as token counts.
                 *
                 * This is a standard representation of token usage that is consistent across
                 * models.
                 *
                 * Example:
                 *
                 *     ```python
                 *     {
                 *         "input_tokens": 350,
                 *         "output_tokens": 240,
                 *         "total_tokens": 590,
                 *         "input_token_details": {
                 *             "audio": 10,
                 *             "cache_creation": 200,
                 *             "cache_read": 100,
                 *         },
                 *         "output_token_details": {
                 *             "audio": 10,
                 *             "reasoning": 200,
                 *         },
                 *     }
                 *     ```
                 *
                 * !!! warning "Behavior changed in 0.3.9" Added `input_token_details` and
                 * `output_token_details`.
                 */
                fun usageMetadata(usageMetadata: UsageMetadata?) =
                    usageMetadata(JsonField.ofNullable(usageMetadata))

                /** Alias for calling [Builder.usageMetadata] with `usageMetadata.orElse(null)`. */
                fun usageMetadata(usageMetadata: Optional<UsageMetadata>) =
                    usageMetadata(usageMetadata.getOrNull())

                /**
                 * Sets [Builder.usageMetadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usageMetadata] with a well-typed [UsageMetadata]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun usageMetadata(usageMetadata: JsonField<UsageMetadata>) = apply {
                    this.usageMetadata = usageMetadata
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [AiMessage].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AiMessage =
                    AiMessage(
                        checkRequired("content", content),
                        id,
                        additionalKwargs,
                        (invalidToolCalls ?: JsonMissing.of()).map { it.toImmutable() },
                        name,
                        responseMetadata,
                        (toolCalls ?: JsonMissing.of()).map { it.toImmutable() },
                        type,
                        usageMetadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AiMessage = apply {
                if (validated) {
                    return@apply
                }

                content().validate()
                id()
                invalidToolCalls().ifPresent { it.forEach { it.validate() } }
                name()
                toolCalls().ifPresent { it.forEach { it.validate() } }
                type().ifPresent { it.validate() }
                usageMetadata().ifPresent { it.validate() }
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
                (content.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (id.asKnown().isPresent) 1 else 0) +
                    (invalidToolCalls.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (toolCalls.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (usageMetadata.asKnown().getOrNull()?.validity() ?: 0)

            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val string: String? = null,
                private val unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>? =
                    null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun unnamedSchemaWithArrayParent0s():
                    Optional<List<UnnamedSchemaWithArrayParent0>> =
                    Optional.ofNullable(unnamedSchemaWithArrayParent0s)

                fun isString(): Boolean = string != null

                fun isUnnamedSchemaWithArrayParent0s(): Boolean =
                    unnamedSchemaWithArrayParent0s != null

                fun asString(): String = string.getOrThrow("string")

                fun asUnnamedSchemaWithArrayParent0s(): List<UnnamedSchemaWithArrayParent0> =
                    unnamedSchemaWithArrayParent0s.getOrThrow("unnamedSchemaWithArrayParent0s")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        unnamedSchemaWithArrayParent0s != null ->
                            visitor.visitUnnamedSchemaWithArrayParent0s(
                                unnamedSchemaWithArrayParent0s
                            )
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Content = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitUnnamedSchemaWithArrayParent0s(
                                unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>
                            ) {
                                unnamedSchemaWithArrayParent0s.forEach { it.validate() }
                            }
                        }
                    )
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
                    accept(
                        object : Visitor<Int> {
                            override fun visitString(string: String) = 1

                            override fun visitUnnamedSchemaWithArrayParent0s(
                                unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>
                            ) = unnamedSchemaWithArrayParent0s.sumOf { it.validity().toInt() }

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Content &&
                        string == other.string &&
                        unnamedSchemaWithArrayParent0s == other.unnamedSchemaWithArrayParent0s
                }

                override fun hashCode(): Int = Objects.hash(string, unnamedSchemaWithArrayParent0s)

                override fun toString(): String =
                    when {
                        string != null -> "Content{string=$string}"
                        unnamedSchemaWithArrayParent0s != null ->
                            "Content{unnamedSchemaWithArrayParent0s=$unnamedSchemaWithArrayParent0s}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }

                companion object {

                    @JvmStatic fun ofString(string: String) = Content(string = string)

                    @JvmStatic
                    fun ofUnnamedSchemaWithArrayParent0s(
                        unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>
                    ) =
                        Content(
                            unnamedSchemaWithArrayParent0s =
                                unnamedSchemaWithArrayParent0s.toImmutable()
                        )
                }

                /**
                 * An interface that defines how to map each variant of [Content] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitUnnamedSchemaWithArrayParent0s(
                        unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>
                    ): T

                    /**
                     * Maps an unknown variant of [Content] to a value of type [T].
                     *
                     * An instance of [Content] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws LangsmithApiInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LangsmithApiInvalidDataException("Unknown Content: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Content {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Content(string = it, _json = json)
                                    },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<List<UnnamedSchemaWithArrayParent0>>(),
                                        )
                                        ?.let {
                                            Content(
                                                unnamedSchemaWithArrayParent0s = it,
                                                _json = json,
                                            )
                                        },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // object).
                            0 -> Content(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Content>(Content::class) {

                    override fun serialize(
                        value: Content,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.unnamedSchemaWithArrayParent0s != null ->
                                generator.writeObject(value.unnamedSchemaWithArrayParent0s)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }

                @JsonDeserialize(using = UnnamedSchemaWithArrayParent0.Deserializer::class)
                @JsonSerialize(using = UnnamedSchemaWithArrayParent0.Serializer::class)
                class UnnamedSchemaWithArrayParent0
                private constructor(
                    private val string: String? = null,
                    private val jsonValue: JsonValue? = null,
                    private val _json: JsonValue? = null,
                ) {

                    fun string(): Optional<String> = Optional.ofNullable(string)

                    fun jsonValue(): Optional<JsonValue> = Optional.ofNullable(jsonValue)

                    fun isString(): Boolean = string != null

                    fun isJsonValue(): Boolean = jsonValue != null

                    fun asString(): String = string.getOrThrow("string")

                    fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

                    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            string != null -> visitor.visitString(string)
                            jsonValue != null -> visitor.visitJsonValue(jsonValue)
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): UnnamedSchemaWithArrayParent0 = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitString(string: String) {}

                                override fun visitJsonValue(jsonValue: JsonValue) {}
                            }
                        )
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
                        accept(
                            object : Visitor<Int> {
                                override fun visitString(string: String) = 1

                                override fun visitJsonValue(jsonValue: JsonValue) = 1

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is UnnamedSchemaWithArrayParent0 &&
                            string == other.string &&
                            jsonValue == other.jsonValue
                    }

                    override fun hashCode(): Int = Objects.hash(string, jsonValue)

                    override fun toString(): String =
                        when {
                            string != null -> "UnnamedSchemaWithArrayParent0{string=$string}"
                            jsonValue != null ->
                                "UnnamedSchemaWithArrayParent0{jsonValue=$jsonValue}"
                            _json != null -> "UnnamedSchemaWithArrayParent0{_unknown=$_json}"
                            else ->
                                throw IllegalStateException("Invalid UnnamedSchemaWithArrayParent0")
                        }

                    companion object {

                        @JvmStatic
                        fun ofString(string: String) =
                            UnnamedSchemaWithArrayParent0(string = string)

                        @JvmStatic
                        fun ofJsonValue(jsonValue: JsonValue) =
                            UnnamedSchemaWithArrayParent0(jsonValue = jsonValue)
                    }

                    /**
                     * An interface that defines how to map each variant of
                     * [UnnamedSchemaWithArrayParent0] to a value of type [T].
                     */
                    interface Visitor<out T> {

                        fun visitString(string: String): T

                        fun visitJsonValue(jsonValue: JsonValue): T

                        /**
                         * Maps an unknown variant of [UnnamedSchemaWithArrayParent0] to a value of
                         * type [T].
                         *
                         * An instance of [UnnamedSchemaWithArrayParent0] can contain an unknown
                         * variant if it was deserialized from data that doesn't match any known
                         * variant. For example, if the SDK is on an older version than the API,
                         * then the API may respond with new variants that the SDK is unaware of.
                         *
                         * @throws LangsmithApiInvalidDataException in the default implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw LangsmithApiInvalidDataException(
                                "Unknown UnnamedSchemaWithArrayParent0: $json"
                            )
                        }
                    }

                    internal class Deserializer :
                        BaseDeserializer<UnnamedSchemaWithArrayParent0>(
                            UnnamedSchemaWithArrayParent0::class
                        ) {

                        override fun ObjectCodec.deserialize(
                            node: JsonNode
                        ): UnnamedSchemaWithArrayParent0 {
                            val json = JsonValue.fromJsonNode(node)

                            val bestMatches =
                                sequenceOf(
                                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                            UnnamedSchemaWithArrayParent0(string = it, _json = json)
                                        },
                                        tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                            UnnamedSchemaWithArrayParent0(
                                                jsonValue = it,
                                                _json = json,
                                            )
                                        },
                                    )
                                    .filterNotNull()
                                    .allMaxBy { it.validity() }
                                    .toList()
                            return when (bestMatches.size) {
                                // This can happen if what we're deserializing is completely
                                // incompatible with all the possible variants.
                                0 -> UnnamedSchemaWithArrayParent0(_json = json)
                                1 -> bestMatches.single()
                                // If there's more than one match with the highest validity, then
                                // use the first completely valid match, or simply the first match
                                // if none are completely valid.
                                else ->
                                    bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                            }
                        }
                    }

                    internal class Serializer :
                        BaseSerializer<UnnamedSchemaWithArrayParent0>(
                            UnnamedSchemaWithArrayParent0::class
                        ) {

                        override fun serialize(
                            value: UnnamedSchemaWithArrayParent0,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.string != null -> generator.writeObject(value.string)
                                value.jsonValue != null -> generator.writeObject(value.jsonValue)
                                value._json != null -> generator.writeObject(value._json)
                                else ->
                                    throw IllegalStateException(
                                        "Invalid UnnamedSchemaWithArrayParent0"
                                    )
                            }
                        }
                    }
                }
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val AI = of("ai")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    AI
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    AI,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        AI -> Value.AI
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        AI -> Known.AI
                        else -> throw LangsmithApiInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LangsmithApiInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Type = apply {
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
                    } catch (e: LangsmithApiInvalidDataException) {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AiMessage &&
                    content == other.content &&
                    id == other.id &&
                    additionalKwargs == other.additionalKwargs &&
                    invalidToolCalls == other.invalidToolCalls &&
                    name == other.name &&
                    responseMetadata == other.responseMetadata &&
                    toolCalls == other.toolCalls &&
                    type == other.type &&
                    usageMetadata == other.usageMetadata &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    content,
                    id,
                    additionalKwargs,
                    invalidToolCalls,
                    name,
                    responseMetadata,
                    toolCalls,
                    type,
                    usageMetadata,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AiMessage{content=$content, id=$id, additionalKwargs=$additionalKwargs, invalidToolCalls=$invalidToolCalls, name=$name, responseMetadata=$responseMetadata, toolCalls=$toolCalls, type=$type, usageMetadata=$usageMetadata, additionalProperties=$additionalProperties}"
        }

        /**
         * Message from the user.
         *
         * A `HumanMessage` is a message that is passed in from a user to the model.
         *
         * Example:
         *
         *     ```python
         *     from langchain_core.messages import HumanMessage, SystemMessage
         *
         *     messages = [
         *         SystemMessage(content="You are a helpful assistant! Your name is Bob."),
         *         HumanMessage(content="What is your name?"),
         *     ]
         *
         *     # Instantiate a chat model and invoke it with the messages
         *     model = ...
         *     print(model.invoke(messages))
         *     ```
         */
        class HumanMessage
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<Content>,
            private val id: JsonField<String>,
            private val additionalKwargs: JsonValue,
            private val name: JsonField<String>,
            private val responseMetadata: JsonValue,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<Content> = JsonMissing.of(),
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("additional_kwargs")
                @ExcludeMissing
                additionalKwargs: JsonValue = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("response_metadata")
                @ExcludeMissing
                responseMetadata: JsonValue = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(content, id, additionalKwargs, name, responseMetadata, type, mutableMapOf())

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): Content = content.getRequired("content")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            @JsonProperty("additional_kwargs")
            @ExcludeMissing
            fun _additionalKwargs(): JsonValue = additionalKwargs

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            @JsonProperty("response_metadata")
            @ExcludeMissing
            fun _responseMetadata(): JsonValue = responseMetadata

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [HumanMessage].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [HumanMessage]. */
            class Builder internal constructor() {

                private var content: JsonField<Content>? = null
                private var id: JsonField<String> = JsonMissing.of()
                private var additionalKwargs: JsonValue = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var responseMetadata: JsonValue = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(humanMessage: HumanMessage) = apply {
                    content = humanMessage.content
                    id = humanMessage.id
                    additionalKwargs = humanMessage.additionalKwargs
                    name = humanMessage.name
                    responseMetadata = humanMessage.responseMetadata
                    type = humanMessage.type
                    additionalProperties = humanMessage.additionalProperties.toMutableMap()
                }

                fun content(content: Content) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [Content] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<Content>) = apply { this.content = content }

                /** Alias for calling [content] with `Content.ofString(string)`. */
                fun content(string: String) = content(Content.ofString(string))

                /**
                 * Alias for calling [content] with
                 * `Content.ofUnnamedSchemaWithArrayParent1s(unnamedSchemaWithArrayParent1s)`.
                 */
                fun contentOfUnnamedSchemaWithArrayParent1s(
                    unnamedSchemaWithArrayParent1s: List<Content.UnnamedSchemaWithArrayParent1>
                ) =
                    content(
                        Content.ofUnnamedSchemaWithArrayParent1s(unnamedSchemaWithArrayParent1s)
                    )

                fun id(id: String?) = id(JsonField.ofNullable(id))

                /** Alias for calling [Builder.id] with `id.orElse(null)`. */
                fun id(id: Optional<String>) = id(id.getOrNull())

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalKwargs(additionalKwargs: JsonValue) = apply {
                    this.additionalKwargs = additionalKwargs
                }

                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun responseMetadata(responseMetadata: JsonValue) = apply {
                    this.responseMetadata = responseMetadata
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [HumanMessage].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): HumanMessage =
                    HumanMessage(
                        checkRequired("content", content),
                        id,
                        additionalKwargs,
                        name,
                        responseMetadata,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): HumanMessage = apply {
                if (validated) {
                    return@apply
                }

                content().validate()
                id()
                name()
                type().ifPresent { it.validate() }
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
                (content.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (id.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val string: String? = null,
                private val unnamedSchemaWithArrayParent1s: List<UnnamedSchemaWithArrayParent1>? =
                    null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun unnamedSchemaWithArrayParent1s():
                    Optional<List<UnnamedSchemaWithArrayParent1>> =
                    Optional.ofNullable(unnamedSchemaWithArrayParent1s)

                fun isString(): Boolean = string != null

                fun isUnnamedSchemaWithArrayParent1s(): Boolean =
                    unnamedSchemaWithArrayParent1s != null

                fun asString(): String = string.getOrThrow("string")

                fun asUnnamedSchemaWithArrayParent1s(): List<UnnamedSchemaWithArrayParent1> =
                    unnamedSchemaWithArrayParent1s.getOrThrow("unnamedSchemaWithArrayParent1s")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        unnamedSchemaWithArrayParent1s != null ->
                            visitor.visitUnnamedSchemaWithArrayParent1s(
                                unnamedSchemaWithArrayParent1s
                            )
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Content = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitUnnamedSchemaWithArrayParent1s(
                                unnamedSchemaWithArrayParent1s: List<UnnamedSchemaWithArrayParent1>
                            ) {
                                unnamedSchemaWithArrayParent1s.forEach { it.validate() }
                            }
                        }
                    )
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
                    accept(
                        object : Visitor<Int> {
                            override fun visitString(string: String) = 1

                            override fun visitUnnamedSchemaWithArrayParent1s(
                                unnamedSchemaWithArrayParent1s: List<UnnamedSchemaWithArrayParent1>
                            ) = unnamedSchemaWithArrayParent1s.sumOf { it.validity().toInt() }

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Content &&
                        string == other.string &&
                        unnamedSchemaWithArrayParent1s == other.unnamedSchemaWithArrayParent1s
                }

                override fun hashCode(): Int = Objects.hash(string, unnamedSchemaWithArrayParent1s)

                override fun toString(): String =
                    when {
                        string != null -> "Content{string=$string}"
                        unnamedSchemaWithArrayParent1s != null ->
                            "Content{unnamedSchemaWithArrayParent1s=$unnamedSchemaWithArrayParent1s}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }

                companion object {

                    @JvmStatic fun ofString(string: String) = Content(string = string)

                    @JvmStatic
                    fun ofUnnamedSchemaWithArrayParent1s(
                        unnamedSchemaWithArrayParent1s: List<UnnamedSchemaWithArrayParent1>
                    ) =
                        Content(
                            unnamedSchemaWithArrayParent1s =
                                unnamedSchemaWithArrayParent1s.toImmutable()
                        )
                }

                /**
                 * An interface that defines how to map each variant of [Content] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitUnnamedSchemaWithArrayParent1s(
                        unnamedSchemaWithArrayParent1s: List<UnnamedSchemaWithArrayParent1>
                    ): T

                    /**
                     * Maps an unknown variant of [Content] to a value of type [T].
                     *
                     * An instance of [Content] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws LangsmithApiInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LangsmithApiInvalidDataException("Unknown Content: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Content {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Content(string = it, _json = json)
                                    },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<List<UnnamedSchemaWithArrayParent1>>(),
                                        )
                                        ?.let {
                                            Content(
                                                unnamedSchemaWithArrayParent1s = it,
                                                _json = json,
                                            )
                                        },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // object).
                            0 -> Content(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Content>(Content::class) {

                    override fun serialize(
                        value: Content,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.unnamedSchemaWithArrayParent1s != null ->
                                generator.writeObject(value.unnamedSchemaWithArrayParent1s)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }

                @JsonDeserialize(using = UnnamedSchemaWithArrayParent1.Deserializer::class)
                @JsonSerialize(using = UnnamedSchemaWithArrayParent1.Serializer::class)
                class UnnamedSchemaWithArrayParent1
                private constructor(
                    private val string: String? = null,
                    private val jsonValue: JsonValue? = null,
                    private val _json: JsonValue? = null,
                ) {

                    fun string(): Optional<String> = Optional.ofNullable(string)

                    fun jsonValue(): Optional<JsonValue> = Optional.ofNullable(jsonValue)

                    fun isString(): Boolean = string != null

                    fun isJsonValue(): Boolean = jsonValue != null

                    fun asString(): String = string.getOrThrow("string")

                    fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

                    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            string != null -> visitor.visitString(string)
                            jsonValue != null -> visitor.visitJsonValue(jsonValue)
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): UnnamedSchemaWithArrayParent1 = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitString(string: String) {}

                                override fun visitJsonValue(jsonValue: JsonValue) {}
                            }
                        )
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
                        accept(
                            object : Visitor<Int> {
                                override fun visitString(string: String) = 1

                                override fun visitJsonValue(jsonValue: JsonValue) = 1

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is UnnamedSchemaWithArrayParent1 &&
                            string == other.string &&
                            jsonValue == other.jsonValue
                    }

                    override fun hashCode(): Int = Objects.hash(string, jsonValue)

                    override fun toString(): String =
                        when {
                            string != null -> "UnnamedSchemaWithArrayParent1{string=$string}"
                            jsonValue != null ->
                                "UnnamedSchemaWithArrayParent1{jsonValue=$jsonValue}"
                            _json != null -> "UnnamedSchemaWithArrayParent1{_unknown=$_json}"
                            else ->
                                throw IllegalStateException("Invalid UnnamedSchemaWithArrayParent1")
                        }

                    companion object {

                        @JvmStatic
                        fun ofString(string: String) =
                            UnnamedSchemaWithArrayParent1(string = string)

                        @JvmStatic
                        fun ofJsonValue(jsonValue: JsonValue) =
                            UnnamedSchemaWithArrayParent1(jsonValue = jsonValue)
                    }

                    /**
                     * An interface that defines how to map each variant of
                     * [UnnamedSchemaWithArrayParent1] to a value of type [T].
                     */
                    interface Visitor<out T> {

                        fun visitString(string: String): T

                        fun visitJsonValue(jsonValue: JsonValue): T

                        /**
                         * Maps an unknown variant of [UnnamedSchemaWithArrayParent1] to a value of
                         * type [T].
                         *
                         * An instance of [UnnamedSchemaWithArrayParent1] can contain an unknown
                         * variant if it was deserialized from data that doesn't match any known
                         * variant. For example, if the SDK is on an older version than the API,
                         * then the API may respond with new variants that the SDK is unaware of.
                         *
                         * @throws LangsmithApiInvalidDataException in the default implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw LangsmithApiInvalidDataException(
                                "Unknown UnnamedSchemaWithArrayParent1: $json"
                            )
                        }
                    }

                    internal class Deserializer :
                        BaseDeserializer<UnnamedSchemaWithArrayParent1>(
                            UnnamedSchemaWithArrayParent1::class
                        ) {

                        override fun ObjectCodec.deserialize(
                            node: JsonNode
                        ): UnnamedSchemaWithArrayParent1 {
                            val json = JsonValue.fromJsonNode(node)

                            val bestMatches =
                                sequenceOf(
                                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                            UnnamedSchemaWithArrayParent1(string = it, _json = json)
                                        },
                                        tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                            UnnamedSchemaWithArrayParent1(
                                                jsonValue = it,
                                                _json = json,
                                            )
                                        },
                                    )
                                    .filterNotNull()
                                    .allMaxBy { it.validity() }
                                    .toList()
                            return when (bestMatches.size) {
                                // This can happen if what we're deserializing is completely
                                // incompatible with all the possible variants.
                                0 -> UnnamedSchemaWithArrayParent1(_json = json)
                                1 -> bestMatches.single()
                                // If there's more than one match with the highest validity, then
                                // use the first completely valid match, or simply the first match
                                // if none are completely valid.
                                else ->
                                    bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                            }
                        }
                    }

                    internal class Serializer :
                        BaseSerializer<UnnamedSchemaWithArrayParent1>(
                            UnnamedSchemaWithArrayParent1::class
                        ) {

                        override fun serialize(
                            value: UnnamedSchemaWithArrayParent1,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.string != null -> generator.writeObject(value.string)
                                value.jsonValue != null -> generator.writeObject(value.jsonValue)
                                value._json != null -> generator.writeObject(value._json)
                                else ->
                                    throw IllegalStateException(
                                        "Invalid UnnamedSchemaWithArrayParent1"
                                    )
                            }
                        }
                    }
                }
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val HUMAN = of("human")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    HUMAN
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    HUMAN,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        HUMAN -> Value.HUMAN
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        HUMAN -> Known.HUMAN
                        else -> throw LangsmithApiInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LangsmithApiInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Type = apply {
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
                    } catch (e: LangsmithApiInvalidDataException) {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is HumanMessage &&
                    content == other.content &&
                    id == other.id &&
                    additionalKwargs == other.additionalKwargs &&
                    name == other.name &&
                    responseMetadata == other.responseMetadata &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    content,
                    id,
                    additionalKwargs,
                    name,
                    responseMetadata,
                    type,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "HumanMessage{content=$content, id=$id, additionalKwargs=$additionalKwargs, name=$name, responseMetadata=$responseMetadata, type=$type, additionalProperties=$additionalProperties}"
        }

        /** Message that can be assigned an arbitrary speaker (i.e. role). */
        class ChatMessage
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<Content>,
            private val role: JsonField<String>,
            private val id: JsonField<String>,
            private val additionalKwargs: JsonValue,
            private val name: JsonField<String>,
            private val responseMetadata: JsonValue,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<Content> = JsonMissing.of(),
                @JsonProperty("role") @ExcludeMissing role: JsonField<String> = JsonMissing.of(),
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("additional_kwargs")
                @ExcludeMissing
                additionalKwargs: JsonValue = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("response_metadata")
                @ExcludeMissing
                responseMetadata: JsonValue = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(
                content,
                role,
                id,
                additionalKwargs,
                name,
                responseMetadata,
                type,
                mutableMapOf(),
            )

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): Content = content.getRequired("content")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun role(): String = role.getRequired("role")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            @JsonProperty("additional_kwargs")
            @ExcludeMissing
            fun _additionalKwargs(): JsonValue = additionalKwargs

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            @JsonProperty("response_metadata")
            @ExcludeMissing
            fun _responseMetadata(): JsonValue = responseMetadata

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

            /**
             * Returns the raw JSON value of [role].
             *
             * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<String> = role

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [ChatMessage].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * .role()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ChatMessage]. */
            class Builder internal constructor() {

                private var content: JsonField<Content>? = null
                private var role: JsonField<String>? = null
                private var id: JsonField<String> = JsonMissing.of()
                private var additionalKwargs: JsonValue = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var responseMetadata: JsonValue = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(chatMessage: ChatMessage) = apply {
                    content = chatMessage.content
                    role = chatMessage.role
                    id = chatMessage.id
                    additionalKwargs = chatMessage.additionalKwargs
                    name = chatMessage.name
                    responseMetadata = chatMessage.responseMetadata
                    type = chatMessage.type
                    additionalProperties = chatMessage.additionalProperties.toMutableMap()
                }

                fun content(content: Content) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [Content] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<Content>) = apply { this.content = content }

                /** Alias for calling [content] with `Content.ofString(string)`. */
                fun content(string: String) = content(Content.ofString(string))

                /**
                 * Alias for calling [content] with
                 * `Content.ofUnnamedSchemaWithArrayParent2s(unnamedSchemaWithArrayParent2s)`.
                 */
                fun contentOfUnnamedSchemaWithArrayParent2s(
                    unnamedSchemaWithArrayParent2s: List<Content.UnnamedSchemaWithArrayParent2>
                ) =
                    content(
                        Content.ofUnnamedSchemaWithArrayParent2s(unnamedSchemaWithArrayParent2s)
                    )

                fun role(role: String) = role(JsonField.of(role))

                /**
                 * Sets [Builder.role] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.role] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonField<String>) = apply { this.role = role }

                fun id(id: String?) = id(JsonField.ofNullable(id))

                /** Alias for calling [Builder.id] with `id.orElse(null)`. */
                fun id(id: Optional<String>) = id(id.getOrNull())

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalKwargs(additionalKwargs: JsonValue) = apply {
                    this.additionalKwargs = additionalKwargs
                }

                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun responseMetadata(responseMetadata: JsonValue) = apply {
                    this.responseMetadata = responseMetadata
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ChatMessage].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * .role()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ChatMessage =
                    ChatMessage(
                        checkRequired("content", content),
                        checkRequired("role", role),
                        id,
                        additionalKwargs,
                        name,
                        responseMetadata,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ChatMessage = apply {
                if (validated) {
                    return@apply
                }

                content().validate()
                role()
                id()
                name()
                type().ifPresent { it.validate() }
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
                (content.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (role.asKnown().isPresent) 1 else 0) +
                    (if (id.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val string: String? = null,
                private val unnamedSchemaWithArrayParent2s: List<UnnamedSchemaWithArrayParent2>? =
                    null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun unnamedSchemaWithArrayParent2s():
                    Optional<List<UnnamedSchemaWithArrayParent2>> =
                    Optional.ofNullable(unnamedSchemaWithArrayParent2s)

                fun isString(): Boolean = string != null

                fun isUnnamedSchemaWithArrayParent2s(): Boolean =
                    unnamedSchemaWithArrayParent2s != null

                fun asString(): String = string.getOrThrow("string")

                fun asUnnamedSchemaWithArrayParent2s(): List<UnnamedSchemaWithArrayParent2> =
                    unnamedSchemaWithArrayParent2s.getOrThrow("unnamedSchemaWithArrayParent2s")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        unnamedSchemaWithArrayParent2s != null ->
                            visitor.visitUnnamedSchemaWithArrayParent2s(
                                unnamedSchemaWithArrayParent2s
                            )
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Content = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitUnnamedSchemaWithArrayParent2s(
                                unnamedSchemaWithArrayParent2s: List<UnnamedSchemaWithArrayParent2>
                            ) {
                                unnamedSchemaWithArrayParent2s.forEach { it.validate() }
                            }
                        }
                    )
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
                    accept(
                        object : Visitor<Int> {
                            override fun visitString(string: String) = 1

                            override fun visitUnnamedSchemaWithArrayParent2s(
                                unnamedSchemaWithArrayParent2s: List<UnnamedSchemaWithArrayParent2>
                            ) = unnamedSchemaWithArrayParent2s.sumOf { it.validity().toInt() }

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Content &&
                        string == other.string &&
                        unnamedSchemaWithArrayParent2s == other.unnamedSchemaWithArrayParent2s
                }

                override fun hashCode(): Int = Objects.hash(string, unnamedSchemaWithArrayParent2s)

                override fun toString(): String =
                    when {
                        string != null -> "Content{string=$string}"
                        unnamedSchemaWithArrayParent2s != null ->
                            "Content{unnamedSchemaWithArrayParent2s=$unnamedSchemaWithArrayParent2s}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }

                companion object {

                    @JvmStatic fun ofString(string: String) = Content(string = string)

                    @JvmStatic
                    fun ofUnnamedSchemaWithArrayParent2s(
                        unnamedSchemaWithArrayParent2s: List<UnnamedSchemaWithArrayParent2>
                    ) =
                        Content(
                            unnamedSchemaWithArrayParent2s =
                                unnamedSchemaWithArrayParent2s.toImmutable()
                        )
                }

                /**
                 * An interface that defines how to map each variant of [Content] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitUnnamedSchemaWithArrayParent2s(
                        unnamedSchemaWithArrayParent2s: List<UnnamedSchemaWithArrayParent2>
                    ): T

                    /**
                     * Maps an unknown variant of [Content] to a value of type [T].
                     *
                     * An instance of [Content] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws LangsmithApiInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LangsmithApiInvalidDataException("Unknown Content: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Content {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Content(string = it, _json = json)
                                    },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<List<UnnamedSchemaWithArrayParent2>>(),
                                        )
                                        ?.let {
                                            Content(
                                                unnamedSchemaWithArrayParent2s = it,
                                                _json = json,
                                            )
                                        },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // object).
                            0 -> Content(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Content>(Content::class) {

                    override fun serialize(
                        value: Content,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.unnamedSchemaWithArrayParent2s != null ->
                                generator.writeObject(value.unnamedSchemaWithArrayParent2s)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }

                @JsonDeserialize(using = UnnamedSchemaWithArrayParent2.Deserializer::class)
                @JsonSerialize(using = UnnamedSchemaWithArrayParent2.Serializer::class)
                class UnnamedSchemaWithArrayParent2
                private constructor(
                    private val string: String? = null,
                    private val jsonValue: JsonValue? = null,
                    private val _json: JsonValue? = null,
                ) {

                    fun string(): Optional<String> = Optional.ofNullable(string)

                    fun jsonValue(): Optional<JsonValue> = Optional.ofNullable(jsonValue)

                    fun isString(): Boolean = string != null

                    fun isJsonValue(): Boolean = jsonValue != null

                    fun asString(): String = string.getOrThrow("string")

                    fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

                    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            string != null -> visitor.visitString(string)
                            jsonValue != null -> visitor.visitJsonValue(jsonValue)
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): UnnamedSchemaWithArrayParent2 = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitString(string: String) {}

                                override fun visitJsonValue(jsonValue: JsonValue) {}
                            }
                        )
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
                        accept(
                            object : Visitor<Int> {
                                override fun visitString(string: String) = 1

                                override fun visitJsonValue(jsonValue: JsonValue) = 1

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is UnnamedSchemaWithArrayParent2 &&
                            string == other.string &&
                            jsonValue == other.jsonValue
                    }

                    override fun hashCode(): Int = Objects.hash(string, jsonValue)

                    override fun toString(): String =
                        when {
                            string != null -> "UnnamedSchemaWithArrayParent2{string=$string}"
                            jsonValue != null ->
                                "UnnamedSchemaWithArrayParent2{jsonValue=$jsonValue}"
                            _json != null -> "UnnamedSchemaWithArrayParent2{_unknown=$_json}"
                            else ->
                                throw IllegalStateException("Invalid UnnamedSchemaWithArrayParent2")
                        }

                    companion object {

                        @JvmStatic
                        fun ofString(string: String) =
                            UnnamedSchemaWithArrayParent2(string = string)

                        @JvmStatic
                        fun ofJsonValue(jsonValue: JsonValue) =
                            UnnamedSchemaWithArrayParent2(jsonValue = jsonValue)
                    }

                    /**
                     * An interface that defines how to map each variant of
                     * [UnnamedSchemaWithArrayParent2] to a value of type [T].
                     */
                    interface Visitor<out T> {

                        fun visitString(string: String): T

                        fun visitJsonValue(jsonValue: JsonValue): T

                        /**
                         * Maps an unknown variant of [UnnamedSchemaWithArrayParent2] to a value of
                         * type [T].
                         *
                         * An instance of [UnnamedSchemaWithArrayParent2] can contain an unknown
                         * variant if it was deserialized from data that doesn't match any known
                         * variant. For example, if the SDK is on an older version than the API,
                         * then the API may respond with new variants that the SDK is unaware of.
                         *
                         * @throws LangsmithApiInvalidDataException in the default implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw LangsmithApiInvalidDataException(
                                "Unknown UnnamedSchemaWithArrayParent2: $json"
                            )
                        }
                    }

                    internal class Deserializer :
                        BaseDeserializer<UnnamedSchemaWithArrayParent2>(
                            UnnamedSchemaWithArrayParent2::class
                        ) {

                        override fun ObjectCodec.deserialize(
                            node: JsonNode
                        ): UnnamedSchemaWithArrayParent2 {
                            val json = JsonValue.fromJsonNode(node)

                            val bestMatches =
                                sequenceOf(
                                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                            UnnamedSchemaWithArrayParent2(string = it, _json = json)
                                        },
                                        tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                            UnnamedSchemaWithArrayParent2(
                                                jsonValue = it,
                                                _json = json,
                                            )
                                        },
                                    )
                                    .filterNotNull()
                                    .allMaxBy { it.validity() }
                                    .toList()
                            return when (bestMatches.size) {
                                // This can happen if what we're deserializing is completely
                                // incompatible with all the possible variants.
                                0 -> UnnamedSchemaWithArrayParent2(_json = json)
                                1 -> bestMatches.single()
                                // If there's more than one match with the highest validity, then
                                // use the first completely valid match, or simply the first match
                                // if none are completely valid.
                                else ->
                                    bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                            }
                        }
                    }

                    internal class Serializer :
                        BaseSerializer<UnnamedSchemaWithArrayParent2>(
                            UnnamedSchemaWithArrayParent2::class
                        ) {

                        override fun serialize(
                            value: UnnamedSchemaWithArrayParent2,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.string != null -> generator.writeObject(value.string)
                                value.jsonValue != null -> generator.writeObject(value.jsonValue)
                                value._json != null -> generator.writeObject(value._json)
                                else ->
                                    throw IllegalStateException(
                                        "Invalid UnnamedSchemaWithArrayParent2"
                                    )
                            }
                        }
                    }
                }
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CHAT = of("chat")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    CHAT
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CHAT,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CHAT -> Value.CHAT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        CHAT -> Known.CHAT
                        else -> throw LangsmithApiInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LangsmithApiInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Type = apply {
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
                    } catch (e: LangsmithApiInvalidDataException) {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ChatMessage &&
                    content == other.content &&
                    role == other.role &&
                    id == other.id &&
                    additionalKwargs == other.additionalKwargs &&
                    name == other.name &&
                    responseMetadata == other.responseMetadata &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    content,
                    role,
                    id,
                    additionalKwargs,
                    name,
                    responseMetadata,
                    type,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ChatMessage{content=$content, role=$role, id=$id, additionalKwargs=$additionalKwargs, name=$name, responseMetadata=$responseMetadata, type=$type, additionalProperties=$additionalProperties}"
        }

        /**
         * Message for priming AI behavior.
         *
         * The system message is usually passed in as the first of a sequence of input messages.
         *
         * Example:
         *
         *     ```python
         *     from langchain_core.messages import HumanMessage, SystemMessage
         *
         *     messages = [
         *         SystemMessage(content="You are a helpful assistant! Your name is Bob."),
         *         HumanMessage(content="What is your name?"),
         *     ]
         *
         *     # Define a chat model and invoke it with the messages
         *     print(model.invoke(messages))
         *     ```
         */
        class SystemMessage
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<Content>,
            private val id: JsonField<String>,
            private val additionalKwargs: JsonValue,
            private val name: JsonField<String>,
            private val responseMetadata: JsonValue,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<Content> = JsonMissing.of(),
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("additional_kwargs")
                @ExcludeMissing
                additionalKwargs: JsonValue = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("response_metadata")
                @ExcludeMissing
                responseMetadata: JsonValue = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(content, id, additionalKwargs, name, responseMetadata, type, mutableMapOf())

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): Content = content.getRequired("content")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            @JsonProperty("additional_kwargs")
            @ExcludeMissing
            fun _additionalKwargs(): JsonValue = additionalKwargs

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            @JsonProperty("response_metadata")
            @ExcludeMissing
            fun _responseMetadata(): JsonValue = responseMetadata

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [SystemMessage].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SystemMessage]. */
            class Builder internal constructor() {

                private var content: JsonField<Content>? = null
                private var id: JsonField<String> = JsonMissing.of()
                private var additionalKwargs: JsonValue = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var responseMetadata: JsonValue = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(systemMessage: SystemMessage) = apply {
                    content = systemMessage.content
                    id = systemMessage.id
                    additionalKwargs = systemMessage.additionalKwargs
                    name = systemMessage.name
                    responseMetadata = systemMessage.responseMetadata
                    type = systemMessage.type
                    additionalProperties = systemMessage.additionalProperties.toMutableMap()
                }

                fun content(content: Content) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [Content] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<Content>) = apply { this.content = content }

                /** Alias for calling [content] with `Content.ofString(string)`. */
                fun content(string: String) = content(Content.ofString(string))

                /**
                 * Alias for calling [content] with
                 * `Content.ofUnnamedSchemaWithArrayParent3s(unnamedSchemaWithArrayParent3s)`.
                 */
                fun contentOfUnnamedSchemaWithArrayParent3s(
                    unnamedSchemaWithArrayParent3s: List<Content.UnnamedSchemaWithArrayParent3>
                ) =
                    content(
                        Content.ofUnnamedSchemaWithArrayParent3s(unnamedSchemaWithArrayParent3s)
                    )

                fun id(id: String?) = id(JsonField.ofNullable(id))

                /** Alias for calling [Builder.id] with `id.orElse(null)`. */
                fun id(id: Optional<String>) = id(id.getOrNull())

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalKwargs(additionalKwargs: JsonValue) = apply {
                    this.additionalKwargs = additionalKwargs
                }

                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun responseMetadata(responseMetadata: JsonValue) = apply {
                    this.responseMetadata = responseMetadata
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [SystemMessage].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SystemMessage =
                    SystemMessage(
                        checkRequired("content", content),
                        id,
                        additionalKwargs,
                        name,
                        responseMetadata,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): SystemMessage = apply {
                if (validated) {
                    return@apply
                }

                content().validate()
                id()
                name()
                type().ifPresent { it.validate() }
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
                (content.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (id.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val string: String? = null,
                private val unnamedSchemaWithArrayParent3s: List<UnnamedSchemaWithArrayParent3>? =
                    null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun unnamedSchemaWithArrayParent3s():
                    Optional<List<UnnamedSchemaWithArrayParent3>> =
                    Optional.ofNullable(unnamedSchemaWithArrayParent3s)

                fun isString(): Boolean = string != null

                fun isUnnamedSchemaWithArrayParent3s(): Boolean =
                    unnamedSchemaWithArrayParent3s != null

                fun asString(): String = string.getOrThrow("string")

                fun asUnnamedSchemaWithArrayParent3s(): List<UnnamedSchemaWithArrayParent3> =
                    unnamedSchemaWithArrayParent3s.getOrThrow("unnamedSchemaWithArrayParent3s")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        unnamedSchemaWithArrayParent3s != null ->
                            visitor.visitUnnamedSchemaWithArrayParent3s(
                                unnamedSchemaWithArrayParent3s
                            )
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Content = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitUnnamedSchemaWithArrayParent3s(
                                unnamedSchemaWithArrayParent3s: List<UnnamedSchemaWithArrayParent3>
                            ) {
                                unnamedSchemaWithArrayParent3s.forEach { it.validate() }
                            }
                        }
                    )
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
                    accept(
                        object : Visitor<Int> {
                            override fun visitString(string: String) = 1

                            override fun visitUnnamedSchemaWithArrayParent3s(
                                unnamedSchemaWithArrayParent3s: List<UnnamedSchemaWithArrayParent3>
                            ) = unnamedSchemaWithArrayParent3s.sumOf { it.validity().toInt() }

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Content &&
                        string == other.string &&
                        unnamedSchemaWithArrayParent3s == other.unnamedSchemaWithArrayParent3s
                }

                override fun hashCode(): Int = Objects.hash(string, unnamedSchemaWithArrayParent3s)

                override fun toString(): String =
                    when {
                        string != null -> "Content{string=$string}"
                        unnamedSchemaWithArrayParent3s != null ->
                            "Content{unnamedSchemaWithArrayParent3s=$unnamedSchemaWithArrayParent3s}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }

                companion object {

                    @JvmStatic fun ofString(string: String) = Content(string = string)

                    @JvmStatic
                    fun ofUnnamedSchemaWithArrayParent3s(
                        unnamedSchemaWithArrayParent3s: List<UnnamedSchemaWithArrayParent3>
                    ) =
                        Content(
                            unnamedSchemaWithArrayParent3s =
                                unnamedSchemaWithArrayParent3s.toImmutable()
                        )
                }

                /**
                 * An interface that defines how to map each variant of [Content] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitUnnamedSchemaWithArrayParent3s(
                        unnamedSchemaWithArrayParent3s: List<UnnamedSchemaWithArrayParent3>
                    ): T

                    /**
                     * Maps an unknown variant of [Content] to a value of type [T].
                     *
                     * An instance of [Content] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws LangsmithApiInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LangsmithApiInvalidDataException("Unknown Content: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Content {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Content(string = it, _json = json)
                                    },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<List<UnnamedSchemaWithArrayParent3>>(),
                                        )
                                        ?.let {
                                            Content(
                                                unnamedSchemaWithArrayParent3s = it,
                                                _json = json,
                                            )
                                        },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // object).
                            0 -> Content(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Content>(Content::class) {

                    override fun serialize(
                        value: Content,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.unnamedSchemaWithArrayParent3s != null ->
                                generator.writeObject(value.unnamedSchemaWithArrayParent3s)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }

                @JsonDeserialize(using = UnnamedSchemaWithArrayParent3.Deserializer::class)
                @JsonSerialize(using = UnnamedSchemaWithArrayParent3.Serializer::class)
                class UnnamedSchemaWithArrayParent3
                private constructor(
                    private val string: String? = null,
                    private val jsonValue: JsonValue? = null,
                    private val _json: JsonValue? = null,
                ) {

                    fun string(): Optional<String> = Optional.ofNullable(string)

                    fun jsonValue(): Optional<JsonValue> = Optional.ofNullable(jsonValue)

                    fun isString(): Boolean = string != null

                    fun isJsonValue(): Boolean = jsonValue != null

                    fun asString(): String = string.getOrThrow("string")

                    fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

                    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            string != null -> visitor.visitString(string)
                            jsonValue != null -> visitor.visitJsonValue(jsonValue)
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): UnnamedSchemaWithArrayParent3 = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitString(string: String) {}

                                override fun visitJsonValue(jsonValue: JsonValue) {}
                            }
                        )
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
                        accept(
                            object : Visitor<Int> {
                                override fun visitString(string: String) = 1

                                override fun visitJsonValue(jsonValue: JsonValue) = 1

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is UnnamedSchemaWithArrayParent3 &&
                            string == other.string &&
                            jsonValue == other.jsonValue
                    }

                    override fun hashCode(): Int = Objects.hash(string, jsonValue)

                    override fun toString(): String =
                        when {
                            string != null -> "UnnamedSchemaWithArrayParent3{string=$string}"
                            jsonValue != null ->
                                "UnnamedSchemaWithArrayParent3{jsonValue=$jsonValue}"
                            _json != null -> "UnnamedSchemaWithArrayParent3{_unknown=$_json}"
                            else ->
                                throw IllegalStateException("Invalid UnnamedSchemaWithArrayParent3")
                        }

                    companion object {

                        @JvmStatic
                        fun ofString(string: String) =
                            UnnamedSchemaWithArrayParent3(string = string)

                        @JvmStatic
                        fun ofJsonValue(jsonValue: JsonValue) =
                            UnnamedSchemaWithArrayParent3(jsonValue = jsonValue)
                    }

                    /**
                     * An interface that defines how to map each variant of
                     * [UnnamedSchemaWithArrayParent3] to a value of type [T].
                     */
                    interface Visitor<out T> {

                        fun visitString(string: String): T

                        fun visitJsonValue(jsonValue: JsonValue): T

                        /**
                         * Maps an unknown variant of [UnnamedSchemaWithArrayParent3] to a value of
                         * type [T].
                         *
                         * An instance of [UnnamedSchemaWithArrayParent3] can contain an unknown
                         * variant if it was deserialized from data that doesn't match any known
                         * variant. For example, if the SDK is on an older version than the API,
                         * then the API may respond with new variants that the SDK is unaware of.
                         *
                         * @throws LangsmithApiInvalidDataException in the default implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw LangsmithApiInvalidDataException(
                                "Unknown UnnamedSchemaWithArrayParent3: $json"
                            )
                        }
                    }

                    internal class Deserializer :
                        BaseDeserializer<UnnamedSchemaWithArrayParent3>(
                            UnnamedSchemaWithArrayParent3::class
                        ) {

                        override fun ObjectCodec.deserialize(
                            node: JsonNode
                        ): UnnamedSchemaWithArrayParent3 {
                            val json = JsonValue.fromJsonNode(node)

                            val bestMatches =
                                sequenceOf(
                                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                            UnnamedSchemaWithArrayParent3(string = it, _json = json)
                                        },
                                        tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                            UnnamedSchemaWithArrayParent3(
                                                jsonValue = it,
                                                _json = json,
                                            )
                                        },
                                    )
                                    .filterNotNull()
                                    .allMaxBy { it.validity() }
                                    .toList()
                            return when (bestMatches.size) {
                                // This can happen if what we're deserializing is completely
                                // incompatible with all the possible variants.
                                0 -> UnnamedSchemaWithArrayParent3(_json = json)
                                1 -> bestMatches.single()
                                // If there's more than one match with the highest validity, then
                                // use the first completely valid match, or simply the first match
                                // if none are completely valid.
                                else ->
                                    bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                            }
                        }
                    }

                    internal class Serializer :
                        BaseSerializer<UnnamedSchemaWithArrayParent3>(
                            UnnamedSchemaWithArrayParent3::class
                        ) {

                        override fun serialize(
                            value: UnnamedSchemaWithArrayParent3,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.string != null -> generator.writeObject(value.string)
                                value.jsonValue != null -> generator.writeObject(value.jsonValue)
                                value._json != null -> generator.writeObject(value._json)
                                else ->
                                    throw IllegalStateException(
                                        "Invalid UnnamedSchemaWithArrayParent3"
                                    )
                            }
                        }
                    }
                }
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val SYSTEM = of("system")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    SYSTEM
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SYSTEM,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        SYSTEM -> Value.SYSTEM
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        SYSTEM -> Known.SYSTEM
                        else -> throw LangsmithApiInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LangsmithApiInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Type = apply {
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
                    } catch (e: LangsmithApiInvalidDataException) {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SystemMessage &&
                    content == other.content &&
                    id == other.id &&
                    additionalKwargs == other.additionalKwargs &&
                    name == other.name &&
                    responseMetadata == other.responseMetadata &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    content,
                    id,
                    additionalKwargs,
                    name,
                    responseMetadata,
                    type,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SystemMessage{content=$content, id=$id, additionalKwargs=$additionalKwargs, name=$name, responseMetadata=$responseMetadata, type=$type, additionalProperties=$additionalProperties}"
        }

        /**
         * Message for passing the result of executing a tool back to a model.
         *
         * `FunctionMessage` are an older version of the `ToolMessage` schema, and do not contain
         * the `tool_call_id` field.
         *
         * The `tool_call_id` field is used to associate the tool call request with the tool call
         * response. Useful in situations where a chat model is able to request multiple tool calls
         * in parallel.
         */
        class FunctionMessage
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<Content>,
            private val name: JsonField<String>,
            private val id: JsonField<String>,
            private val additionalKwargs: JsonValue,
            private val responseMetadata: JsonValue,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<Content> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("additional_kwargs")
                @ExcludeMissing
                additionalKwargs: JsonValue = JsonMissing.of(),
                @JsonProperty("response_metadata")
                @ExcludeMissing
                responseMetadata: JsonValue = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(content, name, id, additionalKwargs, responseMetadata, type, mutableMapOf())

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): Content = content.getRequired("content")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            @JsonProperty("additional_kwargs")
            @ExcludeMissing
            fun _additionalKwargs(): JsonValue = additionalKwargs

            @JsonProperty("response_metadata")
            @ExcludeMissing
            fun _responseMetadata(): JsonValue = responseMetadata

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [FunctionMessage].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * .name()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [FunctionMessage]. */
            class Builder internal constructor() {

                private var content: JsonField<Content>? = null
                private var name: JsonField<String>? = null
                private var id: JsonField<String> = JsonMissing.of()
                private var additionalKwargs: JsonValue = JsonMissing.of()
                private var responseMetadata: JsonValue = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(functionMessage: FunctionMessage) = apply {
                    content = functionMessage.content
                    name = functionMessage.name
                    id = functionMessage.id
                    additionalKwargs = functionMessage.additionalKwargs
                    responseMetadata = functionMessage.responseMetadata
                    type = functionMessage.type
                    additionalProperties = functionMessage.additionalProperties.toMutableMap()
                }

                fun content(content: Content) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [Content] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<Content>) = apply { this.content = content }

                /** Alias for calling [content] with `Content.ofString(string)`. */
                fun content(string: String) = content(Content.ofString(string))

                /**
                 * Alias for calling [content] with
                 * `Content.ofUnnamedSchemaWithArrayParent4s(unnamedSchemaWithArrayParent4s)`.
                 */
                fun contentOfUnnamedSchemaWithArrayParent4s(
                    unnamedSchemaWithArrayParent4s: List<Content.UnnamedSchemaWithArrayParent4>
                ) =
                    content(
                        Content.ofUnnamedSchemaWithArrayParent4s(unnamedSchemaWithArrayParent4s)
                    )

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun id(id: String?) = id(JsonField.ofNullable(id))

                /** Alias for calling [Builder.id] with `id.orElse(null)`. */
                fun id(id: Optional<String>) = id(id.getOrNull())

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalKwargs(additionalKwargs: JsonValue) = apply {
                    this.additionalKwargs = additionalKwargs
                }

                fun responseMetadata(responseMetadata: JsonValue) = apply {
                    this.responseMetadata = responseMetadata
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [FunctionMessage].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): FunctionMessage =
                    FunctionMessage(
                        checkRequired("content", content),
                        checkRequired("name", name),
                        id,
                        additionalKwargs,
                        responseMetadata,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): FunctionMessage = apply {
                if (validated) {
                    return@apply
                }

                content().validate()
                name()
                id()
                type().ifPresent { it.validate() }
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
                (content.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (id.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val string: String? = null,
                private val unnamedSchemaWithArrayParent4s: List<UnnamedSchemaWithArrayParent4>? =
                    null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun unnamedSchemaWithArrayParent4s():
                    Optional<List<UnnamedSchemaWithArrayParent4>> =
                    Optional.ofNullable(unnamedSchemaWithArrayParent4s)

                fun isString(): Boolean = string != null

                fun isUnnamedSchemaWithArrayParent4s(): Boolean =
                    unnamedSchemaWithArrayParent4s != null

                fun asString(): String = string.getOrThrow("string")

                fun asUnnamedSchemaWithArrayParent4s(): List<UnnamedSchemaWithArrayParent4> =
                    unnamedSchemaWithArrayParent4s.getOrThrow("unnamedSchemaWithArrayParent4s")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        unnamedSchemaWithArrayParent4s != null ->
                            visitor.visitUnnamedSchemaWithArrayParent4s(
                                unnamedSchemaWithArrayParent4s
                            )
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Content = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitUnnamedSchemaWithArrayParent4s(
                                unnamedSchemaWithArrayParent4s: List<UnnamedSchemaWithArrayParent4>
                            ) {
                                unnamedSchemaWithArrayParent4s.forEach { it.validate() }
                            }
                        }
                    )
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
                    accept(
                        object : Visitor<Int> {
                            override fun visitString(string: String) = 1

                            override fun visitUnnamedSchemaWithArrayParent4s(
                                unnamedSchemaWithArrayParent4s: List<UnnamedSchemaWithArrayParent4>
                            ) = unnamedSchemaWithArrayParent4s.sumOf { it.validity().toInt() }

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Content &&
                        string == other.string &&
                        unnamedSchemaWithArrayParent4s == other.unnamedSchemaWithArrayParent4s
                }

                override fun hashCode(): Int = Objects.hash(string, unnamedSchemaWithArrayParent4s)

                override fun toString(): String =
                    when {
                        string != null -> "Content{string=$string}"
                        unnamedSchemaWithArrayParent4s != null ->
                            "Content{unnamedSchemaWithArrayParent4s=$unnamedSchemaWithArrayParent4s}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }

                companion object {

                    @JvmStatic fun ofString(string: String) = Content(string = string)

                    @JvmStatic
                    fun ofUnnamedSchemaWithArrayParent4s(
                        unnamedSchemaWithArrayParent4s: List<UnnamedSchemaWithArrayParent4>
                    ) =
                        Content(
                            unnamedSchemaWithArrayParent4s =
                                unnamedSchemaWithArrayParent4s.toImmutable()
                        )
                }

                /**
                 * An interface that defines how to map each variant of [Content] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitUnnamedSchemaWithArrayParent4s(
                        unnamedSchemaWithArrayParent4s: List<UnnamedSchemaWithArrayParent4>
                    ): T

                    /**
                     * Maps an unknown variant of [Content] to a value of type [T].
                     *
                     * An instance of [Content] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws LangsmithApiInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LangsmithApiInvalidDataException("Unknown Content: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Content {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Content(string = it, _json = json)
                                    },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<List<UnnamedSchemaWithArrayParent4>>(),
                                        )
                                        ?.let {
                                            Content(
                                                unnamedSchemaWithArrayParent4s = it,
                                                _json = json,
                                            )
                                        },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // object).
                            0 -> Content(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Content>(Content::class) {

                    override fun serialize(
                        value: Content,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.unnamedSchemaWithArrayParent4s != null ->
                                generator.writeObject(value.unnamedSchemaWithArrayParent4s)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }

                @JsonDeserialize(using = UnnamedSchemaWithArrayParent4.Deserializer::class)
                @JsonSerialize(using = UnnamedSchemaWithArrayParent4.Serializer::class)
                class UnnamedSchemaWithArrayParent4
                private constructor(
                    private val string: String? = null,
                    private val jsonValue: JsonValue? = null,
                    private val _json: JsonValue? = null,
                ) {

                    fun string(): Optional<String> = Optional.ofNullable(string)

                    fun jsonValue(): Optional<JsonValue> = Optional.ofNullable(jsonValue)

                    fun isString(): Boolean = string != null

                    fun isJsonValue(): Boolean = jsonValue != null

                    fun asString(): String = string.getOrThrow("string")

                    fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

                    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            string != null -> visitor.visitString(string)
                            jsonValue != null -> visitor.visitJsonValue(jsonValue)
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): UnnamedSchemaWithArrayParent4 = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitString(string: String) {}

                                override fun visitJsonValue(jsonValue: JsonValue) {}
                            }
                        )
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
                        accept(
                            object : Visitor<Int> {
                                override fun visitString(string: String) = 1

                                override fun visitJsonValue(jsonValue: JsonValue) = 1

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is UnnamedSchemaWithArrayParent4 &&
                            string == other.string &&
                            jsonValue == other.jsonValue
                    }

                    override fun hashCode(): Int = Objects.hash(string, jsonValue)

                    override fun toString(): String =
                        when {
                            string != null -> "UnnamedSchemaWithArrayParent4{string=$string}"
                            jsonValue != null ->
                                "UnnamedSchemaWithArrayParent4{jsonValue=$jsonValue}"
                            _json != null -> "UnnamedSchemaWithArrayParent4{_unknown=$_json}"
                            else ->
                                throw IllegalStateException("Invalid UnnamedSchemaWithArrayParent4")
                        }

                    companion object {

                        @JvmStatic
                        fun ofString(string: String) =
                            UnnamedSchemaWithArrayParent4(string = string)

                        @JvmStatic
                        fun ofJsonValue(jsonValue: JsonValue) =
                            UnnamedSchemaWithArrayParent4(jsonValue = jsonValue)
                    }

                    /**
                     * An interface that defines how to map each variant of
                     * [UnnamedSchemaWithArrayParent4] to a value of type [T].
                     */
                    interface Visitor<out T> {

                        fun visitString(string: String): T

                        fun visitJsonValue(jsonValue: JsonValue): T

                        /**
                         * Maps an unknown variant of [UnnamedSchemaWithArrayParent4] to a value of
                         * type [T].
                         *
                         * An instance of [UnnamedSchemaWithArrayParent4] can contain an unknown
                         * variant if it was deserialized from data that doesn't match any known
                         * variant. For example, if the SDK is on an older version than the API,
                         * then the API may respond with new variants that the SDK is unaware of.
                         *
                         * @throws LangsmithApiInvalidDataException in the default implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw LangsmithApiInvalidDataException(
                                "Unknown UnnamedSchemaWithArrayParent4: $json"
                            )
                        }
                    }

                    internal class Deserializer :
                        BaseDeserializer<UnnamedSchemaWithArrayParent4>(
                            UnnamedSchemaWithArrayParent4::class
                        ) {

                        override fun ObjectCodec.deserialize(
                            node: JsonNode
                        ): UnnamedSchemaWithArrayParent4 {
                            val json = JsonValue.fromJsonNode(node)

                            val bestMatches =
                                sequenceOf(
                                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                            UnnamedSchemaWithArrayParent4(string = it, _json = json)
                                        },
                                        tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                            UnnamedSchemaWithArrayParent4(
                                                jsonValue = it,
                                                _json = json,
                                            )
                                        },
                                    )
                                    .filterNotNull()
                                    .allMaxBy { it.validity() }
                                    .toList()
                            return when (bestMatches.size) {
                                // This can happen if what we're deserializing is completely
                                // incompatible with all the possible variants.
                                0 -> UnnamedSchemaWithArrayParent4(_json = json)
                                1 -> bestMatches.single()
                                // If there's more than one match with the highest validity, then
                                // use the first completely valid match, or simply the first match
                                // if none are completely valid.
                                else ->
                                    bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                            }
                        }
                    }

                    internal class Serializer :
                        BaseSerializer<UnnamedSchemaWithArrayParent4>(
                            UnnamedSchemaWithArrayParent4::class
                        ) {

                        override fun serialize(
                            value: UnnamedSchemaWithArrayParent4,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.string != null -> generator.writeObject(value.string)
                                value.jsonValue != null -> generator.writeObject(value.jsonValue)
                                value._json != null -> generator.writeObject(value._json)
                                else ->
                                    throw IllegalStateException(
                                        "Invalid UnnamedSchemaWithArrayParent4"
                                    )
                            }
                        }
                    }
                }
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val FUNCTION = of("function")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    FUNCTION
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FUNCTION,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        FUNCTION -> Value.FUNCTION
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        FUNCTION -> Known.FUNCTION
                        else -> throw LangsmithApiInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LangsmithApiInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Type = apply {
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
                    } catch (e: LangsmithApiInvalidDataException) {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FunctionMessage &&
                    content == other.content &&
                    name == other.name &&
                    id == other.id &&
                    additionalKwargs == other.additionalKwargs &&
                    responseMetadata == other.responseMetadata &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    content,
                    name,
                    id,
                    additionalKwargs,
                    responseMetadata,
                    type,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FunctionMessage{content=$content, name=$name, id=$id, additionalKwargs=$additionalKwargs, responseMetadata=$responseMetadata, type=$type, additionalProperties=$additionalProperties}"
        }

        /**
         * Message for passing the result of executing a tool back to a model.
         *
         * `ToolMessage` objects contain the result of a tool invocation. Typically, the result is
         * encoded inside the `content` field.
         *
         * Example: A `ToolMessage` representing a result of `42` from a tool call with id
         *
         * ```python
         * from langchain_core.messages import ToolMessage
         *
         * ToolMessage(content="42", tool_call_id="call_Jja7J89XsjrOLA5r!MEOW!SL")
         * ```
         *
         * Example: A `ToolMessage` where only part of the tool output is sent to the model and the
         * full output is passed in to artifact.
         *
         * ```python
         * from langchain_core.messages import ToolMessage
         *
         * tool_output = {
         *     "stdout": "From the graph we can see that the correlation between "
         *     "x and y is ...",
         *     "stderr": None,
         *     "artifacts": {"type": "image", "base64_data": "/9j/4gIcSU..."},
         * }
         *
         * ToolMessage(
         *     content=tool_output["stdout"],
         *     artifact=tool_output,
         *     tool_call_id="call_Jja7J89XsjrOLA5r!MEOW!SL",
         * )
         * ```
         *
         * The `tool_call_id` field is used to associate the tool call request with the tool call
         * response. Useful in situations where a chat model is able to request multiple tool calls
         * in parallel.
         */
        class ToolMessage
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<Content>,
            private val toolCallId: JsonField<String>,
            private val id: JsonField<String>,
            private val additionalKwargs: JsonValue,
            private val artifact: JsonValue,
            private val name: JsonField<String>,
            private val responseMetadata: JsonValue,
            private val status: JsonField<Status>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<Content> = JsonMissing.of(),
                @JsonProperty("tool_call_id")
                @ExcludeMissing
                toolCallId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("additional_kwargs")
                @ExcludeMissing
                additionalKwargs: JsonValue = JsonMissing.of(),
                @JsonProperty("artifact") @ExcludeMissing artifact: JsonValue = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("response_metadata")
                @ExcludeMissing
                responseMetadata: JsonValue = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(
                content,
                toolCallId,
                id,
                additionalKwargs,
                artifact,
                name,
                responseMetadata,
                status,
                type,
                mutableMapOf(),
            )

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): Content = content.getRequired("content")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun toolCallId(): String = toolCallId.getRequired("tool_call_id")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            @JsonProperty("additional_kwargs")
            @ExcludeMissing
            fun _additionalKwargs(): JsonValue = additionalKwargs

            @JsonProperty("artifact") @ExcludeMissing fun _artifact(): JsonValue = artifact

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            @JsonProperty("response_metadata")
            @ExcludeMissing
            fun _responseMetadata(): JsonValue = responseMetadata

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun status(): Optional<Status> = status.getOptional("status")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

            /**
             * Returns the raw JSON value of [toolCallId].
             *
             * Unlike [toolCallId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tool_call_id")
            @ExcludeMissing
            fun _toolCallId(): JsonField<String> = toolCallId

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [ToolMessage].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * .toolCallId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ToolMessage]. */
            class Builder internal constructor() {

                private var content: JsonField<Content>? = null
                private var toolCallId: JsonField<String>? = null
                private var id: JsonField<String> = JsonMissing.of()
                private var additionalKwargs: JsonValue = JsonMissing.of()
                private var artifact: JsonValue = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var responseMetadata: JsonValue = JsonMissing.of()
                private var status: JsonField<Status> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(toolMessage: ToolMessage) = apply {
                    content = toolMessage.content
                    toolCallId = toolMessage.toolCallId
                    id = toolMessage.id
                    additionalKwargs = toolMessage.additionalKwargs
                    artifact = toolMessage.artifact
                    name = toolMessage.name
                    responseMetadata = toolMessage.responseMetadata
                    status = toolMessage.status
                    type = toolMessage.type
                    additionalProperties = toolMessage.additionalProperties.toMutableMap()
                }

                fun content(content: Content) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [Content] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<Content>) = apply { this.content = content }

                /** Alias for calling [content] with `Content.ofString(string)`. */
                fun content(string: String) = content(Content.ofString(string))

                /**
                 * Alias for calling [content] with
                 * `Content.ofUnnamedSchemaWithArrayParent5s(unnamedSchemaWithArrayParent5s)`.
                 */
                fun contentOfUnnamedSchemaWithArrayParent5s(
                    unnamedSchemaWithArrayParent5s: List<Content.UnnamedSchemaWithArrayParent5>
                ) =
                    content(
                        Content.ofUnnamedSchemaWithArrayParent5s(unnamedSchemaWithArrayParent5s)
                    )

                fun toolCallId(toolCallId: String) = toolCallId(JsonField.of(toolCallId))

                /**
                 * Sets [Builder.toolCallId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.toolCallId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun toolCallId(toolCallId: JsonField<String>) = apply {
                    this.toolCallId = toolCallId
                }

                fun id(id: String?) = id(JsonField.ofNullable(id))

                /** Alias for calling [Builder.id] with `id.orElse(null)`. */
                fun id(id: Optional<String>) = id(id.getOrNull())

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalKwargs(additionalKwargs: JsonValue) = apply {
                    this.additionalKwargs = additionalKwargs
                }

                fun artifact(artifact: JsonValue) = apply { this.artifact = artifact }

                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun responseMetadata(responseMetadata: JsonValue) = apply {
                    this.responseMetadata = responseMetadata
                }

                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ToolMessage].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * .toolCallId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ToolMessage =
                    ToolMessage(
                        checkRequired("content", content),
                        checkRequired("toolCallId", toolCallId),
                        id,
                        additionalKwargs,
                        artifact,
                        name,
                        responseMetadata,
                        status,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ToolMessage = apply {
                if (validated) {
                    return@apply
                }

                content().validate()
                toolCallId()
                id()
                name()
                status().ifPresent { it.validate() }
                type().ifPresent { it.validate() }
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
                (content.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (toolCallId.asKnown().isPresent) 1 else 0) +
                    (if (id.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (status.asKnown().getOrNull()?.validity() ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val string: String? = null,
                private val unnamedSchemaWithArrayParent5s: List<UnnamedSchemaWithArrayParent5>? =
                    null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun unnamedSchemaWithArrayParent5s():
                    Optional<List<UnnamedSchemaWithArrayParent5>> =
                    Optional.ofNullable(unnamedSchemaWithArrayParent5s)

                fun isString(): Boolean = string != null

                fun isUnnamedSchemaWithArrayParent5s(): Boolean =
                    unnamedSchemaWithArrayParent5s != null

                fun asString(): String = string.getOrThrow("string")

                fun asUnnamedSchemaWithArrayParent5s(): List<UnnamedSchemaWithArrayParent5> =
                    unnamedSchemaWithArrayParent5s.getOrThrow("unnamedSchemaWithArrayParent5s")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        unnamedSchemaWithArrayParent5s != null ->
                            visitor.visitUnnamedSchemaWithArrayParent5s(
                                unnamedSchemaWithArrayParent5s
                            )
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Content = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitUnnamedSchemaWithArrayParent5s(
                                unnamedSchemaWithArrayParent5s: List<UnnamedSchemaWithArrayParent5>
                            ) {
                                unnamedSchemaWithArrayParent5s.forEach { it.validate() }
                            }
                        }
                    )
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
                    accept(
                        object : Visitor<Int> {
                            override fun visitString(string: String) = 1

                            override fun visitUnnamedSchemaWithArrayParent5s(
                                unnamedSchemaWithArrayParent5s: List<UnnamedSchemaWithArrayParent5>
                            ) = unnamedSchemaWithArrayParent5s.sumOf { it.validity().toInt() }

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Content &&
                        string == other.string &&
                        unnamedSchemaWithArrayParent5s == other.unnamedSchemaWithArrayParent5s
                }

                override fun hashCode(): Int = Objects.hash(string, unnamedSchemaWithArrayParent5s)

                override fun toString(): String =
                    when {
                        string != null -> "Content{string=$string}"
                        unnamedSchemaWithArrayParent5s != null ->
                            "Content{unnamedSchemaWithArrayParent5s=$unnamedSchemaWithArrayParent5s}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }

                companion object {

                    @JvmStatic fun ofString(string: String) = Content(string = string)

                    @JvmStatic
                    fun ofUnnamedSchemaWithArrayParent5s(
                        unnamedSchemaWithArrayParent5s: List<UnnamedSchemaWithArrayParent5>
                    ) =
                        Content(
                            unnamedSchemaWithArrayParent5s =
                                unnamedSchemaWithArrayParent5s.toImmutable()
                        )
                }

                /**
                 * An interface that defines how to map each variant of [Content] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitUnnamedSchemaWithArrayParent5s(
                        unnamedSchemaWithArrayParent5s: List<UnnamedSchemaWithArrayParent5>
                    ): T

                    /**
                     * Maps an unknown variant of [Content] to a value of type [T].
                     *
                     * An instance of [Content] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws LangsmithApiInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LangsmithApiInvalidDataException("Unknown Content: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Content {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Content(string = it, _json = json)
                                    },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<List<UnnamedSchemaWithArrayParent5>>(),
                                        )
                                        ?.let {
                                            Content(
                                                unnamedSchemaWithArrayParent5s = it,
                                                _json = json,
                                            )
                                        },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // object).
                            0 -> Content(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Content>(Content::class) {

                    override fun serialize(
                        value: Content,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.unnamedSchemaWithArrayParent5s != null ->
                                generator.writeObject(value.unnamedSchemaWithArrayParent5s)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }

                @JsonDeserialize(using = UnnamedSchemaWithArrayParent5.Deserializer::class)
                @JsonSerialize(using = UnnamedSchemaWithArrayParent5.Serializer::class)
                class UnnamedSchemaWithArrayParent5
                private constructor(
                    private val string: String? = null,
                    private val jsonValue: JsonValue? = null,
                    private val _json: JsonValue? = null,
                ) {

                    fun string(): Optional<String> = Optional.ofNullable(string)

                    fun jsonValue(): Optional<JsonValue> = Optional.ofNullable(jsonValue)

                    fun isString(): Boolean = string != null

                    fun isJsonValue(): Boolean = jsonValue != null

                    fun asString(): String = string.getOrThrow("string")

                    fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

                    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            string != null -> visitor.visitString(string)
                            jsonValue != null -> visitor.visitJsonValue(jsonValue)
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): UnnamedSchemaWithArrayParent5 = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitString(string: String) {}

                                override fun visitJsonValue(jsonValue: JsonValue) {}
                            }
                        )
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
                        accept(
                            object : Visitor<Int> {
                                override fun visitString(string: String) = 1

                                override fun visitJsonValue(jsonValue: JsonValue) = 1

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is UnnamedSchemaWithArrayParent5 &&
                            string == other.string &&
                            jsonValue == other.jsonValue
                    }

                    override fun hashCode(): Int = Objects.hash(string, jsonValue)

                    override fun toString(): String =
                        when {
                            string != null -> "UnnamedSchemaWithArrayParent5{string=$string}"
                            jsonValue != null ->
                                "UnnamedSchemaWithArrayParent5{jsonValue=$jsonValue}"
                            _json != null -> "UnnamedSchemaWithArrayParent5{_unknown=$_json}"
                            else ->
                                throw IllegalStateException("Invalid UnnamedSchemaWithArrayParent5")
                        }

                    companion object {

                        @JvmStatic
                        fun ofString(string: String) =
                            UnnamedSchemaWithArrayParent5(string = string)

                        @JvmStatic
                        fun ofJsonValue(jsonValue: JsonValue) =
                            UnnamedSchemaWithArrayParent5(jsonValue = jsonValue)
                    }

                    /**
                     * An interface that defines how to map each variant of
                     * [UnnamedSchemaWithArrayParent5] to a value of type [T].
                     */
                    interface Visitor<out T> {

                        fun visitString(string: String): T

                        fun visitJsonValue(jsonValue: JsonValue): T

                        /**
                         * Maps an unknown variant of [UnnamedSchemaWithArrayParent5] to a value of
                         * type [T].
                         *
                         * An instance of [UnnamedSchemaWithArrayParent5] can contain an unknown
                         * variant if it was deserialized from data that doesn't match any known
                         * variant. For example, if the SDK is on an older version than the API,
                         * then the API may respond with new variants that the SDK is unaware of.
                         *
                         * @throws LangsmithApiInvalidDataException in the default implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw LangsmithApiInvalidDataException(
                                "Unknown UnnamedSchemaWithArrayParent5: $json"
                            )
                        }
                    }

                    internal class Deserializer :
                        BaseDeserializer<UnnamedSchemaWithArrayParent5>(
                            UnnamedSchemaWithArrayParent5::class
                        ) {

                        override fun ObjectCodec.deserialize(
                            node: JsonNode
                        ): UnnamedSchemaWithArrayParent5 {
                            val json = JsonValue.fromJsonNode(node)

                            val bestMatches =
                                sequenceOf(
                                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                            UnnamedSchemaWithArrayParent5(string = it, _json = json)
                                        },
                                        tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                            UnnamedSchemaWithArrayParent5(
                                                jsonValue = it,
                                                _json = json,
                                            )
                                        },
                                    )
                                    .filterNotNull()
                                    .allMaxBy { it.validity() }
                                    .toList()
                            return when (bestMatches.size) {
                                // This can happen if what we're deserializing is completely
                                // incompatible with all the possible variants.
                                0 -> UnnamedSchemaWithArrayParent5(_json = json)
                                1 -> bestMatches.single()
                                // If there's more than one match with the highest validity, then
                                // use the first completely valid match, or simply the first match
                                // if none are completely valid.
                                else ->
                                    bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                            }
                        }
                    }

                    internal class Serializer :
                        BaseSerializer<UnnamedSchemaWithArrayParent5>(
                            UnnamedSchemaWithArrayParent5::class
                        ) {

                        override fun serialize(
                            value: UnnamedSchemaWithArrayParent5,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.string != null -> generator.writeObject(value.string)
                                value.jsonValue != null -> generator.writeObject(value.jsonValue)
                                value._json != null -> generator.writeObject(value._json)
                                else ->
                                    throw IllegalStateException(
                                        "Invalid UnnamedSchemaWithArrayParent5"
                                    )
                            }
                        }
                    }
                }
            }

            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val SUCCESS = of("success")

                    @JvmField val ERROR = of("error")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    SUCCESS,
                    ERROR,
                }

                /**
                 * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Status] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SUCCESS,
                    ERROR,
                    /**
                     * An enum member indicating that [Status] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        SUCCESS -> Value.SUCCESS
                        ERROR -> Value.ERROR
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        SUCCESS -> Known.SUCCESS
                        ERROR -> Known.ERROR
                        else -> throw LangsmithApiInvalidDataException("Unknown Status: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LangsmithApiInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

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
                    } catch (e: LangsmithApiInvalidDataException) {
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

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val TOOL = of("tool")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    TOOL
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TOOL,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        TOOL -> Value.TOOL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        TOOL -> Known.TOOL
                        else -> throw LangsmithApiInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LangsmithApiInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Type = apply {
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
                    } catch (e: LangsmithApiInvalidDataException) {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ToolMessage &&
                    content == other.content &&
                    toolCallId == other.toolCallId &&
                    id == other.id &&
                    additionalKwargs == other.additionalKwargs &&
                    artifact == other.artifact &&
                    name == other.name &&
                    responseMetadata == other.responseMetadata &&
                    status == other.status &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    content,
                    toolCallId,
                    id,
                    additionalKwargs,
                    artifact,
                    name,
                    responseMetadata,
                    status,
                    type,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ToolMessage{content=$content, toolCallId=$toolCallId, id=$id, additionalKwargs=$additionalKwargs, artifact=$artifact, name=$name, responseMetadata=$responseMetadata, status=$status, type=$type, additionalProperties=$additionalProperties}"
        }

        /** Message chunk from an AI (yielded when streaming). */
        class AiMessageChunk
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<Content>,
            private val id: JsonField<String>,
            private val additionalKwargs: JsonValue,
            private val chunkPosition: JsonField<ChunkPosition>,
            private val invalidToolCalls: JsonField<List<InvalidToolCall>>,
            private val name: JsonField<String>,
            private val responseMetadata: JsonValue,
            private val toolCallChunks: JsonField<List<ToolCallChunk>>,
            private val toolCalls: JsonField<List<ToolCall>>,
            private val type: JsonField<Type>,
            private val usageMetadata: JsonField<UsageMetadata>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<Content> = JsonMissing.of(),
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("additional_kwargs")
                @ExcludeMissing
                additionalKwargs: JsonValue = JsonMissing.of(),
                @JsonProperty("chunk_position")
                @ExcludeMissing
                chunkPosition: JsonField<ChunkPosition> = JsonMissing.of(),
                @JsonProperty("invalid_tool_calls")
                @ExcludeMissing
                invalidToolCalls: JsonField<List<InvalidToolCall>> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("response_metadata")
                @ExcludeMissing
                responseMetadata: JsonValue = JsonMissing.of(),
                @JsonProperty("tool_call_chunks")
                @ExcludeMissing
                toolCallChunks: JsonField<List<ToolCallChunk>> = JsonMissing.of(),
                @JsonProperty("tool_calls")
                @ExcludeMissing
                toolCalls: JsonField<List<ToolCall>> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("usage_metadata")
                @ExcludeMissing
                usageMetadata: JsonField<UsageMetadata> = JsonMissing.of(),
            ) : this(
                content,
                id,
                additionalKwargs,
                chunkPosition,
                invalidToolCalls,
                name,
                responseMetadata,
                toolCallChunks,
                toolCalls,
                type,
                usageMetadata,
                mutableMapOf(),
            )

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): Content = content.getRequired("content")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            @JsonProperty("additional_kwargs")
            @ExcludeMissing
            fun _additionalKwargs(): JsonValue = additionalKwargs

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun chunkPosition(): Optional<ChunkPosition> =
                chunkPosition.getOptional("chunk_position")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun invalidToolCalls(): Optional<List<InvalidToolCall>> =
                invalidToolCalls.getOptional("invalid_tool_calls")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            @JsonProperty("response_metadata")
            @ExcludeMissing
            fun _responseMetadata(): JsonValue = responseMetadata

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun toolCallChunks(): Optional<List<ToolCallChunk>> =
                toolCallChunks.getOptional("tool_call_chunks")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun toolCalls(): Optional<List<ToolCall>> = toolCalls.getOptional("tool_calls")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Usage metadata for a message, such as token counts.
             *
             * This is a standard representation of token usage that is consistent across models.
             *
             * Example:
             *
             *     ```python
             *     {
             *         "input_tokens": 350,
             *         "output_tokens": 240,
             *         "total_tokens": 590,
             *         "input_token_details": {
             *             "audio": 10,
             *             "cache_creation": 200,
             *             "cache_read": 100,
             *         },
             *         "output_token_details": {
             *             "audio": 10,
             *             "reasoning": 200,
             *         },
             *     }
             *     ```
             *
             * !!! warning "Behavior changed in 0.3.9" Added `input_token_details` and
             * `output_token_details`.
             *
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun usageMetadata(): Optional<UsageMetadata> =
                usageMetadata.getOptional("usage_metadata")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [chunkPosition].
             *
             * Unlike [chunkPosition], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("chunk_position")
            @ExcludeMissing
            fun _chunkPosition(): JsonField<ChunkPosition> = chunkPosition

            /**
             * Returns the raw JSON value of [invalidToolCalls].
             *
             * Unlike [invalidToolCalls], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("invalid_tool_calls")
            @ExcludeMissing
            fun _invalidToolCalls(): JsonField<List<InvalidToolCall>> = invalidToolCalls

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [toolCallChunks].
             *
             * Unlike [toolCallChunks], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("tool_call_chunks")
            @ExcludeMissing
            fun _toolCallChunks(): JsonField<List<ToolCallChunk>> = toolCallChunks

            /**
             * Returns the raw JSON value of [toolCalls].
             *
             * Unlike [toolCalls], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tool_calls")
            @ExcludeMissing
            fun _toolCalls(): JsonField<List<ToolCall>> = toolCalls

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [usageMetadata].
             *
             * Unlike [usageMetadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("usage_metadata")
            @ExcludeMissing
            fun _usageMetadata(): JsonField<UsageMetadata> = usageMetadata

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
                 * Returns a mutable builder for constructing an instance of [AiMessageChunk].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AiMessageChunk]. */
            class Builder internal constructor() {

                private var content: JsonField<Content>? = null
                private var id: JsonField<String> = JsonMissing.of()
                private var additionalKwargs: JsonValue = JsonMissing.of()
                private var chunkPosition: JsonField<ChunkPosition> = JsonMissing.of()
                private var invalidToolCalls: JsonField<MutableList<InvalidToolCall>>? = null
                private var name: JsonField<String> = JsonMissing.of()
                private var responseMetadata: JsonValue = JsonMissing.of()
                private var toolCallChunks: JsonField<MutableList<ToolCallChunk>>? = null
                private var toolCalls: JsonField<MutableList<ToolCall>>? = null
                private var type: JsonField<Type> = JsonMissing.of()
                private var usageMetadata: JsonField<UsageMetadata> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(aiMessageChunk: AiMessageChunk) = apply {
                    content = aiMessageChunk.content
                    id = aiMessageChunk.id
                    additionalKwargs = aiMessageChunk.additionalKwargs
                    chunkPosition = aiMessageChunk.chunkPosition
                    invalidToolCalls = aiMessageChunk.invalidToolCalls.map { it.toMutableList() }
                    name = aiMessageChunk.name
                    responseMetadata = aiMessageChunk.responseMetadata
                    toolCallChunks = aiMessageChunk.toolCallChunks.map { it.toMutableList() }
                    toolCalls = aiMessageChunk.toolCalls.map { it.toMutableList() }
                    type = aiMessageChunk.type
                    usageMetadata = aiMessageChunk.usageMetadata
                    additionalProperties = aiMessageChunk.additionalProperties.toMutableMap()
                }

                fun content(content: Content) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [Content] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<Content>) = apply { this.content = content }

                /** Alias for calling [content] with `Content.ofString(string)`. */
                fun content(string: String) = content(Content.ofString(string))

                /**
                 * Alias for calling [content] with
                 * `Content.ofUnnamedSchemaWithArrayParent6s(unnamedSchemaWithArrayParent6s)`.
                 */
                fun contentOfUnnamedSchemaWithArrayParent6s(
                    unnamedSchemaWithArrayParent6s: List<Content.UnnamedSchemaWithArrayParent6>
                ) =
                    content(
                        Content.ofUnnamedSchemaWithArrayParent6s(unnamedSchemaWithArrayParent6s)
                    )

                fun id(id: String?) = id(JsonField.ofNullable(id))

                /** Alias for calling [Builder.id] with `id.orElse(null)`. */
                fun id(id: Optional<String>) = id(id.getOrNull())

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalKwargs(additionalKwargs: JsonValue) = apply {
                    this.additionalKwargs = additionalKwargs
                }

                fun chunkPosition(chunkPosition: ChunkPosition?) =
                    chunkPosition(JsonField.ofNullable(chunkPosition))

                /** Alias for calling [Builder.chunkPosition] with `chunkPosition.orElse(null)`. */
                fun chunkPosition(chunkPosition: Optional<ChunkPosition>) =
                    chunkPosition(chunkPosition.getOrNull())

                /**
                 * Sets [Builder.chunkPosition] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chunkPosition] with a well-typed [ChunkPosition]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun chunkPosition(chunkPosition: JsonField<ChunkPosition>) = apply {
                    this.chunkPosition = chunkPosition
                }

                fun invalidToolCalls(invalidToolCalls: List<InvalidToolCall>) =
                    invalidToolCalls(JsonField.of(invalidToolCalls))

                /**
                 * Sets [Builder.invalidToolCalls] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invalidToolCalls] with a well-typed
                 * `List<InvalidToolCall>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun invalidToolCalls(invalidToolCalls: JsonField<List<InvalidToolCall>>) = apply {
                    this.invalidToolCalls = invalidToolCalls.map { it.toMutableList() }
                }

                /**
                 * Adds a single [InvalidToolCall] to [invalidToolCalls].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addInvalidToolCall(invalidToolCall: InvalidToolCall) = apply {
                    invalidToolCalls =
                        (invalidToolCalls ?: JsonField.of(mutableListOf())).also {
                            checkKnown("invalidToolCalls", it).add(invalidToolCall)
                        }
                }

                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun responseMetadata(responseMetadata: JsonValue) = apply {
                    this.responseMetadata = responseMetadata
                }

                fun toolCallChunks(toolCallChunks: List<ToolCallChunk>) =
                    toolCallChunks(JsonField.of(toolCallChunks))

                /**
                 * Sets [Builder.toolCallChunks] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.toolCallChunks] with a well-typed
                 * `List<ToolCallChunk>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun toolCallChunks(toolCallChunks: JsonField<List<ToolCallChunk>>) = apply {
                    this.toolCallChunks = toolCallChunks.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ToolCallChunk] to [toolCallChunks].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addToolCallChunk(toolCallChunk: ToolCallChunk) = apply {
                    toolCallChunks =
                        (toolCallChunks ?: JsonField.of(mutableListOf())).also {
                            checkKnown("toolCallChunks", it).add(toolCallChunk)
                        }
                }

                fun toolCalls(toolCalls: List<ToolCall>) = toolCalls(JsonField.of(toolCalls))

                /**
                 * Sets [Builder.toolCalls] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.toolCalls] with a well-typed `List<ToolCall>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun toolCalls(toolCalls: JsonField<List<ToolCall>>) = apply {
                    this.toolCalls = toolCalls.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ToolCall] to [toolCalls].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addToolCall(toolCall: ToolCall) = apply {
                    toolCalls =
                        (toolCalls ?: JsonField.of(mutableListOf())).also {
                            checkKnown("toolCalls", it).add(toolCall)
                        }
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /**
                 * Usage metadata for a message, such as token counts.
                 *
                 * This is a standard representation of token usage that is consistent across
                 * models.
                 *
                 * Example:
                 *
                 *     ```python
                 *     {
                 *         "input_tokens": 350,
                 *         "output_tokens": 240,
                 *         "total_tokens": 590,
                 *         "input_token_details": {
                 *             "audio": 10,
                 *             "cache_creation": 200,
                 *             "cache_read": 100,
                 *         },
                 *         "output_token_details": {
                 *             "audio": 10,
                 *             "reasoning": 200,
                 *         },
                 *     }
                 *     ```
                 *
                 * !!! warning "Behavior changed in 0.3.9" Added `input_token_details` and
                 * `output_token_details`.
                 */
                fun usageMetadata(usageMetadata: UsageMetadata?) =
                    usageMetadata(JsonField.ofNullable(usageMetadata))

                /** Alias for calling [Builder.usageMetadata] with `usageMetadata.orElse(null)`. */
                fun usageMetadata(usageMetadata: Optional<UsageMetadata>) =
                    usageMetadata(usageMetadata.getOrNull())

                /**
                 * Sets [Builder.usageMetadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usageMetadata] with a well-typed [UsageMetadata]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun usageMetadata(usageMetadata: JsonField<UsageMetadata>) = apply {
                    this.usageMetadata = usageMetadata
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [AiMessageChunk].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AiMessageChunk =
                    AiMessageChunk(
                        checkRequired("content", content),
                        id,
                        additionalKwargs,
                        chunkPosition,
                        (invalidToolCalls ?: JsonMissing.of()).map { it.toImmutable() },
                        name,
                        responseMetadata,
                        (toolCallChunks ?: JsonMissing.of()).map { it.toImmutable() },
                        (toolCalls ?: JsonMissing.of()).map { it.toImmutable() },
                        type,
                        usageMetadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AiMessageChunk = apply {
                if (validated) {
                    return@apply
                }

                content().validate()
                id()
                chunkPosition().ifPresent { it.validate() }
                invalidToolCalls().ifPresent { it.forEach { it.validate() } }
                name()
                toolCallChunks().ifPresent { it.forEach { it.validate() } }
                toolCalls().ifPresent { it.forEach { it.validate() } }
                type().ifPresent { it.validate() }
                usageMetadata().ifPresent { it.validate() }
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
                (content.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (id.asKnown().isPresent) 1 else 0) +
                    (chunkPosition.asKnown().getOrNull()?.validity() ?: 0) +
                    (invalidToolCalls.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (toolCallChunks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (toolCalls.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (usageMetadata.asKnown().getOrNull()?.validity() ?: 0)

            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val string: String? = null,
                private val unnamedSchemaWithArrayParent6s: List<UnnamedSchemaWithArrayParent6>? =
                    null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun unnamedSchemaWithArrayParent6s():
                    Optional<List<UnnamedSchemaWithArrayParent6>> =
                    Optional.ofNullable(unnamedSchemaWithArrayParent6s)

                fun isString(): Boolean = string != null

                fun isUnnamedSchemaWithArrayParent6s(): Boolean =
                    unnamedSchemaWithArrayParent6s != null

                fun asString(): String = string.getOrThrow("string")

                fun asUnnamedSchemaWithArrayParent6s(): List<UnnamedSchemaWithArrayParent6> =
                    unnamedSchemaWithArrayParent6s.getOrThrow("unnamedSchemaWithArrayParent6s")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        unnamedSchemaWithArrayParent6s != null ->
                            visitor.visitUnnamedSchemaWithArrayParent6s(
                                unnamedSchemaWithArrayParent6s
                            )
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Content = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitUnnamedSchemaWithArrayParent6s(
                                unnamedSchemaWithArrayParent6s: List<UnnamedSchemaWithArrayParent6>
                            ) {
                                unnamedSchemaWithArrayParent6s.forEach { it.validate() }
                            }
                        }
                    )
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
                    accept(
                        object : Visitor<Int> {
                            override fun visitString(string: String) = 1

                            override fun visitUnnamedSchemaWithArrayParent6s(
                                unnamedSchemaWithArrayParent6s: List<UnnamedSchemaWithArrayParent6>
                            ) = unnamedSchemaWithArrayParent6s.sumOf { it.validity().toInt() }

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Content &&
                        string == other.string &&
                        unnamedSchemaWithArrayParent6s == other.unnamedSchemaWithArrayParent6s
                }

                override fun hashCode(): Int = Objects.hash(string, unnamedSchemaWithArrayParent6s)

                override fun toString(): String =
                    when {
                        string != null -> "Content{string=$string}"
                        unnamedSchemaWithArrayParent6s != null ->
                            "Content{unnamedSchemaWithArrayParent6s=$unnamedSchemaWithArrayParent6s}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }

                companion object {

                    @JvmStatic fun ofString(string: String) = Content(string = string)

                    @JvmStatic
                    fun ofUnnamedSchemaWithArrayParent6s(
                        unnamedSchemaWithArrayParent6s: List<UnnamedSchemaWithArrayParent6>
                    ) =
                        Content(
                            unnamedSchemaWithArrayParent6s =
                                unnamedSchemaWithArrayParent6s.toImmutable()
                        )
                }

                /**
                 * An interface that defines how to map each variant of [Content] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitUnnamedSchemaWithArrayParent6s(
                        unnamedSchemaWithArrayParent6s: List<UnnamedSchemaWithArrayParent6>
                    ): T

                    /**
                     * Maps an unknown variant of [Content] to a value of type [T].
                     *
                     * An instance of [Content] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws LangsmithApiInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LangsmithApiInvalidDataException("Unknown Content: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Content {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Content(string = it, _json = json)
                                    },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<List<UnnamedSchemaWithArrayParent6>>(),
                                        )
                                        ?.let {
                                            Content(
                                                unnamedSchemaWithArrayParent6s = it,
                                                _json = json,
                                            )
                                        },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // object).
                            0 -> Content(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Content>(Content::class) {

                    override fun serialize(
                        value: Content,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.unnamedSchemaWithArrayParent6s != null ->
                                generator.writeObject(value.unnamedSchemaWithArrayParent6s)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }

                @JsonDeserialize(using = UnnamedSchemaWithArrayParent6.Deserializer::class)
                @JsonSerialize(using = UnnamedSchemaWithArrayParent6.Serializer::class)
                class UnnamedSchemaWithArrayParent6
                private constructor(
                    private val string: String? = null,
                    private val jsonValue: JsonValue? = null,
                    private val _json: JsonValue? = null,
                ) {

                    fun string(): Optional<String> = Optional.ofNullable(string)

                    fun jsonValue(): Optional<JsonValue> = Optional.ofNullable(jsonValue)

                    fun isString(): Boolean = string != null

                    fun isJsonValue(): Boolean = jsonValue != null

                    fun asString(): String = string.getOrThrow("string")

                    fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

                    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            string != null -> visitor.visitString(string)
                            jsonValue != null -> visitor.visitJsonValue(jsonValue)
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): UnnamedSchemaWithArrayParent6 = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitString(string: String) {}

                                override fun visitJsonValue(jsonValue: JsonValue) {}
                            }
                        )
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
                        accept(
                            object : Visitor<Int> {
                                override fun visitString(string: String) = 1

                                override fun visitJsonValue(jsonValue: JsonValue) = 1

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is UnnamedSchemaWithArrayParent6 &&
                            string == other.string &&
                            jsonValue == other.jsonValue
                    }

                    override fun hashCode(): Int = Objects.hash(string, jsonValue)

                    override fun toString(): String =
                        when {
                            string != null -> "UnnamedSchemaWithArrayParent6{string=$string}"
                            jsonValue != null ->
                                "UnnamedSchemaWithArrayParent6{jsonValue=$jsonValue}"
                            _json != null -> "UnnamedSchemaWithArrayParent6{_unknown=$_json}"
                            else ->
                                throw IllegalStateException("Invalid UnnamedSchemaWithArrayParent6")
                        }

                    companion object {

                        @JvmStatic
                        fun ofString(string: String) =
                            UnnamedSchemaWithArrayParent6(string = string)

                        @JvmStatic
                        fun ofJsonValue(jsonValue: JsonValue) =
                            UnnamedSchemaWithArrayParent6(jsonValue = jsonValue)
                    }

                    /**
                     * An interface that defines how to map each variant of
                     * [UnnamedSchemaWithArrayParent6] to a value of type [T].
                     */
                    interface Visitor<out T> {

                        fun visitString(string: String): T

                        fun visitJsonValue(jsonValue: JsonValue): T

                        /**
                         * Maps an unknown variant of [UnnamedSchemaWithArrayParent6] to a value of
                         * type [T].
                         *
                         * An instance of [UnnamedSchemaWithArrayParent6] can contain an unknown
                         * variant if it was deserialized from data that doesn't match any known
                         * variant. For example, if the SDK is on an older version than the API,
                         * then the API may respond with new variants that the SDK is unaware of.
                         *
                         * @throws LangsmithApiInvalidDataException in the default implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw LangsmithApiInvalidDataException(
                                "Unknown UnnamedSchemaWithArrayParent6: $json"
                            )
                        }
                    }

                    internal class Deserializer :
                        BaseDeserializer<UnnamedSchemaWithArrayParent6>(
                            UnnamedSchemaWithArrayParent6::class
                        ) {

                        override fun ObjectCodec.deserialize(
                            node: JsonNode
                        ): UnnamedSchemaWithArrayParent6 {
                            val json = JsonValue.fromJsonNode(node)

                            val bestMatches =
                                sequenceOf(
                                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                            UnnamedSchemaWithArrayParent6(string = it, _json = json)
                                        },
                                        tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                            UnnamedSchemaWithArrayParent6(
                                                jsonValue = it,
                                                _json = json,
                                            )
                                        },
                                    )
                                    .filterNotNull()
                                    .allMaxBy { it.validity() }
                                    .toList()
                            return when (bestMatches.size) {
                                // This can happen if what we're deserializing is completely
                                // incompatible with all the possible variants.
                                0 -> UnnamedSchemaWithArrayParent6(_json = json)
                                1 -> bestMatches.single()
                                // If there's more than one match with the highest validity, then
                                // use the first completely valid match, or simply the first match
                                // if none are completely valid.
                                else ->
                                    bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                            }
                        }
                    }

                    internal class Serializer :
                        BaseSerializer<UnnamedSchemaWithArrayParent6>(
                            UnnamedSchemaWithArrayParent6::class
                        ) {

                        override fun serialize(
                            value: UnnamedSchemaWithArrayParent6,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.string != null -> generator.writeObject(value.string)
                                value.jsonValue != null -> generator.writeObject(value.jsonValue)
                                value._json != null -> generator.writeObject(value._json)
                                else ->
                                    throw IllegalStateException(
                                        "Invalid UnnamedSchemaWithArrayParent6"
                                    )
                            }
                        }
                    }
                }
            }

            class ChunkPosition
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val LAST = of("last")

                    @JvmStatic fun of(value: String) = ChunkPosition(JsonField.of(value))
                }

                /** An enum containing [ChunkPosition]'s known values. */
                enum class Known {
                    LAST
                }

                /**
                 * An enum containing [ChunkPosition]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ChunkPosition] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    LAST,
                    /**
                     * An enum member indicating that [ChunkPosition] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        LAST -> Value.LAST
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        LAST -> Known.LAST
                        else ->
                            throw LangsmithApiInvalidDataException("Unknown ChunkPosition: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LangsmithApiInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): ChunkPosition = apply {
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
                    } catch (e: LangsmithApiInvalidDataException) {
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

                    return other is ChunkPosition && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * A chunk of a tool call (yielded when streaming).
             *
             * When merging `ToolCallChunk`s (e.g., via `AIMessageChunk.__add__`), all string
             * attributes are concatenated. Chunks are only merged if their values of `index` are
             * equal and not None.
             *
             * Example:
             * ```python
             * left_chunks = [ToolCallChunk(name="foo", args='{"a":', index=0)]
             * right_chunks = [ToolCallChunk(name=None, args="1}", index=0)]
             *
             * (
             *     AIMessageChunk(content="", tool_call_chunks=left_chunks)
             *     + AIMessageChunk(content="", tool_call_chunks=right_chunks)
             * ).tool_call_chunks == [ToolCallChunk(name="foo", args='{"a":1}', index=0)]
             * ```
             */
            class ToolCallChunk
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val args: JsonField<String>,
                private val index: JsonField<Long>,
                private val name: JsonField<String>,
                private val type: JsonField<Type>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("args")
                    @ExcludeMissing
                    args: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("index")
                    @ExcludeMissing
                    index: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                ) : this(id, args, index, name, type, mutableMapOf())

                /**
                 * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun id(): Optional<String> = id.getOptional("id")

                /**
                 * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun args(): Optional<String> = args.getOptional("args")

                /**
                 * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun index(): Optional<Long> = index.getOptional("index")

                /**
                 * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun name(): Optional<String> = name.getOptional("name")

                /**
                 * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun type(): Optional<Type> = type.getOptional("type")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [args].
                 *
                 * Unlike [args], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("args") @ExcludeMissing fun _args(): JsonField<String> = args

                /**
                 * Returns the raw JSON value of [index].
                 *
                 * Unlike [index], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                     * Returns a mutable builder for constructing an instance of [ToolCallChunk].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .args()
                     * .index()
                     * .name()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ToolCallChunk]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var args: JsonField<String>? = null
                    private var index: JsonField<Long>? = null
                    private var name: JsonField<String>? = null
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(toolCallChunk: ToolCallChunk) = apply {
                        id = toolCallChunk.id
                        args = toolCallChunk.args
                        index = toolCallChunk.index
                        name = toolCallChunk.name
                        type = toolCallChunk.type
                        additionalProperties = toolCallChunk.additionalProperties.toMutableMap()
                    }

                    fun id(id: String?) = id(JsonField.ofNullable(id))

                    /** Alias for calling [Builder.id] with `id.orElse(null)`. */
                    fun id(id: Optional<String>) = id(id.getOrNull())

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun args(args: String?) = args(JsonField.ofNullable(args))

                    /** Alias for calling [Builder.args] with `args.orElse(null)`. */
                    fun args(args: Optional<String>) = args(args.getOrNull())

                    /**
                     * Sets [Builder.args] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.args] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun args(args: JsonField<String>) = apply { this.args = args }

                    fun index(index: Long?) = index(JsonField.ofNullable(index))

                    /**
                     * Alias for [Builder.index].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun index(index: Long) = index(index as Long?)

                    /** Alias for calling [Builder.index] with `index.orElse(null)`. */
                    fun index(index: Optional<Long>) = index(index.getOrNull())

                    /**
                     * Sets [Builder.index] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.index] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun index(index: JsonField<Long>) = apply { this.index = index }

                    fun name(name: String?) = name(JsonField.ofNullable(name))

                    /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                    fun name(name: Optional<String>) = name(name.getOrNull())

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [ToolCallChunk].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .args()
                     * .index()
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ToolCallChunk =
                        ToolCallChunk(
                            checkRequired("id", id),
                            checkRequired("args", args),
                            checkRequired("index", index),
                            checkRequired("name", name),
                            type,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): ToolCallChunk = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    args()
                    index()
                    name()
                    type().ifPresent { it.validate() }
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (if (args.asKnown().isPresent) 1 else 0) +
                        (if (index.asKnown().isPresent) 1 else 0) +
                        (if (name.asKnown().isPresent) 1 else 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0)

                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val TOOL_CALL_CHUNK = of("tool_call_chunk")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        TOOL_CALL_CHUNK
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        TOOL_CALL_CHUNK,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            TOOL_CALL_CHUNK -> Value.TOOL_CALL_CHUNK
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LangsmithApiInvalidDataException if this class instance's value is a
                     *   not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            TOOL_CALL_CHUNK -> Known.TOOL_CALL_CHUNK
                            else -> throw LangsmithApiInvalidDataException("Unknown Type: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LangsmithApiInvalidDataException if this class instance's value does
                     *   not have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LangsmithApiInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Type = apply {
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ToolCallChunk &&
                        id == other.id &&
                        args == other.args &&
                        index == other.index &&
                        name == other.name &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(id, args, index, name, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ToolCallChunk{id=$id, args=$args, index=$index, name=$name, type=$type, additionalProperties=$additionalProperties}"
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val AI_MESSAGE_CHUNK = of("AIMessageChunk")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    AI_MESSAGE_CHUNK
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    AI_MESSAGE_CHUNK,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        AI_MESSAGE_CHUNK -> Value.AI_MESSAGE_CHUNK
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        AI_MESSAGE_CHUNK -> Known.AI_MESSAGE_CHUNK
                        else -> throw LangsmithApiInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LangsmithApiInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Type = apply {
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
                    } catch (e: LangsmithApiInvalidDataException) {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AiMessageChunk &&
                    content == other.content &&
                    id == other.id &&
                    additionalKwargs == other.additionalKwargs &&
                    chunkPosition == other.chunkPosition &&
                    invalidToolCalls == other.invalidToolCalls &&
                    name == other.name &&
                    responseMetadata == other.responseMetadata &&
                    toolCallChunks == other.toolCallChunks &&
                    toolCalls == other.toolCalls &&
                    type == other.type &&
                    usageMetadata == other.usageMetadata &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    content,
                    id,
                    additionalKwargs,
                    chunkPosition,
                    invalidToolCalls,
                    name,
                    responseMetadata,
                    toolCallChunks,
                    toolCalls,
                    type,
                    usageMetadata,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AiMessageChunk{content=$content, id=$id, additionalKwargs=$additionalKwargs, chunkPosition=$chunkPosition, invalidToolCalls=$invalidToolCalls, name=$name, responseMetadata=$responseMetadata, toolCallChunks=$toolCallChunks, toolCalls=$toolCalls, type=$type, usageMetadata=$usageMetadata, additionalProperties=$additionalProperties}"
        }

        /** Human Message chunk. */
        class HumanMessageChunk
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<Content>,
            private val id: JsonField<String>,
            private val additionalKwargs: JsonValue,
            private val name: JsonField<String>,
            private val responseMetadata: JsonValue,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<Content> = JsonMissing.of(),
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("additional_kwargs")
                @ExcludeMissing
                additionalKwargs: JsonValue = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("response_metadata")
                @ExcludeMissing
                responseMetadata: JsonValue = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(content, id, additionalKwargs, name, responseMetadata, type, mutableMapOf())

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): Content = content.getRequired("content")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            @JsonProperty("additional_kwargs")
            @ExcludeMissing
            fun _additionalKwargs(): JsonValue = additionalKwargs

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            @JsonProperty("response_metadata")
            @ExcludeMissing
            fun _responseMetadata(): JsonValue = responseMetadata

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [HumanMessageChunk].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [HumanMessageChunk]. */
            class Builder internal constructor() {

                private var content: JsonField<Content>? = null
                private var id: JsonField<String> = JsonMissing.of()
                private var additionalKwargs: JsonValue = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var responseMetadata: JsonValue = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(humanMessageChunk: HumanMessageChunk) = apply {
                    content = humanMessageChunk.content
                    id = humanMessageChunk.id
                    additionalKwargs = humanMessageChunk.additionalKwargs
                    name = humanMessageChunk.name
                    responseMetadata = humanMessageChunk.responseMetadata
                    type = humanMessageChunk.type
                    additionalProperties = humanMessageChunk.additionalProperties.toMutableMap()
                }

                fun content(content: Content) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [Content] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<Content>) = apply { this.content = content }

                /** Alias for calling [content] with `Content.ofString(string)`. */
                fun content(string: String) = content(Content.ofString(string))

                /**
                 * Alias for calling [content] with
                 * `Content.ofUnnamedSchemaWithArrayParent7s(unnamedSchemaWithArrayParent7s)`.
                 */
                fun contentOfUnnamedSchemaWithArrayParent7s(
                    unnamedSchemaWithArrayParent7s: List<Content.UnnamedSchemaWithArrayParent7>
                ) =
                    content(
                        Content.ofUnnamedSchemaWithArrayParent7s(unnamedSchemaWithArrayParent7s)
                    )

                fun id(id: String?) = id(JsonField.ofNullable(id))

                /** Alias for calling [Builder.id] with `id.orElse(null)`. */
                fun id(id: Optional<String>) = id(id.getOrNull())

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalKwargs(additionalKwargs: JsonValue) = apply {
                    this.additionalKwargs = additionalKwargs
                }

                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun responseMetadata(responseMetadata: JsonValue) = apply {
                    this.responseMetadata = responseMetadata
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [HumanMessageChunk].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): HumanMessageChunk =
                    HumanMessageChunk(
                        checkRequired("content", content),
                        id,
                        additionalKwargs,
                        name,
                        responseMetadata,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): HumanMessageChunk = apply {
                if (validated) {
                    return@apply
                }

                content().validate()
                id()
                name()
                type().ifPresent { it.validate() }
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
                (content.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (id.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val string: String? = null,
                private val unnamedSchemaWithArrayParent7s: List<UnnamedSchemaWithArrayParent7>? =
                    null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun unnamedSchemaWithArrayParent7s():
                    Optional<List<UnnamedSchemaWithArrayParent7>> =
                    Optional.ofNullable(unnamedSchemaWithArrayParent7s)

                fun isString(): Boolean = string != null

                fun isUnnamedSchemaWithArrayParent7s(): Boolean =
                    unnamedSchemaWithArrayParent7s != null

                fun asString(): String = string.getOrThrow("string")

                fun asUnnamedSchemaWithArrayParent7s(): List<UnnamedSchemaWithArrayParent7> =
                    unnamedSchemaWithArrayParent7s.getOrThrow("unnamedSchemaWithArrayParent7s")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        unnamedSchemaWithArrayParent7s != null ->
                            visitor.visitUnnamedSchemaWithArrayParent7s(
                                unnamedSchemaWithArrayParent7s
                            )
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Content = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitUnnamedSchemaWithArrayParent7s(
                                unnamedSchemaWithArrayParent7s: List<UnnamedSchemaWithArrayParent7>
                            ) {
                                unnamedSchemaWithArrayParent7s.forEach { it.validate() }
                            }
                        }
                    )
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
                    accept(
                        object : Visitor<Int> {
                            override fun visitString(string: String) = 1

                            override fun visitUnnamedSchemaWithArrayParent7s(
                                unnamedSchemaWithArrayParent7s: List<UnnamedSchemaWithArrayParent7>
                            ) = unnamedSchemaWithArrayParent7s.sumOf { it.validity().toInt() }

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Content &&
                        string == other.string &&
                        unnamedSchemaWithArrayParent7s == other.unnamedSchemaWithArrayParent7s
                }

                override fun hashCode(): Int = Objects.hash(string, unnamedSchemaWithArrayParent7s)

                override fun toString(): String =
                    when {
                        string != null -> "Content{string=$string}"
                        unnamedSchemaWithArrayParent7s != null ->
                            "Content{unnamedSchemaWithArrayParent7s=$unnamedSchemaWithArrayParent7s}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }

                companion object {

                    @JvmStatic fun ofString(string: String) = Content(string = string)

                    @JvmStatic
                    fun ofUnnamedSchemaWithArrayParent7s(
                        unnamedSchemaWithArrayParent7s: List<UnnamedSchemaWithArrayParent7>
                    ) =
                        Content(
                            unnamedSchemaWithArrayParent7s =
                                unnamedSchemaWithArrayParent7s.toImmutable()
                        )
                }

                /**
                 * An interface that defines how to map each variant of [Content] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitUnnamedSchemaWithArrayParent7s(
                        unnamedSchemaWithArrayParent7s: List<UnnamedSchemaWithArrayParent7>
                    ): T

                    /**
                     * Maps an unknown variant of [Content] to a value of type [T].
                     *
                     * An instance of [Content] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws LangsmithApiInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LangsmithApiInvalidDataException("Unknown Content: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Content {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Content(string = it, _json = json)
                                    },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<List<UnnamedSchemaWithArrayParent7>>(),
                                        )
                                        ?.let {
                                            Content(
                                                unnamedSchemaWithArrayParent7s = it,
                                                _json = json,
                                            )
                                        },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // object).
                            0 -> Content(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Content>(Content::class) {

                    override fun serialize(
                        value: Content,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.unnamedSchemaWithArrayParent7s != null ->
                                generator.writeObject(value.unnamedSchemaWithArrayParent7s)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }

                @JsonDeserialize(using = UnnamedSchemaWithArrayParent7.Deserializer::class)
                @JsonSerialize(using = UnnamedSchemaWithArrayParent7.Serializer::class)
                class UnnamedSchemaWithArrayParent7
                private constructor(
                    private val string: String? = null,
                    private val jsonValue: JsonValue? = null,
                    private val _json: JsonValue? = null,
                ) {

                    fun string(): Optional<String> = Optional.ofNullable(string)

                    fun jsonValue(): Optional<JsonValue> = Optional.ofNullable(jsonValue)

                    fun isString(): Boolean = string != null

                    fun isJsonValue(): Boolean = jsonValue != null

                    fun asString(): String = string.getOrThrow("string")

                    fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

                    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            string != null -> visitor.visitString(string)
                            jsonValue != null -> visitor.visitJsonValue(jsonValue)
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): UnnamedSchemaWithArrayParent7 = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitString(string: String) {}

                                override fun visitJsonValue(jsonValue: JsonValue) {}
                            }
                        )
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
                        accept(
                            object : Visitor<Int> {
                                override fun visitString(string: String) = 1

                                override fun visitJsonValue(jsonValue: JsonValue) = 1

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is UnnamedSchemaWithArrayParent7 &&
                            string == other.string &&
                            jsonValue == other.jsonValue
                    }

                    override fun hashCode(): Int = Objects.hash(string, jsonValue)

                    override fun toString(): String =
                        when {
                            string != null -> "UnnamedSchemaWithArrayParent7{string=$string}"
                            jsonValue != null ->
                                "UnnamedSchemaWithArrayParent7{jsonValue=$jsonValue}"
                            _json != null -> "UnnamedSchemaWithArrayParent7{_unknown=$_json}"
                            else ->
                                throw IllegalStateException("Invalid UnnamedSchemaWithArrayParent7")
                        }

                    companion object {

                        @JvmStatic
                        fun ofString(string: String) =
                            UnnamedSchemaWithArrayParent7(string = string)

                        @JvmStatic
                        fun ofJsonValue(jsonValue: JsonValue) =
                            UnnamedSchemaWithArrayParent7(jsonValue = jsonValue)
                    }

                    /**
                     * An interface that defines how to map each variant of
                     * [UnnamedSchemaWithArrayParent7] to a value of type [T].
                     */
                    interface Visitor<out T> {

                        fun visitString(string: String): T

                        fun visitJsonValue(jsonValue: JsonValue): T

                        /**
                         * Maps an unknown variant of [UnnamedSchemaWithArrayParent7] to a value of
                         * type [T].
                         *
                         * An instance of [UnnamedSchemaWithArrayParent7] can contain an unknown
                         * variant if it was deserialized from data that doesn't match any known
                         * variant. For example, if the SDK is on an older version than the API,
                         * then the API may respond with new variants that the SDK is unaware of.
                         *
                         * @throws LangsmithApiInvalidDataException in the default implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw LangsmithApiInvalidDataException(
                                "Unknown UnnamedSchemaWithArrayParent7: $json"
                            )
                        }
                    }

                    internal class Deserializer :
                        BaseDeserializer<UnnamedSchemaWithArrayParent7>(
                            UnnamedSchemaWithArrayParent7::class
                        ) {

                        override fun ObjectCodec.deserialize(
                            node: JsonNode
                        ): UnnamedSchemaWithArrayParent7 {
                            val json = JsonValue.fromJsonNode(node)

                            val bestMatches =
                                sequenceOf(
                                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                            UnnamedSchemaWithArrayParent7(string = it, _json = json)
                                        },
                                        tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                            UnnamedSchemaWithArrayParent7(
                                                jsonValue = it,
                                                _json = json,
                                            )
                                        },
                                    )
                                    .filterNotNull()
                                    .allMaxBy { it.validity() }
                                    .toList()
                            return when (bestMatches.size) {
                                // This can happen if what we're deserializing is completely
                                // incompatible with all the possible variants.
                                0 -> UnnamedSchemaWithArrayParent7(_json = json)
                                1 -> bestMatches.single()
                                // If there's more than one match with the highest validity, then
                                // use the first completely valid match, or simply the first match
                                // if none are completely valid.
                                else ->
                                    bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                            }
                        }
                    }

                    internal class Serializer :
                        BaseSerializer<UnnamedSchemaWithArrayParent7>(
                            UnnamedSchemaWithArrayParent7::class
                        ) {

                        override fun serialize(
                            value: UnnamedSchemaWithArrayParent7,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.string != null -> generator.writeObject(value.string)
                                value.jsonValue != null -> generator.writeObject(value.jsonValue)
                                value._json != null -> generator.writeObject(value._json)
                                else ->
                                    throw IllegalStateException(
                                        "Invalid UnnamedSchemaWithArrayParent7"
                                    )
                            }
                        }
                    }
                }
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val HUMAN_MESSAGE_CHUNK = of("HumanMessageChunk")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    HUMAN_MESSAGE_CHUNK
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    HUMAN_MESSAGE_CHUNK,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        HUMAN_MESSAGE_CHUNK -> Value.HUMAN_MESSAGE_CHUNK
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        HUMAN_MESSAGE_CHUNK -> Known.HUMAN_MESSAGE_CHUNK
                        else -> throw LangsmithApiInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LangsmithApiInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Type = apply {
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
                    } catch (e: LangsmithApiInvalidDataException) {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is HumanMessageChunk &&
                    content == other.content &&
                    id == other.id &&
                    additionalKwargs == other.additionalKwargs &&
                    name == other.name &&
                    responseMetadata == other.responseMetadata &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    content,
                    id,
                    additionalKwargs,
                    name,
                    responseMetadata,
                    type,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "HumanMessageChunk{content=$content, id=$id, additionalKwargs=$additionalKwargs, name=$name, responseMetadata=$responseMetadata, type=$type, additionalProperties=$additionalProperties}"
        }

        /** Chat Message chunk. */
        class ChatMessageChunk
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<Content>,
            private val role: JsonField<String>,
            private val id: JsonField<String>,
            private val additionalKwargs: JsonValue,
            private val name: JsonField<String>,
            private val responseMetadata: JsonValue,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<Content> = JsonMissing.of(),
                @JsonProperty("role") @ExcludeMissing role: JsonField<String> = JsonMissing.of(),
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("additional_kwargs")
                @ExcludeMissing
                additionalKwargs: JsonValue = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("response_metadata")
                @ExcludeMissing
                responseMetadata: JsonValue = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(
                content,
                role,
                id,
                additionalKwargs,
                name,
                responseMetadata,
                type,
                mutableMapOf(),
            )

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): Content = content.getRequired("content")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun role(): String = role.getRequired("role")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            @JsonProperty("additional_kwargs")
            @ExcludeMissing
            fun _additionalKwargs(): JsonValue = additionalKwargs

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            @JsonProperty("response_metadata")
            @ExcludeMissing
            fun _responseMetadata(): JsonValue = responseMetadata

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

            /**
             * Returns the raw JSON value of [role].
             *
             * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<String> = role

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [ChatMessageChunk].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * .role()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ChatMessageChunk]. */
            class Builder internal constructor() {

                private var content: JsonField<Content>? = null
                private var role: JsonField<String>? = null
                private var id: JsonField<String> = JsonMissing.of()
                private var additionalKwargs: JsonValue = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var responseMetadata: JsonValue = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(chatMessageChunk: ChatMessageChunk) = apply {
                    content = chatMessageChunk.content
                    role = chatMessageChunk.role
                    id = chatMessageChunk.id
                    additionalKwargs = chatMessageChunk.additionalKwargs
                    name = chatMessageChunk.name
                    responseMetadata = chatMessageChunk.responseMetadata
                    type = chatMessageChunk.type
                    additionalProperties = chatMessageChunk.additionalProperties.toMutableMap()
                }

                fun content(content: Content) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [Content] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<Content>) = apply { this.content = content }

                /** Alias for calling [content] with `Content.ofString(string)`. */
                fun content(string: String) = content(Content.ofString(string))

                /**
                 * Alias for calling [content] with
                 * `Content.ofUnnamedSchemaWithArrayParent8s(unnamedSchemaWithArrayParent8s)`.
                 */
                fun contentOfUnnamedSchemaWithArrayParent8s(
                    unnamedSchemaWithArrayParent8s: List<Content.UnnamedSchemaWithArrayParent8>
                ) =
                    content(
                        Content.ofUnnamedSchemaWithArrayParent8s(unnamedSchemaWithArrayParent8s)
                    )

                fun role(role: String) = role(JsonField.of(role))

                /**
                 * Sets [Builder.role] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.role] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonField<String>) = apply { this.role = role }

                fun id(id: String?) = id(JsonField.ofNullable(id))

                /** Alias for calling [Builder.id] with `id.orElse(null)`. */
                fun id(id: Optional<String>) = id(id.getOrNull())

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalKwargs(additionalKwargs: JsonValue) = apply {
                    this.additionalKwargs = additionalKwargs
                }

                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun responseMetadata(responseMetadata: JsonValue) = apply {
                    this.responseMetadata = responseMetadata
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ChatMessageChunk].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * .role()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ChatMessageChunk =
                    ChatMessageChunk(
                        checkRequired("content", content),
                        checkRequired("role", role),
                        id,
                        additionalKwargs,
                        name,
                        responseMetadata,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ChatMessageChunk = apply {
                if (validated) {
                    return@apply
                }

                content().validate()
                role()
                id()
                name()
                type().ifPresent { it.validate() }
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
                (content.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (role.asKnown().isPresent) 1 else 0) +
                    (if (id.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val string: String? = null,
                private val unnamedSchemaWithArrayParent8s: List<UnnamedSchemaWithArrayParent8>? =
                    null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun unnamedSchemaWithArrayParent8s():
                    Optional<List<UnnamedSchemaWithArrayParent8>> =
                    Optional.ofNullable(unnamedSchemaWithArrayParent8s)

                fun isString(): Boolean = string != null

                fun isUnnamedSchemaWithArrayParent8s(): Boolean =
                    unnamedSchemaWithArrayParent8s != null

                fun asString(): String = string.getOrThrow("string")

                fun asUnnamedSchemaWithArrayParent8s(): List<UnnamedSchemaWithArrayParent8> =
                    unnamedSchemaWithArrayParent8s.getOrThrow("unnamedSchemaWithArrayParent8s")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        unnamedSchemaWithArrayParent8s != null ->
                            visitor.visitUnnamedSchemaWithArrayParent8s(
                                unnamedSchemaWithArrayParent8s
                            )
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Content = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitUnnamedSchemaWithArrayParent8s(
                                unnamedSchemaWithArrayParent8s: List<UnnamedSchemaWithArrayParent8>
                            ) {
                                unnamedSchemaWithArrayParent8s.forEach { it.validate() }
                            }
                        }
                    )
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
                    accept(
                        object : Visitor<Int> {
                            override fun visitString(string: String) = 1

                            override fun visitUnnamedSchemaWithArrayParent8s(
                                unnamedSchemaWithArrayParent8s: List<UnnamedSchemaWithArrayParent8>
                            ) = unnamedSchemaWithArrayParent8s.sumOf { it.validity().toInt() }

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Content &&
                        string == other.string &&
                        unnamedSchemaWithArrayParent8s == other.unnamedSchemaWithArrayParent8s
                }

                override fun hashCode(): Int = Objects.hash(string, unnamedSchemaWithArrayParent8s)

                override fun toString(): String =
                    when {
                        string != null -> "Content{string=$string}"
                        unnamedSchemaWithArrayParent8s != null ->
                            "Content{unnamedSchemaWithArrayParent8s=$unnamedSchemaWithArrayParent8s}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }

                companion object {

                    @JvmStatic fun ofString(string: String) = Content(string = string)

                    @JvmStatic
                    fun ofUnnamedSchemaWithArrayParent8s(
                        unnamedSchemaWithArrayParent8s: List<UnnamedSchemaWithArrayParent8>
                    ) =
                        Content(
                            unnamedSchemaWithArrayParent8s =
                                unnamedSchemaWithArrayParent8s.toImmutable()
                        )
                }

                /**
                 * An interface that defines how to map each variant of [Content] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitUnnamedSchemaWithArrayParent8s(
                        unnamedSchemaWithArrayParent8s: List<UnnamedSchemaWithArrayParent8>
                    ): T

                    /**
                     * Maps an unknown variant of [Content] to a value of type [T].
                     *
                     * An instance of [Content] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws LangsmithApiInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LangsmithApiInvalidDataException("Unknown Content: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Content {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Content(string = it, _json = json)
                                    },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<List<UnnamedSchemaWithArrayParent8>>(),
                                        )
                                        ?.let {
                                            Content(
                                                unnamedSchemaWithArrayParent8s = it,
                                                _json = json,
                                            )
                                        },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // object).
                            0 -> Content(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Content>(Content::class) {

                    override fun serialize(
                        value: Content,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.unnamedSchemaWithArrayParent8s != null ->
                                generator.writeObject(value.unnamedSchemaWithArrayParent8s)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }

                @JsonDeserialize(using = UnnamedSchemaWithArrayParent8.Deserializer::class)
                @JsonSerialize(using = UnnamedSchemaWithArrayParent8.Serializer::class)
                class UnnamedSchemaWithArrayParent8
                private constructor(
                    private val string: String? = null,
                    private val jsonValue: JsonValue? = null,
                    private val _json: JsonValue? = null,
                ) {

                    fun string(): Optional<String> = Optional.ofNullable(string)

                    fun jsonValue(): Optional<JsonValue> = Optional.ofNullable(jsonValue)

                    fun isString(): Boolean = string != null

                    fun isJsonValue(): Boolean = jsonValue != null

                    fun asString(): String = string.getOrThrow("string")

                    fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

                    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            string != null -> visitor.visitString(string)
                            jsonValue != null -> visitor.visitJsonValue(jsonValue)
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): UnnamedSchemaWithArrayParent8 = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitString(string: String) {}

                                override fun visitJsonValue(jsonValue: JsonValue) {}
                            }
                        )
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
                        accept(
                            object : Visitor<Int> {
                                override fun visitString(string: String) = 1

                                override fun visitJsonValue(jsonValue: JsonValue) = 1

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is UnnamedSchemaWithArrayParent8 &&
                            string == other.string &&
                            jsonValue == other.jsonValue
                    }

                    override fun hashCode(): Int = Objects.hash(string, jsonValue)

                    override fun toString(): String =
                        when {
                            string != null -> "UnnamedSchemaWithArrayParent8{string=$string}"
                            jsonValue != null ->
                                "UnnamedSchemaWithArrayParent8{jsonValue=$jsonValue}"
                            _json != null -> "UnnamedSchemaWithArrayParent8{_unknown=$_json}"
                            else ->
                                throw IllegalStateException("Invalid UnnamedSchemaWithArrayParent8")
                        }

                    companion object {

                        @JvmStatic
                        fun ofString(string: String) =
                            UnnamedSchemaWithArrayParent8(string = string)

                        @JvmStatic
                        fun ofJsonValue(jsonValue: JsonValue) =
                            UnnamedSchemaWithArrayParent8(jsonValue = jsonValue)
                    }

                    /**
                     * An interface that defines how to map each variant of
                     * [UnnamedSchemaWithArrayParent8] to a value of type [T].
                     */
                    interface Visitor<out T> {

                        fun visitString(string: String): T

                        fun visitJsonValue(jsonValue: JsonValue): T

                        /**
                         * Maps an unknown variant of [UnnamedSchemaWithArrayParent8] to a value of
                         * type [T].
                         *
                         * An instance of [UnnamedSchemaWithArrayParent8] can contain an unknown
                         * variant if it was deserialized from data that doesn't match any known
                         * variant. For example, if the SDK is on an older version than the API,
                         * then the API may respond with new variants that the SDK is unaware of.
                         *
                         * @throws LangsmithApiInvalidDataException in the default implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw LangsmithApiInvalidDataException(
                                "Unknown UnnamedSchemaWithArrayParent8: $json"
                            )
                        }
                    }

                    internal class Deserializer :
                        BaseDeserializer<UnnamedSchemaWithArrayParent8>(
                            UnnamedSchemaWithArrayParent8::class
                        ) {

                        override fun ObjectCodec.deserialize(
                            node: JsonNode
                        ): UnnamedSchemaWithArrayParent8 {
                            val json = JsonValue.fromJsonNode(node)

                            val bestMatches =
                                sequenceOf(
                                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                            UnnamedSchemaWithArrayParent8(string = it, _json = json)
                                        },
                                        tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                            UnnamedSchemaWithArrayParent8(
                                                jsonValue = it,
                                                _json = json,
                                            )
                                        },
                                    )
                                    .filterNotNull()
                                    .allMaxBy { it.validity() }
                                    .toList()
                            return when (bestMatches.size) {
                                // This can happen if what we're deserializing is completely
                                // incompatible with all the possible variants.
                                0 -> UnnamedSchemaWithArrayParent8(_json = json)
                                1 -> bestMatches.single()
                                // If there's more than one match with the highest validity, then
                                // use the first completely valid match, or simply the first match
                                // if none are completely valid.
                                else ->
                                    bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                            }
                        }
                    }

                    internal class Serializer :
                        BaseSerializer<UnnamedSchemaWithArrayParent8>(
                            UnnamedSchemaWithArrayParent8::class
                        ) {

                        override fun serialize(
                            value: UnnamedSchemaWithArrayParent8,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.string != null -> generator.writeObject(value.string)
                                value.jsonValue != null -> generator.writeObject(value.jsonValue)
                                value._json != null -> generator.writeObject(value._json)
                                else ->
                                    throw IllegalStateException(
                                        "Invalid UnnamedSchemaWithArrayParent8"
                                    )
                            }
                        }
                    }
                }
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CHAT_MESSAGE_CHUNK = of("ChatMessageChunk")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    CHAT_MESSAGE_CHUNK
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CHAT_MESSAGE_CHUNK,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CHAT_MESSAGE_CHUNK -> Value.CHAT_MESSAGE_CHUNK
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        CHAT_MESSAGE_CHUNK -> Known.CHAT_MESSAGE_CHUNK
                        else -> throw LangsmithApiInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LangsmithApiInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Type = apply {
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
                    } catch (e: LangsmithApiInvalidDataException) {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ChatMessageChunk &&
                    content == other.content &&
                    role == other.role &&
                    id == other.id &&
                    additionalKwargs == other.additionalKwargs &&
                    name == other.name &&
                    responseMetadata == other.responseMetadata &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    content,
                    role,
                    id,
                    additionalKwargs,
                    name,
                    responseMetadata,
                    type,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ChatMessageChunk{content=$content, role=$role, id=$id, additionalKwargs=$additionalKwargs, name=$name, responseMetadata=$responseMetadata, type=$type, additionalProperties=$additionalProperties}"
        }

        /** System Message chunk. */
        class SystemMessageChunk
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<Content>,
            private val id: JsonField<String>,
            private val additionalKwargs: JsonValue,
            private val name: JsonField<String>,
            private val responseMetadata: JsonValue,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<Content> = JsonMissing.of(),
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("additional_kwargs")
                @ExcludeMissing
                additionalKwargs: JsonValue = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("response_metadata")
                @ExcludeMissing
                responseMetadata: JsonValue = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(content, id, additionalKwargs, name, responseMetadata, type, mutableMapOf())

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): Content = content.getRequired("content")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            @JsonProperty("additional_kwargs")
            @ExcludeMissing
            fun _additionalKwargs(): JsonValue = additionalKwargs

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            @JsonProperty("response_metadata")
            @ExcludeMissing
            fun _responseMetadata(): JsonValue = responseMetadata

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [SystemMessageChunk].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SystemMessageChunk]. */
            class Builder internal constructor() {

                private var content: JsonField<Content>? = null
                private var id: JsonField<String> = JsonMissing.of()
                private var additionalKwargs: JsonValue = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var responseMetadata: JsonValue = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(systemMessageChunk: SystemMessageChunk) = apply {
                    content = systemMessageChunk.content
                    id = systemMessageChunk.id
                    additionalKwargs = systemMessageChunk.additionalKwargs
                    name = systemMessageChunk.name
                    responseMetadata = systemMessageChunk.responseMetadata
                    type = systemMessageChunk.type
                    additionalProperties = systemMessageChunk.additionalProperties.toMutableMap()
                }

                fun content(content: Content) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [Content] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<Content>) = apply { this.content = content }

                /** Alias for calling [content] with `Content.ofString(string)`. */
                fun content(string: String) = content(Content.ofString(string))

                /**
                 * Alias for calling [content] with
                 * `Content.ofUnnamedSchemaWithArrayParent9s(unnamedSchemaWithArrayParent9s)`.
                 */
                fun contentOfUnnamedSchemaWithArrayParent9s(
                    unnamedSchemaWithArrayParent9s: List<Content.UnnamedSchemaWithArrayParent9>
                ) =
                    content(
                        Content.ofUnnamedSchemaWithArrayParent9s(unnamedSchemaWithArrayParent9s)
                    )

                fun id(id: String?) = id(JsonField.ofNullable(id))

                /** Alias for calling [Builder.id] with `id.orElse(null)`. */
                fun id(id: Optional<String>) = id(id.getOrNull())

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalKwargs(additionalKwargs: JsonValue) = apply {
                    this.additionalKwargs = additionalKwargs
                }

                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun responseMetadata(responseMetadata: JsonValue) = apply {
                    this.responseMetadata = responseMetadata
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [SystemMessageChunk].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SystemMessageChunk =
                    SystemMessageChunk(
                        checkRequired("content", content),
                        id,
                        additionalKwargs,
                        name,
                        responseMetadata,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): SystemMessageChunk = apply {
                if (validated) {
                    return@apply
                }

                content().validate()
                id()
                name()
                type().ifPresent { it.validate() }
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
                (content.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (id.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val string: String? = null,
                private val unnamedSchemaWithArrayParent9s: List<UnnamedSchemaWithArrayParent9>? =
                    null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun unnamedSchemaWithArrayParent9s():
                    Optional<List<UnnamedSchemaWithArrayParent9>> =
                    Optional.ofNullable(unnamedSchemaWithArrayParent9s)

                fun isString(): Boolean = string != null

                fun isUnnamedSchemaWithArrayParent9s(): Boolean =
                    unnamedSchemaWithArrayParent9s != null

                fun asString(): String = string.getOrThrow("string")

                fun asUnnamedSchemaWithArrayParent9s(): List<UnnamedSchemaWithArrayParent9> =
                    unnamedSchemaWithArrayParent9s.getOrThrow("unnamedSchemaWithArrayParent9s")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        unnamedSchemaWithArrayParent9s != null ->
                            visitor.visitUnnamedSchemaWithArrayParent9s(
                                unnamedSchemaWithArrayParent9s
                            )
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Content = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitUnnamedSchemaWithArrayParent9s(
                                unnamedSchemaWithArrayParent9s: List<UnnamedSchemaWithArrayParent9>
                            ) {
                                unnamedSchemaWithArrayParent9s.forEach { it.validate() }
                            }
                        }
                    )
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
                    accept(
                        object : Visitor<Int> {
                            override fun visitString(string: String) = 1

                            override fun visitUnnamedSchemaWithArrayParent9s(
                                unnamedSchemaWithArrayParent9s: List<UnnamedSchemaWithArrayParent9>
                            ) = unnamedSchemaWithArrayParent9s.sumOf { it.validity().toInt() }

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Content &&
                        string == other.string &&
                        unnamedSchemaWithArrayParent9s == other.unnamedSchemaWithArrayParent9s
                }

                override fun hashCode(): Int = Objects.hash(string, unnamedSchemaWithArrayParent9s)

                override fun toString(): String =
                    when {
                        string != null -> "Content{string=$string}"
                        unnamedSchemaWithArrayParent9s != null ->
                            "Content{unnamedSchemaWithArrayParent9s=$unnamedSchemaWithArrayParent9s}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }

                companion object {

                    @JvmStatic fun ofString(string: String) = Content(string = string)

                    @JvmStatic
                    fun ofUnnamedSchemaWithArrayParent9s(
                        unnamedSchemaWithArrayParent9s: List<UnnamedSchemaWithArrayParent9>
                    ) =
                        Content(
                            unnamedSchemaWithArrayParent9s =
                                unnamedSchemaWithArrayParent9s.toImmutable()
                        )
                }

                /**
                 * An interface that defines how to map each variant of [Content] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitUnnamedSchemaWithArrayParent9s(
                        unnamedSchemaWithArrayParent9s: List<UnnamedSchemaWithArrayParent9>
                    ): T

                    /**
                     * Maps an unknown variant of [Content] to a value of type [T].
                     *
                     * An instance of [Content] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws LangsmithApiInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LangsmithApiInvalidDataException("Unknown Content: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Content {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Content(string = it, _json = json)
                                    },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<List<UnnamedSchemaWithArrayParent9>>(),
                                        )
                                        ?.let {
                                            Content(
                                                unnamedSchemaWithArrayParent9s = it,
                                                _json = json,
                                            )
                                        },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // object).
                            0 -> Content(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Content>(Content::class) {

                    override fun serialize(
                        value: Content,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.unnamedSchemaWithArrayParent9s != null ->
                                generator.writeObject(value.unnamedSchemaWithArrayParent9s)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }

                @JsonDeserialize(using = UnnamedSchemaWithArrayParent9.Deserializer::class)
                @JsonSerialize(using = UnnamedSchemaWithArrayParent9.Serializer::class)
                class UnnamedSchemaWithArrayParent9
                private constructor(
                    private val string: String? = null,
                    private val jsonValue: JsonValue? = null,
                    private val _json: JsonValue? = null,
                ) {

                    fun string(): Optional<String> = Optional.ofNullable(string)

                    fun jsonValue(): Optional<JsonValue> = Optional.ofNullable(jsonValue)

                    fun isString(): Boolean = string != null

                    fun isJsonValue(): Boolean = jsonValue != null

                    fun asString(): String = string.getOrThrow("string")

                    fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

                    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            string != null -> visitor.visitString(string)
                            jsonValue != null -> visitor.visitJsonValue(jsonValue)
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): UnnamedSchemaWithArrayParent9 = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitString(string: String) {}

                                override fun visitJsonValue(jsonValue: JsonValue) {}
                            }
                        )
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
                        accept(
                            object : Visitor<Int> {
                                override fun visitString(string: String) = 1

                                override fun visitJsonValue(jsonValue: JsonValue) = 1

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is UnnamedSchemaWithArrayParent9 &&
                            string == other.string &&
                            jsonValue == other.jsonValue
                    }

                    override fun hashCode(): Int = Objects.hash(string, jsonValue)

                    override fun toString(): String =
                        when {
                            string != null -> "UnnamedSchemaWithArrayParent9{string=$string}"
                            jsonValue != null ->
                                "UnnamedSchemaWithArrayParent9{jsonValue=$jsonValue}"
                            _json != null -> "UnnamedSchemaWithArrayParent9{_unknown=$_json}"
                            else ->
                                throw IllegalStateException("Invalid UnnamedSchemaWithArrayParent9")
                        }

                    companion object {

                        @JvmStatic
                        fun ofString(string: String) =
                            UnnamedSchemaWithArrayParent9(string = string)

                        @JvmStatic
                        fun ofJsonValue(jsonValue: JsonValue) =
                            UnnamedSchemaWithArrayParent9(jsonValue = jsonValue)
                    }

                    /**
                     * An interface that defines how to map each variant of
                     * [UnnamedSchemaWithArrayParent9] to a value of type [T].
                     */
                    interface Visitor<out T> {

                        fun visitString(string: String): T

                        fun visitJsonValue(jsonValue: JsonValue): T

                        /**
                         * Maps an unknown variant of [UnnamedSchemaWithArrayParent9] to a value of
                         * type [T].
                         *
                         * An instance of [UnnamedSchemaWithArrayParent9] can contain an unknown
                         * variant if it was deserialized from data that doesn't match any known
                         * variant. For example, if the SDK is on an older version than the API,
                         * then the API may respond with new variants that the SDK is unaware of.
                         *
                         * @throws LangsmithApiInvalidDataException in the default implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw LangsmithApiInvalidDataException(
                                "Unknown UnnamedSchemaWithArrayParent9: $json"
                            )
                        }
                    }

                    internal class Deserializer :
                        BaseDeserializer<UnnamedSchemaWithArrayParent9>(
                            UnnamedSchemaWithArrayParent9::class
                        ) {

                        override fun ObjectCodec.deserialize(
                            node: JsonNode
                        ): UnnamedSchemaWithArrayParent9 {
                            val json = JsonValue.fromJsonNode(node)

                            val bestMatches =
                                sequenceOf(
                                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                            UnnamedSchemaWithArrayParent9(string = it, _json = json)
                                        },
                                        tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                            UnnamedSchemaWithArrayParent9(
                                                jsonValue = it,
                                                _json = json,
                                            )
                                        },
                                    )
                                    .filterNotNull()
                                    .allMaxBy { it.validity() }
                                    .toList()
                            return when (bestMatches.size) {
                                // This can happen if what we're deserializing is completely
                                // incompatible with all the possible variants.
                                0 -> UnnamedSchemaWithArrayParent9(_json = json)
                                1 -> bestMatches.single()
                                // If there's more than one match with the highest validity, then
                                // use the first completely valid match, or simply the first match
                                // if none are completely valid.
                                else ->
                                    bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                            }
                        }
                    }

                    internal class Serializer :
                        BaseSerializer<UnnamedSchemaWithArrayParent9>(
                            UnnamedSchemaWithArrayParent9::class
                        ) {

                        override fun serialize(
                            value: UnnamedSchemaWithArrayParent9,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.string != null -> generator.writeObject(value.string)
                                value.jsonValue != null -> generator.writeObject(value.jsonValue)
                                value._json != null -> generator.writeObject(value._json)
                                else ->
                                    throw IllegalStateException(
                                        "Invalid UnnamedSchemaWithArrayParent9"
                                    )
                            }
                        }
                    }
                }
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val SYSTEM_MESSAGE_CHUNK = of("SystemMessageChunk")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    SYSTEM_MESSAGE_CHUNK
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SYSTEM_MESSAGE_CHUNK,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        SYSTEM_MESSAGE_CHUNK -> Value.SYSTEM_MESSAGE_CHUNK
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        SYSTEM_MESSAGE_CHUNK -> Known.SYSTEM_MESSAGE_CHUNK
                        else -> throw LangsmithApiInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LangsmithApiInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Type = apply {
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
                    } catch (e: LangsmithApiInvalidDataException) {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SystemMessageChunk &&
                    content == other.content &&
                    id == other.id &&
                    additionalKwargs == other.additionalKwargs &&
                    name == other.name &&
                    responseMetadata == other.responseMetadata &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    content,
                    id,
                    additionalKwargs,
                    name,
                    responseMetadata,
                    type,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SystemMessageChunk{content=$content, id=$id, additionalKwargs=$additionalKwargs, name=$name, responseMetadata=$responseMetadata, type=$type, additionalProperties=$additionalProperties}"
        }

        /** Function Message chunk. */
        class FunctionMessageChunk
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<Content>,
            private val name: JsonField<String>,
            private val id: JsonField<String>,
            private val additionalKwargs: JsonValue,
            private val responseMetadata: JsonValue,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<Content> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("additional_kwargs")
                @ExcludeMissing
                additionalKwargs: JsonValue = JsonMissing.of(),
                @JsonProperty("response_metadata")
                @ExcludeMissing
                responseMetadata: JsonValue = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(content, name, id, additionalKwargs, responseMetadata, type, mutableMapOf())

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): Content = content.getRequired("content")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            @JsonProperty("additional_kwargs")
            @ExcludeMissing
            fun _additionalKwargs(): JsonValue = additionalKwargs

            @JsonProperty("response_metadata")
            @ExcludeMissing
            fun _responseMetadata(): JsonValue = responseMetadata

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [FunctionMessageChunk].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * .name()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [FunctionMessageChunk]. */
            class Builder internal constructor() {

                private var content: JsonField<Content>? = null
                private var name: JsonField<String>? = null
                private var id: JsonField<String> = JsonMissing.of()
                private var additionalKwargs: JsonValue = JsonMissing.of()
                private var responseMetadata: JsonValue = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(functionMessageChunk: FunctionMessageChunk) = apply {
                    content = functionMessageChunk.content
                    name = functionMessageChunk.name
                    id = functionMessageChunk.id
                    additionalKwargs = functionMessageChunk.additionalKwargs
                    responseMetadata = functionMessageChunk.responseMetadata
                    type = functionMessageChunk.type
                    additionalProperties = functionMessageChunk.additionalProperties.toMutableMap()
                }

                fun content(content: Content) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [Content] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<Content>) = apply { this.content = content }

                /** Alias for calling [content] with `Content.ofString(string)`. */
                fun content(string: String) = content(Content.ofString(string))

                /**
                 * Alias for calling [content] with
                 * `Content.ofUnnamedSchemaWithArrayParent10s(unnamedSchemaWithArrayParent10s)`.
                 */
                fun contentOfUnnamedSchemaWithArrayParent10s(
                    unnamedSchemaWithArrayParent10s: List<Content.UnnamedSchemaWithArrayParent10>
                ) =
                    content(
                        Content.ofUnnamedSchemaWithArrayParent10s(unnamedSchemaWithArrayParent10s)
                    )

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun id(id: String?) = id(JsonField.ofNullable(id))

                /** Alias for calling [Builder.id] with `id.orElse(null)`. */
                fun id(id: Optional<String>) = id(id.getOrNull())

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalKwargs(additionalKwargs: JsonValue) = apply {
                    this.additionalKwargs = additionalKwargs
                }

                fun responseMetadata(responseMetadata: JsonValue) = apply {
                    this.responseMetadata = responseMetadata
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [FunctionMessageChunk].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): FunctionMessageChunk =
                    FunctionMessageChunk(
                        checkRequired("content", content),
                        checkRequired("name", name),
                        id,
                        additionalKwargs,
                        responseMetadata,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): FunctionMessageChunk = apply {
                if (validated) {
                    return@apply
                }

                content().validate()
                name()
                id()
                type().ifPresent { it.validate() }
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
                (content.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (id.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val string: String? = null,
                private val unnamedSchemaWithArrayParent10s: List<UnnamedSchemaWithArrayParent10>? =
                    null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun unnamedSchemaWithArrayParent10s():
                    Optional<List<UnnamedSchemaWithArrayParent10>> =
                    Optional.ofNullable(unnamedSchemaWithArrayParent10s)

                fun isString(): Boolean = string != null

                fun isUnnamedSchemaWithArrayParent10s(): Boolean =
                    unnamedSchemaWithArrayParent10s != null

                fun asString(): String = string.getOrThrow("string")

                fun asUnnamedSchemaWithArrayParent10s(): List<UnnamedSchemaWithArrayParent10> =
                    unnamedSchemaWithArrayParent10s.getOrThrow("unnamedSchemaWithArrayParent10s")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        unnamedSchemaWithArrayParent10s != null ->
                            visitor.visitUnnamedSchemaWithArrayParent10s(
                                unnamedSchemaWithArrayParent10s
                            )
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Content = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitUnnamedSchemaWithArrayParent10s(
                                unnamedSchemaWithArrayParent10s:
                                    List<UnnamedSchemaWithArrayParent10>
                            ) {
                                unnamedSchemaWithArrayParent10s.forEach { it.validate() }
                            }
                        }
                    )
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
                    accept(
                        object : Visitor<Int> {
                            override fun visitString(string: String) = 1

                            override fun visitUnnamedSchemaWithArrayParent10s(
                                unnamedSchemaWithArrayParent10s:
                                    List<UnnamedSchemaWithArrayParent10>
                            ) = unnamedSchemaWithArrayParent10s.sumOf { it.validity().toInt() }

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Content &&
                        string == other.string &&
                        unnamedSchemaWithArrayParent10s == other.unnamedSchemaWithArrayParent10s
                }

                override fun hashCode(): Int = Objects.hash(string, unnamedSchemaWithArrayParent10s)

                override fun toString(): String =
                    when {
                        string != null -> "Content{string=$string}"
                        unnamedSchemaWithArrayParent10s != null ->
                            "Content{unnamedSchemaWithArrayParent10s=$unnamedSchemaWithArrayParent10s}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }

                companion object {

                    @JvmStatic fun ofString(string: String) = Content(string = string)

                    @JvmStatic
                    fun ofUnnamedSchemaWithArrayParent10s(
                        unnamedSchemaWithArrayParent10s: List<UnnamedSchemaWithArrayParent10>
                    ) =
                        Content(
                            unnamedSchemaWithArrayParent10s =
                                unnamedSchemaWithArrayParent10s.toImmutable()
                        )
                }

                /**
                 * An interface that defines how to map each variant of [Content] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitUnnamedSchemaWithArrayParent10s(
                        unnamedSchemaWithArrayParent10s: List<UnnamedSchemaWithArrayParent10>
                    ): T

                    /**
                     * Maps an unknown variant of [Content] to a value of type [T].
                     *
                     * An instance of [Content] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws LangsmithApiInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LangsmithApiInvalidDataException("Unknown Content: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Content {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Content(string = it, _json = json)
                                    },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<List<UnnamedSchemaWithArrayParent10>>(),
                                        )
                                        ?.let {
                                            Content(
                                                unnamedSchemaWithArrayParent10s = it,
                                                _json = json,
                                            )
                                        },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // object).
                            0 -> Content(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Content>(Content::class) {

                    override fun serialize(
                        value: Content,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.unnamedSchemaWithArrayParent10s != null ->
                                generator.writeObject(value.unnamedSchemaWithArrayParent10s)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }

                @JsonDeserialize(using = UnnamedSchemaWithArrayParent10.Deserializer::class)
                @JsonSerialize(using = UnnamedSchemaWithArrayParent10.Serializer::class)
                class UnnamedSchemaWithArrayParent10
                private constructor(
                    private val string: String? = null,
                    private val jsonValue: JsonValue? = null,
                    private val _json: JsonValue? = null,
                ) {

                    fun string(): Optional<String> = Optional.ofNullable(string)

                    fun jsonValue(): Optional<JsonValue> = Optional.ofNullable(jsonValue)

                    fun isString(): Boolean = string != null

                    fun isJsonValue(): Boolean = jsonValue != null

                    fun asString(): String = string.getOrThrow("string")

                    fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

                    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            string != null -> visitor.visitString(string)
                            jsonValue != null -> visitor.visitJsonValue(jsonValue)
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): UnnamedSchemaWithArrayParent10 = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitString(string: String) {}

                                override fun visitJsonValue(jsonValue: JsonValue) {}
                            }
                        )
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
                        accept(
                            object : Visitor<Int> {
                                override fun visitString(string: String) = 1

                                override fun visitJsonValue(jsonValue: JsonValue) = 1

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is UnnamedSchemaWithArrayParent10 &&
                            string == other.string &&
                            jsonValue == other.jsonValue
                    }

                    override fun hashCode(): Int = Objects.hash(string, jsonValue)

                    override fun toString(): String =
                        when {
                            string != null -> "UnnamedSchemaWithArrayParent10{string=$string}"
                            jsonValue != null ->
                                "UnnamedSchemaWithArrayParent10{jsonValue=$jsonValue}"
                            _json != null -> "UnnamedSchemaWithArrayParent10{_unknown=$_json}"
                            else ->
                                throw IllegalStateException(
                                    "Invalid UnnamedSchemaWithArrayParent10"
                                )
                        }

                    companion object {

                        @JvmStatic
                        fun ofString(string: String) =
                            UnnamedSchemaWithArrayParent10(string = string)

                        @JvmStatic
                        fun ofJsonValue(jsonValue: JsonValue) =
                            UnnamedSchemaWithArrayParent10(jsonValue = jsonValue)
                    }

                    /**
                     * An interface that defines how to map each variant of
                     * [UnnamedSchemaWithArrayParent10] to a value of type [T].
                     */
                    interface Visitor<out T> {

                        fun visitString(string: String): T

                        fun visitJsonValue(jsonValue: JsonValue): T

                        /**
                         * Maps an unknown variant of [UnnamedSchemaWithArrayParent10] to a value of
                         * type [T].
                         *
                         * An instance of [UnnamedSchemaWithArrayParent10] can contain an unknown
                         * variant if it was deserialized from data that doesn't match any known
                         * variant. For example, if the SDK is on an older version than the API,
                         * then the API may respond with new variants that the SDK is unaware of.
                         *
                         * @throws LangsmithApiInvalidDataException in the default implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw LangsmithApiInvalidDataException(
                                "Unknown UnnamedSchemaWithArrayParent10: $json"
                            )
                        }
                    }

                    internal class Deserializer :
                        BaseDeserializer<UnnamedSchemaWithArrayParent10>(
                            UnnamedSchemaWithArrayParent10::class
                        ) {

                        override fun ObjectCodec.deserialize(
                            node: JsonNode
                        ): UnnamedSchemaWithArrayParent10 {
                            val json = JsonValue.fromJsonNode(node)

                            val bestMatches =
                                sequenceOf(
                                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                            UnnamedSchemaWithArrayParent10(
                                                string = it,
                                                _json = json,
                                            )
                                        },
                                        tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                            UnnamedSchemaWithArrayParent10(
                                                jsonValue = it,
                                                _json = json,
                                            )
                                        },
                                    )
                                    .filterNotNull()
                                    .allMaxBy { it.validity() }
                                    .toList()
                            return when (bestMatches.size) {
                                // This can happen if what we're deserializing is completely
                                // incompatible with all the possible variants.
                                0 -> UnnamedSchemaWithArrayParent10(_json = json)
                                1 -> bestMatches.single()
                                // If there's more than one match with the highest validity, then
                                // use the first completely valid match, or simply the first match
                                // if none are completely valid.
                                else ->
                                    bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                            }
                        }
                    }

                    internal class Serializer :
                        BaseSerializer<UnnamedSchemaWithArrayParent10>(
                            UnnamedSchemaWithArrayParent10::class
                        ) {

                        override fun serialize(
                            value: UnnamedSchemaWithArrayParent10,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.string != null -> generator.writeObject(value.string)
                                value.jsonValue != null -> generator.writeObject(value.jsonValue)
                                value._json != null -> generator.writeObject(value._json)
                                else ->
                                    throw IllegalStateException(
                                        "Invalid UnnamedSchemaWithArrayParent10"
                                    )
                            }
                        }
                    }
                }
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val FUNCTION_MESSAGE_CHUNK = of("FunctionMessageChunk")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    FUNCTION_MESSAGE_CHUNK
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FUNCTION_MESSAGE_CHUNK,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        FUNCTION_MESSAGE_CHUNK -> Value.FUNCTION_MESSAGE_CHUNK
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        FUNCTION_MESSAGE_CHUNK -> Known.FUNCTION_MESSAGE_CHUNK
                        else -> throw LangsmithApiInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LangsmithApiInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Type = apply {
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
                    } catch (e: LangsmithApiInvalidDataException) {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FunctionMessageChunk &&
                    content == other.content &&
                    name == other.name &&
                    id == other.id &&
                    additionalKwargs == other.additionalKwargs &&
                    responseMetadata == other.responseMetadata &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    content,
                    name,
                    id,
                    additionalKwargs,
                    responseMetadata,
                    type,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FunctionMessageChunk{content=$content, name=$name, id=$id, additionalKwargs=$additionalKwargs, responseMetadata=$responseMetadata, type=$type, additionalProperties=$additionalProperties}"
        }

        /** Tool Message chunk. */
        class ToolMessageChunk
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<Content>,
            private val toolCallId: JsonField<String>,
            private val id: JsonField<String>,
            private val additionalKwargs: JsonValue,
            private val artifact: JsonValue,
            private val name: JsonField<String>,
            private val responseMetadata: JsonValue,
            private val status: JsonField<Status>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<Content> = JsonMissing.of(),
                @JsonProperty("tool_call_id")
                @ExcludeMissing
                toolCallId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("additional_kwargs")
                @ExcludeMissing
                additionalKwargs: JsonValue = JsonMissing.of(),
                @JsonProperty("artifact") @ExcludeMissing artifact: JsonValue = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("response_metadata")
                @ExcludeMissing
                responseMetadata: JsonValue = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(
                content,
                toolCallId,
                id,
                additionalKwargs,
                artifact,
                name,
                responseMetadata,
                status,
                type,
                mutableMapOf(),
            )

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): Content = content.getRequired("content")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun toolCallId(): String = toolCallId.getRequired("tool_call_id")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            @JsonProperty("additional_kwargs")
            @ExcludeMissing
            fun _additionalKwargs(): JsonValue = additionalKwargs

            @JsonProperty("artifact") @ExcludeMissing fun _artifact(): JsonValue = artifact

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            @JsonProperty("response_metadata")
            @ExcludeMissing
            fun _responseMetadata(): JsonValue = responseMetadata

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun status(): Optional<Status> = status.getOptional("status")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

            /**
             * Returns the raw JSON value of [toolCallId].
             *
             * Unlike [toolCallId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tool_call_id")
            @ExcludeMissing
            fun _toolCallId(): JsonField<String> = toolCallId

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [ToolMessageChunk].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * .toolCallId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ToolMessageChunk]. */
            class Builder internal constructor() {

                private var content: JsonField<Content>? = null
                private var toolCallId: JsonField<String>? = null
                private var id: JsonField<String> = JsonMissing.of()
                private var additionalKwargs: JsonValue = JsonMissing.of()
                private var artifact: JsonValue = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var responseMetadata: JsonValue = JsonMissing.of()
                private var status: JsonField<Status> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(toolMessageChunk: ToolMessageChunk) = apply {
                    content = toolMessageChunk.content
                    toolCallId = toolMessageChunk.toolCallId
                    id = toolMessageChunk.id
                    additionalKwargs = toolMessageChunk.additionalKwargs
                    artifact = toolMessageChunk.artifact
                    name = toolMessageChunk.name
                    responseMetadata = toolMessageChunk.responseMetadata
                    status = toolMessageChunk.status
                    type = toolMessageChunk.type
                    additionalProperties = toolMessageChunk.additionalProperties.toMutableMap()
                }

                fun content(content: Content) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [Content] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<Content>) = apply { this.content = content }

                /** Alias for calling [content] with `Content.ofString(string)`. */
                fun content(string: String) = content(Content.ofString(string))

                /**
                 * Alias for calling [content] with
                 * `Content.ofUnnamedSchemaWithArrayParent11s(unnamedSchemaWithArrayParent11s)`.
                 */
                fun contentOfUnnamedSchemaWithArrayParent11s(
                    unnamedSchemaWithArrayParent11s: List<Content.UnnamedSchemaWithArrayParent11>
                ) =
                    content(
                        Content.ofUnnamedSchemaWithArrayParent11s(unnamedSchemaWithArrayParent11s)
                    )

                fun toolCallId(toolCallId: String) = toolCallId(JsonField.of(toolCallId))

                /**
                 * Sets [Builder.toolCallId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.toolCallId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun toolCallId(toolCallId: JsonField<String>) = apply {
                    this.toolCallId = toolCallId
                }

                fun id(id: String?) = id(JsonField.ofNullable(id))

                /** Alias for calling [Builder.id] with `id.orElse(null)`. */
                fun id(id: Optional<String>) = id(id.getOrNull())

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalKwargs(additionalKwargs: JsonValue) = apply {
                    this.additionalKwargs = additionalKwargs
                }

                fun artifact(artifact: JsonValue) = apply { this.artifact = artifact }

                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun responseMetadata(responseMetadata: JsonValue) = apply {
                    this.responseMetadata = responseMetadata
                }

                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ToolMessageChunk].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * .toolCallId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ToolMessageChunk =
                    ToolMessageChunk(
                        checkRequired("content", content),
                        checkRequired("toolCallId", toolCallId),
                        id,
                        additionalKwargs,
                        artifact,
                        name,
                        responseMetadata,
                        status,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ToolMessageChunk = apply {
                if (validated) {
                    return@apply
                }

                content().validate()
                toolCallId()
                id()
                name()
                status().ifPresent { it.validate() }
                type().ifPresent { it.validate() }
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
                (content.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (toolCallId.asKnown().isPresent) 1 else 0) +
                    (if (id.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (status.asKnown().getOrNull()?.validity() ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val string: String? = null,
                private val unnamedSchemaWithArrayParent11s: List<UnnamedSchemaWithArrayParent11>? =
                    null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun unnamedSchemaWithArrayParent11s():
                    Optional<List<UnnamedSchemaWithArrayParent11>> =
                    Optional.ofNullable(unnamedSchemaWithArrayParent11s)

                fun isString(): Boolean = string != null

                fun isUnnamedSchemaWithArrayParent11s(): Boolean =
                    unnamedSchemaWithArrayParent11s != null

                fun asString(): String = string.getOrThrow("string")

                fun asUnnamedSchemaWithArrayParent11s(): List<UnnamedSchemaWithArrayParent11> =
                    unnamedSchemaWithArrayParent11s.getOrThrow("unnamedSchemaWithArrayParent11s")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        unnamedSchemaWithArrayParent11s != null ->
                            visitor.visitUnnamedSchemaWithArrayParent11s(
                                unnamedSchemaWithArrayParent11s
                            )
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Content = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitUnnamedSchemaWithArrayParent11s(
                                unnamedSchemaWithArrayParent11s:
                                    List<UnnamedSchemaWithArrayParent11>
                            ) {
                                unnamedSchemaWithArrayParent11s.forEach { it.validate() }
                            }
                        }
                    )
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
                    accept(
                        object : Visitor<Int> {
                            override fun visitString(string: String) = 1

                            override fun visitUnnamedSchemaWithArrayParent11s(
                                unnamedSchemaWithArrayParent11s:
                                    List<UnnamedSchemaWithArrayParent11>
                            ) = unnamedSchemaWithArrayParent11s.sumOf { it.validity().toInt() }

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Content &&
                        string == other.string &&
                        unnamedSchemaWithArrayParent11s == other.unnamedSchemaWithArrayParent11s
                }

                override fun hashCode(): Int = Objects.hash(string, unnamedSchemaWithArrayParent11s)

                override fun toString(): String =
                    when {
                        string != null -> "Content{string=$string}"
                        unnamedSchemaWithArrayParent11s != null ->
                            "Content{unnamedSchemaWithArrayParent11s=$unnamedSchemaWithArrayParent11s}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }

                companion object {

                    @JvmStatic fun ofString(string: String) = Content(string = string)

                    @JvmStatic
                    fun ofUnnamedSchemaWithArrayParent11s(
                        unnamedSchemaWithArrayParent11s: List<UnnamedSchemaWithArrayParent11>
                    ) =
                        Content(
                            unnamedSchemaWithArrayParent11s =
                                unnamedSchemaWithArrayParent11s.toImmutable()
                        )
                }

                /**
                 * An interface that defines how to map each variant of [Content] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitUnnamedSchemaWithArrayParent11s(
                        unnamedSchemaWithArrayParent11s: List<UnnamedSchemaWithArrayParent11>
                    ): T

                    /**
                     * Maps an unknown variant of [Content] to a value of type [T].
                     *
                     * An instance of [Content] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws LangsmithApiInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LangsmithApiInvalidDataException("Unknown Content: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Content {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Content(string = it, _json = json)
                                    },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<List<UnnamedSchemaWithArrayParent11>>(),
                                        )
                                        ?.let {
                                            Content(
                                                unnamedSchemaWithArrayParent11s = it,
                                                _json = json,
                                            )
                                        },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // object).
                            0 -> Content(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Content>(Content::class) {

                    override fun serialize(
                        value: Content,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.unnamedSchemaWithArrayParent11s != null ->
                                generator.writeObject(value.unnamedSchemaWithArrayParent11s)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }

                @JsonDeserialize(using = UnnamedSchemaWithArrayParent11.Deserializer::class)
                @JsonSerialize(using = UnnamedSchemaWithArrayParent11.Serializer::class)
                class UnnamedSchemaWithArrayParent11
                private constructor(
                    private val string: String? = null,
                    private val jsonValue: JsonValue? = null,
                    private val _json: JsonValue? = null,
                ) {

                    fun string(): Optional<String> = Optional.ofNullable(string)

                    fun jsonValue(): Optional<JsonValue> = Optional.ofNullable(jsonValue)

                    fun isString(): Boolean = string != null

                    fun isJsonValue(): Boolean = jsonValue != null

                    fun asString(): String = string.getOrThrow("string")

                    fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

                    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            string != null -> visitor.visitString(string)
                            jsonValue != null -> visitor.visitJsonValue(jsonValue)
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): UnnamedSchemaWithArrayParent11 = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitString(string: String) {}

                                override fun visitJsonValue(jsonValue: JsonValue) {}
                            }
                        )
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
                        accept(
                            object : Visitor<Int> {
                                override fun visitString(string: String) = 1

                                override fun visitJsonValue(jsonValue: JsonValue) = 1

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is UnnamedSchemaWithArrayParent11 &&
                            string == other.string &&
                            jsonValue == other.jsonValue
                    }

                    override fun hashCode(): Int = Objects.hash(string, jsonValue)

                    override fun toString(): String =
                        when {
                            string != null -> "UnnamedSchemaWithArrayParent11{string=$string}"
                            jsonValue != null ->
                                "UnnamedSchemaWithArrayParent11{jsonValue=$jsonValue}"
                            _json != null -> "UnnamedSchemaWithArrayParent11{_unknown=$_json}"
                            else ->
                                throw IllegalStateException(
                                    "Invalid UnnamedSchemaWithArrayParent11"
                                )
                        }

                    companion object {

                        @JvmStatic
                        fun ofString(string: String) =
                            UnnamedSchemaWithArrayParent11(string = string)

                        @JvmStatic
                        fun ofJsonValue(jsonValue: JsonValue) =
                            UnnamedSchemaWithArrayParent11(jsonValue = jsonValue)
                    }

                    /**
                     * An interface that defines how to map each variant of
                     * [UnnamedSchemaWithArrayParent11] to a value of type [T].
                     */
                    interface Visitor<out T> {

                        fun visitString(string: String): T

                        fun visitJsonValue(jsonValue: JsonValue): T

                        /**
                         * Maps an unknown variant of [UnnamedSchemaWithArrayParent11] to a value of
                         * type [T].
                         *
                         * An instance of [UnnamedSchemaWithArrayParent11] can contain an unknown
                         * variant if it was deserialized from data that doesn't match any known
                         * variant. For example, if the SDK is on an older version than the API,
                         * then the API may respond with new variants that the SDK is unaware of.
                         *
                         * @throws LangsmithApiInvalidDataException in the default implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw LangsmithApiInvalidDataException(
                                "Unknown UnnamedSchemaWithArrayParent11: $json"
                            )
                        }
                    }

                    internal class Deserializer :
                        BaseDeserializer<UnnamedSchemaWithArrayParent11>(
                            UnnamedSchemaWithArrayParent11::class
                        ) {

                        override fun ObjectCodec.deserialize(
                            node: JsonNode
                        ): UnnamedSchemaWithArrayParent11 {
                            val json = JsonValue.fromJsonNode(node)

                            val bestMatches =
                                sequenceOf(
                                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                            UnnamedSchemaWithArrayParent11(
                                                string = it,
                                                _json = json,
                                            )
                                        },
                                        tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                            UnnamedSchemaWithArrayParent11(
                                                jsonValue = it,
                                                _json = json,
                                            )
                                        },
                                    )
                                    .filterNotNull()
                                    .allMaxBy { it.validity() }
                                    .toList()
                            return when (bestMatches.size) {
                                // This can happen if what we're deserializing is completely
                                // incompatible with all the possible variants.
                                0 -> UnnamedSchemaWithArrayParent11(_json = json)
                                1 -> bestMatches.single()
                                // If there's more than one match with the highest validity, then
                                // use the first completely valid match, or simply the first match
                                // if none are completely valid.
                                else ->
                                    bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                            }
                        }
                    }

                    internal class Serializer :
                        BaseSerializer<UnnamedSchemaWithArrayParent11>(
                            UnnamedSchemaWithArrayParent11::class
                        ) {

                        override fun serialize(
                            value: UnnamedSchemaWithArrayParent11,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.string != null -> generator.writeObject(value.string)
                                value.jsonValue != null -> generator.writeObject(value.jsonValue)
                                value._json != null -> generator.writeObject(value._json)
                                else ->
                                    throw IllegalStateException(
                                        "Invalid UnnamedSchemaWithArrayParent11"
                                    )
                            }
                        }
                    }
                }
            }

            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val SUCCESS = of("success")

                    @JvmField val ERROR = of("error")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    SUCCESS,
                    ERROR,
                }

                /**
                 * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Status] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SUCCESS,
                    ERROR,
                    /**
                     * An enum member indicating that [Status] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        SUCCESS -> Value.SUCCESS
                        ERROR -> Value.ERROR
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        SUCCESS -> Known.SUCCESS
                        ERROR -> Known.ERROR
                        else -> throw LangsmithApiInvalidDataException("Unknown Status: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LangsmithApiInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

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
                    } catch (e: LangsmithApiInvalidDataException) {
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

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val TOOL_MESSAGE_CHUNK = of("ToolMessageChunk")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    TOOL_MESSAGE_CHUNK
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TOOL_MESSAGE_CHUNK,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        TOOL_MESSAGE_CHUNK -> Value.TOOL_MESSAGE_CHUNK
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        TOOL_MESSAGE_CHUNK -> Known.TOOL_MESSAGE_CHUNK
                        else -> throw LangsmithApiInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LangsmithApiInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Type = apply {
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
                    } catch (e: LangsmithApiInvalidDataException) {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ToolMessageChunk &&
                    content == other.content &&
                    toolCallId == other.toolCallId &&
                    id == other.id &&
                    additionalKwargs == other.additionalKwargs &&
                    artifact == other.artifact &&
                    name == other.name &&
                    responseMetadata == other.responseMetadata &&
                    status == other.status &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    content,
                    toolCallId,
                    id,
                    additionalKwargs,
                    artifact,
                    name,
                    responseMetadata,
                    status,
                    type,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ToolMessageChunk{content=$content, toolCallId=$toolCallId, id=$id, additionalKwargs=$additionalKwargs, artifact=$artifact, name=$name, responseMetadata=$responseMetadata, status=$status, type=$type, additionalProperties=$additionalProperties}"
        }
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

    class TemplateFormat @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val F_STRING = of("f-string")

            @JvmField val MUSTACHE = of("mustache")

            @JvmStatic fun of(value: String) = TemplateFormat(JsonField.of(value))
        }

        /** An enum containing [TemplateFormat]'s known values. */
        enum class Known {
            F_STRING,
            MUSTACHE,
        }

        /**
         * An enum containing [TemplateFormat]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TemplateFormat] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            F_STRING,
            MUSTACHE,
            /**
             * An enum member indicating that [TemplateFormat] was instantiated with an unknown
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
                F_STRING -> Value.F_STRING
                MUSTACHE -> Value.MUSTACHE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangsmithApiInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                F_STRING -> Known.F_STRING
                MUSTACHE -> Known.MUSTACHE
                else -> throw LangsmithApiInvalidDataException("Unknown TemplateFormat: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangsmithApiInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangsmithApiInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): TemplateFormat = apply {
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
            } catch (e: LangsmithApiInvalidDataException) {
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

            return other is TemplateFormat && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Artifact
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val contents: JsonField<List<Content>>,
        private val currentContentIndex: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contents")
            @ExcludeMissing
            contents: JsonField<List<Content>> = JsonMissing.of(),
            @JsonProperty("current_content_index")
            @ExcludeMissing
            currentContentIndex: JsonField<Long> = JsonMissing.of(),
        ) : this(id, contents, currentContentIndex, mutableMapOf())

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contents(): List<Content> = contents.getRequired("contents")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currentContentIndex(): Long = currentContentIndex.getRequired("current_content_index")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [contents].
         *
         * Unlike [contents], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contents")
        @ExcludeMissing
        fun _contents(): JsonField<List<Content>> = contents

        /**
         * Returns the raw JSON value of [currentContentIndex].
         *
         * Unlike [currentContentIndex], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("current_content_index")
        @ExcludeMissing
        fun _currentContentIndex(): JsonField<Long> = currentContentIndex

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
             * Returns a mutable builder for constructing an instance of [Artifact].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .contents()
             * .currentContentIndex()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Artifact]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var contents: JsonField<MutableList<Content>>? = null
            private var currentContentIndex: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(artifact: Artifact) = apply {
                id = artifact.id
                contents = artifact.contents.map { it.toMutableList() }
                currentContentIndex = artifact.currentContentIndex
                additionalProperties = artifact.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun contents(contents: List<Content>) = contents(JsonField.of(contents))

            /**
             * Sets [Builder.contents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contents] with a well-typed `List<Content>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contents(contents: JsonField<List<Content>>) = apply {
                this.contents = contents.map { it.toMutableList() }
            }

            /**
             * Adds a single [Content] to [contents].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addContent(content: Content) = apply {
                contents =
                    (contents ?: JsonField.of(mutableListOf())).also {
                        checkKnown("contents", it).add(content)
                    }
            }

            fun currentContentIndex(currentContentIndex: Long) =
                currentContentIndex(JsonField.of(currentContentIndex))

            /**
             * Sets [Builder.currentContentIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currentContentIndex] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currentContentIndex(currentContentIndex: JsonField<Long>) = apply {
                this.currentContentIndex = currentContentIndex
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
             * Returns an immutable instance of [Artifact].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .contents()
             * .currentContentIndex()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Artifact =
                Artifact(
                    checkRequired("id", id),
                    checkRequired("contents", contents).map { it.toImmutable() },
                    checkRequired("currentContentIndex", currentContentIndex),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Artifact = apply {
            if (validated) {
                return@apply
            }

            id()
            contents().forEach { it.validate() }
            currentContentIndex()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (contents.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (currentContentIndex.asKnown().isPresent) 1 else 0)

        class Content
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<String>,
            private val index: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<String> = JsonMissing.of(),
                @JsonProperty("index") @ExcludeMissing index: JsonField<Long> = JsonMissing.of(),
            ) : this(content, index, mutableMapOf())

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): String = content.getRequired("content")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun index(): Long = index.getRequired("index")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

            /**
             * Returns the raw JSON value of [index].
             *
             * Unlike [index], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

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
                 * Returns a mutable builder for constructing an instance of [Content].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * .index()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Content]. */
            class Builder internal constructor() {

                private var content: JsonField<String>? = null
                private var index: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(content: Content) = apply {
                    this.content = content.content
                    index = content.index
                    additionalProperties = content.additionalProperties.toMutableMap()
                }

                fun content(content: String) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<String>) = apply { this.content = content }

                fun index(index: Long) = index(JsonField.of(index))

                /**
                 * Sets [Builder.index] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.index] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun index(index: JsonField<Long>) = apply { this.index = index }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Content].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * .index()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Content =
                    Content(
                        checkRequired("content", content),
                        checkRequired("index", index),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Content = apply {
                if (validated) {
                    return@apply
                }

                content()
                index()
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
                (if (content.asKnown().isPresent) 1 else 0) +
                    (if (index.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Content &&
                    content == other.content &&
                    index == other.index &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(content, index, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Content{content=$content, index=$index, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Artifact &&
                id == other.id &&
                contents == other.contents &&
                currentContentIndex == other.currentContentIndex &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, contents, currentContentIndex, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Artifact{id=$id, contents=$contents, currentContentIndex=$currentContentIndex, additionalProperties=$additionalProperties}"
    }

    class ArtifactLength @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val SHORTEST = of("shortest")

            @JvmField val SHORT = of("short")

            @JvmField val LONG = of("long")

            @JvmField val LONGEST = of("longest")

            @JvmStatic fun of(value: String) = ArtifactLength(JsonField.of(value))
        }

        /** An enum containing [ArtifactLength]'s known values. */
        enum class Known {
            SHORTEST,
            SHORT,
            LONG,
            LONGEST,
        }

        /**
         * An enum containing [ArtifactLength]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ArtifactLength] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SHORTEST,
            SHORT,
            LONG,
            LONGEST,
            /**
             * An enum member indicating that [ArtifactLength] was instantiated with an unknown
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
                SHORTEST -> Value.SHORTEST
                SHORT -> Value.SHORT
                LONG -> Value.LONG
                LONGEST -> Value.LONGEST
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangsmithApiInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                SHORTEST -> Known.SHORTEST
                SHORT -> Known.SHORT
                LONG -> Known.LONG
                LONGEST -> Known.LONGEST
                else -> throw LangsmithApiInvalidDataException("Unknown ArtifactLength: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangsmithApiInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangsmithApiInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): ArtifactLength = apply {
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
            } catch (e: LangsmithApiInvalidDataException) {
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

            return other is ArtifactLength && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Highlighted
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val highlightText: JsonField<String>,
        private val promptChunk: JsonField<String>,
        private val promptChunkEndIndex: JsonField<Long>,
        private val promptChunkStartIndex: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("highlight_text")
            @ExcludeMissing
            highlightText: JsonField<String> = JsonMissing.of(),
            @JsonProperty("prompt_chunk")
            @ExcludeMissing
            promptChunk: JsonField<String> = JsonMissing.of(),
            @JsonProperty("prompt_chunk_end_index")
            @ExcludeMissing
            promptChunkEndIndex: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("prompt_chunk_start_index")
            @ExcludeMissing
            promptChunkStartIndex: JsonField<Long> = JsonMissing.of(),
        ) : this(
            highlightText,
            promptChunk,
            promptChunkEndIndex,
            promptChunkStartIndex,
            mutableMapOf(),
        )

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun highlightText(): String = highlightText.getRequired("highlight_text")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun promptChunk(): String = promptChunk.getRequired("prompt_chunk")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun promptChunkEndIndex(): Long = promptChunkEndIndex.getRequired("prompt_chunk_end_index")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun promptChunkStartIndex(): Long =
            promptChunkStartIndex.getRequired("prompt_chunk_start_index")

        /**
         * Returns the raw JSON value of [highlightText].
         *
         * Unlike [highlightText], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("highlight_text")
        @ExcludeMissing
        fun _highlightText(): JsonField<String> = highlightText

        /**
         * Returns the raw JSON value of [promptChunk].
         *
         * Unlike [promptChunk], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prompt_chunk")
        @ExcludeMissing
        fun _promptChunk(): JsonField<String> = promptChunk

        /**
         * Returns the raw JSON value of [promptChunkEndIndex].
         *
         * Unlike [promptChunkEndIndex], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("prompt_chunk_end_index")
        @ExcludeMissing
        fun _promptChunkEndIndex(): JsonField<Long> = promptChunkEndIndex

        /**
         * Returns the raw JSON value of [promptChunkStartIndex].
         *
         * Unlike [promptChunkStartIndex], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("prompt_chunk_start_index")
        @ExcludeMissing
        fun _promptChunkStartIndex(): JsonField<Long> = promptChunkStartIndex

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
             * Returns a mutable builder for constructing an instance of [Highlighted].
             *
             * The following fields are required:
             * ```java
             * .highlightText()
             * .promptChunk()
             * .promptChunkEndIndex()
             * .promptChunkStartIndex()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Highlighted]. */
        class Builder internal constructor() {

            private var highlightText: JsonField<String>? = null
            private var promptChunk: JsonField<String>? = null
            private var promptChunkEndIndex: JsonField<Long>? = null
            private var promptChunkStartIndex: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(highlighted: Highlighted) = apply {
                highlightText = highlighted.highlightText
                promptChunk = highlighted.promptChunk
                promptChunkEndIndex = highlighted.promptChunkEndIndex
                promptChunkStartIndex = highlighted.promptChunkStartIndex
                additionalProperties = highlighted.additionalProperties.toMutableMap()
            }

            fun highlightText(highlightText: String) = highlightText(JsonField.of(highlightText))

            /**
             * Sets [Builder.highlightText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.highlightText] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun highlightText(highlightText: JsonField<String>) = apply {
                this.highlightText = highlightText
            }

            fun promptChunk(promptChunk: String) = promptChunk(JsonField.of(promptChunk))

            /**
             * Sets [Builder.promptChunk] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promptChunk] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun promptChunk(promptChunk: JsonField<String>) = apply {
                this.promptChunk = promptChunk
            }

            fun promptChunkEndIndex(promptChunkEndIndex: Long) =
                promptChunkEndIndex(JsonField.of(promptChunkEndIndex))

            /**
             * Sets [Builder.promptChunkEndIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promptChunkEndIndex] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun promptChunkEndIndex(promptChunkEndIndex: JsonField<Long>) = apply {
                this.promptChunkEndIndex = promptChunkEndIndex
            }

            fun promptChunkStartIndex(promptChunkStartIndex: Long) =
                promptChunkStartIndex(JsonField.of(promptChunkStartIndex))

            /**
             * Sets [Builder.promptChunkStartIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promptChunkStartIndex] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun promptChunkStartIndex(promptChunkStartIndex: JsonField<Long>) = apply {
                this.promptChunkStartIndex = promptChunkStartIndex
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
             * Returns an immutable instance of [Highlighted].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .highlightText()
             * .promptChunk()
             * .promptChunkEndIndex()
             * .promptChunkStartIndex()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Highlighted =
                Highlighted(
                    checkRequired("highlightText", highlightText),
                    checkRequired("promptChunk", promptChunk),
                    checkRequired("promptChunkEndIndex", promptChunkEndIndex),
                    checkRequired("promptChunkStartIndex", promptChunkStartIndex),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Highlighted = apply {
            if (validated) {
                return@apply
            }

            highlightText()
            promptChunk()
            promptChunkEndIndex()
            promptChunkStartIndex()
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
            (if (highlightText.asKnown().isPresent) 1 else 0) +
                (if (promptChunk.asKnown().isPresent) 1 else 0) +
                (if (promptChunkEndIndex.asKnown().isPresent) 1 else 0) +
                (if (promptChunkStartIndex.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Highlighted &&
                highlightText == other.highlightText &&
                promptChunk == other.promptChunk &&
                promptChunkEndIndex == other.promptChunkEndIndex &&
                promptChunkStartIndex == other.promptChunkStartIndex &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                highlightText,
                promptChunk,
                promptChunkEndIndex,
                promptChunkStartIndex,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Highlighted{highlightText=$highlightText, promptChunk=$promptChunk, promptChunkEndIndex=$promptChunkEndIndex, promptChunkStartIndex=$promptChunkStartIndex, additionalProperties=$additionalProperties}"
    }

    class ReadingLevel @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val CHILD = of("child")

            @JvmField val TEENAGER = of("teenager")

            @JvmField val COLLEGE = of("college")

            @JvmField val PHD = of("phd")

            @JvmStatic fun of(value: String) = ReadingLevel(JsonField.of(value))
        }

        /** An enum containing [ReadingLevel]'s known values. */
        enum class Known {
            CHILD,
            TEENAGER,
            COLLEGE,
            PHD,
        }

        /**
         * An enum containing [ReadingLevel]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ReadingLevel] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CHILD,
            TEENAGER,
            COLLEGE,
            PHD,
            /**
             * An enum member indicating that [ReadingLevel] was instantiated with an unknown value.
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
                CHILD -> Value.CHILD
                TEENAGER -> Value.TEENAGER
                COLLEGE -> Value.COLLEGE
                PHD -> Value.PHD
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangsmithApiInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CHILD -> Known.CHILD
                TEENAGER -> Known.TEENAGER
                COLLEGE -> Known.COLLEGE
                PHD -> Known.PHD
                else -> throw LangsmithApiInvalidDataException("Unknown ReadingLevel: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangsmithApiInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangsmithApiInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): ReadingLevel = apply {
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
            } catch (e: LangsmithApiInvalidDataException) {
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

            return other is ReadingLevel && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PromptCanvasParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PromptCanvasParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
