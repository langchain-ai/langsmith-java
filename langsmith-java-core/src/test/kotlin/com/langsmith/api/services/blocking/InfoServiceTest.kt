// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InfoServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val infoService = client.info()
        val infoGetResponse = infoService.retrieve(InfoRetrieveParams.builder().build())
        println(infoGetResponse)
        infoGetResponse.validate()
    }
}
