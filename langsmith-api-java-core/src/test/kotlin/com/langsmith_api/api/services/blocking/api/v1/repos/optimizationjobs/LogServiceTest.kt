// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.repos.optimizationjobs

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.logs.EPromptOptimizationJobLogType
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.logs.LogCreateParams
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.logs.LogDeleteParams
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.logs.LogListParams
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.logs.LogRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LogServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val logService = client.api().v1().repos().optimizationJobs().logs()

        val promptOptimizationJobLog =
            logService.create(
                LogCreateParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .logType(EPromptOptimizationJobLogType.INFO)
                    .message("message")
                    .data(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        promptOptimizationJobLog.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val logService = client.api().v1().repos().optimizationJobs().logs()

        val promptOptimizationJobLog =
            logService.retrieve(
                LogRetrieveParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .jobId("job_id")
                    .logId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        promptOptimizationJobLog.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val logService = client.api().v1().repos().optimizationJobs().logs()

        val promptOptimizationJobLogs =
            logService.list(
                LogListParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        promptOptimizationJobLogs.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val logService = client.api().v1().repos().optimizationJobs().logs()

        val log =
            logService.delete(
                LogDeleteParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .jobId("job_id")
                    .logId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        log.validate()
    }
}
