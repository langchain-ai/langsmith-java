package com.langchain.smith.core

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.databind.node.ObjectNode
import com.langchain.smith.core.http.HttpClient
import com.langchain.smith.core.http.HttpRequest
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.errors.LangChainException
import java.io.IOException
import java.io.InterruptedIOException
import java.io.OutputStreamWriter
import java.net.HttpURLConnection
import java.net.SocketTimeoutException
import java.net.URL
import java.net.URLEncoder
import java.nio.charset.StandardCharsets
import java.nio.file.FileAlreadyExistsException
import java.nio.file.Files
import java.nio.file.NoSuchFileException
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardCopyOption.ATOMIC_MOVE
import java.nio.file.StandardCopyOption.REPLACE_EXISTING
import java.nio.file.StandardOpenOption.WRITE
import java.nio.file.attribute.PosixFilePermissions
import java.time.Clock
import java.time.Duration
import java.time.Instant
import java.time.OffsetDateTime
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.concurrent.TimeUnit
import java.util.concurrent.TimeoutException
import java.util.concurrent.atomic.AtomicReference
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.thread
import kotlin.concurrent.withLock
import kotlin.math.min

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

/**
 * A refresh lock older than this is treated as abandoned (its holder crashed) and taken over.
 * Holders bound their whole refresh to [TOKEN_REFRESH_TIMEOUT], so a live holder is never evicted.
 * Shared with the Python, JS and Go SDKs.
 */
internal val OAUTH_REFRESH_LOCK_STALE_AFTER: Duration = Duration.ofSeconds(15)

