// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.oauth.OAuthProvider
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OAuthServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val oauthService = client.oauth()

        val oauth = oauthService.retrieve(OAuthProvider.CUSTOM_OIDC)

        oauth.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveCallback() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val oauthService = client.oauth()

        val response = oauthService.retrieveCallback(OAuthProvider.CUSTOM_OIDC)

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveCurrentUser() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val oauthService = client.oauth()

        val response = oauthService.retrieveCurrentUser(OAuthProvider.CUSTOM_OIDC)

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveLogout() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val oauthService = client.oauth()

        val response = oauthService.retrieveLogout(OAuthProvider.CUSTOM_OIDC)

        response.validate()
    }
}
