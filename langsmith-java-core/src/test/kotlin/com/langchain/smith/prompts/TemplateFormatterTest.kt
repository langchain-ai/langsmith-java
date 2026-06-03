package com.langchain.smith.prompts

import java.util.stream.Stream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

internal class TemplateFormatterTest {

    data class Case(
        val description: String,
        val template: String,
        val variables: Map<String, Any>,
        val format: String = "f-string",
        val expected: String,
    ) {
        override fun toString(): String = description
    }

    @ParameterizedTest(name = "{index}: {0}")
    @MethodSource("cases")
    fun format(case: Case) {
        val result = TemplateFormatter.format(case.template, case.variables, case.format)
        assertThat(result).isEqualTo(case.expected)
    }

    companion object {

        @JvmStatic
        fun cases(): Stream<Case> =
            Stream.of(
                // f-string
                Case(
                    "f-string: basic substitution",
                    "Hello {name}!",
                    mapOf("name" to "Alice"),
                    expected = "Hello Alice!",
                ),
                Case(
                    "f-string: multiple variables",
                    "{a} and {b}",
                    mapOf("a" to "X", "b" to "Y"),
                    expected = "X and Y",
                ),
                Case(
                    "f-string: missing variable left as-is",
                    "Hello {name}!",
                    mapOf(),
                    expected = "Hello {name}!",
                ),
                Case(
                    "f-string: escaped braces",
                    "Use {{braces}} here",
                    mapOf(),
                    expected = "Use {braces} here",
                ),
                Case(
                    "f-string: escaped and variable mixed",
                    "{{literal}} and {var}",
                    mapOf("var" to "value"),
                    expected = "{literal} and value",
                ),
                Case(
                    "f-string: no cascading substitution",
                    "{a}",
                    mapOf("a" to "{b}", "b" to "WRONG"),
                    expected = "{b}",
                ),
                Case("f-string: empty template", "", mapOf("x" to "y"), expected = ""),
                Case(
                    "f-string: non-string values",
                    "{n} is {b}",
                    mapOf("n" to 42, "b" to true),
                    expected = "42 is true",
                ),
                // mustache
                Case(
                    "mustache: basic substitution",
                    "Hello {{name}}!",
                    mapOf("name" to "Alice"),
                    "mustache",
                    "Hello Alice!",
                ),
                Case(
                    "mustache: missing variable becomes empty",
                    "Hello {{name}}!",
                    mapOf(),
                    "mustache",
                    "Hello !",
                ),
                Case(
                    "mustache: no HTML escaping",
                    "{{html}}",
                    mapOf("html" to "<b>bold</b>"),
                    "mustache",
                    "<b>bold</b>",
                ),
                Case("mustache: empty template", "", mapOf("x" to "y"), "mustache", ""),
            )
    }
}
