// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.models.orgs.ttlsettings.TraceTier
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TracerSessionWithoutVirtualFieldsTest {

    @Test
    fun create() {
        val tracerSessionWithoutVirtualFields =
            TracerSessionWithoutVirtualFields.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .extra(JsonValue.from(mapOf<String, Any>()))
                .lastRunStartTimeLive(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .traceTier(TraceTier.LONGLIVED)
                .build()

        assertThat(tracerSessionWithoutVirtualFields.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tracerSessionWithoutVirtualFields.tenantId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tracerSessionWithoutVirtualFields.defaultDatasetId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tracerSessionWithoutVirtualFields.description()).contains("description")
        assertThat(tracerSessionWithoutVirtualFields.endTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tracerSessionWithoutVirtualFields._extra())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(tracerSessionWithoutVirtualFields.lastRunStartTimeLive())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tracerSessionWithoutVirtualFields.name()).contains("name")
        assertThat(tracerSessionWithoutVirtualFields.referenceDatasetId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tracerSessionWithoutVirtualFields.startTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tracerSessionWithoutVirtualFields.traceTier()).contains(TraceTier.LONGLIVED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tracerSessionWithoutVirtualFields =
            TracerSessionWithoutVirtualFields.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .extra(JsonValue.from(mapOf<String, Any>()))
                .lastRunStartTimeLive(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .traceTier(TraceTier.LONGLIVED)
                .build()

        val roundtrippedTracerSessionWithoutVirtualFields =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tracerSessionWithoutVirtualFields),
                jacksonTypeRef<TracerSessionWithoutVirtualFields>(),
            )

        assertThat(roundtrippedTracerSessionWithoutVirtualFields)
            .isEqualTo(tracerSessionWithoutVirtualFields)
    }
}
