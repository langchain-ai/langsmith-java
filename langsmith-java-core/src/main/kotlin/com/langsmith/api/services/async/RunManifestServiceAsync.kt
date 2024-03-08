// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.RunManifestRetrieveParams
import com.langsmith.api.models.RunManifestSchema
import java.util.concurrent.CompletableFuture

interface RunManifestServiceAsync { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    /** Get a specific run manifest. */
    // templates/JavaSDK/services.ts:55:15
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun retrieve(
        params: RunManifestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RunManifestSchema>
}
