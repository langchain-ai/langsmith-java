// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.feedback.tokens

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class TokenCreateResponseTest {

    @Test
    fun ofFeedbackIngestTokenSchema() {
        val feedbackIngestTokenSchema =
            FeedbackIngestTokenSchema.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .feedbackKey("feedback_key")
                .url("url")
                .build()

        val tokenCreateResponse =
            TokenCreateResponse.ofFeedbackIngestTokenSchema(feedbackIngestTokenSchema)

        assertThat(tokenCreateResponse.feedbackIngestTokenSchema())
            .contains(feedbackIngestTokenSchema)
        assertThat(tokenCreateResponse.feedbackIngestTokenSchemas()).isEmpty
    }

    @Test
    fun ofFeedbackIngestTokenSchemaRoundtrip() {
        val jsonMapper = jsonMapper()
        val tokenCreateResponse =
            TokenCreateResponse.ofFeedbackIngestTokenSchema(
                FeedbackIngestTokenSchema.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .feedbackKey("feedback_key")
                    .url("url")
                    .build()
            )

        val roundtrippedTokenCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenCreateResponse),
                jacksonTypeRef<TokenCreateResponse>(),
            )

        assertThat(roundtrippedTokenCreateResponse).isEqualTo(tokenCreateResponse)
    }

    @Test
    fun ofFeedbackIngestTokenSchemas() {
        val feedbackIngestTokenSchemas =
            listOf(
                FeedbackIngestTokenSchema.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .feedbackKey("feedback_key")
                    .url("url")
                    .build()
            )

        val tokenCreateResponse =
            TokenCreateResponse.ofFeedbackIngestTokenSchemas(feedbackIngestTokenSchemas)

        assertThat(tokenCreateResponse.feedbackIngestTokenSchema()).isEmpty
        assertThat(tokenCreateResponse.feedbackIngestTokenSchemas())
            .contains(feedbackIngestTokenSchemas)
    }

    @Test
    fun ofFeedbackIngestTokenSchemasRoundtrip() {
        val jsonMapper = jsonMapper()
        val tokenCreateResponse =
            TokenCreateResponse.ofFeedbackIngestTokenSchemas(
                listOf(
                    FeedbackIngestTokenSchema.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .feedbackKey("feedback_key")
                        .url("url")
                        .build()
                )
            )

        val roundtrippedTokenCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenCreateResponse),
                jacksonTypeRef<TokenCreateResponse>(),
            )

        assertThat(roundtrippedTokenCreateResponse).isEqualTo(tokenCreateResponse)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val tokenCreateResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<TokenCreateResponse>())

        val e = assertThrows<LangsmithApiInvalidDataException> { tokenCreateResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
