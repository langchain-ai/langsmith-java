package com.langchain.smith.core

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.databind.node.ObjectNode
import com.langchain.smith.core.http.HttpClient
import com.langchain.smith.core.http.HttpRequest
import com.langchain.smith.core.http.HttpResponse
import java.io.OutputStreamWriter
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.time.Clock
import java.time.Duration
import java.time.Instant
import java.time.OffsetDateTime
import java.util.concurrent.CompletableFuture

internal data class ProfileClientConfig(
    val baseUrl: String?,
    val apiKey: String?,
    val tenantId: String?,
    val oauthAccessToken: String?,
    val profileAuth: ProfileAuth?,
)

private const val OAUTH_CLIENT_ID = "langsmith-cli"
private val TOKEN_REFRESH_LEEWAY: Duration = Duration.ofMinutes(1)
private val TOKEN_REFRESH_TIMEOUT: Duration = Duration.ofSeconds(10)

internal fun loadProfileClientConfig(
    jsonMapper: JsonMapper,
    clock: Clock,
    configPathOverride: Path? = null,
    profileNameOverride: String? = null,
): ProfileClientConfig? {
    val configPath = configPathOverride ?: profileConfigPath()
    if (!Files.isRegularFile(configPath)) {
        return null
    }

    val config =
        runCatching { jsonMapper.readTree(configPath.toFile()) as? ObjectNode }.getOrNull()
            ?: return null
    val profiles = config["profiles"] as? ObjectNode ?: return null
    val profileName =
        profileNameOverride?.takeIf { it.isNotBlank() }
            ?: text(config["current_profile"])
            ?: "default"
    val profile = profiles[profileName] as? ObjectNode ?: return null

    val oauth = profile["oauth"]
    val oauthAccessToken = text(oauth?.get("access_token"))
    val oauthRefreshToken = text(oauth?.get("refresh_token"))

    return ProfileClientConfig(
        baseUrl = text(profile["api_url"]),
        apiKey = text(profile["api_key"]),
        tenantId = text(profile["workspace_id"]),
        oauthAccessToken = oauthAccessToken,
        profileAuth =
            if (oauthAccessToken != null || oauthRefreshToken != null) {
                ProfileAuth(jsonMapper, clock, configPath, config, profile)
            } else {
                null
            },
    )
}

internal fun profileConfigPath(): Path {
    val configuredPath =
        System.getProperty("langchain.langsmithConfigFile")
            ?: System.getenv("LANGSMITH_CONFIG_FILE")
    return configuredPath?.takeIf { it.isNotBlank() }?.let(Paths::get)
        ?: Paths.get(System.getProperty("user.home"), ".langsmith", "config.json")
}

internal fun profileName(): String? =
    (System.getProperty("langchain.langsmithProfile") ?: System.getenv("LANGSMITH_PROFILE"))
        ?.takeIf { it.isNotBlank() }

private fun shouldRefreshProfileToken(oauth: ObjectNode, clock: Clock): Boolean {
    if (text(oauth["refresh_token"]) == null) {
        return false
    }
    if (text(oauth["access_token"]) == null) {
        return true
    }
    val expiresAt = expiresAt(oauth["expires_at"]) ?: return false
    return !expiresAt.isAfter(clock.instant().plus(TOKEN_REFRESH_LEEWAY))
}

private fun refreshProfileOAuthToken(
    jsonMapper: JsonMapper,
    baseUrl: String,
    refreshToken: String,
): OAuthTokenResponse? {
    return runCatching {
            val connection =
                (URL("${normalizeConfigUrl(baseUrl)}/oauth/token").openConnection()
                        as HttpURLConnection)
                    .apply {
                        requestMethod = "POST"
                        connectTimeout = TOKEN_REFRESH_TIMEOUT.toMillis().toInt()
                        readTimeout = TOKEN_REFRESH_TIMEOUT.toMillis().toInt()
                        doOutput = true
                        setRequestProperty("Content-Type", "application/x-www-form-urlencoded")
                    }
            val body =
                formEncode(
                    mapOf(
                        "grant_type" to "refresh_token",
                        "client_id" to OAUTH_CLIENT_ID,
                        "refresh_token" to refreshToken,
                    )
                )
            OutputStreamWriter(connection.outputStream, StandardCharsets.UTF_8).use {
                it.write(body)
            }
            if (connection.responseCode !in 200..299) {
                return@runCatching null
            }
            val response = connection.inputStream.use { jsonMapper.readTree(it) }
            val accessToken = text(response["access_token"]) ?: return@runCatching null
            OAuthTokenResponse(
                accessToken = accessToken,
                refreshToken = text(response["refresh_token"]),
                expiresInSeconds = response["expires_in"]?.takeIf { it.isNumber }?.asLong(),
            )
        }
        .getOrNull()
}

private fun normalizeConfigUrl(baseUrl: String): String =
    baseUrl.trimEnd('/').removeSuffix("/api/v1")

