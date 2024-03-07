// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.datasets

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.DatasetCsvRetrieveParams
import com.langsmith.api.models.DatasetCsvRetrieveResponse
import java.util.concurrent.CompletableFuture

interface CsvServiceAsync {

    /** Download a dataset as CSV format. */
    @JvmOverloads
    fun retrieve(
        params: DatasetCsvRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DatasetCsvRetrieveResponse>
}
