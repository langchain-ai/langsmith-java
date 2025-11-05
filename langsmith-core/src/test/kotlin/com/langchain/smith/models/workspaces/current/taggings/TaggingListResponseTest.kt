// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces.current.taggings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TaggingListResponseTest {

    @Test
    fun create() {
        val taggingListResponse =
            TaggingListResponse.builder()
                .resources(
                    TaggingListResponse.Resources.builder()
                        .addDashboard(
                            Resource.builder()
                                .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .resourceName("resource_name")
                                .taggingId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .addDataset(
                            Resource.builder()
                                .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .resourceName("resource_name")
                                .taggingId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .addDeployment(
                            Resource.builder()
                                .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .resourceName("resource_name")
                                .taggingId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .addExperiment(
                            Resource.builder()
                                .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .resourceName("resource_name")
                                .taggingId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .addProject(
                            Resource.builder()
                                .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .resourceName("resource_name")
                                .taggingId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .addPrompt(
                            Resource.builder()
                                .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .resourceName("resource_name")
                                .taggingId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .addQueue(
                            Resource.builder()
                                .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .resourceName("resource_name")
                                .taggingId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .build()
                )
                .tagKey("tag_key")
                .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tagValue("tag_value")
                .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(taggingListResponse.resources())
            .isEqualTo(
                TaggingListResponse.Resources.builder()
                    .addDashboard(
                        Resource.builder()
                            .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .resourceName("resource_name")
                            .taggingId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .addDataset(
                        Resource.builder()
                            .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .resourceName("resource_name")
                            .taggingId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .addDeployment(
                        Resource.builder()
                            .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .resourceName("resource_name")
                            .taggingId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .addExperiment(
                        Resource.builder()
                            .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .resourceName("resource_name")
                            .taggingId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .addProject(
                        Resource.builder()
                            .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .resourceName("resource_name")
                            .taggingId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .addPrompt(
                        Resource.builder()
                            .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .resourceName("resource_name")
                            .taggingId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .addQueue(
                        Resource.builder()
                            .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .resourceName("resource_name")
                            .taggingId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .build()
            )
        assertThat(taggingListResponse.tagKey()).isEqualTo("tag_key")
        assertThat(taggingListResponse.tagKeyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(taggingListResponse.tagValue()).isEqualTo("tag_value")
        assertThat(taggingListResponse.tagValueId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val taggingListResponse =
            TaggingListResponse.builder()
                .resources(
                    TaggingListResponse.Resources.builder()
                        .addDashboard(
                            Resource.builder()
                                .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .resourceName("resource_name")
                                .taggingId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .addDataset(
                            Resource.builder()
                                .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .resourceName("resource_name")
                                .taggingId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .addDeployment(
                            Resource.builder()
                                .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .resourceName("resource_name")
                                .taggingId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .addExperiment(
                            Resource.builder()
                                .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .resourceName("resource_name")
                                .taggingId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .addProject(
                            Resource.builder()
                                .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .resourceName("resource_name")
                                .taggingId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .addPrompt(
                            Resource.builder()
                                .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .resourceName("resource_name")
                                .taggingId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .addQueue(
                            Resource.builder()
                                .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .resourceName("resource_name")
                                .taggingId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .build()
                )
                .tagKey("tag_key")
                .tagKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tagValue("tag_value")
                .tagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedTaggingListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(taggingListResponse),
                jacksonTypeRef<TaggingListResponse>(),
            )

        assertThat(roundtrippedTaggingListResponse).isEqualTo(taggingListResponse)
    }
}
