// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.public_

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.DatasetPublicSchema
import com.langsmith.api.models.PublicDatasetListParams
import com.langsmith.api.services.async.public_.datasets.FeedbackServiceAsync
import com.langsmith.api.services.async.public_.datasets.RunServiceAsync
import com.langsmith.api.services.async.public_.datasets.SessionServiceAsync
import java.util.concurrent.CompletableFuture

interface DatasetServiceAsync { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    fun sessions(): SessionServiceAsync // templates/JavaSDK/services.ts:55:15

    fun runs(): RunServiceAsync

    fun feedback(): FeedbackServiceAsync

    /** Get dataset by ids or the shared dataset if not specifed. */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun list(
        params: PublicDatasetListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DatasetPublicSchema>
}
