// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.public_.datasets

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class FeedbackServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val feedbackService = client.public_().datasets().feedback()
        val publicDatasetFeedbackRetrieveResponse =
            feedbackService.retrieve(
                PublicDatasetFeedbackRetrieveParams.builder()
                    .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .hasComment(true)
                    .hasScore(true)
                    .key(listOf("string"))
                    .limit(123L)
                    .offset(123L)
                    .run(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .session(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .source(listOf(PublicDatasetFeedbackRetrieveParams.Source.API))
                    .user(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .build()
            )
        println(publicDatasetFeedbackRetrieveResponse)
        for (feedbackSchema: FeedbackSchema in publicDatasetFeedbackRetrieveResponse) {
            feedbackSchema.validate()
        }
    }
}
