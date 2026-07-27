// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.annotationqueues

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
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

internal class ItemServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val itemService = client.annotationQueues().items()

        val item =
            itemService.create(
                ItemCreateParams.builder()
                    .queueId("queue_id")
                    .extendTraceRetention(true)
                    .addItem(
                        ItemCreateParams.Item.builder()
                            .itemType(ItemCreateParams.Item.ItemType.RUN)
                            .runId("run_id")
                            .sessionId("session_id")
                            .sourceProposedExampleId("source_proposed_example_id")
                            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .threadId("thread_id")
                            .build()
                    )
                    .build()
            )

        item.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val itemService = client.annotationQueues().items()

        val item =
            itemService.update(
                ItemUpdateParams.builder()
                    .queueId("queue_id")
                    .itemId("item_id")
                    .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastReviewedTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        item.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val itemService = client.annotationQueues().items()

        val page =
            itemService.list(
                ItemListParams.builder()
                    .queueId("queue_id")
                    .status(ItemListParams.Status.NEEDS_MY_REVIEW)
                    .build()
            )

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createStatus() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val itemService = client.annotationQueues().items()

        val response =
            itemService.createStatus(
                ItemCreateStatusParams.builder()
                    .queueItemId("queue_item_id")
                    .overrideAddedAt("override_added_at")
                    .status(ItemCreateStatusParams.Status.VIEWED)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteAll() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val itemService = client.annotationQueues().items()

        val response =
            itemService.deleteAll(
                ItemDeleteAllParams.builder().queueId("queue_id").addItemId("string").build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveCount() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val itemService = client.annotationQueues().items()

        val response =
            itemService.retrieveCount(
                ItemRetrieveCountParams.builder()
                    .queueId("queue_id")
                    .status("status")
                    .endTime("end_time")
                    .startTime("start_time")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrievePlacement() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val itemService = client.annotationQueues().items()

        val response =
            itemService.retrievePlacement(
                ItemRetrievePlacementParams.builder().queueId("queue_id").itemId("item_id").build()
            )

        response.validate()
    }
}
