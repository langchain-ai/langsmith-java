// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.repos

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.repos.EPromptOptimizationAlgorithm
import com.langchain.smith.models.repos.PromptimConfig
import com.langchain.smith.models.repos.optimizationjobs.EPromptOptimizationJobStatus
import com.langchain.smith.models.repos.optimizationjobs.OptimizationJobDeleteParams
import com.langchain.smith.models.repos.optimizationjobs.OptimizationJobOptimizationJobsParams
import com.langchain.smith.models.repos.optimizationjobs.OptimizationJobRetrieveOptimizationJobsParams
import com.langchain.smith.models.repos.optimizationjobs.OptimizationJobRetrieveParams
import com.langchain.smith.models.repos.optimizationjobs.OptimizationJobUpdateParams
import com.langchain.smith.models.repos.optimizationjobs.PromptOptimizationResult
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OptimizationJobServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val optimizationJobServiceAsync = client.repos().optimizationJobs()

        val optimizationJobFuture =
            optimizationJobServiceAsync.retrieve(
                OptimizationJobRetrieveParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val optimizationJob = optimizationJobFuture.get()
        optimizationJob.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val optimizationJobServiceAsync = client.repos().optimizationJobs()

        val promptOptimizationJobFuture =
            optimizationJobServiceAsync.update(
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

        val promptOptimizationJob = promptOptimizationJobFuture.get()
        promptOptimizationJob.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val optimizationJobServiceAsync = client.repos().optimizationJobs()

        val optimizationJobFuture =
            optimizationJobServiceAsync.delete(
                OptimizationJobDeleteParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val optimizationJob = optimizationJobFuture.get()
        optimizationJob.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun optimizationJobs() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val optimizationJobServiceAsync = client.repos().optimizationJobs()

        val promptOptimizationJobFuture =
            optimizationJobServiceAsync.optimizationJobs(
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

        val promptOptimizationJob = promptOptimizationJobFuture.get()
        promptOptimizationJob.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveOptimizationJobs() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val optimizationJobServiceAsync = client.repos().optimizationJobs()

        val promptOptimizationJobsFuture =
            optimizationJobServiceAsync.retrieveOptimizationJobs(
                OptimizationJobRetrieveOptimizationJobsParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .build()
            )

        val promptOptimizationJobs = promptOptimizationJobsFuture.get()
        promptOptimizationJobs.forEach { it.validate() }
    }
}
