package com.langchain.smith.prompts

import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.commits.CommitRetrieveResponse

/**
 * Represents a pulled prompt commit from the LangSmith hub.
 *
 * This is the low-level result of calling [PromptClient.pullPromptCommit]. It contains the raw
 * manifest (the LangChain-serialized prompt definition) along with metadata about the commit.
 *
 * Most users should prefer [PromptClient.pull], which returns a [Prompt] that can be invoked
 * directly.
 *
 * @see PromptClient.pull
 * @see PromptClient.pullPromptCommit
 */
class PromptCommit
private constructor(
    /** The repository owner (tenant handle), or "-" for authenticated private repos. */
    val owner: String,
    /** The repository handle (prompt name). */
    val repo: String,
    /** The resolved commit hash. */
    val commitHash: String,
    /** The raw LangChain-serialized prompt manifest. */
    val manifest: JsonValue,
    /** Optional examples associated with this commit. */
    val examples: List<CommitRetrieveResponse.Example>,
) {

    /**
     * Parses the manifest into a [PromptMessages] object.
     *
     * This handles the LangChain serialization format used by LangSmith, supporting
     * `ChatPromptTemplate`, `StructuredPrompt`, and `PromptTemplate` manifests.
     *
     * @return the parsed prompt messages (with optional output schema)
     * @throws IllegalArgumentException if the manifest format is not recognized
     */
    internal fun toMessages(): PromptMessages = ManifestParser.parse(manifest)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PromptCommit) return false
        return owner == other.owner && repo == other.repo && commitHash == other.commitHash
    }

    override fun hashCode(): Int {
        var result = owner.hashCode()
        result = 31 * result + repo.hashCode()
        result = 31 * result + commitHash.hashCode()
        return result
    }

    override fun toString(): String =
        "PromptCommit{owner=$owner, repo=$repo, commitHash=$commitHash}"

    companion object {

        @JvmStatic
        fun of(
            owner: String,
            repo: String,
            commitHash: String,
            manifest: JsonValue,
            examples: List<CommitRetrieveResponse.Example> = emptyList(),
        ): PromptCommit = PromptCommit(owner, repo, commitHash, manifest, examples)
    }
}
