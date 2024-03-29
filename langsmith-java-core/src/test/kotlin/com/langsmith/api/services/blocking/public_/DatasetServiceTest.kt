// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.public_

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DatasetServiceTest {

    @Test
    fun callList() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val datasetService = client.public_().datasets()
        val datasetPublicSchema =
            datasetService.list(
                PublicDatasetListParams.builder()
                    .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(123L)
                    .offset(123L)
                    .build()
            )
        println(datasetPublicSchema)
        datasetPublicSchema.validate()
    }
}
