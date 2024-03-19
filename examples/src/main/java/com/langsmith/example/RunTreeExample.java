package com.langsmith.example;

import com.langsmith.api.client.LangSmithClientAsync;
import com.langsmith.api.client.okhttp.LangSmithOkHttpClientAsync;
import com.langsmith.runtree.RunTree;
import com.langsmith.runtree.RunTreeConfigBuilder;

import java.util.Map;

public class RunTreeExample {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        LangSmithClientAsync client = LangSmithOkHttpClientAsync.fromEnv();

        // Create a RunTreeConfig object
        var builder = new RunTreeConfigBuilder();
        builder.setName("Test Run");
        builder.setRunType("llm");
        builder.setInputs(Map.of("input", "Testing!"));
        var config = builder.build();

        // Create a RunTree object
        RunTree runTree = new RunTree(config);

        var childBuilder = new RunTreeConfigBuilder();
        childBuilder.setName("Test Child Run");
        childBuilder.setInputs(Map.of("input", "Test2!"));
        var childConfig = childBuilder.build();

        // Time it
        var startTime = System.currentTimeMillis();

        // Using TLS
        RunTree childTree = RunTree.fromCurrentSpan(childConfig);
        var parentFuture = runTree.postRunAsync();
        parentFuture.join();
//        var endTime = System.currentTimeMillis();
//        var elapsedTime = endTime - startTime;
//        System.out.println("Post1 elapsed time: " + elapsedTime + " milliseconds");
//        var childFuture = childTree.postRunAsync();
//        endTime = System.currentTimeMillis();
//        elapsedTime = endTime - startTime;
//        System.out.println("Post2  time: " + elapsedTime + " milliseconds");
//        var childEndFuture = childTree.endAsync(Map.of("output", "Test Output"), null, null);
//        endTime = System.currentTimeMillis();
//        elapsedTime = endTime - startTime;
//        var endTime = System.currentTimeMillis();
//        var elapsedTime = endTime - startTime;
//        System.out.println("Post1 elapsed time: " + elapsedTime + " milliseconds");
//        var childFuture = childTree.postRunAsync(true);
//        endTime = System.currentTimeMillis();
//        elapsedTime = endTime - startTime;
//        System.out.println("Post2  time: " + elapsedTime + " milliseconds");
//        var childEndFuture = childTree.endAsync(Map.of("output", "Test Output"), null, null);
//        endTime = System.currentTimeMillis();
//        elapsedTime = endTime - startTime;
//        System.out.println("End1 elapsed  time: " + elapsedTime + " milliseconds");
//        var parentEndFuture = runTree.endAsync(Map.of("output", "Test Output Parent"), null, null);
//        endTime = System.currentTimeMillis();
//        elapsedTime = endTime - startTime;
//        System.out.println("End parent elapsed  time: " + elapsedTime + " milliseconds");
//
//        // Calculate elapsed time
//        endTime = System.currentTimeMillis();
//        elapsedTime = endTime - startTime;
//        System.out.println("Total lapsed time: " + elapsedTime + " milliseconds");
    }
}
