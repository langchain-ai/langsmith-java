// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking.sessions

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.SessionMetadataRetrieveParams
import com.langsmith.api.models.TracerSessionMetadataResponse

interface MetadataService {

    /**
     * Given a session, a number K, and (optionally) a list of metadata keys, return the top K
     * values for each key.
     */
    @JvmOverloads
    fun retrieve(
        params: SessionMetadataRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TracerSessionMetadataResponse
}
