package com.langchain.smith.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot example: Send OpenTelemetry traces to LangSmith.
 * 
 * Usage:
 *   export LANGSMITH_API_KEY=your_api_key
 *   export LANGSMITH_PROJECT=my-project  # optional, defaults to "default"
 *   ./gradlew :langsmith-java-example:run -Pexample=SpringBootLangSmith
 * 
 * Then make requests to:
 *   http://localhost:8080/api/chat
 *   http://localhost:8080/api/analyze?text=hello
 */
@SpringBootApplication
public class SpringBootLangSmithExample {
    
    public static void main(String[] args) {
        System.out.println("=== Spring Boot + LangSmith OpenTelemetry Example ===\n");
        
        // Check required environment variables
        String apiKey = System.getenv("LANGSMITH_API_KEY");
        if (apiKey == null || apiKey.isEmpty()) {
            System.err.println("ERROR: LANGSMITH_API_KEY environment variable is required!");
            System.err.println("\nUsage:");
            System.err.println("  export LANGSMITH_API_KEY=your_api_key_here");
            System.err.println("  export LANGSMITH_PROJECT=my-project  # optional");
            System.err.println("  ./gradlew :langsmith-java-example:run -Pexample=SpringBootLangSmith");
            System.exit(1);
        }
        
        String projectName = System.getenv("LANGSMITH_PROJECT");
        if (projectName == null || projectName.isEmpty()) {
            projectName = "default";
        }
        
        System.out.println("Configuration:");
        System.out.println("  Project: " + projectName);
        System.out.println("  Endpoint: https://api.smith.langchain.com/otel/v1/traces");
        System.out.println("\nStarting Spring Boot application...");
        System.out.println("Try these endpoints:");
        System.out.println("  POST http://localhost:8080/api/chat");
        System.out.println("  GET  http://localhost:8080/api/analyze?text=hello");
        System.out.println();
        
        SpringApplication.run(SpringBootLangSmithExample.class, args);
    }
}

