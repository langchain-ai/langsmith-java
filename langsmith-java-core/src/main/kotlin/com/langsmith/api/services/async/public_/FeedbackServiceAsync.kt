// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.public_

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.FeedbackSchema
import com.langsmith.api.models.PublicFeedbackListParams
import java.util.concurrent.CompletableFuture

interface FeedbackServiceAsync {

    /** Read Shared Feedbacks */
    @JvmOverloads
    fun list(
        params: PublicFeedbackListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<List<FeedbackSchema>>
}
