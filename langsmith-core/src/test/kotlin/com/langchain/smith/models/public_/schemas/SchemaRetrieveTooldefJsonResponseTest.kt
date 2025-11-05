// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.schemas

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SchemaRetrieveTooldefJsonResponseTest {

    @Test
    fun create() {
        val schemaRetrieveTooldefJsonResponse = SchemaRetrieveTooldefJsonResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val schemaRetrieveTooldefJsonResponse = SchemaRetrieveTooldefJsonResponse.builder().build()

        val roundtrippedSchemaRetrieveTooldefJsonResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(schemaRetrieveTooldefJsonResponse),
                jacksonTypeRef<SchemaRetrieveTooldefJsonResponse>(),
            )

        assertThat(roundtrippedSchemaRetrieveTooldefJsonResponse)
            .isEqualTo(schemaRetrieveTooldefJsonResponse)
    }
}
