package com.langchain.smith.services.blocking.runs

import com.github.tomakehurst.wiremock.client.WireMock.aResponse
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.errors.SseException
import com.langchain.smith.models.runs.streaming.StreamingQueryV2Params
import kotlin.streams.toList
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class StreamingServiceItemsTest {

    private fun data(patches: String) = "event: data\ndata: $patches\n\n"

    private val end = "event: end\ndata: \n\n"

    private fun sse(vararg events: String) =
        aResponse()
            .withHeader("Content-Type", "text/event-stream")
            .withBody(events.joinToString(""))

    private fun client(wmRuntimeInfo: WireMockRuntimeInfo) =
        LangsmithOkHttpClient.builder()
            .apiKey("My API Key")
            .baseUrl(wmRuntimeInfo.httpBaseUrl)
            .maxRetries(0)
            .build()

    @Test
    fun `yields items as they arrive and follows the cursor`(wmRuntimeInfo: WireMockRuntimeInfo) {
        stubFor(
            post(urlPathEqualTo("/api/v2/runs/query"))
                .atPriority(2)
                .willReturn(
                    sse(
                        data(
                            """[{"op":"add","path":"","value":{"items":[{"id":"run-1","name":"a"}],"next_cursor":null}}]"""
                        ),
                        data(
                            """[{"op":"add","path":"/items/-","value":{"id":"run-2","name":"b"}},{"op":"add","path":"/items/0/extra","value":1}]"""
                        ),
                        data(
                            """[{"op":"add","path":"/items/-","value":{"id":"run-3","name":"c"}},{"op":"replace","path":"/next_cursor","value":"abc"}]"""
                        ),
                        end,
                    )
                )
        )
        stubFor(
            post(urlPathEqualTo("/api/v2/runs/query"))
                .atPriority(1)
                .withRequestBody(matchingJsonPath("$.cursor", equalTo("abc")))
                .willReturn(
                    sse(
                        data(
                            """[{"op":"add","path":"","value":{"items":[{"id":"run-4","name":"d"}],"next_cursor":null}}]"""
                        ),
                        data("""[{"op":"replace","path":"/next_cursor","value":null}]"""),
                        end,
                    )
                )
        )

        val got =
            client(wmRuntimeInfo)
                .runs()
                .streaming()
                .queryV2StreamingItems(
                    StreamingQueryV2Params.builder().aiSearch("question about langchain").build()
                )
                .use { response ->
                    response.stream().map { "${it.id().get()}:${it.name().get()}" }.toList()
                }

        assertThat(got).containsExactly("run-1:a", "run-2:b", "run-3:c", "run-4:d")
        verify(
            2,
            postRequestedFor(urlPathEqualTo("/api/v2/runs/query"))
                .withHeader("Accept", equalTo("text/event-stream")),
        )
        verify(
            1,
            postRequestedFor(urlPathEqualTo("/api/v2/runs/query"))
                .withRequestBody(matchingJsonPath("$.cursor", equalTo("abc")))
                .withRequestBody(
                    matchingJsonPath("$.ai_search", equalTo("question about langchain"))
                ),
        )
    }

    @Test
    fun `yields indexed inserts in their final order and ignores deeper paths`(
        wmRuntimeInfo: WireMockRuntimeInfo
    ) {
        stubFor(
            post(urlPathEqualTo("/api/v2/runs/query"))
                .willReturn(
                    sse(
                        data(
                            """[{"op":"add","path":"","value":{"items":[],"next_cursor":null}}]"""
                        ),
                        data(
                            """[{"op":"add","path":"/items/0","value":{"id":"run-1"}},{"op":"add","path":"/items/0","value":{"id":"run-2"}}]"""
                        ),
                        data(
                            """[{"op":"add","path":"/items/1/extra","value":{}},{"op":"replace","path":"/next_cursor","value":""}]"""
                        ),
                        end,
                    )
                )
        )

        val got =
            client(wmRuntimeInfo).runs().streaming().queryV2StreamingItems().use { response ->
                response.stream().map { it.id().get() }.toList()
            }

        assertThat(got).containsExactly("run-2", "run-1")
        verify(1, postRequestedFor(urlPathEqualTo("/api/v2/runs/query")))
    }

    @Test
    fun `yields traces`(wmRuntimeInfo: WireMockRuntimeInfo) {
        stubFor(
            post(urlPathEqualTo("/api/v2/traces/query"))
                .willReturn(
                    sse(
                        data(
                            """[{"op":"add","path":"","value":{"items":[{"root_run":{"id":"run-1"}}],"next_cursor":null}}]"""
                        ),
                        data(
                            """[{"op":"add","path":"/items/-","value":{"root_run":{"id":"run-2"}}},{"op":"add","path":"/items/0/trace_aggregates","value":{"total_tokens":3}}]"""
                        ),
                        end,
                    )
                )
        )

        val got =
            client(wmRuntimeInfo).traces().streaming().queryStreamingItems().use { response ->
                response.stream().map { it.rootRun().get().id().get() }.toList()
            }

        assertThat(got).containsExactly("run-1", "run-2")
    }

    @Test
    fun `stops fetching pages once closed`(wmRuntimeInfo: WireMockRuntimeInfo) {
        stubFor(
            post(urlPathEqualTo("/api/v2/runs/query"))
                .willReturn(
                    sse(
                        data(
                            """[{"op":"add","path":"","value":{"items":[{"id":"run-1"},{"id":"run-2"}],"next_cursor":"abc"}}]"""
                        ),
                        end,
                    )
                )
        )

        val response = client(wmRuntimeInfo).runs().streaming().queryV2StreamingItems()
        val seen = mutableListOf<String>()
        response.stream().forEach {
            seen.add(it.id().get())
            if (it.id().get() == "run-1") response.close()
        }

        assertThat(seen).containsExactly("run-1")
        verify(1, postRequestedFor(urlPathEqualTo("/api/v2/runs/query")))

        val closedBeforeUse = client(wmRuntimeInfo).runs().streaming().queryV2StreamingItems()
        closedBeforeUse.close()
        assertThat(closedBeforeUse.stream().toList()).isEmpty()
        verify(1, postRequestedFor(urlPathEqualTo("/api/v2/runs/query")))
    }

    @Test
    fun `stops on an empty page`(wmRuntimeInfo: WireMockRuntimeInfo) {
        stubFor(
            post(urlPathEqualTo("/api/v2/threads/query"))
                .willReturn(
                    sse(
                        data(
                            """[{"op":"add","path":"","value":{"items":[],"next_cursor":null}}]"""
                        ),
                        end,
                    )
                )
        )

        val got =
            client(wmRuntimeInfo).threads().streaming().queryStreamingItems().use {
                it.stream().toList()
            }

        assertThat(got).isEmpty()
        verify(1, postRequestedFor(urlPathEqualTo("/api/v2/threads/query")))
    }

    @Test
    fun `throws on a stream error after delivering earlier items`(
        wmRuntimeInfo: WireMockRuntimeInfo
    ) {
        stubFor(
            post(urlPathEqualTo("/api/v2/runs/query"))
                .willReturn(
                    sse(
                        data(
                            """[{"op":"add","path":"","value":{"items":[{"id":"run-1"}],"next_cursor":null}}]"""
                        ),
                        "event: error\ndata: {\"detail\":\"boom\"}\n\n",
                    )
                )
        )

        val got = mutableListOf<String>()
        assertThatThrownBy {
                client(wmRuntimeInfo).runs().streaming().queryV2StreamingItems().use { response ->
                    response.stream().forEach { got.add(it.id().get()) }
                }
            }
            .isInstanceOf(SseException::class.java)
        assertThat(got).containsExactly("run-1")
    }
}
