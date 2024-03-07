// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.sessions

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class MetadataServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val metadataService = client.sessions().metadata()
        val tracerSessionMetadataResponse =
            metadataService.retrieve(
                SessionMetadataRetrieveParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .k(123L)
                    .metadataKeys(listOf("string"))
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        println(tracerSessionMetadataResponse)
        tracerSessionMetadataResponse.validate()
    }
}
