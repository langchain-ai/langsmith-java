// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.comments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListCommentsResponseTest {

    @Test
    fun create() {
        val listCommentsResponse =
            ListCommentsResponse.builder()
                .addComment(
                    Comment.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .commentOn("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .content("content")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .numLikes(0L)
                        .numSubComments(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .commentBy("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .commentByName("comment_by_name")
                        .likedByAuthUser(true)
                        .parentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .total(0L)
                .build()

        assertThat(listCommentsResponse.comments())
            .containsExactly(
                Comment.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .commentOn("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .content("content")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .numLikes(0L)
                    .numSubComments(0L)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .commentBy("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .commentByName("comment_by_name")
                    .likedByAuthUser(true)
                    .parentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(listCommentsResponse.total()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listCommentsResponse =
            ListCommentsResponse.builder()
                .addComment(
                    Comment.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .commentOn("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .content("content")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .numLikes(0L)
                        .numSubComments(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .commentBy("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .commentByName("comment_by_name")
                        .likedByAuthUser(true)
                        .parentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .total(0L)
                .build()

        val roundtrippedListCommentsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listCommentsResponse),
                jacksonTypeRef<ListCommentsResponse>(),
            )

        assertThat(roundtrippedListCommentsResponse).isEqualTo(listCommentsResponse)
    }
}
