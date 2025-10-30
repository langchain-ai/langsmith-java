// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.comments.CommentCreateParams
import com.langchain.smith.models.comments.CommentListParams
import com.langchain.smith.models.comments.CommentRetrieveParams
import com.langchain.smith.models.comments.CommentUpdateParams
import com.langchain.smith.models.comments.CreateCommentRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CommentServiceAsyncTest {

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
        val commentServiceAsync = client.comments()

        val commentFuture =
            commentServiceAsync.create(
                CommentCreateParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .createCommentRequest(CreateCommentRequest.builder().content("content").build())
                    .build()
            )

        val comment = commentFuture.get()
        comment.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val commentServiceAsync = client.comments()

        val listCommentsResponseFuture =
            commentServiceAsync.retrieve(
                CommentRetrieveParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .parentCommentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(1L)
                    .offset(0L)
                    .build()
            )

        val listCommentsResponse = listCommentsResponseFuture.get()
        listCommentsResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val commentServiceAsync = client.comments()

        val commentFuture =
            commentServiceAsync.update(
                CommentUpdateParams.builder()
                    .owner("owner")
                    .repo("repo")
                    .parentCommentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createCommentRequest(CreateCommentRequest.builder().content("content").build())
                    .build()
            )

        val comment = commentFuture.get()
        comment.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val commentServiceAsync = client.comments()

        val listCommentsResponseFuture =
            commentServiceAsync.list(
                CommentListParams.builder().owner("owner").repo("repo").limit(1L).offset(0L).build()
            )

        val listCommentsResponse = listCommentsResponseFuture.get()
        listCommentsResponse.validate()
    }
}
