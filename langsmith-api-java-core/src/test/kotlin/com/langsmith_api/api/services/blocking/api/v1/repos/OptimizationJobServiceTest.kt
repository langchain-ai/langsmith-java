// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.repos

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.models.api.v1.repos.EPromptOptimizationAlgorithm
import com.langsmith_api.api.models.api.v1.repos.PromptimConfig
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.EPromptOptimizationJobStatus
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.OptimizationJobDeleteParams
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.OptimizationJobOptimizationJobsParams
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.OptimizationJobRetrieveOptimizationJobsParams
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.OptimizationJobRetrieveParams
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.OptimizationJobUpdateParams
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.PromptOptimizationResult
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OptimizationJobServiceTest {

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
        val optimizationJobService = client.api().v1().repos().optimizationJobs()

        val optimizationJob =
            optimizationJobService.retrieve(
                OptimizationJobRetrieveParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        optimizationJob.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val optimizationJobService = client.api().v1().repos().optimizationJobs()

        val promptOptimizationJob =
            optimizationJobService.update(
                OptimizationJobUpdateParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .result(
                        PromptOptimizationResult.builder()
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .x(0.0)
                            .y(0.0)
                            .build()
                    )
                    .status(EPromptOptimizationJobStatus.CREATED)
                    .build()
            )

        promptOptimizationJob.validate()
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
        val optimizationJobService = client.api().v1().repos().optimizationJobs()

        val optimizationJob =
            optimizationJobService.delete(
                OptimizationJobDeleteParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        optimizationJob.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun optimizationJobs() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val optimizationJobService = client.api().v1().repos().optimizationJobs()

        val promptOptimizationJob =
            optimizationJobService.optimizationJobs(
                OptimizationJobOptimizationJobsParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .algorithm(EPromptOptimizationAlgorithm.PROMPTIM)
                    .config(
                        PromptimConfig.builder()
                            .autoCommit(true)
                            .datasetName("dataset_name")
                            .devSplit("dev_split")
                            .addEvaluator("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .messageIndex(0L)
                            .numEpochs(0L)
                            .taskDescription("task_description")
                            .testSplit("test_split")
                            .trainSplit("train_split")
                            .build()
                    )
                    .build()
            )

        promptOptimizationJob.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveOptimizationJobs() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val optimizationJobService = client.api().v1().repos().optimizationJobs()

        val promptOptimizationJobs =
            optimizationJobService.retrieveOptimizationJobs(
                OptimizationJobRetrieveOptimizationJobsParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .build()
            )

        promptOptimizationJobs.forEach { it.validate() }
    }
}
