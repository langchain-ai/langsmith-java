// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.sso

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.sso.emailverification.EmailVerificationConfirmParams
import com.langchain.smith.models.sso.emailverification.EmailVerificationSendParams
import com.langchain.smith.models.sso.emailverification.EmailVerificationStatusParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EmailVerificationServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun confirm() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val emailVerificationServiceAsync = client.sso().emailVerification()

        val responseFuture =
            emailVerificationServiceAsync.confirm(
                EmailVerificationConfirmParams.builder().token("token").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun send() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val emailVerificationServiceAsync = client.sso().emailVerification()

        val responseFuture =
            emailVerificationServiceAsync.send(
                EmailVerificationSendParams.builder()
                    .email("email")
                    .samlProviderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun status() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val emailVerificationServiceAsync = client.sso().emailVerification()

        val responseFuture =
            emailVerificationServiceAsync.status(
                EmailVerificationStatusParams.builder()
                    .email("email")
                    .samlProviderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
