// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.FeedbackConfigCreateParams
import com.langsmith.api.models.FeedbackConfigListParams
import com.langsmith.api.models.FeedbackConfigSchema
import java.util.concurrent.CompletableFuture

interface FeedbackConfigServiceAsync { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    /** Create Feedback Config Endpoint */
    // templates/JavaSDK/services.ts:55:15
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun create(
        params: FeedbackConfigCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<FeedbackConfigSchema>

    /** List Feedback Configs Endpoint */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun list(
        params: FeedbackConfigListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<List<FeedbackConfigSchema>>
}
