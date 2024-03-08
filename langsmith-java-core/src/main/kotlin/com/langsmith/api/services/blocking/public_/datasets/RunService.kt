// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking.public_.datasets

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.PublicDatasetRunRetrieveParams
import com.langsmith.api.models.RunPublicDatasetSchema
import com.langsmith.api.services.blocking.public_.datasets.runs.QueryService
import com.langsmith.api.services.blocking.public_.datasets.runs.StatService

interface RunService { // templates/JavaSDK/services.ts:55:15 // templates/JavaSDK/services.ts:55:15
    // // templates/JavaSDK/services.ts:55:15

    fun query(): QueryService // templates/JavaSDK/services.ts:55:15

    fun stats(): StatService

    /** Get runs in projects run over a dataset that has been shared. */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun retrieve(
        params: PublicDatasetRunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RunPublicDatasetSchema
}
