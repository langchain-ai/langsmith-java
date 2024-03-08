// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.services

// //
// templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.databind.json.JsonMapper // templates/JavaSDK/components/file.ts:28:17
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.langsmith.api.client.LangSmithClient
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.core.jsonMapper
import com.langsmith.api.models.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest // templates/JavaSDK/services.ts:581:15 // templates/JavaSDK/services.ts:581:15 //
// templates/JavaSDK/services.ts:581:15 // templates/JavaSDK/services.ts:581:15
class ServiceParamsTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper() // templates/JavaSDK/services.ts:581:15

    private lateinit var client: LangSmithClient

    @BeforeEach // templates/JavaSDK/services.ts:598:12
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) { // templates/JavaSDK/services.ts:598:12
        client =
            LangSmithOkHttpClient.builder() // templates/JavaSDK/services.ts:608:38 //
                // templates/JavaSDK/services.ts:608:22
                .apiKey(
                    "My API Key"
                ) // templates/JavaSDK/services.ts:610:28 // templates/JavaSDK/services.ts:610:28
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .build()
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun apiKeysRetrieveWithAdditionalParams() { // templates/JavaSDK/entities/testing.ts:18:13
        val additionalHeaders =
            mutableMapOf<String, List<String>>() // templates/JavaSDK/services.ts:628:26

        additionalHeaders.put("x-test-header", listOf("abc1234"))

        val additionalQueryParams = mutableMapOf<String, List<String>>()

        additionalQueryParams.put("test_query_param", listOf("def567"))

        val params =
            ApiKeyRetrieveParams.builder() // templates/JavaSDK/services.ts:651:18
                .additionalHeaders(additionalHeaders)
                .additionalQueryParams(additionalQueryParams)
                .build()

        stubFor(
            get(
                    anyUrl()
                ) // templates/JavaSDK/services.ts:680:22 // templates/JavaSDK/services.ts:680:22 //
                // templates/JavaSDK/services.ts:679:18
                .withHeader(
                    "x-test-header",
                    equalTo("abc1234")
                ) // templates/JavaSDK/services.ts:683:26 // templates/JavaSDK/services.ts:683:26
                .withQueryParam("test_query_param", equalTo("def567"))
                .willReturn(ok("[]"))
        )

        client.apiKeys().retrieve(params)

        verify(getRequestedFor(anyUrl()))
    }
}
