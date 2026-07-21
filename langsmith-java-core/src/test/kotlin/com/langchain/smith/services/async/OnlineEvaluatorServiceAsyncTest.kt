// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.onlineevaluators.CreateOnlineCodeEvaluatorRequest
import com.langchain.smith.models.onlineevaluators.CreateOnlineEvaluatorRequest
import com.langchain.smith.models.onlineevaluators.CreateOnlineLlmEvaluatorRequest
import com.langchain.smith.models.onlineevaluators.OnlineEvaluatorBulkDeleteParams
import com.langchain.smith.models.onlineevaluators.OnlineEvaluatorDeleteParams
import com.langchain.smith.models.onlineevaluators.OnlineEvaluatorSpendParams
import com.langchain.smith.models.onlineevaluators.OnlineEvaluatorType
import com.langchain.smith.models.onlineevaluators.OnlineEvaluatorUpdateParams
import com.langchain.smith.models.onlineevaluators.UpdateOnlineCodeEvaluatorRequest
import com.langchain.smith.models.onlineevaluators.UpdateOnlineEvaluatorRequest
import com.langchain.smith.models.onlineevaluators.UpdateOnlineLlmEvaluatorRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OnlineEvaluatorServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val onlineEvaluatorServiceAsync = client.onlineEvaluators()

        val createOnlineEvaluatorResponseFuture =
            onlineEvaluatorServiceAsync.create(
                CreateOnlineEvaluatorRequest.builder()
                    .codeEvaluator(
                        CreateOnlineCodeEvaluatorRequest.builder()
                            .code("code")
                            .language("language")
                            .build()
                    )
                    .llmEvaluator(
                        CreateOnlineLlmEvaluatorRequest.builder()
                            .commitHashOrTag("commit_hash_or_tag")
                            .playgroundSettingsId("playground_settings_id")
                            .promptRepoHandle("prompt_repo_handle")
                            .variableMapping(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .name("name")
                    .type(OnlineEvaluatorType.LLM)
                    .build()
            )

        val createOnlineEvaluatorResponse = createOnlineEvaluatorResponseFuture.get()
        createOnlineEvaluatorResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val onlineEvaluatorServiceAsync = client.onlineEvaluators()

        val onlineEvaluatorFuture = onlineEvaluatorServiceAsync.retrieve("evaluator_id")

        val onlineEvaluator = onlineEvaluatorFuture.get()
        onlineEvaluator.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val onlineEvaluatorServiceAsync = client.onlineEvaluators()

        val updateOnlineEvaluatorResponseFuture =
            onlineEvaluatorServiceAsync.update(
                OnlineEvaluatorUpdateParams.builder()
                    .evaluatorId("evaluator_id")
                    .updateOnlineEvaluatorRequest(
                        UpdateOnlineEvaluatorRequest.builder()
                            .codeEvaluator(
                                UpdateOnlineCodeEvaluatorRequest.builder()
                                    .code("code")
                                    .language("language")
                                    .build()
                            )
                            .llmEvaluator(
                                UpdateOnlineLlmEvaluatorRequest.builder()
                                    .commitHashOrTag("commit_hash_or_tag")
                                    .numFewShotExamples(0L)
                                    .playgroundSettingsId("playground_settings_id")
                                    .promptRepoHandle("prompt_repo_handle")
                                    .useCorrectionsDataset(true)
                                    .variableMapping(JsonValue.from(mapOf<String, Any>()))
                                    .build()
                            )
                            .name("name")
                            .build()
                    )
                    .build()
            )

        val updateOnlineEvaluatorResponse = updateOnlineEvaluatorResponseFuture.get()
        updateOnlineEvaluatorResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val onlineEvaluatorServiceAsync = client.onlineEvaluators()

        val pageFuture = onlineEvaluatorServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val onlineEvaluatorServiceAsync = client.onlineEvaluators()

        val future =
            onlineEvaluatorServiceAsync.delete(
                OnlineEvaluatorDeleteParams.builder()
                    .evaluatorId("evaluator_id")
                    .deleteRunRules(true)
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun bulkDelete() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val onlineEvaluatorServiceAsync = client.onlineEvaluators()

        val bulkDeleteEvaluatorsResponseFuture =
            onlineEvaluatorServiceAsync.bulkDelete(
                OnlineEvaluatorBulkDeleteParams.builder()
                    .addEvaluatorId("string")
                    .deleteRunRules(true)
                    .build()
            )

        val bulkDeleteEvaluatorsResponse = bulkDeleteEvaluatorsResponseFuture.get()
        bulkDeleteEvaluatorsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun spend() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val onlineEvaluatorServiceAsync = client.onlineEvaluators()

        val getOnlineEvaluatorSpendResponseFuture =
            onlineEvaluatorServiceAsync.spend(
                OnlineEvaluatorSpendParams.builder()
                    .periodStart("period_start")
                    .datasetId("dataset_id")
                    .evaluatorId("evaluator_id")
                    .feedbackKey("feedback_key")
                    .groupBy("group_by")
                    .addResourceId("string")
                    .sessionId("session_id")
                    .type("type")
                    .build()
            )

        val getOnlineEvaluatorSpendResponse = getOnlineEvaluatorSpendResponseFuture.get()
        getOnlineEvaluatorSpendResponse.validate()
    }
}
