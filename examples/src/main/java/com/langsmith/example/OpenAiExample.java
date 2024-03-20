package com.langsmith.example;

import com.langsmith.runtree.EndOptions;
import com.langsmith.runtree.RunTree;
import com.langsmith.runtree.RunTreeConfig;
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
        RunTreeConfig pipelineConfig = RunTreeConfig
                .builder()
                .setName("Chat Pipeline")
                .setRunType("chain")
                .setInputs(Collections.singletonMap("question", question))
                .build();

        RunTree pipeline = new RunTree(pipelineConfig);

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
        RunTreeConfig childConfig = RunTreeConfig
                .builder()
                .setName("OpenAI Call")
                .setRunType("llm")
                .setInputs(Collections.singletonMap("messages", messages))
                .setParentRun(pipeline)
                .build();

        RunTree childTree = pipeline.createChild(childConfig);

        ChatMessage responseMessage = service.createChatCompletion(completionRequest).getChoices().get(0).getMessage();
        System.out.println("Response: " + responseMessage.getContent());

        // End the child run
        childTree.end(EndOptions
                .builder()
                .setOutputs(Collections.singletonMap("response", responseMessage))
                .build());

        // End the parent run
        pipeline.end(EndOptions
                .builder()
                .setOutputs(Collections.singletonMap("response", responseMessage.getContent()))
                .build());
        childTree.postRunAsync().join();
        pipeline.postRunAsync().join();
    }
}
