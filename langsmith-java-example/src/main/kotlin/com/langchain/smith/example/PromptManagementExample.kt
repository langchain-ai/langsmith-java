package com.langchain.smith.example

import com.fasterxml.jackson.databind.ObjectMapper
import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.commits.CommitManifestResponse
import com.langchain.smith.models.commits.CommitRetrieveParams
import com.langchain.smith.models.commits.CommitUpdateParams
import com.langchain.smith.models.repos.RepoCreateParams
import com.langchain.smith.models.repos.RepoListParams
import com.langchain.smith.models.repos.RepoWithLookups

/**
 * Demonstrates how to manage prompts programmatically using the LangSmith Java
 * SDK.
 *
 * This example shows:
 * - Creating prompt repositories (repos)
 * - Adding prompt content as commits (with variables)
 * - Listing prompts with filters
 * - Retrieving prompt content
 * - Pulling specific versions
 *
 * Prerequisites:
 * - `LANGSMITH_API_KEY`: Your LangSmith API key
 * - `LANGSMITH_ENDPOINT` or `LANGCHAIN_ENDPOINT`: LangSmith API URL (https://api.smith.langchain.com)
 *
 * Running:
 * ```bash
 * ./gradlew :langsmith-java-example:run -Pexample=PromptManagement
 * ```
 */
private val MAPPER = ObjectMapper()

fun main() {
    println("=== LangSmith Prompt Management Example ===\n")

    val client = LangsmithOkHttpClient.fromEnv()
    val owner = getOwnerFromEnv()
    val promptName = "joke-generator"

    try {
        // 1. Check if prompt already exists
        println("1. Checking for existing prompt using client.repos().list()...")
        val existing = findPrompt(client, promptName)
        val promptExists = existing.isPresent

        if (promptExists) {
            val repo = existing.get()
            println("2. Prompt '$promptName' already exists")
            println("   View: https://smith.langchain.com/prompts/${repo.fullName()}")
            println("   Skipping creation steps...\n")
        } else {
            println("   ✓ No existing prompt found\n")

            // 2. Create prompt repository (metadata only)
            println("2. Creating prompt repository using client.repos().create()...")
            client.repos()
                .create(
                    RepoCreateParams.builder()
                        .repoHandle(promptName)
                        .description("A joke generator that accepts a topic variable")
                        .isPublic(false)
                        .build()
                )
            println("   ✓ Created prompt repository: $promptName\n")
        }

        // 3. Add prompt content as a commit (only if prompt is new or has no commits)
        val commitCreated = if (!promptExists || !hasLatestCommit(client, promptName, owner)) {
            createCommit(client, promptName, owner, null)
        } else {
            println("3. Prompt already has content, skipping commit creation...")
            println("   To update the prompt, delete it first or modify the content\n")
            false
        }

        // 4. List prompts
        println("4. Listing prompts using client.repos().list()...")
        val allPrompts = client.repos()
            .list(
                RepoListParams.builder()
                    .isPublic(RepoListParams.IsPublic.FALSE)
                    .build()
            )
        println("   ✓ Found ${allPrompts.repos().size} prompt(s) in your organization")

        val jokePrompts = client.repos()
            .list(
                RepoListParams.builder()
                    .query("joke")
                    .isPublic(RepoListParams.IsPublic.FALSE)
                    .build()
            )
        println("   ✓ Found ${jokePrompts.repos().size} prompt(s) matching 'joke' in your organization\n")

        // 5. Pull prompt content (retrieve latest commit)
        println("5. Pulling prompt content using client.commits().retrieve() with commit='latest'...")

        // Retrieve the manifest using "latest" as the commit hash
        val manifestResponse = client.commits()
            .retrieve(
                "latest",
                CommitRetrieveParams.builder()
                    .owner(owner)
                    .repo(promptName)
                    .build()
            )

        println("   ✓ Retrieved latest commit manifest")

        val promptContent = extractPromptContent(manifestResponse._manifest())
        println("   ✓ Prompt content: \"$promptContent\"\n")

        // 6. Demonstrate using the prompt with a value
        println("6. Using the prompt with a value...")
        val filledPrompt = promptContent.replace("{topic}", "dogs")
        println("   Template: \"$promptContent\"")
        println("   Filled:   \"$filledPrompt\"\n")

        // Summary
        println("=== Summary ===")
        if (!promptExists) {
            println("✓ Created prompt repository")
        } else {
            println("ℹ Prompt already existed (skipped creation)")
        }
        if (commitCreated) {
            println("✓ Added prompt content as commit")
        } else {
            println("ℹ Prompt content unchanged (skipped commit)")
        }
        println("✓ Listed and filtered prompts")
        println("✓ Retrieved prompt content")
        println("✓ Demonstrated using prompt with a value")
        println()
        println("Learn more:")
        println("https://docs.langchain.com/langsmith/manage-prompts-programmatically")

    } catch (e: Exception) {
        System.err.println("\nError: ${e.message}")
        e.printStackTrace()
        System.exit(1)
    } finally {
        client.close()
    }
}

