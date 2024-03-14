// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.public_

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.PublicRunRetrieveParams
import com.langsmith.api.models.RunPublicSchema
import com.langsmith.api.services.async.public_.runs.QueryServiceAsync
import java.util.concurrent.CompletableFuture

interface RunServiceAsync {

    fun query(): QueryServiceAsync

    /** Get the shared run. */
    @JvmOverloads
    fun retrieve(
        params: PublicRunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RunPublicSchema>
}
