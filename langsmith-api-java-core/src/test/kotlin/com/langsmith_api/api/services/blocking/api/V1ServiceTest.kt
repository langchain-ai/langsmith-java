// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.models.api.v1.V1EventsParams
import com.langsmith_api.api.models.api.v1.V1UpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val v1Service = client.api().v1()

        val v1 =
            v1Service.update(
                V1UpdateParams.builder().owner("owner").repo("repo").like(true).build()
            )

        v1.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun events() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val v1Service = client.api().v1()

        val response =
            v1Service.events(
                V1EventsParams.builder()
                    .eventType(V1EventsParams.EventType.PLAYGROUND_VIEW)
                    .owner("owner")
                    .repo("repo")
                    .commit("commit")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun login() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val v1Service = client.api().v1()

        val response = v1Service.login()

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveOk() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val v1Service = client.api().v1()

        val response = v1Service.retrieveOk()

        response.validate()
    }
}
