package com.langchain.smith.services.blocking

import com.github.tomakehurst.wiremock.client.WireMock.equalToJson
import com.github.tomakehurst.wiremock.client.WireMock.okJson
import com.github.tomakehurst.wiremock.client.WireMock.patch
import com.github.tomakehurst.wiremock.client.WireMock.patchRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.sessions.SessionCreateParams
import com.langchain.smith.models.sessions.SessionCreateV2Params
import com.langchain.smith.models.sessions.SessionUpdateParams
import com.langchain.smith.models.sessions.SessionUpdateV2Params
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.parallel.ResourceLock
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class SessionWriteContractTest {
    @ParameterizedTest
    @ValueSource(booleans = [false, true])
    fun legacyWritesKeepV1(async: Boolean, server: WireMockRuntimeInfo) {
        val response = """{"id":"project","name":"Example","trace_tier":"longlived"}"""
        stubFor(post(urlPathEqualTo("/api/v1/sessions")).willReturn(okJson(response)))
        stubFor(patch(urlPathEqualTo("/api/v1/sessions/project")).willReturn(okJson(response)))
        val client =
            LangsmithOkHttpClient.builder().apiKey("test-key").baseUrl(server.httpBaseUrl).build()
        try {
            val create =
                SessionCreateParams.builder()
                    .name("Example")
                    .traceTier(SessionCreateParams.TraceTier.LONGLIVED)
                    .build()
            val update =
                SessionUpdateParams.builder()
                    .sessionId("project")
                    .name("Example")
                    .traceTier(SessionUpdateParams.TraceTier.LONGLIVED)
                    .build()
            val created =
                if (async) client.async().sessions().create(create).get()
                else client.sessions().create(create)
            val updated =
                if (async) client.async().sessions().update(update).get()
                else client.sessions().update(update)
            assertThat(created.traceTier().get().toString()).isEqualTo("longlived")
            assertThat(updated.traceTier().get().toString()).isEqualTo("longlived")
            val body = equalToJson("""{"name":"Example","trace_tier":"longlived"}""")
            verify(1, postRequestedFor(urlPathEqualTo("/api/v1/sessions")).withRequestBody(body))
            verify(
                1,
                patchRequestedFor(urlPathEqualTo("/api/v1/sessions/project")).withRequestBody(body),
            )
        } finally {
            client.close()
        }
    }

    @ParameterizedTest
    @ValueSource(booleans = [false, true])
    fun explicitV2WritesUseV2(async: Boolean, server: WireMockRuntimeInfo) {
        val response =
            """{"id":"project","name":"Example","type":"PROJECT","trace_tier":"LONG_LIVED"}"""
        stubFor(post(urlPathEqualTo("/api/v2/sessions")).willReturn(okJson(response)))
        stubFor(patch(urlPathEqualTo("/api/v2/sessions/project")).willReturn(okJson(response)))
        val client =
            LangsmithOkHttpClient.builder().apiKey("test-key").baseUrl(server.httpBaseUrl).build()
        try {
            val create =
                SessionCreateV2Params.builder()
                    .type(SessionCreateV2Params.Type.PROJECT)
                    .name("Example")
                    .traceTier(SessionCreateV2Params.TraceTier.LONG_LIVED)
                    .build()
            val update =
                SessionUpdateV2Params.builder()
                    .sessionId("project")
                    .name("Example")
                    .traceTier(SessionUpdateV2Params.TraceTier.LONG_LIVED)
                    .build()
            val created =
                if (async) client.async().sessions().createV2(create).get()
                else client.sessions().createV2(create)
            val updated =
                if (async) client.async().sessions().updateV2(update).get()
                else client.sessions().updateV2(update)
            assertThat(created.traceTier().get().toString()).isEqualTo("LONG_LIVED")
            assertThat(updated.traceTier().get().toString()).isEqualTo("LONG_LIVED")
            verify(
                1,
                postRequestedFor(urlPathEqualTo("/api/v2/sessions"))
                    .withRequestBody(
                        equalToJson(
                            """{"type":"PROJECT","name":"Example","trace_tier":"LONG_LIVED"}"""
                        )
                    ),
            )
            verify(
                1,
                patchRequestedFor(urlPathEqualTo("/api/v2/sessions/project"))
                    .withRequestBody(
                        equalToJson("""{"name":"Example","trace_tier":"LONG_LIVED"}""")
                    ),
            )
        } finally {
            client.close()
        }
    }
}
