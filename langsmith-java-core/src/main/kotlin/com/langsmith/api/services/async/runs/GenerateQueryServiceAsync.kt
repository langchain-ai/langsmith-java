// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.runs

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.ResponseBodyForRunsGenerateQuery
import com.langsmith.api.models.RunGenerateQueryCreateParams
import java.util.concurrent.CompletableFuture

interface GenerateQueryServiceAsync { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    /** Get runs filter expression query for a given natural language query. */
    // templates/JavaSDK/services.ts:55:15
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun create(
        params: RunGenerateQueryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ResponseBodyForRunsGenerateQuery>
}