internal fun loadProfileClientConfig(
    jsonMapper: JsonMapper,
    clock: Clock,
    configPathOverride: Path? = null,
    profileNameOverride: String? = null,
    getenv: (String) -> String? = System::getenv,
): ProfileClientConfig? {
    val configPath =
        canonicalProfileConfigPath(configPathOverride ?: profileConfigPath()) ?: return null
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
    val apiKey = text(profile["api_key"])
    val hasApiKeyRef = text(profile["api_key_env"]) != null || text(profile["api_key_cmd"]) != null

    return ProfileClientConfig(
        baseUrl = text(profile["api_url"]),
        apiKey = apiKey,
        tenantId = text(profile["workspace_id"]),
        oauthAccessToken = oauthAccessToken,
        profileAuth =
            if (
                oauthAccessToken != null ||
                    oauthRefreshToken != null ||
                    (apiKey == null && hasApiKeyRef)
            ) {
                ProfileAuth(
                    jsonMapper = jsonMapper,
                    clock = clock,
                    configPath = configPath,
                    profile = profile,
                    profileName = profileName,
                    getenv = getenv,
                )
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
        ?: profileHomeDirectory().resolve(".langsmith").resolve("config.json")
}

private fun profileHomeDirectory(): Path =
    Paths.get(
        System.getenv(
                if (System.getProperty("os.name").startsWith("Windows")) "USERPROFILE" else "HOME"
            )
            ?.takeIf { it.isNotEmpty() } ?: System.getProperty("user.home")
    )

internal fun profileName(): String? =
    (System.getProperty("langchain.langsmithProfile") ?: System.getenv("LANGSMITH_PROFILE"))
        ?.takeIf { it.isNotBlank() }

private fun canonicalProfileConfigPath(path: Path): Path? =
    runCatching {
            val value = path.toString()
            val expanded =
                if (value == "~" || value.startsWith("~/") || value.startsWith("~\\")) {
                    profileHomeDirectory().resolve(value.drop(1).trimStart('/', '\\'))
                } else {
                    path
                }
            expanded.toAbsolutePath().normalize().toRealPath()
        }
        .getOrNull()

internal fun <T> withProfileRefreshLock(
    configPath: Path,
    timeout: Duration = TOKEN_REFRESH_TIMEOUT,
    action: () -> T,
): T {
    val lockPath = configPath.resolveSibling("${configPath.fileName}.oauth.lock.lock")
    val deadline = System.nanoTime() + timeout.toNanos()
    val owner = UUID.randomUUID().toString()
    val directoryAttributes =
        if (Files.getFileStore(configPath.parent).supportsFileAttributeView("posix")) {
            arrayOf(
                PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rwx------"))
            )
        } else {
            emptyArray()
        }
    while (true) {
        if (System.nanoTime() >= deadline) {
            throw SocketTimeoutException("Timed out acquiring OAuth refresh lock")
        }
        try {
            Files.createDirectory(lockPath, *directoryAttributes)
            break
        } catch (e: FileAlreadyExistsException) {
            if (removeStaleProfileRefreshLock(lockPath)) {
                continue
            }
            val remaining = deadline - System.nanoTime()
            if (remaining <= 0)
                throw SocketTimeoutException("Timed out acquiring OAuth refresh lock")
            try {
                TimeUnit.NANOSECONDS.sleep(min(remaining, TimeUnit.MILLISECONDS.toNanos(10)))
            } catch (e: InterruptedException) {
                Thread.currentThread().interrupt()
                throw InterruptedIOException("Interrupted acquiring OAuth refresh lock")
            }
        }
    }
    val metadata = lockPath.resolve("created_at")
    try {
        val metadataAttributes =
            if (Files.getFileStore(configPath.parent).supportsFileAttributeView("posix")) {
                arrayOf(
                    PosixFilePermissions.asFileAttribute(
                        PosixFilePermissions.fromString("rw-------")
                    )
                )
            } else {
                emptyArray()
            }
        Files.createFile(metadata, *metadataAttributes)
        Files.write(
            metadata,
            "${Instant.now()}\n$owner\n".toByteArray(StandardCharsets.UTF_8),
            WRITE,
        )
    } catch (e: IOException) {
        deleteProfileRefreshLockDir(lockPath)
        throw e
    }
    try {
        return action()
    } finally {
        val currentOwner =
            runCatching { Files.readAllLines(metadata, StandardCharsets.UTF_8).getOrNull(1) }
                .getOrNull()
        if (currentOwner == owner) {
            // On failure the lock is left for the stale takeover rather than masking the result.
            deleteProfileRefreshLockDir(lockPath)
        }
    }
}

/**
 * Removes the lock directory if it is older than [OAUTH_REFRESH_LOCK_STALE_AFTER]. Its age comes
 * from the `created_at` metadata, falling back to the directory's mtime when the metadata is
 * missing or malformed (e.g. the holder crashed between creating the directory and writing it).
 */
private fun removeStaleProfileRefreshLock(lockPath: Path): Boolean {
    val createdAt =
        runCatching {
                Instant.parse(
                    Files.readAllLines(lockPath.resolve("created_at"), StandardCharsets.UTF_8)
                        .first()
                        .trim()
                )
            }
            .recoverCatching { Files.getLastModifiedTime(lockPath).toInstant() }
            .getOrNull() ?: return false
    if (!Instant.now().isAfter(createdAt.plus(OAUTH_REFRESH_LOCK_STALE_AFTER))) {
        return false
    }
    return deleteProfileRefreshLockDir(lockPath)
}

private const val OAUTH_REFRESH_LOCK_REMOVE_ATTEMPTS = 10

/**
 * Removes the lock directory and its metadata files (another SDK may leave a temp file behind).
 *
 * On Windows a file cannot be deleted while another process has it open without delete sharing (the
 * Python and Go SDKs open files that way), so removal fails if a waiter is reading `created_at` at
 * that moment. Reads take microseconds; a few short retries absorb the overlap.
 */
internal fun deleteProfileRefreshLockDir(
    lockPath: Path,
    deleteIfExists: (Path) -> Unit = { Files.deleteIfExists(it) },
): Boolean {
    for (attempt in 0 until OAUTH_REFRESH_LOCK_REMOVE_ATTEMPTS) {
        if (attempt > 0) {
            try {
                TimeUnit.MILLISECONDS.sleep(10)
            } catch (e: InterruptedException) {
                Thread.currentThread().interrupt()
                return false
            }
        }
        try {
            Files.list(lockPath)
                .use { entries -> entries.iterator().asSequence().toList() }
                .forEach(deleteIfExists)
            deleteIfExists(lockPath)
            return true
        } catch (e: NoSuchFileException) {
            return true
        } catch (e: IOException) {
            // Retry.
        }
    }
    return false
}

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

/** Whether the cached access token can still authenticate a request. */
private fun accessTokenUsable(oauth: ObjectNode, clock: Clock): Boolean {
    if (text(oauth["access_token"]) == null) {
        return false
    }
    val expiresAt = expiresAt(oauth["expires_at"]) ?: return true
    return expiresAt.isAfter(clock.instant())
}

/**
 * Runs the token refresh, giving up once [deadlineNanos] ([System.nanoTime]) passes.
 * HttpURLConnection timeouts apply per connect/read, not to the whole exchange, so without this the
 * refresh could hold the cross-process lock past [OAUTH_REFRESH_LOCK_STALE_AFTER]. The request runs
 * on a daemon thread; a late result is discarded and the connection is closed.
 */
private fun refreshProfileOAuthTokenBefore(
    jsonMapper: JsonMapper,
    baseUrl: String,
    refreshToken: String,
    deadlineNanos: Long,
): OAuthTokenResponse? {
    val remaining = deadlineNanos - System.nanoTime()
    if (remaining <= 0) {
        return null
    }
    val timeoutMillis = TimeUnit.NANOSECONDS.toMillis(remaining).coerceIn(1, Int.MAX_VALUE.toLong())
    val connection = AtomicReference<HttpURLConnection?>()
    val result = CompletableFuture<OAuthTokenResponse?>()
    thread(isDaemon = true, name = "langsmith-oauth-refresh") {
        result.complete(
            refreshProfileOAuthToken(
                jsonMapper,
                baseUrl,
                refreshToken,
                timeoutMillis.toInt(),
                connection,
            )
        )
    }
    return try {
        result.get(remaining, TimeUnit.NANOSECONDS)
    } catch (e: TimeoutException) {
        connection.get()?.disconnect()
        null
    } catch (e: InterruptedException) {
        Thread.currentThread().interrupt()
        connection.get()?.disconnect()
        null
    }
}

private fun refreshProfileOAuthToken(
    jsonMapper: JsonMapper,
    baseUrl: String,
    refreshToken: String,
    timeoutMillis: Int,
    connectionRef: AtomicReference<HttpURLConnection?>,
): OAuthTokenResponse? {
    return runCatching {
            val connection =
                (URL("${normalizeConfigUrl(baseUrl)}/oauth/token").openConnection()
                        as HttpURLConnection)
                    .apply {
                        requestMethod = "POST"
                        connectTimeout = timeoutMillis
                        readTimeout = timeoutMillis
                        doOutput = true
                        setRequestProperty("Content-Type", "application/x-www-form-urlencoded")
                    }
            connectionRef.set(connection)
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

private fun normalizeConfigUrl(baseUrl: String): String = normalizeBaseUrl(baseUrl).trimEnd('/')

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

/**
 * Returns the profile's API key. Instead of storing the key, a profile can name where it lives:
 * `api_key_env` is an environment variable, and `api_key_cmd` is a shell command that prints the
 * key. `api_key` wins over `api_key_env`, which wins over `api_key_cmd`. The CLI and Go SDK run
 * `api_key_cmd`; this SDK reports it as unsupported instead of sending unauthenticated requests.
 *
 * @throws LangChainException if the named environment variable is not set, or the profile uses
 *   `api_key_cmd`.
 */
private fun profileApiKey(
    profileName: String,
    profile: ObjectNode,
    getenv: (String) -> String?,
): String? {
    text(profile["api_key"])?.let {
        return it
    }
    text(profile["api_key_env"])?.let { apiKeyEnv ->
        getenv(apiKeyEnv)
            ?.trim()
            ?.takeIf { it.isNotEmpty() }
            ?.let {
                return it
            }
        throw LangChainException(
            "LangSmith profile \"$profileName\" reads its API key from \$$apiKeyEnv, which is not set"
        )
    }
    if (text(profile["api_key_cmd"]) != null) {
        throw LangChainException(
            "LangSmith profile \"$profileName\" gets its API key from a command (api_key_cmd), " +
                "which the Java SDK does not support yet. Set api_key_env in the profile, " +
                "or set LANGSMITH_API_KEY."
        )
    }
    return null
}

internal class ProfileAuth(
    private val jsonMapper: JsonMapper,
    private val clock: Clock,
    private val configPath: Path,
    private var profile: ObjectNode,
    private val profileName: String,
    private val getenv: (String) -> String?,
) {
    private val authLock = ReentrantLock()
    private val managedAuthorizationValues = mutableSetOf<String>()

    init {
        currentAuthHeader()
    }

    /**
     * The auth header to snapshot into default headers. A profile API key that cannot be resolved
     * yields none here; [authHeader] reports it when a request needs it.
     */
    fun currentAuthHeader(): Pair<String, String>? =
        authLock.withLock {
            try {
                    authHeaderFromProfile()
                } catch (e: LangChainException) {
                    null
                }
                .also { rememberProfileAuthHeader(it) }
        }

    fun isProfileAuthorizationHeader(value: String): Boolean =
        authLock.withLock { managedAuthorizationValues.contains(value) }

    fun authHeader(): Pair<String, String>? =
        authLock.withLock {
            val oauth = profile["oauth"] as? ObjectNode
            if (oauth != null && shouldRefreshProfileToken(oauth, clock)) {
                var acquired = false
                // One budget covers waiting for the lock and the refresh itself.
                val deadline = System.nanoTime() + TOKEN_REFRESH_TIMEOUT.toNanos()
                try {
                    withProfileRefreshLock(configPath) {
                        acquired = true
                        refreshFromLatestConfig(deadline)
                    }
                } catch (e: IOException) {
                    // Without the lock the cached refresh token must not be used. An unexpired
                    // access token still works; an expired one would only produce opaque 401s,
                    // so report why the refresh could not run.
                    if (!acquired && !accessTokenUsable(oauth, clock)) {
                        throw LangChainException(
                            "Could not refresh the expired OAuth token for LangSmith profile " +
                                "\"$profileName\": failed to acquire the refresh lock next to " +
                                "$configPath (${e.message ?: e.javaClass.simpleName}). Another " +
                                "process may be refreshing it, or the config directory may not be " +
                                "writable; OAuth profiles need a writable config. Use an API key " +
                                "for read-only configs. A lock left by a crashed process is " +
                                "released automatically after " +
                                "${OAUTH_REFRESH_LOCK_STALE_AFTER.seconds} seconds.",
                            e,
                        )
                    }
                    return@withLock authHeaderFromProfile().also { rememberProfileAuthHeader(it) }
                }
            }
            authHeaderFromProfile().also { rememberProfileAuthHeader(it) }
        }

    private fun refreshFromLatestConfig(deadlineNanos: Long) {
        val config = jsonMapper.readTree(configPath.toFile()) as? ObjectNode ?: return
        val fresh = config["profiles"]?.get(profileName) as? ObjectNode ?: return
        profile = fresh
        val oauth = fresh["oauth"] as? ObjectNode ?: return
        if (!shouldRefreshProfileToken(oauth, clock)) return
        val refreshToken = text(oauth["refresh_token"]) ?: return
        val tokenEndpointBaseUrl = text(fresh["api_url"]) ?: ClientOptions.PRODUCTION_URL
        val tokenResponse =
            refreshProfileOAuthTokenBefore(
                jsonMapper,
                tokenEndpointBaseUrl,
                refreshToken,
                deadlineNanos,
            ) ?: return
        oauth.put("access_token", tokenResponse.accessToken)
        tokenResponse.refreshToken?.let { oauth.put("refresh_token", it) }
        tokenResponse.expiresInSeconds?.let {
            oauth.put("expires_at", clock.instant().plusSeconds(it).toString())
        }
        oauth.remove("token_type")
        oauth.remove("bearer_token")
        saveConfig(config)
    }

    private fun authHeaderFromProfile(): Pair<String, String>? {
        val oauth = profile["oauth"] as? ObjectNode
        text(oauth?.get("access_token"))?.let {
            return "Authorization" to "Bearer $it"
        }
        profileApiKey(profileName, profile, getenv)?.let {
            return "X-API-Key" to it
        }
        return null
    }

    private fun rememberProfileAuthHeader(header: Pair<String, String>?) {
        if (header?.first?.equals("Authorization", ignoreCase = true) == true) {
            managedAuthorizationValues.add(header.second)
        }
    }

    private fun saveConfig(config: ObjectNode) {
        val attributes =
            if (Files.getFileStore(configPath.parent).supportsFileAttributeView("posix")) {
                arrayOf(
                    PosixFilePermissions.asFileAttribute(
                        PosixFilePermissions.fromString("rw-------")
                    )
                )
            } else {
                emptyArray()
            }
        val temporary =
            Files.createTempFile(configPath.parent, "${configPath.fileName}.", ".tmp", *attributes)
        try {
            jsonMapper.writerWithDefaultPrettyPrinter().writeValue(temporary.toFile(), config)
            Files.move(temporary, configPath, ATOMIC_MOVE, REPLACE_EXISTING)
        } finally {
            Files.deleteIfExists(temporary)
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
    ): CompletableFuture<HttpResponse> {
        val profileRequest =
            try {
                prepareProfileAuthRequest(request)
            } catch (e: LangChainException) {
                return CompletableFuture<HttpResponse>().apply { completeExceptionally(e) }
            }
        return delegate.executeAsync(profileRequest, requestOptions)
    }

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
        val (name, value) = profileAuth.authHeader() ?: return request
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
