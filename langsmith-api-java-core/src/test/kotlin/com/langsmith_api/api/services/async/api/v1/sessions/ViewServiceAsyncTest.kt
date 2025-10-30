// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.sessions

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.models.api.v1.sessions.views.FilterViewType
import com.langsmith_api.api.models.api.v1.sessions.views.ViewCreateParams
import com.langsmith_api.api.models.api.v1.sessions.views.ViewDeleteParams
import com.langsmith_api.api.models.api.v1.sessions.views.ViewListParams
import com.langsmith_api.api.models.api.v1.sessions.views.ViewRetrieveParams
import com.langsmith_api.api.models.api.v1.sessions.views.ViewUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ViewServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val viewServiceAsync = client.api().v1().sessions().views()

        val filterViewFuture =
            viewServiceAsync.create(
                ViewCreateParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .displayName("display_name")
                    .description("description")
                    .filterString("filter_string")
                    .traceFilterString("trace_filter_string")
                    .treeFilterString("tree_filter_string")
                    .type(FilterViewType.RUNS)
                    .build()
            )

        val filterView = filterViewFuture.get()
        filterView.validate()
    }

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
        val viewServiceAsync = client.api().v1().sessions().views()

        val filterViewFuture =
            viewServiceAsync.retrieve(
                ViewRetrieveParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val filterView = filterViewFuture.get()
        filterView.validate()
    }

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
        val viewServiceAsync = client.api().v1().sessions().views()

        val filterViewFuture =
            viewServiceAsync.update(
                ViewUpdateParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .displayName("display_name")
                    .filterString("filter_string")
                    .traceFilterString("trace_filter_string")
                    .treeFilterString("tree_filter_string")
                    .type(FilterViewType.RUNS)
                    .build()
            )

        val filterView = filterViewFuture.get()
        filterView.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val viewServiceAsync = client.api().v1().sessions().views()

        val filterViewsFuture =
            viewServiceAsync.list(
                ViewListParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(FilterViewType.RUNS)
                    .build()
            )

        val filterViews = filterViewsFuture.get()
        filterViews.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val viewServiceAsync = client.api().v1().sessions().views()

        val viewFuture =
            viewServiceAsync.delete(
                ViewDeleteParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val view = viewFuture.get()
        view.validate()
    }
}