/**
 * Creates a chat prompt manifest with multiple messages (system + user) compatible with LangSmith.
 */
class ChatPromptBuilder {
    private val messages = mutableListOf<Message>()
    private val inputVariables = mutableSetOf<String>()

    /**
     * Adds a system message to the prompt.
     */
    fun systemMessage(template: String): ChatPromptBuilder {
        messages.add(Message(MessageType.SYSTEM, template))
        extractVariables(template)
        return this
    }

    /**
     * Adds a user/human message to the prompt.
     */
    fun userMessage(template: String): ChatPromptBuilder {
        messages.add(Message(MessageType.HUMAN, template))
        extractVariables(template)
        return this
    }

    /**
     * Adds an AI/assistant message to the prompt.
     */
    fun aiMessage(template: String): ChatPromptBuilder {
        messages.add(Message(MessageType.AI, template))
        extractVariables(template)
        return this
    }

    /**
     * Explicitly adds input variables (optional - variables are auto-detected from templates).
     */
    fun inputVariables(vararg variables: String): ChatPromptBuilder {
        inputVariables.addAll(variables)
        return this
    }

    /**
     * Builds the prompt manifest compatible with LangSmith.
     * Users don't need to know about the internal structure.
     */
    fun build(): Map<String, Any> {
        if (messages.isEmpty()) {
            throw IllegalStateException("At least one message is required")
        }

        val manifestMessages = messages.map { it.toManifest() }
        val finalInputVariables = if (inputVariables.isEmpty()) {
            // Auto-detect from all messages if not explicitly set
            messages.flatMap { extractVariables(it.template) }.distinct().toTypedArray()
        } else {
            inputVariables.toTypedArray()
        }

        return mapOf(
            "lc" to 1,
            "type" to "constructor",
            "id" to arrayOf("langchain_core", "prompts", "chat", "ChatPromptTemplate"),
            "kwargs" to mapOf(
                "input_variables" to finalInputVariables,
                "messages" to manifestMessages.toTypedArray()
            )
        )
    }

    private fun extractVariables(template: String): Set<String> {
        val regex = Regex("\\{([^}]+)\\}")
        return regex.findAll(template).map { it.groupValues[1] }.toSet()
    }

    private data class Message(val type: MessageType, val template: String) {
        fun toManifest(): Map<String, Any> {
            val className = when (type) {
                MessageType.SYSTEM -> "SystemMessagePromptTemplate"
                MessageType.AI -> "AIMessagePromptTemplate"
                MessageType.HUMAN -> "HumanMessagePromptTemplate"
            }

            val promptTemplate = mapOf(
                "lc" to 1,
                "type" to "constructor",
                "id" to arrayOf("langchain_core", "prompts", "prompt", "PromptTemplate"),
                "kwargs" to mapOf("template" to template)
            )

            return mapOf(
                "lc" to 1,
                "type" to "constructor",
                "id" to arrayOf("langchain_core", "prompts", "chat", className),
                "kwargs" to mapOf("prompt" to promptTemplate)
            )
        }
    }

