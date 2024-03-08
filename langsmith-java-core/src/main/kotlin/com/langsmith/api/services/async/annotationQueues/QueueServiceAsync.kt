// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.annotationQueues

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.AnnotationQueueQueueListParams
import com.langsmith.api.models.AnnotationQueueSchema
import java.util.concurrent.CompletableFuture

interface QueueServiceAsync { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    /** Get Annotation Queues For Run */
    // templates/JavaSDK/services.ts:55:15
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun list(
        params: AnnotationQueueQueueListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<List<AnnotationQueueSchema>>
}
