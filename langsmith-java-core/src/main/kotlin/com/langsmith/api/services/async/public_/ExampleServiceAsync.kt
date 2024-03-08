// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.public_

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.Example
import com.langsmith.api.models.PublicExampleListParams
import com.langsmith.api.services.async.public_.examples.RunServiceAsync
import java.util.concurrent.CompletableFuture

interface ExampleServiceAsync { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    fun runs(): RunServiceAsync // templates/JavaSDK/services.ts:55:15

    /** Get example by ids or the shared example if not specifed. */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun list(
        params: PublicExampleListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<List<Example>>
}
