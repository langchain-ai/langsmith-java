// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.public_.examples

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.PublicExampleRunCreateParams
import com.langsmith.api.models.PublicExampleRunCreateResponse
import java.util.concurrent.CompletableFuture

interface RunServiceAsync { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    /**
     * // templates/JavaSDK/services.ts:55:15 Get examples with associated runs from sessions in a
     * dataset that has been shared.
     */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun create(
        params: PublicExampleRunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PublicExampleRunCreateResponse>
}
