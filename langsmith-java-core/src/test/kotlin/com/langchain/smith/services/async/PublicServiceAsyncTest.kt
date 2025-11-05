// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.feedback.FeedbackLevel
import com.langchain.smith.models.feedback.SourceType
import com.langchain.smith.models.public_.PublicRetrieveFeedbacksParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PublicServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveFeedbacks() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val publicServiceAsync = client.public_()

        val feedbackSchemataFuture =
            publicServiceAsync.retrieveFeedbacks(
                PublicRetrieveFeedbacksParams.builder()
                    .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .hasComment(true)
                    .hasScore(true)
                    .addKey("string")
                    .level(FeedbackLevel.RUN)
                    .limit(1L)
                    .offset(0L)
                    .addRun("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addSource(SourceType.API)
                    .addUser("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val feedbackSchemata = feedbackSchemataFuture.get()
        feedbackSchemata.forEach { it.validate() }
    }
}
