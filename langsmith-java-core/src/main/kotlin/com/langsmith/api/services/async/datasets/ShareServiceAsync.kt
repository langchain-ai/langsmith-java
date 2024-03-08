// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.datasets

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.DatasetShareRetrieveParams
import com.langsmith.api.models.DatasetShareSchema
import com.langsmith.api.models.DatasetShareUpdateParams
import java.util.concurrent.CompletableFuture

interface ShareServiceAsync {

    /** Get the state of sharing of a run. */
    @JvmOverloads
    fun retrieve(
        params: DatasetShareRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DatasetShareSchema>

    /** Share a dataset. */
    @JvmOverloads
    fun update(
        params: DatasetShareUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DatasetShareSchema>
}
