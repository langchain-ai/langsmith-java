// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.annotationQueues

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.AnnotationQueueRunCreateParams
import com.langsmith.api.models.AnnotationQueueRunDeleteParams
import com.langsmith.api.models.AnnotationQueueRunDeleteResponse
import com.langsmith.api.models.AnnotationQueueRunListParams
import com.langsmith.api.models.AnnotationQueueRunSchema
import com.langsmith.api.models.AnnotationQueueRunUpdateParams
import com.langsmith.api.models.AnnotationQueueRunUpdateResponse
import com.langsmith.api.models.RunSchemaWithAnnotationQueueInfo
import java.util.concurrent.CompletableFuture

interface RunServiceAsync { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    /** Add Runs To Annotation Queue */
    // templates/JavaSDK/services.ts:55:15
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun create(
        params: AnnotationQueueRunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<List<AnnotationQueueRunSchema>>

    /** Update Run In Annotation Queue */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun update(
        params: AnnotationQueueRunUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AnnotationQueueRunUpdateResponse>

    /** Get Runs From Annotation Queue */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun list(
        params: AnnotationQueueRunListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<List<RunSchemaWithAnnotationQueueInfo>>

    /** Delete Run From Annotation Queue */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun delete(
        params: AnnotationQueueRunDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AnnotationQueueRunDeleteResponse>
}
