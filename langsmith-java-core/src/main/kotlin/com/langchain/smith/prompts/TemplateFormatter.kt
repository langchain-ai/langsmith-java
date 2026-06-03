package com.langchain.smith.prompts

import com.samskivert.mustache.Mustache

/**
 * Formats prompt template strings using either f-string or mustache syntax.
 *
 * LangChain prompts support two template formats:
 * - **f-string** (default): Uses `{variable}` placeholders — e.g., `"Hello {name}"`
 * - **mustache**: Uses `{{variable}}` placeholders — e.g., `"Hello {{name}}"`
 *
 * The format is specified per-template in the LangChain manifest via the `template_format` field.
 */
internal object TemplateFormatter {

    /**
     * Matches f-string tokens: escaped braces (`{{`, `}}`) or variable placeholders (`{name}`).
     * Escaped braces are matched first so they aren't treated as variables.
     */
    private val F_STRING_PATTERN = Regex("\\{\\{|\\}\\}|\\{([^}]+)\\}")

    /** The jmustache compiler, configured to not HTML-escape values. */
    private val MUSTACHE_COMPILER: Mustache.Compiler =
        Mustache.compiler().escapeHTML(false).defaultValue("")

    /**
     * Formats a template string by substituting variables.
     *
     * @param template the template string
     * @param variables the variable values to substitute
     * @param templateFormat the template format — `"f-string"` (default) or `"mustache"`
     * @return the formatted string
     */
    fun format(
        template: String,
        variables: Map<String, Any>,
        templateFormat: String = "f-string",
    ): String =
        when (templateFormat) {
            "mustache" -> formatMustache(template, variables)
            else -> formatFString(template, variables)
        }

    /**
     * Formats an f-string template. Handles:
     * - `{variable}` — substituted from the variables map
     * - `{{` — literal `{`
     * - `}}` — literal `}`
     *
     * Uses single-pass regex replacement to avoid cascading substitutions.
     */
    private fun formatFString(template: String, variables: Map<String, Any>): String =
        F_STRING_PATTERN.replace(template) { match ->
            when (match.value) {
                "{{" -> "{"
                "}}" -> "}"
                else -> {
                    val key = match.groupValues[1]
                    variables[key]?.toString() ?: match.value
                }
            }
        }

    /** Formats a mustache template using jmustache. */
    private fun formatMustache(template: String, variables: Map<String, Any>): String =
        MUSTACHE_COMPILER.compile(template).execute(variables)
}
