// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import com.langsmith.api.core.JsonValue
import com.langsmith.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SessionUpdateParamsTest { // templates/JavaSDK/entities/params.ts:907:13 //
    // templates/JavaSDK/entities/params.ts:907:13 //
    // templates/JavaSDK/entities/params.ts:907:13

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/params.ts:907:13
    fun createSessionUpdateParams() { // templates/JavaSDK/entities/testing.ts:18:13
        SessionUpdateParams.builder() // templates/JavaSDK/entities/params.ts:916:21 //
            // templates/JavaSDK/entities/params.ts:916:16 //
            // templates/JavaSDK/entities/params.ts:916:16
            .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("string")
            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .extra(JsonValue.from(mapOf<String, Any>()))
            .name("string")
            .build()
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/params.ts:1011:17
    fun getBody() { // templates/JavaSDK/entities/testing.ts:18:13
        val params =
            SessionUpdateParams.builder() // templates/JavaSDK/entities/params.ts:1043:10 //
                // templates/JavaSDK/entities/params.ts:1043:10 //
                // templates/JavaSDK/entities/params.ts:1042:16 //
                // templates/JavaSDK/entities/params.ts:1042:16
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("string")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .extra(JsonValue.from(mapOf<String, Any>()))
                .name("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.defaultDatasetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.endTime()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.extra()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.name()).isEqualTo("string")
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun getBodyWithoutOptionalFields() { // templates/JavaSDK/entities/testing.ts:18:13
        val params =
            SessionUpdateParams.builder() // templates/JavaSDK/entities/params.ts:1043:10 //
                // templates/JavaSDK/entities/params.ts:1043:10 //
                // templates/JavaSDK/entities/params.ts:1042:16 //
                // templates/JavaSDK/entities/params.ts:1042:16
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun getPathParam() { // templates/JavaSDK/entities/testing.ts:18:13
        val params =
            SessionUpdateParams.builder() // templates/JavaSDK/entities/params.ts:1072:10 //
                // templates/JavaSDK/entities/params.ts:1072:10 //
                // templates/JavaSDK/entities/params.ts:1071:16 //
                // templates/JavaSDK/entities/params.ts:1071:16
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "sessionId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
