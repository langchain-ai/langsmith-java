// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking.public_.datasets

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.FeedbackSchema
import com.langsmith.api.models.PublicDatasetFeedbackRetrieveParams

interface FeedbackService {

    /** Get feedback for runs in projects run over a dataset that has been shared. */
    @JvmOverloads
    fun retrieve(
        params: PublicDatasetFeedbackRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<FeedbackSchema>
}
