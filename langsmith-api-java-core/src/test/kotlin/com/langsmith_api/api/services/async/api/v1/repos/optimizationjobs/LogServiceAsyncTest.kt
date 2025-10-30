// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.repos.optimizationjobs

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
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
internal class LogServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val logServiceAsync = client.api().v1().repos().optimizationJobs().logs()

        val promptOptimizationJobLogFuture =
            logServiceAsync.create(
                LogCreateParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .logType(EPromptOptimizationJobLogType.INFO)
                    .message("message")
                    .data(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        val promptOptimizationJobLog = promptOptimizationJobLogFuture.get()
        promptOptimizationJobLog.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val logServiceAsync = client.api().v1().repos().optimizationJobs().logs()

        val promptOptimizationJobLogFuture =
            logServiceAsync.retrieve(
                LogRetrieveParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .jobId("job_id")
                    .logId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val promptOptimizationJobLog = promptOptimizationJobLogFuture.get()
        promptOptimizationJobLog.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val logServiceAsync = client.api().v1().repos().optimizationJobs().logs()

        val promptOptimizationJobLogsFuture =
            logServiceAsync.list(
                LogListParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val promptOptimizationJobLogs = promptOptimizationJobLogsFuture.get()
        promptOptimizationJobLogs.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val logServiceAsync = client.api().v1().repos().optimizationJobs().logs()

        val logFuture =
            logServiceAsync.delete(
                LogDeleteParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .jobId("job_id")
                    .logId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val log = logFuture.get()
        log.validate()
    }
}
