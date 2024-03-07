// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking.annotationQueues

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.AnnotationQueueQueueListParams
import com.langsmith.api.models.AnnotationQueueSchema

interface QueueService {

    /** Get Annotation Queues For Run */
    @JvmOverloads
    fun list(
        params: AnnotationQueueQueueListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<AnnotationQueueSchema>
}
