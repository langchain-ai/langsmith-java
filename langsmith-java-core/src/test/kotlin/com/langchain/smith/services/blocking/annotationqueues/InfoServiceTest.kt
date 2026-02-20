// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.annotationqueues

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InfoServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val infoService = client.annotationQueues().info()

        val infos = infoService.list()

        infos.validate()
    }
}
