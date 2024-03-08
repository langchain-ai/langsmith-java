// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking.sessions

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.SessionMetadataRetrieveParams
import com.langsmith.api.models.TracerSessionMetadataResponse

interface MetadataService { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    /**
     * // templates/JavaSDK/services.ts:55:15 Given a session, a number K, and (optionally) a list
     * of metadata keys, return the top K values for each key.
     */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun retrieve(
        params: SessionMetadataRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TracerSessionMetadataResponse
}
