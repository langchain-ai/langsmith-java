package com.langchain.smith.prompts

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

internal class PromptClientTest {

    @Test
    fun parsePromptIdentifier_nameOnly() {
        val result = PromptClient.parsePromptIdentifier("joke-generator")
        assertThat(result.owner).isEqualTo("-")
        assertThat(result.repo).isEqualTo("joke-generator")
        assertThat(result.commit).isEqualTo("latest")
    }

    @Test
    fun parsePromptIdentifier_ownerAndName() {
        val result = PromptClient.parsePromptIdentifier("my-org/joke-generator")
        assertThat(result.owner).isEqualTo("my-org")
        assertThat(result.repo).isEqualTo("joke-generator")
        assertThat(result.commit).isEqualTo("latest")
    }

    @Test
    fun parsePromptIdentifier_nameAndCommit() {
        val result = PromptClient.parsePromptIdentifier("joke-generator:abc123")
        assertThat(result.owner).isEqualTo("-")
        assertThat(result.repo).isEqualTo("joke-generator")
        assertThat(result.commit).isEqualTo("abc123")
    }

    @Test
    fun parsePromptIdentifier_ownerNameAndCommit() {
        val result = PromptClient.parsePromptIdentifier("my-org/joke-generator:abc123def")
        assertThat(result.owner).isEqualTo("my-org")
        assertThat(result.repo).isEqualTo("joke-generator")
        assertThat(result.commit).isEqualTo("abc123def")
    }

    @Test
    fun parsePromptIdentifier_latestExplicit() {
        val result = PromptClient.parsePromptIdentifier("my-org/joke-generator:latest")
        assertThat(result.owner).isEqualTo("my-org")
        assertThat(result.repo).isEqualTo("joke-generator")
        assertThat(result.commit).isEqualTo("latest")
    }

    @Test
    fun parsePromptIdentifier_trimmed() {
        val result = PromptClient.parsePromptIdentifier("  my-org/joke-generator  ")
        assertThat(result.owner).isEqualTo("my-org")
        assertThat(result.repo).isEqualTo("joke-generator")
        assertThat(result.commit).isEqualTo("latest")
    }

    @Test
    fun parsePromptIdentifier_blankThrows() {
        assertThatThrownBy { PromptClient.parsePromptIdentifier("") }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("must not be blank")
    }

    @Test
    fun parsePromptIdentifier_blankCommitThrows() {
        assertThatThrownBy { PromptClient.parsePromptIdentifier("name:") }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("must not be blank")
    }

    @Test
    fun parsePromptIdentifier_blankOwnerThrows() {
        assertThatThrownBy { PromptClient.parsePromptIdentifier("/name") }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("Owner must not be blank")
    }

    @Test
    fun parsePromptIdentifier_blankRepoThrows() {
        assertThatThrownBy { PromptClient.parsePromptIdentifier("owner/") }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("Repo name must not be blank")
    }

    @Test
    fun parsePromptIdentifier_multipleSlashesThrows() {
        assertThatThrownBy { PromptClient.parsePromptIdentifier("a/b/c") }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("at most one '/'")
    }
}
