// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.public_

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.FeedbackSchema
import com.langsmith.api.models.PublicFeedbackListParams
import java.util.concurrent.CompletableFuture

interface FeedbackServiceAsync { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    /** Read Shared Feedbacks */
    // templates/JavaSDK/services.ts:55:15
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun list(
        params: PublicFeedbackListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<List<FeedbackSchema>>
}
