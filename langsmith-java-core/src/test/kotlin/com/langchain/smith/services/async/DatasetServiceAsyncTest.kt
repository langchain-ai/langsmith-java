// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.datasets.DatasetCloneParams
import com.langchain.smith.models.datasets.DatasetCreateParams
import com.langchain.smith.models.datasets.DatasetGenerateParams
import com.langchain.smith.models.datasets.DatasetListParams
import com.langchain.smith.models.datasets.DatasetRetrieveCsvParams
import com.langchain.smith.models.datasets.DatasetRetrieveJsonlParams
import com.langchain.smith.models.datasets.DatasetRetrieveOpenAIFtParams
import com.langchain.smith.models.datasets.DatasetRetrieveOpenAIParams
import com.langchain.smith.models.datasets.DatasetRetrieveVersionParams
import com.langchain.smith.models.datasets.DatasetSearchParams
import com.langchain.smith.models.datasets.DatasetStudioExperimentParams
import com.langchain.smith.models.datasets.DatasetTransformation
import com.langchain.smith.models.datasets.DatasetUpdateParams
import com.langchain.smith.models.datasets.DatasetUpdateTagsParams
import com.langchain.smith.models.datasets.DatasetUploadExperimentParams
import com.langchain.smith.models.datasets.DatasetUploadParams
import com.langchain.smith.models.datasets.FeedbackCreateCoreSchema
import com.langchain.smith.models.datasets.SortByDatasetColumn
import com.langchain.smith.models.feedback.AppFeedbackSource
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DatasetServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val datasetServiceAsync = client.datasets()

        val datasetFuture =
            datasetServiceAsync.create(
                DatasetCreateParams.builder()
                    .name("name")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dataType(DatasetCreateParams.DataType.KV)
                    .description("description")
                    .externallyManaged(true)
                    .extra(JsonValue.from(mapOf<String, Any>()))
                    .inputsSchemaDefinition(JsonValue.from(mapOf<String, Any>()))
                    .outputsSchemaDefinition(JsonValue.from(mapOf<String, Any>()))
                    .addTransformation(
                        DatasetTransformation.builder()
                            .addPath("string")
                            .transformationType(
                                DatasetTransformation.TransformationType.CONVERT_TO_OPENAI_MESSAGE
                            )
                            .build()
                    )
                    .build()
            )

        val dataset = datasetFuture.get()
        dataset.validate()
    }

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
        val datasetServiceAsync = client.datasets()

        val datasetFuture = datasetServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val dataset = datasetFuture.get()
        dataset.validate()
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
        val datasetServiceAsync = client.datasets()

        val datasetFuture =
            datasetServiceAsync.update(
                DatasetUpdateParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("string")
                    .inputsSchemaDefinition(JsonValue.from(mapOf<String, Any>()))
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .name("string")
                    .outputsSchemaDefinition(JsonValue.from(mapOf<String, Any>()))
                    .patchExamples(
                        DatasetUpdateParams.PatchExamples.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf(
                                        "attachments_operations" to
                                            mapOf(
                                                "rename" to mapOf("foo" to "string"),
                                                "retain" to listOf("string"),
                                            ),
                                        "dataset_id" to "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e",
                                        "inputs" to mapOf<String, Any>(),
                                        "metadata" to mapOf<String, Any>(),
                                        "outputs" to mapOf<String, Any>(),
                                        "overwrite" to true,
                                        "split" to listOf("string"),
                                    )
                                ),
                            )
                            .build()
                    )
                    .transformationsOfDataset(
                        listOf(
                            DatasetTransformation.builder()
                                .addPath("string")
                                .transformationType(
                                    DatasetTransformation.TransformationType
                                        .CONVERT_TO_OPENAI_MESSAGE
                                )
                                .build()
                        )
                    )
                    .build()
            )

        val dataset = datasetFuture.get()
        dataset.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val datasetServiceAsync = client.datasets()

        val datasetsFuture =
            datasetServiceAsync.list(
                DatasetListParams.builder()
                    .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dataTypeOfDatasetDataTypes(
                        listOf(DatasetListParams.DataType.DatasetDataType.KV)
                    )
                    .excludeCorrectionsDatasets(true)
                    .limit(1L)
                    .metadata("metadata")
                    .name("name")
                    .nameContains("name_contains")
                    .offset(0L)
                    .sortBy(SortByDatasetColumn.NAME)
                    .sortByDesc(true)
                    .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val datasets = datasetsFuture.get()
        datasets.forEach { it.validate() }
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
        val datasetServiceAsync = client.datasets()

        val datasetFuture = datasetServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val dataset = datasetFuture.get()
        dataset.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun clone() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val datasetServiceAsync = client.datasets()

        val responseFuture =
            datasetServiceAsync.clone(
                DatasetCloneParams.builder()
                    .sourceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .targetDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addExample("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun generate() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val datasetServiceAsync = client.datasets()

        val responseFuture =
            datasetServiceAsync.generate(
                DatasetGenerateParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .numExamples(0L)
                    .addExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveCsv() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val datasetServiceAsync = client.datasets()

        val responseFuture =
            datasetServiceAsync.retrieveCsv(
                DatasetRetrieveCsvParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveJsonl() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val datasetServiceAsync = client.datasets()

        val responseFuture =
            datasetServiceAsync.retrieveJsonl(
                DatasetRetrieveJsonlParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveOpenAI() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val datasetServiceAsync = client.datasets()

        val responseFuture =
            datasetServiceAsync.retrieveOpenAI(
                DatasetRetrieveOpenAIParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveOpenAIFt() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val datasetServiceAsync = client.datasets()

        val responseFuture =
            datasetServiceAsync.retrieveOpenAIFt(
                DatasetRetrieveOpenAIFtParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveVersion() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val datasetServiceAsync = client.datasets()

        val datasetVersionFuture =
            datasetServiceAsync.retrieveVersion(
                DatasetRetrieveVersionParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .tag("tag")
                    .build()
            )

        val datasetVersion = datasetVersionFuture.get()
        datasetVersion.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun search() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val datasetServiceAsync = client.datasets()

        val responseFuture =
            datasetServiceAsync.search(
                DatasetSearchParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .inputs(JsonValue.from(mapOf<String, Any>()))
                    .debug(true)
                    .filter("filter")
                    .limit(1L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun studioExperiment() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val datasetServiceAsync = client.datasets()

        val responseFuture =
            datasetServiceAsync.studioExperiment(
                DatasetStudioExperimentParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectName("project_name")
                    .addEvaluatorRule("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateTags() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val datasetServiceAsync = client.datasets()

        val datasetVersionFuture =
            datasetServiceAsync.updateTags(
                DatasetUpdateTagsParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .tag("tag")
                    .build()
            )

        val datasetVersion = datasetVersionFuture.get()
        datasetVersion.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun upload() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val datasetServiceAsync = client.datasets()

        val datasetFuture =
            datasetServiceAsync.upload(
                DatasetUploadParams.builder()
                    .file("some content".byteInputStream())
                    .addInputKey("string")
                    .dataType(DatasetUploadParams.DataType.KV)
                    .description("description")
                    .inputKeyMappings("input_key_mappings")
                    .inputsSchemaDefinition("inputs_schema_definition")
                    .metadataKeyMappings("metadata_key_mappings")
                    .addMetadataKey("string")
                    .name("name")
                    .outputKeyMappings("output_key_mappings")
                    .addOutputKey("string")
                    .outputsSchemaDefinition("outputs_schema_definition")
                    .transformations("transformations")
                    .build()
            )

        val dataset = datasetFuture.get()
        dataset.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun uploadExperiment() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val datasetServiceAsync = client.datasets()

        val responseFuture =
            datasetServiceAsync.uploadExperiment(
                DatasetUploadExperimentParams.builder()
                    .experimentEndTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .experimentName("experiment_name")
                    .experimentStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addResult(
                        DatasetUploadExperimentParams.Result.builder()
                            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .inputs(JsonValue.from(mapOf<String, Any>()))
                            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .actualOutputs(JsonValue.from(mapOf<String, Any>()))
                            .error("error")
                            .addEvaluationScore(
                                FeedbackCreateCoreSchema.builder()
                                    .key("key")
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .comment("comment")
                                    .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .correction(JsonValue.from(mapOf<String, Any>()))
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .extra(JsonValue.from(mapOf<String, Any>()))
                                    .feedbackConfig(
                                        FeedbackCreateCoreSchema.FeedbackConfig.builder()
                                            .type(
                                                FeedbackCreateCoreSchema.FeedbackConfig.Type
                                                    .CONTINUOUS
                                            )
                                            .addCategory(
                                                FeedbackCreateCoreSchema.FeedbackConfig.Category
                                                    .builder()
                                                    .value(0.0)
                                                    .label("x")
                                                    .build()
                                            )
                                            .max(0.0)
                                            .min(0.0)
                                            .build()
                                    )
                                    .feedbackGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .feedbackSource(
                                        AppFeedbackSource.builder()
                                            .metadata(JsonValue.from(mapOf<String, Any>()))
                                            .type(AppFeedbackSource.Type.APP)
                                            .build()
                                    )
                                    .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .score(0.0)
                                    .value(0.0)
                                    .build()
                            )
                            .expectedOutputs(JsonValue.from(mapOf<String, Any>()))
                            .rowId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .runMetadata(JsonValue.from(mapOf<String, Any>()))
                            .runName("run_name")
                            .build()
                    )
                    .datasetDescription("dataset_description")
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .datasetName("dataset_name")
                    .experimentDescription("experiment_description")
                    .experimentMetadata(JsonValue.from(mapOf<String, Any>()))
                    .addSummaryExperimentScore(
                        FeedbackCreateCoreSchema.builder()
                            .key("key")
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .comment("comment")
                            .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .correction(JsonValue.from(mapOf<String, Any>()))
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .extra(JsonValue.from(mapOf<String, Any>()))
                            .feedbackConfig(
                                FeedbackCreateCoreSchema.FeedbackConfig.builder()
                                    .type(FeedbackCreateCoreSchema.FeedbackConfig.Type.CONTINUOUS)
                                    .addCategory(
                                        FeedbackCreateCoreSchema.FeedbackConfig.Category.builder()
                                            .value(0.0)
                                            .label("x")
                                            .build()
                                    )
                                    .max(0.0)
                                    .min(0.0)
                                    .build()
                            )
                            .feedbackGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .feedbackSource(
                                AppFeedbackSource.builder()
                                    .metadata(JsonValue.from(mapOf<String, Any>()))
                                    .type(AppFeedbackSource.Type.APP)
                                    .build()
                            )
                            .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .score(0.0)
                            .value(0.0)
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
