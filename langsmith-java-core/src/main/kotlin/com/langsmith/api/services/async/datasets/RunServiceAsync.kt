// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.datasets

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.DatasetRunCreateParams
import com.langsmith.api.models.DatasetRunCreateResponse
import java.util.concurrent.CompletableFuture

interface RunServiceAsync { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    /**
     * // templates/JavaSDK/services.ts:55:15 Fetch examples for a dataset, and fetch the runs for
     * each example if they are associated with the given session_ids.
     */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun create(
        params: DatasetRunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DatasetRunCreateResponse>
}
