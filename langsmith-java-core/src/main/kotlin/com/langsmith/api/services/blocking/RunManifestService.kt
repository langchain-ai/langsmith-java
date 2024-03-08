// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.RunManifestRetrieveParams
import com.langsmith.api.models.RunManifestSchema

interface RunManifestService {

    /** Get a specific run manifest. */
    @JvmOverloads
    fun retrieve(
        params: RunManifestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RunManifestSchema
}
