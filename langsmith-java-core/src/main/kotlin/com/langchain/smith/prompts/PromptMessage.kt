package com.langchain.smith.prompts

/**
 * Represents a single message in a prompt template.
 *
 * Each message has a [role] (system, human/user, ai/assistant, tool, or a custom chat role) and a
 * [template] string that may contain `{variable}` placeholders for formatting.
 *
 * For tool messages, [toolCallId] contains the ID of the tool call this is responding to. For chat
 * messages with custom roles, [customRole] contains the role string.
 *
 * @see Prompt
 */
class PromptMessage
internal constructor(
    /** The role of this message. */
    val role: Role,
    /**
     * The template string for this message.
     *
     * May contain variable placeholders that can be substituted via [Prompt.invoke]. The syntax
     * depends on [templateFormat]: f-string uses `{variable}`, mustache uses `{{variable}}`.
     */
    val template: String,
    /**
     * The tool call ID this message is responding to, or `null` for non-tool messages.
     *
     * Only set when [role] is [Role.TOOL].
     */
    val toolCallId: String? = null,
    /**
     * A custom role string for chat messages, or `null` for standard roles.
     *
     * Only set when [role] is [Role.CHAT]. This allows arbitrary role names beyond the standard
     * system/human/ai/tool set.
     */
    val customRole: String? = null,
    /**
     * The template format — `"f-string"` (default) or `"mustache"`.
     *
     * f-string templates use `{variable}` syntax. Mustache templates use `{{variable}}` syntax.
     */
    val templateFormat: String = "f-string",
) {

    /** The role of a prompt message. */
    enum class Role(
        /** The LangChain class name suffix (e.g., "SystemMessagePromptTemplate"). */
        internal val langchainClassName: String,
        /** The role name used by OpenAI (e.g., "system", "user", "assistant"). */
        val openAiRole: String,
    ) {
        /** System message — sets the behavior/context for the assistant. */
        SYSTEM("SystemMessagePromptTemplate", "system"),

        /** Human/user message. */
        HUMAN("HumanMessagePromptTemplate", "user"),

        /** AI/assistant message. */
        AI("AIMessagePromptTemplate", "assistant"),

        /** Tool/function result message. */
        TOOL("ToolMessagePromptTemplate", "tool"),

        /**
         * A chat message with a custom role string.
         *
         * The actual role name is in [PromptMessage.customRole].
         */
        CHAT("ChatMessagePromptTemplate", "user"),

        /**
         * A placeholder for runtime message injection (e.g., chat history).
         *
         * This corresponds to LangChain's `MessagesPlaceholder`. The [PromptMessage.template] field
         * contains the variable name. At invoke time, the variable is looked up and replaced with a
         * `List<PromptMessage>`.
         *
         * Placeholders are not sent to providers — they are expanded before conversion.
         */
        PLACEHOLDER("MessagesPlaceholder", "");

        companion object {

            /**
             * Resolves a [Role] from a LangChain class name (e.g., "SystemMessagePromptTemplate").
             */
            @JvmStatic
            fun fromLangchainClassName(className: String): Role =
                entries.find { className.contains(it.langchainClassName) }
                    ?: entries.find { className.contains(it.name, ignoreCase = true) }
                    ?: HUMAN
        }
    }

    /**
     * Returns the effective OpenAI role string for this message.
     *
     * For [Role.CHAT] messages, returns the [customRole] if set, otherwise falls back to the enum's
     * [Role.openAiRole].
     */
    fun effectiveOpenAiRole(): String = customRole ?: role.openAiRole

    /**
     * Returns `true` if this is a placeholder message (a [MessagesPlaceholder] slot).
     *
     * Placeholder messages are expanded at invoke time — the variable named [template] is looked up
     * and replaced with a list of messages.
     */
    fun isPlaceholder(): Boolean = role == Role.PLACEHOLDER

    /**
     * Formats this message template by substituting variable placeholders with the given values.
     * Values are converted to strings via [Any.toString].
     *
     * The substitution syntax depends on [templateFormat]:
     * - `"f-string"` (default): `{variable}` placeholders
     * - `"mustache"`: `{{variable}}` placeholders
     *
     * Placeholder messages are not formatted (they are expanded separately).
     *
     * @param variables a map from variable name to its value
     * @return the formatted message text
     */
    fun format(variables: Map<String, Any>): String {
        if (isPlaceholder()) return template
        return TemplateFormatter.format(template, variables, templateFormat)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PromptMessage) return false
        return role == other.role &&
            template == other.template &&
            toolCallId == other.toolCallId &&
            customRole == other.customRole &&
            templateFormat == other.templateFormat
    }

    override fun hashCode(): Int {
        var result = role.hashCode()
        result = 31 * result + template.hashCode()
        result = 31 * result + (toolCallId?.hashCode() ?: 0)
        result = 31 * result + (customRole?.hashCode() ?: 0)
        result = 31 * result + templateFormat.hashCode()
        return result
    }

    override fun toString(): String {
        val roleName = customRole ?: role.name.lowercase()
        val extras = buildList {
            if (toolCallId != null) add("toolCallId=$toolCallId")
            if (templateFormat != "f-string") add("templateFormat=$templateFormat")
        }
        val suffix = if (extras.isNotEmpty()) " (${extras.joinToString()})" else ""
        return "$roleName: \"$template\"$suffix"
    }

    companion object {

        /** Creates a system message with the given template. */
        @JvmStatic
        fun system(template: String): PromptMessage = PromptMessage(Role.SYSTEM, template)

        /** Creates a human/user message with the given template. */
        @JvmStatic fun human(template: String): PromptMessage = PromptMessage(Role.HUMAN, template)

        /** Creates an AI/assistant message with the given template. */
        @JvmStatic fun ai(template: String): PromptMessage = PromptMessage(Role.AI, template)

        /**
         * Creates a tool result message.
         *
         * @param template the tool result content (or template with variables)
         * @param toolCallId the ID of the tool call this is responding to
         */
        @JvmStatic
        fun tool(template: String, toolCallId: String): PromptMessage =
            PromptMessage(Role.TOOL, template, toolCallId = toolCallId)

        /**
         * Creates a chat message with a custom role string.
         *
         * Use this for roles beyond the standard system/human/ai/tool set.
         *
         * @param template the message content (or template with variables)
         * @param role the custom role string (e.g., "moderator", "narrator")
         */
        @JvmStatic
        fun chat(template: String, role: String): PromptMessage =
            PromptMessage(Role.CHAT, template, customRole = role)

        /**
         * Creates a messages placeholder.
         *
         * At invoke time, the variable named [variableName] should be a `List<PromptMessage>` that
         * replaces this placeholder in the message list.
         *
         * @param variableName the variable name to look up at invoke time
         */
        @JvmStatic
        fun placeholder(variableName: String): PromptMessage =
            PromptMessage(Role.PLACEHOLDER, variableName)

        /** Creates a message with the given role and template. */
        @JvmStatic
        fun of(role: Role, template: String): PromptMessage = PromptMessage(role, template)

        /**
         * Creates a copy of the given message with a new template string, preserving [toolCallId],
         * [customRole], and [templateFormat].
         */
        @JvmStatic
        internal fun withTemplate(source: PromptMessage, newTemplate: String): PromptMessage =
            PromptMessage(
                source.role,
                newTemplate,
                source.toolCallId,
                source.customRole,
                source.templateFormat,
            )
    }
}
