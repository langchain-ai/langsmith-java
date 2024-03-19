package com.langsmith.example;

import com.langsmith.runtree.RunTree;
import com.langsmith.runtree.RunTreeConfigBuilder;
import com.theokanning.openai.service.OpenAiService;
import com.theokanning.openai.completion.chat.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OpenAiExample {
    public static void main(String[] args) {
        String apiKey = System.getenv("OPENAI_API_KEY");
        OpenAiService service = new OpenAiService(apiKey);

        String question = "Can you summarize this morning's meetings?";

        // Create a top-level run
        RunTreeConfigBuilder pipelineConfigBuilder = new RunTreeConfigBuilder()
                .setName("Chat Pipeline")
                .setRunType("chain")
                .setInputs(Collections.singletonMap("question", question));

        RunTree pipeline = new RunTree(pipelineConfigBuilder.build());

        var context = "During this morning's meeting, we solved all world conflict.";

        List<ChatMessage> messages = new ArrayList<>();
        var systemMessage = new ChatMessage(ChatMessageRole.SYSTEM.value(), "You are a helpful assistant. Please respond to the user's request only based on the given context.");
        messages.add(systemMessage);
        var userMessage = new ChatMessage(ChatMessageRole.USER.value(), "Question: " + question + "\nContext: " + context);
        messages.add(userMessage);

        var completionRequest = ChatCompletionRequest
                .builder()
                .model("gpt-3.5-turbo")
                .messages(messages)
                .build();

        // Create a child run
        RunTreeConfigBuilder childConfigBuilder = new RunTreeConfigBuilder()
                .setName("OpenAI Call")
                .setRunType("llm")
                .setInputs(Collections.singletonMap("messages", messages))
                .setParentRun(pipeline);

        RunTree childTree = pipeline.createChild(childConfigBuilder.build());

        ChatMessage responseMessage = service.createChatCompletion(completionRequest).getChoices().get(0).getMessage();
        System.out.println("Response: " + responseMessage.getContent());

        // End the child run
        childTree.end(Collections.singletonMap("response", responseMessage), null, null);

        // End the parent run
        pipeline.end(Collections.singletonMap("response", responseMessage.getContent()), null, null);
        childTree.postRunAsync().join();
        pipeline.postRunAsync().join();
    }
}
