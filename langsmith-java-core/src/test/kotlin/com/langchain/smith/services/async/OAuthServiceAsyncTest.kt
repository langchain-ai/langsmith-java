// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.oauth.OAuthProvider
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OAuthServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val oauthServiceAsync = client.oauth()

        val oauthFuture = oauthServiceAsync.retrieve(OAuthProvider.CUSTOM_OIDC)

        val oauth = oauthFuture.get()
        oauth.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveCallback() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val oauthServiceAsync = client.oauth()

        val responseFuture = oauthServiceAsync.retrieveCallback(OAuthProvider.CUSTOM_OIDC)

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveCurrentUser() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val oauthServiceAsync = client.oauth()

        val responseFuture = oauthServiceAsync.retrieveCurrentUser(OAuthProvider.CUSTOM_OIDC)

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveLogout() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val oauthServiceAsync = client.oauth()

        val responseFuture = oauthServiceAsync.retrieveLogout(OAuthProvider.CUSTOM_OIDC)

        val response = responseFuture.get()
        response.validate()
    }
}
