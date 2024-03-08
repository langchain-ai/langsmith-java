// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import com.langsmith.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RunQueryCreateParamsTest { // templates/JavaSDK/entities/params.ts:907:13 //
    // templates/JavaSDK/entities/params.ts:907:13 //
    // templates/JavaSDK/entities/params.ts:907:13

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/params.ts:907:13
    fun createRunQueryCreateParams() { // templates/JavaSDK/entities/testing.ts:18:13
        RunQueryCreateParams.builder() // templates/JavaSDK/entities/params.ts:916:21 //
            // templates/JavaSDK/entities/params.ts:916:16 //
            // templates/JavaSDK/entities/params.ts:916:16
            .id(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .cursor("string")
            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .error(true)
            .executionOrder(123L)
            .filter("string")
            .isRoot(true)
            .limit(123L)
            .parentRun("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .query("string")
            .referenceExample(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .runType(RunQueryCreateParams.RunType.TOOL)
            .select(listOf(RunQueryCreateParams.RunSelect.ID))
            .session(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .trace("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/params.ts:1011:17
    fun getBody() { // templates/JavaSDK/entities/testing.ts:18:13
        val params =
            RunQueryCreateParams.builder() // templates/JavaSDK/entities/params.ts:1043:10 //
                // templates/JavaSDK/entities/params.ts:1043:10 //
                // templates/JavaSDK/entities/params.ts:1042:16 //
                // templates/JavaSDK/entities/params.ts:1042:16
                .id(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .cursor("string")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .error(true)
                .executionOrder(123L)
                .filter("string")
                .isRoot(true)
                .limit(123L)
                .parentRun("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .query("string")
                .referenceExample(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .runType(RunQueryCreateParams.RunType.TOOL)
                .select(listOf(RunQueryCreateParams.RunSelect.ID))
                .session(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .trace("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.id()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.cursor()).isEqualTo("string")
        assertThat(body.endTime()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.error()).isEqualTo(true)
        assertThat(body.executionOrder()).isEqualTo(123L)
        assertThat(body.filter()).isEqualTo("string")
        assertThat(body.isRoot()).isEqualTo(true)
        assertThat(body.limit()).isEqualTo(123L)
        assertThat(body.parentRun()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.query()).isEqualTo("string")
        assertThat(body.referenceExample())
            .isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.runType()).isEqualTo(RunQueryCreateParams.RunType.TOOL)
        assertThat(body.select()).isEqualTo(listOf(RunQueryCreateParams.RunSelect.ID))
        assertThat(body.session()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.startTime()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.trace()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun getBodyWithoutOptionalFields() { // templates/JavaSDK/entities/testing.ts:18:13
        val params =
            RunQueryCreateParams.builder()
                .build() // templates/JavaSDK/entities/params.ts:1042:16 //
        // templates/JavaSDK/entities/params.ts:1042:16
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
