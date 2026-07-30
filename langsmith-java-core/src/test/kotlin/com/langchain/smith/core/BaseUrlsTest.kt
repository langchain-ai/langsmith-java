package com.langchain.smith.core

import com.langchain.smith.core.http.HttpClient
import com.langchain.smith.core.http.HttpMethod
import com.langchain.smith.core.http.HttpRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.ValueSource
import org.mockito.junit.jupiter.MockitoExtension
import org.mockito.kotlin.mock

@ExtendWith(MockitoExtension::class)
internal class BaseUrlsTest {

    private val httpClient = mock<HttpClient>()

    private fun clientOptions(baseUrl: String) =
        ClientOptions.builder()
            .httpClient(httpClient)
            .baseUrl(baseUrl)
            .apiKey("My API Key")
            .tenantId("My Tenant ID")
            .build()

    private fun url(baseUrl: String, vararg pathSegments: String): String =
        HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(baseUrl)
            .apply { pathSegments.forEach { addPathSegment(it) } }
            .build()
            .url()

    @ParameterizedTest
    @CsvSource(
        // The /api/v1 suffix the Python and JS SDKs accept.
        "https://api.smith.langchain.com/api/v1, https://api.smith.langchain.com/",
        "https://api.smith.langchain.com/api/v1/, https://api.smith.langchain.com/",
        // A bare /api suffix, which is how self-hosted endpoints are configured.
        "https://api.smith.langchain.com/api, https://api.smith.langchain.com/",
        "https://api.smith.langchain.com/api/, https://api.smith.langchain.com/",
        // Self-hosted deployments under a path prefix.
        "https://self-hosted.example.com/langsmith/api/v1, https://self-hosted.example.com/langsmith/",
        "https://self-hosted.example.com/langsmith/api, https://self-hosted.example.com/langsmith/",
        "http://localhost:1984/api/v1, http://localhost:1984/",
    )
    fun normalizeBaseUrl_stripsApiPrefix(baseUrl: String, expected: String) {
        assertThat(normalizeBaseUrl(baseUrl)).isEqualTo(expected)
    }

    @ParameterizedTest
    @ValueSource(
        strings =
            [
                "https://api.smith.langchain.com",
                "http://localhost:1984",
                // A bare /v1 is not stripped, matching the Python and JS SDKs.
                "https://api.smith.langchain.com/v1",
                // /api only counts as a whole trailing path segment.
                "https://api.smith.langchain.com/api/runs",
                "https://api.example.com",
            ]
    )
    fun normalizeBaseUrl_leavesOtherUrlsUnchanged(baseUrl: String) {
        assertThat(normalizeBaseUrl(baseUrl)).isEqualTo(baseUrl)
    }

    @ParameterizedTest
    @ValueSource(strings = ["", "/api", "/api/v1"])
    fun handwrittenRequestsKeepTheConfiguredBaseUrl(suffix: String) {
        // GET /info and POST /runs/multipart are handwritten and root-relative. The prefix they sit
        // behind is deployment specific — /api on self-hosted, nothing on SaaS — so whatever was
        // configured has to survive verbatim.
        val options = clientOptions("https://host.example.com$suffix")

        assertThat(url(options.configuredBaseUrl(), "runs", "multipart"))
            .isEqualTo("https://host.example.com$suffix/runs/multipart")
        assertThat(url(options.configuredBaseUrl(), "info"))
            .isEqualTo("https://host.example.com$suffix/info")
    }

    @ParameterizedTest
    @ValueSource(strings = ["", "/api", "/api/v1"])
    fun generatedRequestsResolveAgainstTheRoot(suffix: String) {
        val options = clientOptions("https://host.example.com$suffix")

        assertThat(url(options.baseUrl(), "api", "v1", "runs", "query"))
            .isEqualTo("https://host.example.com/api/v1/runs/query")
    }

    @Test
    fun clientOptions_exposesBothFormsOfTheBaseUrl() {
        val options = clientOptions("https://self-hosted.example.com/api")

        assertThat(options.configuredBaseUrl()).isEqualTo("https://self-hosted.example.com/api")
        assertThat(options.baseUrl()).isEqualTo("https://self-hosted.example.com/")
    }

    @Test
    fun clientOptions_nullBaseUrlStillFallsBackToProduction() {
        val options =
            ClientOptions.builder()
                .httpClient(httpClient)
                .baseUrl(null)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()

        assertThat(options.baseUrl()).isEqualTo(ClientOptions.PRODUCTION_URL)
        assertThat(options.configuredBaseUrl()).isEqualTo(ClientOptions.PRODUCTION_URL)
    }

    @Test
    fun clientOptions_toBuilderRoundTripKeepsTheConfiguredBaseUrl() {
        // Normalizing in the getter rather than the setter keeps the configured value recoverable
        // across a round trip.
        val options = clientOptions("https://self-hosted.example.com/api").toBuilder().build()

        assertThat(options.configuredBaseUrl()).isEqualTo("https://self-hosted.example.com/api")
    }
}
