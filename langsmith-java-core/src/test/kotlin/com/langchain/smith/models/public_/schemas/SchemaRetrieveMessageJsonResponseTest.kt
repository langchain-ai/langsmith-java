// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.schemas

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
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
