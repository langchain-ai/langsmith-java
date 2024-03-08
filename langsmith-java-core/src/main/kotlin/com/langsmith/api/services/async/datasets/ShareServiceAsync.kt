// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.datasets

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.DatasetShareRetrieveParams
import com.langsmith.api.models.DatasetShareSchema
import com.langsmith.api.models.DatasetShareUpdateParams
import java.util.concurrent.CompletableFuture

interface ShareServiceAsync { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    /** Get the state of sharing of a run. */
    // templates/JavaSDK/services.ts:55:15
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun retrieve(
        params: DatasetShareRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DatasetShareSchema>

    /** Share a dataset. */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun update(
        params: DatasetShareUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DatasetShareSchema>
}
