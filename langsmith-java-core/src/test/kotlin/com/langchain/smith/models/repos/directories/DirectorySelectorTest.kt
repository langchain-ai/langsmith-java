// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos.directories

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.errors.LangChainInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class DirectorySelectorTest {

    @Test
    fun ofLatest() {
        val directorySelector = DirectorySelector.ofLatest()

        assertThat(directorySelector.latest()).contains(JsonValue.from(mapOf("type" to "LATEST")))
        assertThat(directorySelector.commit()).isEmpty
    }

    @Test
    fun ofLatestRoundtrip() {
        val jsonMapper = jsonMapper()
        val directorySelector = DirectorySelector.ofLatest()

        val roundtrippedDirectorySelector =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(directorySelector),
                jacksonTypeRef<DirectorySelector>(),
            )

        assertThat(roundtrippedDirectorySelector).isEqualTo(directorySelector)
    }

    @Test
    fun ofCommit() {
        val commit =
            DirectorySelector.Commit.builder()
                .commitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val directorySelector = DirectorySelector.ofCommit(commit)

        assertThat(directorySelector.latest()).isEmpty
        assertThat(directorySelector.commit()).contains(commit)
    }

    @Test
    fun ofCommitRoundtrip() {
        val jsonMapper = jsonMapper()
        val directorySelector =
            DirectorySelector.ofCommit(
                DirectorySelector.Commit.builder()
                    .commitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val roundtrippedDirectorySelector =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(directorySelector),
                jacksonTypeRef<DirectorySelector>(),
            )

        assertThat(roundtrippedDirectorySelector).isEqualTo(directorySelector)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val directorySelector =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<DirectorySelector>())

        val e = assertThrows<LangChainInvalidDataException> { directorySelector.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
