package com.langchain.smith.example.prompt;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.langchain.smith.client.LangsmithClient;
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient;
import com.langchain.smith.core.JsonValue;
import com.langchain.smith.models.commits.CommitListParams;
import com.langchain.smith.models.commits.CommitListResponse;
import com.langchain.smith.models.commits.CommitManifestResponse;
import com.langchain.smith.models.commits.CommitRetrieveParams;
import com.langchain.smith.models.commits.CommitUpdateParams;
import com.langchain.smith.models.repos.RepoCreateParams;
import com.langchain.smith.models.repos.RepoListParams;
import com.langchain.smith.models.repos.RepoListResponse;
import com.langchain.smith.models.repos.RepoWithLookups;
import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrates how to manage prompts programmatically using the LangSmith Java
 * SDK.
 *
 * <p>
 * This example shows:
 * - Creating prompt repositories (repos)
 * - Adding prompt content as commits (with variables)
 * - Listing prompts with filters
 * - Retrieving prompt content
 * - Pulling specific versions
 *
 * <p>
 * Prerequisites:
 * - `LANGSMITH_API_KEY`: Your LangSmith API key
 * - `LANGCHAIN_BASE_URL`: LangSmith API URL (https://api.smith.langchain.com)
 *
 * <p>
 * Running:
 * ```bash
 * ./gradlew :langsmith-java-example:run -Pexample=PromptManagement
 * ```
 */
public class PromptManagementExample {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static void main(String[] args) {
        System.out.println("=== LangSmith Prompt Management Example ===\n");

        LangsmithClient client = LangsmithOkHttpClient.fromEnv();
        String owner = getOwnerFromEnv();
        String promptName = "joke-generator";

        try {
            // 1. Check if prompt already exists
            System.out.println("1. Checking for existing prompt using client.repos().list()...");
            RepoWithLookups existing = findPrompt(client, promptName);
            boolean promptExists = existing != null;

            if (promptExists) {
                System.out.println("   ℹ Prompt '" + promptName + "' already exists");
                System.out.println("   View: https://smith.langchain.com/prompts/" + existing.fullName());
                System.out.println("   Skipping creation steps...\n");
            } else {
                System.out.println("   ✓ No existing prompt found\n");

                // 2. Create prompt repository (metadata only)
                System.out.println("2. Creating prompt repository using client.repos().create()...");
                client.repos()
                        .create(RepoCreateParams.builder()
                                .repoHandle(promptName)
                                .description("A joke generator that accepts a topic variable")
                                .isPublic(false)
                                .build());
                System.out.println("   ✓ Created prompt repository: " + promptName + "\n");
            }

            // 3. Add prompt content as a commit (only if prompt is new or has no commits)
            boolean commitCreated = false;
            if (promptExists) {
                String parentCommitHash = getLatestCommitHash(client, promptName, owner);
                if (parentCommitHash != null) {
                    System.out.println("3. Prompt already has content, skipping commit creation...");
                    System.out.println("   ℹ To update the prompt, delete it first or modify the content\n");
                } else {
                    commitCreated = createCommit(client, promptName, owner, null);
                }
            } else {
                commitCreated = createCommit(client, promptName, owner, null);
            }

            // 4. List prompts
            System.out.println("4. Listing prompts using client.repos().list()...");
            RepoListResponse allPrompts = client.repos()
                    .list(RepoListParams.builder()
                            .isPublic(RepoListParams.IsPublic.FALSE)
                            .limit(100L)
                            .build());
            System.out.println("   ✓ Found " + allPrompts.repos().size() + " prompt(s) in your organization");

            RepoListResponse jokePrompts = client.repos()
                    .list(RepoListParams.builder()
                            .query("joke")
                            .isPublic(RepoListParams.IsPublic.FALSE)
                            .limit(100L)
                            .build());
            System.out.println(
                    "   ✓ Found " + jokePrompts.repos().size() + " prompt(s) matching 'joke' in your organization\n");

            // 5. Pull prompt content (retrieve latest commit)
            System.out.println("5. Pulling prompt content using client.commits().list() and retrieve()...");

            String commitHash = getLatestCommitHash(client, promptName, owner);
            if (commitHash == null) {
                throw new RuntimeException("No commits found for prompt");
            }

            System.out.println("   ✓ Latest commit: " + commitHash.substring(0, 8) + "...");

            // Retrieve the manifest
            CommitManifestResponse manifestResponse = client.commits()
                    .retrieve(
                            commitHash,
                            CommitRetrieveParams.builder()
                                    .owner(owner)
                                    .repo(promptName)
                                    .build());

            String promptContent = extractPromptContent(manifestResponse._manifest());
            System.out.println("   ✓ Prompt content: \"" + promptContent + "\"\n");

            // 6. Demonstrate using the prompt with a value
            System.out.println("6. Using the prompt with a value...");
            String filledPrompt = promptContent.replace("{topic}", "dogs");
            System.out.println("   Template: \"" + promptContent + "\"");
            System.out.println("   Filled:   \"" + filledPrompt + "\"\n");

            // Summary
            System.out.println("=== Summary ===");
            if (!promptExists) {
                System.out.println("✓ Created prompt repository");
            } else {
                System.out.println("ℹ Prompt already existed (skipped creation)");
            }
            if (commitCreated) {
                System.out.println("✓ Added prompt content as commit");
            } else {
                System.out.println("ℹ Prompt content unchanged (skipped commit)");
            }
            System.out.println("✓ Listed and filtered prompts");
            System.out.println("✓ Retrieved prompt content");
            System.out.println("✓ Demonstrated using prompt with a value");
            System.out.println();
            System.out.println("Learn more:");
            System.out.println("https://docs.langchain.com/langsmith/manage-prompts-programmatically");

        } catch (Exception e) {
            System.err.println("\nError: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        } finally {
            client.close();
        }
    }

    /**
     * Creates a chat prompt manifest with multiple messages (system + user) compatible with LangSmith.
     */
    private static Map<String, Object> createChatPromptWithMultipleMessages(
            String systemMessage, String userMessage, String[] inputVariables) {
        Map<String, Object> manifest = new HashMap<>();
        manifest.put("lc", 1);
        manifest.put("type", "constructor");
        manifest.put("id", new String[] {"langchain", "prompts", "chat", "ChatPromptTemplate"});

        Map<String, Object> kwargs = new HashMap<>();
        kwargs.put("input_variables", inputVariables);

        java.util.List<Map<String, Object>> messages = new java.util.ArrayList<>();
        messages.add(createMessagePrompt("system", systemMessage));
        messages.add(createMessagePrompt("human", userMessage));

        kwargs.put("messages", messages.toArray());
        manifest.put("kwargs", kwargs);

        return manifest;
    }

    /**
     * Creates a message prompt (system, human, or AI).
     */
    private static Map<String, Object> createMessagePrompt(String messageType, String template) {
        String className;
        switch (messageType.toLowerCase()) {
            case "system":
                className = "SystemMessagePromptTemplate";
                break;
            case "ai":
            case "assistant":
                className = "AIMessagePromptTemplate";
                break;
            case "human":
            case "user":
            default:
                className = "HumanMessagePromptTemplate";
                break;
        }

        Map<String, Object> message = new HashMap<>();
        message.put("lc", 1);
        message.put("type", "constructor");
        message.put("id", new String[] {"langchain", "core", "prompts", "chat", className});

        Map<String, Object> stringPrompt = new HashMap<>();
        stringPrompt.put("lc", 1);
        stringPrompt.put("type", "prompt");
        stringPrompt.put("id", new String[] {"langchain", "prompts", "prompt", "StringPromptTemplate"});
        Map<String, Object> stringPromptKwargs = new HashMap<>();
        stringPromptKwargs.put("template", template);
        stringPrompt.put("kwargs", stringPromptKwargs);

        Map<String, Object> msgKwargs = new HashMap<>();
        msgKwargs.put("prompt", stringPrompt);
        message.put("kwargs", msgKwargs);

        return message;
    }

    /**
     * Determines message type from the message object's id field.
     */
    @SuppressWarnings("unchecked")
    private static String getMessageType(Map<String, Object> message) {
        try {
            Object idObj = message.get("id");
            String className = null;

            if (idObj instanceof Object[]) {
                Object[] idArray = (Object[]) idObj;
                if (idArray.length > 0) {
                    className = idArray[idArray.length - 1].toString();
                }
            } else if (idObj instanceof java.util.List) {
                java.util.List<Object> idList = (java.util.List<Object>) idObj;
                if (!idList.isEmpty()) {
                    className = idList.get(idList.size() - 1).toString();
                }
            }

            if (className != null) {
                if (className.contains("System")) {
                    return "system";
                } else if (className.contains("AI") || className.contains("Assistant")) {
                    return "assistant";
                }
            }
        } catch (Exception e) {
            // Default to "user" if we can't determine the type
        }
        return "user";
    }

    /**
     * Finds a prompt by exact repo handle match.
     *
     * @return the prompt if found, null otherwise
     */
    private static RepoWithLookups findPrompt(LangsmithClient client, String promptName) {
        RepoListResponse existingRepos = client.repos()
                .list(RepoListParams.builder()
                        .query(promptName)
                        .isPublic(RepoListParams.IsPublic.FALSE)
                        .build());

        for (RepoWithLookups repo : existingRepos.repos()) {
            if (repo.repoHandle().equals(promptName)) {
                return repo;
            }
        }
        return null;
    }

    /**
     * Helper method to get the latest commit hash for a prompt repository.
     */
    private static String getLatestCommitHash(LangsmithClient client, String promptName, String owner) {
        try {
            CommitListResponse commits = client.commits()
                    .list(
                            promptName,
                            CommitListParams.builder()
                                    .owner(owner)
                                    .repo(promptName)
                                    .limit(1L)
                                    .build());
            if (!commits.commits().isEmpty()) {
                return commits.commits().get(0).commitHash();
            }
        } catch (Exception e) {
            // No commits found
        }
        return null;
    }

    /**
     * Creates a commit with prompt content.
     *
     * @return true if commit was created, false otherwise
     */
    private static boolean createCommit(LangsmithClient client, String promptName, String owner, String parentCommit) {
        System.out.println("3. Adding prompt content using client.commits().update()...");
        Map<String, Object> manifest = createChatPromptWithMultipleMessages(
                "You are a helpful assistant that tells jokes.",
                "Tell me a joke about {topic}",
                new String[] {"topic"});

        CommitUpdateParams.Builder builder = CommitUpdateParams.builder()
                .owner(owner)
                .manifest(JsonValue.from(manifest));
        if (parentCommit != null) {
            builder.parentCommit(parentCommit);
        }

        try {
            client.commits().update(promptName, builder.build());
            System.out.println("   ✓ Added prompt content as commit\n");
            return true;
        } catch (Exception e) {
            throw new RuntimeException("Failed to create commit", e);
        }
    }

    /**
     * Extracts prompt content from a manifest for display (shows all messages).
     */
    @SuppressWarnings("unchecked")
    private static String extractPromptContent(JsonValue manifestJson) {
        try {
            Map<String, Object> manifest = MAPPER.convertValue(manifestJson, Map.class);
            Map<String, Object> kwargs = (Map<String, Object>) manifest.get("kwargs");
            Object messagesObj = kwargs.get("messages");

            Object[] messages;
            if (messagesObj instanceof Object[]) {
                messages = (Object[]) messagesObj;
            } else if (messagesObj instanceof java.util.List) {
                java.util.List<Object> messagesList = (java.util.List<Object>) messagesObj;
                messages = messagesList.toArray(new Object[0]);
            } else {
                return "Unable to parse prompt content";
            }

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < messages.length; i++) {
                Map<String, Object> message = (Map<String, Object>) messages[i];
                Map<String, Object> msgKwargs = (Map<String, Object>) message.get("kwargs");
                Map<String, Object> prompt = (Map<String, Object>) msgKwargs.get("prompt");
                Map<String, Object> promptKwargs = (Map<String, Object>) prompt.get("kwargs");
                String template = promptKwargs.get("template").toString();
                String messageType = getMessageType(message);

                if (i > 0) {
                    result.append(" | ");
                }
                result.append(messageType).append(": \"").append(template).append("\"");
            }
            return result.toString();
        } catch (Exception e) {
            return "Unable to parse prompt content";
        }
    }

    private static String getOwnerFromEnv() {
        String owner = System.getenv("LANGSMITH_OWNER");
        return (owner == null || owner.isEmpty()) ? "-" : owner;
    }
}
