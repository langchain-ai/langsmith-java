package com.langchain.smith.prompts

/**
 * Represents a single message in a prompt template.
 *
 * Each message has a [role] (system, human/user, ai/assistant) and a [template] string
 * that may contain `{variable}` placeholders for formatting.
 *
 * @see PromptMessages
 */
class PromptMessage
private constructor(
    /** The role of this message (e.g., "system", "human", "ai"). */
    val role: Role,
    /**
     * The template string for this message.
     *
     * May contain `{variable_name}` placeholders that can be substituted
     * using [PromptMessages.format].
     */
    val template: String,
) {

    // TODO: Support Tool, MessagesPlaceholder, and Chat messages
    /** The role of a prompt message. */
    enum class Role(
        /** The LangChain class name suffix (e.g., "SystemMessagePromptTemplate"). */
        internal val langchainClassName: String,
        /** The role name used by OpenAI (e.g., "system", "user", "assistant"). */
        val openAiRole: String,
        /** The role name used by Anthropic (e.g., "user", "assistant"). */
        val anthropicRole: String,
    ) {
        /** System message — sets the behavior/context for the assistant. */
        SYSTEM("SystemMessagePromptTemplate", "system", "user"),

        /** Human/user message. */
        HUMAN("HumanMessagePromptTemplate", "user", "user"),

        /** AI/assistant message. */
        AI("AIMessagePromptTemplate", "assistant", "assistant");

        companion object {

            /**
             * Resolves a [Role] from a LangChain class name (e.g.,
             * "SystemMessagePromptTemplate").
             */
            @JvmStatic
            fun fromLangchainClassName(className: String): Role =
                entries.find { className.contains(it.langchainClassName) }
                    ?: entries.find { className.contains(it.name, ignoreCase = true) }
                    ?: HUMAN
        }
    }

    /**
     * Formats this message template by substituting `{variable}` placeholders with the
     * given values. Values are converted to strings via [Any.toString].
     *
     * @param variables a map from variable name to its value
     * @return the formatted message text
     */
    fun format(variables: Map<String, Any>): String {
        var result = template
        for ((key, value) in variables) {
            result = result.replace("{$key}", value.toString())
        }
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PromptMessage) return false
        return role == other.role && template == other.template
    }

    override fun hashCode(): Int = 31 * role.hashCode() + template.hashCode()

    override fun toString(): String = "PromptMessage{role=$role, template=$template}"

    companion object {

        /** Creates a system message with the given template. */
        @JvmStatic
        fun system(template: String): PromptMessage = PromptMessage(Role.SYSTEM, template)

        /** Creates a human/user message with the given template. */
        @JvmStatic
        fun human(template: String): PromptMessage = PromptMessage(Role.HUMAN, template)

        /** Creates an AI/assistant message with the given template. */
        @JvmStatic
        fun ai(template: String): PromptMessage = PromptMessage(Role.AI, template)

        /** Creates a message with the given role and template. */
        @JvmStatic
        fun of(role: Role, template: String): PromptMessage = PromptMessage(role, template)
    }
}
