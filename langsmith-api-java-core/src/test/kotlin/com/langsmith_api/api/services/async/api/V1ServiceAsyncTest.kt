// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.models.api.v1.V1EventsParams
import com.langsmith_api.api.models.api.v1.V1UpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val v1ServiceAsync = client.api().v1()

        val v1Future =
            v1ServiceAsync.update(
                V1UpdateParams.builder().owner("owner").repo("repo").like(true).build()
            )

        val v1 = v1Future.get()
        v1.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun events() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val v1ServiceAsync = client.api().v1()

        val responseFuture =
            v1ServiceAsync.events(
                V1EventsParams.builder()
                    .eventType(V1EventsParams.EventType.PLAYGROUND_VIEW)
                    .owner("owner")
                    .repo("repo")
                    .commit("commit")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun login() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val v1ServiceAsync = client.api().v1()

        val responseFuture = v1ServiceAsync.login()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveOk() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val v1ServiceAsync = client.api().v1()

        val responseFuture = v1ServiceAsync.retrieveOk()

        val response = responseFuture.get()
        response.validate()
    }
}
