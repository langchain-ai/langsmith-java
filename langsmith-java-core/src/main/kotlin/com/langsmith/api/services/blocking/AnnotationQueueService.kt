// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking

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
import com.langsmith.api.services.blocking.annotationQueues.QueueService
import com.langsmith.api.services.blocking.annotationQueues.RunService

interface AnnotationQueueService {

    fun runs(): RunService

    fun queues(): QueueService

    /** Create Annotation Queue */
    @JvmOverloads
    fun create(
        params: AnnotationQueueCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AnnotationQueueSchema

    /** Update Annotation Queue */
    @JvmOverloads
    fun update(
        params: AnnotationQueueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AnnotationQueueUpdateResponse

    /** Get Annotation Queues */
    @JvmOverloads
    fun list(
        params: AnnotationQueueListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<AnnotationQueueSchema>

    /** Delete Annotation Queue */
    @JvmOverloads
    fun delete(
        params: AnnotationQueueDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AnnotationQueueDeleteResponse

    /** Get Size From Annotation Queue */
    @JvmOverloads
    fun sizeRetrieve(
        params: AnnotationQueueSizeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AnnotationQueueSizeSchema
}
