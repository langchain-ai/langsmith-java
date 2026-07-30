// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.annotationqueues

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.annotationqueues.items.ItemCreateParams
import com.langchain.smith.models.annotationqueues.items.ItemCreateStatusParams
import com.langchain.smith.models.annotationqueues.items.ItemDeleteAllParams
import com.langchain.smith.models.annotationqueues.items.ItemListParams
import com.langchain.smith.models.annotationqueues.items.ItemRetrieveCountParams
import com.langchain.smith.models.annotationqueues.items.ItemRetrievePlacementParams
import com.langchain.smith.models.annotationqueues.items.ItemUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ItemServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val itemServiceAsync = client.annotationQueues().items()

        val itemFuture =
            itemServiceAsync.create(
                ItemCreateParams.builder()
                    .queueId("queue_id")
                    .extendTraceRetention(true)
                    .addItem(
                        ItemCreateParams.Item.builder()
                            .itemType(ItemCreateParams.Item.ItemType.RUN)
                            .projectId("project_id")
                            .runId("run_id")
                            .sessionId("session_id")
                            .sourceProposedExampleId("source_proposed_example_id")
                            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .threadId("thread_id")
                            .build()
                    )
                    .build()
            )

        val item = itemFuture.get()
        item.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val itemServiceAsync = client.annotationQueues().items()

        val itemFuture =
            itemServiceAsync.update(
                ItemUpdateParams.builder()
                    .queueId("queue_id")
                    .itemId("item_id")
                    .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastReviewedTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val item = itemFuture.get()
        item.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val itemServiceAsync = client.annotationQueues().items()

        val pageFuture =
            itemServiceAsync.list(
                ItemListParams.builder()
                    .queueId("queue_id")
                    .status(ItemListParams.Status.NEEDS_MY_REVIEW)
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createStatus() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val itemServiceAsync = client.annotationQueues().items()

        val responseFuture =
            itemServiceAsync.createStatus(
                ItemCreateStatusParams.builder()
                    .queueItemId("queue_item_id")
                    .overrideAddedAt("override_added_at")
                    .status(ItemCreateStatusParams.Status.VIEWED)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteAll() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val itemServiceAsync = client.annotationQueues().items()

        val responseFuture =
            itemServiceAsync.deleteAll(
                ItemDeleteAllParams.builder().queueId("queue_id").addItemId("string").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveCount() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val itemServiceAsync = client.annotationQueues().items()

        val responseFuture =
            itemServiceAsync.retrieveCount(
                ItemRetrieveCountParams.builder()
                    .queueId("queue_id")
                    .status("status")
                    .endTime("end_time")
                    .startTime("start_time")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrievePlacement() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val itemServiceAsync = client.annotationQueues().items()

        val responseFuture =
            itemServiceAsync.retrievePlacement(
                ItemRetrievePlacementParams.builder().queueId("queue_id").itemId("item_id").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
