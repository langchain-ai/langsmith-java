// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetTest { // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/objects.ts:645:15
    fun createDataset() { // templates/JavaSDK/entities/testing.ts:18:13
        val dataset =
            Dataset.builder() // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:656:16 //
                // templates/JavaSDK/entities/objects.ts:656:16
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .exampleCount(123L)
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("string")
                .sessionCount(123L)
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dataType(Dataset.DataType.KV)
                .description("string")
                .lastSessionStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(dataset).isNotNull
        assertThat(dataset.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(dataset.exampleCount()).isEqualTo(123L)
        assertThat(dataset.modifiedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataset.name()).isEqualTo("string")
        assertThat(dataset.sessionCount()).isEqualTo(123L)
        assertThat(dataset.tenantId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(dataset.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataset.dataType()).contains(Dataset.DataType.KV)
        assertThat(dataset.description()).contains("string")
        assertThat(dataset.lastSessionStartTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
