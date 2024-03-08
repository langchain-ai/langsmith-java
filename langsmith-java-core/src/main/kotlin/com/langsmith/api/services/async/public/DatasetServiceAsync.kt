// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.public

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.DatasetPublicSchema
import com.langsmith.api.models.PublicDatasetListParams
import com.langsmith.api.services.async.public.datasets.FeedbackServiceAsync
import com.langsmith.api.services.async.public.datasets.RunServiceAsync
import com.langsmith.api.services.async.public.datasets.SessionServiceAsync
import java.util.concurrent.CompletableFuture

interface DatasetServiceAsync {

    fun sessions(): SessionServiceAsync

    fun runs(): RunServiceAsync

    fun feedback(): FeedbackServiceAsync

    /** Get dataset by ids or the shared dataset if not specifed. */
    @JvmOverloads
    fun list(
        params: PublicDatasetListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DatasetPublicSchema>
}
