// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.datasets.DataType
import com.langchain.smith.models.datasets.DatasetCloneParams
import com.langchain.smith.models.datasets.DatasetCreateParams
import com.langchain.smith.models.datasets.DatasetRetrieveCsvParams
import com.langchain.smith.models.datasets.DatasetRetrieveJsonlParams
import com.langchain.smith.models.datasets.DatasetRetrieveOpenAIFtParams
import com.langchain.smith.models.datasets.DatasetRetrieveOpenAIParams
import com.langchain.smith.models.datasets.DatasetRetrieveVersionParams
import com.langchain.smith.models.datasets.DatasetTransformation
import com.langchain.smith.models.datasets.DatasetUpdateParams
import com.langchain.smith.models.datasets.DatasetUpdateTagsParams
import com.langchain.smith.models.datasets.DatasetUploadParams
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
                    .dataType(DataType.KV)
                    .description("description")
                    .externallyManaged(true)
                    .extra(
                        DatasetCreateParams.Extra.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .inputsSchemaDefinition(
                        DatasetCreateParams.InputsSchemaDefinition.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .outputsSchemaDefinition(
                        DatasetCreateParams.OutputsSchemaDefinition.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
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
                    .inputsSchemaDefinition(
                        DatasetUpdateParams.InputsSchemaDefinition.UnionMember0.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .metadata(
                        DatasetUpdateParams.Metadata.UnionMember0.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .name("string")
                    .outputsSchemaDefinition(
                        DatasetUpdateParams.OutputsSchemaDefinition.UnionMember0.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
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
                                        "inputs" to mapOf("foo" to "bar"),
                                        "metadata" to mapOf("foo" to "bar"),
                                        "outputs" to mapOf("foo" to "bar"),
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

        val pageFuture = datasetServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
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
                    .dataType(DataType.KV)
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
}
