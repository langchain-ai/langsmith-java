// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.models.api.v1.oauth.OAuthProvider
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OAuthServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val oauthServiceAsync = client.api().v1().oauth()

        val oauthFuture = oauthServiceAsync.retrieve(OAuthProvider.CUSTOM_OIDC)

        val oauth = oauthFuture.get()
        oauth.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveCallback() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val oauthServiceAsync = client.api().v1().oauth()

        val responseFuture = oauthServiceAsync.retrieveCallback(OAuthProvider.CUSTOM_OIDC)

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveCurrentUser() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val oauthServiceAsync = client.api().v1().oauth()

        val responseFuture = oauthServiceAsync.retrieveCurrentUser(OAuthProvider.CUSTOM_OIDC)

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveLogout() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val oauthServiceAsync = client.api().v1().oauth()

        val responseFuture = oauthServiceAsync.retrieveLogout(OAuthProvider.CUSTOM_OIDC)

        val response = responseFuture.get()
        response.validate()
    }
}
