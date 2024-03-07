// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DatasetServiceTest {

    @Test
    fun callCreate() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val datasetService = client.datasets()
        val dataset =
            datasetService.create(
                DatasetCreateParams.builder()
                    .name("string")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dataType(DatasetCreateParams.DataType.KV)
                    .description("string")
                    .build()
            )
        println(dataset)
        dataset.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val datasetService = client.datasets()
        val dataset =
            datasetService.retrieve(
                DatasetRetrieveParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(dataset)
        dataset.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val datasetService = client.datasets()
        val datasetSchemaForUpdate =
            datasetService.update(
                DatasetUpdateParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("string")
                    .name("string")
                    .build()
            )
        println(datasetSchemaForUpdate)
        datasetSchemaForUpdate.validate()
    }

    @Test
    fun callList() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val datasetService = client.datasets()
        val datasetListResponse =
            datasetService.list(
                DatasetListParams.builder()
                    .id(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dataType(DatasetListParams.DataType.KV)
                    .limit(123L)
                    .name("string")
                    .nameContains("string")
                    .offset(123L)
                    .build()
            )
        println(datasetListResponse)
        for (dataset: Dataset in datasetListResponse) {
            dataset.validate()
        }
    }

    @Test
    fun callDelete() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val datasetService = client.datasets()
        val datasetDeleteResponse =
            datasetService.delete(
                DatasetDeleteParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(datasetDeleteResponse)
    }

    @Test
    fun callUpload() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val datasetService = client.datasets()
        val dataset =
            datasetService.upload(
                DatasetUploadParams.builder()
                    .file("file.txt")
                    .inputKeys(listOf("string"))
                    .dataType(DatasetUploadParams.DataType.KV)
                    .description("string")
                    .name("string")
                    .outputKeys(listOf("string"))
                    .build()
            )
        println(dataset)
        dataset.validate()
    }
}
