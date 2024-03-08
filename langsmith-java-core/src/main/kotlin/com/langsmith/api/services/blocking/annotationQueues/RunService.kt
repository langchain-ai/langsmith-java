// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking.annotationQueues

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.AnnotationQueueRunCreateParams
import com.langsmith.api.models.AnnotationQueueRunDeleteParams
import com.langsmith.api.models.AnnotationQueueRunDeleteResponse
import com.langsmith.api.models.AnnotationQueueRunListParams
import com.langsmith.api.models.AnnotationQueueRunSchema
import com.langsmith.api.models.AnnotationQueueRunUpdateParams
import com.langsmith.api.models.AnnotationQueueRunUpdateResponse
import com.langsmith.api.models.RunSchemaWithAnnotationQueueInfo

interface RunService {

    /** Add Runs To Annotation Queue */
    @JvmOverloads
    fun create(
        params: AnnotationQueueRunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<AnnotationQueueRunSchema>

    /** Update Run In Annotation Queue */
    @JvmOverloads
    fun update(
        params: AnnotationQueueRunUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AnnotationQueueRunUpdateResponse

    /** Get Runs From Annotation Queue */
    @JvmOverloads
    fun list(
        params: AnnotationQueueRunListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<RunSchemaWithAnnotationQueueInfo>

    /** Delete Run From Annotation Queue */
    @JvmOverloads
    fun delete(
        params: AnnotationQueueRunDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AnnotationQueueRunDeleteResponse
}
