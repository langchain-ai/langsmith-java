// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.comments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentTest {

    @Test
    fun create() {
        val comment =
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

        assertThat(comment.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(comment.commentOn()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(comment.content()).isEqualTo("content")
        assertThat(comment.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(comment.numLikes()).isEqualTo(0L)
        assertThat(comment.numSubComments()).isEqualTo(0L)
        assertThat(comment.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(comment.commentBy()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(comment.commentByName()).contains("comment_by_name")
        assertThat(comment.likedByAuthUser()).contains(true)
        assertThat(comment.parentId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val comment =
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

        val roundtrippedComment =
            jsonMapper.readValue(jsonMapper.writeValueAsString(comment), jacksonTypeRef<Comment>())

        assertThat(roundtrippedComment).isEqualTo(comment)
    }
}
