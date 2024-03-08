// File generated from our OpenAPI spec by Stainless.

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

interface AnnotationQueueServiceAsync {

    fun runs(): RunServiceAsync

    fun queues(): QueueServiceAsync

    /** Create Annotation Queue */
    @JvmOverloads
    fun create(
        params: AnnotationQueueCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AnnotationQueueSchema>

    /** Update Annotation Queue */
    @JvmOverloads
    fun update(
        params: AnnotationQueueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AnnotationQueueUpdateResponse>

    /** Get Annotation Queues */
    @JvmOverloads
    fun list(
        params: AnnotationQueueListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<List<AnnotationQueueSchema>>

    /** Delete Annotation Queue */
    @JvmOverloads
    fun delete(
        params: AnnotationQueueDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AnnotationQueueDeleteResponse>

    /** Get Size From Annotation Queue */
    @JvmOverloads
    fun sizeRetrieve(
        params: AnnotationQueueSizeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AnnotationQueueSizeSchema>
}