private fun formEncode(values: Map<String, String>): String =
    values.entries.joinToString("&") { (key, value) -> "${urlEncode(key)}=${urlEncode(value)}" }

private fun urlEncode(value: String): String =
    URLEncoder.encode(value, StandardCharsets.UTF_8.name())

private fun text(node: JsonNode?): String? =
    node?.takeIf { it.isTextual }?.asText()?.trimQuotes()?.takeIf { it.isNotBlank() }

private fun expiresAt(node: JsonNode?): Instant? =
    when {
        node == null -> null
        node.isNumber -> Instant.ofEpochSecond(node.asLong())
        node.isTextual ->
            runCatching { Instant.parse(node.asText()) }
                .recoverCatching { OffsetDateTime.parse(node.asText()).toInstant() }
                .getOrNull()
        else -> null
    }

private fun String.trimQuotes(): String = trim().trim('"', '\'')

internal class ProfileAuth(
    private val jsonMapper: JsonMapper,
    private val clock: Clock,
    private val configPath: Path,
    private val config: ObjectNode,
    private val profile: ObjectNode,
) {
    private val managedAuthorizationValues = mutableSetOf<String>()

    init {
        rememberProfileAuthHeader(authHeaderFromProfile())
    }

    @Synchronized
    fun currentAuthHeader(): Pair<String, String>? =
        authHeaderFromProfile().also { rememberProfileAuthHeader(it) }

    @Synchronized
    fun isProfileAuthorizationHeader(value: String): Boolean =
        managedAuthorizationValues.contains(value)

    @Synchronized
    fun authHeader(baseUrlOverride: String?): Pair<String, String>? {
        val oauth = profile["oauth"] as? ObjectNode
        if (oauth != null && shouldRefreshProfileToken(oauth, clock)) {
            val refreshToken = text(oauth["refresh_token"])
            if (refreshToken != null) {
                val tokenEndpointBaseUrl =
                    baseUrlOverride ?: text(profile["api_url"]) ?: ClientOptions.PRODUCTION_URL
                val tokenResponse =
                    refreshProfileOAuthToken(jsonMapper, tokenEndpointBaseUrl, refreshToken)
                if (tokenResponse != null) {
                    oauth.put("access_token", tokenResponse.accessToken)
                    tokenResponse.refreshToken?.let { oauth.put("refresh_token", it) }
                    tokenResponse.expiresInSeconds?.let {
                        oauth.put("expires_at", clock.instant().plusSeconds(it).toString())
                    }
                    oauth.remove("token_type")
                    oauth.remove("bearer_token")
                    saveConfig()
                }
            }
        }
        return authHeaderFromProfile().also { rememberProfileAuthHeader(it) }
    }

    private fun authHeaderFromProfile(): Pair<String, String>? {
        val oauth = profile["oauth"] as? ObjectNode
        text(oauth?.get("access_token"))?.let {
            return "Authorization" to "Bearer $it"
        }
        text(profile["api_key"])?.let {
            return "X-API-Key" to it
        }
        return null
    }

    private fun rememberProfileAuthHeader(header: Pair<String, String>?) {
        if (header?.first?.equals("Authorization", ignoreCase = true) == true) {
            managedAuthorizationValues.add(header.second)
        }
    }

    private fun saveConfig() {
        runCatching {
            configPath.parent?.let { Files.createDirectories(it) }
            jsonMapper.writerWithDefaultPrettyPrinter().writeValue(configPath.toFile(), config)
        }
    }
}

internal class ProfileAuthHttpClient(
    private val delegate: HttpClient,
    private val profileAuth: ProfileAuth,
) : HttpClient {
    override fun execute(request: HttpRequest, requestOptions: RequestOptions): HttpResponse =
        delegate.execute(prepareProfileAuthRequest(request), requestOptions)

    override fun executeAsync(
        request: HttpRequest,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        delegate.executeAsync(prepareProfileAuthRequest(request), requestOptions)

    override fun close() = delegate.close()

    private fun prepareProfileAuthRequest(request: HttpRequest): HttpRequest {
        if (request.headers.values("X-API-Key").any(String::isNotBlank)) {
            return request.toBuilder().removeHeaders("Authorization").build()
        }
        val authorizationValues = request.headers.values("Authorization").filter(String::isNotBlank)
        if (
            authorizationValues.isNotEmpty() &&
                authorizationValues.none { profileAuth.isProfileAuthorizationHeader(it) }
        ) {
            return request
        }
        val (name, value) = profileAuth.authHeader(request.baseUrl) ?: return request
        val builder = request.toBuilder()
        if (name.equals("X-API-Key", ignoreCase = true)) {
            builder.removeHeaders("Authorization")
        }
        return builder.replaceHeaders(name, value).build()
    }
}

private data class OAuthTokenResponse(
    val accessToken: String,
    val refreshToken: String?,
    val expiresInSeconds: Long?,
)
