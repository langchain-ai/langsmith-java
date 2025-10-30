// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.models.api.v1.oauth.OAuthProvider
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OAuthServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val oauthService = client.api().v1().oauth()

        val oauth = oauthService.retrieve(OAuthProvider.CUSTOM_OIDC)

        oauth.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveCallback() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val oauthService = client.api().v1().oauth()

        val response = oauthService.retrieveCallback(OAuthProvider.CUSTOM_OIDC)

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveCurrentUser() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val oauthService = client.api().v1().oauth()

        val response = oauthService.retrieveCurrentUser(OAuthProvider.CUSTOM_OIDC)

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveLogout() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val oauthService = client.api().v1().oauth()

        val response = oauthService.retrieveLogout(OAuthProvider.CUSTOM_OIDC)

        response.validate()
    }
}