    private enum class MessageType {
        SYSTEM, HUMAN, AI
    }
}

/**
 * Determines message type from the message object's id field.
 */
@Suppress("UNCHECKED_CAST")
private fun getMessageType(message: Map<String, Any>): String {
    return runCatching {
        val idObj = message["id"]
        val className = when (idObj) {
            is Array<*> -> idObj.lastOrNull()?.toString()
            is List<*> -> idObj.lastOrNull()?.toString()
            else -> null
        }

        when {
            className?.contains("System") == true -> "system"
            className?.contains("AI") == true || className?.contains("Assistant") == true -> "assistant"
            else -> "user"
        }
    }.getOrDefault("user")
}

/**
 * Finds a prompt by exact repo handle match.
 */
private fun findPrompt(client: LangsmithClient, promptName: String): java.util.Optional<RepoWithLookups> {
    val existingRepos = client.repos()
        .list(
            RepoListParams.builder()
                .query(promptName)
                .isPublic(RepoListParams.IsPublic.FALSE)
                .build()
        )

    return existingRepos.repos().stream()
        .filter { it.repoHandle() == promptName }
        .findFirst()
}

/**
 * Checks if a prompt repository has a latest commit.
 */
private fun hasLatestCommit(client: LangsmithClient, promptName: String, owner: String): Boolean {
    return runCatching {
        client.commits().retrieve(
            "latest",
            CommitRetrieveParams.builder()
                .owner(owner)
                .repo(promptName)
                .build()
        )
    }.isSuccess
}

/**
 * Creates a commit with prompt content.
 *
 * @return true if commit was created, false otherwise
 */
private fun createCommit(
    client: LangsmithClient,
    promptName: String,
    owner: String,
    parentCommit: String?
): Boolean {
    println("3. Adding prompt content using client.commits().update()...")
    // Use the builder API - no need to know internal manifest structure
    val manifest = ChatPromptBuilder()
        .systemMessage("You are a helpful assistant that tells jokes.")
        .userMessage("Tell me a joke about {topic}")
        .inputVariables("topic")
        .build()

    val params = CommitUpdateParams.builder()
        .owner(owner)
        .manifest(JsonValue.from(manifest))
        .apply { parentCommit?.let { parentCommit(it) } }
        .build()

    return runCatching {
        client.commits().update(promptName, params)
        println("   ✓ Added prompt content as commit\n")
        true
    }.getOrElse { e ->
        throw RuntimeException("Failed to create commit", e)
    }
}

/**
 * Extracts prompt content from a manifest for display (shows all messages).
 */
@Suppress("UNCHECKED_CAST")
private fun extractPromptContent(manifestJson: JsonValue): String {
    return runCatching {
        val manifest = MAPPER.convertValue(manifestJson, Map::class.java) as Map<String, Any>
        val kwargs = manifest["kwargs"] as Map<String, Any>
        val messagesObj = kwargs["messages"] ?: return "Unable to parse prompt content"

        val messages = when (messagesObj) {
            is Array<*> -> messagesObj
            is List<*> -> messagesObj.toTypedArray()
            else -> return "Unable to parse prompt content"
        }

        messages.mapIndexed { index, messageObj ->
            val message = messageObj as Map<String, Any>
            val msgKwargs = message["kwargs"] as Map<String, Any>
            val prompt = msgKwargs["prompt"] as Map<String, Any>
            val promptKwargs = prompt["kwargs"] as Map<String, Any>
            val template = promptKwargs["template"].toString()
            val messageType = getMessageType(message)
            val prefix = if (index > 0) " | " else ""
            "$prefix$messageType: \"$template\""
        }.joinToString("")
    }.getOrDefault("Unable to parse prompt content")
}

private fun getOwnerFromEnv(): String =
    System.getenv("LANGSMITH_OWNER")?.takeIf { it.isNotEmpty() } ?: "-"

