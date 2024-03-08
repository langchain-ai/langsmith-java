// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.public_

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.PublicRunRetrieveParams
import com.langsmith.api.models.RunPublicSchema
import com.langsmith.api.services.async.public_.runs.QueryServiceAsync
import java.util.concurrent.CompletableFuture

interface RunServiceAsync { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    fun query(): QueryServiceAsync // templates/JavaSDK/services.ts:55:15

    /** Get the shared run. */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun retrieve(
        params: PublicRunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RunPublicSchema>
}
