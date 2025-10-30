// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.workspaces.current.tags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import com.langsmith_api.api.models.api.v1.workspaces.current.taggings.Tagging
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagRetrieveResourceResponseTest {

    @Test
    fun create() {
        val tagRetrieveResourceResponse =
            TagRetrieveResourceResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .key("x")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .addValue(
                    TagRetrieveResourceResponse.Value.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .value("x")
                        .description("description")
                        .addTagging(
                            Tagging.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .resourceType(ResourceType.PROMPT)
                                .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(tagRetrieveResourceResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tagRetrieveResourceResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tagRetrieveResourceResponse.key()).isEqualTo("x")
        assertThat(tagRetrieveResourceResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tagRetrieveResourceResponse.description()).contains("description")
        assertThat(tagRetrieveResourceResponse.values().getOrNull())
            .containsExactly(
                TagRetrieveResourceResponse.Value.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .value("x")
                    .description("description")
                    .addTagging(
                        Tagging.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .resourceType(ResourceType.PROMPT)
                            .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tagRetrieveResourceResponse =
            TagRetrieveResourceResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .key("x")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .addValue(
                    TagRetrieveResourceResponse.Value.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .value("x")
                        .description("description")
                        .addTagging(
                            Tagging.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .resourceType(ResourceType.PROMPT)
                                .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedTagRetrieveResourceResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tagRetrieveResourceResponse),
                jacksonTypeRef<TagRetrieveResourceResponse>(),
            )

        assertThat(roundtrippedTagRetrieveResourceResponse).isEqualTo(tagRetrieveResourceResponse)
    }
}
