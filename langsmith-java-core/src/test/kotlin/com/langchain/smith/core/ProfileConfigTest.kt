package com.langchain.smith.core

import com.fasterxml.jackson.databind.node.ObjectNode
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.HttpClient
import com.langchain.smith.core.http.HttpMethod
import com.langchain.smith.core.http.HttpRequest
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.errors.LangChainException
import com.sun.net.httpserver.HttpServer
import java.io.ByteArrayInputStream
import java.io.InputStream
import java.net.InetSocketAddress
import java.net.SocketTimeoutException
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.attribute.FileTime
import java.nio.file.attribute.PosixFilePermissions
import java.time.Clock
import java.time.Duration
import java.time.Instant
import java.time.ZoneOffset
import java.util.concurrent.CompletableFuture
import java.util.concurrent.CountDownLatch
import java.util.concurrent.ExecutionException
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicInteger
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Assumptions.assumeTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.io.TempDir

internal class ProfileConfigTest {

    @TempDir lateinit var tempDir: Path

    @Test
    fun deleteProfileRefreshLockDirRetriesTransientFailures() {
        val lockPath = Files.createDirectory(tempDir.resolve("config.json.oauth.lock.lock"))
        Files.write(
            lockPath.resolve("created_at"),
            "${Instant.now()}\nowner\n".toByteArray(StandardCharsets.UTF_8),
        )
        val failures = AtomicInteger(2)

        val removed =
            deleteProfileRefreshLockDir(lockPath) { path ->
                if (failures.getAndDecrement() > 0) {
                    throw java.nio.file.FileSystemException(path.toString(), null, "in use")
                }
                Files.deleteIfExists(path)
            }

        assertThat(removed).isTrue()
        assertThat(lockPath).doesNotExist()
    }

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
    fun profileAuthReadsApiKeyFromApiKeyEnv() {
        val configPath =
            writeConfig(
                """
                {
                  "current_profile": "prod",
                  "profiles": {
                    "prod": { "api_key_env": "MY_LANGSMITH_KEY", "api_key_cmd": "never-run" }
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
                getenv = mapOf("MY_LANGSMITH_KEY" to "  env-ref-key\n")::get,
            )

        assertThat(config?.apiKey).isNull()
        assertThat(config?.profileAuth?.authHeader()).isEqualTo("X-API-Key" to "env-ref-key")
    }

    @Test
    fun profileApiKeyWinsOverApiKeyEnv() {
        val configPath =
            writeConfig(
                """
                {
                  "profiles": {
                    "default": { "api_key": "profile-key", "api_key_env": "MY_LANGSMITH_KEY" }
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
                getenv = { null },
            )

        assertThat(config?.apiKey).isEqualTo("profile-key")
        assertThat(config?.profileAuth).isNull()
    }

    @Test
    fun profileAuthFailsRequestsWhenApiKeyRefCannotBeResolved() {
        val cases =
            mapOf(
                """{ "api_key_env": "MY_UNSET_LANGSMITH_KEY" }""" to
                    "LangSmith profile \"prod\" reads its API key from \$MY_UNSET_LANGSMITH_KEY, which is not set",
                """{ "api_key_cmd": "op read op://vault/langsmith/key" }""" to
                    "LangSmith profile \"prod\" gets its API key from a command (api_key_cmd), " +
                        "which the Java SDK does not support yet",
            )
        for ((profile, message) in cases) {
            val configPath =
                writeConfig("""{ "current_profile": "prod", "profiles": { "prod": $profile } }""")
            val config =
                loadProfileClientConfig(
                    jsonMapper = jsonMapper(),
                    clock = clock,
                    configPathOverride = configPath,
                    getenv = { null },
                )
            val profileAuth = config!!.profileAuth!!
            assertThat(profileAuth.currentAuthHeader()).isNull()

            val sentRequests = mutableListOf<HttpRequest>()
            val profileHttpClient =
                ProfileAuthHttpClient(recordingHttpClient(sentRequests), profileAuth)
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl("https://api.smith.langchain.com/")
                    .build()

            assertThatThrownBy { profileHttpClient.execute(request) }
                .isInstanceOf(LangChainException::class.java)
                .hasMessageContaining(message)
            assertThatThrownBy { profileHttpClient.executeAsync(request).get() }
                .isInstanceOf(ExecutionException::class.java)
                .hasCauseInstanceOf(LangChainException::class.java)
            assertThat(sentRequests).isEmpty()

            // An explicit API key still takes precedence over the reference.
            profileHttpClient
                .execute(request.toBuilder().replaceHeaders("X-API-Key", "explicit-key").build())
                .close()
            assertThat(sentRequests).hasSize(1)
        }
    }

    @Test
    fun profileAuthRefreshesExpiredOauthTokenBeforeRequest() {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        var requestBody = ""
        val refreshRequests = AtomicInteger()
        server.createContext("/oauth/token") { exchange ->
            refreshRequests.incrementAndGet()
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
            assertThat(requestBody).isEmpty()

            val secondConfig =
                loadProfileClientConfig(
                    jsonMapper = jsonMapper(),
                    clock = clock,
                    configPathOverride = configPath,
                )
            val latest = jsonMapper().readTree(configPath.toFile())
            (latest as ObjectNode).put("other_setting", "preserved")
            (latest["profiles"]["default"]["oauth"] as ObjectNode).put(
                "refresh_token",
                "latest-refresh-token",
            )
            (latest["profiles"] as ObjectNode).putObject("other").put("api_key", "preserved-key")
            jsonMapper().writeValue(configPath.toFile(), latest)

            val authHeader = config?.profileAuth?.authHeader()

            assertThat(authHeader).isEqualTo("Authorization" to "Bearer new-access-token")
            assertThat(secondConfig?.profileAuth?.authHeader()).isEqualTo(authHeader)
            assertThat(refreshRequests.get()).isEqualTo(1)
            assertThat(requestBody).contains("grant_type=refresh_token")
            assertThat(requestBody).contains("client_id=langsmith-cli")
            assertThat(requestBody).contains("refresh_token=latest-refresh-token")
            val refreshedConfig = String(Files.readAllBytes(configPath), StandardCharsets.UTF_8)
            assertThat(refreshedConfig).contains("new-refresh-token")
            assertThat(refreshedConfig).doesNotContain("token_type")
            assertThat(refreshedConfig).doesNotContain("bearer_token")
            assertThat(refreshedConfig).contains("preserved-key", "other_setting", "preserved")
            if (Files.getFileStore(configPath).supportsFileAttributeView("posix")) {
                assertThat(Files.getPosixFilePermissions(configPath))
                    .isEqualTo(PosixFilePermissions.fromString("rw-------"))
            }
            Files.list(tempDir).use { entries ->
                assertThat(entries.map { it.fileName.toString() }.toArray())
                    .containsExactly("config.json")
            }

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

    @Test
    fun profileRefreshLockTakesOverAbandonedLock() {
        val path = writeConfig("{}")
        val lock = path.resolveSibling("config.json.oauth.lock.lock")
        Files.createDirectory(lock)
        val stale = Instant.now().minus(OAUTH_REFRESH_LOCK_STALE_AFTER).minusSeconds(1)
        Files.write(
            lock.resolve("created_at"),
            "$stale\ncrashed-owner\n".toByteArray(StandardCharsets.UTF_8),
        )
        val ran =
            withProfileRefreshLock(path, timeout = Duration.ofSeconds(1)) {
                assertThat(
                        String(
                            Files.readAllBytes(lock.resolve("created_at")),
                            StandardCharsets.UTF_8,
                        )
                    )
                    .doesNotContain("crashed-owner")
                true
            }
        assertThat(ran).isTrue()
        assertThat(Files.exists(lock)).isFalse()
    }

    @Test
    fun profileRefreshLockWithoutMetadataFallsBackToMtime() {
        val path = writeConfig("{}")
        val lock = path.resolveSibling("config.json.oauth.lock.lock")
        Files.createDirectory(lock)
        Files.setLastModifiedTime(
            lock,
            FileTime.from(Instant.now().minus(OAUTH_REFRESH_LOCK_STALE_AFTER).minusSeconds(1)),
        )
        val ran = withProfileRefreshLock(path, timeout = Duration.ofSeconds(1)) { true }
        assertThat(ran).isTrue()
    }

    @Test
    fun profileRefreshLockDoesNotTakeOverLiveLock() {
        val path = writeConfig("{}")
        val lock = path.resolveSibling("config.json.oauth.lock.lock")
        Files.createDirectory(lock)
        val fresh = Instant.now().minus(OAUTH_REFRESH_LOCK_STALE_AFTER).plusSeconds(1)
        Files.write(
            lock.resolve("created_at"),
            "$fresh\nlive-owner\n".toByteArray(StandardCharsets.UTF_8),
        )
        assertThatThrownBy {
                withProfileRefreshLock(path, timeout = Duration.ofMillis(20)) {
                    throw AssertionError("Must not take over a live lock")
                }
            }
            .isInstanceOf(SocketTimeoutException::class.java)
        assertThat(String(Files.readAllBytes(lock.resolve("created_at")), StandardCharsets.UTF_8))
            .contains("live-owner")
    }

    @Test
    fun profileRefreshLockSerializesIndependentCallers() {
        val path = writeConfig("{}")
        val executor = Executors.newSingleThreadExecutor()
        val started = CountDownLatch(1)
        val acquired = CountDownLatch(1)
        try {
            val pending =
                withProfileRefreshLock(path) {
                    val future =
                        executor.submit {
                            started.countDown()
                            withProfileRefreshLock(path) { acquired.countDown() }
                        }
                    assertThat(started.await(1, TimeUnit.SECONDS)).isTrue()
                    assertThat(acquired.await(30, TimeUnit.MILLISECONDS)).isFalse()
                    future
                }
            pending.get(1, TimeUnit.SECONDS)
            assertThat(acquired.count).isZero()
            assertThat(Files.exists(path.resolveSibling("config.json.oauth.lock.lock"))).isFalse()
        } finally {
            executor.shutdownNow()
        }
    }

    @Test
    fun profileRefreshSkipsMalformedLatestConfig() {
        val path =
            writeConfig(
                """{"profiles":{"default":{"api_url":"http://127.0.0.1:1","oauth":{"refresh_token":"old"}}}}"""
            )
        val config = loadProfileClientConfig(jsonMapper(), clock, configPathOverride = path)
        Files.write(path, "{".toByteArray(StandardCharsets.UTF_8))
        assertThat(config?.profileAuth?.authHeader()).isNull()
        assertThat(String(Files.readAllBytes(path), StandardCharsets.UTF_8)).isEqualTo("{")
        assertThat(Files.exists(path.resolveSibling("config.json.oauth.lock.lock"))).isFalse()
    }

    @Test
    fun readOnlyConfigDirUsesUnexpiredTokenOrReportsExpiredOne() {
        val store = Files.getFileStore(tempDir)
        assumeTrue(
            store.supportsFileAttributeView("posix") && System.getProperty("user.name") != "root"
        )
        val dir = Files.createDirectory(tempDir.resolve("read-only"))
        val path = dir.resolve("config.json")
        val readOnly = PosixFilePermissions.fromString("r-x------")
        val writable = PosixFilePermissions.fromString("rwx------")
        for ((expiresAt, usable) in
            listOf("2026-01-01T00:00:30Z" to true, "2025-12-31T23:59:00Z" to false)) {
            Files.setPosixFilePermissions(dir, writable)
            Files.write(
                path,
                """{"profiles":{"default":{"api_url":"http://127.0.0.1:1","oauth":{"access_token":"cached","refresh_token":"old","expires_at":"$expiresAt"}}}}"""
                    .toByteArray(StandardCharsets.UTF_8),
            )
            val profileAuth =
                loadProfileClientConfig(jsonMapper(), clock, configPathOverride = path)!!
                    .profileAuth!!
            Files.setPosixFilePermissions(dir, readOnly)
            try {
                if (usable) {
                    assertThat(profileAuth.authHeader())
                        .isEqualTo("Authorization" to "Bearer cached")
                } else {
                    assertThatThrownBy { profileAuth.authHeader() }
                        .isInstanceOf(LangChainException::class.java)
                        .hasMessageContaining("not be writable")
                }
            } finally {
                Files.setPosixFilePermissions(dir, writable)
            }
        }
    }

    private fun recordingHttpClient(sentRequests: MutableList<HttpRequest>): HttpClient =
        object : HttpClient {
            override fun execute(
                request: HttpRequest,
                requestOptions: RequestOptions,
            ): HttpResponse {
                sentRequests.add(request)
                return emptyResponse()
            }

            override fun executeAsync(
                request: HttpRequest,
                requestOptions: RequestOptions,
            ): CompletableFuture<HttpResponse> =
                CompletableFuture.completedFuture(execute(request, requestOptions))

            override fun close() {}
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
