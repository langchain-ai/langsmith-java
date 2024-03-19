package com.langsmith.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.langsmith.api.client.LangSmithClient;
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient;
import com.langsmith.api.models.RunCreateParams;
import com.langsmith.api.models.RunUpdateParams;
import com.langsmith.api.core.JsonValue;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public class TestClient {
        private static final ObjectMapper objectMapper = new ObjectMapper();

        public static void main(String[] args) {
                System.out.println("Hello, World!");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
                String startTime = LocalDateTime.now(ZoneOffset.UTC).format(formatter);
                String endTime = LocalDateTime.now(ZoneOffset.UTC).plusMinutes(1).format(formatter);
                LangSmithClient client = LangSmithOkHttpClient.fromEnv();
                // Retrieve works (phew
                var runId = UUID.randomUUID().toString();
                System.out.println("Run ID: " + runId);
                Map<String, Object> additionalProperties = Map.of(
                                "run_type", "chain",
                                "name", "Java Test",
                                "inputs", Map.of(
                                                "input", "Hello, World!"),
                                "start_time", startTime,
                                "end_time", endTime,
                                "id", runId);

                Map<String, JsonValue> additionalPropertiesMap = additionalProperties.entrySet().stream()
                                .collect(Collectors.toMap(
                                                Map.Entry::getKey,
                                                entry -> JsonValue.from(objectMapper.valueToTree(entry.getValue()))));

                var params = RunCreateParams.builder()
                                .additionalBodyProperties(additionalPropertiesMap)
                                .build();

                var result = client.runs().create(params);

                // Now update
                var additionalUpdateProperties = Map.of(
                                "end_time", endTime,
                                "outputs", Map.of(
                                                "output", "Been a great day!"));
                var runUpdateParams = RunUpdateParams.builder()
                                .runId(runId)
                                .additionalBodyProperties(
                                                additionalUpdateProperties.entrySet().stream()
                                                                .collect(Collectors.toMap(
                                                                                Map.Entry::getKey,
                                                                                entry -> JsonValue.from(objectMapper
                                                                                                .valueToTree(entry
                                                                                                                .getValue())))))
                                .build();
                var updateResult = client.runs().update(runUpdateParams);
                System.out.println("Update Result: " + updateResult.toString());

        }
}
