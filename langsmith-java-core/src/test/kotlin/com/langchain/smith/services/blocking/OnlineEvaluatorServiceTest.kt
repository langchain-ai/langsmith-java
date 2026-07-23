// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
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

internal class OnlineEvaluatorServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val onlineEvaluatorService = client.onlineEvaluators()

        val createOnlineEvaluatorResponse =
            onlineEvaluatorService.create(
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

        createOnlineEvaluatorResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val onlineEvaluatorService = client.onlineEvaluators()

        val onlineEvaluator = onlineEvaluatorService.retrieve("evaluator_id")

        onlineEvaluator.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val onlineEvaluatorService = client.onlineEvaluators()

        val updateOnlineEvaluatorResponse =
            onlineEvaluatorService.update(
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

        updateOnlineEvaluatorResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val onlineEvaluatorService = client.onlineEvaluators()

        val page = onlineEvaluatorService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val onlineEvaluatorService = client.onlineEvaluators()

        onlineEvaluatorService.delete(
            OnlineEvaluatorDeleteParams.builder()
                .evaluatorId("evaluator_id")
                .deleteRunRules(true)
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun bulkDelete() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val onlineEvaluatorService = client.onlineEvaluators()

        val bulkDeleteEvaluatorsResponse =
            onlineEvaluatorService.bulkDelete(
                OnlineEvaluatorBulkDeleteParams.builder()
                    .addEvaluatorId("string")
                    .deleteRunRules(true)
                    .build()
            )

        bulkDeleteEvaluatorsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun spend() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val onlineEvaluatorService = client.onlineEvaluators()

        val getOnlineEvaluatorSpendResponse =
            onlineEvaluatorService.spend(
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

        getOnlineEvaluatorSpendResponse.validate()
    }
}
