// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.public_

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.PublicLatestRunRetrieveParams
import com.langsmith.api.models.RunPublicSchema
import java.util.concurrent.CompletableFuture

interface LatestRunServiceAsync {

    /** Get the shared run. */
    @JvmOverloads
    fun retrieve(
        params: PublicLatestRunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RunPublicSchema>
}
