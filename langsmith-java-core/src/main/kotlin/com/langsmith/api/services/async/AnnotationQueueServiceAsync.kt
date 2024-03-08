// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.AnnotationQueueCreateParams
import com.langsmith.api.models.AnnotationQueueDeleteParams
import com.langsmith.api.models.AnnotationQueueDeleteResponse
import com.langsmith.api.models.AnnotationQueueListParams
import com.langsmith.api.models.AnnotationQueueSchema
import com.langsmith.api.models.AnnotationQueueSizeRetrieveParams
import com.langsmith.api.models.AnnotationQueueSizeSchema
import com.langsmith.api.models.AnnotationQueueUpdateParams
import com.langsmith.api.models.AnnotationQueueUpdateResponse
import com.langsmith.api.services.async.annotationQueues.QueueServiceAsync
import com.langsmith.api.services.async.annotationQueues.RunServiceAsync
import java.util.concurrent.CompletableFuture

interface AnnotationQueueServiceAsync { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    fun runs(): RunServiceAsync // templates/JavaSDK/services.ts:55:15

    fun queues(): QueueServiceAsync

    /** Create Annotation Queue */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun create(
        params: AnnotationQueueCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AnnotationQueueSchema>

    /** Update Annotation Queue */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun update(
        params: AnnotationQueueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AnnotationQueueUpdateResponse>

    /** Get Annotation Queues */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun list(
        params: AnnotationQueueListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<List<AnnotationQueueSchema>>

    /** Delete Annotation Queue */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun delete(
        params: AnnotationQueueDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AnnotationQueueDeleteResponse>

    /** Get Size From Annotation Queue */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun sizeRetrieve(
        params: AnnotationQueueSizeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AnnotationQueueSizeSchema>
}
