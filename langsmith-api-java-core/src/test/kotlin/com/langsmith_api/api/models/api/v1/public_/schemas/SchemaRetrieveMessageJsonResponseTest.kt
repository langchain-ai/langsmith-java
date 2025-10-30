// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.public_.schemas

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SchemaRetrieveMessageJsonResponseTest {

    @Test
    fun create() {
        val schemaRetrieveMessageJsonResponse = SchemaRetrieveMessageJsonResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val schemaRetrieveMessageJsonResponse = SchemaRetrieveMessageJsonResponse.builder().build()

        val roundtrippedSchemaRetrieveMessageJsonResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(schemaRetrieveMessageJsonResponse),
                jacksonTypeRef<SchemaRetrieveMessageJsonResponse>(),
            )

        assertThat(roundtrippedSchemaRetrieveMessageJsonResponse)
            .isEqualTo(schemaRetrieveMessageJsonResponse)
    }
}
