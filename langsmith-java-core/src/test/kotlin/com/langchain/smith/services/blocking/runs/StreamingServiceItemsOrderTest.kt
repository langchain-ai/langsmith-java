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
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import java.util.concurrent.CopyOnWriteArrayList
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import kotlin.streams.toList
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class StreamingServiceItemsOrderTest {

    private fun data(patches: String) = "event: data\ndata: $patches\n\n"

    private val end = "event: end\ndata: \n\n"

    private fun sse(vararg events: String) =
        aResponse()
            .withHeader("Content-Type", "text/event-stream")
            .withBody(events.joinToString(""))

    private fun client(baseUrl: String) =
        LangsmithOkHttpClient.builder().apiKey("My API Key").baseUrl(baseUrl).maxRetries(0).build()

    private fun collect(wmRuntimeInfo: WireMockRuntimeInfo): List<String> =
        client(wmRuntimeInfo.httpBaseUrl).runs().streaming().queryV2StreamingItems().use { response
            ->
            response.stream().map { it.id().get() }.toList()
        }

    /**
     * Serves [first] and flushes it, then calls [pause] (which decides when to go on) and serves
     * [rest], so that a test can look at what the client has yielded in between.
     */
    private fun <R> withPausingServer(
        first: String,
        rest: String,
        pause: () -> Unit,
        body: (String) -> R,
    ): R {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        server.createContext("/api/v2/runs/query") { exchange ->
            exchange.responseHeaders.add("Content-Type", "text/event-stream")
            exchange.sendResponseHeaders(200, 0)
            exchange.responseBody.use { out ->
                out.write(first.toByteArray())
                out.flush()
                pause()
                out.write(rest.toByteArray())
                out.flush()
            }
        }
        server.start()
        try {
            return body("http://127.0.0.1:${server.address.port}")
        } finally {
            server.stop(0)
        }
    }

    @Test
    fun `append only page yields the first item before the stream ends`() {
        val yielded = CopyOnWriteArrayList<String>()
        val firstSeen = CountDownLatch(1)
        var seenBeforeRest = -1
        val ids =
            withPausingServer(
                first =
                    data(
                        """[{"op":"add","path":"","value":{"items":[{"id":"run-1"}],"next_cursor":null}}]"""
                    ),
                rest =
                    data("""[{"op":"add","path":"/items/-","value":{"id":"run-2"}}]""") +
                        data("""[{"op":"add","path":"/items/-","value":{"id":"run-3"}}]""") +
                        end,
                pause = {
                    // Held until the client yielded run-1, which can only happen before the stream
                    // ends.
                    firstSeen.await(5, TimeUnit.SECONDS)
                    seenBeforeRest = yielded.size
                },
            ) { baseUrl ->
                client(baseUrl).runs().streaming().queryV2StreamingItems().use { response ->
                    response.stream().forEach {
                        yielded.add(it.id().get())
                        firstSeen.countDown()
                    }
                }
                yielded.toList()
            }

        assertThat(seenBeforeRest).isEqualTo(1)
        assertThat(ids).containsExactly("run-1", "run-2", "run-3")
    }

    @Test
    fun `indexed inserts are yielded in final order once the page ends`() {
        val yielded = CopyOnWriteArrayList<String>()
        var seenBeforeRest = -1
        val ids =
            withPausingServer(
                first =
                    data("""[{"op":"add","path":"","value":{"items":[],"next_cursor":null}}]""") +
                        data("""[{"op":"add","path":"/items/0","value":{"id":"B"}}]"""),
                rest = data("""[{"op":"add","path":"/items/0","value":{"id":"A"}}]""") + end,
                pause = {
                    Thread.sleep(1500)
                    seenBeforeRest = yielded.size
                },
            ) { baseUrl ->
                client(baseUrl).runs().streaming().queryV2StreamingItems().use { response ->
                    response.stream().forEach { yielded.add(it.id().get()) }
                }
                yielded.toList()
            }

        // B was inserted at 0 and A then went before it: nothing is yielded before the page ends.
        assertThat(seenBeforeRest).isEqualTo(0)
        assertThat(ids).containsExactly("A", "B")
    }

    @Test
    fun `follows the cursor across an append page and an indexed page and ignores deeper patches`(
        wmRuntimeInfo: WireMockRuntimeInfo
    ) {
        stubFor(
            post(urlPathEqualTo("/api/v2/runs/query"))
                .atPriority(2)
                .willReturn(
                    sse(
                        data(
                            """[{"op":"add","path":"","value":{"items":[{"id":"run-1"}],"next_cursor":null}}]"""
                        ),
                        data(
                            """[{"op":"add","path":"/items/-","value":{"id":"run-2"}},{"op":"add","path":"/items/0/name","value":"late"}]"""
                        ),
                        data("""[{"op":"replace","path":"/next_cursor","value":"abc"}]"""),
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
                            """[{"op":"add","path":"","value":{"items":[],"next_cursor":null}}]"""
                        ),
                        data(
                            """[{"op":"add","path":"/items/0","value":{"id":"run-4"}},{"op":"add","path":"/items/0/name","value":"late"}]"""
                        ),
                        data(
                            """[{"op":"add","path":"/items/0","value":{"id":"run-3"}},{"op":"replace","path":"/next_cursor","value":null}]"""
                        ),
                        end,
                    )
                )
        )

        assertThat(collect(wmRuntimeInfo)).containsExactly("run-1", "run-2", "run-3", "run-4")
        verify(2, postRequestedFor(urlPathEqualTo("/api/v2/runs/query")))
        verify(
            1,
            postRequestedFor(urlPathEqualTo("/api/v2/runs/query"))
                .withRequestBody(matchingJsonPath("$.cursor", equalTo("abc"))),
        )
    }

    @Test
    fun `replace and remove apply to items not yielded yet`(wmRuntimeInfo: WireMockRuntimeInfo) {
        stubFor(
            post(urlPathEqualTo("/api/v2/runs/query"))
                .willReturn(
                    sse(
                        data(
                            """[{"op":"add","path":"","value":{"items":[],"next_cursor":null}}]"""
                        ),
                        data(
                            """[{"op":"add","path":"/items/0","value":{"id":"A"}},{"op":"add","path":"/items/1","value":{"id":"B"}},{"op":"add","path":"/items/2","value":{"id":"C"}}]"""
                        ),
                        data(
                            """[{"op":"replace","path":"/items/1","value":{"id":"B2"}},{"op":"remove","path":"/items/0"}]"""
                        ),
                        end,
                    )
                )
        )

        assertThat(collect(wmRuntimeInfo)).containsExactly("B2", "C")
    }

    @Test
    fun `replace of an item already yielded is ignored and later inserts follow it`(
        wmRuntimeInfo: WireMockRuntimeInfo
    ) {
        stubFor(
            post(urlPathEqualTo("/api/v2/runs/query"))
                .willReturn(
                    sse(
                        data(
                            """[{"op":"add","path":"","value":{"items":[{"id":"R1"}],"next_cursor":null}}]"""
                        ),
                        data("""[{"op":"replace","path":"/items/0","value":{"id":"R1x"}}]"""),
                        data("""[{"op":"add","path":"/items/1","value":{"id":"D"}}]"""),
                        data("""[{"op":"add","path":"/items/1","value":{"id":"E"}}]"""),
                        end,
                    )
                )
        )

        assertThat(collect(wmRuntimeInfo)).containsExactly("R1", "E", "D")
    }
}
