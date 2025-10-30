// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.sso

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.models.api.v1.sso.emailverification.EmailVerificationConfirmParams
import com.langsmith_api.api.models.api.v1.sso.emailverification.EmailVerificationSendParams
import com.langsmith_api.api.models.api.v1.sso.emailverification.EmailVerificationStatusParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EmailVerificationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun confirm() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val emailVerificationService = client.api().v1().sso().emailVerification()

        val response =
            emailVerificationService.confirm(
                EmailVerificationConfirmParams.builder().token("token").build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun send() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val emailVerificationService = client.api().v1().sso().emailVerification()

        val response =
            emailVerificationService.send(
                EmailVerificationSendParams.builder()
                    .email("email")
                    .samlProviderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun status() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val emailVerificationService = client.api().v1().sso().emailVerification()

        val response =
            emailVerificationService.status(
                EmailVerificationStatusParams.builder()
                    .email("email")
                    .samlProviderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }
}
