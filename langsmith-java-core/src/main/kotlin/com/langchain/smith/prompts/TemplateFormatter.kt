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

    /** Matches `{variable_name}` placeholders in f-string templates. */
    private val F_STRING_PATTERN = Regex("\\{([^}]+)\\}")

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
     * Formats an f-string template. Uses single-pass regex replacement to avoid cascading
     * substitutions (e.g., if a value itself contains `{other_var}`).
     */
    private fun formatFString(template: String, variables: Map<String, Any>): String =
        F_STRING_PATTERN.replace(template) { match ->
            val key = match.groupValues[1]
            val value = variables[key]
            value?.toString() ?: match.value
        }

    /** Formats a mustache template using jmustache. */
    private fun formatMustache(template: String, variables: Map<String, Any>): String =
        MUSTACHE_COMPILER.compile(template).execute(variables)
}
