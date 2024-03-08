// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.core

// //
// templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.databind.json.JsonMapper // templates/JavaSDK/components/file.ts:28:17
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.langsmith.api.core.http.HttpClient
import com.langsmith.api.core.http.RetryingHttpClient
import java.time.Clock

class ClientOptions
private constructor( // templates/JavaSDK/options.ts:33:13 // templates/JavaSDK/options.ts:33:13 //
    // templates/JavaSDK/options.ts:33:13 // templates/JavaSDK/options.ts:33:13
    @get:JvmName("httpClient")
    val httpClient:
        HttpClient, // templates/JavaSDK/options.ts:33:13 // templates/JavaSDK/options.ts:33:13
    @get:JvmName("jsonMapper") val jsonMapper: JsonMapper,
    @get:JvmName("clock") val clock: Clock,
    @get:JvmName("baseUrl") val baseUrl: String,
    @get:JvmName("apiKey") val apiKey: String,
    @get:JvmName("tenantId") val tenantId: String,
    @get:JvmName("bearerToken") val bearerToken: String,
    @get:JvmName("headers") val headers: ListMultimap<String, String>,
    @get:JvmName("responseValidation") val responseValidation: Boolean,
) {

    companion object { // templates/JavaSDK/options.ts:53:10 // templates/JavaSDK/options.ts:33:13

        const val PRODUCTION_URL =
            "https://localhost:8080/test-api" // templates/JavaSDK/options.ts:53:10

        @JvmStatic // templates/JavaSDK/options.ts:61:12
        fun builder() = Builder()

        @JvmStatic // templates/JavaSDK/options.ts:66:12
        fun fromEnv(): ClientOptions = builder().fromEnv().build()
    }

    class Builder { // templates/JavaSDK/options.ts:73:10

        private var httpClient: HttpClient? =
            null // templates/JavaSDK/options.ts:75:16 // templates/JavaSDK/options.ts:75:16 //
        // templates/JavaSDK/options.ts:73:10
        private var jsonMapper: JsonMapper? = null
        private var clock: Clock = Clock.systemUTC()
        private var baseUrl: String = PRODUCTION_URL
        private var headers: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var responseValidation: Boolean = false
        private var maxRetries: Int = 2
        private var apiKey: String? = null
        private var tenantId: String? = null
        private var bearerToken: String? = null

        fun httpClient(httpClient: HttpClient) = apply { // templates/JavaSDK/options.ts:95:30
            this.httpClient = httpClient
        }

        fun jsonMapper(jsonMapper: JsonMapper) = apply { // templates/JavaSDK/options.ts:106:30
            this.jsonMapper = jsonMapper
        }

        fun baseUrl(baseUrl: String) = apply { // templates/JavaSDK/options.ts:117:30
            this.baseUrl = baseUrl
        }

        fun clock(clock: Clock) = apply { // templates/JavaSDK/options.ts:128:30
            this.clock = clock
        }

        fun headers(headers: Map<String, Iterable<String>>) =
            apply { // templates/JavaSDK/options.ts:139:30
                this.headers.clear() // templates/JavaSDK/options.ts:139:30 //
                // templates/JavaSDK/options.ts:139:30
                putAllHeaders(headers)
            }

        fun putHeader(name: String, value: String) = apply { // templates/JavaSDK/options.ts:150:30
            this.headers.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) =
            apply { // templates/JavaSDK/options.ts:161:30
                this.headers.getOrPut(name) { mutableListOf() }.addAll(values)
            }

        fun putAllHeaders(headers: Map<String, Iterable<String>>) =
            apply { // templates/JavaSDK/options.ts:172:30
                headers.forEach(this::putHeaders)
            }

        fun removeHeader(name: String) = apply { // templates/JavaSDK/options.ts:183:30
            this.headers.put(name, mutableListOf())
        }

        fun responseValidation(responseValidation: Boolean) =
            apply { // templates/JavaSDK/options.ts:194:30
                this.responseValidation = responseValidation
            }

        fun maxRetries(maxRetries: Int) = apply { // templates/JavaSDK/options.ts:205:30
            this.maxRetries = maxRetries
        }

        fun apiKey(apiKey: String) = apply { // templates/JavaSDK/options.ts:219:32
            this.apiKey = apiKey
        }

        fun tenantId(tenantId: String) = apply { // templates/JavaSDK/options.ts:219:32
            this.tenantId = tenantId
        }

        fun bearerToken(bearerToken: String) = apply { // templates/JavaSDK/options.ts:219:32
            this.bearerToken = bearerToken
        }

        fun fromEnv() = apply { // templates/JavaSDK/options.ts:230:30
            System.getenv("LANG_SMITH_API_KEY")?.let { // templates/JavaSDK/options.ts:236:26 //
                // templates/JavaSDK/options.ts:230:30 //
                // templates/JavaSDK/options.ts:230:30
                apiKey(it)
            }
            System.getenv("LANG_SMITH_TENANT_ID")?.let { // templates/JavaSDK/options.ts:236:26
                tenantId(it)
            }
            System.getenv("LANG_SMITH_BEARER_TOKEN")?.let { // templates/JavaSDK/options.ts:236:26
                bearerToken(it)
            }
        }

        fun build(): ClientOptions { // templates/JavaSDK/options.ts:262:14
            checkNotNull(
                httpClient
            ) { // templates/JavaSDK/options.ts:380:13 // templates/JavaSDK/options.ts:267:22 //
                // templates/JavaSDK/options.ts:267:22 // templates/JavaSDK/options.ts:266:28
                "`httpClient` is required but was not set"
            }
            checkNotNull(apiKey) { // templates/JavaSDK/options.ts:380:13
                "`apiKey` is required but was not set"
            }
            checkNotNull(tenantId) { // templates/JavaSDK/options.ts:380:13
                "`tenantId` is required but was not set"
            }
            checkNotNull(bearerToken) { // templates/JavaSDK/options.ts:380:13
                "`bearerToken` is required but was not set"
            }

            val headers =
                ArrayListMultimap.create<
                    String, String
                >() // templates/JavaSDK/options.ts:271:22 // templates/JavaSDK/options.ts:271:22
            headers.put("X-Stainless-Lang", "java")
            headers.put("X-Stainless-Arch", getOsArch())
            headers.put("X-Stainless-OS", getOsName())
            headers.put("X-Stainless-OS-Version", getOsVersion())
            headers.put("X-Stainless-Package-Version", getPackageVersion())
            headers.put("X-Stainless-Runtime-Version", getJavaVersion())
            headers.put("X-API-Key", apiKey)
            headers.put("X-Tenant-Id", tenantId)
            if (!bearerToken.isNullOrEmpty()) { // templates/JavaSDK/options.ts:346:18
                headers.put("Authorization", "Bearer ${bearerToken}")
            }
            this.headers.forEach(headers::replaceValues)

            return ClientOptions( // templates/JavaSDK/options.ts:293:30
                RetryingHttpClient.builder() // templates/JavaSDK/options.ts:296:26 //
                    // templates/JavaSDK/options.ts:296:26 //
                    // templates/JavaSDK/options.ts:293:30
                    .httpClient(httpClient!!)
                    .clock(clock)
                    .maxRetries(maxRetries)
                    .build(),
                jsonMapper ?: jsonMapper(),
                clock,
                baseUrl,
                apiKey!!,
                tenantId!!,
                bearerToken!!,
                headers.toUnmodifiable(),
                responseValidation,
            )
        }
    }
}
