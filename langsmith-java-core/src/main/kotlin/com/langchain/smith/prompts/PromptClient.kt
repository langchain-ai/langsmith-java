package com.langchain.smith.prompts

import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.models.commits.CommitRetrieveParams

/**
 * A high-level client for pulling prompts from the LangSmith hub.
 *
 * This wraps the lower-level [LangsmithClient.commits] service and provides a convenient interface
 * that mirrors the Python and TypeScript SDKs' prompt pulling experience.
 *
 * ## Quick start (Java)
 *
 * ```java
 * import com.langchain.smith.client.okhttp.LangsmithOkHttpClient;
 * import com.langchain.smith.prompts.PromptClient;
 * import static com.langchain.smith.prompts.PromptConverters.convertToOpenAIParams;
 * import static com.langchain.smith.prompts.PromptConverters.convertToAnthropicParams;
 *
 * LangsmithClient client = LangsmithOkHttpClient.fromEnv();
 * PromptClient promptClient = PromptClient.create(client);
 * Prompt prompt = promptClient.pull("my-org/joke-generator");
 * PromptValue formattedPrompt = prompt.invoke(Map.of("topic", "cats"));
 *
 * ChatCompletion completion = openai.chat().completions().create(
 *     convertToOpenAIParams(formattedPrompt)
 *         .model(ChatModel.GPT_4_1_MINI)
 *         .build());
 * ```
 *
 * ## Prompt identifier format
 *
 * The prompt identifier can be in any of these formats:
 * - `"name"` — uses the default owner (`"-"`) and latest commit
 * - `"owner/name"` — specifies the owner
 * - `"name:commit_or_tag"` — specifies a commit hash or tag
 * - `"owner/name:commit_or_tag"` — specifies both owner and commit/tag
 *
 * @see Prompt
 * @see PromptValue
 * @see convertToOpenAIParams
 * @see convertToAnthropicParams
 */
class PromptClient private constructor(private val client: LangsmithClient) {

    /**
     * Pulls a prompt from the LangSmith hub and returns a [Prompt] that can be invoked with input
     * variables.
     *
     * This is the primary method for working with prompts. The returned [Prompt] has an
     * [invoke][Prompt.invoke] method that formats the prompt with variable values, producing a
     * [PromptValue] that can be converted to provider-specific formats using
     * [convertToOpenAIParams] or [convertToAnthropicParams].
     *
     * ```java
     * Prompt prompt = promptClient.pull("my-org/joke-generator");
     * PromptValue formatted = prompt.invoke(Map.of("topic", "cats"));
     * ChatCompletion completion = openai.chat().completions().create(
     *     convertToOpenAIParams(formatted).model(ChatModel.GPT_4_1_MINI).build());
     * ```
     *
     * @param promptIdentifier the prompt identifier (e.g., `"owner/name"`, `"name"`,
     *   `"owner/name:commit_hash"`)
     * @param includeModel whether to include model configuration in the response
     * @return a [Prompt] that can be invoked with variables
     */
    @JvmOverloads
    fun pull(promptIdentifier: String, includeModel: Boolean = false): Prompt {
        val commit = pullPromptCommit(promptIdentifier, includeModel)
        return Prompt.fromCommit(commit)
    }

    /**
     * Pulls the raw prompt commit from the LangSmith hub.
     *
     * This is the lower-level method that returns the raw [PromptCommit] with the manifest JSON and
     * commit metadata. Most users should prefer [pull] instead.
     *
     * @param promptIdentifier the prompt identifier (e.g., `"owner/name"`, `"name"`,
     *   `"owner/name:commit_hash"`)
     * @param includeModel whether to include model configuration in the response
     * @return the raw prompt commit
     */
    @JvmOverloads
    fun pullPromptCommit(promptIdentifier: String, includeModel: Boolean = false): PromptCommit {
        val (owner, repo, commit) = parsePromptIdentifier(promptIdentifier)

        val params =
            CommitRetrieveParams.builder()
                .owner(owner)
                .repo(repo)
                .commit(commit)
                .includeModel(includeModel)
                .build()

        val response = client.commits().retrieve(params)

        return PromptCommit.of(
            owner = owner,
            repo = repo,
            commitHash = response.commitHash().orElse(commit),
            manifest = response._manifest(),
            examples = response.examples().orElse(emptyList()),
        )
    }

    companion object {

        /**
         * Creates a [PromptClient] wrapping the given [LangsmithClient].
         *
         * @param client the LangSmith API client
         * @return a new prompt client
         */
        @JvmStatic fun create(client: LangsmithClient): PromptClient = PromptClient(client)

        /**
         * Parses a prompt identifier string into its component parts.
         *
         * Supported formats:
         * - `"name"` → `("-", "name", "latest")`
         * - `"owner/name"` → `("owner", "name", "latest")`
         * - `"name:commit"` → `("-", "name", "commit")`
         * - `"owner/name:commit"` → `("owner", "name", "commit")`
         *
         * @param identifier the prompt identifier string
         * @return a [PromptIdentifier] with owner, repo, and commit fields
         * @throws IllegalArgumentException if the identifier is blank or has an invalid format
         */
        @JvmStatic
        fun parsePromptIdentifier(identifier: String): PromptIdentifier {
            require(identifier.isNotBlank()) { "Prompt identifier must not be blank" }

            val trimmed = identifier.trim()

            // Split off commit/tag from the end (after ':')
            val (nameAndOwner, commit) =
                if (':' in trimmed) {
                    val colonIdx = trimmed.lastIndexOf(':')
                    val namePart = trimmed.substring(0, colonIdx)
                    val commitPart = trimmed.substring(colonIdx + 1)
                    require(commitPart.isNotBlank()) {
                        "Commit/tag after ':' must not be blank in identifier: $identifier"
                    }
                    namePart to commitPart
                } else {
                    trimmed to "latest"
                }

            // Split owner and repo name (on '/')
            val (owner, repo) =
                if ('/' in nameAndOwner) {
                    val slashIdx = nameAndOwner.indexOf('/')
                    val ownerPart = nameAndOwner.substring(0, slashIdx)
                    val repoPart = nameAndOwner.substring(slashIdx + 1)
                    require(ownerPart.isNotBlank()) {
                        "Owner must not be blank in identifier: $identifier"
                    }
                    require(repoPart.isNotBlank()) {
                        "Repo name must not be blank in identifier: $identifier"
                    }
                    require('/' !in repoPart) {
                        "Identifier must have at most one '/' separator: $identifier"
                    }
                    ownerPart to repoPart
                } else {
                    "-" to nameAndOwner
                }

            return PromptIdentifier(owner, repo, commit)
        }
    }
}

/**
 * The parsed components of a prompt identifier string.
 *
 * @property owner the repository owner (tenant handle), or `"-"` for private repos
 * @property repo the repository handle (prompt name)
 * @property commit the commit hash, tag, or `"latest"`
 */
data class PromptIdentifier(val owner: String, val repo: String, val commit: String)
