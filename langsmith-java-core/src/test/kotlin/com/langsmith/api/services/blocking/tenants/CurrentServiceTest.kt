// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.tenants

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CurrentServiceTest {

    @Test
    fun callMembersCreate() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val currentService = client.tenants().current()
        val pendingIdentity =
            currentService.membersCreate(
                TenantCurrentMembersCreateParams.builder().email("string").readOnly(true).build()
            )
        println(pendingIdentity)
        pendingIdentity.validate()
    }

    @Test
    fun callMembersList() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val currentService = client.tenants().current()
        val tenantMembers =
            currentService.membersList(TenantCurrentMembersListParams.builder().build())
        println(tenantMembers)
        tenantMembers.validate()
    }

    @Test
    fun callStatsRetrieve() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val currentService = client.tenants().current()
        val tenantStats =
            currentService.statsRetrieve(TenantCurrentStatsRetrieveParams.builder().build())
        println(tenantStats)
        tenantStats.validate()
    }
}
