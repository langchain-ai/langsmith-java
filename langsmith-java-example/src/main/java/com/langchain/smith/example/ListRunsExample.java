package com.langchain.smith.example;

import com.langchain.smith.client.LangsmithClient;
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient;
import com.langchain.smith.models.runs.RunQueryParams;
import com.langchain.smith.models.runs.RunQueryResponse;

public class ListRunsExample {
    public static void main(String[] args) {
        // Configure client from environment variables
        // Requires: LANGSMITH_API_KEY and LANGSMITH_BASE_URL
        LangsmithClient client = LangsmithOkHttpClient.fromEnv();

        // Get project ID from environment variable or use a default
        // You can find your project ID in the LangSmith UI under Settings
        String projectId = System.getenv("LANGSMITH_PROJECT_ID");

        if (projectId == null || projectId.isEmpty()) {
            System.err.println("Error: LANGSMITH_PROJECT_ID environment variable is required");
            System.err.println("You can find your project ID in the LangSmith UI under Settings");
            System.exit(1);
        }

        // Create query parameters
        // The API requires at least one filter (session, id, parent_run, trace, or reference_example)
        // This example queries runs for a specific project/session
        RunQueryParams params = RunQueryParams.builder()
                .addSession(projectId) // Filter by project/session ID
                .limit(10L) // Limit to 10 runs
                .build();

        // Query runs
        RunQueryResponse response = client.runs().query(params);

        // Print runs
        System.out.println("Found " + response.runs().size() + " runs:");
        for (RunQueryResponse.Run run : response.runs()) {
            System.out.println("Run ID: " + run.id());
            System.out.println("Run Name: " + run.name());
            System.out.println("---");
        }
    }
}
