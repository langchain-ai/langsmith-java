// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.FeedbackConfigCreateParams
import com.langsmith.api.models.FeedbackConfigListParams
import com.langsmith.api.models.FeedbackConfigSchema
import java.util.concurrent.CompletableFuture

interface FeedbackConfigServiceAsync {

    /** Create Feedback Config Endpoint */
    @JvmOverloads
    fun create(
        params: FeedbackConfigCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<FeedbackConfigSchema>

    /** List Feedback Configs Endpoint */
    @JvmOverloads
    fun list(
        params: FeedbackConfigListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<List<FeedbackConfigSchema>>
}
