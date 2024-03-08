// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.client.okhttp

// //
// templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.databind.json.JsonMapper // templates/JavaSDK/components/file.ts:28:17
import com.langsmith.api.client.LangSmithClientAsync
import com.langsmith.api.client.LangSmithClientAsyncImpl
import com.langsmith.api.core.ClientOptions
import java.net.Proxy
import java.time.Clock
import java.time.Duration

class LangSmithOkHttpClientAsync
private constructor() { // templates/JavaSDK/okhttp.ts:33:13 // templates/JavaSDK/okhttp.ts:33:13 //
    // templates/JavaSDK/okhttp.ts:33:13

    companion object { // templates/JavaSDK/okhttp.ts:37:10 // templates/JavaSDK/okhttp.ts:33:13

        @JvmStatic // templates/JavaSDK/okhttp.ts:38:12 // templates/JavaSDK/okhttp.ts:37:10
        fun builder() = Builder()

        @JvmStatic // templates/JavaSDK/okhttp.ts:43:12
        fun fromEnv(): LangSmithClientAsync = builder().fromEnv().build()
    }

    class Builder { // templates/JavaSDK/okhttp.ts:51:10

        private var clientOptions: ClientOptions.Builder =
            ClientOptions
                .builder() // templates/JavaSDK/okhttp.ts:53:16 // templates/JavaSDK/okhttp.ts:53:16
        // // templates/JavaSDK/okhttp.ts:51:10
        private var baseUrl: String = ClientOptions.PRODUCTION_URL
        // default timeout for client is 1 minute
        private var timeout: Duration = Duration.ofSeconds(60)
        private var proxy: Proxy? = null

        fun baseUrl(baseUrl: String) = apply { // templates/JavaSDK/okhttp.ts:79:30
            clientOptions.baseUrl(
                baseUrl
            ) // templates/JavaSDK/okhttp.ts:79:30 // templates/JavaSDK/okhttp.ts:79:30
            this.baseUrl = baseUrl
        }

        fun jsonMapper(jsonMapper: JsonMapper) = apply { // templates/JavaSDK/okhttp.ts:90:30
            clientOptions.jsonMapper(jsonMapper)
        }

        fun clock(clock: Clock) = apply { // templates/JavaSDK/okhttp.ts:106:30
            clientOptions.clock(clock)
        }

        fun headers(headers: Map<String, Iterable<String>>) =
            apply { // templates/JavaSDK/okhttp.ts:122:30
                clientOptions.headers(headers)
            }

        fun putHeader(name: String, value: String) = apply { // templates/JavaSDK/okhttp.ts:138:30
            clientOptions.putHeader(name, value)
        }

        fun putHeaders(name: String, values: Iterable<String>) =
            apply { // templates/JavaSDK/okhttp.ts:154:30
                clientOptions.putHeaders(name, values)
            }

        fun putAllHeaders(headers: Map<String, Iterable<String>>) =
            apply { // templates/JavaSDK/okhttp.ts:170:30
                clientOptions.putAllHeaders(headers)
            }

        fun removeHeader(name: String) = apply { // templates/JavaSDK/okhttp.ts:186:30
            clientOptions.removeHeader(name)
        }

        fun timeout(timeout: Duration) = apply { // templates/JavaSDK/okhttp.ts:202:30
            this.timeout = timeout
        }

        fun maxRetries(maxRetries: Int) = apply { // templates/JavaSDK/okhttp.ts:213:30
            clientOptions.maxRetries(maxRetries)
        }

        fun proxy(proxy: Proxy) = apply { // templates/JavaSDK/okhttp.ts:229:30
            this.proxy = proxy
        }

        fun responseValidation(responseValidation: Boolean) =
            apply { // templates/JavaSDK/okhttp.ts:240:30
                clientOptions.responseValidation(responseValidation)
            }

        fun apiKey(apiKey: String) =
            apply { // templates/JavaSDK/okhttp.ts:264:34 // templates/JavaSDK/okhttp.ts:254:26
                clientOptions.apiKey(apiKey)
            }

        fun tenantId(tenantId: String) =
            apply { // templates/JavaSDK/okhttp.ts:264:34 // templates/JavaSDK/okhttp.ts:254:26
                clientOptions.tenantId(tenantId)
            }

        fun bearerToken(bearerToken: String) =
            apply { // templates/JavaSDK/okhttp.ts:264:34 // templates/JavaSDK/okhttp.ts:254:26
                clientOptions.bearerToken(bearerToken)
            }

        fun fromEnv() = apply { // templates/JavaSDK/okhttp.ts:275:30
            clientOptions.fromEnv()
        }

        fun build(): LangSmithClientAsync { // templates/JavaSDK/okhttp.ts:281:14
            return LangSmithClientAsyncImpl(
                clientOptions // templates/JavaSDK/okhttp.ts:289:27 //
                    // templates/JavaSDK/okhttp.ts:286:30 //
                    // templates/JavaSDK/okhttp.ts:285:26 //
                    // templates/JavaSDK/okhttp.ts:285:26
                    .httpClient(
                        OkHttpClient.builder()
                            .baseUrl(baseUrl)
                            .timeout(timeout)
                            .proxy(proxy)
                            .build()
                    )
                    .build()
            )
        }
    }
}
