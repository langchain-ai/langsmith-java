// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.runs

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.ListRunsResponse
import com.langsmith.api.models.RunQueryCreateParams
import java.util.concurrent.CompletableFuture

interface QueryServiceAsync { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    /** Get all runs by query in body payload. */
    // templates/JavaSDK/services.ts:55:15
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun create(
        params: RunQueryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ListRunsResponse>
}
