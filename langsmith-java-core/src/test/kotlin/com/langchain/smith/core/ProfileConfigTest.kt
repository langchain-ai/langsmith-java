package com.langchain.smith.core

import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.HttpClient
import com.langchain.smith.core.http.HttpMethod
import com.langchain.smith.core.http.HttpRequest
import com.langchain.smith.core.http.HttpResponse
import com.sun.net.httpserver.HttpServer
import java.io.ByteArrayInputStream
import java.io.InputStream
import java.net.InetSocketAddress
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Path
import java.time.Clock
import java.time.Instant
import java.time.ZoneOffset
import java.util.concurrent.CompletableFuture
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.io.TempDir

internal class ProfileConfigTest {

    @TempDir lateinit var tempDir: Path

    private val clock = Clock.fixed(Instant.parse("2026-01-01T00:00:00Z"), ZoneOffset.UTC)

    @Test
    fun loadProfileClientConfigUsesCurrentProfile() {
        val configPath =
            writeConfig(
                """
                {
                  "current_profile": "dev",
                  "profiles": {
                    "default": {
                      "api_url": "https://default.example.com",
                      "api_key": "default-key"
                    },
                    "dev": {
                      "api_url": "https://dev.example.com",
                      "api_key": "dev-key",
                      "workspace_id": "workspace-id"
                    }
                  }
                }
                """
                    .trimIndent()
            )

        val config =
            loadProfileClientConfig(
                jsonMapper = jsonMapper(),
                clock = clock,
                configPathOverride = configPath,
            )

        assertThat(config?.baseUrl).isEqualTo("https://dev.example.com")
        assertThat(config?.apiKey).isEqualTo("dev-key")
        assertThat(config?.tenantId).isEqualTo("workspace-id")
    }

    @Test
    fun loadProfileClientConfigPrefersOauthAccessToken() {
        val configPath =
            writeConfig(
                """
                {
                  "profiles": {
                    "default": {
                      "api_url": "https://profile.example.com",
                      "api_key": "profile-key",
                      "oauth": {
                        "access_token": "profile-access-token"
                      }
                    }
                  }
                }
                """
                    .trimIndent()
            )

        val config =
            loadProfileClientConfig(
                jsonMapper = jsonMapper(),
                clock = clock,
                configPathOverride = configPath,
            )

        assertThat(config?.oauthAccessToken).isEqualTo("profile-access-token")
        assertThat(config?.apiKey).isEqualTo("profile-key")
    }

    @Test
    fun profileAuthRefreshesExpiredOauthTokenBeforeRequest() {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        var requestBody = ""
        server.createContext("/oauth/token") { exchange ->
            requestBody =
                exchange.requestBody.bufferedReader(StandardCharsets.UTF_8).use { it.readText() }
            val response =
                """
                {
                  "access_token": "new-access-token",
                  "refresh_token": "new-refresh-token",
                  "expires_in": 3600,
                  "token_type": "Bearer",
                  "bearer_token": "ignored"
                }
                """
                    .trimIndent()
                    .toByteArray(StandardCharsets.UTF_8)
            exchange.responseHeaders.add("Content-Type", "application/json")
            exchange.sendResponseHeaders(200, response.size.toLong())
            exchange.responseBody.use { it.write(response) }
        }
        server.start()
        try {
            val port = server.address.port
            val configPath =
                writeConfig(
                    """
                    {
                      "profiles": {
                        "default": {
                          "api_url": "http://127.0.0.1:$port/api/v1/",
                          "oauth": {
                            "access_token": "old-access-token",
                            "refresh_token": "old-refresh-token",
                            "expires_at": "2000-01-01T00:00:00Z",
                            "token_type": "Bearer",
                            "bearer_token": "old-bearer-token"
                          }
                        }
                      }
                    }
                    """
                        .trimIndent()
                )

            val config =
                loadProfileClientConfig(
                    jsonMapper = jsonMapper(),
                    clock = clock,
                    configPathOverride = configPath,
                )

            assertThat(config?.oauthAccessToken).isEqualTo("old-access-token")
            assertThat(config?.oauthRefreshToken).isEqualTo("old-refresh-token")
            assertThat(requestBody).isEmpty()

            val authHeader = config?.profileAuth?.authHeader()

            assertThat(authHeader).isEqualTo("Authorization" to "Bearer new-access-token")
            assertThat(requestBody).contains("grant_type=refresh_token")
            assertThat(requestBody).contains("client_id=langsmith-cli")
            assertThat(requestBody).contains("refresh_token=old-refresh-token")
            val refreshedConfig = String(Files.readAllBytes(configPath), StandardCharsets.UTF_8)
            assertThat(refreshedConfig).contains("new-refresh-token")
            assertThat(refreshedConfig).doesNotContain("token_type")
            assertThat(refreshedConfig).doesNotContain("bearer_token")

            val capturedAuthHeaders = mutableListOf<String?>()
            val profileHttpClient =
                ProfileAuthHttpClient(
                    object : HttpClient {
                        override fun execute(
                            request: HttpRequest,
                            requestOptions: RequestOptions,
                        ): HttpResponse {
                            capturedAuthHeaders.add(
                                request.headers.values("Authorization").firstOrNull()
                            )
                            return emptyResponse()
                        }

                        override fun executeAsync(
                            request: HttpRequest,
                            requestOptions: RequestOptions,
                        ): CompletableFuture<HttpResponse> =
                            CompletableFuture.completedFuture(execute(request, requestOptions))

                        override fun close() {}
                    },
                    config!!.profileAuth!!,
                )
            val staleProfileRequest =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl("http://127.0.0.1:$port/api/v1/")
                    .replaceHeaders("Authorization", "Bearer old-access-token")
                    .build()

            profileHttpClient.execute(staleProfileRequest).close()
            profileHttpClient.execute(staleProfileRequest).close()

            assertThat(capturedAuthHeaders)
                .containsExactly("Bearer new-access-token", "Bearer new-access-token")
        } finally {
            server.stop(0)
        }
    }

    private fun emptyResponse(): HttpResponse =
        object : HttpResponse {
            override fun statusCode(): Int = 200

            override fun headers(): Headers = Headers.builder().build()

            override fun body(): InputStream = ByteArrayInputStream(ByteArray(0))

            override fun close() {}
        }

    private fun writeConfig(contents: String): Path {
        val configPath = tempDir.resolve("config.json")
        Files.write(configPath, contents.toByteArray(StandardCharsets.UTF_8))
        return configPath
    }
}
