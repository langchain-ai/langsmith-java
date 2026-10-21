package com.langchain.smith.services

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.HttpClient
import com.langchain.smith.core.http.HttpRequest
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.models.agents.AgentListParams
import com.langchain.smith.services.async.AgentServiceAsyncImpl
import com.langchain.smith.services.blocking.AgentServiceImpl
import java.time.Duration
import java.util.concurrent.CompletableFuture
import java.util.concurrent.CopyOnWriteArrayList
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

internal class AgentPaginationTest {

    @ParameterizedTest
    @ValueSource(booleans = [false, true])
    fun nextPagePreservesRequestOptions(async: Boolean) {
        val requests = CopyOnWriteArrayList<HttpRequest>()
        val options = CopyOnWriteArrayList<RequestOptions>()
        val httpClient =
            object : HttpClient {
                override fun execute(
                    request: HttpRequest,
                    requestOptions: RequestOptions,
                ): HttpResponse {
                    requests.add(request)
                    options.add(requestOptions)
                    val json =
                        if (requests.size == 1) {
                            """{"items":[{"id":"first"}],"next_cursor":"page-two"}"""
                        } else {
                            """{"items":[{"id":"second"}]}"""
                        }
                    return object : HttpResponse {
                        override fun statusCode() = 200

                        override fun headers() = Headers.builder().build()

                        override fun body() = json.byteInputStream()

                        override fun close() {}
                    }
                }

                override fun executeAsync(
                    request: HttpRequest,
                    requestOptions: RequestOptions,
                ): CompletableFuture<HttpResponse> =
                    CompletableFuture.completedFuture(execute(request, requestOptions))

                override fun close() {}
            }
        val clientOptions =
            ClientOptions.builder()
                .httpClient(httpClient)
                .baseUrl("https://example.com")
                .apiKey("test-key")
                .responseValidation(true)
                .timeout(Duration.ofSeconds(90))
                .build()
        val requestOptions =
            RequestOptions.builder()
                .responseValidation(false)
                .timeout(Duration.ofSeconds(5))
                .build()
        val params = AgentListParams.builder().pageSize(1L).build()

        val secondPageItems =
            if (async) {
                AgentServiceAsyncImpl(clientOptions)
                    .list(params, requestOptions)
                    .get()
                    .toBuilder()
                    .build()
                    .nextPage()
                    .get()
                    .items()
            } else {
                AgentServiceImpl(clientOptions)
                    .list(params, requestOptions)
                    .toBuilder()
                    .build()
                    .nextPage()
                    .items()
            }

        assertThat(secondPageItems.map { it.id() }).containsExactly("second")
        assertThat(requests).hasSize(2)
        assertThat(requests[1].queryParams.values("cursor")).containsExactly("page-two")
        assertThat(requests[1].queryParams.values("page_size")).containsExactly("1")
        assertThat(options).hasSize(2)
        options.forEach {
            assertThat(it.timeout!!.request()).isEqualTo(Duration.ofSeconds(5))
            assertThat(it.responseValidation).isFalse()
        }
    }
}
