// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.comments

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.comments.like.LikeCreateParams
import com.langchain.smith.models.comments.like.LikeDeleteAllParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LikeServiceAsyncTest {

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
        val likeServiceAsync = client.comments().like()

        val likeFuture =
            likeServiceAsync.create(
                LikeCreateParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .parentCommentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val like = likeFuture.get()
        like.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteAll() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val likeServiceAsync = client.comments().like()

        val responseFuture =
            likeServiceAsync.deleteAll(
                LikeDeleteAllParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .parentCommentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
