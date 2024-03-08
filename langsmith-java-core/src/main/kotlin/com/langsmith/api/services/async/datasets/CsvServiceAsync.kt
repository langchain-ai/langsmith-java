// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.datasets

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.DatasetCsvRetrieveParams
import com.langsmith.api.models.DatasetCsvRetrieveResponse
import java.util.concurrent.CompletableFuture

interface CsvServiceAsync { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    /** Download a dataset as CSV format. */
    // templates/JavaSDK/services.ts:55:15
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun retrieve(
        params: DatasetCsvRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DatasetCsvRetrieveResponse>
}
