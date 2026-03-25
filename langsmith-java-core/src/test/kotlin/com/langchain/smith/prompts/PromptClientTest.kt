package com.langchain.smith.prompts

import java.util.stream.Stream
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

internal class PromptClientTest {

    data class Case(val identifier: String, val owner: String, val repo: String, val commit: String)

    data class ErrorCase(val identifier: String, val expectedMessage: String)

    @ParameterizedTest(name = "{index}: \"{0}\"")
    @MethodSource("parsePromptIdentifierCases")
    fun parsePromptIdentifier(case: Case) {
        val result = PromptClient.parsePromptIdentifier(case.identifier)

        assertThat(result.owner).isEqualTo(case.owner)
        assertThat(result.repo).isEqualTo(case.repo)
        assertThat(result.commit).isEqualTo(case.commit)
    }

    @ParameterizedTest(name = "{index}: \"{0}\"")
    @MethodSource("parsePromptIdentifierErrorCases")
    fun parsePromptIdentifier_throws(case: ErrorCase) {
        assertThatThrownBy { PromptClient.parsePromptIdentifier(case.identifier) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining(case.expectedMessage)
    }

    companion object {

        @JvmStatic
        fun parsePromptIdentifierCases(): Stream<Case> =
            Stream.of(
                Case("joke-generator", "-", "joke-generator", "latest"),
                Case("my-org/joke-generator", "my-org", "joke-generator", "latest"),
                Case("joke-generator:abc123", "-", "joke-generator", "abc123"),
                Case("my-org/joke-generator:abc123def", "my-org", "joke-generator", "abc123def"),
                Case("my-org/joke-generator:latest", "my-org", "joke-generator", "latest"),
                Case("  my-org/joke-generator  ", "my-org", "joke-generator", "latest"),
            )

        @JvmStatic
        fun parsePromptIdentifierErrorCases(): Stream<ErrorCase> =
            Stream.of(
                ErrorCase("", "must not be blank"),
                ErrorCase("name:", "must not be blank"),
                ErrorCase("/name", "Owner must not be blank"),
                ErrorCase("owner/", "Repo name must not be blank"),
                ErrorCase("a/b/c", "at most one '/'"),
            )
    }
}
