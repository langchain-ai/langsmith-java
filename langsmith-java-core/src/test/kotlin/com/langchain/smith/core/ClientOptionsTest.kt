// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.core

import com.langchain.smith.core.http.HttpClient
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension
import org.mockito.kotlin.mock
import org.mockito.kotlin.never
import org.mockito.kotlin.verify

@ExtendWith(MockitoExtension::class)
internal class ClientOptionsTest {

    private val httpClient = mock<HttpClient>()

    @Test
    fun putHeader_canOverwriteDefaultHeader() {
        val clientOptions =
            ClientOptions.builder()
                .httpClient(httpClient)
                .putHeader("User-Agent", "My User Agent")
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()

        assertThat(clientOptions.headers.values("User-Agent")).containsExactly("My User Agent")
    }

    @Test
    fun toBuilder_apiKeyCanBeUpdated() {
        var clientOptions =
            ClientOptions.builder()
                .httpClient(httpClient)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()

        clientOptions = clientOptions.toBuilder().apiKey("another My API Key").build()

        assertThat(clientOptions.headers.values("X-API-Key")).containsExactly("another My API Key")
    }

    @Test
    fun buildRejectsNonLocalHttpBaseUrlWhenSendingCredentials() {
        assertThatThrownBy {
                ClientOptions.builder()
                    .httpClient(httpClient)
                    .baseUrl("http://example.com")
                    .apiKey("My API Key")
                    .build()
            }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("baseUrl must use https")
    }

    @Test
    fun buildAllowsLocalHttpBaseUrlWhenSendingCredentials() {
        val clientOptions =
            ClientOptions.builder()
                .httpClient(httpClient)
                .baseUrl("http://127.0.0.1:8080")
                .apiKey("My API Key")
                .build()

        assertThat(clientOptions.baseUrl()).isEqualTo("http://127.0.0.1:8080")
    }

    @Test
    fun toBuilder_whenOriginalClientOptionsGarbageCollected_doesNotCloseOriginalClient() {
        var clientOptions =
            ClientOptions.builder()
                .httpClient(httpClient)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        verify(httpClient, never()).close()

        // Overwrite the `clientOptions` variable so that the original `ClientOptions` is GC'd.
        clientOptions = clientOptions.toBuilder().build()
        System.gc()
        Thread.sleep(100)

        verify(httpClient, never()).close()
        // This exists so that `clientOptions` is still reachable.
        assertThat(clientOptions).isEqualTo(clientOptions)
    }
}
