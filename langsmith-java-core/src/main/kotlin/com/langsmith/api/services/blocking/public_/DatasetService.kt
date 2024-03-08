// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking.public_

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.DatasetPublicSchema
import com.langsmith.api.models.PublicDatasetListParams
import com.langsmith.api.services.blocking.public_.datasets.FeedbackService
import com.langsmith.api.services.blocking.public_.datasets.RunService
import com.langsmith.api.services.blocking.public_.datasets.SessionService

interface DatasetService { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    fun sessions(): SessionService // templates/JavaSDK/services.ts:55:15

    fun runs(): RunService

    fun feedback(): FeedbackService

    /** Get dataset by ids or the shared dataset if not specifed. */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun list(
        params: PublicDatasetListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DatasetPublicSchema
}
