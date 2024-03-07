// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ApiKeyServiceTest {

    @Test
    fun callCreate() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val apiKeyService = client.apiKeys()
        val apiKeyCreateResponse =
            apiKeyService.create(ApiKeyCreateParams.builder().readOnly(true).build())
        println(apiKeyCreateResponse)
        apiKeyCreateResponse.validate()
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
        val apiKeyService = client.apiKeys()
        val apiKeyRetrieveResponse = apiKeyService.retrieve(ApiKeyRetrieveParams.builder().build())
        println(apiKeyRetrieveResponse)
        for (apiKeyGetResponse: ApiKeyGetResponse in apiKeyRetrieveResponse) {
            apiKeyGetResponse.validate()
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
        val apiKeyService = client.apiKeys()
        val apiKeyGetResponse =
            apiKeyService.delete(
                ApiKeyDeleteParams.builder()
                    .apiKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(apiKeyGetResponse)
        apiKeyGetResponse.validate()
    }
}
