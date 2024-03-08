// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.examples

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.Example
import com.langsmith.api.models.ExampleUploadCreateParams
import java.util.concurrent.CompletableFuture

interface UploadServiceAsync { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    /** Create a new example. */
    // templates/JavaSDK/services.ts:55:15
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun create(
        params: ExampleUploadCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<List<Example>>
}
