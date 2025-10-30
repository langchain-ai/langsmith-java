// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces.current.tags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagResourcesResponseTest {

    @Test
    fun create() {
        val tagResourcesResponse =
            TagResourcesResponse.builder()
                .putAdditionalProperty(
                    "foo",
                    JsonValue.from(
                        listOf(
                            mapOf(
                                "id" to "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e",
                                "created_at" to "2019-12-27T18:11:19.117Z",
                                "key" to "x",
                                "updated_at" to "2019-12-27T18:11:19.117Z",
                                "description" to "description",
                                "values" to
                                    listOf(
                                        mapOf(
                                            "id" to "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e",
                                            "created_at" to "2019-12-27T18:11:19.117Z",
                                            "tag_key_id" to "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e",
                                            "updated_at" to "2019-12-27T18:11:19.117Z",
                                            "value" to "x",
                                            "description" to "description",
                                            "taggings" to
                                                listOf(
                                                    mapOf(
                                                        "id" to
                                                            "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e",
                                                        "created_at" to "2019-12-27T18:11:19.117Z",
                                                        "resource_id" to
                                                            "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e",
                                                        "resource_type" to "prompt",
                                                        "tag_value_id" to
                                                            "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e",
                                                    )
                                                ),
                                        )
                                    ),
                            )
                        )
                    ),
                )
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tagResourcesResponse =
            TagResourcesResponse.builder()
                .putAdditionalProperty(
                    "foo",
                    JsonValue.from(
                        listOf(
                            mapOf(
                                "id" to "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e",
                                "created_at" to "2019-12-27T18:11:19.117Z",
                                "key" to "x",
                                "updated_at" to "2019-12-27T18:11:19.117Z",
                                "description" to "description",
                                "values" to
                                    listOf(
                                        mapOf(
                                            "id" to "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e",
                                            "created_at" to "2019-12-27T18:11:19.117Z",
                                            "tag_key_id" to "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e",
                                            "updated_at" to "2019-12-27T18:11:19.117Z",
                                            "value" to "x",
                                            "description" to "description",
                                            "taggings" to
                                                listOf(
                                                    mapOf(
                                                        "id" to
                                                            "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e",
                                                        "created_at" to "2019-12-27T18:11:19.117Z",
                                                        "resource_id" to
                                                            "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e",
                                                        "resource_type" to "prompt",
                                                        "tag_value_id" to
                                                            "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e",
                                                    )
                                                ),
                                        )
                                    ),
                            )
                        )
                    ),
                )
                .build()

        val roundtrippedTagResourcesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tagResourcesResponse),
                jacksonTypeRef<TagResourcesResponse>(),
            )

        assertThat(roundtrippedTagResourcesResponse).isEqualTo(tagResourcesResponse)
    }
}
