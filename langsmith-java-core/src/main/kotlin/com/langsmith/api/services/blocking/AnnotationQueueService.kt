// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

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

interface AnnotationQueueService { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    fun runs(): RunService // templates/JavaSDK/services.ts:55:15

    fun queues(): QueueService

    /** Create Annotation Queue */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun create(
        params: AnnotationQueueCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AnnotationQueueSchema

    /** Update Annotation Queue */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun update(
        params: AnnotationQueueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AnnotationQueueUpdateResponse

    /** Get Annotation Queues */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun list(
        params: AnnotationQueueListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<AnnotationQueueSchema>

    /** Delete Annotation Queue */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun delete(
        params: AnnotationQueueDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AnnotationQueueDeleteResponse

    /** Get Size From Annotation Queue */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun sizeRetrieve(
        params: AnnotationQueueSizeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AnnotationQueueSizeSchema
}
