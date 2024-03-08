// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.datasets

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.DatasetOpenAIFtRetrieveParams
import com.langsmith.api.models.DatasetOpenAIFtRetrieveResponse
import java.util.concurrent.CompletableFuture

interface OpenAIFtServiceAsync { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    /** Download a dataset as OpenAI Jsonl format. */
    // templates/JavaSDK/services.ts:55:15
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun retrieve(
        params: DatasetOpenAIFtRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DatasetOpenAIFtRetrieveResponse>
}
