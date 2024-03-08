// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.runs

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.RunShareDeleteParams
import com.langsmith.api.models.RunShareDeleteResponse
import com.langsmith.api.models.RunShareRetrieveParams
import com.langsmith.api.models.RunShareSchema
import com.langsmith.api.models.RunShareUpdateParams
import java.util.concurrent.CompletableFuture

interface ShareServiceAsync {

    /** Get the state of sharing of a run. */
    @JvmOverloads
    fun retrieve(
        params: RunShareRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RunShareSchema>

    /** Share a run. */
    @JvmOverloads
    fun update(
        params: RunShareUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RunShareSchema>

    /** Unshare a run. */
    @JvmOverloads
    fun delete(
        params: RunShareDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RunShareDeleteResponse>
}
